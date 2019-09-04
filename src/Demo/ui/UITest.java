/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo.ui;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author DELL
 */
public class UITest {
    
    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel Lab;
    
    
    public UITest()
    {
     raj();
        
    }
   public void raj(){
       
      f = new JFrame("JAVA");
      f.setVisible(true);
      f.setSize(500,250);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      p = new JPanel();
      p.setBackground(Color.white);
      
      b1 = new JButton("TEST CLICK");
      Lab = new JLabel("This is test lable");
      
      p.add(b1);
      p.add(Lab);
      
      f.add(p);
   } 
    
    public static void main(String[] args){
        new UITest();
    }
}
