package Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;


import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.SQLException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
//import javax.swing.JList;

import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;


//import java.sql.*;
public class Restaurant {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
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
	public Restaurant() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 50));
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1500, 15);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBorder(new LineBorder(Color.BLUE, 2));
		panel_1.setBounds(199, 139, 451, 255);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken fillet rice");
		lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChickenBurger.setBounds(24, 27, 136, 25);
		panel_1.add(lblChickenBurger);
		
		JLabel label = new JLabel("French fries");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(24, 63, 136, 25);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Chicken wing");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(24, 101, 101, 25);
		panel_1.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(232, 27, 128, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(232, 63, 128, 20);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(232, 97, 128, 20);
		panel_1.add(textField_2);
		
		JLabel label_7 = new JLabel("Drink");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(24, 137, 101, 25);
		panel_1.add(label_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Tea", "Cola", "Orange"}));
		comboBox.setBounds(24, 162, 128, 20);
		panel_1.add(comboBox);
		
		JLabel label_8 = new JLabel("Qty");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(232, 139, 101, 20);
		panel_1.add(label_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(232, 162, 128, 20);
		panel_1.add(textField_9);
		
		JCheckBox Tax = new JCheckBox("Tax");
		Tax.setBackground(Color.LIGHT_GRAY);
		Tax.setBounds(23, 213, 55, 23);
		panel_1.add(Tax);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 132, 379, 4);
		panel_1.add(separator);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBorder(new LineBorder(Color.BLUE, 2));
		panel_2.setBounds(660, 139, 307, 255);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Item                          Price", "Meal", "Chicken fillet rice      1000 ", "", "French fries              2000", "", "Chicken wing            3000", "", "Drinks", "Tea                           700", "", "Orange                     500", "", "Cola                          400"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(32, 45, 249, 199);
		panel_2.add(list);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMenu.setBounds(32, 20, 91, 14);
		panel_2.add(lblMenu);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBorder(new LineBorder(Color.BLUE, 2));
		panel_3.setBounds(199, 405, 451, 173);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_2 = new JLabel("Cost of Drinks");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(23, 26, 101, 25);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("Cost of Meal");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(23, 62, 101, 25);
		panel_3.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(189, 26, 128, 20);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField(0);
		textField_4.setColumns(10);
		textField_4.setBounds(189, 62, 128, 20);
		panel_3.add(textField_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBorder(new LineBorder(Color.BLUE, 2));
		panel_4.setBounds(660, 405, 307, 173);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(88, 32, 128, 20);
		panel_4.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(88, 76, 128, 20);
		panel_4.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(88, 118, 128, 20);
		panel_4.add(textField_8);
		
		JLabel lblNewLabel_1 = new JLabel("Tax");
		lblNewLabel_1.setBounds(32, 35, 46, 14);
		panel_4.add(lblNewLabel_1);
		
		JLabel label_5 = new JLabel("Sub Total");
		label_5.setBounds(22, 79, 56, 14);
		panel_4.add(label_5);
		
		JLabel label_6 = new JLabel("Total");
		label_6.setBounds(32, 121, 46, 14);
		panel_4.add(label_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBorder(new LineBorder(Color.BLUE, 2));
		panel_5.setBounds(977, 288, 254, 353);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 36, 234, 306);
		panel_5.add(textArea);
		
		JLabel lblReceipt = new JLabel("Receipt");
		lblReceipt.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblReceipt.setBounds(10, 11, 81, 14);
		panel_5.add(lblReceipt);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBorder(new LineBorder(Color.BLUE, 2, true));
		panel_6.setBounds(197, 589, 770, 52);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Total");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				double ChicBurger = Double.parseDouble(textField.getText());
				double iChicBurger = 1000;
				double Burger;
				Burger = (ChicBurger * iChicBurger);
				String pMeal = String.format("%.2f",Burger);
				textField_4.setText(pMeal);
				
				double ChicBurgerMeal = Double.parseDouble(	textField_1.getText());
				double iChicBurgerMeal = 2000;
				double BurgerMeal;
				BurgerMeal = (ChicBurgerMeal * iChicBurgerMeal);
				String cbMeal = String.format("%.2f",BurgerMeal+Burger);
				textField_4.setText(cbMeal);
				
				double CheeseBurger = Double.parseDouble(textField_2.getText());
				double CheeseBurgerPrice = 3000;
				double CheeseBurgerMeal;
				CheeseBurgerMeal = (CheeseBurger * CheeseBurgerPrice);
				String cheese = String.format("%.2f",CheeseBurgerMeal+BurgerMeal+Burger);
				textField_4.setText(cheese);
				
				double Drinks= Double.parseDouble(textField_9.getText());
				double Tea=700*Drinks;
				double Orange=500*Drinks;
				double Cola=400*Drinks;
				
				if(comboBox.getSelectedItem().equals("Tea")) 
				{
					String cTea=String.format("%.2f",Tea);
					textField_3.setText(cTea);
				}
				
				if(comboBox.getSelectedItem().equals("Orange")) 
				{
					String cOrange=String.format("%.2f",Orange);
					textField_3.setText(cOrange);
				}
				
				if(comboBox.getSelectedItem().equals("Cola")) 
				{
					String cCola=String.format("%.2f",Cola);
					textField_3.setText(cCola);
				}
				
				if(comboBox.getSelectedItem().equals("Select a drink")) 
				{
					textField_9.setText("0");
				}
					
				//-------------------------------------------------Tax Rate----------------------------------------------//
				double cTotal1 = Double.parseDouble(textField_3.getText());
				double cTotal2 = Double.parseDouble(textField_4.getText());
				double AllTotal = (cTotal1+cTotal2)/100;
				if(Tax.isSelected())
				{
					String iTotal = String.format("%.2f", AllTotal);
					textField_6.setText(iTotal);
				}
				//total//
				double cTotal3=Double.parseDouble(textField_6.getText());
				
				double subTotal=(cTotal1+cTotal2);
				String isubTotal=String.format("$ %.2f", subTotal);
				textField_7.setText(isubTotal);
				
				double allTotal=(cTotal1+cTotal2+cTotal3);
				String iTotal=String.format("$ %.2f", allTotal);
				textField_8.setText(iTotal);
				
				String iTaxTotal=String.format("$ %.2f", cTotal3);
				textField_6.setText(iTaxTotal);
			}
		});
		btnNewButton_1.setBounds(115, 18, 89, 23);
		panel_6.add(btnNewButton_1);
		
		JButton button_1 = new JButton("Receipt");
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double Qty1=Double.parseDouble(textField.getText());
				double Qty2=Double.parseDouble(textField_1.getText());
				double Qty3=Double.parseDouble(textField_2.getText());
				//double Qty4=Double.parseDouble(textField_8.setText(iTotal));
				double cTotal1 = Double.parseDouble(textField_3.getText());
				double cTotal2 = Double.parseDouble(textField_4.getText());
				double AllTotal = (cTotal1+cTotal2)/100;
				if(Tax.isSelected())
				{
					String iTotal = String.format("%.2f", AllTotal);
					textField_6.setText(iTotal);
				}
				//total//
				double cTotal3=Double.parseDouble(textField_6.getText());
				
				double subTotal=(cTotal1+cTotal2);
				String isubTotal=String.format("$ %.2f", subTotal);
				textField_7.setText(isubTotal);
				
				double allTotal=(cTotal1+cTotal2+cTotal3);
				String iTotal=String.format("$ %.2f", allTotal);
				textField_8.setText(iTotal);
				textArea.append("\t\nNEON Food Court :\n\n"+"Chicken Fillet Rice:\t"+Qty1+"\nFrench Fries:\t\t"+Qty2+"\nChicken Wing:\t\t"
						+Qty3+"\nTotal:\t\t"+iTotal+"\n\nThank You");
			}
		});
		button_1.setBounds(248, 18, 89, 23);
		panel_6.add(button_1);
		
		JButton button_2 = new JButton("Reset");
		button_2.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent arg0) {
				
				textField_7.setText(null);
				textField_8.setText(null);
				textField_6.setText(null);
				
				
				textField_3.setText(null);
				textField_4.setText(null);
				textField_7.setText(null);
				textField_6.setText(null);
				textField_8.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_9.setText(null);
			
				textArea.setText(null);
				comboBox.setSelectedItem("Select a drink");
				
			}
		});
		button_2.setBounds(378, 18, 89, 23);
		panel_6.add(button_2);
		
		
		
		//* Log Out* //
		
		
		
		JButton button_3 = new JButton("Log Out");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogInSystem r=new LogInSystem();
				frame.setVisible(false);
			
			}
		});
		button_3.setBounds(513, 18, 89, 23);
		panel_6.add(button_3);
		
		JButton btnNewButton_3 = new JButton("Save");
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*try {
					
					String query="insert into coffees (PRICE,SALES,TOTAL) values (?,?,?)";
					
					PreparedStatement pst=dbConnection.prepareStatement(query);
					/*pst.setString(1,textField.getText());
					pst.setString(2,textField_1.getText());
					pst.setString(3,textField_2.getText());
					pst.setInt=(1,Integer.parseInt(textField.getText()));
					Integer.parseInt(2,textField_1.getText());
					Integer.parseInt(3,textField_2.getText());
					//pst.setString(4,textField_8.getText());
					pst.execute();
					JOptionPane.showMessageDialog(null, "Data Saved");
					pst.close();
				} catch (Exception e) {
					//e.printStackTrace();
				}*/
			
				
				 
	
				try{
					//Statement stmt= dbConnection.createStatement();
					
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/reporteddata","root", "");
				 PreparedStatement pstmt = conn.prepareStatement("insert into reportdata(Chicken_rice,French_fries,Chicken_wing,Drink,Drink_Qty) values(?,?,?,?,?)");
				 
					pstmt.setInt(1 , Integer.parseInt(textField.getText()));

					pstmt.setInt(2 ,Integer.parseInt(textField_1.getText()));
					
					pstmt.setInt(3 ,Integer.parseInt(textField_2.getText()));
					pstmt.setString(4, comboBox.getSelectedItem().toString());
					pstmt.setInt(5 ,Integer.parseInt(textField_9.getText()));

					 pstmt.executeUpdate();
			
				 JOptionPane.showMessageDialog(null, "insert successful");
				
				
				//
					pstmt.close();
						

				}
				catch(SQLException ee)
				{
					ee.printStackTrace();
				}
			
			}
			
		});
		btnNewButton_3.setBounds(635, 18, 89, 23);
		panel_6.add(btnNewButton_3);
	
		
		JLabel lblNewLabel = new JLabel("FOODIE RESTAURANT");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 45));
		lblNewLabel.setBounds(420, 26, 487, 99);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(977, 59, 254, 218);
		frame.getContentPane().add(label_9);
		Image img=new ImageIcon(this.getClass().getResource("/ww.png")).getImage();
		label_9.setIcon(new ImageIcon(img));
		frame.setVisible(true);
	}
}
