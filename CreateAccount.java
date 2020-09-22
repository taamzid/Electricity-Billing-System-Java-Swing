//file write in txt

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
                                                                                                                                                                    
public class CreateAccount extends JFrame implements ActionListener{
	JLabel j1,j2,j3;
	JTextField tf1,tf2;
	JFrame J;
	JButton b1;
	JPanel p1,p2;

	CreateAccount(){
		J = new JFrame("Create New Account");
		
		j1 = new JLabel("Username");
		j2 = new JLabel("Meter No");
		tf1 = new JTextField(15);
		tf2 = new JTextField(10);
		
		b1 = new JButton("Create account");
		
		b1.addActionListener(this);
		
		ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("image/pop.png"));
		Image i3 = ic3.getImage().getScaledInstance(150,190,Image.SCALE_DEFAULT);
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
		J.add(p1,BorderLayout.SOUTH);
		
		p2.setBackground(Color.lightGray);
	    p1.setBackground(Color.PINK);
		
		J.setResizable(false);
		J.setSize(440,400);
		J.setLocation(600,400);
		J.setVisible(true);
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 

    public void actionPerformed(ActionEvent ae)	{
	     { try 
            {
			   FileWriter fout = new FileWriter("New account sheet.txt",true);
			   fout.write(j1.getText() + " : " + tf1.getText());  
			   fout.write(j2.getText() + " : " + tf2.getText());  
               fout.close();
			   JOptionPane.showMessageDialog(null,"Account Created.");
	        } catch(Exception e)
	           {
				JOptionPane.showMessageDialog(null,e+"");
			   } 
	    }
    }
	public static void main(String[] args){
	  new CreateAccount();
 }	  
}

	
	