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

public class Frame2new {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2new window = new Frame2new();
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
	public Frame2new() {
	

	/**
	 * Initialize the contents of the frame.
	 */
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeFromNeon = new JLabel("Welcome From Neon Admin System");
		lblWelcomeFromNeon.setBackground(Color.LIGHT_GRAY);
		lblWelcomeFromNeon.setForeground(Color.MAGENTA);
		lblWelcomeFromNeon.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		lblWelcomeFromNeon.setBounds(35, 29, 325, 25);
		frame.getContentPane().add(lblWelcomeFromNeon);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.LIGHT_GRAY);
		Image image= new ImageIcon (this.getClass().getResource("/RP List.png")).getImage();
		label.setIcon(new ImageIcon(image));
		label.setBounds(258, 109, 50, 50);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		Image image1= new ImageIcon (this.getClass().getResource("/shop-icon.png")).getImage();
		label_1.setIcon(new ImageIcon(image1));
		label_1.setBounds(78, 109, 50, 50);
		frame.getContentPane().add(label_1);
		
		JButton btnRestaurant = new JButton("Restaurants");
		btnRestaurant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RestaurantLists fn =new RestaurantLists();
				
			}

			
		});
		btnRestaurant.setFont(new Font("Verdana", Font.ITALIC, 10));
		btnRestaurant.setBackground(Color.WHITE);
		btnRestaurant.setBounds(56, 170, 101, 25);
		frame.getContentPane().add(btnRestaurant);
		
		JButton button = new JButton("Report Lists");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReportData g=new ReportData();
			}
		});
		button.setFont(new Font("Verdana", Font.ITALIC, 10));
		button.setBackground(Color.WHITE);
		button.setBounds(227, 170, 107, 25);
		frame.getContentPane().add(button);
		frame.setVisible(true);
		
	}
}
