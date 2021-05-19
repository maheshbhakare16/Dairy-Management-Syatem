
package milk.management;

import Database.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public dbmodel model = new dbmodel();

// ----------------------------- CONSTRUCTOR OF THE CLASS CALLED WHEN NEW OBJECT IS CREATED TO INITILIZE THE COMPONANTS  -----------------------------
    
    Login() {
        initComponents();
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    
// ------------------- METHOD TO LINITILIZE THE GUI COMPONANTS  ----------------------
    
    private void initComponents() 
    {

    
//  ------------------ SWING GUI AND AWT GUI INITILIZED ----------------------------------
    
    
        panel1 = new JPanel(); //back_panel
        panel2 = new JPanel(); //form_panel
        login_name = new JLabel();
        uname = new JTextField();
        password = new JLabel();
        username = new JLabel();
        pass = new JPasswordField();
        LogIn = new JButton();
        reset = new JButton();
        seperator = new JSeparator();
        user_type = new JComboBox<>();
        user_type_label = new JLabel();
        jLabel2 = new JLabel(); //background image label

        
        
        
        setTitle("Dairy Management System - LOGIN WINDOW");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.setLayout(null);

        panel2.setBackground(new java.awt.Color(204, 204, 204));
        panel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        login_name.setFont(new java.awt.Font("aakar", 1, 55)); // NOI18N
        login_name.setForeground(new java.awt.Color(255, 255, 255));
        login_name.setText("LogIn");

        uname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        

        password.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        password.setText("Password");

        username.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        username.setText("ID");

        pass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
       

        LogIn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LogIn.setText("LogIn");
        LogIn.setFocusPainted(false);
        LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInMouseClicked(evt);
            }
        });

        reset.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        reset.setText("Reset");
        reset.setFocusPainted(false);
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        user_type.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        user_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Vendor" }));
        

        user_type_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        user_type_label.setText("User Type");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(login_name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel2Layout.createSequentialGroup()
                                    .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(uname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                                .addComponent(pass, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(user_type, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(login_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(user_type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user_type, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panel1.add(panel2);
        panel2.setBounds(241, 80, 520, 550);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        panel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1030, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }
    
    

//  ------------------------------ LOGIN FORM RESET BUTTON CLICK EVENT -------------------------------
    
    private void resetMouseClicked(java.awt.event.MouseEvent evt) 
    {
        uname.setText("");
        pass.setText("");
    }
    
    
//  ------------------------------ LOGIN FORM LOGIN BUTTON CLICK EVENT ----------------------------------
    
    
    private void LogInMouseClicked(java.awt.event.MouseEvent evt) 
    {
        try {
            if (uname.getText().isEmpty() || pass.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter all Fields.... !");
            } else {
                validate(uname.getText(), pass.getText(), user_type.getSelectedItem().toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
// ------------------------------- LOGIN FORM CUSTOMER AND VENDOR DATA VALIDATION ---------------------------------------
    
    
    public void validate(String id, String pass, String user_type) throws SQLException 
    {
        if(user_type == "Vendor")
        {
        try {
            Statement statement;
            ResultSet result;
            String query = "select * from vendor where id = '" + id + "' and password = '" + pass + "'";
            Connection connect;
            connect = database_connection.connector();
            statement = connect.createStatement();
            result = statement.executeQuery(query);
            if (result.next()) 
            {
                String fname = result.getString("fname");
                String lname = result.getString("lname");
                dispose();
                vendor_dashboard vend = new vendor_dashboard(fname + " " + lname, id);
                vend.show();
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Login Failed....! Wrong ID ors Password...");
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("exception in login.java");
        }
        }
        else 
        if(user_type == "Customer")
        {
           try 
           {
            PreparedStatement statement;
            ResultSet result;
            String query = "select * from customer where customer_id = '" + id + "' and password = '" + pass + "'";
            Connection connect;
            connect = database_connection.connector();
            statement = connect.prepareStatement(query);
            result = statement.executeQuery();
            if (result.next()) 
            {
                String fname = result.getString("fname");
                String lname = result.getString("lname");
                dispose();
                customer_dashboard customer = new customer_dashboard(fname + " " + lname, id);
                customer.show();
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Login Failed....! Wrong ID And Password...");
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("exception in login.java");
        } 
    }

    }

//  ---------------------------------  MAIN FUNCTION  ----------------------------------------
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    
//  ----------------------------------- SWING UI AND AWT UI CLASS OBJECTS CREATED -----------------------    

    private JButton LogIn;
    private JLabel jLabel2; // background image label
    private JLabel login_name;
    private JPanel panel1; // back_panel
    private JPanel panel2; // form_panel
    private JPasswordField pass;
    private JLabel password;
    private JButton reset;
    private JSeparator seperator;
    private JTextField uname;
    private JComboBox<String> user_type;
    private JLabel user_type_label;
    private JLabel username;

}
