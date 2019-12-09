package by.it.nickgrudnitsky.project.service;

import by.it.nickgrudnitsky.project.entities.CellularPlan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;


public class Parcer {

    public static void main(String[] args) {
        Parcer parcer = new Parcer();

    }

    private CellularPlan cellularPlan = new CellularPlan();



    private String parcePlans(File file){
        if (file.exists()) {
            try (BufferedReader in = new BufferedReader(
                    new FileReader(file))) {
                while (in.ready()) {

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return cellularPlan.getName();
    }
}
