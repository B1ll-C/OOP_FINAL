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
		pnl_top.setBackground(new Color(67,154,151));
		pnl_top.setBounds(0,0,1054,100);
		contentPane.add(pnl_top);
		pnl_top.setLayout(null);

		try{
			int size = 75;
			BufferedImage bufferedImage = ImageIO.read(new File("../img/doctor.png"));
			Image image = bufferedImage.getScaledInstance(size, size, Image.SCALE_DEFAULT);
			ImageIcon icon = new ImageIcon(image);
			JLabel lbl_logo = new JLabel("");
			lbl_logo.setIcon(icon);
			lbl_logo.setBounds(70,5,size,size);
			pnl_top.add(lbl_logo);
		
		}
		catch(Exception e){
			System.out.println(e);
		}


		lbl_priv = new JLabel("Admin");
		lbl_priv.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		lbl_priv.setForeground(new Color(255,255,255));
		lbl_priv.setAlignmentY(Component.TOP_ALIGNMENT);
		lbl_priv.setAlignmentX(Component.LEFT_ALIGNMENT);
		lbl_priv.setBounds(77,75,100,30);
		pnl_top.add(lbl_priv);
		// lbl_priv.setBounds()


		//top panel end



		//pnl left start
		pnl_left = new JPanel();
		pnl_left.setAlignmentY(Component.TOP_ALIGNMENT);
		pnl_left.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnl_left.setBackground(new Color(110, 189, 186));
		pnl_left.setBounds(0,100,200,546);
		contentPane.add(pnl_left);
		pnl_left.setLayout(null);

	
		int y = 50;
		btn_cc = new JButton("Consulting");
		btn_cc.setForeground(Color.WHITE);
		btn_cc.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_cc.setBorderPainted(false);
		btn_cc.setBorder(null);
		btn_cc.setBackground(new Color(21, 115, 111));
		btn_cc.setBounds(25, 30+y, 150, 33);
		pnl_left.add(btn_cc);

		btn_his = new JButton("Information System");
		btn_his.setForeground(Color.WHITE);
		btn_his.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_his.setBorderPainted(false);
		btn_his.setBorder(null);
		btn_his.setBackground(new Color(21, 115, 111));
		btn_his.setBounds(25, 90+y, 150, 33);
		pnl_left.add(btn_his);

		btn_cc = new JButton("Consulting");
		btn_cc.setForeground(Color.WHITE);
		btn_cc.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_cc.setBorderPainted(false);
		btn_cc.setBorder(null);
		btn_cc.setBackground(new Color(21, 115, 111));
		btn_cc.setBounds(25, 150+y, 150, 33);
		pnl_left.add(btn_cc);

		btn_cc = new JButton("Consulting");
		btn_cc.setForeground(Color.WHITE);
		btn_cc.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		btn_cc.setBorderPainted(false);
		btn_cc.setBorder(null);
		btn_cc.setBackground(new Color(21, 115, 111));
		btn_cc.setBounds(25, 210+y, 150, 33);
		pnl_left.add(btn_cc);

		//pnl left end


		
		

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
	private JPanel pnl_main;

	private JLabel lbl_priv;

	private JButton btn_cc;
	private JButton btn_his;
	private JButton btn_ir;
	private JButton btn_csa;



}	