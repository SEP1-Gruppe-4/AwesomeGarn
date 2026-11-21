package awesomegarn.presentation.core;

/** Alle FXML-filer i resources/fxml. ViewManager bruger stien til at indlæse dem. */
public enum ViewType {
    MAIN("/fxml/Main.fxml"),
    OVERVIEW("/fxml/YarnOverview.fxml"),
    ADD_YARN("/fxml/AddYarn.fxml"),
    EDIT_YARN("/fxml/EditYarn.fxml"),
    STATISTICS("/fxml/Statistics.fxml"),
    ERROR_DIALOG("/fxml/ErrorDialog.fxml"),
    CONFIRM_DELETE_DIALOG("/fxml/ConfirmDeleteDialog.fxml");

    private final String fxmlPath;

    ViewType(String fxmlPath) {
        this.fxmlPath = fxmlPath;
    }

    public String getFxmlPath() { return fxmlPath; }
}
