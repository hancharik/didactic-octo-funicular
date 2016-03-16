/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author mark
 */
public class MainPanel2 extends JPanel{
    
    Stars starData;
    
    TwentyOneGrid stars1;
    StarPanel stars2;
    TwentyOneGrid stars3;
    
    int disHereSize = 100;
    int midPoint = (disHereSize/2)-11;
    public int midPoint2x = midPoint;
    public int midPoint2y = midPoint;
    
    JLabel label1;
    JLabel label2;
    
    
    public  MainPanel2(){
    
        super();
        
        initializePanel();
        
       }  // end constructor

    
   private void initializePanel(){
       
       
       setLayout(null);
       
       setBackground(Color.BLUE);
       
       starData = new Stars(disHereSize);
        
      
       stars1 = new TwentyOneGrid();
       stars1.setBounds(80, 80, 400,400);
       stars1.setBackground(Color.blue);
       add(stars1);
       drawLocalStars(stars1, true, midPoint,midPoint);

       stars2 = new StarPanel(this);
       stars2.setBounds(560, 80, 400, 400);
       stars2.setBackground(Color.blue);
      add(stars2);
       drawLargeStarMap(stars2, false);

       stars3 = new TwentyOneGrid();
       stars3.setBounds(1040, 80, 400, 400);
       stars3.setBackground(Color.blue);
     add(stars3);
       drawLocalStars(stars3, true, midPoint,midPoint);
      
       
       label1 = new JLabel("<html><h1><font color='white' >" +  "(34,17)"  + "</font></h1></html>");
       label1.setBounds(732, 320, 400, 400);
       //label1.setForeground(Color.white);
     add(label1);
       
      label2 = new JLabel("<html><h1><font color='white' >" +  "(34,17)"  + "</font></h1></html>");
       label2.setBounds(1212, 320, 400, 400);
       //label1.setForeground(Color.white);
     add(label2);
       
       
   }   // end initialize panel
    
  
   
    public void drawLocalStars(TwentyOneGrid g21, boolean drawLines, int midX, int midY) {

        for (int i = 0; i < (21 * 21); i++) {

        }

        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {

                if (starData.starMap[i+midX][j+midY].starCheck()) {  // if(i < 1000){//
                    g21.buttonArray[i][j].setBackground(Color.white);
                    //g21.buttonArray[i][j].setText(i + "," + j);
                    g21.buttonArray[i][j].setBorderPainted(drawLines);

                } else {
                    g21.buttonArray[i][j].setBackground(Color.black);
                    g21.buttonArray[i][j].setBorderPainted(drawLines);
                }

            }
        }

    }  // end draw stars
  
    public void drawLargeStarMap(StarPanel g21, boolean drawLines) {

        for (int i = 0; i < (g21.size * g21.size); i++) {

        }

        for (int i = 0; i < g21.size; i++) {
            for (int j = 0; j < g21.size; j++) {

                if (starData.starMap[i][j].starCheck()) {  // if(i < 1000){//
                    g21.buttonArray[i][j].setBackground(Color.white);
                    //g21.buttonArray[i][j].setText(i + "," + j);
                    g21.buttonArray[i][j].setBorderPainted(drawLines);

                } else if(checkInRangeX(i) && checkInRangeY(j) ){  // draw these fisrt, so they default to overwritten when first drawn, makes it easier...
                    Color spaceGray2 = new Color(48,33,22);
                    g21.buttonArray[i][j].setBackground(spaceGray2);
                    g21.buttonArray[i][j].setBorderPainted(drawLines);
                } else if(checkInRange(i) && checkInRange(j) ){
                    Color spaceGray = new Color(38,23,42);
                    g21.buttonArray[i][j].setBackground(spaceGray);
                    g21.buttonArray[i][j].setBorderPainted(drawLines);
                } else {
                    g21.buttonArray[i][j].setBackground(Color.black);
                    g21.buttonArray[i][j].setBorderPainted(drawLines);
                }

            }
        }

    }  // end draw stars


private boolean checkInRange(int num){
    
    boolean temp = false;
    
    
    if (num > midPoint-1 && num < midPoint + 21){
        temp = true;
    }
    
    
    
    return temp;
}


private boolean checkInRangeX(int num){
    
    boolean temp = false;
    
    
    if (num > midPoint2x-1 && num < midPoint2x + 21){
        temp = true;
    }
    
    
    
    return temp;
}

private boolean checkInRangeY(int num){
    
    boolean temp = false;
    
    
    if (num > midPoint2y-1 && num < midPoint2y + 21){
        temp = true;
    }
    
    
    
    return temp;
}
    
}  // end class
