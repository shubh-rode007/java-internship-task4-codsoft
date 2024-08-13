package quizeaplication;
	import java.awt.Color;
    import java.awt.image.*;
	import java.awt.Component;
	import java.awt.Font;
	import java.awt.event.*;
	import javax.swing.*;


	public class Front extends JFrame implements ActionListener
	{
		JButton b;
		JButton r;
		JTextField t;
		String name;
		Front(){
			this.name=name;
			
		  getContentPane().setBackground((Color.CYAN));
			setLayout(null);
			
		
			
			JLabel h1= new JLabel("TECHNICAL QUIZ!");  
			h1.setBounds(750,15,400,45);
			h1.setFont(new Font("Viner Hand ITC",Font.BOLD,28)); 
			h1.setForeground(Color.black);
			add(h1);
			
			JLabel n = new JLabel("Enter your Name ");		
			n.setBounds(810,100, 300, 35);
			n.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
			add(n);
			
			t= new JTextField();			
			t.setBounds(735, 160, 300, 25);
			t.setFont(new Font("Viner Hand ITC",Font.BOLD,14));
			add(t);
			 
			r = new JButton("Rules");			
			r.setBounds(700, 230, 160, 27);
			r.setFont(new Font("Viner Hand ITC",Font.BOLD,15));
			r.setBackground(Color.WHITE);
			r.setForeground(Color.black);
			r.addActionListener(this);   
			add(r);
			
			b= new JButton("Back"); 			 //Back Button
			b.setBounds(900, 230, 160, 27);    
			b.setFont(new Font("Viner Hand ITC",Font.BOLD,15));
			b.setBackground(Color.white);
			b.setForeground(Color.black);
			b.addActionListener(this);      
			add(b);
			
			setSize(1200,500);  
			setLocation(100,100);  
			setVisible(true);	
			  
		}
		
		public void actionPerformed(ActionEvent ae)
		{
		if(ae.getSource()==r)
			{
				String name = t.getText();
				setVisible(true);
				new Rules(name);
			}
			else if(ae.getSource()==b)
			{
				setVisible(false);
			}
		
		
		}
		
		public static void main(String[] args)  
		{
			new Front();

		}

	}



