package awesomegarn.presentation.main;

import awesomegarn.presentation.core.ViewManager;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 * Controller til Main.fxml: den faste ramme (logo, faneknapper, indholdsområde, overlay-lag).
 * Indeholder kun ramme-logik. Hvad der vises, bestemmer ViewManager.
 */
public class MainController {

    /** Hvilken faneknap der er aktiv. NONE bruges på Tilføj/Rediger. */
    public enum Tab { OVERVIEW, STATISTICS, NONE }

    @FXML private StackPane contentHolder;
    @FXML private StackPane overlayLayer;
    @FXML private Button overviewTab;
    @FXML private Button statisticsTab;

    // TODO: private ViewManager viewManager;

    /** Oprettes af ControllerFactory. */
    public MainController(ViewManager viewManager) {
        // TODO: gem viewManager
    }

    /** Sætter indholdet i midten og markerer den aktive fane (CSS-klasserne nav-button / nav-button-active). */
    public void setContent(Node content, Tab activeTab) {
        // TODO
    }

    /** Viser en dialog oven på siden (gør overlayLayer synlig og managed). */
    public void showOverlay(Node dialog) {
        // TODO
    }

    public void closeOverlay() {
        // TODO: ryd og skjul overlayLayer (visible = false, managed = false)
    }

    @FXML
    private void onOverviewTab() {
        // TODO: viewManager.showOverview()
    }

    @FXML
    private void onStatisticsTab() {
        // TODO: viewManager.showStatistics()
    }
}
