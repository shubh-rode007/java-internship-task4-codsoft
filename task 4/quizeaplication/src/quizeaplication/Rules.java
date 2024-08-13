package quizeaplication;


	import java.awt.Color;
	 import java.awt.Font;
	 import java.awt.event.ActionEvent;
	 import java.awt.event.ActionListener;

	 import javax.swing.*;
	 public class Rules extends JFrame implements ActionListener{

	     String n;
	     JButton s, b;
		private String name;
	     
	     Rules(String name) {
	         this.name= name;
	         getContentPane().setBackground(Color.cyan);
	         setLayout(null);
	         
	         JLabel heading = new JLabel( name + " Always Remind follow Rules");
	         heading.setBounds(20, 20, 700, 30);
	         heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
	         heading.setForeground(Color.BLACK);
	         add(heading);
	         
	         JLabel rules = new JLabel();
	         rules.setBounds(20, 90, 700, 350);
	         rules.setFont(new Font("Viner Hand ITC", Font.BOLD, 16));
	         rules.setText(
	             "<html>"+ 
	                 "1.  try to solve each and every questions " + "<br><br>" +
	                 "2.Make sure to click save buttton" + "<br><br>" +
	                 "3.Time limit is given for each questions" + "<br><br>" +
	                 "4. Crying is allowed but please do so quietly." + "<br><br>" +
	                 "5. Try to solve without using phone or help of frind" + "<br><br>" +
	                 "6. We are catch your evry moment" + "<br><br>" +
	                 "7. Negative marking should consider" + "<br><br>" +
	                 "8. solve quicly make improve in rank" + "<br><br>" +
	             "<html>"
	         );
	         add(rules);
	         
	         b = new JButton("Back");
	         b.setBounds(20, 500, 100, 20);
	         b.setBackground(Color.white);
	         b.setForeground(Color.black);
	         b.addActionListener(this);
	         add(b);
	         
	         s = new JButton("Start");
	         s.setBounds(400, 500, 100, 20);
	         s.setBackground(Color.white);
	         s.setForeground(Color.black);
	         s.addActionListener(this);
	         add(s);
	         
	         setSize(800, 650);
	         setLocation(350, 100);
	         setVisible(true);
	     }
	     
	     public void actionPerformed(ActionEvent ae) {
	         if (ae.getSource() == s) {
	             setVisible(false);
	            new Quize(name);
	         } else {
	             setVisible(false);
	             new Front();
	         }
	     }
	     
	     public static void main(String[] args) {
	         new Rules("User");
	     }
	 }

