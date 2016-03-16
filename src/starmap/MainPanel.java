/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author mark
 */
public class MainPanel extends JPanel{
    
    
  //  StarPanel stars;
    TwentyOneGrid twentyOne;
     
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
    
    
    
    
}  // end class
