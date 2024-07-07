package org.example.service;

import org.example.model.Guitar;
import org.example.model.GuitarSpecs;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {

    private List<Guitar> guitarList;

    public InventoryService() {
        this.guitarList = new ArrayList<>();
    }

    public InventoryService(List<Guitar> guitarList) {
        this.guitarList = guitarList;
    }

    public void addGuitar(Guitar guitar) {
        guitarList.add(guitar);
    }

    public void removeGuitar(Guitar guitar) {
        guitarList.remove(guitar);
    }

    public List<Guitar> searchGuitar(GuitarSpecs guitarSpecs) {
        List<Guitar> filteredGuitars = new ArrayList<>();
        for(Guitar guitar: guitarList) {
            if(guitar.getGuitarSpecs().equals(guitarSpecs)) {
                filteredGuitars.add(guitar);
            }
        }

        return filteredGuitars;
    }
}
