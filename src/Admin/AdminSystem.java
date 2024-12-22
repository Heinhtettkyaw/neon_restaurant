package Admin;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminSystem {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSystem window = new AdminSystem();
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
	public AdminSystem() {
	

	/**
	 * Initialize the contents of the frame.
	 */
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 445, 327);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeFromNeon = new JLabel("Welcome From NEON Admin System");
		lblWelcomeFromNeon.setBackground(Color.LIGHT_GRAY);
		lblWelcomeFromNeon.setForeground(Color.CYAN);
		lblWelcomeFromNeon.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		lblWelcomeFromNeon.setBounds(35, 29, 348, 25);
		frame.getContentPane().add(lblWelcomeFromNeon);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.LIGHT_GRAY);
		Image image= new ImageIcon (this.getClass().getResource("/RP List.png")).getImage();
		label.setIcon(new ImageIcon(image));
		label.setBounds(276, 108, 50, 50);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		Image image1= new ImageIcon (this.getClass().getResource("/shop-icon.png")).getImage();
		label_1.setIcon(new ImageIcon(image1));
		label_1.setBounds(78, 108, 50, 50);
		frame.getContentPane().add(label_1);
		
		JButton btnRestaurant = new JButton("Restaurants");
		btnRestaurant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantLists fn =new RestaurantLists();
				
			}

			
		});
		btnRestaurant.setFont(new Font("Verdana", Font.ITALIC, 10));
		btnRestaurant.setBackground(Color.WHITE);
		btnRestaurant.setBounds(56, 169, 101, 25);
		frame.getContentPane().add(btnRestaurant);
		
		JButton button = new JButton("Report Lists");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReportData g=new ReportData();
			}
		});
		button.setFont(new Font("Verdana", Font.ITALIC, 10));
		button.setBackground(Color.WHITE);
		button.setBounds(256, 169, 107, 25);
		frame.getContentPane().add(button);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogInSystem r=new LogInSystem();
				frame.setVisible(false);
			}
		});
		btnLogOut.setIcon(new ImageIcon("D:\\CST-204 - Java WSpace\\Neon1.0\\Image\\Log-Out-icon.png"));
		btnLogOut.setBounds(312, 256, 107, 23);
		frame.getContentPane().add(btnLogOut);
		frame.setVisible(true);
		
	}
}
