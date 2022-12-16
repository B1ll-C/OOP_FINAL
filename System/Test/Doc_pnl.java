import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.SwingConstants;

public class Doc_pnl extends JPanel{
	public static JPanel Doc_pnl(){
		JPanel pnl = new JPanel();
		pnl.setLayout(null);
		JLabel lbl = new JLabel("UwU2");
		lbl.setBounds(0,0,100,50);
		pnl.add(lbl);
		pnl.setBackground(Color.WHITE);
		
		return pnl;

	}

}