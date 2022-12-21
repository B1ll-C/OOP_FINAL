// import java.awt.Color;
// import java.awt.Dimension;
// import javax.swing.JButton;
// import javax.swing.JPanel;
// import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import javax.swing.table.DefaultTableModel;




public class Doc_pnl extends JPanel{
	public static JPanel Doc_pnl(){
		JPanel pnl = new JPanel();
		JPanel pnl_left = new JPanel();
		JPanel pnl_main = new JPanel();

		JTextPane tbx_num = new JTextPane();
		JTextPane tbx_name = new JTextPane();
		JTextPane tbx_mail = new JTextPane();
		JTextPane tbx_m_y = new JTextPane();
		JTextPane tbx_cont = new JTextPane();

		JLabel lbl_num = new JLabel("Number");
		JLabel lbl_name = new JLabel("Name");
		JLabel lbl_mail = new JLabel("Email");
		JLabel lbl_m_y = new JLabel("Month Year");
		JLabel lbl_cont = new JLabel("Contact#");

		JButton btn_add = new JButton("Add");
		JButton btn_del = new JButton("Delete");
		JButton btn_update = new JButton("Update");




		// pnl.setBackground(Color.WH);
		pnl.setLayout(null);
		pnl.setBounds(0,0,1054-200,646-50);
		pnl.setBackground(Color.WHITE);


		pnl_left.setAlignmentY(Component.TOP_ALIGNMENT);
		pnl_left.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnl_left.setBackground(Color.RED);
		pnl_left.setBounds(0,0,300,646-50);
		pnl_left.setLayout(null);
		pnl.add(pnl_left);

	


		int h = 100;
		lbl_num.setBounds(0,20,150,30);
		lbl_num.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_num.setBounds(80,50,150,30);

		lbl_name.setBounds(0,100,150,30);
		lbl_name.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_name.setBounds(80,130,150,30);

		lbl_mail.setBounds(0,180,150,30);
		lbl_mail.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_mail.setBounds(80,210,150,30);

		lbl_m_y.setBounds(0,260,150,30);
		lbl_m_y.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_m_y.setBounds(80,290,150,30);

		lbl_cont.setBounds(0,340,150,30);
		lbl_cont.setFont(new Font("Barlow Condensed", Font.PLAIN, 25));
		tbx_cont.setBounds(80,370,150,30);





		pnl_left.add(tbx_num);
		pnl_left.add(lbl_num);

		pnl_left.add(tbx_name);
		pnl_left.add(lbl_name);

		pnl_left.add(tbx_mail);
		pnl_left.add(lbl_mail);

		pnl_left.add(tbx_m_y);
		pnl_left.add(lbl_m_y);

		pnl_left.add(tbx_cont);
		pnl_left.add(lbl_cont);



		btn_add.setBounds(0,450,100,33);



		btn_del.setBounds(0+100,450,100,33);



		btn_update.setBounds(0+200,450,100,33);

		pnl_left.add(btn_add);
		pnl_left.add(btn_del);
		pnl_left.add(btn_update);

		

		pnl_main.setLayout(new GridLayout(0,1));
		pnl_main.setBounds(300,0,1054-500,646-50);
		pnl_main.setBackground(Color.GREEN);
		pnl.add(pnl_main);

		String[][] data = {
			{ "", "", "","","" },
		};

		String[] cols = {"Number","Name","Email","Month & Year","Contact"};

	 	DefaultTableModel model = new DefaultTableModel();
		JTable tab = new JTable(model);
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Month & Year");
		model.addColumn("Contact");

		tab.setBounds(30,40,1054-500,646-50);
		pnl_main.add(tab);
		pnl_main.add(new JScrollPane(tab));




		//event

		btn_add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Object[] rows = {"me","me","me","me","me"};
				model.addRow(rows);
			}
		});
		
		return pnl;

	}

}