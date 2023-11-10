import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class form extends JFrame {
	String number="0";
	private JPanel panel1;
	private JButton n1;
	private JButton n3;
	private JButton n4;
	private JButton n2;
	private JButton n7;
	private JButton n5;
	private JButton n9;
	private JButton n8;
	private JButton n0;
	private JButton n6;
	private JTextField textField1;
	private JButton div;
	private JButton mul;
	private JButton min;
	private JButton sum;
	private JButton iik;
	private JButton coma;
	private JButton begonebitch;
	private JButton AC;
	private JButton UwU;
	private JButton percentile;

	public form() {
		n1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=is0(number);
				number+= "1";
				textField1.setText(number);
			}
		});
		n2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=is0(number);
				number+= "2";
				textField1.setText(number);
			}
		});
		n3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=is0(number);
				number+= "3";
				textField1.setText(number);
			}
		});
		n4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=is0(number);
				number+= "4";
				textField1.setText(number);
			}
		});
		n5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=is0(number);
				number+= "5";
				textField1.setText(number);
			}
		});
		n6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=is0(number);
				number+= "6";
				textField1.setText(number);
			}
		});
		n7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=is0(number);
				number+= "7";
				textField1.setText(number);
			}
		});
		n8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=is0(number);
				number+= "8";
				textField1.setText(number);
			}
		});
		n9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=is0(number);
				number+= "9";
				textField1.setText(number);
			}
		});
		n0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=is0(number);
				number+= "0";
				textField1.setText(number);
			}
		});
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "/";
				textField1.setText(number);
			}
		});
		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "x";
				textField1.setText(number);
			}
		});
		min.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "-";
				textField1.setText(number);
			}
		});
		sum.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += "+";
				textField1.setText(number);

			}
		});
		iik.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number= String.valueOf(CalculadoraRecursiva.evaluarExpresion(number));
				textField1.setText(number);
			}
		});

		coma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number += ".";
				textField1.setText(number);
			}
		});
		begonebitch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number=removeLastChar(number);
				textField1.setText(number);
			}
		});
		AC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number= "0";
				number += "+";textField1.setText(number);
			}
		});
	}
	public String removeLastChar(String s) {
		return (s == null || s.length() == 0)
				? null
				: (s.substring(0, s.length() - 1));
	}
	public String is0(String number){
		if (number.equals("0")){
			return "";
		}else {
			return number;
		}
	}

	public static void main(String[] args) {
		form f= new form();
		f.textField1.setText(f.number);
		f.setContentPane(f.panel1);
		f.setVisible(true);
		f.setSize(316, 184);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
