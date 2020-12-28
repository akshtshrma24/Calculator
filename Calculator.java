//Made by DoctorAwal
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator 
{
	private static double firstNum;
	private static double secondNum;
	private static int typeOfFunction = 0;
	public static void main(String[] args)
	{
		/**
		 * making the calculator window
		 */
		JFrame calculator = new JFrame("Calculator");
		BoxLayout box = new BoxLayout(calculator.getContentPane(), BoxLayout.Y_AXIS);
		calculator.setLayout(box);
		calculator.setSize(250, 275);
		/**
		 * making the top panel, the text box, adding it to the frame
		 */
		JPanel topPanel = new JPanel();
		JTextArea textArea = new JTextArea(2,20);
		Font f = new Font("Times New Roman", Font.PLAIN,16);
		textArea.setFont(f);
		Dimension tp = new Dimension(250,304);
		topPanel.setMaximumSize(tp);
		textArea.setEditable(false);
		topPanel.add(textArea);
		calculator.add(topPanel);
		/**
		 * making bottom buttons  
		 */
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton add = new JButton("+");
		JButton zero = new JButton("0");
		JButton multiply = new JButton("x");
		JButton minus = new JButton("-");
		JButton equals = new JButton("=");
		JButton divide = new JButton("÷");
		JButton clear = new JButton("C");
		/**
		 * making the bottom panel and adding the buttons, adding the panel to the frame
		 */
		JPanel botPanel = new JPanel();
		botPanel.setLayout(new FlowLayout());
		botPanel.add(seven);
		botPanel.add(eight);
		botPanel.add(nine);
		botPanel.add(four);
		botPanel.add(five);
		botPanel.add(six);
		botPanel.add(one);
		botPanel.add(two);
		botPanel.add(three);
		botPanel.add(add);
		botPanel.add(zero);
		botPanel.add(multiply);
		botPanel.add(minus);
		botPanel.add(equals);
		botPanel.add(divide);
		botPanel.add(clear);
		calculator.add(botPanel);
		/**
		 * setting the visibility true, and setting it to close.
		 */
		calculator.setVisible(true);
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * adding action events
		 */
		class sevenB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("7");
			}
		}
		class eightB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("8");
			}
		}
		class nineB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("9");
			}
		}
		class fourB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("4");
			}
		}
		class fiveB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("5");
			}
		}
		class sixB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("6");
			}
		}
		class oneB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("1");
			}
		}
		class twoB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("2");
			}
		}
		class threeB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("3");
			}
		}
		class addB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				firstNum = Integer.parseInt(textArea.getText());
				typeOfFunction += 0;
				textArea.setText("");
			}
		}
		class zeroB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.append("0");
			}
		}
		class multiplyB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				firstNum = Double.parseDouble(textArea.getText());
				typeOfFunction = 2;
				textArea.setText("");
			}
		}
		class minusB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				firstNum = Double.parseDouble(textArea.getText());
				typeOfFunction = 1;
				textArea.setText("");
			}
		}
		class divideB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				firstNum = Double.parseDouble(textArea.getText());
				typeOfFunction =  -1;
				textArea.setText("");
			}
		}
		class equalsB implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				//METHOD
				secondNum = Double.parseDouble(textArea.getText());
				if(typeOfFunction == 0)
				{
					secondNum += firstNum;
					String temp = "" + secondNum;
					textArea.setText(temp);
				}
				else if(typeOfFunction == 1)
				{
					typeOfFunction = 0;
					firstNum -= secondNum;
					String temp = "" + firstNum;
					textArea.setText(temp);
				}
				else if(typeOfFunction == 2)
				{
					typeOfFunction = 0;
					secondNum *= firstNum;
					String temp = "" + secondNum;
					textArea.setText(temp);
				}
				else
				{
					typeOfFunction = 0;
					if(secondNum != 0)
					{
						firstNum /= secondNum;
						String temp = "" + firstNum;
						textArea.setText(temp);
					}
					else
					{
						textArea.setText("");
					}
				}
			}
		}
		class clearB implements ActionListener 
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.setText("");
			}
		}
		/**
		 * Make the button listen
		 */
		ActionListener sevenL = new sevenB();
		ActionListener eightL = new eightB();
		ActionListener nineL = new nineB();
		ActionListener fourL = new fourB();
		ActionListener fiveL = new fiveB();
		ActionListener sixL = new sixB();
		ActionListener oneL = new oneB();
		ActionListener twoL = new twoB();
		ActionListener threeL = new threeB();
		ActionListener addL = new addB();
		ActionListener zeroL = new zeroB();
		ActionListener multiplyL = new multiplyB();
		ActionListener minusL = new minusB();
		ActionListener divideL = new divideB();
		ActionListener equalsL = new equalsB();
		ActionListener clearL = new clearB();
		seven.addActionListener(sevenL);
		eight.addActionListener(eightL);
		nine.addActionListener(nineL);
		four.addActionListener(fourL);
		five.addActionListener(fiveL);
		six.addActionListener(sixL);
		one.addActionListener(oneL);
		two.addActionListener(twoL);
		three.addActionListener(threeL);
		add.addActionListener(addL);
		zero.addActionListener(zeroL);
		multiply.addActionListener(multiplyL);
		minus.addActionListener(minusL);
		divide.addActionListener(divideL);
		equals.addActionListener(equalsL);
		clear.addActionListener(clearL);
		/**
		 * adding color to the panels
		 */
		topPanel.setBackground(Color.LIGHT_GRAY);
		botPanel.setBackground(Color.LIGHT_GRAY);
	}
}