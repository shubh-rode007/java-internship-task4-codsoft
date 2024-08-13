package quizeaplication;
import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
public class Quize extends JFrame implements ActionListener {
	    
	    String q[][] = new String[10][5];
	    String a[][] = new String[10][2];
	    String useranswers[][] = new String[10][1];
	    JLabel qno, question;
	    JRadioButton op1, op2, op3, op4;
	    ButtonGroup groupoptions;
	    JButton n, s, lifeline;
	    
	    public static int timer = 15;
	    public static int ans_given = 0;
	    public static int count = 0;
	    public static int score = 0;
	    public static int correct=0;
	    public static int incorrect=0;
	    
	    String name;
	    
	    Quize(String name) {
	        this.name = name;
	        setBounds(50, 0, 1440, 850);
	        getContentPane().setBackground(Color.cyan);
	        setLayout(null);
	        qno = new JLabel();
	        qno.setBounds(50, 10, 50, 30);
	        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
	        add(qno);
	        
	        question = new JLabel();
	        question.setBounds(100,10 , 900, 30);
	        question.setFont(new Font("Viner Hand ITC", Font.BOLD, 24));
	        add(question);
	        
	        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
	        q[0][1] = "JVM";
	        q[0][2] = "JDB";
	        q[0][3] = "JDK";
	        q[0][4] = "JRE";

	        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
	        q[1][1] = "int";
	        q[1][2] = "Object";
	        q[1][3] = "long";
	        q[1][4] = "void";

	        q[2][0] = "Which package contains the Random class?";
	        q[2][1] = "java.util package";
	        q[2][2] = "java.lang package";
	        q[2][3] = "java.awt package";
	        q[2][4] = "java.io package";

	        q[3][0] = "An interface with no fields or methods is known as?";
	        q[3][1] = "Runnable Interface";
	        q[3][2] = "Abstract Interface";
	        q[3][3] = "Marker Interface";
	        q[3][4] = "CharSequence Interface";

	        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
	        q[4][1] = "Stack";
	        q[4][2] = "String memory";
	        q[4][3] = "Random storage space";
	        q[4][4] = "Heap memory";

	        q[5][0] = "Which of the following is a marker interface?";
	        q[5][1] = "Runnable interface";
	        q[5][2] = "Remote interface";
	        q[5][3] = "Readable interface";
	        q[5][4] = "Result interface";

	        q[6][0] = "Which keyword is used for accessing the features of a package?";
	        q[6][1] = "import";
	        q[6][2] = "package";
	        q[6][3] = "extends";
	        q[6][4] = "export";

	        q[7][0] = "In java, jar stands for?";
	        q[7][1] = "Java Archive Runner";
	        q[7][2] = "Java Archive";
	        q[7][3] = "Java Application Resource";
	        q[7][4] = "Java Application Runner";

	        q[8][0] = "Which of the following is a mutable class in java?";
	        q[8][1] = "java.lang.StringBuilder";
	        q[8][2] = "java.lang.Short";
	        q[8][3] = "java.lang.Byte";
	        q[8][4] = "java.lang.String";

	        q[9][0] = "Which of the following option leads to the portability and security of Java?";
	        q[9][1] = "Bytecode is executed by JVM";
	        q[9][2] = "The applet makes the Java code secure and portable";
	        q[9][3] = "Use of exception handling";
	        q[9][4] = "Dynamic binding between objects";
	        
	        a[0][1] = "JDB";
	        a[1][1] = "int";
	        a[2][1] = "java.util package";
	        a[3][1] = "Marker Interface";
	        a[4][1] = "Heap memory";
	        a[5][1] = "Remote interface";
	        a[6][1] = "import";
	        a[7][1] = "Java Archive";
	        a[8][1] = "java.lang.StringBuilder";
	        a[9][1] = "Bytecode is executed by JVM";
	        
	        op1 = new JRadioButton();
	        op1.setBounds(100, 100, 700, 30);
	        op1.setBackground(Color.WHITE);
	        op1.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
	        add(op1);
	        
	        op2 = new JRadioButton();
	        op2.setBounds(100, 150, 700, 30);
	        op2.setBackground(Color.WHITE);
	        op2.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
	        add(op2);
	        
	        op3 = new JRadioButton();
	        op3.setBounds(100, 200, 700, 30);
	        op3.setBackground(Color.WHITE);
	        op3.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
	        add(op3);
	        
	        op4 = new JRadioButton();
	        op4.setBounds(100, 250, 700, 30);
	        op4.setBackground(Color.WHITE);
	        op4.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
	        add(op4);
	        
	        groupoptions = new ButtonGroup();
	        groupoptions.add(op1);
	        groupoptions.add(op2);
	        groupoptions.add(op3);
	        groupoptions.add(op4);
	        
	        n = new JButton("Next");
	        n.setBounds(100, 350, 200, 40);
	        n.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
	        n.setBackground(Color.white);
	        n.setForeground(Color.black);
	        n.addActionListener(this);
	        add(n);
	        
	        lifeline = new JButton("50-50 Lifeline");
	        lifeline.setBounds(1100, 550, 200, 40);
	        lifeline.setFont(new Font("Viner Hand ITC",Font.BOLD, 22));
	        lifeline.setBackground(Color.white);
	        lifeline.setForeground(Color.black);
	        lifeline.addActionListener(this);
	        add(lifeline);
	        
	        s = new JButton("Submit");
	        s.setBounds(700, 350, 200, 40);
	        s.setFont(new Font("Viner Hand ITC", Font.BOLD, 22));
	        s.setBackground(Color.white);
	        s.setForeground(Color.black);
	        s.addActionListener(this);
	        s.setEnabled(false);
	        add(s);
	        
	        start(count);
	        
	        setVisible(true);
	    }
	    
