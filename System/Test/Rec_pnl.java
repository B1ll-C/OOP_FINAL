	import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.*;

public class Rec_pnl extends JPanel{
	public static JPanel Rec_pnl(){
		JPanel pnl = new JPanel();
		// pnl.setBackground(Color.WH);
		pnl.setLayout(null);
		pnl.setBounds(0,0,1054-200,646-50);


		JLabel lbl = new JLabel("UwU4");
		lbl.setBounds(0,0,100,50);
		pnl.setBackground(Color.WHITE);
		pnl.add(lbl);
		lbl.setVisible(false);




		//Center Panel
		JPanel Panelcenter = new JPanel();
		Panelcenter.setBounds(30,50,790,540);
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

		JButton delete = new JButton("Delete");
		delete.setForeground(Color.WHITE);
		delete.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		delete.setBorderPainted(false);
		delete.setBorder(null);
		delete.setBackground(new Color(21, 115, 111));
		delete.setBounds(200, 290	, 150, 33);
		Panelcenter.add(delete);

		JButton update = new JButton("Update");
		update.setForeground(Color.WHITE);
		update.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		update.setBorderPainted(false);
		update.setBorder(null);
		update.setBackground(new Color(21, 115, 111));
		update.setBounds(380, 290	, 150, 33);
		Panelcenter.add(update);

		JButton photo = new JButton("Browse Photo");
		photo.setForeground(Color.WHITE);
		photo.setFont(new Font("Barlow Condensed", Font.BOLD, 18));
		photo.setBorderPainted(false);
		photo.setBorder(null);
		photo.setBackground(new Color(21, 115, 111));
		photo.setBounds(560, 290	, 150, 33);
		Panelcenter.add(photo);


		//Table
		JScrollPane pane = new JScrollPane();
		pane.setBounds(20, 330, 750, 200);

		JTable j = new JTable();
		//j.setBounds(20, 330, 750, 200);
		DefaultTableModel model = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return  false;
			}
		};
		Object[] column = {"PatientID", "Sex", "Age", "BloodType","LastName",
				"FirstName", "Address", "TelNo.","EmailAddress","Height","Weight","Photo"};


		//j.getColumn(11).setCellRenderer(new myTableCellRenderer());
		Object[] row = new Object[0];
		model.setColumnIdentifiers(column);
		j.getTableHeader().setResizingAllowed(false);


		j.setModel(model);
		j.getColumnModel().getColumn(11).setCellRenderer(new myTableCellRenderer());
		pane.setViewportView(j);
		Panelcenter.add(pane);


		//Label picture
		JLabel photolbl = new JLabel();
		photolbl.setBounds(580,30,185,185);
		photolbl.setBackground(Color.CYAN);
		photolbl.setLayout(null);
		Panelcenter.add(photolbl);


		//Search
		JTextPane search = new JTextPane();
		search.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
		search.setFont(new Font("Barlow Condensed", Font.PLAIN, 15));
		search.setOpaque(false);
		search.setBounds(200, 20, 200, 20);
		search.setLayout(null);
		pnl.add(search);

		searchlbl = new JLabel("Search:");
		searchlbl.setBounds(150,20,100,20);
		searchlbl.setLayout(null);
		pnl.add(searchlbl);

		search.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					System.out.println();
					TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) j.getModel()));
					// TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) tab.getModel()));
					sorter.setRowFilter(RowFilter.regexFilter(search.getText()));

					j.setRowSorter(sorter);
					// final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
				}
			}
		});

		search.addFocusListener(new FocusAdapter(){
			public void focusGained(FocusEvent e){
				search.setText("");
			}

			public void focusLost(FocusEvent e){
				search.setText("");
			}
		});




		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if( Patienttxt.getText().equals("") || Sextxt.getText().equals("") || Agetxt.getText().equals("") || BloodType.getText().equals("") ||
				LastName.getText().equals("") || FirstNametxt.getText().equals("") || Address.getText().equals("") || TelephoneNo.getText().equals("") ||
				EmailAdd.getText().equals("") || Height.getText().equals("") || Weight.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Fill the Fields");

				}else{
					JLabel imagelbl = new JLabel();
					ImageIcon imgic = new ImageIcon(selectedimgpath);
					imagelbl.setIcon(imgic);


					String data[] = {Patienttxt.getText(),Sextxt.getText(),Agetxt.getText(),BloodType.getText(),LastName.getText(),
							FirstNametxt.getText(), Address.getText(),TelephoneNo.getText(),EmailAdd.getText(), Height.getText(),
							Weight.getText(), photolbl.getIcon().toString() };
					model.addRow(data);

					umay = j.getRowCount();
					lbl.setText(String.valueOf(umay));


					JOptionPane.showMessageDialog(null,"Submitted");

					Patienttxt.setText("");
					Sextxt.setText("");
					Agetxt.setText("");
					BloodType.setText("");
					LastName.setText("");
					FirstNametxt.setText("");
					Address.setText("");
					TelephoneNo.setText("");
					EmailAdd.setText("");
					Height.setText("");
					Weight.setText("");

				}
				//model.addRow(row);
			}
		});

		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(j.getSelectedRowCount() == 1){
					model.removeRow(j.getSelectedRow());
					umay = j.getRowCount();
					lbl.setText(String.valueOf(umay));

				}else{


					if(model.getRowCount() == 0){
						JOptionPane.showMessageDialog(null,"Deleted");
						Patienttxt.setText("");
						Sextxt.setText("");
						Agetxt.setText("");
						BloodType.setText("");
						LastName.setText("");
						FirstNametxt.setText("");
						Address.setText("");
						TelephoneNo.setText("");
						EmailAdd.setText("");
						Height.setText("");
						Weight.setText("");

					}else{
						JOptionPane.showMessageDialog(null,"Select Row");
					}
				}
			}
		});

		j.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String tblPID = model.getValueAt(j.getSelectedRow(),0).toString();
				String tblsex = model.getValueAt(j.getSelectedRow(),1).toString();
				String tblage = model.getValueAt(j.getSelectedRow(),2).toString();
				String tblbloodt = model.getValueAt(j.getSelectedRow(),3).toString();
				String tblLastN = model.getValueAt(j.getSelectedRow(),4).toString();
				String tblFirstN = model.getValueAt(j.getSelectedRow(),5).toString();
				String tblAddress = model.getValueAt(j.getSelectedRow(),6).toString();
				String tblTNo = model.getValueAt(j.getSelectedRow(),7).toString();
				String tblEadd = model.getValueAt(j.getSelectedRow(),8).toString();
				String tblheight = model.getValueAt(j.getSelectedRow(),9).toString();
				String tblweight = model.getValueAt(j.getSelectedRow(),10).toString();

				Patienttxt.setText(tblPID);
				Sextxt.setText(tblsex);
				Agetxt.setText(tblage);
				BloodType.setText(tblbloodt);
				LastName.setText(tblLastN);
				FirstNametxt.setText(tblFirstN);
				Address.setText(tblAddress);
				TelephoneNo.setText(tblTNo);
				EmailAdd.setText(tblEadd);
				Height.setText(tblheight);
				Weight.setText(tblweight);
			}
		});


		update.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(j.getSelectedRowCount() == 1){
					String patientid = Patienttxt.getText();
					String sex = Sextxt.getText();
					String age = Agetxt.getText();
					String bloodt = BloodType.getText();
					String lastN = LastName.getText();
					String firstN = FirstNametxt.getText();
					String address = Address.getText();
					String telNo = TelephoneNo.getText();
					String emailadd = EmailAdd.getText();
					String height = Height.getText();
					String weight = Weight.getText();

					model.setValueAt(patientid, j.getSelectedRow(), 0);
					model.setValueAt(sex, j.getSelectedRow(), 1);
					model.setValueAt(age, j.getSelectedRow(), 2);
					model.setValueAt(bloodt, j.getSelectedRow(), 3);
					model.setValueAt(lastN, j.getSelectedRow(), 4);
					model.setValueAt(firstN, j.getSelectedRow(), 5);
					model.setValueAt(address, j.getSelectedRow(), 6);
					model.setValueAt(telNo, j.getSelectedRow(), 7);
					model.setValueAt(emailadd, j.getSelectedRow(), 8);
					model.setValueAt(height, j.getSelectedRow(), 9);
					model.setValueAt(weight, j.getSelectedRow(), 10);

					Patienttxt.setText("");
					Sextxt.setText("");
					Agetxt.setText("");
					BloodType.setText("");
					LastName.setText("");
					FirstNametxt.setText("");
					Address.setText("");
					TelephoneNo.setText("");
					EmailAdd.setText("");
					Height.setText("");
					Weight.setText("");

					JOptionPane.showMessageDialog(null,"Update Successfully");


				}

			}
		});

		photo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser imgfile = new JFileChooser();
				FileNameExtensionFilter fill = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
				imgfile.addChoosableFileFilter(fill);
				int showOpenDialog = imgfile.showOpenDialog(null);

				if(showOpenDialog == JFileChooser.APPROVE_OPTION){
					File selectedimg = imgfile.getSelectedFile();
					selectedimgpath = selectedimg.getAbsolutePath();
					JOptionPane.showMessageDialog(null,selectedimgpath);

					ImageIcon imgs = new ImageIcon(selectedimgpath);
					Image imgesfit = imgs.getImage().getScaledInstance(photolbl.getWidth(),photolbl.getHeight(),Image.SCALE_SMOOTH);
					photolbl.setIcon(new ImageIcon(imgesfit));


				}
			}
		});
		// pnl.add(lbl);
		return pnl;

	}
	private static String selectedimgpath = "";
	private static DefaultTableModel model;
	public static JLabel searchlbl = new JLabel();
	String search = "";

	static int umay;

	public int getsearch() {
		return umay;
	}
	public void setSearchlbl(String search) {
		this.search = search;
	}

}
class myTableCellRenderer extends DefaultTableCellRenderer{
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
				row, column);
		return this;
	}
}