//file read from txt

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Login extends JFrame implements ActionListener{
	JLabel j1,j2,j3;
	JTextField tf1,tf2;
	//JPasswordField pf2;
	JFrame J;
	JButton b1,b2;
	JPanel p1,p2;
	
	Login(){
		J = new JFrame("Admin Login");
		
		
		j1 = new JLabel("Username");
		j2 = new JLabel("Password");
		tf1 = new JTextField(15);
		//pf2 = new JPasswordField(15);
		tf2 = new JTextField(10);
		
		
		b1 = new JButton("Login");
		b2 = new JButton("Cancel");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("image/pop.png"));
		Image i3 = ic3.getImage().getScaledInstance(160,190,Image.SCALE_DEFAULT);
		ImageIcon icc3 = new ImageIcon(i3);
		j3 = new JLabel(icc3);
		
		setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		J.add(j3,BorderLayout.WEST);
		
		p2.add(j1);
		p2.add(tf1);
		p2.add(j2);
		p2.add(tf2);
		J.add(p2,BorderLayout.CENTER);
		
		p1.add(b1);
		p1.add(b2);
		J.add(p1,BorderLayout.SOUTH);
		
		p2.setBackground(Color.lightGray);
	    p1.setBackground(Color.PINK);
		
		J.setResizable(false);
		J.setSize(440,400);
		J.setLocation(600,400);
		J.setVisible(true);
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
	
        public void actionPerformed(ActionEvent ae){			
		{			
				try{
					FileInputStream fis = new FileInputStream("login sheet.txt");       
			        Scanner sc = new Scanner(fis);
	                
                    while(sc.hasNextLine()){				
                    if(tf1.getText().equals("admin") && tf2.getText().equals("admin")) //username - admin , password - admin
					{
					  JOptionPane.showMessageDialog(null,"Login Successful.");
                      System.out.println(sc.nextLine()); 
					}
                else
				{
					JOptionPane.showMessageDialog(null,"Login Failed.");
					System.out.println(sc.nextLine());
				}	
			}    
		}  
		catch (Exception e) {
			e.printStackTrace();
	  }  
    }
  }
  public static void main(String[] args){
	 new Login();
 }	
} 


   
		
		
		
		
		
		
		
		
		
