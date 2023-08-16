package com.example.final_aarongirard_200458198;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventForm extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(new Label("First Name:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("Last Name:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Company"), 0, 2);
        pane.add(new TextField(), 1, 2);
        pane.add(new Label("Email"), 0, 3);
        pane.add(new TextField(), 1, 3);
        pane.add(new Label("Phone Area Code"), 0, 4);
        pane.add(new TextField(), 1, 4);
        pane.add(new Label("Phone Number"), 0, 5);
        pane.add(new TextField(), 1, 5);
        pane.add(new Label("Subject"), 0, 6);
        pane.add(new TextField(), 1, 6);

        RadioButton button = new RadioButton("Yes");
        RadioButton buttonTwo = new RadioButton("No");

        ToggleGroup radioButtonGroup = new ToggleGroup();
        button.setToggleGroup(radioButtonGroup);
        buttonTwo.setToggleGroup(radioButtonGroup);

        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5, 5, 5, 5));
        paneForRadioButtons.getChildren().addAll(button, buttonTwo);
        pane.add(paneForRadioButtons, 1, 7);

        Button btAdd = new Button("Register");
        pane.add(btAdd, 1, 8);
        GridPane.setHalignment(btAdd, HPos.RIGHT);

        btAdd.setOnAction(event -> {
            String firstName = ((TextField) pane.getChildren().get(1)).getText();
            String lastName = ((TextField) pane.getChildren().get(3)).getText();
            String company = ((TextField) pane.getChildren().get(5)).getText();
            String email = ((TextField) pane.getChildren().get(7)).getText();
            String phoneAreaCode = ((TextField) pane.getChildren().get(9)).getText();
            String phoneNumber = ((TextField) pane.getChildren().get(11)).getText();
            String subject = ((TextField) pane.getChildren().get(13)).getText();

            RadioButton selectedRadioButton = (RadioButton) paneForRadioButtons.getChildren().stream()
                    .filter(node -> node instanceof RadioButton && ((RadioButton) node).isSelected())
                    .findFirst().orElse(null);
            String radioButtonValue = selectedRadioButton != null ? selectedRadioButton.getText() : "";

            registerEvent(firstName, lastName, company, email, phoneAreaCode, phoneNumber, subject, radioButtonValue);
        });

        Scene scene = new Scene(pane);
        stage.setTitle("Event Registration Form");
        stage.setScene(scene);
        stage.show();
    }


    private void registerEvent(String firstName, String lastName, String company, String email,
                               String phoneAreaCode, String phoneNumber, String subject, String radioButtonValue) {
        System.out.println("Registration successful:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Company: " + company);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneAreaCode + " " + phoneNumber);
        System.out.println("Subject: " + subject);
        System.out.println("Radio Button: " + radioButtonValue);
    }

    public static void main(String[] args) {
        launch(args);
    }
}