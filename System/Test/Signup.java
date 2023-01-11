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

public class Signup extends JFrame{
	

	public Signup(){
		initComponents(); 
	}

	private void tbx_usr_focus(){
		
	}

	private void tbx_usr_lost(){
		
	}

	private void btn_login_click(String usr, String passw){
		if(usr.equals(passw)){
		priv.setPriv(usr);
		p = priv.getPriv();
		//System.out.println(priv.getPriv());
		MainMenu m = new MainMenu();
		m.setVisible(true);
		this.dispose();
		}  else{
			 JOptionPane.showMessageDialog(null, "Wrong Username or Password");
		}

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


		btn_exit = new JButton("Exit");
		btn_exit.setForeground(Color.WHITE);
		btn_exit.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_exit.setBorderPainted(false);
		btn_exit.setBorder(null);
		btn_exit.setBackground(new Color(21, 115, 111));
		btn_exit.setBounds(500,10 , 100, 33);
		pnl_right.add(btn_exit);



		int x = 30;

		name = new JLabel("Full Name");
		name.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		name.setBounds(200, 235-75-75+x, 300, 33);
		pnl_right.add(name);

		cont = new JLabel("Contact No.");
		cont.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		cont.setBounds(200, 235-75+x, 300, 33);
		pnl_right.add(cont);

		usr = new JLabel("Username");
		usr.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		usr.setBounds(200, 235+x, 300, 33);
		pnl_right.add(usr);

		pass = new JLabel("Password");
		pass.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		pass.setBounds(200, 310+x, 300, 33);
		pnl_right.add(pass);


		tbx_name = new JTextField();
		tbx_name.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		tbx_name.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_name.setOpaque(false);
		tbx_name.setBounds(200, 270-70-75+x, 300, 33);
		pnl_right.add(tbx_name);

		tbx_cont = new JTextField();
		tbx_cont.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		tbx_cont.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_cont.setOpaque(false);
		tbx_cont.setBounds(200, 270-70+x, 300, 33);
		pnl_right.add(tbx_cont);

		tbx_usr = new JTextField();
		tbx_usr.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		tbx_usr.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_usr.setOpaque(false);
		tbx_usr.setBounds(200, 270+x, 300, 33);
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

		// btn_login = new JButton("Login");
		// btn_login.setForeground(Color.WHITE);
		// btn_login.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		// btn_login.setBorderPainted(false);
		// btn_login.setBorder(null);
		// btn_login.setBackground(new Color(21, 115, 111));
		// btn_login.setBounds(400, 390, 100, 33);
		// pnl_right.add(btn_login);

		btn_signin = new JButton("Sign in");
		btn_signin.setForeground(Color.WHITE);
		btn_signin.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_signin.setBorderPainted(false);
		btn_signin.setBorder(null);
		btn_signin.setBackground(new Color(21, 115, 111));
		btn_signin.setBounds(200, 390, 100, 33);
		pnl_right.add(btn_signin);


		// btn_login.addActionListener(new ActionListener() {
		// 	public void actionPerformed(ActionEvent e) {
		// 		btn_login_click(tbx_usr.getText(),tbx_passw.getText());
		// 	}
		// });
		btn_signin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){

				if(tbx_usr.getText().isEmpty() || tbx_passw.getText().isEmpty() || tbx_name.getText().isEmpty() || tbx_cont.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Fill All Textbox", "Log in", JOptionPane.INFORMATION_MESSAGE);
				} else {
				JOptionPane.showMessageDialog(null, "New Account", "Signup", JOptionPane.INFORMATION_MESSAGE);
				Login l = new Login();	
				l.setVisible(true);
				dispose();
				}
			}
		});

		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// btn_login_click(tbx_usr.getText());
				dispose();
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

	private JTextField tbx_name;
	private JTextField tbx_cont;
	private JTextField tbx_usr;	
	private JPasswordField tbx_passw;

	private JLabel usr;
	private JLabel pass;
	private JLabel name;
	private JLabel cont;

	private JButton btn_login;
	private JButton btn_signin;

	private JButton btn_exit;

	private Image logo;

	Priv priv = new Priv();
	public static String p;



}