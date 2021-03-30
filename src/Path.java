package Les_Petits_Chevaux.src;

import java.awt.*;
import java.lang.reflect.Array;

public class Path {
    private Square[] squareArray = new Square[56];
    private int pathPosition;
    private Color pathColor;
    private boolean inPist;
    

    public Path(Color pathColor) {
        this.pathPosition =0;
        this.pathColor = pathColor;
        this.inPist = False;
    }

    public int getPathPosition() {
        return this.pathPosition;
    }

    public void setPathPosition(int pathPosition) {
        this.pathPosition = pathPosition;
    }

}