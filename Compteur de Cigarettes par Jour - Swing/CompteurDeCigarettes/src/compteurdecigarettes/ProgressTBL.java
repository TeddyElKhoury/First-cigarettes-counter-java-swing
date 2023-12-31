/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package compteurdecigarettes;

import java.util.*;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author teddy
 */
public class ProgressTBL extends javax.swing.JFrame{
    
    private final File f = new File("cigarettes.dat");
    private String[][] tableData;
    private String[] tableCols;
    
    /**
     * Creates new form InfosDuCompteur
     */
    public ProgressTBL() {
        this.tableCols = new String[]{
            "Date", "Compteur"
        };
        
        if(f.exists()){
            try{
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Map<String, Integer> cigarettes = new HashMap<String, Integer>();
                cigarettes = (HashMap<String, Integer>) ois.readObject();
                ois.close(); fis.close();
                
                Set<String> keys = cigarettes.keySet();
                String[] keysTbl = new String[keys.size()];
                keys.toArray(keysTbl);
                
                this.tableData = new String[keysTbl.length][2];
                for(int i = 0; i < keysTbl.length; i++){
                    this.tableData[i][0] = keysTbl[i];
                    this.tableData[i][1] = cigarettes.get(keysTbl[i]) + "";
                }
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
        
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(this.tableData, this.tableCols);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
