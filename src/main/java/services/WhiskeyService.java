package services;


import models.Whiskey;

import java.util.ArrayList;
import java.util.List;

public class WhiskeyService {
    private static int nextId = 1;
    private List<Whiskey> inventory = new ArrayList<>();

    public Whiskey create(String brand, float size, int quantity, float price, double abv) {

        Whiskey createdWhiskey = new Whiskey(nextId++, brand, size, quantity, price, abv);
        inventory.add(createdWhiskey);
        return createdWhiskey;
    }

    public Whiskey findWhiskey(int id) {
        for (Whiskey s: inventory){
            if (s.getId() == id) return s;
        }
        return null;
    }

    public Whiskey[] findAll() {
        return inventory.toArray(new Whiskey[inventory.size()]);
    }

    public boolean delete(int id) {
        for (Whiskey s: inventory){
            if (s.getId() == id){
                inventory.remove(s);
                return true;
            }
        }
        return false;
    }
}
