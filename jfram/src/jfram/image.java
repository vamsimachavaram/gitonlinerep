package jfram;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class image extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					image frame = new image();
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
	public image() {
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Calculater");
		setForeground(Color.GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Machavaram Vamsi\\Downloads\\images\\cal.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 332);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Machavaram Vamsi\\Downloads\\images\\Calculator a background590.jpg"));
		lblNewLabel.setBounds(-79, -47, 615, 578);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(28, 22, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(38, 34, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setBounds(67, 34, 46, 14);
		getContentPane().add(label);
		
		
		
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(115, 60, 30, 13);
		getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Machavaram Vamsi\\Downloads\\images\\black-background-image.jpg.crdownload"));
		lblNewLabel_7.setBounds(10, 11, 461, 62);
		getContentPane().add(lblNewLabel_7);
	
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(28, 34, 46, 14);
		getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Machavaram Vamsi\\Downloads\\images\\black-background-image.jpg"));
		lblNewLabel_11.setBounds(38, 22, 417, 77);
		getContentPane().add(lblNewLabel_11);
	}
}
