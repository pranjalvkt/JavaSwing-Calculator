import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
	static JFrame frame;
	static Container c = new Container();
	static JLabel label1, label2, resultL, modeLabel;
	static JTextField num1TF, num2TF, resultTF;
	static JButton addBtn, subBtn, mulBtn, divBtn, resetBtn;
	static Font labelFont, fontTF;
	static JRadioButton dRadioButton, nRadioButton;


	public static void main(String[] args) {
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 50, 700, 500);
		c = new Container();
		c = frame.getContentPane();
		c.setLayout(null);
	
		labelFont = new Font("Arial", Font.BOLD, 25);
		fontTF = new Font("Arial", Font.BOLD, 20);
		
		label1 = new JLabel("Operand 1");
		label1.setBounds(450, 70, 200, 30);
		label1.setFont(labelFont);
		num1TF = new JTextField();
		num1TF.setBounds(680, 70, 250, 30);
		num1TF.setFont(fontTF);

		label2 = new JLabel("Operand 2");
		label2.setBounds(450, 120, 200, 30);
		label2.setFont(labelFont);
		num2TF = new JTextField();
		num2TF.setBounds(680, 120, 250, 30);
		num2TF.setFont(fontTF);


		addBtn = new JButton("ADD");
		addBtn.setBounds(810, 170, 120, 25);

		addBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				add_action(e);
			}
			
		});

		subBtn = new JButton("SUBSTRACT");
		subBtn.setBounds(680,170, 120, 25);

		subBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				sub_action(e);
			}
			
		});
		mulBtn = new JButton("MULTIPLY");
		mulBtn.setBounds(810,220, 120, 25);

		mulBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				mul_action(e);
			}
			
		});
		divBtn = new JButton("DIVIDE");
		divBtn.setBounds(680,220, 120, 25);

		divBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				div_action(e);
			}
			
		});

		resultL = new JLabel("RESULT");
		resultL.setBounds(450, 270, 200, 50);
		resultL.setFont(labelFont);

		resultTF = new JTextField();
		resultTF.setBounds(680, 270, 250, 50);
		resultTF.setFont(fontTF);


		resetBtn = new JButton("RESET");
		resetBtn.setBounds(450, 170, 120, 75);
		
		resetBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				reset_action(e);
			}
		});

		dRadioButton = new JRadioButton("Day");
		dRadioButton.setBounds(1350, 80, 50, 30);
		dRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				day_action(e);
			}
		});
		nRadioButton = new JRadioButton("Night");
		nRadioButton.setBounds(1400, 80, 80, 30);
		nRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				night_action(e);
			}
		});

		ButtonGroup modes = new ButtonGroup();
		modes.add(dRadioButton);
		modes.add(nRadioButton);

		modeLabel = new JLabel("Day-Night Mode");
		modeLabel.setBounds(1355, 30, 300, 50);

		c.add(label1);
		c.add(label2);
		c.add(num1TF);
		c.add(num2TF);
		c.add(addBtn);
		c.add(subBtn);
		c.add(mulBtn);
		c.add(divBtn);
		c.add(resultTF);
		c.add(resetBtn);
		c.add(resultL);
		c.add(dRadioButton);
		c.add(nRadioButton);
		c.add(modeLabel);
	}

	public static void add_action(ActionEvent e) {
		String s1 = num1TF.getText();
		String s2 = num2TF.getText();
		float n1 = Float.parseFloat(s1);
		float n2 = Float.parseFloat(s2);
		
		float an = n1 + n2;

		String ans_str = Float.toString(an);
		resultTF.setText(ans_str);
	}
	public static void sub_action(ActionEvent e) {
		String s1 = num1TF.getText();
		String s2 = num2TF.getText();
		float n1 = Float.parseFloat(s1);
		float n2 = Float.parseFloat(s2);
		
		float an = n1 - n2;

		String ans_str = Float.toString(an);
		resultTF.setText(ans_str);
	}
	public static void mul_action(ActionEvent e) {
		String s1 = num1TF.getText();
		String s2 = num2TF.getText();
		float n1 = Float.parseFloat(s1);
		float n2 = Float.parseFloat(s2);
		
		float an = n1 * n2;

		String ans_str = Float.toString(an);
		resultTF.setText(ans_str);
	}
	public static void div_action(ActionEvent e) {
		String s1 = num1TF.getText();
		String s2 = num2TF.getText();
		float n1 = Float.parseFloat(s1);
		float n2 = Float.parseFloat(s2);
		
		float an = n1 / n2;

		String ans_str = Float.toString(an);
		resultTF.setText(ans_str);
	}

	public static void reset_action(ActionEvent e) {
		if(e.getSource()==resetBtn) {
			num1TF.setText(null);
			num2TF.setText(null);
			resultTF.setText(null);
		}
		
	}

	public static void day_action(ActionEvent e) {
		if(dRadioButton.isSelected()==true) {
			c.setBackground(null);
		}
	}
	public static void night_action(ActionEvent e) {
		if(e.getSource()==nRadioButton) {
			c.setBackground(Color.DARK_GRAY);
		}
	}

}