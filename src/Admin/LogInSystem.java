package Admin;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class LogInSystem {

	private JFrame frame;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInSystem window = new LogInSystem();
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
	public LogInSystem() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.setBounds(100, 100, 850, 500);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Neon Food Court ");
		
		JLabel lblNewLabel = new JLabel("");
		Image img= new ImageIcon (this.getClass().getResource("/ADimages.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(208, 200, 128, 136);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image image= new ImageIcon (this.getClass().getResource("/MenGM.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image));
		lblNewLabel_1.setBounds(492, 200, 128, 136);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("ADMIN");
		btnNewButton.setForeground(new Color(0, 255, 0));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Georgia", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogIn fn=new AdminLogIn();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(223, 358, 113, 23);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("Manager");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerLogIn fn=new ManagerLogIn();
				frame.setVisible(false);
			}
		});
		button.setForeground(new Color(0, 128, 0));
		button.setFont(new Font("Georgia", Font.PLAIN, 15));
		button.setBackground(new Color(0, 0, 0));
		
		
		
		
		
		button.setBounds(502, 358, 115, 23);
		frame.getContentPane().add(button);
		
		Label label_1 = new Label("Welcome From NEON Food Court ");
		label_1.setForeground(Color.CYAN);
		label_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 30));
		label_1.setBounds(185, 39, 489, 64);
		frame.getContentPane().add(label_1);
		
		Label label_2 = new Label("Log In as Administrator or Manager?");
		label_2.setForeground(Color.GREEN);
		label_2.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		label_2.setBounds(284, 161, 285, 33);
		frame.getContentPane().add(label_2);
		frame.setVisible(true);
		
		
		
	}
}
