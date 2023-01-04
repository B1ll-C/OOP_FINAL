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
		JPanel pek = Dash_pnl.Dash_pnl();
		pek.setBounds(0,0,100,100);
		pek.setBackground(Color.WHITE);
		pnl_main.add(pek);


	}
	private void UwU(){
		pnl_dash.setVisible(false);
		pnl_doc.setVisible(false);
		pnl_pat.setVisible(false);
		pnl_rec.setVisible(false);
		pnl_rep.setVisible(false);
				
		}

	private void logout(){
		// Login.setVisible(true)
		Login l = new Login();
		l.setVisible(true);
		this.dispose();
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

		btn_logout = new JButton("Logout");
		btn_logout.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btn_logout.setBounds(1054-100,0,100,50);
		btn_logout.setBackground(new Color(21, 115, 111));
		btn_logout.setForeground(Color.WHITE);
		pnl_top.add(btn_logout);



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
			lbl_logo.setBounds(50,5,size,size);
			pnl_usr.add(lbl_logo);
		
		}
		catch(Exception e){
			System.out.println(e);
		}

		// Login priv = new Login();
		lbl_priv = new JLabel(Login.p);
		lbl_priv.setFont(new Font("Barlow Condensed", Font.BOLD, 24));
		// lbl_priv.setForeground(new Color(255,255,255));

		lbl_priv.setAlignmentY(Component.TOP_ALIGNMENT);
		lbl_priv.setAlignmentX(Component.LEFT_ALIGNMENT);
		lbl_priv.setBounds(20,110,100,30);
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

		// btn_rep = new JButton("Reports");
		// btn_rep.setForeground(Color.WHITE);
		// btn_rep.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		// btn_rep.setBorderPainted(false);
		// btn_rep.setBorder(null);
		// btn_rep.setBackground(new Color(21, 115, 111));
		// btn_rep.setBounds(25, 270+y, 150, 33);
		// pnl_left.add(btn_rep);

		//pnl left end


		//pnl main
		pnl_main = new JPanel();
		pnl_main.setAlignmentY(Component.TOP_ALIGNMENT);
		pnl_main.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnl_main.setBackground(new Color(0,0,0));
		pnl_main.setBounds(200,50,1054-200,646-50);
		contentPane.add(pnl_main);
		pnl_main.setLayout(null);





		pnl_dash 	= Dash_pnl.Dash_pnl();
		// pnl_dash 	=  Doc_pnl.Doc_pnl() ;
		pnl_doc 	= Doc_pnl.Doc_pnl();
		pnl_pat		= Pat_pnl.Pat_pnl();
		pnl_rec		= Rec_pnl.Rec_pnl();
		pnl_rep		= Rep_pnl.Rep_pnl();

		// pnl_dash.setBackground(Color.WHITE);
		// pnl_doc.setBackground(Color.BLACK);
		// pnl_pat.setBackground(Color.RED)
		// pnl_rec.setBackground(Color.GREEN)
		// pnl_rep.setBackground(Color.BLUE)

		
		// pnl_dash.setVisible(false);
		pnl_main.add(pnl_dash);
		pnl_main.add(pnl_doc);
		pnl_main.add(pnl_pat);
		pnl_main.add(pnl_rec);
		pnl_main.add(pnl_rep);
		UwU();
		// System.out.println(pnl_dash.isDisplayable());
		

		//Events
		btn_dash.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				UwU();
				pnl_dash.setVisible(true);

				Rec_pnl umay = new Rec_pnl();
				int label = umay.getsearch();
				Dash_pnl.rec.setText(String.valueOf(label));

				Doc_pnl docs = new Doc_pnl();
				int label1 = docs.getCountings();
				Dash_pnl.docss.setText(String.valueOf(label1));

				Pat_pnl pat = new Pat_pnl();
				int label2 = pat.getCountings();
				Dash_pnl.patients.setText(String.valueOf(label2));


				
				// System.out.println(pnl_dash.isDisplayable());

			}
		});

		btn_doc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				UwU();
				pnl_doc.setVisible(true);
				
				// System.out.println(pnl_doc.isDisplayable());

			}
		});

		btn_pat.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				UwU();
				pnl_pat.setVisible(true);
				
				// System.out.println(pnl_dash.isDisplayable());

			}
		});

		btn_rec.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				UwU();
				pnl_rec.setVisible(true);
		
				// System.out.println(pnl_dash.isDisplayable());

			}
		});


		// btn_rep.addActionListener(new ActionListener(){
		// 	public void actionPerformed(ActionEvent e){
		// 		UwU();
		// 		pnl_rep.setVisible(true);

		// 		System.out.println("rep");

		// 	}
		// });

		btn_logout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				logout();
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

	private JPanel pnl_dash;
	private JPanel pnl_doc;
	private JPanel pnl_pat;
	private JPanel pnl_rec;
	private JPanel pnl_rep;

	private JLabel lbl_title;

	private JButton btn_logout;





}	