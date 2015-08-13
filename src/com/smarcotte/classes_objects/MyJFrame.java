package com.smarcotte.classes_objects;

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;

public class MyJFrame extends JFrame implements ActionListener 
{
	// references
	JPanel pnlTop;
	JPanel pnlCenter;
	JPanel pnlBottom;
	JLabel lblRadius;
	JTextField txfRadius;
	JButton btnCalculate;
	JTextArea txaOutput;
	
	// constructor
	public MyJFrame()
	{
		// set the frames layout manager
		this.setLayout(new GridLayout(3,1));
		
		// create the objects
		pnlTop = new JPanel(new FlowLayout());
		pnlCenter = new JPanel(new FlowLayout());
		pnlBottom = new JPanel(new FlowLayout());
		
		lblRadius = new JLabel("Radius: ");
		txfRadius = new JTextField(20);
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(this);
		txaOutput = new JTextArea("Output goes here...");
		
		// place objects on the panels and then the panels on the frame
		pnlTop.add(lblRadius);
		pnlTop.add(txfRadius);
		pnlCenter.add(btnCalculate);
		pnlBottom.add(txaOutput);
		
		this.add(pnlTop);
		this.add(pnlCenter);
		this.add(pnlBottom);
		
		// set the frame properties
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Classes and Objects Demo");
		this.setBounds(100, 100, 300, 400);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// show the header
		printHeader();
		
		// create a circle object
		double radius = Double.parseDouble(txfRadius.getText());
		Circle myCircle = new Circle(radius);
		
		// calculate area and circumference
		double circumference = myCircle.circumference();
		double area = myCircle.area();
		
		// display values
		DecimalFormat fmt = new DecimalFormat("0.0");
		txaOutput.append("Circumference: " + fmt.format(circumference) + "\n");
		txaOutput.append("Area: " + fmt.format(area) + "\n");

	}

	private void printHeader() {
		// show the header
		String output = "Circle Program\n";
		output += "--------------\n";
		
		txaOutput.setText(output);
		
	}

}
