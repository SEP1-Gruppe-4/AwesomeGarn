package awesomegarn.presentation.core;

import awesomegarn.persistence.DataManager;
import awesomegarn.presentation.addyarn.AddYarnController;
import awesomegarn.presentation.dialog.ConfirmDeleteDialogController;
import awesomegarn.presentation.dialog.ErrorDialogController;
import awesomegarn.presentation.edityarn.EditYarnController;
import awesomegarn.presentation.main.MainController;
import awesomegarn.presentation.overview.YarnOverviewController;
import awesomegarn.presentation.statistics.StatisticsController;
import awesomegarn.presentation.yarnform.YarnFormController;
import javafx.util.Callback;

/**
 * Opretter FXML-controllerne og giver dem deres afhængigheder som konstruktørparametre (dependency injection).
 * FXMLLoader kalder call(...) med controller-klassen fra fx:controller, og vi returnerer et nyt objekt.
 * Loaderen bruger samme factory til FXML-filer, der inkluderes med fx:include (fx. YarnForm.fxml).
 *
 * Bemærk: I kursets eksempel opretter factory'en en ny DataManager pr. controller. Her skal alle controllere
 * dele ÉN beholdning, så factory'en får ViewManager og DataManager udefra og giver de samme objekter videre.
 * Kommer der en ny controller til, skal der tilføjes en if-sætning her.
 */
public class ControllerFactory implements Callback<Class<?>, Object> {

    // TODO: private ViewManager viewManager;
    // TODO: private DataManager dataManager;

    public ControllerFactory(ViewManager viewManager, DataManager dataManager) {
        // TODO: gem parametrene
    }

    @Override
    public Object call(Class<?> controllerType) {
        // TODO: én if-sætning pr. controller, fx:
        //   if (controllerType == MainController.class) return new MainController(viewManager);
        //   if (controllerType == YarnOverviewController.class) return new YarnOverviewController(viewManager, dataManager);
        //   if (controllerType == AddYarnController.class) return new AddYarnController(dataManager);
        //   if (controllerType == EditYarnController.class) return new EditYarnController(dataManager);
        //   if (controllerType == YarnFormController.class) return new YarnFormController(viewManager);
        //   if (controllerType == StatisticsController.class) return new StatisticsController(dataManager);
        //   if (controllerType == ErrorDialogController.class) return new ErrorDialogController();
        //   if (controllerType == ConfirmDeleteDialogController.class) return new ConfirmDeleteDialogController();
        // Ukendt controller: throw new RuntimeException("Controller of type '" + controllerType.getSimpleName() + "' is not supported!");
        throw new UnsupportedOperationException("TODO");
    }
}
