import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.table.DefaultTableModel;

public class Pat_pnl extends JPanel{
	public static JPanel Pat_pnl(){
		JPanel pnl = new JPanel();
		// pnl.setBackground(Color.WH);
		// pnl.setLayout(null);
		pnl.setLayout(new GridLayout(0, 1));
		pnl.setBounds(0,0,1054-200,646-50);
		JLabel lbl = new JLabel("UwU3");
		lbl.setBounds(0,200,100,50);
		pnl.setBackground(Color.WHITE);
		JButton s = new JButton("sd");

		// pnl.add(lbl);

 
        // Column Names
        String[] columnNames = { "Patient", "Room No.", "In","Out" };
        DefaultTableModel model = new DefaultTableModel();
        JTable tab = new JTable(model);
        model.addColumn("Patient");
        model.addColumn("Room No.");
        model.addColumn("In");
        model.addColumn("Out");
        // Initializing the JTable
        // JTable j = new JTable(data, columnNames);
        tab.setBounds(30, 40, 1054-200, 646-50);
       // j.setForeground(Color.WHITE);
        pnl.add(new JScrollPane(tab));
        // pnl.add(j);

	tab.setDefaultEditor(Object.class, null);    


    for(int i =0; i < 10; i++){
        Object[] rows = {"Patient#"+i,"Room#"+i,".",""};
        model.addRow(rows);
    }

		return pnl;

	}

}