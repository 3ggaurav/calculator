import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator {

	private JFrame frame;
	private JTextField tf1;
	String s;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(70, 31, 310, 53);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "0";
				tf1.setText(s);
			}
		});
		b0.setBounds(170, 231, 52, 42);
		frame.getContentPane().add(b0);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "1";
				tf1.setText(s);
			}
		});
		b1.setBounds(115, 186, 52, 42);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "2";
				tf1.setText(s);
			}
		});
		b2.setBounds(170, 186, 52, 42);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "3";
				tf1.setText(s);
			}
		});
		b3.setBounds(225, 186, 52, 42);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "4";
				tf1.setText(s);
			}
		});
		b4.setBounds(115, 141, 52, 42);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "5";
				tf1.setText(s);
			}
		});
		b5.setBounds(170, 141, 52, 42);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "6";
				tf1.setText(s);
			}
		});
		b6.setBounds(225, 141, 52, 42);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "7";
				tf1.setText(s);
			}
		});
		b7.setBounds(115, 96, 52, 42);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "8";
				tf1.setText(s);
			}
		});
		b8.setBounds(170, 96, 52, 42);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "9";
				tf1.setText(s);
			}
		});
		b9.setBounds(225, 96, 52, 42);
		frame.getContentPane().add(b9);
		
		JButton b_dev = new JButton("/");
		b_dev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "/";
				tf1.setText(s);
			}
		});
		b_dev.setBounds(280, 96, 52, 42);
		frame.getContentPane().add(b_dev);
		
		JButton b_mul = new JButton("*");
		b_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "*";
				tf1.setText(s);
			}
		});
		b_mul.setBounds(280, 141, 52, 42);
		frame.getContentPane().add(b_mul);
		
		JButton b_sum = new JButton("+");
		b_sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "+";
				tf1.setText(s);
			}
		});
		b_sum.setBounds(280, 231, 52, 44);
		frame.getContentPane().add(b_sum);
		
		JButton b_sub = new JButton("-");
		b_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "-";
				tf1.setText(s);
			}
		});
		b_sub.setBounds(280, 186, 52, 42);
		frame.getContentPane().add(b_sub);
		
		JButton b_eq = new JButton("=");
		b_eq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				char[] exp = s.toCharArray();
				for(int i=0; i<exp.length;i++)
				{
					if(s.charAt(i) != '+' && s.charAt(i)!= '-' && s.charAt(i) != '*' && s.charAt(i) != '/')
					{
						
					}
				}
			}
		});
		b_eq.setBounds(115, 231, 52, 42);
		frame.getContentPane().add(b_eq);
		
		JButton b_c = new JButton("C");
		b_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = null;
				tf1.setText(null);
			}
		});
		b_c.setBounds(225, 231, 52, 42);
		frame.getContentPane().add(b_c);
		
		JButton b_open = new JButton("(");
		b_open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s = tf1.getText();
				s = s + "(";
				tf1.setText(s);
			}
		});
		b_open.setBounds(335, 141, 52, 42);
		frame.getContentPane().add(b_open);
		
		JButton b_close = new JButton(")");
		b_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = tf1.getText();
				s = s + ")";
				tf1.setText(s);
			}
		});
		b_close.setBounds(335, 186, 52, 42);
		frame.getContentPane().add(b_close);
	}
}