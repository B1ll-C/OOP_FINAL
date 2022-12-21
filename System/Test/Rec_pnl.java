import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

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


		//SexPanel
		JPanel SexPanel = new JPanel();
		SexPanel.setBounds(230,40,110,50);
		SexPanel.setBackground(new Color(178, 178, 178));
		SexPanel.setLayout(null);
		Panelcenter.add(SexPanel);

		JTextPane Sextxt = new JTextPane();
		Sextxt.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		Sextxt.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		Sextxt.setOpaque(false);
		Sextxt.setBounds(0, 30, 110, 20);
		Sextxt.setLayout(null);
		SexPanel.add(Sextxt);

		JLabel Sexlbl= new JLabel("Sex:");
		Sexlbl.setBounds(0,0,100,20);
		Sexlbl.setLayout(null);
		SexPanel.add(Sexlbl);



		//AgePanel
		JPanel AgePanel = new JPanel();
		AgePanel.setBounds(345,40,110,50);
		AgePanel.setBackground(new Color(178, 178, 178));
		AgePanel.setLayout(null);
		Panelcenter.add(AgePanel);

		JTextPane Agetxt = new JTextPane();
		Agetxt.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		Agetxt.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		Agetxt.setOpaque(false);
		Agetxt.setBounds(0, 30, 110, 20);
		Agetxt.setLayout(null);
		AgePanel.add(Agetxt);

		JLabel Agelbl= new JLabel("Age:");
		Agelbl.setBounds(0,0,100,20);
		Agelbl.setLayout(null);
		AgePanel.add(Agelbl);


		//BloodTypePanel
		JPanel BloodTypePanel = new JPanel();
		BloodTypePanel.setBounds(460,40,110,50);
		BloodTypePanel.setBackground(new Color(178, 178, 178));
		BloodTypePanel.setLayout(null);
		Panelcenter.add(BloodTypePanel);

		JTextPane BloodType = new JTextPane();
		BloodType.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		BloodType.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		BloodType.setOpaque(false);
		BloodType.setBounds(0, 30, 110, 20);
		BloodType.setLayout(null);
		BloodTypePanel.add(BloodType);

		JLabel BloodTypelbl= new JLabel("Blood Type:");
		BloodTypelbl.setBounds(0,0,100,20);
		BloodTypelbl.setLayout(null);
		BloodTypePanel.add(BloodTypelbl);


		//LastNamePanel
		JPanel LastNamePanel = new JPanel();
		LastNamePanel.setBounds(20,100,270,50);
		LastNamePanel.setBackground(new Color(178, 178, 178));
		LastNamePanel.setLayout(null);
		Panelcenter.add(LastNamePanel);

		JTextPane LastName = new JTextPane();
		LastName.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		LastName.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		LastName.setOpaque(false);
		LastName.setBounds(0, 30, 280, 20);
		LastName.setLayout(null);
		LastNamePanel.add(LastName);

		JLabel LastNamelbl = new JLabel("LastName:");
		LastNamelbl.setBounds(0,0,100,20);
		LastNamelbl.setLayout(null);
		LastNamePanel.add(LastNamelbl);


		//FirstNamePanel
		JPanel FirstNamePanel = new JPanel();
		FirstNamePanel.setBounds(300,100,270,50);
		FirstNamePanel.setBackground(new Color(178, 178, 178));
		FirstNamePanel.setLayout(null);
		Panelcenter.add(FirstNamePanel);

		JTextPane FirstNametxt = new JTextPane();
		FirstNametxt.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		FirstNametxt.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		FirstNametxt.setOpaque(false);
		FirstNametxt.setBounds(0, 30, 280, 20);
		FirstNametxt.setLayout(null);
		FirstNamePanel.add(FirstNametxt);

		JLabel FirstNamelbl = new JLabel("FirstName:");
		FirstNamelbl.setBounds(0,0,100,20);
		FirstNamelbl.setLayout(null);
		FirstNamePanel.add(FirstNamelbl);


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
		TelPhoneNoPanel.setBounds(20,220,180,50);
		TelPhoneNoPanel.setBackground(new Color(178, 178, 178));
		TelPhoneNoPanel.setLayout(null);
		Panelcenter.add(TelPhoneNoPanel);

		JTextPane TelephoneNo = new JTextPane();
		TelephoneNo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		TelephoneNo.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		TelephoneNo.setOpaque(false);
		TelephoneNo.setBounds(0, 30, 200, 20);
		TelephoneNo.setLayout(null);
		TelPhoneNoPanel.add(TelephoneNo);

		JLabel Telephonelbl = new JLabel("Telephone No.:");
		Telephonelbl.setBounds(0,0,100,20);
		Telephonelbl.setLayout(null);
		TelPhoneNoPanel.add(Telephonelbl);


		//EmailAddPanel
		JPanel EmailAddPanel = new JPanel();
		EmailAddPanel.setBounds(210,220,180,50);
		EmailAddPanel.setBackground(new Color(178, 178, 178));
		EmailAddPanel.setLayout(null);
		Panelcenter.add(EmailAddPanel);

		JTextPane EmailAdd = new JTextPane();
		EmailAdd.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		EmailAdd.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		EmailAdd.setOpaque(false);
		EmailAdd.setBounds(0, 30, 200, 20);
		EmailAdd.setLayout(null);
		EmailAddPanel.add(EmailAdd);

		JLabel EmailAddlbl = new JLabel("Email Address:");
		EmailAddlbl.setBounds(0,0,100,20);
		EmailAddlbl.setLayout(null);
		EmailAddPanel.add(EmailAddlbl);


		//Height
		JPanel HeightPanel = new JPanel();
		HeightPanel.setBounds(410,220,180,50);
		HeightPanel.setBackground(new Color(178, 178, 178));
		HeightPanel.setLayout(null);
		Panelcenter.add(HeightPanel);

		JTextPane Height = new JTextPane();
		Height.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		Height.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		Height.setOpaque(false);
		Height.setBounds(0, 30, 200, 20);
		Height.setLayout(null);
		HeightPanel.add(Height);

		JLabel Heightlbl = new JLabel("Height:");
		Heightlbl.setBounds(0,0,100,20);
		Heightlbl.setLayout(null);
		HeightPanel.add(Heightlbl);


		//WeightPanel
		JPanel WeightPanel = new JPanel();
		WeightPanel.setBounds(600,220,180,50);
		WeightPanel.setBackground(new Color(178, 178, 178));
		WeightPanel.setLayout(null);
		Panelcenter.add(WeightPanel);

		JTextPane Weight = new JTextPane();
		Weight.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE));
		Weight.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		Weight.setOpaque(false);
		Weight.setBounds(0, 30, 200, 20);
		Weight.setLayout(null);
		WeightPanel.add(Weight);

		JLabel Weightlbl = new JLabel("Weight:");
		Weightlbl.setBounds(0,0,100,20);
		Weightlbl.setLayout(null);
		WeightPanel.add(Weightlbl);

		//Button
		JButton submit = new JButton("Submit");
		submit.setForeground(Color.WHITE);
		submit.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		submit.setBorderPainted(false);
		submit.setBorder(null);
		submit.setBackground(new Color(21, 115, 111));
		submit.setBounds(25, 290	, 150, 33);
		Panelcenter.add(submit);

		//Table
		JScrollPane pane = new JScrollPane();
		pane.setBounds(20, 330, 750, 200);

		JTable j = new JTable();
		//j.setBounds(20, 330, 750, 200);
		DefaultTableModel model = new DefaultTableModel();
		Object[] column = {"PatientID", "Sex", "Age", "BloodType","LastName",
				"FirstName", "Address", "TelNo.","EmailAddress","Height","Weight"};
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		j.setModel(model);
		pane.setViewportView(j);
		Panelcenter.add(pane);

		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if( Patienttxt.getText().equals("") || Sextxt.getText().equals("") || Agetxt.getText().equals("") || BloodType.getText().equals("") ||
				LastName.getText().equals("") || FirstNametxt.getText().equals("") || Address.getText().equals("") || TelephoneNo.getText().equals("") ||
				EmailAdd.getText().equals("") || Height.getText().equals("") || Weight.getText().equals("")){
					JOptionPane.showInputDialog(this,"Fill the Fields");

				}else{
					String data[] = {Patienttxt.getText(),Sextxt.getText(),Agetxt.getText(),BloodType.getText(),LastName.getText(),
							FirstNametxt.getText(), Address.getText(),TelephoneNo.getText(),EmailAdd.getText(), Height.getText(),
							Weight.getText()};
					model.addRow(data);
					JOptionPane.showInputDialog(this,"yey");

				}
				//model.addRow(row);
			}
		});





		// pnl.add(lbl);
		return pnl;

	}

}