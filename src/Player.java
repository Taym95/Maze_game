import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
    private int tilex,tiley;
    private Image m ;

    public Player(){

        ImageIcon img = new ImageIcon("src/test//240839.png");
        m=img.getImage();

        tilex=1;
        tiley=1;
    }
    public Image getpleyer(){
        return m;
    }

    public int gettX(){
        return tilex;
    }
    public int gettY(){
        return tiley;
    }
    public void  settX(int x){
        tilex =x;
    }
    public void settY(int y){
        tiley=y;
    }
    public void move(int dx,int dy){
        tilex+=dx;
        tiley+=dy;
    }
}
