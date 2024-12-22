package Admin;
import java.sql.*;
import javax.swing.*;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import net.proteanit.sql.DbUtils;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReportData {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportData window = new ReportData();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	private JTable table;
	/**
	 * Create the application.
	 */
	public ReportData() {
		connection= sqliteConnection1.dbConnector();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 559, 321);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNeonsReportedSales = new JLabel("NEON's Reported Sales List");
		lblNeonsReportedSales.setForeground(Color.CYAN);
		lblNeonsReportedSales.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblNeonsReportedSales.setBounds(155, 11, 257, 26);
		frame.getContentPane().add(lblNeonsReportedSales);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setForeground(new Color(0, 128, 0));
		btnRefresh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				try {
					String query="select * from reportdata ";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRefresh.setBounds(444, 250, 89, 23);
		frame.getContentPane().add(btnRefresh);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 56, 479, 162);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSystem r=new AdminSystem();
				frame.setVisible(false);
			}
		});
		btnBack.setIcon(new ImageIcon("D:\\CST-204 - Java WSpace\\Neon1.0\\Image\\Go-back-icon.png"));
		btnBack.setForeground(new Color(0, 128, 0));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBack.setBounds(10, 250, 89, 23);
		frame.getContentPane().add(btnBack);
		frame.setVisible(true);
	}

}
