package game;

public class TreasureRoom implements Room {
    private Treasure treasure = new Treasure();

    @Override
    public void enter(Player player) {
        System.out.println("Entraste a una sala con un tesoro.");
        treasure.interact(player);
    }
}
