package models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class WhiskeyTest {
    @Test
    public void setIdTest() {

        int expected = 4012;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setId(expected);

        Assert.assertEquals(expected, testWhiskey.getId());
    }



    @Test
    public void setBrandTest() {

        String expected = "This is a brand";

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setBrand(expected);

        Assert.assertEquals(expected, testWhiskey.getBrand());
    }


    @Test
    public void setSizeTest() {

        float expected = 12;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setSize(expected);

        Assert.assertEquals(expected, testWhiskey.getSize(), 0.0);
    }

    @Test
    public void setQtyTest() {

        int expected = 120;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setQty(expected);

        Assert.assertEquals(expected, testWhiskey.getQty());
    }

    @Test
    public void setPriceTest() {

        float expected = 60;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setPrice(expected);

        Assert.assertEquals(expected, testWhiskey.getPrice(), 0.0);
    }

    @Test
    public void setabvTest() {

        double expected = .45;

        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setAbv(expected);

        Assert.assertEquals(expected, testWhiskey.getAbv(), 0.0);
    }

    @Test
    public void constructorTest(){

        int expectedId = 6;
        String expectedBrand = "Adidas";
        float expectedSize = 120;
        int expectedQty = 120;
        float expectedPrice = 80.00f;
        double expectedabv = 0.40;

        Whiskey testWhiskey = new Whiskey(expectedId, expectedBrand, expectedSize, expectedQty, expectedPrice, expectedabv);

        Assert.assertEquals(expectedId, testWhiskey.getId());
        Assert.assertEquals(expectedBrand, testWhiskey.getBrand());
        Assert.assertEquals(expectedSize, testWhiskey.getSize(),0.0);
        Assert.assertEquals(expectedQty, testWhiskey.getQty());
        Assert.assertEquals(expectedPrice, testWhiskey.getPrice(), 0.0);
        Assert.assertEquals(expectedabv, testWhiskey.getAbv(), 0.0);
    }
}
