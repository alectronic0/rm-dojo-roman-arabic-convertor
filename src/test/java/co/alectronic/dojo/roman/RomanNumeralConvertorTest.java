package co.alectronic.dojo.roman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralConvertorTest {

    RomanNumeralConvertor romanNumeralConvertor;

    @Before
    public void setup() {
        romanNumeralConvertor = new RomanNumeralConvertor();
    }


    @Test
    public void test() {
        Assert.assertEquals(romanNumeralConvertor.convert(1), "I");
        Assert.assertEquals(romanNumeralConvertor.convert(2), "II");
        Assert.assertEquals(romanNumeralConvertor.convert(3), "III");
        Assert.assertEquals(romanNumeralConvertor.convert(4), "IV");
        Assert.assertEquals(romanNumeralConvertor.convert(5), "V");
        Assert.assertEquals(romanNumeralConvertor.convert(6), "VI");
        Assert.assertEquals(romanNumeralConvertor.convert(7), "VII");
        Assert.assertEquals(romanNumeralConvertor.convert(8), "VIII");
        Assert.assertEquals(romanNumeralConvertor.convert(9), "IX");
        Assert.assertEquals(romanNumeralConvertor.convert(10), "X");
        Assert.assertEquals(romanNumeralConvertor.convert(11), "XI");
        Assert.assertEquals(romanNumeralConvertor.convert(12), "XII");
        Assert.assertEquals(romanNumeralConvertor.convert(13), "XIII");
        Assert.assertEquals(romanNumeralConvertor.convert(14), "XIV");
        Assert.assertEquals(romanNumeralConvertor.convert(15), "XV");
        Assert.assertEquals(romanNumeralConvertor.convert(16), "XVI");
        Assert.assertEquals(romanNumeralConvertor.convert(17), "XVII");
        Assert.assertEquals(romanNumeralConvertor.convert(18), "XVIII");
        Assert.assertEquals(romanNumeralConvertor.convert(19), "XIX");
        Assert.assertEquals(romanNumeralConvertor.convert(20), "XX");
        Assert.assertEquals(romanNumeralConvertor.convert(21), "XXI");
        Assert.assertEquals(romanNumeralConvertor.convert(24), "XXIV");
        Assert.assertEquals(romanNumeralConvertor.convert(25), "XXV");
        Assert.assertEquals(romanNumeralConvertor.convert(29), "XXIX");
        Assert.assertEquals(romanNumeralConvertor.convert(30), "XXX");
        Assert.assertEquals(romanNumeralConvertor.convert(40), "XL");
        Assert.assertEquals(romanNumeralConvertor.convert(41), "XLI");
        Assert.assertEquals(romanNumeralConvertor.convert(44), "XLIV");
        Assert.assertEquals(romanNumeralConvertor.convert(45), "XLV");
        Assert.assertEquals(romanNumeralConvertor.convert(49), "XLIX");
        Assert.assertEquals(romanNumeralConvertor.convert(50), "L");
        Assert.assertEquals(romanNumeralConvertor.convert(51), "LI");
        Assert.assertEquals(romanNumeralConvertor.convert(55), "LV");
        Assert.assertEquals(romanNumeralConvertor.convert(59), "LIX");
        Assert.assertEquals(romanNumeralConvertor.convert(60), "LX");
        Assert.assertEquals(romanNumeralConvertor.convert(61), "LXI");
        Assert.assertEquals(romanNumeralConvertor.convert(70), "LXX");

    }

}