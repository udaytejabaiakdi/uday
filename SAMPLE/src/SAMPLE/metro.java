package SAMPLE;
import java.util.HashMap;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class metro {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(128, 255, 0));
		lblNewLabel.setBounds(167, 0, 232, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(109, 86, 59, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(109, 127, 73, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(83, 173, 85, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number of tickets ");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(80, 214, 123, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBounds(203, 83, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "kphb", "gachibowli", "bhel"}));
		c1.setBounds(203, 123, 96, 21);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select ", "jblhills", "jntu", "ldkpl"}));
		c2.setBounds(203, 170, 96, 21);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setBackground(new Color(192, 192, 192));
		c3.setForeground(new Color(0, 0, 0));
		c3.setModel(new DefaultComboBoxModel(new String[] {"select ", "1", "2", "3", "4"}));
		c3.setBounds(203, 210, 96, 21);
		frame.getContentPane().add(c3);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setBackground(new Color(64, 128, 128));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String source=(String)c1.getSelectedItem();
				String dest=(String)c2.getSelectedItem();	
				String ticket=(String)c3.getSelectedItem();
				int nt=Integer.parseInt(ticket);
				int bill=0;
				HashMap<String, Integer> sourcePlaces = new HashMap<>();
		        sourcePlaces.put("kphb", 1);
		        sourcePlaces.put("gachibowli", 5);
		        sourcePlaces.put("bhel", 10);

		        // Destination places and their distances
		        HashMap<String, Integer> destPlaces = new HashMap<>();
		        destPlaces.put("jblhills", 14);
		        destPlaces.put("lkdpl", 16);
		        destPlaces.put("jntu", 12);

		        int s=sourcePlaces.get(source);
		        int d=destPlaces.get(dest);
		        int dist=d-s;
					bill=bill+nt*dist*4;
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "  name :" +name
				+"\n sorce name:"+source 
				+"\n dest name:"+dest
				+"\n Number of tickects :"+ticket 
				+"\n amount:"+bill);
				if(res==YES_OPTION)
				
			}
		});
		btnNewButton.setBounds(185, 254, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Nani\\Pictures\\india-metro.jpg"));
		lblNewLabel_5.setBounds(0, 0, 636, 463);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
