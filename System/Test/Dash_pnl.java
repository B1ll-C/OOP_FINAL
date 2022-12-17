import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Dash_pnl{
	public static JPanel Dash_pnl(){
		JPanel pnl = new JPanel();
		pnl.setLayout(null);
		pnl.setBounds(0,0,1054-200,646-50);
		JLabel lbl = new JLabel("UwU1");
		lbl.setBounds(0,0,100,50);
		pnl.add(lbl);
		pnl.setBackground(Color.WHITE);
		return pnl;



	}

}