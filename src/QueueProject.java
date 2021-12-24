package queue;

import javax.swing.JOptionPane;
import static queue.Queue.getPercesoin;

public class QueueProject extends javax.swing.JFrame {

    DeterministicQ Dc1, Dc2;

    public QueueProject() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        this.setTitle("Queues Determinator");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        buttongraph = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        buttonresult11 = new javax.swing.JButton();
        textlamda1 = new javax.swing.JTextField();
        textmu1 = new javax.swing.JTextField();
        textn1 = new javax.swing.JTextField();
        textc1 = new javax.swing.JTextField();
        textk1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        M1 = new javax.swing.JLabel();
        textlamda = new javax.swing.JTextField();
        lamda6 = new javax.swing.JLabel();
        textmu = new javax.swing.JTextField();
        lamda7 = new javax.swing.JLabel();
        textm = new javax.swing.JTextField();
        buttonresult1 = new javax.swing.JButton();
        textk = new javax.swing.JTextField();
        ti1 = new javax.swing.JLabel();
        textn = new javax.swing.JTextField();
        nt1 = new javax.swing.JLabel();
        textt = new javax.swing.JTextField();
        result_l = new javax.swing.JTextField();
        ti = new javax.swing.JLabel();
        result_lq = new javax.swing.JTextField();
        nt = new javax.swing.JLabel();
        result_w = new javax.swing.JTextField();
        wqn = new javax.swing.JLabel();
        result_ti = new javax.swing.JTextField();
        Models = new javax.swing.JComboBox();
        Models1 = new javax.swing.JComboBox();
        l = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        M = new javax.swing.JLabel();
        lamda3 = new javax.swing.JLabel();
        lamda4 = new javax.swing.JLabel();
        lamda5 = new javax.swing.JLabel();
        result_wq = new javax.swing.JTextField();
        ti2 = new javax.swing.JLabel();
        result_nt = new javax.swing.JTextField();
        nt4 = new javax.swing.JLabel();
        result_wqn = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("jCheckBoxMenuItem5");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Get Graph");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        buttongraph.setBackground(new java.awt.Color(0, 0, 0));
        buttongraph.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttongraph.setForeground(new java.awt.Color(255, 255, 255));
        buttongraph.setText("Get Graph");
        buttongraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttongraphActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hr", "Min", "Sec", " " }));

