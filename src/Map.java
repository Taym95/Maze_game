import java.awt.Image;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Map {

    private Scanner S;
    private Image grass ,wall,fromage,cat;

    private String Map[]=new String[14];

    public Map(){
        ImageIcon img = new ImageIcon("src/test/grass_tile_by_wigglestick-d37qaa3.png");
        grass=img.getImage();

        img = new ImageIcon("src/test/wall_red.png");
        wall=img.getImage();

        img = new ImageIcon("src/test/images.png");
        fromage=img.getImage();

        img = new ImageIcon("src/test/chat.png");
        cat=img.getImage();

        openFile();
        readFile();
        CloseFile();

    }

    public Image getgrass(){

        return grass;
    }
    public Image getfromage(){

        return fromage;
    }
    public Image getwall(){

        return wall;
    }
    public Image getcat(){

        return cat;
    }
    public String getMap(int x,int y){
        String index = Map[y].substring(x, x+1);

        return index;
    }
    public void openFile() {

        try {
            S = new Scanner(new File("src/test/Map.txt"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void readFile() {
        while(S.hasNext()){
            for(int i=0;i<14;i++){
                Map[i]=S.next();
            }
        }

    }

    public void CloseFile() {
        S.close();

    }
}
