package org.example.model;

import org.example.constants.enums.Builder;
import org.example.constants.enums.Wood;

import java.util.Objects;

public class GuitarSpecs {
    private int strings;
    private Builder builder;
    private Wood topWood;
    private Wood bottomWood;

    public GuitarSpecs(int strings, Builder builder, Wood topWood, Wood bottomWood) {
        this.strings = strings;
        this.builder = builder;
        this.topWood = topWood;
        this.bottomWood = bottomWood;
    }

    public int getStrings() {
        return strings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Wood getBottomWood() {
        return bottomWood;
    }
    

    @Override
    public boolean equals(Object o) {
        if(o == null || getClass() != o.getClass())
            return false;
        if(this == o)
            return true;
        return (strings == ((GuitarSpecs) o).strings &&
                builder.equals(((GuitarSpecs) o).builder) &&
                topWood.equals(((GuitarSpecs) o).getTopWood()) &&
                bottomWood.equals(((GuitarSpecs) o).getBottomWood()));
    }
}
