import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Board extends JPanel implements ActionListener {

    private Timer timer;
    private Map m;
    private Player p;
    private Cat c;
    static public int i=1;


    public Board(){

        m=new Map();
        p=new Player();
        c = new Cat();

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                int keycode=e.getKeyCode();

                if(keycode==KeyEvent.VK_UP){
                    if(!m.getMap(p.gettX(),p.gettY()-1).equals("w"))
                        p.move(0,-1);
                }
                if(keycode==KeyEvent.VK_DOWN){
                    if(!m.getMap(p.gettX(),p.gettY()+1).equals("w"))
                        p.move(0,+1);
                }
                if(keycode==KeyEvent.VK_LEFT){
                    if(!m.getMap(p.gettX()-1,p.gettY()).equals("w"))
                        p.move(-1,0);
                }
                if(keycode==KeyEvent.VK_RIGHT){
                    if(!m.getMap(p.gettX()+1,p.gettY()).equals("w"))
                        p.move(1,0);
                }
                if(p.gettX()==11 && p.gettY()==13){
                    int action = JOptionPane.showConfirmDialog(null,"WOOOOOW Filisitation Vous Avez Gangne !!!!!!","Vous voulez Rejoue?",JOptionPane.YES_NO_OPTION);
                    if(action==0){
                        p.settX(1);
                        p.settY(1);
                    }
                    else JOptionPane.showMessageDialog(null,"By By ");
                }

            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
            @Override
            public void keyTyped(KeyEvent e) {
            }
        });

        setFocusable(true);
        timer = new Timer(500,this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(c.getx()==1){
            c.setx(13);
        }
        c.setx(c.getx()-1);
        if(c.getx()==p.gettX()){
            //JOptionPane.showMessageDialog(null, ");
        }
        repaint();
        System.out.println(c.getx());
    }

    public void paint(Graphics g ){

        super.paint(g);

        for(int y=0;y<14;y++){
            for(int x=0;x<14;x++){
                if(m.getMap(x, y).equals("g")){
                    g.drawImage(m.getgrass(), x*32, y*32,null);
                }
                if(m.getMap(x, y).equals("w")){
                    g.drawImage(m.getwall(), x*32, y*32,null);
                }
            }
        }

        g.drawImage(p.getpleyer(),p.gettX()*32,p.gettY()*32,null);
        g.drawImage(m.getfromage(), 11*32, 13*32,null);
        g.drawImage(c.getCat(), c.getx()*32, c.gety()*32,null);

    }

}
