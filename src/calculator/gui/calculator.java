package calculator.gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class calculator extends JFrame {
	public calculator() {
		setTitle("Calculator for Test");
		setSize(300, 525);
		
		// Set Menu Bar
		JMenuBar menubar = new JMenuBar();
		
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Edit");
		JMenu m3 = new JMenu("Help");
		
		menubar.add(m1);
		menubar.add(m2);
		menubar.add(m3);
		
		JMenuItem mi1 = new JMenuItem("New");
		JMenuItem mi2 = new JMenuItem("Open");
		
		m1.add(mi1);
		m1.add(mi2);
		
		setJMenuBar(menubar);
		
		// Result Panel
		JPanel resPanel = new JPanel();
		resPanel.setBounds(0, 10, 500, 50);
		add(resPanel);
		JLabel resLabel = new JLabel("0", JLabel.RIGHT);
		resLabel.setFont(new Font("함초롬돋움", Font.BOLD, 30));
		resPanel.add(resLabel);
		
		// Button Panel
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(0, 80, 285, 285);
		btnPanel.setLayout(new GridLayout(4, 4, 0, 0));
		
		add(btnPanel);
		JButton n7 = new JButton("7");
		btnPanel.add(n7);
		JButton n8 = new JButton("8");
		btnPanel.add(n8);
		JButton n9 = new JButton("9");
		btnPanel.add(n9);
		JButton plus = new JButton("+");
		btnPanel.add(plus);
		
		JButton n4 = new JButton("4");
		btnPanel.add(n4);
		JButton n5 = new JButton("5");
		btnPanel.add(n5);
		JButton n6 = new JButton("6");
		btnPanel.add(n6);
		JButton minus = new JButton("-");
		btnPanel.add(minus);
		
		JButton n1 = new JButton("1");
		btnPanel.add(n1);
		JButton n2 = new JButton("2");
		btnPanel.add(n2);
		JButton n3 = new JButton("3");
		btnPanel.add(n3);
		JButton mult = new JButton("*");
		btnPanel.add(mult);
		
		JButton n0 = new JButton("0");
		btnPanel.add(n0);
		JButton ac = new JButton("AC");
		btnPanel.add(ac);
		JButton val = new JButton("=");
		btnPanel.add(val);
		JButton div = new JButton("/");
		btnPanel.add(div);
		
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 400, 290, 40);
		numPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		add(numPanel);
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
		
		// Action Listener
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == plus) {
					int num01 = Integer.parseInt(num1.getText());
					int num02 = Integer.parseInt(num2.getText());
							
					int result = num01 + num02;
					resLabel.setText(String.valueOf(result));
				}
			}
		});
		
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == minus) {
					int num01 = Integer.parseInt(num1.getText());
					int num02 = Integer.parseInt(num2.getText());
							
					int result = num01 - num02;
					resLabel.setText(String.valueOf(result));
				}
			}
		});
		
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == mult) {
					int num01 = Integer.parseInt(num1.getText());
					int num02 = Integer.parseInt(num2.getText());
							
					int result = num01 * num02;
					resLabel.setText(String.valueOf(result));
				}
			}
		});
		
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == div) {
					int num01 = Integer.parseInt(num1.getText());
					int num02 = Integer.parseInt(num2.getText());
							
					int result = num01 / num02;
					resLabel.setText(String.valueOf(result));
				}
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new calculator();
	}
}
