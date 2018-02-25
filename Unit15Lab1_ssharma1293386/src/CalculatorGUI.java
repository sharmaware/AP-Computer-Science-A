/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.Scene;
/**
 *
 * @author saarthaksharma
 */
public class CalculatorGUI extends Application{
    private Button calculateButton;
    private Calculator calculator = new Calculator();
    private TextField number1Field;
    private TextField number2Field;
    private TextField sumField;
    
    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage myStage){
        myStage.setTitle("Simple Calculator");
        GridPane rootNode = new GridPane();
        rootNode.setPadding(new Insets(30));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 350, 200);
        
        calculateButton = new Button("Calculate: ");
        Label number1Label = new Label("First Value: ");
        Label number2Label = new Label("Second Value: ");
        Label sumLabel = new Label("Sum is: ");
        number1Field = new TextField();
        number2Field = new TextField();
        sumField = new TextField();
        
        calculateButton.setOnAction(new ButtonHandler());
                
        rootNode.add(number1Label, 0, 0);
        rootNode.add(number2Label, 0, 1);
        rootNode.add(sumLabel, 0, 2);
        rootNode.add(number1Field, 1, 0);
        rootNode.add(number2Field, 1, 1);
        rootNode.add(sumField, 1, 2);
        rootNode.add(calculateButton, 1,3);
        
        myStage.setScene(myScene);
        myStage.show();
    }
    class ButtonHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            calculator.setNumber1(Double.parseDouble(number1Field.getText()));
            calculator.setNumber2(Double.parseDouble(number2Field.getText()));
            calculator.setSum();
            sumField.setText(Double.toString(calculator.getSum()));
            
        }
    }
}
