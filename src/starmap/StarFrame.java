/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starmap;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author mark
 */
public class StarFrame  extends JFrame {

    
    MainPanel2 main = new MainPanel2();

    public StarFrame() {
        super("<<<<<<   Star Map Array Test   >>>>>>");

        getContentPane().setLayout(new BorderLayout());

        getContentPane().add(main, "Center");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(1600, 820);
        this.setLocation(100, 100);
        setVisible(true);
    } // end constructor

}
