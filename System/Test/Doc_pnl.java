import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.*;
public class Doc_pnl extends JPanel{
	public static JPanel Doc_pnl(){
		JPanel pnl = new JPanel();
		// pnl.setBackground(Color.WH);
		pnl.setLayout(null);
		pnl.setBounds(0,0,1054-200,646-50);
		JLabel lbl = new JLabel("UwU2");
		lbl.setBounds(0,0,100,50);
		pnl.setBackground(Color.WHITE);
		
		pnl.add(lbl);
		return pnl;

	}

}