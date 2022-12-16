import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

import java.awt.Image;
import javax.imageio.*;
// left rgba(67,154,151,255)
// right rgba(98,182,183,255)

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;

public class pnl extends JFrame{


	public pnl(){
		initComponents();
	}

	private void initComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,50,1054-200,646-50);
		setUndecorated(true);
		setLocationRelativeTo(null);

		JPanel contentPane = new JPanel();
		contentPane.setBackground(new Color(255,0,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public static void main(String[] args){
		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run(){
				try{
					pnl p = new pnl();
					p.setVisible(true);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
}