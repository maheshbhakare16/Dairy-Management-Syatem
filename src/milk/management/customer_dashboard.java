
package milk.management;

import Database.database_connection;
import javax.swing.*;
import com.toedter.calendar.*;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class customer_dashboard extends javax.swing.JFrame 
{

    
    public customer_dashboard(String Username, String id) 
    {
        initComponents();
        String v_id =id;
        userset(Username, id);
        setResizable(false);
        table_show_customer_data.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 18));
    }
    public customer_dashboard() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")

// ---------------------------- THIS METHOD IS INVOKED FROM CONSTRUCT TO INITILIZE ALL THE ALL WINDOW ELEMENTS ----------------
    
    
    private void initComponents() 
    {

    
// ------------------------------------- SWING GUI CLASSES OBJECT INITILIZED -----------------------------------------
    
    
        back_panel = new JPanel();
        top_bar = new JPanel();
        user_icon = new JPanel();
        user_icon_label = new JLabel();
        id = new JLabel();
        username = new JLabel();
        Log_out = new JButton();
        changepassword = new JButton();
        form_bar = new JPanel();
        show_customer_data_panel = new JPanel();
        table_backpanel = new JPanel();
        sl3 = new JLabel();
        sl2 = new JLabel();
        start_date = new JDateChooser();
        show_milk_data_btn = new JButton();
        jScrollPane1 = new JScrollPane();
        table_show_customer_data = new JTable();
        end_date = new JDateChooser();

        
// ------------------------------- SWING GUI WINDOW COMPONANTS DESIGN -------------------------------
        setTitle("Dairy Management System - CUSTOMER DASHBOARD");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_panel.setLayout(new java.awt.BorderLayout());

        top_bar.setBackground(new java.awt.Color(54, 33, 89));

        user_icon.setBackground(new java.awt.Color(54, 33, 89));

        user_icon_label.setBackground(new java.awt.Color(54, 33, 89));
        user_icon_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_icon_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user1.png"))); // NOI18N

        id.setBackground(new java.awt.Color(54, 33, 89));
        id.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        

        username.setBackground(new java.awt.Color(54, 33, 89));
        username.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        

        javax.swing.GroupLayout user_iconLayout = new javax.swing.GroupLayout(user_icon);
        user_icon.setLayout(user_iconLayout);
        user_iconLayout.setHorizontalGroup(
            user_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_iconLayout.createSequentialGroup()
                .addComponent(user_icon_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(user_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_iconLayout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        user_iconLayout.setVerticalGroup(
            user_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user_icon_label, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
            .addGroup(user_iconLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Log_out.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        Log_out.setText("Log Out");
        Log_out.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Log_out.setFocusPainted(false);
        Log_out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Log_outMouseClicked(evt);
            }
        });
        

        changepassword.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        changepassword.setText("Change Password");
        changepassword.setFocusPainted(false);
        changepassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepasswordMouseClicked(evt);
            }
        });
        

        javax.swing.GroupLayout top_barLayout = new javax.swing.GroupLayout(top_bar);
        top_bar.setLayout(top_barLayout);
        top_barLayout.setHorizontalGroup(
            top_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_barLayout.createSequentialGroup()
                .addComponent(user_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 839, Short.MAX_VALUE)
                .addComponent(changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        top_barLayout.setVerticalGroup(
            top_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(top_barLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(top_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changepassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Log_out, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        back_panel.add(top_bar, java.awt.BorderLayout.PAGE_START);

        form_bar.setLayout(new java.awt.CardLayout());

        table_backpanel.setBackground(new java.awt.Color(102, 102, 102));
        table_backpanel.setPreferredSize(new java.awt.Dimension(1121, 682));

        sl3.setBackground(new java.awt.Color(102, 102, 102));
        sl3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sl3.setForeground(new java.awt.Color(255, 255, 255));
        sl3.setText("End Date");

        sl2.setBackground(new java.awt.Color(102, 102, 102));
        sl2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sl2.setForeground(new java.awt.Color(255, 255, 255));
        sl2.setText("Start Date");

        start_date.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        show_milk_data_btn.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        show_milk_data_btn.setText("Show Milk Data");
        show_milk_data_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_milk_data_btn.setFocusPainted(false);
        show_milk_data_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_milk_data_btnActionPerformed(evt);
            }
        });

        table_show_customer_data.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        table_show_customer_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Shift", "Milk Quanity", "Fat", "Degree", "Total Ammount"
            }
        ));
        table_show_customer_data.setRowHeight(30);
        jScrollPane1.setViewportView(table_show_customer_data);

        javax.swing.GroupLayout table_backpanelLayout = new javax.swing.GroupLayout(table_backpanel);
        table_backpanel.setLayout(table_backpanelLayout);
        table_backpanelLayout.setHorizontalGroup(
            table_backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_backpanelLayout.createSequentialGroup()
                .addGroup(table_backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(table_backpanelLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addGroup(table_backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sl2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(table_backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sl3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(show_milk_data_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(table_backpanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        table_backpanelLayout.setVerticalGroup(
            table_backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(table_backpanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(table_backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(table_backpanelLayout.createSequentialGroup()
                        .addGroup(table_backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sl2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sl3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(table_backpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(start_date, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(end_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(show_milk_data_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout show_customer_data_panelLayout = new javax.swing.GroupLayout(show_customer_data_panel);
        show_customer_data_panel.setLayout(show_customer_data_panelLayout);
        show_customer_data_panelLayout.setHorizontalGroup(
            show_customer_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_customer_data_panelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(table_backpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        show_customer_data_panelLayout.setVerticalGroup(
            show_customer_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_customer_data_panelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(table_backpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        form_bar.add(show_customer_data_panel, "card4");

        back_panel.add(form_bar, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    
// ----------------------------- SET USER ID AND USER NAME ON THE WINDOW ----------------------------------
    
    public void userset(String uname, String Id) {
        username.setText(uname);
        id.setText(Id);
    }
    

    
//  -------------------------------- SHOW  MILK DATA BUTTON EVENT ---------------------------------------
    
    
    
    private void show_milk_data_btnActionPerformed(java.awt.event.ActionEvent evt) 
    {
        if (start_date.getDate().toString().isEmpty() || end_date.getDate().toString().isEmpty() ) 
        {
            JOptionPane.showMessageDialog(this, "Please Enter All the Fields... !");
        } 
        else 
        {
            try 
            {
                PreparedStatement statement;
                ResultSet result;
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String query = "select * from milk where customer_id = '" +id.getText()+ "'and date >= '"+dateFormat.format(start_date.getDate())+"' and date <= '"+dateFormat.format(end_date.getDate())+"'";
                Connection connect;
                connect = database_connection.connector();
                statement = connect.prepareStatement(query);
                result = statement.executeQuery();
                DefaultTableModel tblmodel = (DefaultTableModel) table_show_customer_data.getModel();
                tblmodel.setRowCount(0);
                while (result.next()) 
                {
                    String row[] = {result.getString("date"),result.getString("shift"), result.getString("milk_quantity"), result.getString("fat"), result.getString("degree"), result.getString("Total_Ammount")};
                    tblmodel.addRow(row);
                }
            } 
            catch (SQLException e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }

    
    

//  ------------------------- LOGOUT BUTTON EVENT ---------------------------------
    
    
    private void Log_outMouseClicked(java.awt.event.MouseEvent evt) 
    {
        dispose();
        Login login = new Login();
        login.show();
        
    }

    
    
// ------------------------ CHANGE PASSWORD BUTTON EVENT -----------------------------------
    
    
    private void changepasswordMouseClicked(java.awt.event.MouseEvent evt) 
    {
        dispose();
        PasswordChange changepassword = new PasswordChange(id.getText());
        changepassword.show();
    }
    
     
     
// ---------------------- MAIN METHOD OF THE CLASS INVOKES AT START -----------------------------------
     
     
     
    public static void main(String args[]) 
    {
          
          
// ------------------------------ CREATES AND DISPLAY FORM -------------------------------
          
          
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new customer_dashboard().setVisible(true);
            }
        });
    }


    
// --------------------- SWING UI CLASSES OBJECT CREATED -----------------------------------------
    
    
    private JButton Log_out;
    private JPanel back_panel;
    private JButton changepassword;
    private JDateChooser end_date;
    private JPanel form_bar;
    private JLabel id;
    private JScrollPane jScrollPane1;
    private JPanel show_customer_data_panel;
    private JButton show_milk_data_btn;
    private JLabel sl2;
    private JLabel sl3;
    private JDateChooser start_date;
    private JPanel table_backpanel;
    private JTable table_show_customer_data;
    private JPanel top_bar;
    private JPanel user_icon;
    private JLabel user_icon_label;
    private JLabel username;
}
