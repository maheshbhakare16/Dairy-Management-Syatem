
package milk.management;

import Database.*;
import javax.swing.*;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class PasswordChange extends javax.swing.JFrame 
{

    public dbmodel model = new dbmodel();

    PasswordChange(String id) 
    {
        initComponents();
        setid(id);
        setResizable(false);
    }

    PasswordChange() 
    {
        initComponents();
    }

// ---------------------------- THIS METHOD IS CALLED FROM CUNSTRUCTOR TO INITILIZE WINDOW OF SWING ---------------------
 
    @SuppressWarnings("unchecked")
    
    private void initComponents() 
    {

    
    
// -------------------------------------  SWING GUI CLASS OBJECTS ARE INITILIZED ------------------------------
    
    
        back_panel = new JPanel();
        form_panel = new JPanel();
        login_name = new JLabel();
        new_passswoed_label = new JLabel();
        Current_Password_Label = new JLabel();
        current_password = new JPasswordField();
        submit = new JButton();
        reset = new JButton();
        seperator = new JSeparator();
        confirm_new_password_label = new JLabel();
        confirm_new_password = new JPasswordField();
        id = new JLabel();
        id_label = new JLabel();
        new_password = new JPasswordField();
        image_label = new JLabel();


// ----------------------------------------- SWING GUI WINDOW DECORATION ------------------------------------

        
        setTitle("Dairy Management System - CHANGE PASSWORD");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        back_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back_panel.setLayout(null);

        form_panel.setBackground(new java.awt.Color(204, 204, 204));
        form_panel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        form_panel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        login_name.setFont(new java.awt.Font("aakar", 1, 55)); // NOI18N
        login_name.setForeground(new java.awt.Color(255, 255, 255));
        login_name.setText("Change Password");

        new_passswoed_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        new_passswoed_label.setText("New Password");

        Current_Password_Label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Current_Password_Label.setText("Current Password");

        current_password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        

        submit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submit.setText("Submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        

        reset.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        confirm_new_password_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        confirm_new_password_label.setText("Confirm New Password");

        confirm_new_password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        

        id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        id_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id_label.setText("ID :");

        new_password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
       

        javax.swing.GroupLayout form_panelLayout = new javax.swing.GroupLayout(form_panel);
        form_panel.setLayout(form_panelLayout);
        form_panelLayout.setHorizontalGroup(
            form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_panelLayout.createSequentialGroup()
                .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(form_panelLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(login_name, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, form_panelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(form_panelLayout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, form_panelLayout.createSequentialGroup()
                                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(current_password, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(confirm_new_password, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Current_Password_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(new_passswoed_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirm_new_password_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(new_password, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(form_panelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        form_panelLayout.setVerticalGroup(
            form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_name, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Current_Password_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(current_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(new_passswoed_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(confirm_new_password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirm_new_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        back_panel.add(form_panel);
        form_panel.setBounds(91, 30, 510, 600);

        image_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background1.jpg"))); // NOI18N
        image_label.setText("jLabel2");
        back_panel.add(image_label);
        image_label.setBounds(0, 0, 720, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );

        pack();
    }

    
// ------------------------------ RESET FUNCTION TO RESET FORM DATA -------------------------------
    
    
    public void reset_form_data()
    {
        current_password.setText("");
        new_password.setText("");
        confirm_new_password.setText("");
    }

    
    
// ------------------------------------------ RESET BUTTON EVENT -----------------------------------------
    
    private void resetMouseClicked(java.awt.event.MouseEvent evt) 
    {
        reset_form_data();
    
    }

    
// -------------------------------- SUBMIT BUTTON EVENT -------------------------------------------
    
    
    private void submitMouseClicked(java.awt.event.MouseEvent evt) 
    {
        try
        {
        if (current_password.getText().isEmpty() || new_password.getText().isEmpty() || confirm_new_password.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please Enter all Fields.... !");
        } 
        else 
        {
            if ((!current_password.getText().equals(new_password.getText())) && (new_password.getText().equals(confirm_new_password.getText()))) 
            {
                validate(id.getText(), new_password.getText());
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "1) Do not enter current password and new password same.\n2) Enter new password and confirm new password same.");
            }
        }
        }
        catch(HeadlessException | SQLException e)
        {
            
        }

    }
   
    

// ---------------------------------- VALIDATE METHOD TO CHECK USER ENTERD DATA IN THE FORM -----------------------------------

    
    public void validate(String id, String pass) throws SQLException 
    {
            try 
            {
                Connection connect;
                connect = database_connection.connector();
                PreparedStatement statement;
                ResultSet result;
                String query = "SELECT * from customer where customer_id = '"+id+"' and password = '"+current_password.getText()+"'";
                statement = connect.prepareStatement(query);
                result = statement.executeQuery();
                if(result.next())
                {
                query = "UPDATE customer SET password = '"+pass+"' where customer_id= '" + id + "'";
                statement = connect.prepareStatement(query);
                statement.executeUpdate();
                reset_form_data();
                JOptionPane.showMessageDialog(this, "Password Updated Successfully...!");
                dispose();
                Login login =new Login();
                login.show();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "You have Entered Wrong Old Password....\n");
                }
                
            } 
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
        
        }

// ----------------------------- METHOD TO SET CUSTOMER ID TO LABEL ---------------------------
        
    public void setid(String cust_id) 
    {
        id.setText(cust_id);
    }

    
// ------------------------- MAIN METHOD INVOKED TO LAUCH THE GUI WINDOW ----------------------------------
    
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new Login().setVisible(true);
            }
        });
    }

    
// ------------------------------------ SWING GUI CLASSES OBJECT CREATED ------------------------------------
    
    
    private JLabel Current_Password_Label;
    private JPanel back_panel;
    private JPasswordField confirm_new_password;
    private JLabel confirm_new_password_label;
    private JPasswordField current_password;
    private JPanel form_panel;
    private JLabel id;
    private JLabel id_label;
    private JLabel image_label;
    private JLabel login_name;
    private JLabel new_passswoed_label;
    private JPasswordField new_password;
    private JButton reset;
    private JSeparator seperator;
    private JButton submit;

}
