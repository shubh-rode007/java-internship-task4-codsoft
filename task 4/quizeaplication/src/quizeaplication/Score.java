package quizeaplication;

	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;

	public class Score extends JFrame implements ActionListener {

	    Score(String name, int score) {
	        setBounds(400, 150, 750, 550);
	        getContentPane().setBackground(Color.cyan);
	        setLayout(null);
	         JLabel heading = new JLabel("Thank you " + name + " for playing Technical Quiz");
	        heading.setBounds(100, 40, 700, 30);
	        heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 26));
	        add(heading);
	        
	        JLabel lblscore = new JLabel("Your score is " + score);
	        lblscore.setBounds(100, 150, 300, 30);
	        lblscore.setFont(new Font("Viner Hand ITC", Font.BOLD, 26));
	        add(lblscore);
	        
	        JButton submit = new JButton("Play Again");
	        submit.setBounds(100, 250, 120, 30);
	        submit.setBackground(Color.white);
	        submit.setForeground(Color.black);
	        submit.addActionListener(this);
	        add(submit);
	        
	        setVisible(true);
	        
	        JLabel ans=new JLabel("correct answer is "+score/10+" and the incorrect answer is "+(100-score)/10);
	        ans.setBounds(100, 300, 500, 100);
	        ans.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
	        add(ans);
	        
	    }
	    
	    public void actionPerformed(ActionEvent ae) {
	        setVisible(false);
	        new Front();
	    }

	    public static void main(String[] args) {
	        new Score("User", 0);
	        
	    }
	}
		

