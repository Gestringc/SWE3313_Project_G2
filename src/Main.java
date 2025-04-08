import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {
    private static final String APPLICATION_TITLE = "Edit Customer Accounts";
    private static final double SCENE_WIDTH = 850;
    private static final double SCENE_HEIGHT = 650;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = loadFXMLLayout();
        configurePrimaryStage(primaryStage, root);
    }

    private Parent loadFXMLLayout() throws Exception {
        try {
            URL fxmlUrl = getClass().getResource("/Resources/MainView.fxml");
            System.out.println("Resolved URL: " + fxmlUrl);

            FXMLLoader loader = new FXMLLoader(fxmlUrl);
            return loader.load();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    private void configurePrimaryStage(Stage stage, Parent root) {
        stage.setTitle(APPLICATION_TITLE);
        stage.setScene(new Scene(root, SCENE_WIDTH, SCENE_HEIGHT));
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Path: " + Main.class.getResource("/Resources/CustomerAccountTable.fxml"));
        launch(args);
    }

    public static void createAccount() {
    }

    public static void modifyAccount() {
    }

    public static void deleteAccount() {
    }
}