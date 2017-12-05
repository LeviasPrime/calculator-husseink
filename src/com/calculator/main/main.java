package com.calculator.main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;

import com.calculator.superclasses.BasicOperations;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class main {

	private JFrame frame;
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
					window.frame.setVisible(true);
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
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstValue = new JLabel("First Value");
		lblFirstValue.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstValue.setBackground(UIManager.getColor("Button.background"));
		lblFirstValue.setBounds(10, 11, 176, 25);
		frame.getContentPane().add(lblFirstValue);
		
		firstValueField = new JTextField();
		firstValueField.setBounds(10, 36, 176, 20);
		frame.getContentPane().add(firstValueField);
		firstValueField.setColumns(10);
		
		JLabel lblSecondValue = new JLabel("Second Value");
		lblSecondValue.setHorizontalAlignment(SwingConstants.LEFT);
		lblSecondValue.setBackground(SystemColor.menu);
		lblSecondValue.setBounds(10, 67, 176, 25);
		frame.getContentPane().add(lblSecondValue);
		
		secondValueField = new JTextField();
		secondValueField.setColumns(10);
		secondValueField.setBounds(10, 92, 176, 20);
		frame.getContentPane().add(secondValueField);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setHorizontalAlignment(SwingConstants.LEFT);
		lblResult.setBackground(SystemColor.menu);
		lblResult.setBounds(239, 36, 176, 25);
		frame.getContentPane().add(lblResult);
		
		resultField = new JTextField();
		resultField.setEditable(false);
		resultField.setColumns(10);
		resultField.setBounds(239, 61, 176, 20);
		frame.getContentPane().add(resultField);
		
		
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
		frame.getContentPane().add(additionButton);
		
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
		frame.getContentPane().add(subtractionButton);
		

		
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
		frame.getContentPane().add(divisionButton);
		
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
		frame.getContentPane().add(multiplicationButton);

		
		JButton button_4 = new JButton("uni");
		button_4.setBounds(369, 129, 55, 55);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("uni");
		button_5.setBounds(369, 195, 55, 55);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("uni");
		button_6.setBounds(304, 129, 55, 55);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("uni");
		button_7.setBounds(304, 195, 55, 55);
		frame.getContentPane().add(button_7);
		
		JButton btnUni = new JButton("uni");
		btnUni.setBounds(239, 129, 55, 55);
		frame.getContentPane().add(btnUni);
		
		JButton btnUni_1 = new JButton("uni");
		btnUni_1.setBounds(239, 195, 55, 55);
		frame.getContentPane().add(btnUni_1);
	}
}
