// 03/05/2024
// WJZ Unit Four Assignment
// 100% (Level 4+++)

// Generates seventeen shapes to construct an image of the canadian flag, 
// using the exact values in the official construction sheet.


package u4a;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Group root;
    private static Canvas canvas;
    public static GraphicsContext gc;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Canadian Flag");
        root =new Group();
        scene = new Scene(root);
        stage.setScene(scene);

        canvas = new Canvas(960, 480);
        root.getChildren().add(canvas);
        gc = canvas.getGraphicsContext2D();

        drawThreeSections(gc);
        drawRoughRects(gc);
        drawCircles(gc);

        
        stage.show();
    }

    public void drawThreeSections(GraphicsContext gc){
        gc.setFill(Color.RED);
        gc.fillRect(0, 0, 240, 480);
        gc.setFill(Color.RED);
        gc.fillRect(240, 0, 480, 480);
        gc.setFill(Color.RED);
        gc.fillRect(720, 0, 240, 480);
    }

    public void drawCircles(GraphicsContext gc){
        for(int i = 0; i < 12; i++){
            gc.setFill(Color.WHITE);
            gc.fillOval(CircleValues.circleXPoints[i], CircleValues.circleYPoints[i], CircleValues.circleRadius[i]*2, CircleValues.circleRadius[i]*2);
        }
        
    }

    public void drawRoughRects(GraphicsContext gc){
        gc.setFill(Color.WHITE);
        gc.fillPolygon(RectangleValues.rect1XPoints, RectangleValues.rect1YPoints, 43);
        gc.fillPolygon(RectangleValues.rect2XPoints, RectangleValues.rect2YPoints, 4);
    }

    public static void main(String[] args) {
        launch();
    }

}