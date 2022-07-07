import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;
import java.awt.Cursor;
public class main extends JFrame {

	private JPanel contentPane;
	private JTextField weightin;
	private JTextField lengthin;
	public JLabel lblNewLabel_2;
	private JTextField calories;
	private JTextField ideal;
	public String username;
	public String date;
	public String pc ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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

	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 591);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton maleb = new JRadioButton("");
		maleb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		maleb.addMouseListener(new MouseAdapter() {
			
			
		});
		maleb.setForeground(Color.RED);
		maleb.setBackground(Color.BLACK);
		maleb.setBounds(78, 95, 28, 38);
		contentPane.add(maleb);
		
		JRadioButton femaleb = new JRadioButton("");
		femaleb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		femaleb.setForeground(Color.RED);
		femaleb.setFont(new Font("Tahoma", Font.PLAIN, 25));
		femaleb.setBackground(Color.BLACK);
		femaleb.setBounds(254, 95, 28, 38);
		contentPane.add(femaleb);
		
		JLabel lblNewLabel_1 = new JLabel("Male");
		lblNewLabel_1.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(62, 43, 80, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Female");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(254, 43, 153, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Weight");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(10, 178, 109, 34);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Length");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblNewLabel_1_2_1.setBounds(10, 313, 109, 34);
		contentPane.add(lblNewLabel_1_2_1);
		
		weightin = new JTextField();
		weightin.setBackground(Color.BLACK);
		weightin.setFont(new Font("Tahoma", Font.BOLD, 20));
		weightin.setForeground(Color.RED);
		weightin.setHorizontalAlignment(SwingConstants.CENTER);
		weightin.setBounds(20, 236, 122, 28);
		contentPane.add(weightin);
		weightin.setColumns(10);
		
		lengthin = new JTextField();
		lengthin.setHorizontalAlignment(SwingConstants.CENTER);
		lengthin.setForeground(Color.RED);
		lengthin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lengthin.setColumns(10);
		lengthin.setBackground(Color.BLACK);
		lengthin.setBounds(20, 372, 122, 28);
		contentPane.add(lengthin);
		
		JLabel kg = new JLabel("k.g");
		kg.setForeground(Color.WHITE);
		kg.setHorizontalAlignment(SwingConstants.LEFT);
		kg.setBounds(152, 250, 46, 14);
		contentPane.add(kg);
		
		JLabel cm = new JLabel("c.m");
		cm.setHorizontalAlignment(SwingConstants.LEFT);
		cm.setForeground(Color.WHITE);
		cm.setBounds(152, 383, 46, 14);
		contentPane.add(cm);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				loginpage log = new loginpage();
				
				
				 String l = (lengthin.getText());
					String m = (weightin.getText());
					String n = (weightin.getText());
					
				
				
				
				
				
			
			

			if ( l.equals("") || m.equals("") || n.equals("") ) {
				
				JOptionPane.showMessageDialog(rootPane,  " Plaease Enter All Inforamtion ");

				
			}
	
	
	
			else if (( Float.parseFloat(l) <= 0 || Float.parseFloat(n) <= 0 || Float.parseFloat(m) <= 0  ))
	{
		
		JOptionPane.showMessageDialog(rootPane,  " Plaease Enter a Valid Number ");

	}
		else if (maleb.isSelected()) {
					
			String x = ( "" +Float.parseFloat(m)  * 1 * 24  ) ;
		    String y = ("" + Float.parseFloat(x) * 0.5  );
				float f = ( (Float.parseFloat(x)) + ( Float.parseFloat(y)) );
				
				calories.setText( "" + f );									
					
					ideal.setText(""+ ((Float.parseFloat(l)-100) + (4) ));
					
					
				}
				else if (femaleb.isSelected()) {

					
					String d = ( "" +Float.parseFloat(n)  * 0.9 * 24  ) ;
				    String s = ("" + Float.parseFloat(d) * 0.5  );
						float g = ( (Float.parseFloat(d)) + ( Float.parseFloat(s)) );
						
			 	calories.setText( "" + g );			
					
					ideal.setText(""+((Float.parseFloat(l)-100) + (4)) );

				}
	
	
	
			else if ( !maleb.isSelected() || !femaleb.isSelected() ) {
		
		JOptionPane.showMessageDialog(rootPane,  " Please Choose Your Gender  ");
		
	}		
		
			
			
			
			
			
			Writer writer = null;

			try {
			    writer = new BufferedWriter(new OutputStreamWriter(
			          new FileOutputStream("C:\\Users\\" + pc + "\\Desktop\\calories.txt"), "utf-8"));
			    writer.write("Name: " + username + "\nDate: " + date + "\nweight: " + weightin.getText() + "\nIdeal Weight: " + ""+ ((Float.parseFloat(l)-100) + (4) ) + "\nCalories per day: " + calories.getText()    );
			} catch (IOException ex) {
			    // Report
			} finally {
			   try {writer.close();} catch (Exception ex) {/*ignore*/}
			}

			
				
			
			
				
		}
		});
		btnNewButton.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(10, 468, 205, 38);
		contentPane.add(btnNewButton);
		
		
		
		calories = new JTextField();
		calories.setEditable(false);
		calories.setHorizontalAlignment(SwingConstants.CENTER);
		calories.setForeground(Color.RED);
		calories.setFont(new Font("Tahoma", Font.BOLD, 20));
		calories.setColumns(10);
		calories.setBackground(Color.BLACK);
		calories.setBounds(383, 372, 128, 28);
		contentPane.add(calories);
		
		ideal = new JTextField();
		ideal.setEditable(false);
		ideal.setHorizontalAlignment(SwingConstants.CENTER);
		ideal.setForeground(Color.RED);
		ideal.setFont(new Font("Tahoma", Font.BOLD, 20));
		ideal.setColumns(10);
		ideal.setBackground(Color.BLACK);
		ideal.setBounds(389, 236, 122, 28);
		contentPane.add(ideal);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Calories");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblNewLabel_1_2_2.setBounds(364, 313, 122, 34);
		contentPane.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Ideal Weight");
		lblNewLabel_1_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1.setFont(new Font("Monospaced", Font.BOLD, 25));
		lblNewLabel_1_2_2_1.setBounds(364, 178, 180, 34);
		contentPane.add(lblNewLabel_1_2_2_1);
		
		JLabel kg_1 = new JLabel("k.g");
		kg_1.setHorizontalAlignment(SwingConstants.LEFT);
		kg_1.setForeground(Color.WHITE);
		kg_1.setBounds(521, 247, 46, 14);
		contentPane.add(kg_1);
		
		JButton btnNewButton_1 = new JButton("Food Details ...");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foodpage f = new foodpage ();
				f.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setToolTipText("");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(484, 468, 193, 38);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(main.class.getResource("/image/PicsArt_12-29-10.41.56.png")));
		lblNewLabel_3.setBounds(117, 313, 69, 48);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(main.class.getResource("/image/PicsArt_12-29-10.42.27.png")));
		lblNewLabel_4.setBounds(554, 178, 56, 47);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(main.class.getResource("/image/PicsArt_12-29-10.42.53.png")));
		lblNewLabel_5.setBounds(496, 313, 56, 48);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(main.class.getResource("/image/PicsArt_12-29-10.59.55.png")));
		lblNewLabel.setBounds(111, 178, 69, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblPd = new JLabel("P/ D");
		lblPd.setHorizontalAlignment(SwingConstants.LEFT);
		lblPd.setForeground(Color.WHITE);
		lblPd.setBounds(521, 383, 46, 14);
		contentPane.add(lblPd);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginpage g = new loginpage ();
				g.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setIcon(new ImageIcon(main.class.getResource("/image/PicsArt_12-29-11.05.06.png")));
		btnNewButton_2.setBounds(765, 493, 89, 48);
		contentPane.add(btnNewButton_2);
		
		
		
		JLabel wallpaper = new JLabel("");
		wallpaper.setFont(new Font("Tahoma", Font.PLAIN, 18));
		wallpaper.setOpaque(true);
		wallpaper.setBackground(Color.BLACK);
		wallpaper.setForeground(Color.WHITE);
		wallpaper.setIcon(new ImageIcon(main.class.getResource("/image/gym.jpg")));
		wallpaper.setHorizontalAlignment(SwingConstants.CENTER);
		wallpaper.setBounds(0, 0, 880, 570);
		contentPane.add(wallpaper);
		
		//type check
	
		
	}
}
