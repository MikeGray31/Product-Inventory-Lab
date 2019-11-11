package models;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    @Test
    public void setIdTest() {

        int expected = 4012;

        Sneakers testSneaker = new Sneakers();
        testSneaker.setId(expected);

        Assert.assertEquals(expected, testSneaker.getId());
    }

    @Test
    public void setNameTest() {

        String expected = "OZWEEGO";

        Sneakers testSneaker = new Sneakers();
        testSneaker.setName(expected);

        Assert.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setBrandTest() {

        String expected = "This is a brand";

        Sneakers testSneaker = new Sneakers();
        testSneaker.setBrand(expected);

        Assert.assertEquals(expected, testSneaker.getBrand());
    }


    @Test
    public void setSportTest() {

        String expected = "CalvinBall";

        Sneakers testSneaker = new Sneakers();
        testSneaker.setSport(expected);

        Assert.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest() {

        float expected = 12;

        Sneakers testSneaker = new Sneakers();
        testSneaker.setSize(expected);

        Assert.assertEquals(expected, testSneaker.getSize(), 0.0);
    }

    @Test
    public void setQtyTest() {

        int expected = 120;

        Sneakers testSneaker = new Sneakers();
        testSneaker.setQty(expected);

        Assert.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest() {

        float expected = 60;

        Sneakers testSneaker = new Sneakers();
        testSneaker.setPrice(expected);

        Assert.assertEquals(expected, testSneaker.getPrice(), 0.0);
    }
}
