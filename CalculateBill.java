//exception handling

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class CalculateBill extends JFrame implements ActionListener{
	JLabel j1,j2,j3,j4,j5;
	JTextField tf1,tf2;
	Choice c1;
	JFrame J;
	JButton b1;
	JPanel p1,p2;
	
	CalculateBill(){
		J = new JFrame("Calculate & Generate Bill");
		
		
		j1 = new JLabel("Meter No");
		j2 = new JLabel("Units Consumed");
		tf1 = new JTextField(10);
		tf2 = new JTextField(15);
		j5 = new JLabel("Amount Payable : ");
		
		b1 = new JButton("Calculate");
		
		b1.addActionListener(this);
		
		ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("image/hi.jpg"));
		Image i3 = ic3.getImage().getScaledInstance(150,320,Image.SCALE_DEFAULT);
		ImageIcon icc3 = new ImageIcon(i3);
		j3 = new JLabel(icc3);
		
		j4 = new JLabel("Month");
		c1 = new Choice();
		c1.add("January");
		c1.add("February");
		c1.add("March");
		c1.add("April");
		c1.add("May");
		c1.add("June");
		c1.add("July");
		c1.add("August");
		c1.add("September");
		c1.add("October");
		c1.add("November");
		c1.add("December");
		
		setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		J.add(j3,BorderLayout.WEST);
		
		p2.add(j1);
		p2.add(tf1);
		p2.add(j4);
		p2.add(c1);
		p2.add(j2);
		p2.add(tf2);
		p2.add(j5);
		J.add(p2,BorderLayout.CENTER);
		
		p1.add(b1);
		
		J.add(p1,BorderLayout.SOUTH);
		
		p2.setBackground(Color.lightGray);
	    p1.setBackground(Color.PINK);
		
		J.setResizable(false);
		J.setSize(500,400);
		J.setLocation(600,400);
		J.setVisible(true);
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 



        public void actionPerformed(ActionEvent ae){			
		{
             try{
				 if(ae.getSource()== b1){
					int a = Integer.parseInt(tf2.getText()); //converting string into integer
					double billpay = 0;
					if(a<100)
					{
		            billpay=a*1.20;
					}
    	            else if(a<300)
		            {
						billpay=100*1.20+(a-100)*2;
					}
	                else if(a>300)
		            {
						billpay=100*1.20+200 *2+(a-300)*3;
					}
					
                    j5.setText("Amount Payable : " + billpay + " Taka Only");        
        } 
			 }catch(NumberFormatException e){
		   j5.setText("Please Input Integer Only.");
		 }
	   }
	}
		 public static void main(String[] args){
	 new CalculateBill();
 }
}  
 






   
		
		
		
		
		
		
		
		
		
