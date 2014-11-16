
package org.wayround.coolpassgen;

public class MainApplet extends javax.swing.JApplet {

    public void init() {

        try {
            javax.swing.UIManager.setLookAndFeel(
                javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(
                java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(
                java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(
                java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(
                java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            javax.swing.SwingUtilities.invokeAndWait(
                new org.wayround.coolpassgen.AppletRunnable(this) 
            );
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
}

