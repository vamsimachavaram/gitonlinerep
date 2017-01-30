package jfram;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;

public class JFR extends JFrame {              // provide extends jframe anfter class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame("welcome");
		f.setSize(500,300);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.blue);;    //provide extra for getcontentpane
		f.setDefaultCloseOperation(JFR.EXIT_ON_CLOSE);
	    f.setGlassPane(null);
	    
	 //   f.setIcon(new ImageIcon("C:\Users\Machavaram Vamsi\Downloads\images"));
	    
     	}

}