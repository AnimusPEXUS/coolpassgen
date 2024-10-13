
package org.wayround.coolpassgen;

public class MainWindow {

    private javax.swing.JFrame window;

    private org.wayround.coolpassgen.MainContent main_content;

    public MainWindow() {

        java.awt.Container cont_pane;

        this.window = new javax.swing.JFrame();

        cont_pane = this.window.getContentPane();
        cont_pane.setLayout(
            new javax.swing.BoxLayout(
                cont_pane,
                javax.swing.BoxLayout.Y_AXIS
            )
        );

        this.window.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.window.setTitle("Cool Password Generator");
        this.window.setResizable(true);

        this.main_content = new org.wayround.coolpassgen.MainContent(
            this.window
        );
        this.window.add(this.main_content.getWidget());

        this.window.setPreferredSize(new java.awt.Dimension(400, 400));
        this.window.pack();
    }

    public void show() {
        this.window.setLocationRelativeTo(null);
        this.window.setVisible(true);
        return;
    }

    public static void main(String args[]) {

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


        java.awt.EventQueue.invokeLater(
        new Runnable() {
            public void run() {
                new MainWindow().show();
            }
        }
        );
    }

}
