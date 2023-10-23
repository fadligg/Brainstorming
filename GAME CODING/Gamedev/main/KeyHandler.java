package Gamedev.main;

import java.awt.event.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
    GamePanel gp;
    public boolean Upressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {
    
    }
    public KeyHandler(GamePanel gp){
        this.gp = gp;

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP ) {
            Upressed = true;
        }
        if (code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT ) {
            leftPressed = true;
        }
        if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN ) {
            downPressed = true;
        }
        if (code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT ) {
            rightPressed = true;
        }
        if (code == KeyEvent.VK_TAB) {
            if(gp.gameState == gp.playState){
                gp.gameState = gp.pauseState;
            }else if(gp.gameState == gp.pauseState){
                gp.gameState = gp.playState;
            }
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP ) {
            Upressed = false;
        }
        if (code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT ) {
            leftPressed = false;
        }
        if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN ) {
            downPressed = false;
        }
        if (code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT ) {
            rightPressed = false;
        }
        
    }
    
    
}
