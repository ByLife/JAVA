import chess.Game;
import chess.Interfaces;
import chess.player.Player;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.init();
        Player pl = new Player("Hello", Interfaces.Color.BLACK);
        System.out.println(pl.getColor());
    }
}
