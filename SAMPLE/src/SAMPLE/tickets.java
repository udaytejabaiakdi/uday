package SAMPLE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tickets {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tickets window = new tickets();
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
	public tickets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMovieTicketBooking = new JLabel("MOVIE TICKET BOOKING ");
		lblMovieTicketBooking.setFont(new Font("Unispace", Font.BOLD, 16));
		lblMovieTicketBooking.setBounds(169, 28, 206, 34);
		frame.getContentPane().add(lblMovieTicketBooking);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(132, 93, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(126, 161, 85, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(103, 210, 128, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "srk", "jr", "ombmbu"}));
		cb1.setBounds(243, 157, 105, 21);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4"}));
		cb2.setBounds(243, 207, 105, 21);
		frame.getContentPane().add(cb2);
		
		t1 = new JTextField();
		t1.setBounds(243, 91, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String movie=(String)cb1.getSelectedItem();
				String ticket=(String)cb2.getSelectedItem();	
				int nt=Integer.parseInt(ticket);
				int bill=0;
				if(movie.equals("srk"))
				{
					bill=bill+nt*150;
				}
				if(movie.equals("jr"))
				{
					bill=bill+nt*250;
				}
				if(movie.equals("ombmbu"))
				{
					bill=bill+nt*200;
				}
				JOptionPane.showMessageDialog(btnSubmit, "  name :" +name
				+"\n movie name:"+movie 
				+"\n Number of tickects :"+ticket 
				+"\n amount:"+bill);
			}
		});
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSubmit.setBounds(211, 274, 85, 21);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Downloads chrome\\pngtree-popcorn-commercial-style-movie-ticket-template-image_702644.jpg"));
		lblNewLabel_3.setBounds(0, 0, 536, 363);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
