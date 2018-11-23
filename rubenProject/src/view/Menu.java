package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import org.omg.CORBA.INITIALIZE;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import io.altar.jseproject.textinterface.TextInterface;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Menu extends TextInterface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(300, 300, 510, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane);
		
		JButton btnNewButton = new JButton("Produtos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printHeader();
				printMenu();
			}


		
		});
		btnNewButton.setBounds(66, 41, 126, 48);
		desktopPane.add(btnNewButton);
		
		JButton button = new JButton("Prateleiras");
		button.setBounds(299, 41, 126, 48);
		desktopPane.add(button);
		
		JTextArea textArea = new JTextArea();
		frame.getContentPane().add(textArea);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		frame.getContentPane().add(desktopPane_1);
	}  
}
