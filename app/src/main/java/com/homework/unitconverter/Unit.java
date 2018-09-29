package com.homework.unitconverter;

//Declare constant values for allowable units
public enum Unit {
    MILLIMETER,
    CENTIMETER,
    DECIMETER,
    METER,
    KILOMETER,
    INCH,
    FOOT,
    YARD,
    MILE,
    OUNCE,
    CUP,
    PINT,
    QUART,
    GALLON,
    MILLILITER,
    LITER,
    FAHRENHEIT,
    CELSIUS,
    KELVIN;

    public static Unit verify(String inputUnit){
        if(inputUnit != null){
            for(Unit unit : Unit.values()){
                if(inputUnit.equalsIgnoreCase(unit.toString())){
                    return unit;
                }
            }
        }
        throw new IllegalArgumentException(inputUnit + " is not a valid unit.");
    }
}
