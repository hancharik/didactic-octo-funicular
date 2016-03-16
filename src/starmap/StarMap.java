/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;

/**
 *
 * @author mark
 */
public class StarMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int amount = 100;
        
        for(int i = 0; i < 10; i++){
             Stars s = new Stars(amount);
            amount = amount + 2;
        }
        
      
       StarFrame sf = new StarFrame();
       
       
       
       
    }
    
}
