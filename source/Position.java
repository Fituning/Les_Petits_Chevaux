package LudoGame.source;

public class Position {
    private int x;
    private int y;

    Position(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void up(){
        this.y--;
    }

    public void down(){
        this.y++;
    }

    public void right(){
        this.x++;
    }

    public void left(){
        this.x--;
    }

}

