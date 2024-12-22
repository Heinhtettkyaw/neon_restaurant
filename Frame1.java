package Admin;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Frame1 extends JFrame {
	 JLabel idLabel;
	    JLabel passLabel;
		JLabel background;
		JLabel headerLabel;
		JLabel devInfo;
		
	    JTextField id;
	    JPasswordField pass;
	    JButton submit;
	    public Frame1(){
			setTitle("Neon Food Court ");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		 
			this.background = new JLabel(new ImageIcon("D:\\CST-204 - Java WSpace\\Neon1.0\\food bbq.jpg"));

			
			this.init();
			
			add(background);
			background.setVisible(true);  
			this.pack();
			this.setBounds(100, 100, 750, 450);
			this.setLocationRelativeTo(null);
	    }

	    public void init(){
			headerLabel = new JLabel();
			this.headerLabel.setText("Neon Food Court : Admin Log In ");
			this.headerLabel.setBounds(150,10,500,100);
			this.headerLabel.setFont(new Font("Geomanist", Font.BOLD, 30));
			headerLabel.setForeground(Color.cyan);
			add(headerLabel);
			
			
			idLabel = new JLabel();
			this.idLabel.setText("Username :");
			this.idLabel.setBounds(160,150,120,50);
			this.idLabel.setFont(new Font(null, Font.BOLD, 20));
			idLabel.setForeground(Color.black);
			add(idLabel);
			
	        passLabel=new JLabel("Password :");
			this.passLabel.setBounds(160,215,120,50);
			this.passLabel.setFont(new Font(null, Font.BOLD, 20));
			passLabel.setForeground(Color.black);
			add(passLabel);
			
			
			devInfo = new JLabel();
			this.devInfo.setText(" All Rights Reserved by   -  Group2     ||    2nd year   ||    UiT ");
			this.devInfo.setBounds(180,380,1000,30);
			this.devInfo.setFont(new Font("Geomanist", Font.PLAIN, 15));
			devInfo.setForeground(Color.WHITE);
			add(devInfo);
				
				
			id=new JTextField();
			this.id.setBounds(350,165,200,30);
			this.id.setBackground(Color.BLACK);
			id.setCaretColor(Color.white);
			id.setForeground(Color.white);
					
			add(id);
			
			pass=new JPasswordField();
			this.add(pass);
			this.pass.setBounds(350,225,200,30);
			this.pass.setBackground(Color.BLACK);
			pass.setForeground(Color.white);
			pass.setCaretColor(Color.white);
			
			
		
	        
			this.id.setVisible(true);
		  
			
	      

	       this.submit=new JButton("Login");
		   this.submit.setBounds(400,280,100,25);
		   this.submit.setBackground(Color.BLACK);
		   this.submit.setForeground(Color.white);
		   add(submit);
		   
	       submit.addActionListener(this::submitActionPerformed);


	    } 
		public void submitActionPerformed(java.awt.event.ActionEvent evt){

	    	 if(id.getText().equals("admin") && pass.getText().equals("admin")){

	    	new	Frame2new();
	    		 setVisible(false);
	    	     
	    	 

	    	   }

	    	   else{

	    	    JOptionPane.showMessageDialog(null, "Invalid password!");

	    	   }

	    	   }


public static void main(String [] a)
{
	Frame1 f = new Frame1();
	f.setVisible(true);
	
}
}


	

