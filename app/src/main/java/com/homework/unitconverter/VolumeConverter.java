package com.homework.unitconverter;

import java.util.Locale;

public class VolumeConverter {
    private final double multiplier;

    VolumeConverter(Unit fromUnit, Unit toUnit) {
        double value = 0;
        switch (fromUnit) {
            case OUNCE:
                if(toUnit == Unit.CUP){
                    value = 0.125;
                }
                else if(toUnit == Unit.PINT){
                    value = 0.0625;
                }
                else if(toUnit == Unit.QUART){
                    value = 0.03125;
                }
                else if(toUnit == Unit.GALLON){
                    value = 0.0078125;
                }
                else if(toUnit == Unit.MILLILITER){
                    value = 29.5735;
                }
                else if(toUnit == Unit.LITER){
                    value = 0.0295735;
                }
                break;
            case CUP:
                if(toUnit == Unit.OUNCE){
                    value = 8;
                }
                else if(toUnit == Unit.PINT){
                    value = 0.5;
                }
                else if(toUnit == Unit.QUART){
                    value = 0.25;
                }
                else if(toUnit == Unit.GALLON){
                    value = 0.0625;
                }
                else if(toUnit == Unit.MILLILITER){
                    value = 236.588;
                }
                else if(toUnit == Unit.LITER){
                    value = 0.236588;
                }
                break;
            case PINT:
                if(toUnit == Unit.OUNCE){
                    value = 16;
                }
                else if(toUnit == Unit.CUP){
                    value = 2;
                }
                else if(toUnit == Unit.QUART){
                    value = 0.5;
                }
                else if(toUnit == Unit.GALLON){
                    value = 0.125;
                }
                else if(toUnit == Unit.MILLILITER){
                    value = 473.176;
                }
                else if(toUnit == Unit.LITER){
                    value = 0.473176;
                }
                break;
            case QUART:
                if(toUnit == Unit.OUNCE){
                    value = 32;
                }
                else if(toUnit == Unit.CUP){
                    value = 4;
                }
                else if(toUnit == Unit.PINT){
                    value = 2;
                }
                else if(toUnit == Unit.GALLON){
                    value = 0.25;
                }
                else if(toUnit == Unit.MILLILITER){
                    value = 946.353;
                }
                else if(toUnit == Unit.LITER){
                    value = 0.946353;
                }
                break;
            case GALLON:
                if(toUnit == Unit.OUNCE){
                    value = 128;
                }
                else if(toUnit == Unit.CUP){
                    value = 16;
                }
                else if(toUnit == Unit.PINT){
                    value = 8;
                }
                else if(toUnit == Unit.QUART){
                    value = 4;
                }
                else if(toUnit == Unit.MILLILITER){
                    value = 3785.41;
                }
                else if(toUnit == Unit.LITER){
                    value = 3.78541;
                }
                break;
            case MILLILITER:
                if(toUnit == Unit.OUNCE){
                    value = 0.033814;
                }
                else if(toUnit == Unit.CUP){
                    value = 0.00422675;
                }
                else if(toUnit == Unit.PINT){
                    value = 0.00211338;
                }
                else if(toUnit == Unit.QUART){
                    value = 0.00105669;
                }
                else if(toUnit == Unit.GALLON){
                    value = 0.000264172;
                }
                else if(toUnit == Unit.LITER){
                    value = 0.001;
                }
                break;
            case LITER:
                if(toUnit == Unit.OUNCE){
                    value = 33.814;
                }
                else if(toUnit == Unit.CUP){
                    value = 4.22675;
                }
                else if(toUnit == Unit.PINT){
                    value = 2.11338;
                }
                else if(toUnit == Unit.QUART){
                    value = 1.05669;
                }
                else if(toUnit == Unit.GALLON){
                    value = 0.264172;
                }
                else if(toUnit == Unit.MILLILITER){
                    value = 1000;
                }
                break;
        }
        multiplier = value;
    }
    public double convert(double input){
        return input * multiplier;
    }
    String getMultiplier() { return String.format(Locale.ENGLISH, "%.2f", multiplier); }
}
