
import java.awt.*;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NoGuessing extends Frame {

    Random rand = new Random();
    int countguess;

    NoGuessing(){

        int no2 = rand.nextInt(100)+1;
        countguess = 0;
        JFrame f= new JFrame("Number Guessing Game");    
        
        JPanel panel=new JPanel();  
        panel.setBounds(10,80,360,1000);    
     
        JButton b1=new JButton("        Guess        ");     
        b1.setBounds(100,300,100,30); 
    
        JButton next=new JButton("        Play Again        ");     
        b1.setBounds(100,300,100,30); 
    
        Font font = new Font("Serif",Font.BOLD,20);
        JLabel l = new JLabel("Guess the Number from 1 to 100\n");  
        l.setFont(font);
    
        JLabel l1 = new JLabel("Your Number :-   ");  
        JLabel l2 = new JLabel("Result :-        ");  
        JLabel l3 = new JLabel("Random Number :- ");  
        JLabel l7 = new JLabel("                              ");
        JLabel l4 = new JLabel("      Guesses :- ");
        JLabel l5 = new JLabel(countguess+"");
        JLabel l6 = new JLabel("                              ");
    
        JTextField myno = new JTextField(20);
        myno.setBounds(50,50,250,100);
        myno.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    
        JTextField message = new JTextField(20);
        message.setBounds(50,150,150,50);
        message.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    
        JTextField comno = new JTextField(20);
        comno.setBounds(50,250,150,50);
        comno.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        b1.addActionListener((event) -> {
        
            int mynum = Integer.parseInt(myno.getText());
            
            if(mynum == no2)
            {
                message.setText("You guessed the correct no");
            
                comno.setText(Integer.toString(no2));
                panel.add(next);
        
            }
            else if(mynum>no2)
            {
                message.setText("You no is greater");
            }
            else if(mynum<no2)
            {
                message.setText("You no is smaller");
            }
            else
            {
                message.setText("You guessed the wrong no");
            }
            countguess++;
            l5.setText(countguess+"");
        
        });
            next.addActionListener((event)->{
            f.getDefaultCloseOperation();
            new NoGuessing();
        });
    
        panel.add(l);
        panel.add(l1);

        panel.add(myno);
        panel.add(l2);
        panel.add(message);
    
        panel.add(l3);
        panel.add(comno);
        panel.add(l7);
        panel.add(l4);
    
        panel.add(l5);
        panel.add(l6);
        panel.add(b1); 
    
        f.add(panel);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(400,400);    
            f.setLayout(null);    
            f.setVisible(true);    
    }

    public static void main(String args[]){
        new NoGuessing();
    }

}