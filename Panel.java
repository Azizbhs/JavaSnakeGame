import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;



public class Panel extends JPanel implements ActionListener{
    
    static final int screen_width = 600;
    static final int screen_height = 600;
    static final int unit_size = 25;
    static final int game_units = (screen_width*screen_height)/unit_size;
    static final int delay = 75;
    final int x[] = new int[game_units];
    final int y[] = new int[game_units];
    int bodyparts = 6;
    int applesEaten;
    int applex;
    int appley;
    char direction = 'R';
    boolean run = false;
    Timer timer;
    Random random;

    Panel(){
        random = new Random();
        this.setPreferredSize(new Dimension(screen_width,screen_height));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
    
     public void startGame(){

    }

    public void paintComponent(Graphics g){

    }
    public void draw(Graphics g){

    }

    public void newApple(){
        
    }
    
    public void move(){

    }

    public void checkApple(){

    }
    
    public void checkCollisions(){

    }

    public void gameOver(Graphics g){

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    }
        
    public class MyKeyAdapter extends KeyAdapter{
         @Override
         public void keyPressed(KeyEvent e){
            
         }
    }


}
