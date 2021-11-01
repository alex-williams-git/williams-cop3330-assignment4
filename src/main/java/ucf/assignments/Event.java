/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Alexander Williams
 */

package ucf.assignments;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Event {

    private String description;
    private LocalDate date;
    private String status;
    private HashMap<LocalDate, String> toDoItems;

    public Event(LocalDate date, String description, String status)
    {
        // parameterized constructor: set date, description, and status
    }

    public String getDescription() {
        return "description";
    }

    public void setDescription(String description) {
        // setter for description
    }

    public LocalDate getDate() {
        return LocalDate.now();
    }

    public void setDate(LocalDate date) {
        // setter for date
    }

    public String getStatus() {
        return "status";
    }

    public void setStatus(String status) {
        // setter for status
    }

    public String getToDoItems() {
        return "toDoItems";
    }

    public void setToDoItems(ArrayList<String> toDoItems) {
        // setter for toDoItems
    }
}
