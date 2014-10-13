package MainPackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import MainPackage.Calc;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUIValue {

	private JFrame FutureValueCalculator;
	private JTextField year;
	private JTextField AnnualInterestRate;
	private JLabel AnnualRate;
	private JLabel futurevalue;
	private JTextField InitialInvestment;
	private JTextField FutureValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIValue window = new GUIValue();
					window.FutureValueCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIValue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FutureValueCalculator = new JFrame();
		FutureValueCalculator.setTitle("Future Value Calculator");
		FutureValueCalculator.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 12));
		FutureValueCalculator.getContentPane().setEnabled(false);
		FutureValueCalculator.setBounds(100, 100, 450, 300);
		FutureValueCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FutureValueCalculator.getContentPane().setLayout(null);
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Calc FutureValue = new Calc();
			
			double sum = Calc.futureValue(Double.parseDouble(InitialInvestment.getText()), Integer.parseInt(year.getText()), Double.parseDouble(AnnualRate.getText()));
				
			FutureValue.setText(Double.toString(sum));
		
			}
		});
		calculate.setBounds(260, 231, 134, 29);
		FutureValueCalculator.getContentPane().add(calculate);
		InitialInvestment = new JTextField();
		InitialInvestment.setFont(new Font("Tahoma", Font.PLAIN, 16));
		InitialInvestment.setBackground(new Color(255, 235, 205));
		InitialInvestment.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {char c = e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE ) || (c==KeyEvent.VK_DELETE))){
					e.consume();
				}
			}
		});
		InitialInvestment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		InitialInvestment.setBounds(229, 32, 165, 40);
		FutureValueCalculator.getContentPane().add(InitialInvestment);
		InitialInvestment.setColumns(10);
		
		year = new JTextField();
		year.setFont(new Font("Tahoma", Font.PLAIN, 16));
		year.setBackground(new Color(255, 235, 205));
		year.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char d = e.getKeyChar();
				if(!(Character.isDigit(d) || (d==KeyEvent.VK_BACK_SPACE ) || (d==KeyEvent.VK_DELETE))){
					e.consume();
				}
			}
		});
		year.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}
		});
		year.setColumns(10);
		year.setBounds(229, 78, 165, 40);
		FutureValueCalculator.getContentPane().add(year);
		
		AnnualInterestRate = new JTextField();
		AnnualInterestRate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		AnnualInterestRate.setBackground(new Color(255, 235, 205));
		AnnualInterestRate.addKeyListener(new KeyAdapter() {
			
		});
		AnnualInterestRate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
			
			}
		});
		AnnualInterestRate.setColumns(10);
		AnnualInterestRate.setBounds(229, 124, 165, 40);
		FutureValueCalculator.getContentPane().add(AnnualInterestRate);
		
		JLabel NewLabel = new JLabel("Investment Amount");
		NewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		NewLabel.setBounds(22, 38, 193, 16);
		FutureValueCalculator.getContentPane().add(NewLabel);
		
		JLabel Years = new JLabel("Years");
		Years.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		Years.setForeground(new Color(0, 0, 0));
		Years.setBounds(74, 83, 83, 18);
		FutureValueCalculator.getContentPane().add(Years);
		
		AnnualRate = new JLabel("Annual Interest Rate");
		AnnualRate.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		AnnualRate.setBounds(22, 130, 193, 16);
		FutureValueCalculator.getContentPane().add(AnnualRate);
		
		futurevalue = new JLabel("Future Value");
		futurevalue.setForeground(Color.BLACK);
		futurevalue.setFont(new Font("Dialog", Font.BOLD, 18));
		futurevalue.setBounds(39, 191, 213, 18);
		FutureValueCalculator.getContentPane().add(futurevalue);
		
		FutureValue = new JTextField();
		FutureValue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		FutureValue.setEditable(false);
		FutureValue.setBackground(new Color(127, 255, 212));
		FutureValue.setColumns(10);
		FutureValue.setBounds(229, 185, 165, 34);
		FutureValueCalculator.getContentPane().add(FutureValue);
	
	}
}