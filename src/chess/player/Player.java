package chess.player;

import chess.Interfaces;

public class Player {
    private String _name;
    private  Interfaces.Color _color;
    public Player(String name, Interfaces.Color color){
        _name = name;
        _color = color;
    }

    public Interfaces.Color getColor() {
        return _color;
    }
    public String getName() { return _name; }

    public void setColor(Interfaces.Color _color) { this._color = _color; }
}
