import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton,dotButton,zeroButton,equalButton;
	JButton clearButton,mulButton,subButton,addButton,divButton;
	boolean isoperatorclicked=false,isaddbuttonclicked=false,issubbuttonclicked=false,isdivbuttonclicked=false,isequalbuttonclicked=false,ismulbuttonclicked=false;
	String oldVal;
	public Calculator() {
		jf=new JFrame("<CALCULATOR>");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300, 50);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		
		jf.add(displayLabel);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		sevenButton.setForeground(Color.WHITE);
		sevenButton.setBackground(Color.black);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);

		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);

		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);

		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);

		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);

		jf.add(dotButton);
		
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);

		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.addActionListener(this);

		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);

		jf.add(divButton);

		mulButton=new JButton("x");
		mulButton.setBounds(330, 230, 80, 80);
		mulButton.addActionListener(this);

		jf.add(mulButton);
		
		subButton=new JButton("-");
		subButton.setBounds(330, 330, 80, 80);
		subButton.addActionListener(this);

		jf.add(subButton);
		
		addButton=new JButton("+");
		addButton.setBounds(330, 430, 80, 80);
		addButton.addActionListener(this);

		jf.add(addButton);
		
		
		clearButton=new JButton("CLEAR");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.addActionListener(this);

		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new Calculator(); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//jf.getContentPane().setBackground(Color.CYAN);
		if (e.getSource()== sevenButton) {
			if (isoperatorclicked) {
				displayLabel.setText("7");
				isoperatorclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"7");

				}
			
			
		}
		else if (e.getSource()== eightButton) {
			if (isoperatorclicked) {
				displayLabel.setText("8");
				isoperatorclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"8");
				}
		}
			
			else if (e.getSource()== nineButton) {
				if (isoperatorclicked) {
					displayLabel.setText("9");
					isoperatorclicked=false;
					}else {
						displayLabel.setText(displayLabel.getText()+"9");
					}
			}else if (e.getSource()== sixButton) {
				if (isoperatorclicked) {
					displayLabel.setText("6");
					isoperatorclicked=false;
					}else {
						displayLabel.setText(displayLabel.getText()+"6");
					}


		
		}else if (e.getSource()== fiveButton) {
			if (isoperatorclicked) {
				displayLabel.setText("5");
				isoperatorclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"5");	
		}
		}else if (e.getSource()== fourButton) {
			if (isoperatorclicked) {
				displayLabel.setText("4");
				isoperatorclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"4");
				}
		}else if (e.getSource()== threeButton) {
			if (isoperatorclicked) {
				displayLabel.setText("3");
				isoperatorclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"3");	
		}
		}else if (e.getSource()== twoButton) {
			if (isoperatorclicked) {
				displayLabel.setText("2");
				isoperatorclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"2");
				}

		}else if (e.getSource()== oneButton) {
			if (isoperatorclicked) {
				displayLabel.setText("1");
				isoperatorclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"1");
				}
		}else if (e.getSource()== zeroButton) {
			if (isoperatorclicked) {
				displayLabel.setText("0");
				isoperatorclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+"0");
				}
		}else if (e.getSource()== dotButton) {
			if (isoperatorclicked) {
				displayLabel.setText(".");
				isoperatorclicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+".");
				}
		}else if (e.getSource()==equalButton) {
			isequalbuttonclicked=true;
			
			String newVal=displayLabel.getText();
			
			float oldValF=Float.parseFloat(oldVal);
			
			Float newValF=Float.parseFloat(newVal);
			
			
			
			if (isaddbuttonclicked && isequalbuttonclicked) {
				isaddbuttonclicked=false;
				Float result=oldValF+newValF;
				displayLabel.setText(result+"");
				
				
			}else if (issubbuttonclicked && isequalbuttonclicked) {
				issubbuttonclicked=false;
				Float result=oldValF-newValF;
				displayLabel.setText(result+"");	
			}else if (ismulbuttonclicked && isequalbuttonclicked) {
				ismulbuttonclicked=false;
				Float result=oldValF*newValF;
				displayLabel.setText(result+"");	
			}else if (isdivbuttonclicked && isequalbuttonclicked) {
				isdivbuttonclicked=false;
				Float result=oldValF/newValF;
				displayLabel.setText(result+"");	
			}
			
			
		}else if (e.getSource()== divButton) {
			isoperatorclicked=true;
			isdivbuttonclicked=true;
			oldVal=displayLabel.getText();
			
		}else if (e.getSource()== addButton) {
			isoperatorclicked=true;
			isaddbuttonclicked=true;
			oldVal=displayLabel.getText();

		}else if (e.getSource()==mulButton) {
			isoperatorclicked=true;
			ismulbuttonclicked=true;
			oldVal=displayLabel.getText();
			
		}else if (e.getSource()== subButton) {
			isoperatorclicked=true;
			issubbuttonclicked=true;
			oldVal=displayLabel.getText();

			
		}else if (e.getSource()== clearButton) {
			displayLabel.setText(" ");
		}
		
		
	}

}




