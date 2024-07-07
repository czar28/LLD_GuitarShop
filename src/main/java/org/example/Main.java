package org.example;

import org.example.constants.enums.Builder;
import org.example.constants.enums.Wood;
import org.example.model.Guitar;
import org.example.model.GuitarSpecs;
import org.example.service.InventoryService;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();
        inventoryService.addGuitar(new Guitar(10, "M1", new GuitarSpecs(2, Builder.YAMAHA, Wood.MAHOGANY, Wood.APPLEWOOD)));
        List<Guitar> searchResults = inventoryService.searchGuitar(new GuitarSpecs(2, Builder.YAMAHA, Wood.MAHOGANY, Wood.APPLEWOOD));
        for(Guitar guitar: searchResults) {
            System.out.println("Your Guitar Model is "+ guitar.getModelNumber() + " for Price of rs " + guitar.getPrice());
        }
    }
}