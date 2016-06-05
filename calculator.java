import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class calculator extends Application {
	public void start(Stage primaryStage) {
    		// to save the number , and judge +  -  x  or  /
    		private double number;
		private double judge;
		
		MenuBar menuBar = new MenuBar();
        	Menu menu = new Menu("編輯");
		
		//set the pane
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(5, 5, 5, 5));

		 //TextFields
		TextField output = new TextField();
		output.setMinSize(233, 0);
		GridPane.setConstraints(output, 0, 0);
		grid.getChildren().add(output);
		
		
		// set the button
		Button b1 = new Button("Backspace");
		Button b2 = new Button("CE");
		Button b3 = new Button("C");
		Button b4 = new Button("7");
		Button b5 = new Button("8");
		Button b6 = new Button("9");
		Button b7 = new Button("4");
		Button b8 = new Button("5");
		Button b9 = new Button("6");
		Button b10 = new Button("1");
		Button b11 = new Button("2");
		Button b12 = new Button("3");
		Button b13 = new Button("0");
		Button b14 = new Button("+/-");
		Button b15 = new Button(".");
		Button b16 = new Button("/");
		Button b17 = new Button("sqrt");
		Button b18 = new Button("X");
		Button b19 = new Button("%");
		Button b20 = new Button("-");
		Button b21 = new Button("1/x");
		Button b22 = new Button("+");
		Button b23 = new Button("=");
	
	  	// add buttons to pane
		b1.setMinSize(80, 30);
		b1.setTranslateX(10);
		b1.setTranslateY(45);
		grid.getChildren().add(b1);
		
		b2.setMinSize(60, 30);
		b2.setTranslateX(95);
		b2.setTranslateY(45);
		grid.getChildren().add(b2);
		
		
		b3.setMinSize(60, 30);
		b3.setTranslateX(160);
		b3.setTranslateY(45);
		grid.getChildren().add(b3);
		
		
		b4.setMinSize(35, 35);
		b4.setTranslateX(10);
		b4.setTranslateY(85);
		grid.getChildren().add(b4);
		
		b5.setMinSize(35, 35);
		b5.setTranslateX(50);
		b5.setTranslateY(85);
		grid.getChildren().add(b5);
		
		b6.setMinSize(35, 35);
		b6.setTranslateX(90);
		b6.setTranslateY(85);
		grid.getChildren().add(b6);
		
		b7.setMinSize(35, 35);
		b7.setTranslateX(10);
		b7.setTranslateY(125);
		grid.getChildren().add(b7);
		
		b8.setMinSize(35, 35);
		b8.setTranslateX(50);
		b8.setTranslateY(125);
		grid.getChildren().add(b8);
		
		b9.setMinSize(35, 35);
		b9.setTranslateX(90);
		b9.setTranslateY(125);
		grid.getChildren().add(b9);
		
		b10.setMinSize(35, 35);
		b10.setTranslateX(10);
		b10.setTranslateY(165);
		grid.getChildren().add(b10);
		
		b11.setMinSize(35, 35);
		b11.setTranslateX(50);
		b11.setTranslateY(165);
		grid.getChildren().add(b11);
		
		b12.setMinSize(35, 35);
		b12.setTranslateX(90);
		b12.setTranslateY(165);
		grid.getChildren().add(b12);
		
		b13.setMinSize(35, 35);
		b13.setTranslateX(10);
		b13.setTranslateY(205);
		grid.getChildren().add(b13);
		
		b14.setMinSize(35, 35);
		b14.setTranslateX(50);
		b14.setTranslateY(205);
		grid.getChildren().add(b14);
		
		b15.setMinSize(30, 35);
		b15.setTranslateX(95);
		b15.setTranslateY(205);
		grid.getChildren().add(b15);
		
		b16.setMinSize(45, 35);
		b16.setTranslateX(130);
		b16.setTranslateY(85);
		grid.getChildren().add(b16);
		
		b17.setMinSize(45, 35);
		b17.setTranslateX(180);
		b17.setTranslateY(85);
		grid.getChildren().add(b17);
		
		b18.setMinSize(45, 35);
		b18.setTranslateX(130);
		b18.setTranslateY(125);
		grid.getChildren().add(b18);
		
		b19.setMinSize(45, 35);
		b19.setTranslateX(180);
		b19.setTranslateY(125);
		grid.getChildren().add(b19);
		
		b20.setMinSize(45, 35);
		b20.setTranslateX(130);
		b20.setTranslateY(165);
		grid.getChildren().add(b20);
		
		b21.setMinSize(45, 35);
		b21.setTranslateX(180);
		b21.setTranslateY(165);
		grid.getChildren().add(b21);
		
		b22.setMinSize(45, 35);
		b22.setTranslateX(130);
		b22.setTranslateY(205);
		grid.getChildren().add(b22);
		
		b23.setMinSize(45, 35);
		b23.setTranslateX(180);
		b23.setTranslateY(205);
		grid.getChildren().add(b23);

		//create the action listener
		
		// "+""
		b22.setOnAction(c -> {
			number = Double.parseDouble(output.getText());
			output.setText("");
			judge = 1;
		});
		
		// "-"
		b20.setOnAction(c -> {
			number = Double.parseDouble(output.getText());
			output.setText("");
			judge = 2;
		});
		
		// "x"
		b18.setOnAction(c -> {
			number = Double.parseDouble(output.getText());
			output.setText("");
			judge = 3;
		});
		
		// "/"
		b16.setOnAction(c -> {
			number = Double.parseDouble(output.getText());
			output.setText("");
			judge = 4;
		});
		
		b4.setOnAction(e -> {
			output.setText(output.getText()+"7");
		});
		
		b5.setOnAction(e -> {
			output.setText(output.getText()+"8");
		});
		
		b6.setOnAction(e -> {
			output.setText(output.getText()+"9");
		});
		
		b7.setOnAction(e -> {
			output.setText(output.getText()+"4");
		});
		
		b8.setOnAction(e -> {
			output.setText(output.getText()+"5");
		});
		
		b9.setOnAction(e -> {
			output.setText(output.getText()+"6");
		});
		
		b3.setOnAction(e -> {
			output.setText("");
		});
		
		b15.setOnAction(e -> {
			output.setText(output.getText()+".");
		});
		
		//function the button C
		b1.setOnAction(e -> {
			char[] c = new char[output.getLength()];
			for(int i = 0;i < output.getLength() - 1;i++){
				c[i] = output.getText().charAt(i);
			}
			output.setText(String.valueOf(c));
		});
		
		//function the button Backspace(Del)
		b14.setOnAction(e -> {
			 output.setText(Integer.toString(Integer.parseInt(output.getText())* (-1)));
		});

		//set the size and the title , show the calculator
		Scene scene = new Scene(grid, 240, 270);
		primaryStage.setTitle("U10416027 計算機");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		
  	}
}
