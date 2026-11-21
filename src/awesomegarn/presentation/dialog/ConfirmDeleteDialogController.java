package awesomegarn.presentation.dialog;

import awesomegarn.domain.Yarn;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/** Controller til ConfirmDeleteDialog.fxml: "Bekræft sletning" (FK-08). */
public class ConfirmDeleteDialogController {

    @FXML private ImageView yarnIcon;
    @FXML private Label colorLabel;
    @FXML private Label materialLabel;
    @FXML private Label weightLabel;
    @FXML private Label skeinsLabel;
    @FXML private Button cancelButton;
    @FXML private Button deleteButton;

    // TODO: private Runnable onConfirm; private Runnable onCancel;

    /** Udfylder garnets oplysninger (farve, materiale, vægt, antal nøgler) og vælger ikon ud fra farven. */
    public void setup(Yarn yarn, Runnable onConfirm, Runnable onCancel) {
        // TODO
    }

    @FXML
    private void onConfirm() {
        // TODO: onConfirm.run()
    }

    @FXML
    private void onCancel() {
        // TODO: onCancel.run()
    }
}
