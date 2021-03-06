import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class Ipv6UI {

	private JFrame frmIpv;
	private JTextField input;
	public Ipv6_Service service = new Ipv6_Service();
	JLabel please = new JLabel("");
	String[] resultIndex;
	JPanel result = new JPanel();
	JLabel lblNewLabel = new JLabel("Network :");
	JLabel lblPrefixLength = new JLabel("Prefix length :");
	JLabel lblNetworkRange = new JLabel("Network range :");
	JLabel lblTotalIpAddresses = new JLabel("Total IP addresses :");
	JLabel network = new JLabel("");
	JLabel prefix = new JLabel("");
	JLabel range = new JLabel("");
	JLabel total = new JLabel("");
	JLabel lblBroadcast = new JLabel("Integer ID :");
	JLabel HexadecimalID = new JLabel("");
	JLabel lblNewLabel_1 = new JLabel("Welcome IPv6 ");
	PrefixLength prefixdata = new PrefixLength();
	JLabel integerID = new JLabel("");
	JLabel lblNewLabel_2 = new JLabel("Hexadecimal ID");
	private final JPanel panel_2 = new JPanel();
	JLabel lblNewLabel_3 = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ipv6UI window = new Ipv6UI();
					window.frmIpv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ipv6UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIpv = new JFrame();
		frmIpv.getContentPane().setBackground(SystemColor.inactiveCaption);
		frmIpv.setIconImage(
				Toolkit.getDefaultToolkit().getImage(Ipv6UI.class.getResource("/lib_ipaddress/world.png")));
		frmIpv.setResizable(false);
		frmIpv.setTitle("IPv6");
		frmIpv.setBounds(100, 100, 811, 567);
		frmIpv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIpv.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 159, 785, 323);
		frmIpv.getContentPane().add(panel);
		panel.setLayout(null);

		result.setBounds(0, 0, 773, 323);
		panel.add(result);
		result.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		result.setLayout(null);

		lblNewLabel.setBounds(25, 30, 104, 14);
		result.add(lblNewLabel);

		lblPrefixLength.setBounds(25, 64, 104, 14);
		result.add(lblPrefixLength);

		lblNetworkRange.setBounds(25, 96, 104, 14);
		result.add(lblNetworkRange);

		JLabel lblTotalIpAddresses = new JLabel("Total IP addresses :");
		lblTotalIpAddresses.setBounds(25, 132, 114, 14);
		result.add(lblTotalIpAddresses);

		network.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		network.setBounds(220, 30, 516, 14);
		result.add(network);

		prefix.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		prefix.setBounds(220, 64, 516, 14);
		result.add(prefix);

		range.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		range.setBounds(220, 96, 516, 14);
		result.add(range);

		total.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		total.setBounds(220, 132, 516, 14);
		result.add(total);

		lblBroadcast.setBounds(25, 168, 104, 14);
		result.add(lblBroadcast);

	
		integerID.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		integerID.setBounds(220, 168, 516, 14);
		result.add(integerID);

		
		lblNewLabel_2.setBounds(25, 205, 104, 14);
		result.add(lblNewLabel_2);

		HexadecimalID.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		HexadecimalID.setBounds(220, 205, 516, 14);
		result.add(HexadecimalID);

		lblNewLabel_1.setBounds(298, 95, 260, 86);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Segoe UI Emoji", Font.BOLD, 17));
		result.setVisible(false);

		input = new JTextField();
		input.setBounds(134, 28, 349, 20);
		frmIpv.getContentPane().add(input);
		input.setColumns(10);

		JLabel lblIpv = new JLabel("IPv6 ");
		lblIpv.setForeground(Color.WHITE);
		lblIpv.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIpv.setBounds(10, 21, 77, 31);
		frmIpv.getContentPane().add(lblIpv);
		JButton btnCa = new JButton("Find");
		btnCa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				settingAndCalculator();
			}

		});
		btnCa.setBounds(492, 27, 89, 23);
		frmIpv.getContentPane().add(btnCa);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.GRAY);
		menuBar.setBounds(0, 0, 67, 21);
		JMenu menu1 = new JMenu("File");
		menu1.setForeground(Color.LIGHT_GRAY);
		JMenuItem menu1_1;

		menu1_1 = new JMenuItem("Close");
		
		
		JMenuItem menu1_2;

		menu1_2 = new JMenuItem("About");
		
		menu1.add(menu1_1);
		menu1.add(menu1_2);

		menu1_1.setMnemonic(KeyEvent.VK_Q);
		menu1_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		menu1_1.setToolTipText("Exit application");
		menu1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}

		});
		menu1_2.setMnemonic(KeyEvent.VK_A);
		menu1_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		menu1_2.setToolTipText("Exit application");
		menu1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "IPv6 (Internet Protocol version 6) is the latest version of the Internet Protocol "
						+ "and has included products that support IP as part to the main operating system,\r\n"	+"\r\n" + 
						"IPv6 has been called \"IPng\" (IP Next Generation) are a group of typically IPv6 Internet Engineering Task Force terms (IETF) "
						+"\r\n" + "by IPv6 has been designed to reform the Group's updated IP version 4 by the host of the style network and IPv4 or IPv6"
						+"\r\n" + " node intermediate which can administer the different versions of the gateway,"
						+"\r\n" + " the IP packs. Users and service providers can be upgraded to IPv6 independently.\r\n" + 
						"\r\n" + 
						"To improve the clarity of the IPv6 IP address length is changed from 32 to 128 "
						+ "such expansion is to accommodate the expansion of the Internet and to avoid the shortage of network location.\r\n" + 
						"\r\n" + 
						"IP v6 have defined rules to specify the position 3 types of unicast (single host to a single host, other)"
						+ " anycast (single-host to host several of the closest), multicast (single-host to host multiple) that IPv6 is special.\r\n" + 
						"\r\n" + 
						"-Option, in the specify the header extensions are monitoring a specific destination. "
						+ "Therefore, the speed of the more advanced network systems.\r\n" + 
						"\r\n" + 
						"-Make the anycast position has the possibility of sending a message to multiple gateway "
						+ "that is nearest with the concept that allows any person to submit management packs to the gateway, "
						+ "the other person can use anycast to update the routing table routes.\r\n" + 
						"\r\n" + 
						"-Navigation packs are identified, "
						+ "there is a special type of flow. Make the gateway, "
						+ "the port is part of the multimedia."
						+ " Real time presentation can have a high quality service.\r\n" + 
						"\r\n" + 
						"-IPv6 header, including the extensions, allowing Granger Pack basket,"
						+ " BU source mechanism. For the integration of information and confidentiality\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"\r\n" + 
						"Information from: widebase.net", "About: " +"\r\n"+ "Java Liberies is java-ipv6-0.16.jar" +"\r\n"+"Applications for Education", JOptionPane.INFORMATION_MESSAGE);
			}

		});

		menuBar.add(menu1);

		frmIpv.getContentPane().add(menuBar);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(0, 0, 805, 20);
		frmIpv.getContentPane().add(panel_1);
		
        String[] choices = prefixdata.getPrefix();
		JComboBox comboBox = new JComboBox(choices);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String xx = comboBox.getSelectedItem().toString();
				resultIndex = xx.split(" ");

			}
		});

		comboBox.setBounds(134, 59, 294, 20);
		frmIpv.getContentPane().add(comboBox);

		please.setForeground(Color.RED);
		please.setBounds(433, 59, 326, 20);
		please.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmIpv.getContentPane().add(please);

		JLabel lblPrefixLength_1 = new JLabel("Prefix Length ");
		lblPrefixLength_1.setForeground(Color.WHITE);
		lblPrefixLength_1.setBackground(Color.WHITE);
		lblPrefixLength_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrefixLength_1.setBounds(10, 60, 114, 14);
		frmIpv.getContentPane().add(lblPrefixLength_1);

		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				please.setText("");
				network.setText("");
				prefix.setText("");
				total.setText("");
				range.setText("");
				integerID.setText("");
				input.setText("");
				lblNewLabel_3.setText(""); 
				result.setVisible(false);

			}
		});
		btnReset.setBounds(593, 27, 89, 23);
		frmIpv.getContentPane().add(btnReset);
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(0, 508, 795, 20);
		
		frmIpv.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCreateBygobuuacth = new JLabel("Create by 59160144@go.buu.ac.th  Informatics buu   6-12-2561    version  1.0.0  ");
		lblCreateBygobuuacth.setBounds(325, 0, 460, 14);
		panel_2.add(lblCreateBygobuuacth);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 145, 773, 3);
		frmIpv.getContentPane().add(panel_3);
		
		
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(21, 104, 176, 31);
		frmIpv.getContentPane().add(lblNewLabel_3);

	}

	public void settingAndCalculator() {
		try {
			String val = input.getText();
			String txt = input.getText();

			if (val.equals("")) {
				result.setVisible(false);

			} else {

				val = val + "/" + resultIndex[0];

				String[] valA = val.split("/");
				String ip = valA[0];
				String mask = valA[1];
				String output = "";
				if (val.contains(".")) {

				} else {

					ArrayList<IPv6_result> arr = service.Ipv6(val, ip, mask, txt);
					result.setVisible(true);
					network.setText(arr.get(0).network);
					prefix.setText(arr.get(0).prefix);
					total.setText(arr.get(0).total);
					range.setText(arr.get(0).range);
					HexadecimalID.setText(arr.get(0).hexadecimalID);
					integerID.setText(arr.get(0).integerID);
					please.setText("Successful");
					please.setForeground(Color.blue);
					lblNewLabel_3.setText("Result IPv6 ");
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			result.setVisible(false);
			please.setForeground(Color.RED);
			please.setText("please select Prefix Length and Worng format");
		} catch (Exception e) {
			result.setVisible(false);
			please.setForeground(Color.RED);
			please.setText("please select Prefix Length and Worng format");
			// result.setText("Wrong format."+e.toString());
		}
	}
}
