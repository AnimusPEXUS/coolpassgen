
package org.wayround.coolpassgen;

public class AppletRunnable implements Runnable {

    private javax.swing.JApplet main_window;

    private org.wayround.coolpassgen.MainContent main_content;

    public AppletRunnable(javax.swing.JApplet main_window) {
        this.main_window = main_window;
    }

    public void run() {

        java.awt.Container cont_pane = null;

        cont_pane = this.main_window.getContentPane();
        cont_pane.setLayout(
            new javax.swing.BoxLayout(
                cont_pane,
                javax.swing.BoxLayout.Y_AXIS
            )
        );

        this.main_content =
            new org.wayround.coolpassgen.MainContent(
            this.main_window
        );

        this.main_window.add(this.main_content.getWidget());
        // this.main_window.pack();
    }

}