
package sorting.algorithms;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GUI extends javax.swing.JFrame {

    SortingAlgorithms S1;
    //Ciziktir c1;
    //private Graphics g;
    public int[] arr1;
        //public int arr2 [];
	public int arrInsert [];
	public int arrSelect [];
	public int arrbubble [];
	public int arrshell [];
	public int arrquict [];
	public int arrcount [];
    
    public GUI() {
        initComponents();
        S1= new SortingAlgorithms();
       // c1=new Ciziktir();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Dizi boyutunu girin.");

        jButton1.setText("İŞLEM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Insertion Sort", "Bubble Sort", "Selection Sort", "Shell Sort", "Quick Sort", "Count Sort" }));
        jComboBox1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jComboBox1ComponentAdded(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Sıralanmış Dizi:");

        jLabel2.setText("Sıralanmamış Dizi:");

        jButton2.setText("Çizdir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel3.setText("Adam Sayıları:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addGap(29, 29, 29)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(141, 141, 141)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jComboBox1ComponentAdded
        
    }//GEN-LAST:event_jComboBox1ComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        S1.Sifirla(); // adım sayısı sıfırlama
        //int[] arr1=new int[Integer.parseInt(jTextField1.getText())];
        int elemansayısı=Integer.parseInt(jTextField1.getText());
        arr1=new int[Integer.parseInt(jTextField1.getText())];
        int[] arr2=new int[Integer.parseInt(jTextField1.getText())];
        arr1=S1.random(elemansayısı);
        arrInsert = new int [arr1.length];
	for(int i=0;i<arr1.length;i++) {
	arrInsert[i] = arr1[i];
	}
			    	
	arrSelect = new int [arr1.length];
	for(int i=0;i<arr1.length;i++) {
	arrSelect[i] = arr1[i];
	}
			    
	arrbubble = new int [arr1.length];
	for(int i=0;i<arr1.length;i++) {
	arrbubble[i] = arr1[i];
	}
			    
	arrshell = new int [arr1.length];
	for(int i=0;i<arr1.length;i++) {
	arrshell[i] = arr1[i];
	}
			    
	arrquict = new int [arr1.length];
	for(int i=0;i<arr1.length;i++) {
	arrquict[i] = arr1[i];
	}
	arrcount = new int [arr1.length];
	for(int i=0;i<arr1.length;i++) {
	arrcount[i] = arr1[i];
	}
 //random dizi oluşturma
        
        String s ="";
        String y="";
        for (int i = 0; i < elemansayısı; i++) {
            s+=Integer.toString(arr1[i]);
            s+=" ";
            
        }
        jTextArea2.setText(s + " ");
       /* arr2=S1.bubbleSort(arr1);
        for (int i = 0; i < elemansayısı; i++) {
            y+=Integer.toString(arr2[i]);
            y+=" ";
            
        }*/
        //jTextArea1.setText(y+" ");
        if (jComboBox1.getSelectedItem()=="Bubble Sort") {
            arr2=S1.bubbleSort(arrbubble);
            for (int i = 0; i < elemansayısı; i++) {
            y+=Integer.toString(arr2[i]);
            y+=" ";
            
            }
            S1.Insertionsort(arrInsert);
            //S1.bubbleSort(arrbubble);
            S1.countSort(arrcount, arrcount.length);
            S1.quickSort(arrquict, 0, arrquict.length-1);
            S1.selectionSort(arrSelect);
            S1.shellSort(arrshell);            
        }
        else if (jComboBox1.getSelectedItem()=="Insertion Sort") {
        arr2=S1.Insertionsort(arrInsert);
        for (int i = 0; i < elemansayısı; i++) {
            y+=Integer.toString(arr2[i]);
            y+=" ";
            
        }
            //S1.Insertionsort(arrInsert);
            S1.bubbleSort(arrbubble);
            S1.countSort(arrcount, arrcount.length);
            S1.quickSort(arrquict, 0, arrquict.length-1);
            S1.selectionSort(arrSelect);
            S1.shellSort(arrshell);          
        }
        else if (jComboBox1.getSelectedItem()=="Selection Sort") {
        arr2=S1.selectionSort(arrSelect);
        for (int i = 0; i < elemansayısı; i++) {
            y+=Integer.toString(arr2[i]);
            y+=" ";
            
        }
            S1.Insertionsort(arrInsert);
            S1.bubbleSort(arrbubble);
            S1.countSort(arrcount, arrcount.length);
            S1.quickSort(arrquict, 0, arrquict.length-1);
            //S1.selectionSort(arrSelect);
            S1.shellSort(arrshell);          
        }
        else if (jComboBox1.getSelectedItem()=="Shell Sort") {
        arr2=S1.shellSort(arrshell);
        for (int i = 0; i < elemansayısı; i++) {
            y+=Integer.toString(arr2[i]);
            y+=" ";
            
        }
            S1.Insertionsort(arrInsert);
            S1.bubbleSort(arrbubble);
            S1.countSort(arrcount, arrcount.length);
            S1.quickSort(arrquict, 0, arrquict.length-1);
            S1.selectionSort(arrSelect);
            //S1.shellSort(arrshell);          
        }
        else if (jComboBox1.getSelectedItem()=="Quick Sort") {
        arr2=S1.quickSort(arrquict,0, arrquict.length-1);
        for (int i = 0; i < elemansayısı; i++) {
            y+=Integer.toString(arr2[i]);
            y+=" ";
            
        }
            S1.Insertionsort(arrInsert);
            S1.bubbleSort(arrbubble);
            S1.countSort(arrcount, arrcount.length);
            //S1.quickSort(arrquict, 0, arrquict.length-1);
            S1.selectionSort(arrSelect);
            S1.shellSort(arrshell);         
        }
        else if (jComboBox1.getSelectedItem()=="Count Sort") {
        arr2=S1.countSort(arrcount, arrcount.length);
        for (int i = 0; i < elemansayısı; i++) {
            y+=Integer.toString(arr2[i]);
            y+=" ";
            
        }
            S1.Insertionsort(arrInsert);
            S1.bubbleSort(arrbubble);
            //S1.countSort(arrcount, arrcount.length);
            S1.quickSort(arrquict, 0, arrquict.length-1);
            S1.selectionSort(arrSelect);
            S1.shellSort(arrshell);          
        }
        jTextArea1.setText(y+" ");

        
        jTextArea3.setText( "Bubble Sort:"+S1.StepBS+"\nİnsertion Sort"+S1.StepIS+"\nSelection Sort"+ S1.StepSS +"\nShell Sort"+S1.StepSheS+
                "\nQuick Sort"+S1.StepQS+"\nCount Sort"+S1.StepCS);
    }//GEN-LAST:event_jButton1ActionPerformed

       /* @Override
        public void paint(Graphics g){
           g.fillRect(600, 600, 50, S1.StepBS);
        } */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //g.fillRect(200, 200, 20, 40);
        //c1.paint(S1.g);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
