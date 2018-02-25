/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saarthaksharma
 */
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class LoanCalculator extends Application {

    private static GridPane rootNode;
    private static Stage myStage = new Stage();

    public static void main(String[] args) {
        launch(args);

    }

    public void start(Stage myStage) {

        myStage.setTitle("Loan Calculator");
        rootNode = new GridPane();
        rootNode.setPadding(new Insets(30));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 400, 200);

        Label interestRate = new Label("Annual Interest Rate: ");
        Label years = new Label("Number of Years: ");
        Label amount = new Label("Loan Amount");
        Label mPayment = new Label("Monthly Payment");
        Label tPayment = new Label("Total Payment");

        TextField annualInterestRate = new TextField();
        TextField numberOfYears = new TextField();
        TextField loanAmount = new TextField();
        TextField monthlyPayment = new TextField();
        monthlyPayment.setEditable(false);
        TextField totalPayment = new TextField();
        totalPayment.setEditable(false);
        Button calculateButton = new Button("Calculate");

        rootNode.add(interestRate, 0, 0);
        rootNode.add(annualInterestRate, 1, 0);
        rootNode.add(years, 0, 1);
        rootNode.add(numberOfYears, 1, 1);
        rootNode.add(amount, 0, 2);
        rootNode.add(loanAmount, 1, 2);
        rootNode.add(mPayment, 0, 3);
        rootNode.add(monthlyPayment, 1, 3);
        rootNode.add(tPayment, 0, 4);
        rootNode.add(totalPayment, 1, 4);
        rootNode.add(calculateButton, 1, 5);
        myStage.setScene(myScene);
        myStage.show();
        
        Button myButton = new Button();

    }
}
