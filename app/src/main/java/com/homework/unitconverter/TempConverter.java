package com.homework.unitconverter;

import java.util.Locale;

public class TempConverter {
    private final double multiplier;
    private final double addition1;
    private final double addition2;

    TempConverter(Unit fromUnit, Unit toUnit){
        double mVal = 0;
        double aVal1 = 0;
        double aVal2 = 0;
        switch(fromUnit){
            case FAHRENHEIT:
                if(toUnit == Unit.CELSIUS){
                    aVal1 = -32;
                    mVal = .555556;
                    aVal2 = 0;
                }
                else if(toUnit == Unit.KELVIN){
                    aVal1 = 459.67;
                    mVal = .555556;
                    aVal2 = 0;
                }
                break;
            case CELSIUS:
                if(toUnit == Unit.FAHRENHEIT){
                    mVal = 1.8;
                    aVal2 = 32;
                }
                else if(toUnit == Unit.KELVIN){
                    aVal1 = 273.15;
                    mVal = 1;
                    aVal2 = 0;
                }
                break;
            case KELVIN:
                if(toUnit == Unit.FAHRENHEIT){
                    mVal = 1.8;
                    aVal2 = -459.67;
                }
                else if(toUnit == Unit.CELSIUS){
                    aVal1 = -273.15;
                    mVal = 1;
                    aVal2 = 0;
                }
                break;
        }
        multiplier = mVal;
        addition1 = aVal1;
        addition2 = aVal2;
    }

    public double convert(double input){
        return (multiplier * (input + addition1)) + addition2;
    }
    String getMultiplier() { return String.format(Locale.ENGLISH, "%.2f", multiplier); }
}
