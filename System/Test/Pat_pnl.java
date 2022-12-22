import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.GridLayout;
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

		String[][] data = {
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
            { "", "", "","" },
        };
 
        // Column Names
        String[] columnNames = { "Patient", "Room No.", "In","Out" };
 
        // Initializing the JTable
        JTable j = new JTable(data, columnNames);
        j.setBounds(30, 40, 1054-200, 646-50);
       // j.setForeground(Color.WHITE);
        pnl.add(new JScrollPane(j));
        // pnl.add(j);

	j.setDefaultEditor(Object.class, null);        
		return pnl;

	}

}