	    public void actionPerformed(ActionEvent ae) {
	        if (ae.getSource() == n) {
	            repaint();
	            op1.setEnabled(true);
	            op2.setEnabled(true);
	            op3.setEnabled(true);
	            op4.setEnabled(true);
	            
	            ans_given = 1;
	            if (groupoptions.getSelection() == null) {
	               useranswers[count][0] = "";
	            } else {
	                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
	            }
	            
	            if (count == 8) {
	                n.setEnabled(false);
	                s.setEnabled(true);
	            }
	            
	            count++;
	            start(count);
	        } else if (ae.getSource() == lifeline) {
	            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
	                op2.setEnabled(false);
	                op3.setEnabled(false);
	            } else {
	                op1.setEnabled(false);
	                op4.setEnabled(false);
	            }
	            lifeline.setEnabled(false);
	        } else if (ae.getSource() == s) {
	            ans_given = 1;
	            if (groupoptions.getSelection() == null) {
	                useranswers[count][0] = "";
	            } else {
	                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
	            }

	            for (int i = 0; i < useranswers.length; i++) {
	                if (useranswers[i][0].equals(a[i][1])) {
	                    score += 10;
	                    
	                } else {
	                    score += 0;
	                    
	                }
	            }
	            setVisible(false);
	            new Score(name, score);
	        }
	    }
	    
	    public void paint(Graphics g) {
	        super.paint(g);
	        
	        String time = "Time left - " + timer + " seconds"; // 15
	        g.setColor(Color.blue);
	        g.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
	        
	        if (timer > 0) { 
	            g.drawString(time, 1100, 500);
	        } else {
	            g.drawString("Times up!!", 1100, 500);
	        }
	        
	        timer--; // 14
	        
	        try {
	            Thread.sleep(1000);
	            repaint();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        if (ans_given == 1) {
	            ans_given = 0;
	            timer = 15;
	        } else if (timer < 0) {
	            timer = 15;
	            op1.setEnabled(true);
	            op2.setEnabled(true);
	            op3.setEnabled(true);
	            op4.setEnabled(true);
	            
	            if (count == 8) {
	                n.setEnabled(false);
	                s.setEnabled(true);
	            }
	            if (count == 9) { // submit button
	                if (groupoptions.getSelection() == null) {
	                   useranswers[count][0] = "";
	                } else {
	                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
	                }
	                
	                for (int i = 0; i < useranswers.length; i++) {
	                    if (useranswers[i][0].equals(a[i][1])) {
	                        score += 10;
	                        
	                    } else {
	                        score += 0;
	                        
	                    }
	                }
	                setVisible(false);
	                new Score( name, score );
	            } else { // next button
	                if (groupoptions.getSelection() == null) {
	                   useranswers[count][0] = "";
	                } else {
	                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
	                }
	                count++; // 0 // 1
	                start(count);
	            }
	        }
	        
	    }
	    
	    public void start(int count) {
	        qno.setText("" + (count + 1) + ". ");
	        question.setText(q[count][0]);
	        op1.setText(q[count][1]);
	        op1.setActionCommand(q[count][1]);
	        
	        op2.setText(q[count][2]);
	        op2.setActionCommand(q[count][2]);
	        
	        op3.setText(q[count][3]);
	        op3.setActionCommand(q[count][3]);
	        
	        op4.setText(q[count][4]);
	        op4.setActionCommand(q[count][4]);
	        
	        groupoptions.clearSelection();
	    }
	    
	    public static void main(String[] args) {
	      Quize q=  new Quize("User");
	    }
	}
	    
	
