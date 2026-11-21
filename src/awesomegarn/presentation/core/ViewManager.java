package awesomegarn.presentation.core;

import awesomegarn.domain.Yarn;
import awesomegarn.persistence.DataManager;
import awesomegarn.persistence.DataStorageException;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.util.List;

/**
 * Styrer navigation og dialoger. Programmet har ét Stage og én Scene; Main.fxml er rod og fast ramme,
 * og ViewManager skifter indholdet i rammen (MainController.setContent) mellem oversigt, tilføj,
 * rediger og statistik. Dialoger vises som overlay i samme vindue (MainController.showOverlay).
 *
 * Tips:
 *  - Indlæs FXML med FXMLLoader og getClass().getResource(viewType.getFxmlPath()).
 *  - Sæt loader.setControllerFactory(controllerFactory), så controllerne får deres afhængigheder
 *    (ViewManager og DataManager) som konstruktørparametre. Der er ingen init-metode.
 *  - Overblikket (YarnOverview) bør indlæses én gang og genbruges, så filtre og søgning huskes,
 *    når man kommer tilbage fra Tilføj/Rediger.
 */
public class ViewManager {

    // TODO: private Stage stage;
    // TODO: private DataManager dataManager;
    // TODO: private ControllerFactory controllerFactory;  (new ControllerFactory(this, dataManager))
    // TODO: private MainController mainController;
    // TODO: cache til overblikket (Parent + controller)

    public ViewManager(Stage stage, DataManager dataManager) {
        // TODO: gem parametrene og opret controllerFactory (new ControllerFactory(this, dataManager))
    }

    /** Indlæser Main.fxml, opretter Scene, sætter titel/ikon/min-størrelse, viser oversigten og kalder stage.show(). */
    public void start() {
        // TODO
    }

    public void showOverview() {
        // TODO: luk evt. overlay, kald overviewController.refresh(), sæt som indhold (fane: oversigt)
    }

    public void showAddYarn() {
        // TODO: indlæs AddYarn.fxml som indhold (ingen fane aktiv)
    }

    /** Rediger vises som en side i samme vindue (ikke et nyt Stage). */
    public void showEditYarn(Yarn yarn) {
        // TODO: indlæs EditYarn.fxml, kald editController.setYarn(yarn) (efter load), sæt som indhold (ingen fane aktiv)
    }

    public void showStatistics() {
        // TODO: indlæs Statistics.fxml, kald refresh(), sæt som indhold (fane: statistik)
    }

    /** Viser "Bekræft sletning" som overlay. onConfirm køres kun, hvis brugeren bekræfter. */
    public void showConfirmDelete(Yarn yarn, Runnable onConfirm) {
        // TODO
    }

    /** Viser fejldialogen som overlay (fx "Fejl ved registrering" med en punktliste). */
    public void showError(String title, String intro, List<String> messages, String buttonText) {
        // TODO
    }

    public void showStorageError(DataStorageException e) {
        // TODO: showError("Fejl ved lagring", e.getMessage(), List.of(), "OK")
    }

    public void closeOverlay() {
        // TODO
    }

    /** Hjælpeklasse: en indlæst FXML-fil (rod-node + controller). */
    private static class LoadedView<C> {
        Parent root;
        C controller;
    }

    private <C> LoadedView<C> load(ViewType type) {
        // TODO: FXMLLoader med location, setControllerFactory(controllerFactory), load(), hent loader.getController()
        throw new UnsupportedOperationException("TODO");
    }
}
