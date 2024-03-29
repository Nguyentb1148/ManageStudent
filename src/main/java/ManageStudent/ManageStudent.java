/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManageStudent;

import model.StudentList;

import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tranbaonguyen
 */
public class ManageStudent extends javax.swing.JFrame {
    private StudentList studentList = new StudentList();
    private DefaultTableModel tableModel = null;
    String stringImage=null;
    SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
    StudentList myStudentList=new StudentList();
    /**
     * Creates new form ManageStudent
     */
    public ManageStudent() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        inputFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        inputIdStudent = new javax.swing.JTextField();
        inputMale = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputBirthday = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAddress = new javax.swing.JTextArea();
        inputPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        inputImage = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Id Student");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(25, 155, 81, 21);

        buttonGroup1.add(inputFemale);
        inputFemale.setText("Female");
        getContentPane().add(inputFemale);
        inputFemale.setBounds(230, 320, 76, 23);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setText("Manage Student");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(207, 39, 253, 43);
        getContentPane().add(inputIdStudent);
        inputIdStudent.setBounds(135, 153, 203, 26);

        buttonGroup1.add(inputMale);
        inputMale.setSelected(true);
        inputMale.setText("Male");
        getContentPane().add(inputMale);
        inputMale.setBounds(140, 320, 61, 23);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Birthday");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(25, 199, 63, 21);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(25, 362, 59, 21);
        getContentPane().add(inputBirthday);
        inputBirthday.setBounds(135, 197, 203, 26);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(25, 243, 43, 21);

        inputEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEmailActionPerformed(evt);
            }
        });
        getContentPane().add(inputEmail);
        inputEmail.setBounds(135, 241, 203, 26);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Phonenumber");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(25, 283, 100, 21);

        inputAddress.setColumns(20);
        inputAddress.setRows(5);
        jScrollPane1.setViewportView(inputAddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(137, 362, 253, 84);
        getContentPane().add(inputPhoneNumber);
        inputPhoneNumber.setBounds(137, 281, 203, 26);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Sex");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(25, 322, 27, 21);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Full name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(25, 111, 73, 21);
        getContentPane().add(inputName);
        inputName.setBounds(135, 109, 203, 26);

        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Email", "Phone number", "Sex", "Birthday", "Address"
            }
        ));
        tbStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbStudentMouseClicked(evt);
            }
        });
        tbStudent.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbStudentPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(tbStudent);
        if (tbStudent.getColumnModel().getColumnCount() > 0) {
            tbStudent.getColumnModel().getColumn(3).setResizable(false);
            tbStudent.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(14, 452, 641, 165);

        btnAdd.setBackground(new java.awt.Color(51, 139, 0));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(425, 350, 80, 29);

        btnDelete.setBackground(new java.awt.Color(255, 54, 61));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(510, 390, 84, 30);

        btnUpdate.setBackground(new java.awt.Color(32, 178, 153));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(420, 390, 88, 29);

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });
        getContentPane().add(btnSort);
        btnSort.setBounds(610, 390, 60, 30);

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch);
        btnsearch.setBounds(600, 350, 85, 29);

        inputImage.setText("jLabel8");
        inputImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputImageMouseClicked(evt);
            }
        });
        getContentPane().add(inputImage);
        inputImage.setBounds(450, 120, 140, 140);

        btnSave.setBackground(new java.awt.Color(83, 174, 237));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(510, 350, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEmailActionPerformed

    private void tbStudentPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbStudentPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tbStudentPropertyChange

    private void inputImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputImageMouseClicked
        // TODO add your handling code here:
        JFileChooser jfc=new JFileChooser("/Users/tranbaonguyen/Desktop/ManagerStudent/src/main/java/Image/");
        jfc.showOpenDialog(null);
        File file =jfc.getSelectedFile();
        Image img;
        try {
            img = ImageIO.read(file);
            stringImage=file.getName();
            inputImage.setText("");
            int width=inputImage.getWidth();
            int height=inputImage.getHeight();
            inputImage.setIcon(new ImageIcon(img.getScaledInstance(width,height,0)));
        } catch (IOException e) {
            System.out.println("Error: "+e.toString());
        }
    }//GEN-LAST:event_inputImageMouseClicked

    public void reset(){
        inputName.setText("");
        inputIdStudent.setText("");
        inputBirthday.setText("");
        inputEmail.setText("");
        inputPhoneNumber.setText("");
        inputMale.isSelected();
        inputAddress.setText("");
        inputImage.setText("Image");
        inputImage.setIcon(null);
        stringImage=null;
       
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnAddActionPerformed

    public Student getModel(){
        Student sv=new Student();
        sv.setName(inputName.getText());
        sv.setIdPerson(inputIdStudent.getText());
        try {
            sv.setBirthday(dateFormat.parse(inputBirthday.getText()));
        } catch (ParseException e) {
            System.out.println("Error: "+e.toString());
        }
        sv.setEmail(inputEmail.getText());
        sv.setPhoneNumber(inputPhoneNumber.getText());
        boolean sex=false;// mac dinh la nam
        if (inputMale.isSelected()){
            sex=true;//nu
        }
        sv.setSex(sex);
        sv.setAddress(inputAddress.getText());
        if (stringImage==null){
            sv.setImage("No avatar");

        }else {
            sv.setImage(stringImage);
        }
        return sv;
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         if (validateForm()){
            Student sv=getModel();
            if (myStudentList.add(sv)>0){
                JOptionPane.showMessageDialog(this,"Save success");
                fillDataTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"form shouldn't empty");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    public void fillDataTable(){
        DefaultTableModel model=(DefaultTableModel) tbStudent.getModel();
        model.setRowCount(0);//clear table
        for (Student sv:myStudentList.getStudentList()) {
            Object[] rowData =new Object[7];
            rowData[0]=sv.getIdPerson();
            rowData[1]=sv.getName();
            rowData[2]=sv.getEmail();
            rowData[3]=sv.getPhoneNumber();
            rowData[4]=sv.getSex()?"Male":"Female";
            rowData[5]=dateFormat.format(sv.getBirthday());
            rowData[6]=sv.getAddress();
            model.addRow(rowData);
        }
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbStudentMouseClicked
        // TODO add your handling code here:
        int id=tbStudent.rowAtPoint(evt.getPoint());
        String idStudent=tbStudent.getValueAt(id,0).toString();
        Student sv=myStudentList.getStudentById(idStudent);
        setModel(sv);
    }//GEN-LAST:event_tbStudentMouseClicked

    public  void setModel(Student sv){
        inputName.setText(sv.getName());
        inputIdStudent.setText(sv.getIdPerson());
        inputBirthday.setText(dateFormat.format(sv.getBirthday()));
        inputEmail.setText(sv.getEmail());
        inputPhoneNumber.setText(sv.getPhoneNumber());
        if (sv.getSex()){
            inputMale.isSelected();
        }
        else{
            inputFemale.isSelected();
        }
       if (sv.getImage().equalsIgnoreCase("No avatar")){
           inputImage.setText("No avatar");
           inputImage.setIcon(null);
       }
       else {
           inputImage.setText("");
            ImageIcon imageIcon=new ImageIcon(getClass().getResource("/Image/"+sv.getImage()));
            Image image=imageIcon.getImage();
            image.getScaledInstance(inputImage.getWidth(),inputImage.getWidth(),0);
            inputImage.setIcon(imageIcon);
        }
    }
    public  boolean validateForm(){
        if(inputIdStudent.getText().isEmpty()||inputName.getText().isEmpty()|inputBirthday.getText().isEmpty()||inputEmail.getText().isEmpty()
        ||inputPhoneNumber.getText().isEmpty()||inputAddress.getText().isEmpty()){
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnsearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextArea inputAddress;
    private javax.swing.JTextField inputBirthday;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JRadioButton inputFemale;
    private javax.swing.JTextField inputIdStudent;
    private javax.swing.JLabel inputImage;
    private javax.swing.JRadioButton inputMale;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPhoneNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbStudent;
    // End of variables declaration//GEN-END:variables
}
