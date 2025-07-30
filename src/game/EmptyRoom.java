package game;

public class EmptyRoom implements Room {
    @Override
    public void enter(Player player) {
        System.out.println("Entraste a una sala vacía.");
    }
}
