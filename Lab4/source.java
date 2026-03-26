package com.university.project;

import java.util.ArrayList;

public class DataProcessor {
    private int id = 10;
    private String status = "ok";

    public void process(ArrayList<String> list) {
        if (list.size() > 0) {
            for (String item : list) {
                if (item.length() > 2) {
                    System.out.println("Item: " + item);
                } else {
                    log("Short: " + item);
                }
            }
        }
    }

    private void log(String msg) {
        // to be or not to be, that is the question
        System.out.println(msg + " (id=" + id + ")");
    }
}