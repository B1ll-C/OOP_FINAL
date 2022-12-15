import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

import java.awt.Image;
import javax.imageio.*;
// left rgba(67,154,151,255)
// right rgba(98,182,183,255)

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;

public class Login extends JFrame{
	

	public Login(){
		initComponents(); 
	}

	private void tbx_usr_focus(){
		
	}

	private void tbx_usr_lost(){
		
	}

	private void btn_login_click(){
		priv.setPriv("admin");
		p = priv.getPriv();
		//System.out.println(priv.getPriv());
		MainMenu m = new MainMenu();
		m.setVisible(true);
		this.dispose();

	}

	private void initComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 646);
		setUndecorated(true);
		setLocationRelativeTo(null);

		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(245,235,220));
		setContentPane(contentPane);
		contentPane.setLayout(null);




		// leftside start

		pnl_left = new JPanel();
		pnl_left.setAlignmentY(Component.TOP_ALIGNMENT);
		pnl_left.setAlignmentX(Component.LEFT_ALIGNMENT);
		// pnl_left.setBackground(new Color(206, 206, 206));
		pnl_left.setBackground(Color.WHITE	);
		pnl_left.setBounds(0,0,400,646);
		contentPane.add(pnl_left);
		pnl_left.setLayout(null);

		//logo = new ImageIcon("/img/heart.png");
		try{
			BufferedImage bufferedImage = ImageIO.read(new File("../img/cross.png"));
			Image image = bufferedImage.getScaledInstance(500, 500, Image.SCALE_DEFAULT);
			ImageIcon icon = new ImageIcon(image);
			JLabel lbl_logo = new JLabel("");
			lbl_logo.setIcon(icon);
			lbl_logo.setBounds(-50,60,500,500);
			pnl_left.add(lbl_logo);
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		

		//leftside end

		//right side
		pnl_right = new JPanel();
		pnl_right.setAlignmentY(Component.TOP_ALIGNMENT);
		pnl_right.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnl_right.setBackground(new Color(98,182,183));
		pnl_right.setBounds(400,0,1054-400,646);
		contentPane.add(pnl_right);
		pnl_right.setLayout(null);


		usr = new JLabel("Username");
		usr.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		usr.setBounds(200, 235, 300, 33);
		pnl_right.add(usr);

		pass = new JLabel("Password");
		pass.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		pass.setBounds(200, 310, 300, 33);
		pnl_right.add(pass);


		tbx_usr = new JTextPane();
		tbx_usr.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		tbx_usr.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_usr.setOpaque(false);
		tbx_usr.setBounds(200, 270, 300, 33);
		pnl_right.add(tbx_usr);
		tbx_usr.addFocusListener(new FocusAdapter(){
			public void focusGained(java.awt.event.FocusEvent evt) {
				tbx_usr_lost();
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
            	
            	tbx_usr_focus();

            }
		});

		tbx_passw = new JPasswordField();
		tbx_passw.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		// tbx_passw.setBackground(new Color(245, 235, 220));
		tbx_passw.setOpaque(false);
		tbx_passw.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.WHITE));
		tbx_passw.setBounds(200, 340, 300, 33);
		pnl_right.add(tbx_passw);

		btn_login = new JButton("Login");
		btn_login.setForeground(Color.WHITE);
		btn_login.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_login.setBorderPainted(false);
		btn_login.setBorder(null);
		btn_login.setBackground(new Color(21, 115, 111));
		btn_login.setBounds(400, 390, 100, 33);
		pnl_right.add(btn_login);

		btn_signin = new JButton("Sign in");
		btn_signin.setForeground(Color.WHITE);
		btn_signin.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_signin.setBorderPainted(false);
		btn_signin.setBorder(null);
		btn_signin.setBackground(new Color(21, 115, 111));
		btn_signin.setBounds(200, 390, 100, 33);
		pnl_right.add(btn_signin);


		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_login_click();
			}
		});






	}

	public static void main(String[] args){
		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					Login login = new Login();
					login.setVisible(true);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}


	//declare variable
	private JPanel pnl_left;
	private JPanel pnl_right;

	private JTextPane tbx_usr;
	private JPasswordField tbx_passw;

	private JLabel usr;
	private JLabel pass;

	private JButton btn_login;
	private JButton btn_signin;

	private Image logo;

	Priv priv = new Priv();
	public static String p;



}