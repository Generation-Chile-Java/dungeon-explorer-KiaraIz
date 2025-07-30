package game;

public class Treasure implements GameObject {
    @Override
    public void interact(Player player) {
        System.out.println("¡Encontraste un tesoro!");
        player.addToInventory(this);
    }

    @Override
    public String toString() {
        return "Tesoro";
    }
}
