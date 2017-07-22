package brick_b;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener,ActionListener{
     private boolean play= false;
     private int score=0;
     private int totalbricks=32;
     private Timer time;
     private int delay=8;
     private int sliderX= 310;
     private int ballX= 180;
     private int ballY= 250;
     private int ballXDirec= -1;
     private int ballYDirec= -2;
     public MapGenerator map;
     public Gameplay()
     {   addKeyListener(this);
    	 setFocusable(true);
    	 setFocusTraversalKeysEnabled(false);
    	 time= new Timer(delay, this);
    	 time.start();
    	 map=new MapGenerator(4,8);
    	 
     } 
     public void paint(Graphics g)
     {
    	 //background
    	 g.setColor(Color.black);
    	 g.fillRect(1,1,692,592);
    	//bricks
    	 map.draw((Graphics2D)g);
    	 //score
     	 g.setColor(Color.red);
     	 g.setFont(new Font("serif",Font.BOLD, 25));
     	 g.drawString(""+score, 590, 30);
     	if(totalbricks<=0)
   	 {  play=false;
   	   ballXDirec=0;
   	   ballYDirec=0;
   	   g.setColor(Color.red);
   	   g.setFont(new Font("serif",Font.BOLD, 30));
   	   g.drawString("you win:",190,300);
   	   g.setFont(new Font("serif",Font.BOLD, 20));
       g.drawString("press enter to restart",230,350);   		 
   	 }
   	 
     	 
     	 if(ballY>570)
    	 {  play=false;
    	   ballXDirec=0;
    	   ballYDirec=0;
    	   g.setColor(Color.red);
    	   g.setFont(new Font("serif",Font.BOLD, 30));
    	   g.drawString("game over, scores:",190,300);
    	   g.setFont(new Font("serif",Font.BOLD, 20));
     	   g.drawString("press enter to restart",230,350);   		 
    	 }
    	 
    	 
    	 //borders
    	 g.setColor(Color.yellow);
    	 g.fillRect(0,0, 3, 592);
    	 g.fillRect(0,0, 692, 3);
     	 g.fillRect(691,0, 3, 592);
         
     	 //paddle
     	 g.setColor(Color.green);
     	 g.fillRect(sliderX, 550, 100,8);
     	 
     	 //ball
     	 g.setColor(Color.red);
     	 g.fillOval(ballX, ballY, 20, 20);
     	 
     	 
     	 g.dispose();
     	 
     	
     	 
     	 
     	 
     	
    	 
     }
     
	
     
     
     
     
     @Override
	public void actionPerformed(ActionEvent e) {
		time.start();
		if(play)
		{  if(new Rectangle(ballX, ballY, 20, 20).intersects(new Rectangle(sliderX, 550, 100,8)))
		  {
			ballYDirec= -ballYDirec;
		  }
	   A: for(int i=0;i<map.map.length;i++)
		  {
			  for(int j=0;j<map.map[0].length;j++)
			  {
				  if(map.map[i][j]>0)
				  { int brickX=j*map.brickWidth+ 80;
				     int brickY=i*map.brickHeight+50;
				     int brickHeight=map.brickHeight;
				     int brickWidth=map.brickWidth;
				     Rectangle brickRect=new Rectangle(brickX,brickY,brickWidth,brickHeight);
				     Rectangle ballRect=new Rectangle(ballX,ballY,20,20);
				     if(ballRect.intersects(brickRect))
				     {  map.setBrickValue(0, i, j);
				       totalbricks--;
				       score+=5;
				       if(ballX+19<=brickRect.x || ballX+1>=brickRect.x + brickRect.width)
				    		   {
				    	         ballXDirec=-ballXDirec;
				    	         
				    		   }
				       else{
				    	   ballYDirec= -ballYDirec;
				       }
				       break A;
				     }
				     
					  
				  }
			  }
		  }
			ballX += ballXDirec;
			ballY += ballYDirec;
			if(ballX<0)
			{
				ballXDirec = -ballXDirec;
			}
			if(ballY<0)
			{
				ballYDirec = -ballYDirec;
			}
			if(ballX> 670)
			{
				ballXDirec= -ballXDirec;
			}
		}
		repaint();
}
     @Override
 	public void keyReleased(KeyEvent e) {}

 	@Override
 	public void keyTyped(KeyEvent e) {}
 	 

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_RIGHT)
		{
			if(sliderX>=600)
			{
				sliderX=600;
			}
			else
			{
				moveRight();
				
			}
		}
		if(e.getKeyCode()== KeyEvent.VK_LEFT)
		{
			if(sliderX<10)
			{
				sliderX=10;
			}
			else
			{
				moveLeft();
			}
		}
		if(e.getKeyCode()== KeyEvent.VK_ENTER)
		{
			if(!play)
			{
				play=true;
				ballX=120;		
			    ballY=350;
			   ballXDirec= -1;
			   ballYDirec= -2;
			   sliderX= 310;
			   score=0;
			   totalbricks=32;
			   map=new MapGenerator(4,8);
               repaint();			   
			}
		}
		
		
	}
	public void moveRight()
	   {
		   play=true;
		   
		   sliderX+=20;
		   
	   }
	
   public void moveLeft()
   {
	   play= true;
	   sliderX -= 20;
   }
   
}
