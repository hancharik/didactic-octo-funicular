/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author mark
 */
public class MainPanel extends JPanel{
    
    
  //  StarPanel stars;
    TwentyOneGrid twentyOne;
     // http://stackoverflow.com/questions/19125707/simplest-way-to-set-image-as-jpanel-background
    Image background = Toolkit.getDefaultToolkit().createImage("background.jpg");
    
    
    
    public  MainPanel(){
    
        super();
        
        initializePanel();
        
       }  // end constructor

    
   private void initializePanel(){
       
       
       setLayout(null);
       
      // stars = new StarPanel(this);
      // stars.setBounds(40,40,200,200);
       //stars.setBackground(Color.blue);
       //add(stars);
       
       
       twentyOne  = new TwentyOneGrid();
       twentyOne.setBounds(40,40,400,400);
       twentyOne.setBackground(Color.blue);
       add(twentyOne);
       
   } 
    
    @Override
  protected void paintComponent(Graphics g) {

    super.paintComponent(g);
        g.drawImage(background, 0, 0, null);
    }
    
    
}  // end class
