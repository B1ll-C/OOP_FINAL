import javax.swing.*;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

public class Pat_pnl extends JPanel{

	private static void cls(){
		tbx_num.setText(null);
		tbx_name.setText(null);
		tbx_mail.setText(null);
		tbx_m_y.setText(null);
		tbx_cont.setText(null);
	}

	private static boolean is_empty(){
		if(tbx_num.getText().isEmpty() || tbx_name.getText().isEmpty()|| tbx_m_y.getText().isEmpty() || tbx_cont.getText().isEmpty() || tbx_mail.getText().isEmpty()){
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

		// JTextPane tbx_num = new JTextPane();
		// JTextPane tbx_name = new JTextPane();
		// JTextPane tbx_mail = new JTextPane();
		// JTextPane tbx_m_y = new JTextPane();
		// JTextPane tbx_cont = new JTextPane();

		JTextField tbx_filt = new JTextField();
		tbx_filt.setText("Search: ");
		JLabel lbl_filt = new JLabel("Search");


		JLabel lbl_num = new JLabel("Number");
		JLabel lbl_name = new JLabel("Name");
		JLabel lbl_mail = new JLabel("Email");
		JLabel lbl_m_y = new JLabel("Month Year");
		JLabel lbl_cont = new JLabel("Contact no.");

		JButton btn_add = new JButton("Add");
		JButton btn_del = new JButton("Delete");
		JButton btn_update = new JButton("Update");


		JLabel lbl_title = new JLabel("Doctors");
		JLabel lbl_title1 = new JLabel("Accounts");



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
		lbl_num.setBounds(10,0,150,30);
		lbl_num.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_num.setBounds(80,35,150,30);

		lbl_name.setBounds(10,80,150,30);
		lbl_name.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_name.setBounds(80,80+35,150,30);

		lbl_mail.setBounds(10,160,150,30);
		lbl_mail.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_mail.setBounds(80,160+35,150,30);

		lbl_m_y.setBounds(10,240,150,30);
		lbl_m_y.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_m_y.setBounds(80,240+35,150,30);

		lbl_cont.setBounds(10,320,150,30);
		lbl_cont.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_cont.setBounds(80,320+35,150,30);

		int x = 80;
		// lbl_filt.setBounds(0,400+x+80,150,30);
		// lbl_filt.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_filt.setBounds(20,20,150,30);
		tbx_filt.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_filt.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));



		pnl_top.add(lbl_filt);
		pnl_top.add(tbx_filt);


		pnl_left_main.add(tbx_num);
		pnl_left_main.add(lbl_num);

		pnl_left_main.add(tbx_name);
		pnl_left_main.add(lbl_name);

		pnl_left_main.add(tbx_mail);
		pnl_left_main.add(lbl_mail);

		pnl_left_main.add(tbx_m_y);
		pnl_left_main.add(lbl_m_y);

		pnl_left_main.add(tbx_cont);
		pnl_left_main.add(lbl_cont);



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

		String[] cols = {"Number","Name","Email","Month & Year","Contact"};

	 	DefaultTableModel model = new DefaultTableModel();
		JTable tab = new JTable(model);
		// tab.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(0, 137, 143)));
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Month & Year");
		model.addColumn("Contact");
		tab.setDefaultEditor(Object.class,null);
		tab.setBounds(30,40,1054-500,646-50);
		pnl_main.add(tab);
		pnl_main.add(new JScrollPane(tab));

		//remove this later
		Object[] rows = {"1111","paul gonzalodo","@gmail","jan2022","909",};
		model.addRow(rows);
		Object[] rows1 = {"001","Dela Cruz","@yahoo","jan2022","102",};
		model.addRow(rows1);


		//event

		btn_add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(is_empty()){
					Object[] rows = {tbx_num.getText(),tbx_name.getText(),tbx_mail.getText(),tbx_m_y.getText(),tbx_cont.getText()};
					model.addRow(rows);

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
						model.setValueAt(tbx_num.getText(), i, 0);
						model.setValueAt(tbx_name.getText(), i, 1);
						model.setValueAt(tbx_mail.getText(), i, 2);
						model.setValueAt(tbx_m_y.getText(), i, 3);
						model.setValueAt(tbx_cont.getText(), i, 4);
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

				if(result == JOptionPane.YES_OPTION){
					model.removeRow(tab.getSelectedRow());
				}
			}
		});


		tab.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				String datas[] = new String[5];
				int row = tab.getSelectedRow();

				String value;
				for(int i = 0; i < 5; i++){
					datas[i]=tab.getModel().getValueAt(row, i).toString();
				}


				// System.out.println(datas[0]);
				tbx_num.setText(datas[0]);
				tbx_name.setText(datas[1]);
				tbx_mail.setText(datas[2]);
				tbx_m_y.setText(datas[3]);
				tbx_cont.setText(datas[4]);
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

		private static JTextPane tbx_num = new JTextPane();
		private static JTextPane tbx_name = new JTextPane();
		private static JTextPane tbx_mail = new JTextPane();
		private static JTextPane tbx_m_y = new JTextPane();
		private static JTextPane tbx_cont = new JTextPane();

}