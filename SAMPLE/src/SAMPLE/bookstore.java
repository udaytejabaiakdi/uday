package SAMPLE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class bookstore {
int items=0;
int total=0;

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookstore window = new bookstore();
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
	public bookstore() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK STORE APPLLICATION");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblNewLabel.setBounds(225, 29, 322, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("items");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(427, 115, 49, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("total");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_2.setBounds(427, 152, 109, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		tf1 = new JTextField();
		tf1.setBounds(499, 114, 96, 19);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(499, 151, 96, 19);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				total=total+450;
				tf1.setText(""+items);
				tf2.setText(""+total);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\Downloads chrome\\d2d1525e317beb1ed4f60ddfaf233205.jpg"));
		btnNewButton_1.setBounds(210, 216, 109, 145);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				total=total+300;
				tf1.setText(""+items);
				tf2.setText(""+total);
			}
			
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\Downloads chrome\\book3.jpg"));
		btnNewButton_2.setBounds(363, 216, 102, 145);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("500/-");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_3.setBounds(90, 382, 64, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("450/-");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_4.setBounds(242, 385, 64, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("300/-");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_5.setBounds(390, 385, 45, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items = items+1;
				total=total+500;
				tf1.setText(""+items);
				tf2.setText(""+total);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\Downloads chrome\\book2.jpg"));
		btnNewButton.setBounds(43, 216, 126, 145);
		frame.getContentPane().add(btnNewButton);
		
		JLabel tb1 = new JLabel("500");
		tb1.setForeground(new Color(255, 255, 255));
		tb1.setIcon(new ImageIcon("D:\\Downloads chrome\\7874745.jpg"));
		tb1.setBounds(0, 0, 736, 463);
		frame.getContentPane().add(tb1);
		

	}

}
