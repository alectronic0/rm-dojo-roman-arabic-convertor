package co.alectronic.dojo.roman;

import java.util.*;

public class RomanNumeralConvertor {

    /**
     * http://codingdojo.org/kata/RomanNumerals/
     * 1 = I
     * 5 = V
     * 10 = X
     * 50 = L
     * 100 = C
     * 500 = D
     * 1000 = M
     */

    public final List<RomanNumeral> romanNumerals = Arrays.asList(
            new RomanNumeral("I",1),
            new RomanNumeral("V",5),
            new RomanNumeral("X",10),
            new RomanNumeral("L",50),
            new RomanNumeral("C",100),
            new RomanNumeral("D",500),
            new RomanNumeral("M",1000)
    ).sort(Comparator.comparing(RomanNumeral::getNumber));


    public String convert(int i){


        return "I";
    }

    public String applyConvert(String s, int numberConverting, int value) {
        int d = numberConverting / value;
        int r = numberConverting % value;


        x = d * romanNumerals.get(numberConverting)

        s += x;

        return applyConvert(s,);
    }


}
