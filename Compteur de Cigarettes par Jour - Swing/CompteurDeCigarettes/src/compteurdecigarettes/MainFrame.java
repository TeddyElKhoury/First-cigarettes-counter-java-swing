/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package compteurdecigarettes;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author teddy
 */
public class MainFrame extends javax.swing.JFrame {
    
    private final File f = new File("cigarettes.dat");
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private final Date date = new Date();
    private final String currentD = (String) sdf.format(date); 

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        currentDateLBL.setText(sdf.format(date));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dateLBL = new javax.swing.JLabel();
        counterLBL = new javax.swing.JLabel();
        currentCounterLBL = new javax.swing.JLabel();
        currentDateLBL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        incrCounterBTN = new javax.swing.JButton();
        decrCounterBTN = new javax.swing.JButton();
        loadProgressBTN = new javax.swing.JButton();
        saveProgressBTN = new javax.swing.JButton();
        viewProgressBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        dateLBL.setForeground(new java.awt.Color(0, 0, 0));
        dateLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLBL.setText("Today's Date :");

        counterLBL.setForeground(new java.awt.Color(0, 0, 0));
        counterLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterLBL.setText("Cigarettes Counter :");

        currentCounterLBL.setForeground(new java.awt.Color(0, 0, 0));
        currentCounterLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentCounterLBL.setText("0");

        currentDateLBL.setForeground(new java.awt.Color(0, 0, 0));
        currentDateLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentDateLBL.setText("DD-MM-YYYY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(counterLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currentCounterLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentDateLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLBL)
                    .addComponent(currentDateLBL))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(counterLBL)
                    .addComponent(currentCounterLBL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        incrCounterBTN.setText("Increment Counter");
        incrCounterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incrCounterBTNActionPerformed(evt);
            }
        });

        decrCounterBTN.setText("Decrement Counter");
        decrCounterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrCounterBTNActionPerformed(evt);
            }
        });

        loadProgressBTN.setText("Load Progress");
        loadProgressBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadProgressBTNActionPerformed(evt);
            }
        });

        saveProgressBTN.setText("Save Progress");
        saveProgressBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProgressBTNActionPerformed(evt);
            }
        });

        viewProgressBTN.setText("View Progress");
        viewProgressBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProgressBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadProgressBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveProgressBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewProgressBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(incrCounterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decrCounterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loadProgressBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decrCounterBTN)
                    .addComponent(incrCounterBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveProgressBTN)
                .addGap(54, 54, 54)
                .addComponent(viewProgressBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void incrCounterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incrCounterBTNActionPerformed
        int ctr = Integer.parseInt(currentCounterLBL.getText());
        currentCounterLBL.setText(++ctr + "");
        if(ctr == 5) JOptionPane.showMessageDialog(this, "Oh ! il faut faire attention Quand meme !");
        if(ctr == 10) JOptionPane.showMessageDialog(this, "Attention, la cigarette tue !");
        if(ctr == 15) JOptionPane.showMessageDialog(this, "Attention, la cigarette cause du cancer !");
        if(ctr == 20) JOptionPane.showMessageDialog(this, "Cerais-ce une addiction ?");
        if(ctr == 25) JOptionPane.showMessageDialog(this, "Je vous prie de consulter un specialiste !");
    }//GEN-LAST:event_incrCounterBTNActionPerformed

    private void loadProgressBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadProgressBTNActionPerformed
        if(f.exists()){
            Map<String, Integer> cigarettesHM = new HashMap<String, Integer>();
            try{
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                cigarettesHM = (HashMap<String, Integer>) ois.readObject();
                if(cigarettesHM.containsKey(currentD)){
                    Integer i = cigarettesHM.get(currentD);
                    currentCounterLBL.setText(i + "");
                    currentDateLBL.setText(currentD);
                }else{
                    JOptionPane.showMessageDialog(this, "No_Data_For_This_Day_Exception");
                }
                ois.close(); fis.close();
            }catch(FileNotFoundException fnfe){
                JOptionPane.showMessageDialog(this, "File_Not_Found_Exception");
            }catch(ClassNotFoundException cnfe){
                JOptionPane.showMessageDialog(this, "Class_Not_Found_Exception");
            }catch(ClassCastException cce){
                JOptionPane.showMessageDialog(this, "Class_Cast_Exception");
            }catch(IOException ioe){
                JOptionPane.showMessageDialog(this, "IOException");
            }
        }else{
            JOptionPane.showMessageDialog(this, "File_Does_Not_Exists_Error");
            System.exit(1);
        }
    }//GEN-LAST:event_loadProgressBTNActionPerformed

    private void saveProgressBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProgressBTNActionPerformed
        if(f.exists()){
            Map<String, Integer> cigarettesHM = new HashMap<String, Integer>();
            try{
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                cigarettesHM = (HashMap<String, Integer>) ois.readObject();
                ois.close(); fis.close();
                Set<String> keys = cigarettesHM.keySet();
                if(keys.contains(currentD)){
                    cigarettesHM.replace(currentD, Integer.valueOf(currentCounterLBL.getText()));
                }else{
                    cigarettesHM.put(currentD, Integer.valueOf(currentCounterLBL.getText()));
                }
                f.delete();
                f.createNewFile();
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(cigarettesHM);
                oos.close(); fos.close();
            }catch(FileNotFoundException fnfe){
                JOptionPane.showMessageDialog(this, "File_Not_Found_Exception");
            }catch(ClassNotFoundException cnfe){
                JOptionPane.showMessageDialog(this, "Class_Not_Found_Exception");
            }catch(ClassCastException cce){
                JOptionPane.showMessageDialog(this, "Class_Cast_Exception");
            }catch(IOException ioe){
                JOptionPane.showMessageDialog(this, "IOException");
            }
        }else{
            JOptionPane.showMessageDialog(this, "File_Does_Not_Exists_Error");
            System.exit(1);
        }
    }//GEN-LAST:event_saveProgressBTNActionPerformed

    private void decrCounterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrCounterBTNActionPerformed
        int ctr = Integer.parseInt(currentCounterLBL.getText());
        if(ctr > 0) currentCounterLBL.setText(--ctr + "");
        else JOptionPane.showMessageDialog(this, "Pas mois que 0 par jour !");
    }//GEN-LAST:event_decrCounterBTNActionPerformed

    private void viewProgressBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProgressBTNActionPerformed
        ProgressTBL view = new ProgressTBL();
        view.setVisible(true);
    }//GEN-LAST:event_viewProgressBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel counterLBL;
    private javax.swing.JLabel currentCounterLBL;
    private javax.swing.JLabel currentDateLBL;
    private javax.swing.JLabel dateLBL;
    private javax.swing.JButton decrCounterBTN;
    private javax.swing.JButton incrCounterBTN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loadProgressBTN;
    private javax.swing.JButton saveProgressBTN;
    private javax.swing.JButton viewProgressBTN;
    // End of variables declaration//GEN-END:variables
}
