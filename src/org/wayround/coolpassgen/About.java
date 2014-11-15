
package org.wayround.coolpassgen;

public class About {


    private javax.swing.JEditorPane jEditorPane1;

    private javax.swing.JFrame window;

    public About() {
        initComponents();
    }

    private void initComponents() {

        this.window = new  javax.swing.JFrame("About CoolPassGen");

        this.jEditorPane1 = new javax.swing.JEditorPane();
        this.jEditorPane1.setBorder(
            javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)
            );

        this.window.add(this.jEditorPane1);

        this.window.setTitle("About");
        // this.window.setResizable(false);

        this.jEditorPane1.setContentType("text/html");
        this.jEditorPane1.setEditable(false);
        this.jEditorPane1
                .setText(
                    "<html><head></head>" +
                    "<body><p>This little, houpfuly useful to You, program, " +
                    "has been programmed in November 17 of 2014 " +
                    "by Alexey V Gorshkov.</p>" +
                    "<p>This program is assumed to " +
                    "be distributed under GNU General Public License v3," +
                    " so it's source must be in it's jar file :).</p>" +
                    "<strong>Tools used to create this program are:</strong>" +
                    "<ul>" +
                        "<li>java version \"1.7.0_71\"<br/>" +
                        "OpenJDK Runtime Environment (IcedTea 2.5.3) (linux-gnu build 1.7.0_71-b14)<br/>" +
                        "OpenJDK Server VM (build 24.65-b04, mixed mode)</li>" +
                        "<li>PyEditor " +
                        "(<a href=\"https://github.com/AnimusPEXUS/org_wayround_pyeditor\">" +
                        "https://github.com/AnimusPEXUS/org_wayround_pyeditor</a>)" +
                        "</li>" +
                    "</ul>" +
                    "<p>Main development repository for this program is:"+
                    " <a href=\"https://github.com/AnimusPEXUS/CoolPassGen\">" +
                    "https://github.com/AnimusPEXUS/CoolPassGen</a></p>"+
                    // ""+
                    "</body></html>"
                        );

        this.window.setPreferredSize(new java.awt.Dimension(400, 400));
        this.window.pack();
    }

    public void show(java.awt.Point location, java.awt.Dimension size) {
        this.window.setLocation(location);
        this.window.setSize(size);
        this.window.setVisible(true);
        return;
    }

}
