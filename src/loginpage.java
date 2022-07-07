import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JComboBox;

public class loginpage extends JFrame {

	private JPanel contentPane;
	JTextField usernamein;
	private JPasswordField passwordin;
	JTextField datein;
	JTextField pcin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage frame = new loginpage();
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
	public loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(34, 11, 130, 65);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		lblPassword.setBounds(34, 87, 130, 65);
		contentPane.add(lblPassword);
		
		usernamein = new JTextField();
		usernamein.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		usernamein.setHorizontalAlignment(SwingConstants.CENTER);
		usernamein.setBounds(74, 63, 154, 31);
		contentPane.add(usernamein);
		usernamein.setColumns(10);
		
		passwordin = new JPasswordField();
		passwordin.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordin.setHorizontalAlignment(SwingConstants.CENTER);
		passwordin.setEchoChar('*');
		passwordin.setBounds(74, 137, 154, 31);
		contentPane.add(passwordin);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBorderPainted(false);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				main m = new main();
				
				String pc1 = pcin.getText();
				String name = usernamein.getText();
				String dat = datein.getText();
				m.username = name;
				m.date = dat;
				m.pc = pc1;
				
				password p = new password();        
				p.set(passwordin.getText());
				if (p.get().equals("0000") && !name.equals("") && !dat.equals("") && !pc1.equals("") ) {
				
					m.setVisible(true);
				 dispose() ;
				}
	   
				else if ( name.equals("") || dat.equals("") || pc1.equals("") ) {
					JOptionPane.showMessageDialog(rootPane,  " Please Complete All Fields ");	}
				
			
			
			else {
				JOptionPane.showMessageDialog(rootPane,  " Invalid User Name or Password  ");	}
			
			}
		
		});
		btnLogin.setFocusTraversalKeysEnabled(false);
		btnLogin.setContentAreaFilled(false);
		btnLogin.setDefaultCapable(false);
		btnLogin.setFocusable(false);
		btnLogin.setFocusPainted(false);
		btnLogin.setRequestFocusEnabled(false);
		btnLogin.setRolloverEnabled(false);
		btnLogin.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
		btnLogin.setBounds(84, 317, 97, 47);
		contentPane.add(btnLogin);
		
		datein = new JTextField();
		datein.setHorizontalAlignment(SwingConstants.CENTER);
		datein.setFont(new Font("Viner Hand ITC", Font.BOLD, 15));
		datein.setBounds(74, 282, 110, 24);
		contentPane.add(datein);
		datein.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		lblDate.setBounds(54, 230, 130, 65);
		contentPane.add(lblDate);
		
		JLabel lblPcName = new JLabel("Pc Name");
		lblPcName.setHorizontalAlignment(SwingConstants.CENTER);
		lblPcName.setForeground(Color.WHITE);
		lblPcName.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		lblPcName.setBounds(34, 154, 130, 65);
		contentPane.add(lblPcName);
		
		pcin = new JTextField();
		pcin.setHorizontalAlignment(SwingConstants.CENTER);
		pcin.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		pcin.setColumns(10);
		pcin.setBounds(74, 207, 154, 31);
		contentPane.add(pcin);
		
		JPanel back = new JPanel();
		back.setBounds(22, 11, 256, 363);
		back.setBackground(new Color(0,0,0,130));
		contentPane.add(back);
		
		JLabel wallpaper = new JLabel("");
		wallpaper.setIcon(new ImageIcon(loginpage.class.getResource("/image/popey.jpg")));
		wallpaper.setHorizontalAlignment(SwingConstants.CENTER);
		wallpaper.setBounds(0, 0, 640, 401);
		contentPane.add(wallpaper);
	}
}
