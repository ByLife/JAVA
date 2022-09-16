package chess.board;

import chess.Interfaces;
import princeton.StdDraw;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board {
    //List<StdDraw> Images = new ArrayList<StdDraw>();
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int SCREEN_X = (int)screenSize.getWidth()-100;
    private final int SCREEN_Y = (int)screenSize.getHeight()-100;

    public Board(){
        StdDraw.setCanvasSize(this.SCREEN_X, this.SCREEN_Y);
    }
    public void initBoard(){
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
        for (int Y_POS = 0; Y_POS < 8; Y_POS++) {
            for (int X_POS = 0; X_POS < 8; X_POS++) {
                StdDraw.rectangle((double) (X_POS * SCREEN_X / 8) / SCREEN_X, ((double) (Y_POS * SCREEN_Y / 8) / SCREEN_Y), (double) SCREEN_X / 8, (double) SCREEN_Y / 8);
                System.out.println("GENERATED RECTANGLE (X:" + (double) (X_POS * SCREEN_X / 8) / SCREEN_X + ", Y:" + ((double) (Y_POS * SCREEN_Y / 8) / SCREEN_Y) +  " WIDTH:" +  (double) SCREEN_X / 8 + " HEIGHT:" + (double) SCREEN_Y / 8 + ")");
            }
        }
    }
}
