import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Dash_pnl extends Rec_pnl{
	public static JPanel Dash_pnl(){
		JPanel pnl = new JPanel();
		pnl.setLayout(null);
		pnl.setBounds(0,0,1054-200,646-50);


		JLabel lbl = new JLabel("UwU1");
		lbl.setBounds(0,0,100,50);
		pnl.add(lbl);
		pnl.setBackground(Color.WHITE);

		//welcome label
		welcome= new JLabel("Welcome!!!", SwingConstants.CENTER);
		welcome.setBounds(220,0,350,150);
		welcome.setFont(new Font("Barlow Condensed", Font.PLAIN, 50));
		welcome.setLayout(null);
		pnl.add(welcome);

		//recpanel

		JPanel recpanel = new JPanel();
		recpanel.setBounds(50,150,150,200);
		recpanel.setBackground(new Color(103, 137, 131));
		recpanel.setLayout(null);
		pnl.add(recpanel);

		rec= new JLabel("Welcome!!!", SwingConstants.CENTER);
		rec.setBounds(0,30,150,150);
		rec.setFont(new Font("Barlow Condensed", Font.PLAIN, 100));
		rec.setLayout(null);
		recpanel.add(rec);

		JLabel reclbl= new JLabel("Records", SwingConstants.CENTER);
		reclbl.setBounds(0,0,90,50);
		reclbl.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		reclbl.setLayout(null);
		recpanel.add(reclbl);




		//docpanel

		JPanel docpanel = new JPanel();
		docpanel.setBounds(250,150,150,200);
		docpanel.setAlignmentY(Component.TOP_ALIGNMENT);
		docpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		docpanel.setBackground(new Color(103, 137, 131));
		docpanel.setLayout(null);
		pnl.add(docpanel);

		docss= new JLabel("Welcome!!!", SwingConstants.CENTER);
		docss.setBounds(0,30,150,150);
		docss.setFont(new Font("Barlow Condensed", Font.PLAIN, 100));
		docss.setLayout(null);
		docpanel.add(docss);

		JLabel docs= new JLabel("Doctors", SwingConstants.CENTER);
		docs.setBounds(0,0,90,50);
		docs.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		docs.setLayout(null);
		docpanel.add(docs);


		//patpanel
		JPanel patpanel = new JPanel();
		patpanel.setBounds(450,150,150,200);
		patpanel.setAlignmentY(Component.TOP_ALIGNMENT);
		patpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		patpanel.setBackground(new Color(103, 137, 131));
		patpanel.setLayout(null);
		pnl.add(patpanel);

		patients= new JLabel("Welcome!!!", SwingConstants.CENTER);
		patients.setBounds(0,30,150,150);
		patients.setFont(new Font("Barlow Condensed", Font.PLAIN, 100));
		patients.setLayout(null);
		patpanel.add(patients);

		JLabel patientss= new JLabel("Patients", SwingConstants.CENTER);
		patientss.setBounds(0,0,90,50);
		patientss.setFont(new Font("Barlow Condensed", Font.PLAIN, 20));
		patientss.setLayout(null);
		patpanel.add(patientss);





		//panel line
		JPanel paper = new JPanel();
		paper.setBounds(20,120,820,5);
		paper.setAlignmentY(Component.TOP_ALIGNMENT);
		paper.setAlignmentX(Component.LEFT_ALIGNMENT);
		paper.setBackground(new Color(103, 137, 131));
		paper.setLayout(null);
		pnl.add(paper);


		return pnl;



	}
	public static JLabel welcome= new JLabel();
	public static JLabel rec= new JLabel();
	public static JLabel docss= new JLabel();
	public static JLabel patients= new JLabel();
	static String welcom = "";
	public String getwelcom() {
		return welcom;
	}
	public void setwelcom(String welcom) {
		this.welcom = welcom;
	}



}