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

public class Login extends JFrame{
	//umay

	public Login(){
		initComponents(); 
	}

	private void tbx_usr_focus(){
		if(tbx_usr.getText().isEmpty()){
			tbx_usr.setForeground(new Color(128,128,128));
            tbx_usr.setText("Username:");
		}
	}

	private void tbx_usr_lost(){
		if("Username:".equals(tbx_usr.getText())){
         tbx_usr.setText(null);
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
		pnl_left.setBackground(new Color(67,154,151));
		pnl_left.setBounds(0,0,400,646);
		contentPane.add(pnl_left);
		pnl_left.setLayout(null);

		//logo = new ImageIcon("/img/heart.png");
		try{
			BufferedImage bufferedImage = ImageIO.read(new File("img/heart.png"));
			Image image = bufferedImage.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
			ImageIcon icon = new ImageIcon(image);
			JLabel lbl_logo = new JLabel("");
			lbl_logo.setIcon(icon);
			lbl_logo.setBounds(150,250,100,100);
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

		tbx_usr = new JTextPane();
		tbx_usr.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
	//	tbx_usr.setForeground(new Color(0,0,0));
		tbx_usr.setBorder(new EmptyBorder(0, 12, 0, 0));
		tbx_usr.setBackground(new Color(245, 235, 220));
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
	//	tbx_passw.setForeground(new Color(214, 35, 0));
		tbx_passw.setBorder(new EmptyBorder(0, 12, 0, 0));
		tbx_passw.setBackground(new Color(245, 235, 220));
		tbx_passw.setBounds(200, 320, 300, 33);
		pnl_right.add(tbx_passw);

		btn_login = new JButton("Login");
		btn_login.setForeground(Color.WHITE);
		btn_login.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_login.setBorderPainted(false);
		btn_login.setBorder(null);
		btn_login.setBackground(new Color(83, 32, 24));
		btn_login.setBounds(400, 370, 100, 33);
		pnl_right.add(btn_login);

		btn_signin = new JButton("Sign in");
		btn_signin.setForeground(Color.WHITE);
		btn_signin.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_signin.setBorderPainted(false);
		btn_signin.setBorder(null);
		btn_signin.setBackground(new Color(83, 32, 24));
		btn_signin.setBounds(200, 370, 100, 33);
		pnl_right.add(btn_signin);






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

	private JButton btn_login;
	private JButton btn_signin;

	private Image logo;




}