import java.awt.Image;

import javax.swing.ImageIcon;

public class Cat extends Thread  {
    private int x,y;
    private Image m ;


    public Cat(){

        ImageIcon img = new ImageIcon("src/test/chat.png");
        m=img.getImage();
        x=12;
        y=1;
    }

    public Image getCat(){
        return m;
    }

    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public void  setx(int x){
        this.x =x;
    }
    public void sety(int y){
        this.y=y;
    }


}
