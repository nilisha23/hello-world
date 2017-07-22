package brick_b;

import javax.swing.JFrame;

public class bricks {
 public static void main(String args[]){
	 JFrame obj= new JFrame();
	 Gameplay gamePlay= new Gameplay();
	 obj.setTitle("brick breaker");
	 obj.setBounds(10,10,700,600);
	 obj.setVisible(true);
	 obj.setResizable(false);
	 obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     obj.add(gamePlay);	 
 }
 
}
