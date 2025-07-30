package game;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private List<GameObject> inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public void receiveDamage(int amount) {
        health -= amount;
        System.out.println(name + " recibió " + amount + " de daño. Salud actual: " + health);
    }

    public void addToInventory(GameObject item) {
        inventory.add(item);
        System.out.println(name + " recogió un objeto.");
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void showStatus() {
        System.out.println("\nJugador: " + name);
        System.out.println("Salud: " + health);
        System.out.println("Inventario: " + inventory.size() + " objetos");
    }
}
