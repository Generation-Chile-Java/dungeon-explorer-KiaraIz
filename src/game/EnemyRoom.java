package game;

public class EnemyRoom implements Room {
    private Enemy enemy = new Enemy(20); // Puedes variar el daño

    @Override
    public void enter(Player player) {
        System.out.println("Entraste a una sala con un enemigo.");
        enemy.attack(player);
    }
}
