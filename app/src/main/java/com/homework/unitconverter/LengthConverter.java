package com.homework.unitconverter;

import java.util.Locale;

public class LengthConverter {
    private final double multiplier;

    LengthConverter(Unit fromUnit, Unit toUnit){
        double value = 0;
        switch(fromUnit){
            case MILLIMETER:
                if(toUnit == Unit.CENTIMETER){
                    value = .1;
                }
                else if(toUnit == Unit.DECIMETER){
                    value = .01;
                }
                else if(toUnit == Unit.METER){
                    value = .001;
                }
                else if(toUnit == Unit.KILOMETER){
                    value = .000001;
                }
                else if(toUnit == Unit.INCH){
                    value = .03937008;
                }
                else if(toUnit == Unit.FOOT){
                    value = .00328084;
                }
                else if(toUnit == Unit.YARD){
                    value = .00109361;
                }
                else if(toUnit == Unit.MILE){
                    value = .0000006213693181818;
                }
                break;
            case CENTIMETER:
                if(toUnit == Unit.MILLIMETER){
                    value = 10;
                }
                else if(toUnit == Unit.DECIMETER){
                    value = .1;
                }
                else if(toUnit == Unit.METER){
                    value = .01;
                }
                else if(toUnit == Unit.KILOMETER){
                    value = .00001;
                }
                else if(toUnit == Unit.INCH){
                    value = .3937008;
                }
                else if(toUnit == Unit.FOOT){
                    value = .0328084;
                }
                else if(toUnit == Unit.YARD){
                    value = .0109361;
                }
                else if(toUnit == Unit.MILE){
                    value = .000006213693181818;
                }
                break;
            case DECIMETER:
                if(toUnit == Unit.MILLIMETER){
                    value = 100;
                }
                else if(toUnit == Unit.CENTIMETER){
                    value = 10;
                }
                else if(toUnit == Unit.METER){
                    value = .1;
                }
                else if(toUnit == Unit.KILOMETER){
                    value = .0001;
                }
                else if(toUnit == Unit.INCH){
                    value = 3.937008;
                }
                else if(toUnit == Unit.FOOT){
                    value = .328084;
                }
                else if(toUnit == Unit.YARD){
                    value = .109361;
                }
                else if(toUnit == Unit.MILE){
                    value = .00006213693181818;
                }
                break;
            case METER:
                if(toUnit == Unit.MILLIMETER){
                    value = 1000;
                }
                else if(toUnit == Unit.CENTIMETER){
                    value = 100;
                }
                else if(toUnit == Unit.DECIMETER){
                    value = 10;
                }
                else if(toUnit == Unit.KILOMETER){
                    value = .001;
                }
                else if(toUnit == Unit.INCH){
                    value = 39.37008;
                }
                else if(toUnit == Unit.FOOT){
                    value = 3.28084;
                }
                else if(toUnit == Unit.YARD){
                    value = 1.09361;
                }
                else if(toUnit == Unit.MILE){
                    value = .0006213693181818;
                }
                break;
            case KILOMETER:
                if(toUnit == Unit.MILLIMETER){
                    value = 1000000;
                }
                else if(toUnit == Unit.CENTIMETER){
                    value = 100000;
                }
                else if(toUnit == Unit.DECIMETER){
                    value = 10000;
                }
                else if(toUnit == Unit.METER){
                    value = 1000;
                }
                else if(toUnit == Unit.INCH){
                    value = 39370.08;
                }
                else if(toUnit == Unit.FOOT){
                    value = 3280.84;
                }
                else if(toUnit == Unit.YARD){
                    value = 1093.61;
                }
                else if(toUnit == Unit.MILE){
                    value = .6213693181818;
                }
                break;
            case INCH:
                if(toUnit == Unit.MILLIMETER){
                    value = 25.4;
                }
                else if(toUnit == Unit.CENTIMETER){
                    value = 2.54;
                }
                else if(toUnit == Unit.DECIMETER){
                    value = .254;
                }
                else if(toUnit == Unit.METER){
                    value = .0254;
                }
                else if(toUnit == Unit.KILOMETER){
                    value = .0000254;
                }
                else if(toUnit == Unit.FOOT){
                    value = 0.0833333;
                }
                else if(toUnit == Unit.YARD){
                    value = 0.0277778;
                }
                else if(toUnit == Unit.MILE){
                    value = .000015783;
                }
                break;
            case FOOT:
                if(toUnit == Unit.MILLIMETER){
                    value = 304.8;
                }
                else if(toUnit == Unit.CENTIMETER){
                    value = 30.48;
                }
                else if(toUnit == Unit.DECIMETER){
                    value = 3.048;
                }
                else if(toUnit == Unit.METER){
                    value = .3048;
                }
                else if(toUnit == Unit.KILOMETER){
                    value = 0.0003048;
                }
                else if(toUnit == Unit.INCH){
                    value = 12;
                }
                else if(toUnit == Unit.YARD){
                    value = 0.333333;
                }
                else if(toUnit == Unit.MILE){
                    value = 0.000189394;
                }
                break;
            case YARD:
                if(toUnit == Unit.MILLIMETER){
                    value = 914.4;
                }
                else if(toUnit == Unit.CENTIMETER){
                    value = 91.44;
                }
                else if(toUnit == Unit.DECIMETER){
                    value = 9.144;
                }
                else if(toUnit == Unit.METER){
                    value = 0.9144;
                }
                else if(toUnit == Unit.KILOMETER){
                    value = 0.0009144;
                }
                else if(toUnit == Unit.INCH){
                    value = 36;
                }
                else if(toUnit == Unit.FOOT){
                    value = 3;
                }
                else if(toUnit == Unit.MILE){
                    value = 0.000568182;
                }
                break;
            case MILE:
                if(toUnit == Unit.MILLIMETER){
                    value = 1609340;
                }
                else if(toUnit == Unit.CENTIMETER){
                    value = 160934;
                }
                else if(toUnit == Unit.DECIMETER){
                    value = 16093.4;
                }
                else if(toUnit == Unit.METER){
                    value = 1609.34;
                }
                else if(toUnit == Unit.KILOMETER){
                    value = 1.60934;
                }
                else if(toUnit == Unit.INCH){
                    value = 63360;
                }
                else if(toUnit == Unit.FOOT){
                    value = 5280;
                }
                else if(toUnit == Unit.YARD){
                    value = 1760;
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
