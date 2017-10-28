package game;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Menu extends JFrame implements ActionListener{
    JButton option1;
    JButton option2;
    JButton option3;
    JLabel name;
    public Menu() {
    	option1=new JButton("Play Game");
    	option2=new JButton("View Instructions");
    	option3=new JButton("Exit");
    	option1.addActionListener(this);
    	option2.addActionListener(this);
    	option3.addActionListener(this);
    	name=new JLabel("HANGMAN");
    	name.setFont(new Font("Serif",Font.PLAIN,26));
    	setTitle("Hangman Game");
    	setSize(300,200);
    	setResizable(false);
    	setVisible(true);
    }
	public void addComponent() {
		setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
		c.weighty=0.1;
		c.anchor=c.CENTER;
		add(name,c);
		
		c.gridx=0;
		c.gridy=1;
		c.fill=c.HORIZONTAL;
		add(option1,c);
		
		c.gridx=0;
		c.gridy=2;
		c.fill=c.HORIZONTAL;
		add(option2,c);
		
		c.gridx=0;
		c.gridy=3;
		c.fill=c.HORIZONTAL;
		add(option3,c);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==option1){
			GameWindow obj=new GameWindow();
			obj.startGame();
		}
		else if(e.getSource()==option2){
			JOptionPane.showMessageDialog(this, "1.You can guess the word by clicking the character from the virtual keypad. \n2.You can select the maximum of incorrect 5. \n3.The incorrect  guess will be highlighted with red color, andd the correct one will be highlighted with green color.","Instruction",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(e.getSource()==option3){
			System.exit(0);
		}
	}
	

}
