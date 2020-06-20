package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calc extends JFrame{
	
	static JLabel label;
	static JLabel info;
	static int flag = 0;
	static int check = 0;
	
	public Calc () {
		setTitle("°è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,5));
		c.setBackground(Color.BLACK);
		
		NorthPanel NP = new NorthPanel();
		c.add(NP, BorderLayout.EAST);
		
		CenterPanel CP = new CenterPanel();
		c.add(CP, BorderLayout.SOUTH);

		setSize(500, 600);
		setVisible(true);
	}
		
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setLayout(new GridLayout(3,1));	
			setBackground(Color.BLACK);
			info = new JLabel("¼ö½ÄÀ» ÀÔ·ÂÇÏ¼¼¿ä ");
			label = new JLabel(""); 
			
			info.setFont(new Font("¸¼Àº °íµñ", 0, 20));		
			info.setBackground(Color.BLACK);
			info.setForeground(Color.WHITE);
			info.setHorizontalAlignment(SwingConstants.RIGHT);
			
			label.setFont(new Font("¸¼Àº °íµñ", 0, 40));
			label.setBackground(Color.BLACK);
			label.setForeground(Color.WHITE);		
			label.setHorizontalAlignment(SwingConstants.RIGHT);
			
			add(info); add(label); 			
			
		}
	}
	
	

	class CenterPanel extends JPanel {
		public CenterPanel() {
			JButton[] bt = new JButton[16];
			setBackground(Color.BLACK);
			setLayout(new GridLayout (4,4,5,5));
			
			bt[0] = new JButton("7");
			bt[1] = new JButton("8");
			bt[2] = new JButton("9");
			bt[3] = new JButton("¡À");
			
			bt[4] = new JButton("4");
			bt[5] = new JButton("5");
			bt[6] = new JButton("6");
			bt[7] = new JButton("¡¿");
			
			bt[8] = new JButton("1");
			bt[9] = new JButton("2");
			bt[10] = new JButton("3");
			bt[11] = new JButton("-");
			
			bt[12] = new JButton("C");
			bt[13] = new JButton("0");
			bt[14] = new JButton("=");
			bt[15] = new JButton("+");
			
			for (int i = 0; i <= 15; i++) {	
				if (i%4 != 3 && i < 11) {
					bt[i].setFont(new Font("¸¼Àº °íµñ", 0, 30));
					bt[i].setBackground(Color.GRAY);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
					
					
				}
				
				else if (i == 12 || i == 14) {
					bt[i].setFont(new Font("¸¼Àº °íµñ", 0, 30));
					bt[i].setBackground(Color.LIGHT_GRAY);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
					
					
				}		
				
				else if (i % 4 == 3){
					bt[i].setFont(new Font("¸¼Àº °íµñ", 0, 40));
					bt[i].setBackground(new Color (234,150,72));
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);				
					
				}
				
				else if (i == 13) {
					bt[i].setFont(new Font("¸¼Àº °íµñ", 0, 30));
					bt[i].setBackground(Color.GRAY);
					bt[i].setForeground(Color.WHITE);
					add(bt[i]);
					
				}
			}				
		}
	}

	
	
	public static void main(String[] args) {
		new Calc();
	}

}
