package calculator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Window {
	
	private static final int WIDTH = 375, HEIGHT = 340;
	private static JButton btnAdd, btnSub, btnMul, btnDiv, btnClr;
	private static JLabel lbl1, lbl2, result, title;
	private static JTextField tf1, tf2, tf_r;
	
	public Window() {
		JFrame frame = new JFrame("Calculator GUI Application");
		frame.setSize(new Dimension(WIDTH, HEIGHT));
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		initIDs();
		setBounds();
		setFont();
		frame.add(title);	frame.add(lbl1);	frame.add(lbl2);	frame.add(result);
		frame.add(tf1);		frame.add(tf2);		frame.add(tf_r);
		frame.add(btnAdd);	frame.add(btnSub);	frame.add(btnMul);	frame.add(btnDiv);	frame.add(btnClr);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		onClick();
	}
	
	private void initIDs() {
		lbl1 = new JLabel("Enter 1st Number :- ");
		lbl2 = new JLabel("Enter 2nd Number :- ");
		result = new JLabel("Your Answer Is :- ");
		title = new JLabel("Calculator App");
		
		btnAdd = new JButton("Addition");
		btnSub = new JButton("Subtract");
		btnMul = new JButton("Multiply");
		btnDiv = new JButton("Division");
		btnClr = new JButton("Clear All");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf_r = new JTextField();
	}
	private void setBounds() {
		lbl1.setBounds(25, 37, 150, 20);
		lbl2.setBounds(25, 72, 150, 20);
		result.setBounds(25, 112, 150, 20);
		title.setBounds(115, 5, 150, 20);
		
		tf1.setBounds(200, 35, 150, 25);
		tf2.setBounds(200, 70, 150, 25);
		tf_r.setBounds(200, 110, 150, 25);
		
		btnAdd.setBounds(25, 160, 125, 30);
		btnSub.setBounds(210, 160, 125, 30);
		btnMul.setBounds(25, 200, 125, 30);
		btnDiv.setBounds(210, 200, 125, 30);
		btnClr.setBounds(125, 250, 125, 30);
	}
	private void setFont() {
		lbl1.setFont(new Font("Monospace", Font.BOLD, 15));
		lbl2.setFont(new Font("Monospace", Font.BOLD, 15));
		result.setFont(new Font("Monospace", Font.BOLD, 15));
		title.setFont(new Font("Sans Serif", Font.BOLD, 18));
		
		tf1.setFont(new Font("Sans Serif", Font.BOLD, 15));
		tf2.setFont(new Font("Sans Serif", Font.BOLD, 15));
		tf_r.setFont(new Font("Sans Serif", Font.BOLD, 15));
		
		btnAdd.setFont(new Font("Monospace", Font.BOLD, 15));
		btnSub.setFont(new Font("Monospace", Font.BOLD, 15));
		btnMul.setFont(new Font("Monospace", Font.BOLD, 15));
		btnDiv.setFont(new Font("Monospace", Font.BOLD, 15));
		btnClr.setFont(new Font("Monospace", Font.BOLD, 15));
	}
	private void onClick() {
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				tf1.setText("");
				tf2.setText("");
				tf_r.setText("");
				result.setText("Your Answer Is :- ");
			}
		});
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double num1, num2, ans = 0.0;
				try {
					num1 = Double.parseDouble(tf1.getText());
					num2 = Double.parseDouble(tf2.getText());
					ans = num1 + num2;
					result.setText("Ans (" + num1 + "+" + num2 + "):-");
					tf_r.setText(Double.toString(ans));
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter the vlid values...");
				}
			}
		});
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double num1, num2, ans = 0.0;
				try {
					num1 = Double.parseDouble(tf1.getText());
					num2 = Double.parseDouble(tf2.getText());
					ans = num1 - num2;
					result.setText("Ans (" + num1 + "-" + num2 + "):-");
					tf_r.setText(Double.toString(ans));
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter the vlid values...");
				}
			}
		});
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double num1, num2, ans = 0.0;
				try {
					num1 = Double.parseDouble(tf1.getText());
					num2 = Double.parseDouble(tf2.getText());
					ans = num1 * num2;
					result.setText("Ans (" + num1 + "X" + num2 + "):-");
					tf_r.setText(Double.toString(ans));
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter the vlid values...");
				}
			}
		});
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double num1, num2, ans = 0.0;
				try {
					num1 = Double.parseDouble(tf1.getText());
					num2 = Double.parseDouble(tf2.getText());
					ans = num1 / num2;
					result.setText("Ans (" + num1 + "/" + num2 + "):-");
					tf_r.setText(Double.toString(ans));
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter the vlid values...");
				}
			}
		});
	}
}
