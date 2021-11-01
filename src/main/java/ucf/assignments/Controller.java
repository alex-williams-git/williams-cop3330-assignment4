/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Alexander Williams
 */

package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TableView<Event> tableView;
    public TableColumn<Event, String> descriptionList;
    public TableColumn<Event, LocalDate> dateColumn;
    public TableColumn<Event, String> statusColumn;

    @FXML
    TextField descriptionTextField;
    @FXML
    DatePicker datePicker;
    @FXML
    Button addButton;

    ObservableList<Event> list = FXCollections.observableArrayList(

    );

    // initialize the GUI
    public void initialize(URL location, ResourceBundle resources)
    {
        // initialize all columns

        // set table to ObservableList
    }

    // adds to do list
    public void addEvent(ActionEvent actionEvent)
    {
        // create new event

        // add event to tableView

        // call refresh
    }

    // set date picker back to current date
    private void refresh()
    {
        // set datePicker to current date
    }

    // removes a to-do list
    public void removeList(ActionEvent actionEvent) {
        // remove a row from table view

        // shift contents together
    }

    // changes status of a to-do list
    public void changeStatus(ActionEvent actionEvent) {
        // if status is incomplete, make it complete

        // if status is complete, make it incomplete
    }

    // clears all to-do lists
    public void clearList(ActionEvent actionEvent) {
        // reset tableView
    }

    // shows complete to-do lists
    public void showComplete(ActionEvent actionEvent) {
        // search for to-do lists that are completed

        // filter tableView
    }

    // shows incomplete to-do lists
    public void showIncomplete(ActionEvent actionEvent) {
        // search for to-do lists that are incomplete

        // filter tableView
    }

    // shows all to-do lists
    public void showAll(ActionEvent actionEvent) {
        // shows whole tableView
    }

    // imports to-do list
    public void importFile(ActionEvent actionEvent) {
        // get value from textDescription

        // import to-do list
    }

    // exports to-do list
    public void exportFile(ActionEvent actionEvent) {
        // get value from textDescription

        // export to-do list to desired location
    }

    // edit to-do list description
    public void editDescription(ActionEvent actionEvent) {
        // change description value in the Event object for given to-do list
    }

    // edit due date of to-do list
    public void editDueDate(ActionEvent actionEvent) {
        // change date value in the Event object for given to-do list
    }

    // adds to-do item in to-do list
    public void addToDoItem(ActionEvent actionEvent){
        // add a to-do item to ArrayList of Event object

        // add the to-do item to tableView
    }

    // removes a to-do item in a to-do list
    public void removeToDoItem(ActionEvent actionEvent){
        // remove a to-do item from ArrayList of Event object

        // remove the to-do item from tableView
    }

    // edits a to-do item in a to-do list
    public void editToDoItemDescription(ActionEvent actionEvent){
        // change the ArrayList entry

        // update the tableView
    }

    // edits a to-do item date in to-do list
    public void editToDoItemDate(ActionEvent actionEvent){
        // change the ArrayList entry

        // update the tableView
    }

    // brings a user to the contents of the to-do list
    public void seeList(ActionEvent actionEvent){
        // change view to the specific to-do list tableView
    }
}
