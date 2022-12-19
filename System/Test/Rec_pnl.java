import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.*;
public class Rec_pnl extends JPanel{
	public static JPanel Rec_pnl(){
		JPanel pnl = new JPanel();
		// pnl.setBackground(Color.WH);
		pnl.setLayout(null);
		pnl.setBounds(0,0,1054-200,646-50);
		JLabel lbl = new JLabel("UwU4");
		lbl.setBounds(0,0,100,50);
		pnl.setBackground(Color.WHITE);

		//Center Panel
		JPanel Panelcenter = new JPanel();
		Panelcenter.setBounds(30,30,790,540);
		Panelcenter.setBackground(new Color(240, 233, 210));
		pnl.add(Panelcenter);
		Panelcenter.setLayout(null);

		//Top Panel
		JPanel paper = new JPanel();
		paper.setBounds(0,0,790,20);
		paper.setAlignmentY(Component.TOP_ALIGNMENT);
		paper.setAlignmentX(Component.LEFT_ALIGNMENT);
		paper.setBackground(new Color(103, 137, 131));
		paper.setLayout(null);
		Panelcenter.add(paper);


		//PatientPanel
		JPanel PatientPanel = new JPanel();
		PatientPanel.setBounds(20,40,200,50);
		PatientPanel.setBackground(new Color(178, 178, 178));
		PatientPanel.setLayout(null);
		Panelcenter.add(PatientPanel);

		JTextPane Patienttxt = new JTextPane();
		Patienttxt.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		Patienttxt.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		Patienttxt.setOpaque(false);
		Patienttxt.setBounds(0, 30, 200, 20);
		Patienttxt.setLayout(null);
		PatientPanel.add(Patienttxt);

		JLabel Patientlbl = new JLabel("Patient ID:");
		Patientlbl.setBounds(0,0,100,20);
		Patientlbl.setLayout(null);
		PatientPanel.add(Patientlbl);


		//LastNamePanel
		JPanel LastNamePanel = new JPanel();
		LastNamePanel.setBounds(20,100,200,50);
		LastNamePanel.setBackground(new Color(178, 178, 178));
		LastNamePanel.setLayout(null);
		Panelcenter.add(LastNamePanel);

		JTextPane LastName = new JTextPane();
		LastName.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		LastName.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		LastName.setOpaque(false);
		LastName.setBounds(0, 30, 200, 20);
		LastName.setLayout(null);
		LastNamePanel.add(LastName);

		JLabel LastNamelbl = new JLabel("LastName:");
		LastNamelbl.setBounds(0,0,100,20);
		LastNamelbl.setLayout(null);
		LastNamePanel.add(LastNamelbl);


		//AddressPanel
		JPanel AddressPanel = new JPanel();
		AddressPanel.setBounds(20,160,550,50);
		AddressPanel.setBackground(new Color(178, 178, 178));
		AddressPanel.setLayout(null);
		Panelcenter.add(AddressPanel);

		JTextPane Address = new JTextPane();
		Address.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		Address.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		Address.setOpaque(false);
		Address.setBounds(0, 30, 550, 20);
		Address.setLayout(null);
		AddressPanel.add(Address);

		JLabel Addresslbl = new JLabel("Address:");
		Addresslbl.setBounds(0,0,100,20);
		Addresslbl.setLayout(null);
		AddressPanel.add(Addresslbl);


		//TelPhoneNoPanel
		JPanel TelPhoneNoPanel = new JPanel();
		TelPhoneNoPanel.setBounds(20,220,550,50);
		TelPhoneNoPanel.setBackground(new Color(178, 178, 178));
		TelPhoneNoPanel.setLayout(null);
		Panelcenter.add(TelPhoneNoPanel);

		JTextPane TelephoneNo = new JTextPane();
		TelephoneNo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		TelephoneNo.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		TelephoneNo.setOpaque(false);
		TelephoneNo.setBounds(0, 30, 550, 20);
		TelephoneNo.setLayout(null);
		TelPhoneNoPanel.add(TelephoneNo);

		JLabel Telephonelbl = new JLabel("Address:");
		Telephonelbl.setBounds(0,0,100,20);
		Telephonelbl.setLayout(null);
		TelPhoneNoPanel.add(Telephonelbl);



		// pnl.add(lbl);
		return pnl;

	}

}