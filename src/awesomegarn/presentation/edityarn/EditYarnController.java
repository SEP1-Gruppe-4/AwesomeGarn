package awesomegarn.presentation.edityarn;

import awesomegarn.domain.Yarn;
import awesomegarn.persistence.DataManager;
import awesomegarn.presentation.core.ValidationResult;
import awesomegarn.presentation.core.YarnData;
import awesomegarn.presentation.yarnform.YarnFormController;
import javafx.fxml.FXML;

/**
 * Controller til EditYarn.fxml ("Rediger garn"). Vises som en side i samme vindue (FK-07, US-04).
 * Samme valideringsregler som ved registrering. Ingen bekræftelsesdialog ved gem (mockuppen har ingen).
 */
public class EditYarnController {

    @FXML private YarnFormController formController;

    // TODO: private DataManager dataManager; private Yarn original;

    /** Oprettes af ControllerFactory. */
    public EditYarnController(DataManager dataManager) {
        // TODO: gem dataManager
    }

    /**
     * Kaldes af ViewManager lige efter indlæsning, med det garn der skal redigeres (det kendes først nu,
     * så det kan ikke gives i konstruktøren). Gemmer original og kalder formController.setup(...) med yarn som initial.
     */
    public void setYarn(Yarn yarn) {
        // TODO
    }

    /**
     * Validerer. Er input gyldigt: opret nyt Yarn og kald dataManager.updateYarn(original, nyt) (bevarer positionen).
     * DataStorageException kastes videre (formularen viser den). Ugyldigt input ændrer ingenting.
     */
    private ValidationResult updateYarn(YarnData data) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
