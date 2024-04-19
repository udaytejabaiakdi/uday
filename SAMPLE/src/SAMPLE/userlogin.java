package SAMPLE;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class userlogin {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userlogin window = new userlogin();
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
	public userlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserLogin = new JLabel("User Login");
		lblUserLogin.setForeground(new Color(192, 192, 192));
		lblUserLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblUserLogin.setBounds(178, 22, 78, 13);
		frame.getContentPane().add(lblUserLogin);
		
		JLabel lblNewLabel = new JLabel("username    :");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setBounds(111, 68, 78, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setBounds(124, 116, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(197, 66, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(197, 113, 96, 19);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String password=t2.getText();
				try
				{
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/uday","root","mysql");
					PreparedStatement ps = con.prepareStatement("SELECT name, password FROM users WHERE name=? AND password=?");

					ps.setString(1,name);
					ps.setString(2,password);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(btnLogin,"valid user");
					}
					else
					{
						JOptionPane.showMessageDialog(btnLogin,"invalid user");
						
					}
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnLogin.setBounds(163, 176, 85, 21);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Downloads chrome\\fantasy-art-drawing-hd-wallpaper-thumb.jpg"));
		lblNewLabel_2.setBounds(0, 0, 436, 263);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
