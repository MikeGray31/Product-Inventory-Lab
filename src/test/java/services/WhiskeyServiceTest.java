package services;

import models.Whiskey;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class WhiskeyServiceTest {

    @Test
    public void createTest(){

        // (1)
        String expectedBrand = "";
        float expectedSize = 10.0f;
        int expectedQty = 10;
        float expectedPrice = 80.00f;
        double expectedabv = 0.40;

        // (2)
        WhiskeyService WhiskeyService = new WhiskeyService();
        Whiskey testWhiskey = WhiskeyService.create(expectedBrand, expectedSize, expectedQty, expectedPrice, expectedabv);

        // (3)
        int actualId = testWhiskey.getId();
        String actualBrand = testWhiskey.getBrand();
        float actualSize = testWhiskey.getSize();
        int actualQty = testWhiskey.getQty();
        float actualPrice = testWhiskey.getPrice();
        double actualabv = testWhiskey.getAbv();

        // (4)
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSize, actualSize, 0.0);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice, 0.0);
        Assert.assertEquals(expectedabv,actualabv, 0.0);
    }

    @Test
    public void findWhiskeyTest() {

        String expectedBrand = "Jack Daniel's";
        float expectedSize = 10.0f;
        int expectedQty = 100;
        float expectedPrice = 50.00f;
        double expectedabv = 0.40;

        WhiskeyService WhiskeyService = new WhiskeyService();
        Whiskey testWhiskey = WhiskeyService.create(expectedBrand, expectedSize, expectedQty, expectedPrice, expectedabv);

        Assert.assertEquals(testWhiskey, WhiskeyService.findWhiskey(1));
    }

    @Test
    public void deleteTest() {

        String expectedBrand = "Peach Bird Dog";
        float expectedSize = 12.0f;
        int expectedQty = 120;
        float expectedPrice = 80.00f;
        double expectedabv = 0.08;


        WhiskeyService WhiskeyService = new WhiskeyService();
        Whiskey testWhiskey = WhiskeyService.create(expectedBrand, expectedSize, expectedQty, expectedPrice, expectedabv);

        Assert.assertTrue(WhiskeyService.delete(testWhiskey.getId()));
    }
}
