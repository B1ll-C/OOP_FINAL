import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.*;

public class Rep_pnl extends JPanel{
	public static JPanel Rep_pnl(){
		JPanel pnl = new JPanel();
		pnl.setLayout(null);
		pnl.setBounds(0,0,1054-200,646-50);
		JLabel lbl = new JLabel("UwU5");
		lbl.setBounds(0,0,100,50);
		pnl.add(lbl);
		pnl.setBackground(Color.WHITE);
		
		return pnl;

	}

}