/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_final_eval;

import java.sql.*;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author abhijeet
 */
public class columns extends javax.swing.JFrame {

    /**
     * Creates new form columns
     */
    int cl=0;
    int i=0,j=0;
    int n=0;

  
    Object[][] data =null;
    String[] columnList =null;
    String[] columnSize =null;
    String[] columnType=null;
    String[] columns=null;
    String dt = "";
    DefaultTableModel model;
    
    public columns() {
        initComponents();
        model=(DefaultTableModel)jTable1.getModel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        columnLable = new javax.swing.JLabel();
        InsertOps = new javax.swing.JButton();
        columnData = new javax.swing.JTextField();
        tableNameLable = new javax.swing.JLabel();
        colSizeText = new javax.swing.JTextField();
        TypeComboSize = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        col1 = new javax.swing.JTextField();
        tb1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RowInsertion = new javax.swing.JButton();
        RowData = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DeleteOps = new javax.swing.JButton();
        UpdateOps = new javax.swing.JButton();
        clearOps = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        columnLable.setText("No of rows");

        InsertOps.setText("AddColumn Details");
        InsertOps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertOpsActionPerformed(evt);
            }
        });

        tableNameLable.setText("TableName");

        TypeComboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VARCHAR", "INT2", "INT4", "NUMERIC", "DATE", "TIME", "BOOL", "FLOAT4", "FLOAT8", "TIMESTAMP", "CHAR" }));

        jLabel1.setText("ColName");

        jLabel2.setText("Type");

        jLabel3.setText("Type");

        jLabel4.setText("Table Name");

        jLabel5.setText("No of Columns");

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Size");

        jLabel7.setText("Query");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}

            },
            new String [] {"Title 1", "Title 2", "Title 3", "Title 4"

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        RowInsertion.setText("Insert");
        RowInsertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RowInsertionActionPerformed(evt);
            }
        });

        jLabel8.setText("RowOperations");

        DeleteOps.setText("Delete");
        DeleteOps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOpsActionPerformed(evt);
            }
        });

        UpdateOps.setText("Update");
        UpdateOps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateOpsActionPerformed(evt);
            }
        });

        clearOps.setText("Clear");
        clearOps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearOpsActionPerformed(evt);
            }
        });

        jLabel9.setText("TableName and NoOfColumns");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RowData, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RowInsertion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DeleteOps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UpdateOps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(InsertOps)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tableNameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TypeComboSize, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(colSizeText)
                                            .addComponent(columnData)
                                            .addComponent(columnLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(17, 17, 17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(col1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(clearOps)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableNameLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(columnLable)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(columnData, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TypeComboSize, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colSizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InsertOps, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(col1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RowData, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DeleteOps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RowInsertion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateOps)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearOps)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertOpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertOpsActionPerformed
        // TODO add your handling code here:
      
     
        n = Integer.parseInt(col1.getText()); 
        
            columnList[i]= columnData.getText();
            columnSize[i]= colSizeText.getText();
            columnType[i]= TypeComboSize.getSelectedItem().toString();
            i++;
            cl++;
            
        if(cl==n)
        {
           // String query="create table abc(xyz varchar(40));";
            String query="CREATE TABLE "+ tb1.getText()+"(";
           for(int ii=0;ii<n-1;ii++)
            {   
                    query=query+ columnList[ii]+" "+ columnType[ii]+"("+columnSize[ii]+"),";
            }
           query=query+columnList[n-1] +" " +columnType[n-1]+"("+columnSize[n-1]+")";
            query=query+");";
            jLabel2.setText(query);
            JOptionPane.showMessageDialog(null, "Table created successfully");
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","289277");
            Statement stmt=con.createStatement(); 
            stmt.executeUpdate(query);
            columnData.hide();
            TypeComboSize.hide();
            colSizeText.hide();
            jLabel1.hide();
            jLabel3.hide();
            jLabel6.hide();
            InsertOps.hide();
            }
        
                     
            
         catch (Exception e) {
            e.printStackTrace();
           
        }
            
        }
            
            columnData.setText("");
            
            
    }//GEN-LAST:event_InsertOpsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int m = Integer.parseInt(col1.getText());
columnList=new String[m];
columnSize=new String[m];
columnType=new String[m];

jButton1.hide();
tb1.hide();
col1.hide();
jLabel4.hide();
jLabel5.hide();
tableNameLable.setText(tb1.getText());
columnLable.setText(col1.getText());
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RowInsertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RowInsertionActionPerformed
        // TODO add your handling code here:
        ResultSet rs ;
        StringTokenizer st=new StringTokenizer(RowData.getText(),",");
        String iquery="insert into "+tb1.getText()+" values(";
        for(int ii=0;ii<n-1;ii++)
            {
                iquery=iquery+"\'"+st.nextToken()+"\',";
            }
           iquery=iquery+"\'"+st.nextToken()+"\'";
            iquery=iquery+");";
          
            
            jLabel2.setText(iquery);
            
           
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","289277");
            Statement stmt=con.createStatement(); 
            stmt.executeUpdate(iquery);
              rs = stmt.executeQuery("select * from "+tb1.getText());
             jTable1.setModel(buildTableModel(rs));
            }
            
         catch (Exception e) {
            e.printStackTrace();
        }
          
     
    }//GEN-LAST:event_RowInsertionActionPerformed
 
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        int k = Integer.parseInt(col1.getText());
        TableModel model = jTable1.getModel();
        for(int j=0;j<k;j++)
        {
         dt = dt +(model.getValueAt(i, j).toString());
         if(j!=k-1)
         {
         dt = dt + ",";
         }
        }
        RowData.setText(dt);
    }//GEN-LAST:event_jTable1MouseClicked

    private void UpdateOpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateOpsActionPerformed
        // TODO add your handling code here:
        ResultSet rs;
        int ii;
        StringTokenizer st=new StringTokenizer(RowData.getText(),",");
        String iquery="update "+tb1.getText()+" set ";
        for( ii=0;ii<n-2;ii++)
            {   
                iquery= iquery+columnList[ii]+"=";
                iquery=iquery+"\'"+st.nextToken()+"\',";
            }
           iquery=iquery+columnList[n-2]+"= \'"+st.nextToken()+"\' where "+columnList[n-1]+"= \'"+st.nextToken()+"\'";
            iquery=iquery+";";
          
            
           jLabel2.setText(iquery);
            
           
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","289277");
            Statement stmt=con.createStatement(); 
            stmt.executeUpdate(iquery);
              rs = stmt.executeQuery("select * from "+tb1.getText());
             jTable1.setModel(buildTableModel(rs));
            }
            
         catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_UpdateOpsActionPerformed

    private void clearOpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearOpsActionPerformed
        // TODO add your handling code here:
        RowData.setText("");
        dt ="";
    }//GEN-LAST:event_clearOpsActionPerformed

    private void DeleteOpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOpsActionPerformed
        // TODO add your handling code here:
        ResultSet rs;
        int ii;
        StringTokenizer st=new StringTokenizer(RowData.getText(),",");
        String iquery="delete from "+tb1.getText()+" where ";
        for( ii=0;ii<n-1;ii++)
            {   
                iquery= iquery+columnList[ii]+"=";
                iquery=iquery+"\'"+st.nextToken()+"\' AND ";
            }
           iquery=iquery+columnList[n-1]+"= \'"+st.nextToken()+"\'";
            iquery=iquery+";";
          
            
           jLabel2.setText(iquery);
            
           
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","289277");
            Statement stmt=con.createStatement(); 
            stmt.executeUpdate(iquery);
              rs = stmt.executeQuery("select * from "+tb1.getText());
             jTable1.setModel(buildTableModel(rs));
            }
            
         catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DeleteOpsActionPerformed

    
    public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
    
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
            java.util.logging.Logger.getLogger(columns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(columns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(columns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(columns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new columns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteOps;
    private javax.swing.JButton InsertOps;
    private javax.swing.JTextField RowData;
    private javax.swing.JButton RowInsertion;
    private javax.swing.JComboBox<String> TypeComboSize;
    private javax.swing.JButton UpdateOps;
    private javax.swing.JButton clearOps;
    private javax.swing.JTextField col1;
    private javax.swing.JTextField colSizeText;
    private javax.swing.JTextField columnData;
    public static javax.swing.JLabel columnLable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JLabel tableNameLable;
    private javax.swing.JTextField tb1;
    // End of variables declaration//GEN-END:variables
}
