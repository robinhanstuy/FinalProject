import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.event.KeyEvent;
  public class KeyboardEvents implements KeyListener {
      public String direction;
      public String lastDirection;
      public boolean pause;
      public KeyboardEvents(){
	  direction = "RIGHT";
      }
      public void keyTyped(KeyEvent e) {
      }
      public static void tick(){

      }
      public void keyPressed(KeyEvent e) {
	  if (KeyEvent.getKeyText(e.getKeyCode()) == "Space"){
	      if (pause){
		  pause = false;
	      }
	      else{
		  pause = true;
	      }
	  }
	  else if (KeyEvent.getKeyText(e.getKeyCode()).equals("W") && !direction.equals("DOWN") ){
	      direction = "UP";
	      
	  }
	  else if (KeyEvent.getKeyText(e.getKeyCode()).equals("A")&& !direction.equals("RIGHT")){
	      direction = "LEFT";
	  }
	  else if (KeyEvent.getKeyText(e.getKeyCode()).equals("S")&& !direction.equals("UP")){
	      direction = "DOWN";
	  }
  	else if (KeyEvent.getKeyText(e.getKeyCode()).equals("D") && !direction.equals("LEFT")){
	    direction = "RIGHT";
  	}
      }
      public void keyReleased(KeyEvent e) {
      }
  }
