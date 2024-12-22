package Admin;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ManagerLogIn extends JFrame {
	 JLabel idLabel;
	    JLabel passLabel;
		JLabel background;
		JLabel headerLabel;
		JLabel devInfo;
		
	    JTextField id;
	    JPasswordField pass;

	    JButton submit;
	    public  ManagerLogIn(){
			setTitle("Neon Food Court ");
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			setVisible(true);
		
			this.background = new JLabel(new ImageIcon("D:\\CST-204 - Java WSpace\\Neon1.0\\images.jpg"));

			
			this.init();
			
			add(background);
			background.setVisible(true);  
			this.pack();
			this.setBounds(100, 100, 750, 500);
			this.setLocationRelativeTo(null);
	    }

	    public void init(){
			headerLabel = new JLabel();
			this.headerLabel.setText("Neon Food Court : Manager Log In ");
			this.headerLabel.setBounds(160,0,500,100);
			this.headerLabel.setFont(new Font("Geomanist",Font.BOLD | Font.ITALIC, 30));
			headerLabel.setForeground(Color.cyan);
			add(headerLabel);
			
			
			idLabel = new JLabel();
			this.idLabel.setText("Username :");
			this.idLabel.setBounds(320,160,120,50);
			this.idLabel.setFont(new Font(null, Font.PLAIN, 20));
			idLabel.setForeground(Color.white);
			add(idLabel);
			
	        passLabel=new JLabel("Password :");
			this.passLabel.setBounds(320,215,120,50);
			this.passLabel.setFont(new Font(null, Font.PLAIN, 20));
			passLabel.setForeground(Color.white);
			add(passLabel);
			
			
			devInfo = new JLabel();
			this.devInfo.setText(" All Rights Reserved by   -  Group2     ||    2nd year   ||    UiT ");
			this.devInfo.setBounds(170,430,1000,30);
			this.devInfo.setFont(new Font("Geomanist", Font.PLAIN, 15));
			devInfo.setForeground(Color.white);
			add(devInfo);
				
				
			id=new JTextField();
			this.id.setBounds(470,175,200,30);
			this.id.setBackground(Color.BLACK);
			id.setCaretColor(Color.white);
			id.setForeground(Color.white);
			add(id);
			
			pass=new JPasswordField();
			this.add(pass);
			this.pass.setBounds(470,225,200,30);
			this.pass.setBackground(Color.BLACK);
			pass.setCaretColor(Color.white);
			pass.setForeground(Color.white);
			
			
		
	        
			this.id.setVisible(true);
		  
			
	      

	       this.submit=new JButton("Login");
		   this.submit.setBounds(470,280,100,25);
		   this.submit.setBackground(Color.BLACK);
		   this.submit.setForeground(Color.white);
		   add(submit);
		   
	       submit.addActionListener(this::submitActionPerformed);


	    } 
	    public void submitActionPerformed(java.awt.event.ActionEvent evt){

	    	 if(id.getText().equals("manager1") && pass.getText().equals("m12345")){


	    	     this.hide();
	    	    Restaurant d=new Restaurant();   	 

	    	   }

	    	   else{

	    	    JOptionPane.showMessageDialog(null, "Invalid password!");

	    	   }

	    	   }


public static void main(String [] a)
{
	 ManagerLogIn f = new  ManagerLogIn();
	f.setVisible(true);
	
}
}


	

