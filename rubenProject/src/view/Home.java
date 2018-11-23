package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.Box;
import java.awt.Button;
import java.awt.Font;
import javax.swing.BoxLayout;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private final Button button_1 = new Button("New button");
	private JTextPane txtpnStockManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 521);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		table = new JTable();
		contentPane.add(table);
		contentPane.add(button_1);
		
		txtpnStockManagement = new JTextPane();
		txtpnStockManagement.setText("Stock Management");
		contentPane.add(txtpnStockManagement);
	}

}