        buttonresult11.setBackground(new java.awt.Color(0, 0, 0));
        buttonresult11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonresult11.setForeground(new java.awt.Color(255, 255, 255));
        buttonresult11.setText("Get Results");
        buttonresult11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonresult11ActionPerformed(evt);
            }
        });

        textlamda1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textlamda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textlamda1ActionPerformed(evt);
            }
        });

        textmu1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textmu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textmu1ActionPerformed(evt);
            }
        });

        textn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textn1ActionPerformed(evt);
            }
        });

        textc1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textc1ActionPerformed(evt);
            }
        });

        textk1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textk1ActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Lamda");
        l1.setAlignmentX(0.5F);

        m1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m1.setForeground(new java.awt.Color(255, 255, 255));
        m1.setText("Mu");
        m1.setAlignmentX(0.5F);

        M1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        M1.setForeground(new java.awt.Color(255, 255, 255));
        M1.setText("n");
        M1.setAlignmentX(0.5F);

        textlamda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textlamda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textlamdaActionPerformed(evt);
            }
        });

        lamda6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lamda6.setForeground(new java.awt.Color(255, 255, 255));
        lamda6.setText("C");
        lamda6.setAlignmentX(0.5F);

        textmu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textmuActionPerformed(evt);
            }
        });

        lamda7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lamda7.setForeground(new java.awt.Color(255, 255, 255));
        lamda7.setText("K");
        lamda7.setAlignmentX(0.5F);

        textm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textmActionPerformed(evt);
            }
        });

        buttonresult1.setBackground(new java.awt.Color(0, 0, 0));
        buttonresult1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonresult1.setForeground(new java.awt.Color(255, 255, 255));
        buttonresult1.setText("Get Results");
        buttonresult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonresult1ActionPerformed(evt);
            }
        });

        textk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textkActionPerformed(evt);
            }
        });

        ti1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ti1.setForeground(new java.awt.Color(255, 255, 255));
        ti1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ti1.setText("L");
        ti1.setAlignmentX(0.5F);

        textn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnActionPerformed(evt);
            }
        });

        nt1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nt1.setForeground(new java.awt.Color(255, 255, 255));
        nt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nt1.setText("Lq");
        nt1.setAlignmentX(0.5F);

        textt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttActionPerformed(evt);
            }
        });

        result_l.setBackground(new java.awt.Color(0, 0, 0));
        result_l.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result_l.setForeground(new java.awt.Color(255, 255, 255));
        result_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_lActionPerformed(evt);
            }
        });

        ti.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ti.setForeground(new java.awt.Color(255, 255, 255));
        ti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ti.setText("ti");
        ti.setAlignmentX(0.5F);

        result_lq.setBackground(new java.awt.Color(0, 0, 0));
        result_lq.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result_lq.setForeground(new java.awt.Color(255, 255, 255));

        nt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nt.setForeground(new java.awt.Color(255, 255, 255));
        nt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nt.setText("n(t)");
        nt.setAlignmentX(0.5F);

        result_w.setBackground(new java.awt.Color(0, 0, 0));
        result_w.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result_w.setForeground(new java.awt.Color(255, 255, 255));
        result_w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_wActionPerformed(evt);
            }
        });

        wqn.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        wqn.setForeground(new java.awt.Color(255, 255, 255));
        wqn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wqn.setText("wq(n)");
        wqn.setAlignmentX(0.5F);

        result_ti.setBackground(new java.awt.Color(0, 0, 0));
        result_ti.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result_ti.setForeground(new java.awt.Color(255, 255, 255));
        result_ti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_tiActionPerformed(evt);
            }
        });

        Models.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Models.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M/M/1", "M/M/1/K", "M/M/C", "M/M/C/K" }));
        Models.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelsActionPerformed(evt);
            }
        });

        Models1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Models1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Determenstic" }));
        Models1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Models1ActionPerformed(evt);
            }
        });

        l.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        l.setForeground(new java.awt.Color(255, 255, 255));
        l.setText("Lamda");
        l.setAlignmentX(0.5F);

        m.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        m.setForeground(new java.awt.Color(255, 255, 255));
        m.setText("Mu");
        m.setAlignmentX(0.5F);

        M.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        M.setForeground(new java.awt.Color(255, 255, 255));
        M.setText("M");
        M.setAlignmentX(0.5F);

        lamda3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lamda3.setForeground(new java.awt.Color(255, 255, 255));
        lamda3.setText("K");
        lamda3.setAlignmentX(0.5F);

        lamda4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lamda4.setForeground(new java.awt.Color(255, 255, 255));
        lamda4.setText("n");
        lamda4.setAlignmentX(0.5F);

        lamda5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lamda5.setForeground(new java.awt.Color(255, 255, 255));
        lamda5.setText("t");
        lamda5.setAlignmentX(0.5F);

        result_wq.setBackground(new java.awt.Color(0, 0, 0));
        result_wq.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result_wq.setForeground(new java.awt.Color(255, 255, 255));

        ti2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ti2.setForeground(new java.awt.Color(255, 255, 255));
        ti2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ti2.setText("W");
        ti2.setAlignmentX(0.5F);

        result_nt.setBackground(new java.awt.Color(0, 0, 0));
        result_nt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result_nt.setForeground(new java.awt.Color(255, 255, 255));

        nt4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nt4.setForeground(new java.awt.Color(255, 255, 255));
        nt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nt4.setText("Wq");
        nt4.setAlignmentX(0.5F);

        result_wqn.setBackground(new java.awt.Color(0, 0, 0));
        result_wqn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        result_wqn.setForeground(new java.awt.Color(255, 255, 255));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hr", "Min", "Sec", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Models1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Models, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textlamda, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(M)
                                        .addGap(60, 60, 60)
                                        .addComponent(lamda3)
                                        .addGap(69, 69, 69)
                                        .addComponent(lamda4)
                                        .addGap(66, 66, 66)
                                        .addComponent(lamda5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textmu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textm, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textk, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(buttonresult1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textlamda1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(M1)
                                        .addGap(60, 60, 60)
                                        .addComponent(lamda6)
                                        .addGap(69, 69, 69)
                                        .addComponent(lamda7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textmu1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textc1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textk1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(buttonresult11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(buttongraph, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(result_ti, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ti, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(result_nt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(nt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(result_wqn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wqn)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(result_l, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ti1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(result_lq, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(nt1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(result_w, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(ti2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(result_wq, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(nt4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lamda3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lamda4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lamda5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textlamda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textmu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Models1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(Models, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttongraph, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonresult11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nt)
                            .addComponent(ti)
                            .addComponent(wqn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(result_ti, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result_nt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(result_wqn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lamda6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lamda7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textlamda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textmu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonresult1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nt1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(result_lq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ti1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(result_l, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ti2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result_w, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(nt4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result_wq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textlamdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textlamdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textlamdaActionPerformed

    private void textmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textmuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textmuActionPerformed

    private void textmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textmActionPerformed

    private void textkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textkActionPerformed

    private void textnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnActionPerformed

    private void texttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttActionPerformed

    private void Models1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Models1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Models1ActionPerformed

    private void buttongraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttongraphActionPerformed
        try {
            double λ = 0.0, u = 0.0;
            int M = 0, K = 0, length = 0;
            DeterministicQ dq;
            if (!textlamda.getText().equals("")) {
                String s = textlamda.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(textlamda.getText());
                }
            }
            if (!textmu.getText().equals("")) {
                String s = textmu.getText();
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u = first / second;
                } else {
                    u = Double.parseDouble(textmu.getText());
                }
            }
            if (!textk.getText().equals("")) {
                K = Integer.parseInt(textk.getText());
            }
            if (!textm.getText().equals("")) {
                M = Integer.parseInt(textm.getText());
            }

            // If we has just λ and u
            if ((λ > 0) && (u > 0) && (K > 0) && (M == 0) && (u < λ)) {
                final XYStepChartDemo demo = new XYStepChartDemo(u, λ, K);
                demo.displayChart();
            } else if ((λ > 0) && (u > 0) && (K > 0) && (M > 0) && (u >= λ)) {
                final XYStepChartDemo demo = new XYStepChartDemo(u, λ, K, M);
                demo.displayChart();
            } else if (M == 0 && (λ > 0) && (u > 0) && (K > 0) && (λ <= u)) {
                JOptionPane.showMessageDialog(null, "M is required when ( λ <= u )");
            } else {
                JOptionPane.showMessageDialog(null, "You Should write a possitive λ & u & K ...!!!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_buttongraphActionPerformed

    private void buttonresult11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonresult11ActionPerformed
        try {
            double λd = 0, ud = 0;
            double wqn = -1, ti = -1, nt = -1;
            int n = 0, m = 0, kd = 0, T = 0;
            String errors = "";

            if (!textlamda .getText().equals("")) {
                String s = textlamda.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    if(second == 0) 
                        errors = "Can't divide over zero";
                    λd = first / second;
                } else {
                    λd = Double.parseDouble(textlamda.getText());
                }
            }
            if (!textmu.getText().equals("")) {
                String s = textmu.getText();
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    if(second == 0) 
                        errors = "Can't divide over zero";
                    ud = first / second;
                } else {
                    ud = Double.parseDouble(textmu.getText());
                }
            }
            if (!textt.getText().equals("")) {
                T = Integer.parseInt(textt.getText());
            }
            if (!textn.getText().equals("")) {
                n = Integer.parseInt(textn.getText());
            }
            if (!textk.getText().equals("")) {
                kd = Integer.parseInt(textk.getText());
            }
            if (!textm.getText().equals("")) {
                m = Integer.parseInt(textm.getText());
            }

            // Case 1
            if (m == 0 && (λd > 0) && (ud > 0) && (kd > 0) && λd > ud) {

                Dc1 = new DeterministicQ((double) ud, λd, kd);

                ti = Dc1.get_ti();
                ti = Math.round(ti*100.0)/100.0;
                if (T == 0) {
                    errors = "Please Enter positive Integer in (t) field";
                } else {
                    nt = Dc1.get_nt(T);
                    nt = Math.round(nt*100.0)/100.0;
                }
                
                if (n == 0) {
                    if (errors.equals("")) {
                        errors = "Please Enter positive Integer in (n) Field";
                    } else {
                        errors += " & n field";
                    }
                } else {
                    wqn = Dc1.get_Wqn((double) n);
                    wqn = Math.round(wqn*100.0)/100.0;
                }
   
                if (errors.equals("")) {
                    result_ti.setText(Double.toString(ti));
                    result_wqn.setText(Double.toString(wqn));
                    result_nt.setText(Double.toString(nt));
                } else {
                    JOptionPane.showMessageDialog(null, errors);
                }

                // Case Number 2
            } else if ((m > 0) && (λd > 0) && (ud > 0) && (kd > 0) && (ud >= λd)) {
                Dc2 = new DeterministicQ((double) ud, λd, kd, m);
                double nt2 = -1, wqn2 = -1, ti2 = -1;

                ti2 = Dc2.get_ti_2();
                ti2 = Math.round(ti2*100.0)/100.0;
                if (T == 0) {
                    errors = "Please Enter positive Integer in (t) field";
                } else {
                    nt2 = Dc2.get_nt_2(T);
                    nt2 = Math.round(nt2*100.0)/100.0;
                }
                
                if (n == 0) {
                    if (errors.equals("")) {
                        errors = "Please Enter positive Integer in (n) Field";
                    } else {
                        errors += " & n field";
                    }
                } else {
                    wqn2 = Dc2.get_Wqn_2((double) n);
                    wqn2 = Math.round(wqn2*100.0)/100.0;
                }
                
                if (errors.equals("")) {
                    result_ti.setText(Double.toString(ti2));
                    result_wqn.setText(Double.toString(wqn2));
                    result_nt.setText(Double.toString(nt2));
                } else {
                    JOptionPane.showMessageDialog(null, errors);
                }

            } else if ((m > 0) && (λd > 0) && (ud > 0) && (kd > 0)) {
                JOptionPane.showMessageDialog(null, "Can\'t have M with ( λ > u )");

            } else if (m == 0 && (λd > 0) && (ud > 0) && (kd > 0) && (λd <= ud)) {
                JOptionPane.showMessageDialog(null, "M is required when ( λ <= u )");
            } else {
                JOptionPane.showMessageDialog(null, "No Sufficient Positive Valid Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_buttonresult11ActionPerformed

    private void result_tiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_tiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_result_tiActionPerformed

    private void ModelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelsActionPerformed
        if(Models.getSelectedItem()=="M/M/1"){
            
        }         
        else if(Models.getSelectedItem()=="M/M/1/K"){
            
        }
        else if(Models.getSelectedItem()=="M/M/C"){
            
        }
        else if(Models.getSelectedItem()=="M/M/C/K"){
            
        }
    }//GEN-LAST:event_ModelsActionPerformed

    private void textlamda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textlamda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textlamda1ActionPerformed

    private void textmu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textmu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textmu1ActionPerformed

    private void textn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textn1ActionPerformed

    private void textc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textc1ActionPerformed

    private void textk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textk1ActionPerformed

    private void buttonresult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonresult1ActionPerformed
        //mm1
        if(Models.getSelectedItem()=="M/M/1"){
            try {
                result_l.setText(""); // L
                result_lq.setText(""); // Lq
                result_w.setText(""); // w
                result_wq.setText(""); // wq
            double λ = 0.0, u = 0.0;
            MM1 mm1;
            if (!textlamda1.getText().equals("")) {
                String s = textlamda1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    if(second == 0) 
                        JOptionPane.showMessageDialog(null, "Can't divide into zero");
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(textlamda1.getText());
                }
            }
            if (!textmu1.getText().equals("")) {
                String s = textmu1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    if(second == 0) 
                        JOptionPane.showMessageDialog(null, "Can't divide into zero");
                    u = first / second;
                } else {
                    u = Double.parseDouble(textmu1.getText());
                }
            }
            
            // If we has just λ and u
            if ((λ > 0) && (u > 0) ) {
//                System.out.println("in one");
                mm1 = new MM1(λ, u);
                
                // Check on Time
                if (jComboBox1.getSelectedItem()=="Hr") // Hour
                {
                    mm1.λ_HourToMin();
                } else if (jComboBox1.getSelectedItem()=="Sec") // Seconds
                {
                    mm1.λ_SecToMin();
                }

                if (jComboBox2.getSelectedItem()=="Hr") // Hour
                {
                    mm1.u_HourToMin();
                } else if (jComboBox2.getSelectedItem()=="Sec") // Seconds
                {
                    mm1.u_SecToMin();
                }

                mm1.has_λ_u();

                result_l.setText(mm1.getL()); // L
                result_lq.setText(mm1.getLq()); // Lq
                result_w.setText(mm1.getW()); // w
                result_wq.setText(mm1.getWq()); // wq

            }  else {
                JOptionPane.showMessageDialog(null, "No suffiecent Positive Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
        }
        //mm1k
        else if(Models.getSelectedItem()=="M/M/1/K"){
            try {
                result_l.setText(""); // L
                result_lq.setText(""); // Lq
                result_w.setText(""); // w
                result_wq.setText(""); // wq
            int k = 0, n = 0;
            double λ = 0.0, u = 0.0;
            if (!textlamda1.getText().equals("")) {
                String s = textlamda1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    if(second == 0) 
                        JOptionPane.showMessageDialog(null, "Can't divide into zero");
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(textlamda1.getText());
                }
            }
            if (!textmu1.getText().equals("")) {
                String s = textmu1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    if(second == 0) 
                        JOptionPane.showMessageDialog(null, "Can't divide into zero");
                    u = first / second;
                } else {
                    u = Double.parseDouble(textmu1.getText());
                }
            }

            if (!textk1.getText().equals("")) {
                k = Integer.parseInt(textk1.getText());
            }
            if (!textn1.getText().equals("")) {
                n = Integer.parseInt(textn1.getText());
            }

            if ((k > 0) && (λ > 0) && (u > 0)) {
                MM1K MK = new MM1K(k, λ, u);
                double L = MK.L();
                result_l.setText(Double.toString(getPercesoin(L)));
                double Lq = MK.Lq();
                result_lq.setText(Double.toString(getPercesoin(Lq)));
                double W = MK.W();
                result_w.setText(Double.toString(getPercesoin(W)));
                double Wq = MK.Wq();
                result_wq.setText(Double.toString(getPercesoin(Wq)));
                double PK = MK.PK();
                
                if (n >= 0) {
                    double Pn = MK.Pn(n);
                } else {
                    JOptionPane.showMessageDialog(null, "n should be a positive number");
                }
            } else {
                JOptionPane.showMessageDialog(null, "( λ & u & k ) Are required as a positive Numbers");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
        }
        //mmc
        else if(Models.getSelectedItem()=="M/M/C"){
            try {
                result_l.setText(""); // L
                result_lq.setText(""); // Lq
                result_w.setText(""); // w
                result_wq.setText(""); // wq
            double λ = 0.0, u = 0.0;
            int c = 0;
            MMC mmc;
            if (!textlamda1.getText().equals("")) {
                String s = textlamda1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    if(second == 0) 
                        JOptionPane.showMessageDialog(null, "Can't divide into zero");
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(textlamda1.getText());
                }
            }
            if (!textmu1.getText().equals("")) {
                String s = textmu1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    if(second == 0) 
                        JOptionPane.showMessageDialog(null, "Can't divide into zero");
                    u = first / second;
                } else {
                    u = Double.parseDouble(textmu1.getText());
                }
            }
            if (!textc1.getText().equals("")) {
                String s = textc1.getText();
                c = Integer.parseInt(textc1.getText());
            }
            // If we has just λ and u
            if ((λ > 0) && (u > 0) &&(c>0)) {
                mmc = new MMC(λ, u, c);
                result_l.setText(mmc.getL()); // L
                result_lq.setText(mmc.getLq()); // Lq
                result_w.setText(mmc.getW()); // w
                result_wq.setText(mmc.getWq()); // wq

            }  else {
                JOptionPane.showMessageDialog(null, "No suffiecent Positive Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
        }
        else if(Models.getSelectedItem()=="M/M/C/K"){
            try {
                result_l.setText(""); // L
                result_lq.setText(""); // Lq
                result_w.setText(""); // w
                result_wq.setText(""); // wq
            double λ = 0.0, u = 0.0;
            int c=0,k=0,n=0;
            MMCK mmck;
            if (!textlamda1.getText().equals("")) {
                String s = textlamda1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    if(second == 0) 
                        JOptionPane.showMessageDialog(null, "Can't divide into zero");
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(textlamda1.getText());
                }
            }
            if (!textmu1.getText().equals("")) {
                String s = textmu1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    if(second == 0) 
                        JOptionPane.showMessageDialog(null, "Can't divide into zero");
                    u = first / second;
                } else {
                    u = Double.parseDouble(textmu1.getText());
                }
            }
            if (!textc1.getText().equals("")) {
                String s = textc1.getText();
                c = Integer.parseInt(textc1.getText());
            }
            if (!textk1.getText().equals("")) {
                String s = textk1.getText();
                k = Integer.parseInt(textk1.getText());
            }
            if (!textn1.getText().equals("")) {
                String s = textn1.getText();
                n = Integer.parseInt(textn1.getText());
            }
            
            if ((λ > 0) && (u > 0) &&(c>0)&&(k>0)) {
                mmck = new MMCK(λ, u, c, k);
                
                result_l.setText(mmck.getL()); // L
                result_lq.setText(mmck.getLq()); // Lq
                result_w.setText(mmck.getW()); // w
                result_wq.setText(mmck.getWq()); // wq
                

            }  else {
                JOptionPane.showMessageDialog(null, "No suffiecent Positive Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
        }
        
    }//GEN-LAST:event_buttonresult1ActionPerformed

    private void result_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_lActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_result_lActionPerformed

    private void result_wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_wActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_result_wActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QueueProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueueProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueueProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueueProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueueProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel M;
    private javax.swing.JLabel M1;
    private javax.swing.JComboBox Models;
    private javax.swing.JComboBox Models1;
    private javax.swing.JButton buttongraph;
    private javax.swing.JButton buttonresult1;
    private javax.swing.JButton buttonresult11;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel l;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel lamda3;
    private javax.swing.JLabel lamda4;
    private javax.swing.JLabel lamda5;
    private javax.swing.JLabel lamda6;
    private javax.swing.JLabel lamda7;
    private javax.swing.JLabel m;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel nt;
    private javax.swing.JLabel nt1;
    private javax.swing.JLabel nt4;
    private javax.swing.JTextField result_l;
    private javax.swing.JTextField result_lq;
    private javax.swing.JTextField result_nt;
    private javax.swing.JTextField result_ti;
    private javax.swing.JTextField result_w;
    private javax.swing.JTextField result_wq;
    private javax.swing.JTextField result_wqn;
    private javax.swing.JTextField textc1;
    private javax.swing.JTextField textk;
    private javax.swing.JTextField textk1;
    private javax.swing.JTextField textlamda;
    private javax.swing.JTextField textlamda1;
    private javax.swing.JTextField textm;
    private javax.swing.JTextField textmu;
    private javax.swing.JTextField textmu1;
    private javax.swing.JTextField textn;
    private javax.swing.JTextField textn1;
    private javax.swing.JTextField textt;
    private javax.swing.JLabel ti;
    private javax.swing.JLabel ti1;
    private javax.swing.JLabel ti2;
    private javax.swing.JLabel wqn;
    // End of variables declaration//GEN-END:variables
}
