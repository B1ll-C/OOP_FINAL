import javax.swing.*;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

public class Pat_pnl extends JPanel{

	private static void cls(){
		tbx_pat.setText(null);
		tbx_room.setText(null);
		// tbx_stat.setText(null);
		// tbx_m_y.setText(null);
	}

	private static boolean is_empty(){
		if(tbx_pat.getText().isEmpty() || tbx_room.getText().isEmpty()){
			System.out.println("one is empty");
			return false;
		}
	
		return true;
	}
	public static JPanel Pat_pnl(){
		JPanel pnl = new JPanel();
		JPanel pnl_left = new JPanel();
		JPanel pnl_main = new JPanel();
		JPanel pnl_left_main = new JPanel();
		JPanel pnl_top = new JPanel();

		// JLabel lbl = new JLabel("UwU4");
		// lbl.setBounds(0,0,100,50);
		// pnl.add(lbl);
		// lbl.setVisible(true);

		// JTextPane tbx_pat = new JTextPane();
		// JTextPane tbx_room = new JTextPane();
		// JTextPane tbx_stat = new JTextPane();
		// JTextPane tbx_m_y = new JTextPane();

		JTextField tbx_filt = new JTextField();
		tbx_filt.setText("Search: ");
		JLabel lbl_filt = new JLabel("Search");


		JLabel lbl_pat = new JLabel("Patient");
		JLabel lbl_room = new JLabel("Room No.");
		JLabel lbl_stat = new JLabel("Status");

		JButton btn_add = new JButton("Add");
		JButton btn_del = new JButton("Delete");
		JButton btn_update = new JButton("Update");


		JLabel lbl_title = new JLabel("Patient");
		JLabel lbl_title1 = new JLabel("Status");



		// pnl.setBackground(Color.WH);
		pnl.setLayout(null);
		pnl.setBounds(0,0,1054-200,646-50);
		pnl.setBackground(Color.WHITE);





		pnl_left.setAlignmentY(Component.TOP_ALIGNMENT);
		pnl_left.setAlignmentX(Component.LEFT_ALIGNMENT);
		// pnl_left.setBackground(new Color(211, 227, 239));
		pnl_left.setBackground(Color.WHITE);
		pnl_left.setBounds(10,10,300-20,646-70);
		pnl_left.setLayout(null);
		pnl.add(pnl_left);


		lbl_title.setFont(new Font("Barlow Condensed", Font.BOLD, 30));
		lbl_title.setForeground(Color.BLACK);
		lbl_title.setBounds(10,10,300,33);
		pnl_left.add(lbl_title);

		lbl_title1.setFont(new Font("Barlow Condensed", Font.BOLD, 30));
		lbl_title1.setForeground(Color.BLACK);
		lbl_title1.setBounds(10,33+10,300,33);
		pnl_left.add(lbl_title1);


		pnl_left_main.setBounds(0,140,280,646-70-140);
		pnl_left_main.setLayout(null);
		pnl_left_main.setBackground(new Color(211, 227, 239));
		pnl_left_main.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(0, 137, 143)));

		pnl_left.add(pnl_left_main);

	


		int h = 100;
		lbl_pat.setBounds(10,0,150,30);
		lbl_pat.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_pat.setBounds(80,35,150,30);

		lbl_room.setBounds(10,80,150,30);
		lbl_room.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_room.setBounds(80,80+35,150,30);

		lbl_stat.setBounds(10,160,150,30);
		lbl_stat.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));

		String stat[]={"In","Out"};
		tbx_stat = new JComboBox(stat);
		tbx_stat.setBounds(80,160+35,150,30);
		
	

		int x = 80;
		// lbl_filt.setBounds(0,400+x+80,150,30);
		// lbl_filt.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_filt.setBounds(20,20,150,30);
		tbx_filt.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_filt.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));



		pnl_top.add(lbl_filt);
		pnl_top.add(tbx_filt);


		pnl_left_main.add(tbx_pat);
		pnl_left_main.add(lbl_pat);

		pnl_left_main.add(tbx_room);
		pnl_left_main.add(lbl_room);

		pnl_left_main.add(tbx_stat);
		pnl_left_main.add(lbl_stat);

		// pnl_left_main.add(tbx_m_y);
		// pnl_left_main.add(lbl_m_y);




		btn_add.setBounds(10,100,80,33);
		btn_add.setBackground(new Color(211, 227, 239));
		btn_add.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(0, 137, 143)));

		btn_del.setBounds(10+90,100,80,33);
		btn_del.setBackground(new Color(211, 227, 239));
		btn_del.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(0, 137, 143)));

		btn_update.setBounds(10+180,100,80,33);
		btn_update.setBackground(new Color(211, 227, 239));
		btn_update.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(0, 137, 143)));

		pnl_left.add(btn_add);
		pnl_left.add(btn_del);
		pnl_left.add(btn_update);

		
		pnl_top.setBounds(300,10,1054-500-10,70);
		pnl_top.setBackground(Color.WHITE);
		pnl_top.setLayout(null);
		pnl.add(pnl_top);

		pnl_main.setLayout(new GridLayout(0,1));
		pnl_main.setBounds(300,80,1054-500-10,646-120-20);
		pnl_main.setBackground(Color.GREEN);
		pnl.add(pnl_main);

		String[][] data = {
			{ "", "", "","","" },
		};

		String[] cols = {"Patient","Room No.","In","Out"};

		JTable tab = new JTable(model);
		// tab.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(0, 137, 143)));
		model.addColumn("Patient");
		model.addColumn("Room No.");
		model.addColumn("In");
		model.addColumn("Out");
		tab.setDefaultEditor(Object.class,null);
		tab.setBounds(30,40,1054-500,646-50);
		pnl_main.add(tab);
		pnl_main.add(new JScrollPane(tab));

		//remove this later
		Object[] rows = {"Dela Cruz","209","",symbols[0],};
		model.addRow(rows);
		// Object[] rows1 = {"001","Dela Cruz","@yahoo","jan2022","102",};
		// model.addRow(rows1);


		//event

		btn_add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(is_empty()){

					Object[] rows = {tbx_pat.getText(),tbx_room.getText(),symbols[0],""};
					model.addRow(rows);
					countings = tab.getRowCount();
					// lbl.setText(String.valueOf(countings));

					cls();

				}
				
				
			}
		});

		btn_update.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){


				int result = JOptionPane.showConfirmDialog(pnl,"Update Data ?", "Caution",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);

				if(result == JOptionPane.YES_OPTION){
					int i = tab.getSelectedRow();
					if(i >= 0)
					{
						model.setValueAt(tbx_pat.getText(), i, 0);
						model.setValueAt(tbx_room.getText(), i, 1);
						if(tbx_stat.getSelectedItem().toString() == "In"){
							model.setValueAt(symbols[0],i,2);
							model.setValueAt("",i,3);
						}
						if(tbx_stat.getSelectedItem().toString() == "Out"){
							model.setValueAt("",i,2);
							model.setValueAt(symbols[0],i,3);
						}
						// model.setValueAt(tbx_stat.getText(), i, 2);
						// model.setValueAt(tbx_m_y.getText(), i, 3);
					}
					else{
						JOptionPane.showMessageDialog(null, "Error");
					}
				}

				
			}
		});


		btn_del.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int result = JOptionPane.showConfirmDialog(pnl,"Delete Data ?", "Warning",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
				countings = tab.getRowCount();
				// lbl.setText(String.valueOf(countings));

				if(result == JOptionPane.YES_OPTION){
					model.removeRow(tab.getSelectedRow());

				}
			}
		});


		tab.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				String datas[] = new String[4];
				int row = tab.getSelectedRow();

				String value;
				for(int i = 0; i < 4; i++){
					datas[i]=tab.getModel().getValueAt(row, i).toString();
				}


				// System.out.println(datas[0]);
				tbx_pat.setText(datas[0]);
				tbx_room.setText(datas[1]);

				if(datas[2].isEmpty()){
					tbx_stat.setSelectedItem("Out");
				}

				if(datas[3].isEmpty()){
					tbx_stat.setSelectedItem("In");
				}
				// System.out.println(datas[3].isEmpty());
			//	tbx_stat.setText(datas[2]);
			}
		});
    
		tbx_filt.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					System.out.println();
  					TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) tab.getModel())); 
  					// TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) tab.getModel()));
					 sorter.setRowFilter(RowFilter.regexFilter(tbx_filt.getText()));

					   tab.setRowSorter(sorter);
					// final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
				}
			}
		});

		tbx_filt.addFocusListener(new FocusAdapter(){
			public void focusGained(FocusEvent e){
				tbx_filt.setText("");
			}

			public void focusLost(FocusEvent e){
				tbx_filt.setText("Search: ");
			}
		});
		return pnl;
		}

		private static JTextPane tbx_pat = new JTextPane();
		private static JTextPane tbx_room = new JTextPane();
		private static JComboBox tbx_stat = new JComboBox();
		private static String symbols[] = {"☑","☒"};
		public static int countings;
	 	public static DefaultTableModel model = new DefaultTableModel();
	public int getCountings() {
		return countings;
	}

		// private static JTextPane tbx_m_y = new JTextPane();

}