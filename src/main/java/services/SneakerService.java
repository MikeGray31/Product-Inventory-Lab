package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService {

    private static int nextId = 1;
    private List<Sneaker> inventory = new ArrayList<>();

    public Sneaker create(String name, String brand, String sport, float size, int quantity, float price) {

        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, quantity, price);
        createdSneaker.setSize(size);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

    public Sneaker findSneaker(int id) {
        for (Sneaker s: inventory){
            if (s.getId() == id) return s;
        }
        return null;
    }

    public Sneaker[] findAll() {
        return inventory.toArray(new Sneaker[inventory.size()]);
    }

    public boolean delete(int id) {
        for (Sneaker s: inventory){
            if (s.getId() == id){
                inventory.remove(s);
                return true;
            }
        }
        return false;
    }
}
