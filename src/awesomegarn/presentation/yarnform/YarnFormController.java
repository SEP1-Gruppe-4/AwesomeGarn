package awesomegarn.presentation.yarnform;

import awesomegarn.domain.Material;
import awesomegarn.domain.WashingInstruction;
import awesomegarn.domain.Yarn;
import awesomegarn.domain.YarnColor;
import awesomegarn.presentation.core.ValidationResult;
import awesomegarn.presentation.core.ViewManager;
import awesomegarn.presentation.core.YarnData;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Function;

/**
 * Controller til YarnForm.fxml: den fælles formular, som både Tilføj og Rediger bruger (FK-01, FK-02, FK-03, FK-07).
 * Formularen kender ikke forskel på tilføj/rediger: den samler et YarnData og sender det til submitAction.
 */
public class YarnFormController implements Initializable {

    // ----- overskrift og knapper -----
    @FXML private Button backButton;
    @FXML private Label titleLabel;
    @FXML private Label subtitleLabel;
    @FXML private Label noteLabel;
    @FXML private Button cancelButton;
    @FXML private Button submitButton;

    // ----- obligatoriske felter -----
    @FXML private ComboBox<YarnColor> colorBox;
    @FXML private ComboBox<Material> materialBox;
    @FXML private TextField weightField;
    @FXML private Spinner<Integer> skeinsSpinner;

    // ----- valgfrie felter -----
    @FXML private TextField fiberField;
    @FXML private TextField manufacturerField;
    @FXML private TextField dyeLotField;
    @FXML private TextField needleField;
    @FXML private ComboBox<WashingInstruction> washingBox;

    // ----- fejltekster under felterne (skjult som standard) -----
    @FXML private Label colorError;
    @FXML private Label materialError;
    @FXML private Label weightError;
    @FXML private Label skeinsError;
    @FXML private Label needleError;

    // TODO: private ViewManager viewManager; private Function<YarnData, ValidationResult> submitAction;
    // TODO: private String errorTitle, errorIntro;

    /** Oprettes af ControllerFactory (også når formularen inkluderes i Add/Edit). */
    public YarnFormController(ViewManager viewManager) {
        // TODO: gem viewManager
    }

    /** Kaldes af FXMLLoader, når @FXML-felterne er sat. Engangsopsætning, der er ens for Tilføj og Rediger. */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO: fyld dropdowns (med ikoner via cell factories),
        //       sæt skeinsSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 9999, 1))
    }

    /** Kaldes af Add/Edit-controlleren. initial er null ved "Tilføj". */
    public void setup(String title, String subtitle, String submitText, String note,
                      String errorTitle, String errorIntro, Yarn initial,
                      Function<YarnData, ValidationResult> submitAction) {
        // TODO: gem parametrene, sæt tekster, forudfyld felter hvis initial != null
    }

    @FXML
    private void onBack() {
        // TODO: viewManager.showOverview()
    }

    @FXML
    private void onCancel() {
        // TODO: viewManager.showOverview()
    }

    /**
     * Rydder gamle fejl, samler YarnData (skeins læses fra spinnerens editor-tekst, så "abc" kan fanges)
     * og kalder submitAction. Gyldigt: gå til oversigten. Ugyldigt: showErrors(...).
     * DataStorageException: viewManager.showStorageError(e).
     */
    @FXML
    private void onSubmit() {
        // TODO
    }

    // ---------- hjælpemetoder (forslag) ----------

    private YarnData collect() { throw new UnsupportedOperationException("TODO"); }

    /** Viser fejlteksterne under felterne, markerer felterne (CSS-klassen field-error) og åbner fejldialogen. */
    private void showErrors(ValidationResult result) {
        // TODO
    }

    private void clearErrors() {
        // TODO
    }

    private void fill(Yarn yarn) {
        // TODO: tal vises med NumberText.plain
    }
}
