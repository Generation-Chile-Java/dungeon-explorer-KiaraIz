package game;

public class Enemy {
    private int damage;

    public Enemy(int damage) {
        this.damage = damage;
    }

    public void attack(Player player) {
        System.out.println("¡Un enemigo te ataca!");
        player.receiveDamage(damage);
    }
}
