package game;

import java.util.Scanner;

public class DungeonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre del jugador
        System.out.print("Ingresa tu nombre: ");
        String playerName = scanner.nextLine();

        // Crear jugador con nombre personalizado
        Player player = new Player(playerName, 100);

        // Crear mazmorra
        Room[] dungeon = {
                new EmptyRoom(),
                new TreasureRoom(),
                new EnemyRoom(),
                new EmptyRoom(),
                new TreasureRoom()
        };

        // Bucle de juego
        for (int i = 0; i < dungeon.length && player.isAlive(); i++) {
            System.out.println("\n--- Sala " + (i + 1) + " ---");
            dungeon[i].enter(player);
            player.showStatus();

            if (i < dungeon.length - 1) {
                System.out.println("Presiona Enter para continuar...");
                scanner.nextLine();
            }
        }

        // Fin del juego
        if (player.isAlive()) {
            System.out.println("\n¡Felicidades, " + playerName + "! Has explorado toda la mazmorra.");
        } else {
            System.out.println("\nHas muerto en la mazmorra, " + playerName + "...");
        }

        scanner.close();
    }
}
