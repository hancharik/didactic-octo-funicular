/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author mark
 */
public class StarPanel extends JPanel implements ActionListener {
    
    
    int size;
    
    JButton[][] buttonArray; 
    MainPanel2 main;
    
    public StarPanel(MainPanel2 m) {
        
        super();
        
        main = m;
        size = main.disHereSize;
        buildGrid();
       
    }  // end constructor
    
  
    private void buildGrid() {
        
        
        buttonArray = new JButton[size][size];
        
        
        GridLayout gridLayout = new GridLayout(size, size);
        setLayout(gridLayout);
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                JButton jj = new JButton();
                buttonArray[i][j] = jj;
                buttonArray[i][j].addActionListener(this);
                add(jj);
            }
        }
        
    }// end build grid

    @Override
    public void actionPerformed(ActionEvent event) {
        
        Object obj = event.getSource();
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                if (obj == buttonArray[i][j]) {
                    doSomethingToButton(i,j);
                    //doSomething();  // for learning purposes
                   buttonArray[i][j].setBackground(Color.red);
                }
            }            
        }
        
    }  // end action listener
    
    
   private void doSomething(){
       
       // do something here...
   } 
    
   private void doSomethingToButton(int x, int y){
       
       x = x + 1;
       y = y + 1;
       
       
       if(x > size - 10){
           x = size - 10;
       }
        if(y > size - 10){
           y = size - 10;
       }
        
       int correctedX = x - 11;
       int correctedY = y - 11;
       
       main.midPoint2x = x-11;
       main.midPoint2y = y-11;
       
       
    
       
       if(correctedX < 0){
          correctedX = 0;
        main.midPoint2x = 0;
       }
       if(correctedY < 0){
          correctedY = 0;
          main.midPoint2y = 0;
       }
       
      
       
       
       
       
       buttonArray[x][y].setBackground(Color.red);
       
       main.label2.setText("<html><h1><font color='white' >" +  "("  + x +  "," + y + ")"  + "</font></h1></html>");
       main.drawLocalStars(main.stars3, true, correctedX,correctedY);
        main.drawLargeStarMap( main.stars2, false);
   }    
    
   
      private void colorCenter(){
       
         buttonArray[11][11].setBackground(Color.green);
   }  
    
    
}  // end class
