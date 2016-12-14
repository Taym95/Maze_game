import javax.swing.*;

public class Maze {
    Player p = new Player();
    public static void main(String[] args) {

        new Maze();

    }
    public Maze(){
        JFrame f = new JFrame();
        f.setTitle("Maze");
        f.add(new Board());
        f.setSize(460,488);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
