package models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    @Test
    public void setIdTest() {

        int expected = 4012;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setId(expected);

        Assert.assertEquals(expected, testSneaker.getId());
    }

    @Test
    public void setNameTest() {

        String expected = "OZWEEGO";

        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        Assert.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setBrandTest() {

        String expected = "This is a brand";

        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        Assert.assertEquals(expected, testSneaker.getBrand());
    }


    @Test
    public void setSportTest() {

        String expected = "CalvinBall";

        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);

        Assert.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest() {

        float expected = 12;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);

        Assert.assertEquals(expected, testSneaker.getSize(), 0.0);
    }

    @Test
    public void setQtyTest() {

        int expected = 120;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setQty(expected);

        Assert.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest() {

        float expected = 60;

        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        Assert.assertEquals(expected, testSneaker.getPrice(), 0.0);
    }

    @Test
    public void constructorTest(){

        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedQty,expectedPrice);

        Assert.assertEquals(expectedId, testSneaker.getId());
        Assert.assertEquals(expectedName, testSneaker.getName());
        Assert.assertEquals(expectedBrand, testSneaker.getBrand());
        Assert.assertEquals(expectedSport, testSneaker.getSport());
        Assert.assertEquals(expectedQty, testSneaker.getQty());
        Assert.assertEquals(expectedPrice, testSneaker.getPrice(), 0.0);
    }
}
