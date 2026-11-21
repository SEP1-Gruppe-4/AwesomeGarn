package awesomegarn.presentation.statistics;

import awesomegarn.persistence.DataManager;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 * Controller til Statistics.fxml (FK-12, US-09): samlet antal nøgler, samlet vægt og garntyper pr. primær fiber.
 * Der er to kort ("Antal nøgler brugt" er udeladt).
 */
public class StatisticsController {

    @FXML private Label totalSkeinsLabel;
    @FXML private Label totalWeightLabel;
    @FXML private VBox fiberPanel;
    @FXML private PieChart fiberChart;
    @FXML private Label donutCountLabel;
    @FXML private Label primaryFiberLabel;
    @FXML private GridPane materialGrid;
    @FXML private VBox emptyState;

    // TODO: private DataManager dataManager;

    /** Oprettes af ControllerFactory. */
    public StatisticsController(DataManager dataManager) {
        // TODO: gem dataManager
    }

    /**
     * Henter dataManager.getAllYarns(), beregner statistikken (StatisticsCalculator) og opdaterer visningen:
     * tallene i kortene, cirkeldiagrammet (farve pr. materiale: Material.getChartColor()), "Primær fiber: X (n%)"
     * og én række pr. materiale i materialGrid. Tom beholdning: skjul fiberPanel og vis emptyState.
     */
    public void refresh() {
        // TODO
    }
}
