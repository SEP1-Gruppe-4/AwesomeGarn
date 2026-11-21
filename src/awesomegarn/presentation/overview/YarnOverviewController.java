package awesomegarn.presentation.overview;

import awesomegarn.domain.Yarn;
import awesomegarn.persistence.DataManager;
import awesomegarn.presentation.core.ViewManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller til YarnOverview.fxml: filtre, søgning, sortering, tabel, SUM og tom-tilstande
 * (FK-04, FK-05, FK-06, FK-09, FK-10, FK-11).
 * Forretningslogikken (filtrering, sortering, summer) ligger her i presentation-laget og bruger
 * YarnFilter og SortOption på listen fra DataManager.
 */
public class YarnOverviewController implements Initializable {

    // ----- filtre og søgning -----
    @FXML private ComboBox<String> colorFilter;
    @FXML private ComboBox<String> materialFilter;
    @FXML private ComboBox<String> manufacturerFilter;
    @FXML private ComboBox<String> needleFilter;
    @FXML private Button resetFiltersButton;
    @FXML private Button addYarnButton;
    @FXML private TextField searchField;

    // ----- tabel -----
    @FXML private TableView<Yarn> yarnTable;
    @FXML private TableColumn<Yarn, Yarn> colorColumn;
    @FXML private TableColumn<Yarn, Yarn> weightColumn;
    @FXML private TableColumn<Yarn, Yarn> skeinsColumn;
    @FXML private TableColumn<Yarn, Yarn> materialColumn;
    @FXML private TableColumn<Yarn, Yarn> manufacturerColumn;
    @FXML private TableColumn<Yarn, Yarn> needleColumn;
    @FXML private TableColumn<Yarn, Yarn> washingColumn;
    @FXML private TableColumn<Yarn, Yarn> dyeLotColumn;
    @FXML private TableColumn<Yarn, Yarn> fiberColumn;
    @FXML private TableColumn<Yarn, Yarn> actionsColumn;

    // ----- tom-tilstande og bundlinje -----
    @FXML private VBox noYarnState;
    @FXML private VBox noMatchState;
    @FXML private Label weightSummaryLabel;
    @FXML private Label skeinsSummaryLabel;
    @FXML private Label shownCountLabel;

    // TODO: private ViewManager viewManager; private DataManager dataManager;
    // TODO: private YarnFilter filter; private SortOption sort;  (huskes, mens man er på andre sider)

    /** Oprettes af ControllerFactory. */
    public YarnOverviewController(ViewManager viewManager, DataManager dataManager) {
        // TODO: gem referencer, opret filter og sort
    }

    /** Kaldes af FXMLLoader, når @FXML-felterne er sat. */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO: kald setupColumns(), og tilføj lyttere på filtre og søgefelt
    }

    /** Kaldes, når oversigten vises, og når beholdningen er ændret. */
    public void refresh() {
        // TODO: refreshFilterOptions() + refreshTable()
    }

    // ---------- handlere fra FXML ----------

    @FXML
    private void onAddYarn() {
        // TODO: viewManager.showAddYarn()
    }

    /** "Nulstil filtre": rydder de fire filtre, men IKKE søgefeltet. */
    @FXML
    private void onResetFilters() {
        // TODO
    }

    /** Klik på en kolonneoverskrift. Labelens id er navnet på SortOption.SortField (fx "COLOR"). */
    @FXML
    private void onSortHeaderClicked(MouseEvent event) {
        // TODO: find felt via ((Node) event.getSource()).getId(), skift mellem stigende/faldende, refreshTable()
    }

    // ---------- hjælpemetoder (forslag) ----------

    /** Cell value factories og cell factories: farveikon + tekst, vaskeikon, rediger- og slet-knapper. */
    private void setupColumns() {
        // TODO
    }

    /** Fylder filter-dropdowns: farve og materiale fra enums, producent og pind fra beholdningen (+ "Alle"). */
    private void refreshFilterOptions() {
        // TODO
    }

    /** Henter synlige garn (filter + sortering), skifter mellem tabel/tom-tilstande og opdaterer SUM og "Viser X af Y". */
    private void refreshTable() {
        // TODO
    }

    private void editYarn(Yarn yarn) {
        // TODO: viewManager.showEditYarn(yarn)
    }

    /** Åbner bekræftelsesdialogen. Ved bekræftelse: dataManager.deleteYarn(yarn), refresh(). Ved DataStorageException: viewManager.showStorageError(e). */
    private void deleteYarn(Yarn yarn) {
        // TODO: viewManager.showConfirmDelete(yarn, () -> { ... })
    }
}
