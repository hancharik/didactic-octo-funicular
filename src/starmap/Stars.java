/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;

import java.text.DecimalFormat;

/**
 *
 * @author mark
 */
public class Stars {
    
    
    Grid[][] starMap;
    
    private int size;
    
    
    public  Stars(int s){
    
        this.size = s;
      createStarMap(size);  
        
        
    }// end constructor

   private void createStarMap(int sideLength){
       
       
       long startTime = System.currentTimeMillis();
       
       int counter = 0;
       
       starMap = new Grid[sideLength][sideLength];
       
       for(int i = 0; i < sideLength; i++){
            for(int j = 0; j < sideLength; j++){
                starMap[i][j] = new Grid(i,j);
                counter++;
            }
       }
       
      
       System.out.print(counter + " records (" + sideLength + "x" + sideLength + ") ");
        long endTime = System.currentTimeMillis();
       long totalTime = endTime - startTime;
       System.out.print("created in " + totalTime);
       double timePer = (double)counter/totalTime;
       DecimalFormat df = new DecimalFormat("#.00"); 
       System.out.println(" miliseconds, (" + df.format(timePer) + " entries per milisecond)");
       
   }  // end create star map
    
    
}  // end class
