package awesomegarn.presentation.dialog;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.util.List;

/** Controller til ErrorDialog.fxml: generisk fejldialog (registreringsfejl, lagringsfejl, indlæsningsfejl). */
public class ErrorDialogController {

    @FXML private Label titleLabel;
    @FXML private Label introLabel;
    @FXML private VBox messagesBox;
    @FXML private Button okButton;

    // TODO: private Runnable onClose;

    /** Sætter teksterne og fylder messagesBox med én Label pr. besked (CSS-klasse error-text). Ingen beskeder: skjul messagesBox. */
    public void setup(String title, String intro, List<String> messages, String buttonText, Runnable onClose) {
        // TODO
    }

    @FXML
    private void onClose() {
        // TODO: onClose.run()
    }
}
