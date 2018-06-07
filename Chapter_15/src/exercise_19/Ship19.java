package exercise_19;

import exercise_18.Generators;
import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/6/7 0007
 * Description:
 */
class Item {
    private static int counter = 0;
    private final int id  = counter++;
    private String description;
    private double price;
    private String destination;

    public Item(String description, double price, String destination) {
        this.description = description;
        this.price = price;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public void priceChange(double change) {
        price += change;
    }

    public static Generator<Item> generator = new Generator<Item>() {
        private Random random = new Random();

        @Override
        public Item next() {
            return new Item("Test", Math.round(random.nextDouble() * 1000), "...");
        }
    };
}

class Shelf extends ArrayList<Item> {
    public Shelf(int numItem) {
        Generators.fill(this, Item.generator, numItem);
    }
}

class StorageArea extends ArrayList<Shelf> {
    public StorageArea(int numShelf, int numItem) {
        for (int i = 0; i < numShelf; i++) {
            add(new Shelf(numItem));
        }
    }
}

class Deck extends ArrayList<StorageArea> {
    public Deck(int numStorageArea, int numShelf, int numItem) {
        for (int i = 0; i < numStorageArea; i++) {
            add(new StorageArea(numShelf, numItem));
        }
    }
}

class Office {

}

public class Ship19 extends ArrayList<Deck> {
    private Office office;

    public Ship19(int numDeck, int numStorageArea, int numShelf, int numItem) {
        for (int i = 0; i < numDeck; i++) {
            add(new Deck(numStorageArea, numShelf, numItem));
        }
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Deck d : this)
            for(StorageArea sa : d)
                for(Shelf s : sa)
                    for(Item i : s) {
                        result.append(i);
                        result.append('\n');
                    }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(new Ship19(3, 4, 3, 10));
    }

}