/**
 * main
 * 
 * @author Hussein Kadhum.
 * @version 1.0 alpha
 **/

package com.calculator.main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;

import com.calculator.superclasses.AdvancedOperations;
import com.calculator.superclasses.BasicOperations;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class main {

	private JFrame frmCalculator;
	private JTextField firstValueField; 
	private JTextField secondValueField; 
	private JTextField resultField; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BasicOperations bo = new BasicOperations();
		AdvancedOperations ao = new AdvancedOperations();
		
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 450, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JLabel lblFirstValue = new JLabel("First Value or Only Value:");
		lblFirstValue.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstValue.setBackground(UIManager.getColor("Button.background"));
		lblFirstValue.setBounds(10, 11, 176, 25);
		frmCalculator.getContentPane().add(lblFirstValue);
		
		firstValueField = new JTextField();
		firstValueField.setBounds(10, 36, 176, 20);
		frmCalculator.getContentPane().add(firstValueField);
		firstValueField.setColumns(10);
		
		JLabel lblSecondValue = new JLabel("Second Value:");
		lblSecondValue.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecondValue.setBackground(SystemColor.menu);
		lblSecondValue.setBounds(10, 67, 176, 25);
		frmCalculator.getContentPane().add(lblSecondValue);
		
		secondValueField = new JTextField();
		secondValueField.setColumns(10);
		secondValueField.setBounds(10, 92, 176, 20);
		frmCalculator.getContentPane().add(secondValueField);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setHorizontalAlignment(SwingConstants.LEFT);
		lblResult.setBackground(SystemColor.menu);
		lblResult.setBounds(239, 36, 176, 25);
		frmCalculator.getContentPane().add(lblResult);
		
		resultField = new JTextField();
		resultField.setEditable(false);
		resultField.setColumns(10);
		resultField.setBounds(239, 61, 176, 20);
		frmCalculator.getContentPane().add(resultField);
		
		
		JButton additionButton = new JButton("+");
		additionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					bo.Addition(Double.parseDouble(firstValueField.getText()), Double.parseDouble(secondValueField.getText()));
					resultField.setText(Double.toString(bo.getResult()));
				}catch(NumberFormatException ex) {
					resultField.setText("Syntax Error");
				}
			}
		});
		additionButton.setBounds(38, 129, 55, 55);
		frmCalculator.getContentPane().add(additionButton);
		
		JButton subtractionButton = new JButton("-");
		subtractionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					bo.Subtraction(Double.parseDouble(firstValueField.getText()), Double.parseDouble(secondValueField.getText()));
					resultField.setText(Double.toString(bo.getResult()));
				}catch(NumberFormatException ex) {
					resultField.setText("Syntax Error");
				}
			}
		});
		subtractionButton.setBounds(103, 129, 55, 55);
		frmCalculator.getContentPane().add(subtractionButton);
		

		
		JButton divisionButton = new JButton("/");
		divisionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					bo.Division(Double.parseDouble(firstValueField.getText()), Double.parseDouble(secondValueField.getText()));
					resultField.setText(Double.toString(bo.getResult()));
				}catch(NumberFormatException ex) {
					resultField.setText("Syntax Error");
				}
			}
		});
		divisionButton.setBounds(103, 195, 55, 55);
		frmCalculator.getContentPane().add(divisionButton);
		
		JButton multiplicationButton = new JButton("*");
		multiplicationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					bo.Multiplication(Double.parseDouble(firstValueField.getText()), Double.parseDouble(secondValueField.getText()));
					resultField.setText(Double.toString(bo.getResult()));
				}catch(NumberFormatException ex) {
					resultField.setText("Syntax Error");
				}
			}
		});
		multiplicationButton.setBounds(38, 195, 55, 55);
		frmCalculator.getContentPane().add(multiplicationButton);

		
		JButton rootButton = new JButton("\u221A");
		rootButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ao.SquareRoot(Double.parseDouble(firstValueField.getText()));
					resultField.setText(Double.toString(ao.getResult()));
				}catch(NumberFormatException ex) {
					resultField.setText("Syntax Error");
				}
			}
		});
		rootButton.setBounds(369, 129, 55, 55);
		frmCalculator.getContentPane().add(rootButton);
		
		JButton tangentButton = new JButton("tan");
		tangentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ao.Tangent(Double.parseDouble(firstValueField.getText()));
					resultField.setText(Double.toString(ao.getResult()));
				}catch(NumberFormatException ex) {
					resultField.setText("Syntax Error");
				}
			}
		});
		tangentButton.setBounds(369, 195, 55, 55);
		frmCalculator.getContentPane().add(tangentButton);
		
		JButton squaredButton = new JButton("x^2");
		squaredButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ao.Squared(Double.parseDouble(firstValueField.getText()));
					resultField.setText(Double.toString(ao.getResult()));
				}catch(NumberFormatException ex) {
					resultField.setText("Syntax Error");
				}
			}
		});
		squaredButton.setBounds(304, 129, 55, 55);
		frmCalculator.getContentPane().add(squaredButton);
		
		JButton cosineButton = new JButton("cos");
		cosineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ao.Cosine(Double.parseDouble(firstValueField.getText()));
					resultField.setText(Double.toString(ao.getResult()));
				}catch(NumberFormatException ex) {
					resultField.setText("Syntax Error");
				}
			}
		});
		cosineButton.setBounds(304, 195, 55, 55);
		frmCalculator.getContentPane().add(cosineButton);
		
		JButton logarithmButton = new JButton("log");
		logarithmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ao.Logarithm(Double.parseDouble(firstValueField.getText()));
					resultField.setText(Double.toString(ao.getResult()));
				}catch(NumberFormatException ex) {
					resultField.setText("Syntax Error");
				}
			}
		});
		logarithmButton.setBounds(239, 129, 55, 55);
		frmCalculator.getContentPane().add(logarithmButton);
		
		JButton sineButton = new JButton("sin");
		sineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ao.Sine(Double.parseDouble(firstValueField.getText()));
					resultField.setText(Double.toString(ao.getResult()));
				}catch(NumberFormatException ex) {
					resultField.setText("Syntax Error");
				}
			}
		});
		sineButton.setBounds(239, 195, 55, 55);
		frmCalculator.getContentPane().add(sineButton);
	}
}
