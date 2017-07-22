package restaurant_5;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class calculator {

	private JFrame obj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.obj.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		obj = new JFrame();
		obj.setBounds(100, 100, 450, 324);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				JPanel panel = new JPanel();
				panel.setBorder(new LineBorder(new Color(0,0,0), 2));
				panel.setBounds(10, 10, 420, 500);
				obj.getContentPane().add(panel);
				panel.setLayout(null);

				JLabel l1=new JLabel("Enter first number");
				l1.setBounds(12,20,150,20);
				panel.add(l1);

				JLabel l2=new JLabel("Enter second number");
				l2.setBounds(12,70,150,20);
				panel.add(l2);

				JLabel l3=new JLabel("Total");
				l3.setBounds(12,120,150,20);
				panel.add(l3);
		        
				

				JTextField t1=new JTextField();
				t1.setBounds(12,40, 100, 20);
				t1.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
				t1.setColumns(10);
				t1.setVisible(true);
				
				panel.add(t1);
			    
				 
				JTextField t2=new JTextField();
				t2.setBounds(12,90, 100, 20);
				t2.setBorder(new LineBorder(new Color(0,0,0), 2));
				t2.setColumns(10);
				t2.setVisible(true);
				
				panel.add(t2);
				
				JLabel l4=new JLabel();
				 l4.setBounds(12,140,150,20);
			     panel.add(l4);
				    
				
				JButton b=new JButton("+");
			    b.setBounds(12, 171, 50,20 );
			    b.setFont(new Font("Tahoma", Font.PLAIN, 20));
			    b.setVisible(true);
			    panel.add(b);
			    b.addActionListener(new ActionListener()
			    		{

							@Override
							public void actionPerformed(ActionEvent arg0) {
								String s=t1.getText();
								float s1=Float.parseFloat(s);
								String s2=t2.getText();
								float s3=Float.parseFloat(s2);
								float s4=s1+s3;
								l4.setText(String.valueOf(s4));
							}
			    	         
			           });
			   
			 
				
				   JButton b1=new JButton("-");
				    b1.setBounds(72, 171, 50,20 );
				    b1.setFont(new Font("Tahoma", Font.PLAIN, 40));
				    b1.setVisible(true);
				    panel.add(b1);
				    b1.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									String s=t1.getText();
									float s1=Float.parseFloat(s);
									String s2=t2.getText();
									float s3=Float.parseFloat(s2);
									float s4=s1-s3;
									l4.setText(String.valueOf(s4));
								}
				    	         
				           });
				    JButton b2=new JButton("*");
				    b2.setBounds(132, 170, 50,20 );
				    b2.setFont(new Font("Tahoma", Font.PLAIN, 30));
				    b2.setVisible(true);
				    panel.add(b2);
				    b2.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									String s=t1.getText();
									float s1=Float.parseFloat(s);
									String s2=t2.getText();
									float s3=Float.parseFloat(s2);
									float s4=s1*s3;
									l4.setText(String.valueOf(s4));
								}
				    	         
				           });
				    
				    JButton b3=new JButton("/");
				    b3.setBounds(192, 170, 50,20 );
				    b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b3.setVisible(true);
				    panel.add(b3);
				    b3.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									String s=t1.getText();
									float s1=Float.parseFloat(s);
									String s2=t2.getText();
									float s3=Float.parseFloat(s2);
									float s4=s1/s3;
									l4.setText(String.valueOf(s4));
								}
				    	         
				           });
				    JButton b5=new JButton("1");
				    b5.setBounds(12, 190, 50,20 );
				    b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b5.setVisible(true);
				    panel.add(b5);
				    b5.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									t1.setText(t1.getText().concat("1"));
							} });
				   
				    JButton b6=new JButton("2");
				    b6.setBounds(72, 190, 50,20 );
				    b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b6.setVisible(true);
				    panel.add(b6);
				    b6.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									t1.setText(t1.getText().concat("2"));
							} });
				    JButton b7=new JButton("3");
				    b7.setBounds(132, 190, 50,20 );
				    b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b7.setVisible(true);
				    panel.add(b7);
				    b7.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									t1.setText(t1.getText().concat("3"));
							} });
				    JButton b8=new JButton("4");
				    b8.setBounds(12, 210, 50,20 );
				    b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b8.setVisible(true);
				    panel.add(b8);
				    b8.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									t1.setText(t1.getText().concat("4"));
							} });
				    JButton b9=new JButton("5");
				    b9.setBounds(72, 210, 50,20 );
				    b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b9.setVisible(true);
				    panel.add(b9);
				    b9.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									t1.setText(t1.getText().concat("5"));
							} });
				    JButton b10=new JButton("6");
				    b10.setBounds(132, 210, 50,20 );
				    b10.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b10.setVisible(true);
				    panel.add(b10);
				    b10.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									t1.setText(t1.getText().concat("6"));
							} });
				    JButton b11=new JButton("7");
				    b11.setBounds(12, 230, 50,20 );
				    b11.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b11.setVisible(true);
				    panel.add(b11);
				    b11.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									t1.setText(t1.getText().concat("7"));
							} });
				    JButton b12=new JButton("8");
				    b12.setBounds(72, 230, 50,20 );
				    b12.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b12.setVisible(true);
				    panel.add(b12);
				    b12.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									t1.setText(t1.getText().concat("8"));
							} });
				    
				    JButton b13=new JButton("9");
				    b13.setBounds(132, 230, 50,20 );
				    b13.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b13.setVisible(true);
				    panel.add(b13);
				    b13.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									t1.setText(t1.getText().concat("9"));
							} });
				    JButton b14=new JButton("0");
				    b14.setBounds(72, 250, 50,20 );
				    b14.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b14.setVisible(true);
				    panel.add(b14);
				    b14.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									
									
									t1.setText(t1.getText().concat("0"));
									
									
									
										t2.setText(t2.getText().concat("0"));
									
									
							} });
				    JButton b15=new JButton("CLR");
				    b15.setBounds(132, 250, 70,20 );
				    b15.setFont(new Font("Times New Roman", Font.PLAIN, 15));
				    b15.setVisible(true);
				    panel.add(b15);
				    b15.addActionListener(new ActionListener()
				    		{
				    	public void actionPerformed(ActionEvent arg0) {
								t1.setText(null);
								t2.setText(null);
								l4.setText(null);
								
							} });
				    JButton b16=new JButton(".");
				    b16.setBounds(12,250, 50,20 );
         		    b16.setFont(new Font("Tahoma", Font.PLAIN, 20));
				    b16.setVisible(true);
				    panel.add(b16);
				    b16.addActionListener(new ActionListener()
				    		{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									t1.setText(t1.getText().concat("."));
							} });
				}
		

	}


