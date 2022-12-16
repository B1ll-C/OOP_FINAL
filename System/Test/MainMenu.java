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

public class MainMenu extends JFrame{


	private void btn_dash_click(){	
		


	}

	public MainMenu(){
		//Priv priv = new Priv();
		System.out.println(Login.p);
		initComponents();
	}
	public  void initComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1054, 646);
		setUndecorated(true);
		setLocationRelativeTo(null);

		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(245,235,220));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//top panel
		pnl_top = new JPanel();
		pnl_top.setAlignmentY(Component.TOP_ALIGNMENT);
		pnl_top.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnl_top.setBackground(new Color(102, 156, 159));
		pnl_top.setBounds(0,0,1054,50);
		contentPane.add(pnl_top);
		pnl_top.setLayout(null);

		
		lbl_title = new JLabel("PATIENTS EVALUATION SYSTEM");
		lbl_title.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		lbl_title.setForeground(new Color(255,255,255));
		lbl_title.setAlignmentY(Component.TOP_ALIGNMENT);
		lbl_title.setAlignmentX(Component.LEFT_ALIGNMENT);
		lbl_title.setBounds(450,10,500,30);
		pnl_top.add(lbl_title);


		//top panel end



		//pnl left start
		pnl_left = new JPanel();
		pnl_left.setAlignmentY(Component.TOP_ALIGNMENT);
		pnl_left.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnl_left.setBackground(new Color(114, 201, 205));
		pnl_left.setBounds(0,50,200,596);
		contentPane.add(pnl_left);
		pnl_left.setLayout(null);

		pnl_usr = new JPanel();
		pnl_usr.setAlignmentY(Component.TOP_ALIGNMENT);
		pnl_usr.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnl_usr.setBounds(0,0,200,200);
		pnl_usr.setBackground(new Color(114, 201, 205));
		pnl_left.add(pnl_usr);
		pnl_usr.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.WHITE));
		pnl_usr.setLayout(null);


		try{
			int size = 100;
			BufferedImage bufferedImage = ImageIO.read(new File("../img/doctor.png"));
			Image image = bufferedImage.getScaledInstance(size, size, Image.SCALE_DEFAULT);
			ImageIcon icon = new ImageIcon(image);
			JLabel lbl_logo = new JLabel("");
			lbl_logo.setIcon(icon);
			lbl_logo.setBounds(70,5,size,size);
			pnl_usr.add(lbl_logo);
		
		}
		catch(Exception e){
			System.out.println(e);
		}


		lbl_priv = new JLabel("Admin");
		lbl_priv.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		lbl_priv.setForeground(new Color(255,255,255));
		lbl_priv.setAlignmentY(Component.TOP_ALIGNMENT);
		lbl_priv.setAlignmentX(Component.LEFT_ALIGNMENT);
		lbl_priv.setBounds(20,100,100,30);
		pnl_usr.add(lbl_priv);
		// lbl_priv.setBounds()

	
		int y = 200;
		btn_dash = new JButton("Dashboard");
		btn_dash.setForeground(Color.WHITE);
		btn_dash.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_dash.setBorderPainted(false);
		btn_dash.setBorder(null);
		btn_dash.setBackground(new Color(21, 115, 111));
		btn_dash.setBounds(25, 30+y, 150, 33);
		pnl_left.add(btn_dash);

		btn_doc = new JButton("Doctors");
		btn_doc.setForeground(Color.WHITE);
		btn_doc.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_doc.setBorderPainted(false);
		btn_doc.setBorder(null);
		btn_doc.setBackground(new Color(21, 115, 111));
		btn_doc.setBounds(25, 90+y, 150, 33);
		pnl_left.add(btn_doc);

		btn_pat = new JButton("Patients");
		btn_pat.setForeground(Color.WHITE);
		btn_pat.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_pat.setBorderPainted(false);
		btn_pat.setBorder(null);
		btn_pat.setBackground(new Color(21, 115, 111));
		btn_pat.setBounds(25, 150+y, 150, 33);
		pnl_left.add(btn_pat);

		btn_rec = new JButton("Records");
		btn_rec.setForeground(Color.WHITE);
		btn_rec.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_rec.setBorderPainted(false);
		btn_rec.setBorder(null);
		btn_rec.setBackground(new Color(21, 115, 111));
		btn_rec.setBounds(25, 210+y, 150, 33);
		pnl_left.add(btn_rec);

		btn_rep = new JButton("Reports");
		btn_rep.setForeground(Color.WHITE);
		btn_rep.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_rep.setBorderPainted(false);
		btn_rep.setBorder(null);
		btn_rep.setBackground(new Color(21, 115, 111));
		btn_rep.setBounds(25, 270+y, 150, 33);
		pnl_left.add(btn_rep);

		//pnl left end


		//pnl main
		pnl_main = new JPanel();
		pnl_main.setAlignmentY(Component.TOP_ALIGNMENT);
		pnl_main.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnl_main.setBackground(new Color(0,0,0));
		pnl_main.setBounds(200,50,1054-200,646-50);
		contentPane.add(pnl_main);
		pnl_main.setLayout(null);

		Dash_pnl p = new Dash_pnl();
		p.setBounds(0,0,1054-200,646-50);

		pnl_main.add(p);
		//


		//Events
		btn_dash.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btn_dash_click();
			}
		});


		
		

	}
	public static void main(String[] args){
		System.out.println("Hello World");
		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					MainMenu mm = new MainMenu();
					mm.setVisible(true);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}

	//declare Variables
	private JPanel pnl_top;
	private JPanel pnl_left;
	public JPanel pnl_main;

	private JPanel pnl_usr;

	private JLabel lbl_priv;

	private JButton btn_dash;
	private JButton btn_doc;
	private JButton btn_pat;
	private JButton btn_rec;
	private JButton btn_rep;

	private JLabel lbl_title;



}	