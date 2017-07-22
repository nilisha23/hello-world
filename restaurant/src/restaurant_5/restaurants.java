package restaurant_5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class restaurants {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					restaurants window = new restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0,1368,698);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 74, 607, 249);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mac aloo tikki burger");
		lblNewLabel_1.setBounds(45, 35, 219, 30);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel_1);
		
		JLabel lblSuryaDosa = new JLabel("Surya dosa");
		lblSuryaDosa.setBounds(45, 86, 183, 19);
		lblSuryaDosa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblSuryaDosa);
		
		JLabel lblHoneyChilliPotato = new JLabel("Honey chilli potato");
		lblHoneyChilliPotato.setBounds(45, 118, 203, 19);
		lblHoneyChilliPotato.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblHoneyChilliPotato);
		
		textField = new JTextField();
		textField.setBounds(362, 36, 183, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(362, 75, 183, 30);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(362, 116, 183, 30);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setBounds(55, 167, 121, 25);
		lblDrinks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblDrinks);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(362, 157, 77, 29);
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblQty);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(45, 190, 131, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Mirinda Shake", "Badaam Shake", "Pineapple Shake", "Virgin Mojito", "Tea Coffee", "Cold Coffee", "Cold Coffee with ice cream and choco chips"}));
		panel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(362, 185, 183, 30);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JCheckBox chckbxHomeDelivery = new JCheckBox("Home Delivery");
		chckbxHomeDelivery.setBounds(45, 208, 111, 32);
		panel.add(chckbxHomeDelivery);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tax");
		chckbxNewCheckBox.setBounds(278, 215, 161, 18);
		panel.add(chckbxNewCheckBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(45, 157, 500, 6);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(627, 74, 373, 249);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select one", "India ", "China", "Afghanistan", "Nepal", "America", "Britain"}));
		comboBox_1.setBounds(96, 22, 150, 30);
		panel_1.add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(88, 72, 183, 30);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(88, 132, 183, 30);
		panel_1.add(textField_5);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setBounds(22, 184, 116, 37);
		panel_1.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(203, 184, 116, 37);
		panel_1.add(btnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(10, 336, 607, 188);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("Cost of drinks");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(28, 27, 219, 30);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("Cost of meal");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(28, 78, 183, 19);
		panel_2.add(label_1);
		
		JLabel lblSuryaDosa_1 = new JLabel("Cost of delivery");
		lblSuryaDosa_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSuryaDosa_1.setBounds(28, 134, 183, 19);
		panel_2.add(lblSuryaDosa_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(364, 78, 202, 30);
		panel_2.add(lblNewLabel_3);
		
		JLabel label_2 = new JLabel("");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_2.setBounds(364, 27, 202, 30);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_3.setBounds(364, 123, 202, 30);
		panel_2.add(label_3);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(627, 334, 373, 190);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_4 = new JLabel("Tax");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(22, 30, 165, 30);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("Subtotal");
		label_5.setBounds(22, 82, 121, 25);
		panel_3.add(label_5);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel label_6 = new JLabel("Total");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_6.setBounds(22, 126, 219, 30);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_7.setBounds(190, 30, 165, 30);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_8.setBounds(190, 82, 165, 33);
		panel_3.add(label_8);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel label_9 = new JLabel("");
		label_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_9.setBounds(190, 136, 165, 30);
		panel_3.add(label_9);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(1010, 74, 332, 450);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 42, 312, 397);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Reciept", null, panel_6, null);
		panel_6.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 11, 287, 347);
		panel_6.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);

		JLabel l1=new JLabel("Enter first number");
		l1.setBounds(12,20,150,20);
		panel_7.add(l1);

		JLabel l2=new JLabel("Enter second number");
		l2.setBounds(12,70,150,20);
		panel_7.add(l2);

		JLabel l3=new JLabel("Total");
		l3.setBounds(12,120,150,20);
		panel_7.add(l3);
        
		

		JTextField t1=new JTextField();
		t1.setBounds(12,40, 100, 20);
		t1.setBorder((Border) new LineBorder(new Color(0,0,0), 2));
		t1.setColumns(10);
		t1.setVisible(true);
		
		panel_7.add(t1);
	    
		 
		JTextField t2=new JTextField();
		t2.setBounds(12,90, 100, 20);
		t2.setBorder(new LineBorder(new Color(0,0,0), 2));
		t2.setColumns(10);
		t2.setVisible(true);
		
		panel_7.add(t2);
		
		JLabel l4=new JLabel();
		 l4.setBounds(12,140,150,20);
		 panel_7.add(l4);
		    
		
		JButton b=new JButton("+");
	    b.setBounds(12, 171, 50,20 );
	    b.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    b.setVisible(true);
	    panel_7.add(b);
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
		    panel_7.add(b1);
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
		    panel_7.add(b2);
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
		    panel_7.add(b3);
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
		    panel_7.add(b5);
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
		    panel_7.add(b6);
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
		    panel_7.add(b7);
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
		    panel_7.add(b8);
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
		    panel_7.add(b9);
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
		    panel_7.add(b10);
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
		    panel_7.add(b11);
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
		    panel_7.add(b12);
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
		    panel_7.add(b13);
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
		    panel_7.add(b14);
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
		    panel_7.add(b15);
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
		    panel_7.add(b16);
		    b16.addActionListener(new ActionListener()
		    		{

						@Override
						public void actionPerformed(ActionEvent arg0) {
							t1.setText(t1.getText().concat("."));
					} });
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(10, 535, 1332, 113);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnReciept = new JButton("Reciept");
		btnReciept.setBounds(547, 39, 116, 37);
		panel_5.add(btnReciept);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_5.setText(null);
				textField_4.setText(null);
				comboBox.setSelectedItem(null);
				comboBox_1.setSelectedItem(null);
				label_2.setText(null);
				label_6.setText(null);
				label_7.setText(null);
				label_8.setText(null);
				lblNewLabel_3.setText(null);
				label_3.setText(null);
				 
				
				
				
			}
		});
		btnReset.setBounds(722, 39, 116, 37);
		panel_5.add(btnReset);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.setBounds(922, 39, 116, 37);
		panel_5.add(jbtnExit);
		jbtnExit.addActionListener(new ActionListener()
				{
			     @Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 System.exit(0);
				}

				});
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double MacAlooBurger = Double.parseDouble(lblNewLabel_1.getText());
				double imac=2.39;
				double Burger;
				Burger=(MacAlooBurger* imac);
				String pBurger=String.format("%.2f", Burger);
				lblNewLabel_3.setText(pBurger);
				
				double surya_dosa = Double.parseDouble(lblSuryaDosa.getText());
				double isurya=4.39;
				double suryab;
				suryab=(surya_dosa* isurya);
				String psurya=String.format("%.2f", pBurger+suryab);
				lblNewLabel_3.setText(psurya);
				
				double HoneyChilli = Double.parseDouble(lblHoneyChilliPotato.getText());
				double ihoney=3.39;
				double honey;
				honey=(HoneyChilli* ihoney);
				String phoney=String.format("%.2f", pBurger+suryab+honey);
				lblNewLabel_3.setText(phoney);
			}
		});
		btnTotal.setBounds(369, 39, 116, 37);
		panel_5.add(btnTotal);
		
		JLabel lblNewLabel = new JLabel("Restaurant management system");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 52));
		lblNewLabel.setBounds(224, 0, 882, 52);
		frame.getContentPane().add(lblNewLabel);
	}
}
