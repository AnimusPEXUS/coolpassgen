
package org.wayround.coolpassgen;

public class MainApplet extends javax.swing.JApplet {

    public void init() {

        try {
            javax.swing.SwingUtilities.invokeAndWait(
                new org.wayround.coolpassgen.AppletRunnable(this) 
            );
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
}

