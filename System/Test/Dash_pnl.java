import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Dash_pnl extends JPanel{
	public void Dash_pnl(){
		JPanel pnl_d = new JPanel();
		pnl_d.setBackground(Color.RED);
	  	JButton button = new JButton("Button (+JPanel) from external class");

                // adding button to the black JPanel
        pnl_d.add(button);
		// setAlignmentY(Component.TOP_ALIGNMENT);
		// setAlignmentX(Component.LEFT_ALIGNMENT);
		// setBackground(Color.RED);
		add(pnl_d);

	}

}