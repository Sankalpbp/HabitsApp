package io.sankalp.habitstrackerapplication.enums;

public enum Color {

    RED ( "#FF0000" ),
    GREEN ( "#00FF00" ),
    BLUE ( "0000FF" ),
    ORANGE ( "FFA500" ),
    BLUE_GREEN ( "088F8F" );

    private final String hexCode;

    private Color ( String hexCode ) {
        this.hexCode = hexCode;
    }

    public String getHexCode () {
        return this.hexCode;
    }
}
