package part;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class indi {
	private static JTextField textField;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 255));
		f.setSize(700, 800);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MUSIC");
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 49, 147, 79);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(189, 67, 302, 27);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton b1 = new JButton("\uAC80\uC0C9");
		b1.setFont(new Font("�Ѹ�����ü Bold", Font.BOLD, 15));
		b1.setForeground(new Color(255, 255, 255));
		b1.setBackground(new Color(86, 86, 86));
		b1.setToolTipText("");
		b1.setBounds(491, 67, 97, 27);
		b1.setBorderPainted(false);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uBC1C\uB77C\uB4DC");
		b2.setFont(new Font("�Ѹ�����ü Bold", Font.BOLD, 20));
		b2.setBackground(new Color(255, 255, 255));
		b2.setBounds(40, 138, 97, 35);
		b2.setBorderPainted(false);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("\uB304\uC2A4");
		b3.setFont(new Font("�Ѹ�����ü Bold", Font.BOLD, 20));
		b3.setBorderPainted(false);
		b3.setBackground(Color.WHITE);
		b3.setBounds(189, 138, 97, 35);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("\uC778\uB514");
		b4.setFont(new Font("�Ѹ�����ü Bold", Font.BOLD, 20));
		b4.setBorderPainted(false);
		b4.setBackground(Color.WHITE);
		b4.setBounds(329, 138, 97, 35);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("\uD31D\uC1A1");
		b5.setFont(new Font("�Ѹ�����ü Bold", Font.BOLD, 20));
		b5.setBorderPainted(false);
		b5.setBackground(Color.WHITE);
		b5.setBounds(463, 138, 97, 35);
		f.getContentPane().add(b5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 181, 615, 15);
		f.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(218, 218, 218));
		lblNewLabel_1.setBounds(30, 206, 615, 516);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton b6 = new JButton("+");
		b6.setForeground(new Color(0, 0, 0));
		b6.setFont(new Font("�Ѹ�����ü Bold", Font.BOLD, 25));
		b6.setBorderPainted(false);
		b6.setBackground(new Color(255, 255, 255));
		b6.setBounds(582, 135, 52, 39);
		f.getContentPane().add(b6);
		
		JButton b7 = new JButton("Log out");
		b7.setToolTipText("");
		b7.setForeground(Color.WHITE);
		b7.setFont(new Font("Arial Narrow", Font.BOLD, 10));
		b7.setBorderPainted(false);
		b7.setBackground(new Color(86, 86, 86));
		b7.setBounds(603, 10, 69, 21);
		f.getContentPane().add(b7);
		
		JButton b8 = new JButton("My page");
		b8.setToolTipText("");
		b8.setForeground(Color.WHITE);
		b8.setFont(new Font("Arial Narrow", Font.BOLD, 10));
		b8.setBorderPainted(false);
		b8.setBackground(new Color(86, 86, 86));
		b8.setBounds(524, 10, 69, 21);
		f.getContentPane().add(b8);
		
		
		f.setVisible(true);
		
	}
}