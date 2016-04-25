
package org.wayround.coolpassgen;

public class MainContent {

     private java.awt.Component main_window;

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;

    private javax.swing.Box p00;

    private org.wayround.coolpassgen.About about_window;

    String[][] Strengths = {
        {"Full Set",
            "[`~0-9!@#$%^&*()-_=+a-zA-Z[{]}\\|;:'\",<.>/? ]"},
        {"Full Set without spaces",
            "[`~0-9!@#$%^&*()-_=+a-zA-Z[{]}\\|;:'\",<.>/?]"},
        {"base64 and spaces",
            "[0-9a-zA-Z ]"},
        {"base64",
            "[0-9a-zA-Z]"},
        {"Letters and spaces",
            "[a-zA-Z ]"},
        {"Only Letters",
            "[a-zA-Z]"},
        {"digits and spaces",
            "[0-9 ]"},
        {"digits",
            "[0-9]"},
        {"UPPER and spaces",
            "[A-Z ]"},
        {"UPPER",
            "[A-Z]"},
        {"lower and spaces",
            "[a-z ]"},
        {"lower",
            "[a-z]"}
    };

    public MainContent(java.awt.Component main_window) {

        this.main_window = main_window;

        this.about_window = new org.wayround.coolpassgen.About();

        this.initComponents();

        jComboBox1.removeAllItems();
        for (int i = 0; i != Strengths.length; i++) {
            jComboBox1.addItem("(" + Strengths[i][0] + ") " + Strengths[i][1]);
        }
        jComboBox1.addItem("Custom...");
        processPatternEditor();
    }

    private void initComponents() {

        java.awt.Container cont_pane = null;

        this.jButton1 = new javax.swing.JButton();
        this.jButton2 = new javax.swing.JButton();
        this.jButton3 = new javax.swing.JButton();


        this.jTextArea2 = new javax.swing.JTextArea();

        this.jTextField1 = new javax.swing.JTextField();
        this.jTextField2 = new javax.swing.JTextField();

        this.jProgressBar2 = new javax.swing.JProgressBar();

        this.jLabel3 = new javax.swing.JLabel();
        this.jComboBox1 = new javax.swing.JComboBox<String>();
        this.jSpinner1 = new javax.swing.JSpinner();

        jButton2.setText("About...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea2.setLineWrap(true);
        jTextArea2.setText(
            "Using this tool, You can create a new random " +
            "password accordingly to desired regular expression"
            );
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(
            javax.swing.BorderFactory.createTitledBorder("Short Info")
            );
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea2.setFocusable(false);

        jButton1.setText("Generate!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 14));

        jProgressBar2.setStringPainted(true);

        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 14));

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 8));
        jComboBox1.setMaximumRowCount(20);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(20, 6, 256, 1));

        jLabel3.setText("Password Length");

        jButton3.setText("Copy to Clipboard");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        this.p00 = new javax.swing.Box(javax.swing.BoxLayout.Y_AXIS);
        p00.setBorder(
            javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)
            );

        javax.swing.Box p01 = new javax.swing.Box(javax.swing.BoxLayout.Y_AXIS);
        javax.swing.Box p02 = new javax.swing.Box(javax.swing.BoxLayout.X_AXIS);
        javax.swing.Box p03 = new javax.swing.Box(javax.swing.BoxLayout.Y_AXIS);
        javax.swing.Box p05 = new javax.swing.Box(javax.swing.BoxLayout.X_AXIS);
        javax.swing.Box p06 = new javax.swing.Box(javax.swing.BoxLayout.Y_AXIS);

        p06.add(p01);
        p06.add(p02);

        p01.setBorder(
            javax.swing.BorderFactory.createTitledBorder(
                "Regular Expression for Acceptable Characters"
                )
            );

        p06.setBorder(
            javax.swing.BorderFactory.createTitledBorder(
                "Desired Password Strength"
                )
            );

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        p01.add(jComboBox1);
        p01.add(jTextField1);

        p02.add(jLabel3);
        p02.add(jSpinner1);

        p03.add(jTextField2);
        p03.add(jProgressBar2);

        p05.add(jButton2);
        p05.add(javax.swing.Box.createGlue());
        p05.add(jButton1);
        p05.add(javax.swing.Box.createGlue());
        p05.add(jButton3);

        p03.setBorder(
            javax.swing.BorderFactory.createTitledBorder(
                "Result"
                )
            );

        p00.add(jTextArea2);
        p00.add(p06);
        p00.add(p03);
        p00.add(p05);

        // jTextField1.getMaximumSize().height = 30;
        // jTextField2.getMaximumSize().height = 30;

        jTextField1.setMaximumSize(
            new java.awt.Dimension(
                jTextField1.getMaximumSize().width,
                30
                )
            );

        jTextField1.setMinimumSize(
            new java.awt.Dimension(
                jTextField1.getMinimumSize().width,
                30
                )
            );

    }

    public javax.swing.Box getWidget() {
        return this.p00;
    }

    private void processPatternEditor() {
        int ind = jComboBox1.getSelectedIndex();
        int count = jComboBox1.getItemCount();
        if (ind == count - 1) {
            jTextField1.setEditable(true);
        } else {
            jTextField1.setEditable(false);
            jTextField1.setText(Strengths[ind][1]);
        }
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        processPatternEditor();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        boolean error = false;

        String re_str = jTextField1.getText();

        int out_pass_len = Integer.valueOf(jSpinner1.getValue().toString());
        int out_pass_i;
        char new_char_c;

        java.util.Random rand = new java.util.Random();

        java.util.regex.Pattern pat = null;
        java.util.regex.Matcher mat = null;

        try {
            pat = java.util.regex.Pattern.compile(re_str);
        } catch (java.util.regex.PatternSyntaxException e) {
            javax.swing.JOptionPane.showMessageDialog(
                this.main_window,
                "Regular expression error",
                "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            error = true;
        }

        if (error) {
        } else {

            jTextField2.setText("");
            jProgressBar2.setMaximum(out_pass_len);
            jProgressBar2.setValue(0);

            out_pass_i = 0;
            while (true) {
                new_char_c = (char) rand.nextInt(256);
                mat = pat.matcher(String.valueOf(new_char_c));
                if (mat.matches()) {
                    jTextField2.setText(jTextField2.getText() + new_char_c);
                    jProgressBar2.setValue(jTextField2.getText().length());
                    if (jTextField2.getText().length() >= out_pass_len) {
                        break;
                    }
                }
                out_pass_i++;
                if (out_pass_i >= 1000000) {
                    javax.swing.JOptionPane.showMessageDialog(
                        this.main_window,
                        "Maybe Yove done something wrong with Regular Expression\n"
                        + "Please refer to Regular Expressions Documentation",
                        "Timeout",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
                    jTextField2.setText("");
                    jProgressBar2.setMaximum(out_pass_len);
                    jProgressBar2.setValue(0);
                    break;
                }
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.about_window.show(
            this.main_window.getLocation(),
            this.main_window.getSize()
            );
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.datatransfer.Clipboard a =
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
        a.setContents(new java.awt.datatransfer.StringSelection(
            jTextField2.getText()), null);
    }

}
