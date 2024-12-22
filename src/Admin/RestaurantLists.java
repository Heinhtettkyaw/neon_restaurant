package Admin;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RestaurantLists {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantLists window = new RestaurantLists();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
Connection connection=null;

	
	
	
	public RestaurantLists() {
		connection= sqliteConnection.dbConnector();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNeonsRestaurantLists = new JLabel("NEON's Restaurant Lists");
		lblNeonsRestaurantLists.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 17));
		lblNeonsRestaurantLists.setForeground(Color.CYAN);
		lblNeonsRestaurantLists.setBounds(142, 23, 250, 29);
		frame.getContentPane().add(lblNeonsRestaurantLists);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 69, 440, 208);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setForeground(new Color(0, 128, 0));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				try {
					String query="select * from rlist ";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRefresh.setFont(new Font("Verdana", Font.ITALIC, 11));
		
		btnRefresh.setBounds(443, 300, 87, 23);
		frame.getContentPane().add(btnRefresh);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSystem r=new AdminSystem();
				frame.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBack.setForeground(new Color(0, 128, 0));
		btnBack.setIcon(new ImageIcon("D:\\CST-204 - Java WSpace\\Neon1.0\\Image\\Go-back-icon.png"));
		btnBack.setBounds(30, 300, 87, 23);
		frame.getContentPane().add(btnBack);
		frame.setBounds(100, 100, 556, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
