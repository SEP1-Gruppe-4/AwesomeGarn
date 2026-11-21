package awesomegarn.presentation.addyarn;

import awesomegarn.persistence.DataManager;
import awesomegarn.presentation.core.ValidationResult;
import awesomegarn.presentation.core.YarnData;
import awesomegarn.presentation.yarnform.YarnFormController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller til AddYarn.fxml ("Tilføj garn"). Logikken for registrering ligger her (FK-01 til FK-04).
 */
public class AddYarnController implements Initializable {

    /** Formularens controller. Injiceres automatisk: fx:id="form" i FXML + "Controller". */
    @FXML private YarnFormController formController;

    // TODO: private DataManager dataManager;

    /** Oprettes af ControllerFactory. */
    public AddYarnController(DataManager dataManager) {
        // TODO: gem dataManager
    }

    /** Kaldes af FXMLLoader. Her er formController allerede injiceret. */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // TODO: formController.setup(...) med tekster til "Tilføj garn", initial = null og this::registerYarn
    }

    /**
     * Validerer med YarnValidator. Er input gyldigt: opret Yarn og kald dataManager.addYarn(yarn).
     * DataStorageException kastes videre (formularen viser den). Ugyldigt input ændrer ingenting.
     */
    private ValidationResult registerYarn(YarnData data) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
