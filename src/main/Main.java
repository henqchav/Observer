package main;



import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	StackPane root = new StackPane();
	HBox btns = new HBox();
	Button yellowBtn = new Button("Yellow");
	Button blueBtn = new Button("Blue");
	Button redBtn = new Button("Red");
	Label colorCounter = new Label("");	
	private static int counter = 0;
	@Override
	public void start(Stage primaryStage) {
		fuctions();
		Scene scene = new Scene(root,800,400);
		StackPane.setAlignment(btns,Pos.CENTER);
		primaryStage.setTitle("Tarea-AspectJ");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	private void changeYellow(Pane root) {}
	private void changeBlue(Pane root) {}
	private void changeRed(Pane root) {}
	
	private void fuctions() {
		btns.getChildren().addAll(yellowBtn,blueBtn,redBtn);
		btns.setAlignment(Pos.CENTER);
		colorCounter.setAlignment(Pos.TOP_CENTER);
		root.getChildren().addAll(btns);
		
		yellowBtn.setOnAction(new EventHandler<>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				changeYellow(root);	
				colorCounter.setText("Color numero: " + counter);
			}
				
		});
		blueBtn.setOnAction(new EventHandler<>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				changeBlue(root);
				colorCounter.setText("Color numero: " + counter);
			}				
		});
		redBtn.setOnAction(new EventHandler<>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				changeRed(root);
				colorCounter.setText("Color numero: " + counter);
			}				
		});
		
		
	}
	public void sumcol1() {
		if (root.getBackground().getFills().get(0).getFill().toString() == (("red"))){
				++counter;
		}
	}
	public void sumcol2() {
		if (root.getBackground().getFills().get(0).getFill().toString() == (("yellow"))){
				++counter;
		}
	}
	public void sumcol3() {
		if (root.getBackground().getFills().get(0).getFill().toString() == (("blue"))){
				++counter;
		}
	}
	
	
	
}
