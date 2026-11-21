# Awesome Garn – skelet

Skelet til gruppeprojektet (JavaFX + FXML, ingen Maven/Gradle, ingen `module-info.java`).
Alle klasser, interfaces og exceptions er oprettet, men **metoderne er ikke implementeret**: de er tomme med
`// TODO`, eller kaster `UnsupportedOperationException("TODO")`, hvis de skal returnere noget.
Alt i `resources` (FXML, CSS, billeder) er færdigt.

## Opsætning i IntelliJ
1. Åbn mappen som projekt (JDK 17 eller nyere. `YarnData` er et `record`, så JDK 16+ kræves).
2. Højreklik `src` → *Mark Directory as* → **Sources Root**. Højreklik `resources` → **Resources Root**.
3. Tilføj JavaFX SDK som bibliotek (*Project Structure → Libraries*).
4. Run configuration for `awesomegarn.Main`, VM options (ret stien):
   `--module-path /sti/til/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml`
5. Arbejdsmappen skal være projektmappen, så `data/yarn.bin` oprettes dér.

## Mappestruktur
```
src/awesomegarn/
├─ Main.java
├─ domain/                      Rene data: Yarn, YarnColor, Material, WashingInstruction, Statistics
├─ persistence/                 DataManager (interface, CRUD), FileDataManager (.bin), DataContainer, DataStorageException
└─ presentation/
   ├─ core/                     ViewManager, ViewType, ControllerFactory
   │                            + forretningslogik: YarnData, YarnValidator, ValidationResult,
   │                              YarnFilter, SortOption, StatisticsCalculator, NumberText
   ├─ main/                     MainController          (Main.fxml: ramme, faner, overlay-lag)
   ├─ overview/                 YarnOverviewController  (YarnOverview.fxml)
   ├─ addyarn/                  AddYarnController       (AddYarn.fxml)
   ├─ edityarn/                 EditYarnController      (EditYarn.fxml)
   ├─ yarnform/                 YarnFormController      (YarnForm.fxml: fælles formular, inkluderet i Add og Edit)
   ├─ statistics/               StatisticsController    (Statistics.fxml)
   └─ dialog/                   ErrorDialogController, ConfirmDeleteDialogController
resources/
├─ fxml/                        Main, YarnOverview, AddYarn, EditYarn, YarnForm, Statistics, ErrorDialog, ConfirmDeleteDialog
├─ css/style.css                Farverne fra mockup-PDF'en
└─ images/                      Logo og ikoner fra mockup-PDF'en
```
Lag: `presentation → domain` og `presentation → persistence`, og `persistence → domain`. `domain` kender hverken JavaFX eller persistence.
Forretningslogikken ligger i presentation-laget (som i kurset): controllerne og hjælpeklasserne i `core`.

## Sådan hænger det sammen
- Ét `Stage` og én `Scene`. `Main.fxml` er den faste ramme. `ViewManager` skifter indholdet i `contentHolder`
  (oversigt, tilføj, rediger, statistik). Dialoger vises som overlay i `overlayLayer`.
- FXML-filerne ligger i `resources/fxml`, og stierne står i `ViewType`. Indlæs med `getClass().getResource(viewType.getFxmlPath())`.
- **ControllerFactory (som i kurset):** `ViewManager` sætter `loader.setControllerFactory(controllerFactory)`. Factory'en
  (`Callback<Class<?>, Object>`, en kæde af if-sætninger) opretter controllerne og giver dem afhængighederne som
  konstruktørparametre. Der er ingen `init(...)`-metode. Kommer der en ny controller til, skal der tilføjes en if-sætning.
  Factory'en får `ViewManager` og `DataManager` udefra og giver de samme objekter videre, så alle deler én beholdning.

  | Controller | Konstruktørparametre |
  |---|---|
  | `MainController` | `ViewManager` |
  | `YarnOverviewController` | `ViewManager`, `DataManager` |
  | `AddYarnController`, `EditYarnController`, `StatisticsController` | `DataManager` |
  | `YarnFormController` | `ViewManager` |
  | `ErrorDialogController`, `ConfirmDeleteDialogController` | ingen (får data via `setup(...)`) |

  `fx:include` bruger samme factory, så `YarnFormController` oprettes også dér. Engangsopsætning, der kræver `@FXML`-felter,
  ligger i `initialize(URL, ResourceBundle)`. Data, der først kendes ved visning (fx garnet i `EditYarnController.setYarn(...)`),
  gives via metoder efter indlæsning.
- Hver FXML-controller har `@FXML`-felter med samme navn som `fx:id` i FXML, og handlere som `onSubmit` svarer til `onAction="#onSubmit"`.
  Ændrer I et navn det ene sted, skal det ændres det andet sted (ellers får I en `LoadException` eller et `null`-felt).
- `AddYarn.fxml` og `EditYarn.fxml` inkluderer `YarnForm.fxml` med `fx:id="form"`. Derfor har deres controllere feltet `formController`.
- Tabellens kolonneoverskrifter er `Label`s, hvor `id` er navnet på `SortOption.SortField`.
  Cell factories (farveikon, vaskeikon, rediger/slet-knapper) laves i `YarnOverviewController.setupColumns()`.
- `Spinner`ens værdiområde (1–9999) sættes i `YarnFormController.setup(...)`.

## Beslutninger, som skelettet bygger på
- "Vægt" er **samlet vægt** for posten (ikke pr. nøgle). "Længde" og "Antal nøgler brugt" er udeladt.
- Al adgang til data går gennem `DataManager` (create/read/update/delete). `FileDataManager` gemmer i en .bin-fil med
  Java-serialisering (`DataContainer` og `Yarn` er `Serializable`) og gemmer straks efter hver ændring.
- Fejl ved læsning/skrivning kastes som `DataStorageException` (unchecked). Controllerne fanger den og viser den via `ViewManager.showStorageError(...)`.
- Rediger er en side i samme vindue. Der er ingen bekræftelsesdialog ved gem (mockuppen har ingen).
- Kun filtrene Farve, Materiale, Producent og Pind (mm). "Nulstil filtre" rydder ikke søgefeltet.
- Søgning er ikke case-sensitiv, delstreng i alle felter. Filtre og søgning kombineres med AND.
- Tabellen har kolonnerne Nøgler og Fiber (i stedet for Længde). Lot og Farvekode er samlet til "Indfarvning".
- Tomme valgfrie felter gemmes som `null` og vises som "–". Enums (`YarnColor`, `Material`, `WashingInstruction`) er færdige.

## Forslag til rækkefølge
1. `domain` + `DataManager`/`FileDataManager`/`DataContainer` (ingen JavaFX).
2. `YarnValidator`, `YarnFilter`, `SortOption`, `StatisticsCalculator`, `NumberText` (rene klasser, nemme at teste).
3. `ViewManager`, `MainController`, `Main` + oversigt med tom-tilstand.
4. Tilføj → Rediger → Slet.
5. Filter, søgning, sortering og SUM.
6. Statistik.
