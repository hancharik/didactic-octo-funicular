/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;

import java.util.Random;

/**
 *
 * @author mark
 */
public class Grid {
    
    private int x;
    private int y;
    
    private boolean empty;
    
    Random starCreator6000;
    
    
    public  Grid(int x, int y){
    
        
       this.x = x;
       this.y = y;
       
       empty = isThereAstar();
        
    }  // end consrtuctor
    
    
 private boolean isThereAstar(){
     
     boolean temp = false;
     
     starCreator6000 = new Random();
     
     int chance = starCreator6000.nextInt(100);
     
     if(chance > 97){
         temp = true;
     }
     
     return temp;
     
 }   
public boolean starCheck(){
     
     
     return empty;
     
 }   
    
}  // end class
