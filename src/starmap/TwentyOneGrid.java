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
public class TwentyOneGrid extends JPanel implements ActionListener {
    
    JButton[][] buttonArray = new JButton[21][21];
    
    public TwentyOneGrid() {
        
        super();
        
        buildGrid();
        
    }  // end constructor
    
    private void buildGrid() {
        
        GridLayout gridLayout = new GridLayout(21, 21);
        setLayout(gridLayout);
        
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
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
        
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                
                if (obj == buttonArray[i][j]) {
                    doSomethingToButton(i,j);
                    //doSomething();  // for learning purposes
                    //buttonArray[i][j].setBackground(Color.red);
                }
            }            
        }
        
    }  // end action listener
    
    
   private void doSomething(){
       
       // do something here...
   } 
    
   private void doSomethingToButton(int x, int y){
       
       buttonArray[x][y].setBackground(Color.red);
   }    
    
    
    
    
}  // end class
