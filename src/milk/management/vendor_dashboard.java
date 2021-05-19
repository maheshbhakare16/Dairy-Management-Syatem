
package milk.management;

import Database.database_connection;
import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class vendor_dashboard extends javax.swing.JFrame {

    public vendor_dashboard(String Username, String id) {
        initComponents();
        String v_id =id;
        add_a_milk_btnMouseClicked();
        userset(Username, id);
        setResizable(false);
        table_delete_customer.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 18));
        table_show_customer_data.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 18));
    }
    
// -------------------------------------  DEFAULT CONSTRUCTOR  ------------------------------
    
    public vendor_dashboard() {
        initComponents();
    }

   
     // ---------- CALLED THIS METHOD TO INITILIZE ALL THE ELEMENTS OF GUI WINDOW -----------------------------

    @SuppressWarnings("unchecked") 
    
    private void initComponents() {

    
// ------------------------- SWING GUI & AWT GUI CLASSES OBJECT INITILIZED ------------------------------------
    
        back_panel = new JPanel();
        top_bar = new JPanel();
        user_icon = new JPanel();
        user_icon_label = new JLabel();
        tab_name = new JLabel();
        jSeparator2 = new JSeparator();
        sidebar = new JPanel();
        tab1 = new JPanel();
        add_a_customer_btn = new JButton();
        tab2 = new JPanel();
        add_a_milk_btn = new JButton();
        tab3 = new JPanel();
        show_customer_data_btn = new JButton();
        tab4 = new JPanel();
        delete_customer_btn = new JButton();
        username = new JLabel();
        jSeparator1 = new JSeparator();
        id = new JLabel();
        logout = new javax.swing.JButton();
        form_bar = new JPanel();
        add_a_milk_panel = new JPanel();
        add_a_milk_card = new JPanel();
        ml1 = new JLabel();
        id_add_a_milk = new JTextField();
        milk_quantity = new JTextField();
        ml2 = new JLabel();
        ml4 = new JLabel();
        shift = new JComboBox<>();
        ml5 = new JLabel();
        degree = new JTextField();
        ml6 = new JLabel();
        total_milk = new JTextField();
        ml7 = new JLabel();
        fat = new JTextField();
        add_entry = new JButton();
        reset_add_milk = new JButton();
        ml3 = new JLabel();
        current_date = new JDateChooser();
        show_customer_data_panel = new JPanel();
        jPanel2 = new JPanel();
        sl1 = new JLabel();
        show_milk_data_id = new JTextField();
        sl3 = new JLabel();
        sl2 = new JLabel();
        start_date = new JDateChooser();
        show_milk_data_btn = new JButton();
        jScrollPane1 = new JScrollPane();
        table_show_customer_data = new JTable();
        sl4 = new JLabel();
        sl5 = new JLabel();
        show_data_date = new JDateChooser();
        show_adat_shift = new JComboBox<>();
        show_data_delete_btn = new JButton();
        end_date = new JDateChooser();
        delete_customer_panel = new JPanel();
        jPanel1 = new JPanel();
        id_delete_label = new JLabel();
        delete_id = new JTextField();
        show_delete_data = new JButton();
        delete_customer_scrollbar = new JScrollPane();
        table_delete_customer = new JTable();
        delete_customer_after_btn = new JButton();
        delete_customer_after_cancel_btn = new JButton();
        add_a_customer_panel = new JPanel();
        add_a_customer_card = new JPanel();
        id_label = new JLabel();
        id_add_a_customer = new JTextField();
        lastname_label = new JLabel();
        last_name = new JTextField();
        firstname_label = new JLabel();
        first_name = new JTextField();
        email_label = new JLabel();
        email = new JTextField();
        mobile_no_label = new JLabel();
        mobile_no = new JTextField();
        address_label = new JLabel();
        address = new JTextField();
        milk_type_label = new JLabel();
        password_label = new JLabel();
        confirm_password_label = new JLabel();
        milk_type = new JComboBox<>();
        add_customer_save = new JButton();
        add_customer_reset = new JButton();
        password = new JPasswordField();
        confirm_password = new JPasswordField();

        
// --------------------------------- GUI DESIGN STYLING -------------------------------------        
        
        
        setTitle("Dairy Management System - Vendor Dashboard");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_panel.setLayout(new java.awt.BorderLayout());

        top_bar.setBackground(new java.awt.Color(54, 33, 89));

        user_icon.setBackground(new java.awt.Color(54, 33, 89));

        user_icon_label.setBackground(new java.awt.Color(54, 33, 89));
        user_icon_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_icon_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user1.png"))); // NOI18N

        javax.swing.GroupLayout user_iconLayout = new javax.swing.GroupLayout(user_icon);
        user_icon.setLayout(user_iconLayout);
        user_iconLayout.setHorizontalGroup(
            user_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user_icon_label, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );
        user_iconLayout.setVerticalGroup(
            user_iconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user_icon_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tab_name.setBackground(new java.awt.Color(54, 33, 89));
        tab_name.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        tab_name.setForeground(new java.awt.Color(255, 255, 255));
        tab_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout top_barLayout = new javax.swing.GroupLayout(top_bar);
        top_bar.setLayout(top_barLayout);
        top_barLayout.setHorizontalGroup(
            top_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_barLayout.createSequentialGroup()
                .addComponent(user_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(top_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(tab_name, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE))
                .addGap(156, 156, 156))
        );
        top_barLayout.setVerticalGroup(
            top_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user_icon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(top_barLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(tab_name, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        back_panel.add(top_bar, java.awt.BorderLayout.PAGE_START);

        sidebar.setBackground(new java.awt.Color(54, 33, 89));

        add_a_customer_btn.setBackground(new java.awt.Color(85, 65, 118));
        add_a_customer_btn.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        add_a_customer_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_a_customer_btn.setText("Add A customer");
        add_a_customer_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_a_customer_btn.setFocusPainted(false);
        add_a_customer_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_a_customer_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_a_customer_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_a_customer_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        tab2.setPreferredSize(new java.awt.Dimension(0, 46));

        add_a_milk_btn.setBackground(new java.awt.Color(85, 65, 118));
        add_a_milk_btn.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        add_a_milk_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_a_milk_btn.setText("Add a Milk");
        add_a_milk_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_a_milk_btn.setFocusPainted(false);
        add_a_milk_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_a_milk_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_a_milk_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_a_milk_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        tab3.setPreferredSize(new java.awt.Dimension(0, 46));

        show_customer_data_btn.setBackground(new java.awt.Color(85, 65, 118));
        show_customer_data_btn.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        show_customer_data_btn.setForeground(new java.awt.Color(255, 255, 255));
        show_customer_data_btn.setText("Show Customer Data");
        show_customer_data_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_customer_data_btn.setFocusPainted(false);
        show_customer_data_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_customer_data_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(show_customer_data_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(show_customer_data_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        tab4.setPreferredSize(new java.awt.Dimension(0, 46));

        delete_customer_btn.setBackground(new java.awt.Color(85, 65, 118));
        delete_customer_btn.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        delete_customer_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_customer_btn.setText("Delete Customer");
        delete_customer_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_customer_btn.setFocusPainted(false);
        delete_customer_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_customer_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab4Layout = new javax.swing.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete_customer_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete_customer_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        username.setBackground(new java.awt.Color(54, 33, 89));
        username.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        id.setBackground(new java.awt.Color(54, 33, 89));
        id.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        logout.setBackground(new java.awt.Color(85, 65, 118));
        logout.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("LogOut");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.setFocusPainted(false);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        
        
       javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tab2, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addComponent(tab3, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addComponent(tab4, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(tab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        back_panel.add(sidebar, java.awt.BorderLayout.LINE_START);

        form_bar.setLayout(new java.awt.CardLayout());

        add_a_milk_card.setBackground(new java.awt.Color(102, 102, 102));
        add_a_milk_card.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ml1.setBackground(new java.awt.Color(102, 102, 102));
        ml1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ml1.setForeground(new java.awt.Color(255, 255, 255));
        ml1.setText("Customer ID");

        id_add_a_milk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        milk_quantity.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        
        

        ml2.setBackground(new java.awt.Color(102, 102, 102));
        ml2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ml2.setForeground(new java.awt.Color(255, 255, 255));
        ml2.setText("Milk Quantity");

        ml4.setBackground(new java.awt.Color(102, 102, 102));
        ml4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ml4.setForeground(new java.awt.Color(255, 255, 255));
        ml4.setText("Shift");

        shift.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening" }));
        shift.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        ml5.setBackground(new java.awt.Color(102, 102, 102));
        ml5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ml5.setForeground(new java.awt.Color(255, 255, 255));
        ml5.setText("Degree");

        degree.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        ml6.setBackground(new java.awt.Color(102, 102, 102));
        ml6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ml6.setForeground(new java.awt.Color(255, 255, 255));
        ml6.setText("Fat");

        total_milk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        total_milk.setText("0.0");

        ml7.setBackground(new java.awt.Color(102, 102, 102));
        ml7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ml7.setForeground(new java.awt.Color(255, 255, 255));
        ml7.setText("Total Ammount");

        fat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        

        add_entry.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        add_entry.setText("Add Entry");
        add_entry.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_entry.setFocusPainted(false);
        add_entry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_entryMouseClicked(evt);
            }
        });
        fat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatActionPerformed(evt);
            }
        });
        

        reset_add_milk.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        reset_add_milk.setText("Reset");
        reset_add_milk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset_add_milk.setFocusPainted(false);
        reset_add_milk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset_add_milkMouseClicked(evt);
            }
        });

        ml3.setBackground(new java.awt.Color(102, 102, 102));
        ml3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ml3.setForeground(new java.awt.Color(255, 255, 255));
        ml3.setText("Date");

        javax.swing.GroupLayout add_a_milk_cardLayout = new javax.swing.GroupLayout(add_a_milk_card);
        add_a_milk_card.setLayout(add_a_milk_cardLayout);
        add_a_milk_cardLayout.setHorizontalGroup(
            add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                        .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ml5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ml6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fat, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                        .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ml1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(id_add_a_milk))
                        .addGap(43, 43, 43)
                        .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ml2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(milk_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ml3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(current_date, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)))
                .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total_milk, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(ml4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ml7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shift, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
            .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(add_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(reset_add_milk, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        add_a_milk_cardLayout.setVerticalGroup(
            add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(ml4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shift, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                    .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                                .addComponent(ml1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id_add_a_milk, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                                .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_a_milk_cardLayout.createSequentialGroup()
                                        .addComponent(ml2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_a_milk_cardLayout.createSequentialGroup()
                                        .addComponent(ml3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))
                                .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(milk_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                    .addComponent(current_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(41, 41, 41)
                .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                        .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ml6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ml5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(add_a_milk_cardLayout.createSequentialGroup()
                        .addComponent(ml7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total_milk, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110)
                .addGroup(add_a_milk_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_entry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset_add_milk, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout add_a_milk_panelLayout = new javax.swing.GroupLayout(add_a_milk_panel);
        add_a_milk_panel.setLayout(add_a_milk_panelLayout);
        add_a_milk_panelLayout.setHorizontalGroup(
            add_a_milk_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_a_milk_panelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(add_a_milk_card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        add_a_milk_panelLayout.setVerticalGroup(
            add_a_milk_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_a_milk_panelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(add_a_milk_card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        form_bar.add(add_a_milk_panel, "card3");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1121, 682));

        sl1.setBackground(new java.awt.Color(102, 102, 102));
        sl1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sl1.setForeground(new java.awt.Color(255, 255, 255));
        sl1.setText("ID");

        show_milk_data_id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        show_milk_data_id.setForeground(new java.awt.Color(0, 0, 0));

        sl3.setBackground(new java.awt.Color(102, 102, 102));
        sl3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sl3.setForeground(new java.awt.Color(255, 255, 255));
        sl3.setText("End Date");

        sl2.setBackground(new java.awt.Color(102, 102, 102));
        sl2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sl2.setForeground(new java.awt.Color(255, 255, 255));
        sl2.setText("Start Date");

        start_date.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        show_milk_data_btn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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

        sl4.setBackground(new java.awt.Color(102, 102, 102));
        sl4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sl4.setForeground(new java.awt.Color(255, 255, 255));
        sl4.setText("Date");

        sl5.setBackground(new java.awt.Color(102, 102, 102));
        sl5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sl5.setForeground(new java.awt.Color(255, 255, 255));
        sl5.setText("Shift");

        show_data_date.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        show_adat_shift.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        show_adat_shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening" }));
        show_adat_shift.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        show_data_delete_btn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        show_data_delete_btn.setText("Delete");
        show_data_delete_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_data_delete_btn.setFocusPainted(false);
        show_data_delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_data_delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sl1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_milk_data_id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sl2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sl3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(show_milk_data_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sl4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_data_date, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sl5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(show_adat_shift, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(show_data_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sl1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sl2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sl3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(show_milk_data_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(show_milk_data_id)
                    .addComponent(start_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(end_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sl4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sl5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(show_data_delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(show_data_date, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(show_adat_shift))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout show_customer_data_panelLayout = new javax.swing.GroupLayout(show_customer_data_panel);
        show_customer_data_panel.setLayout(show_customer_data_panelLayout);
        show_customer_data_panelLayout.setHorizontalGroup(
            show_customer_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_customer_data_panelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        show_customer_data_panelLayout.setVerticalGroup(
            show_customer_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(show_customer_data_panelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        form_bar.add(show_customer_data_panel, "card4");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        id_delete_label.setBackground(new java.awt.Color(102, 102, 102));
        id_delete_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id_delete_label.setForeground(new java.awt.Color(255, 255, 255));
        id_delete_label.setText("ID");

        delete_id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delete_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);


        show_delete_data.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        show_delete_data.setText("Show Customer Profile");
        show_delete_data.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        show_delete_data.setFocusPainted(false);
        show_delete_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_delete_dataMouseClicked(evt);
            }
        });
        

        delete_customer_scrollbar.setBackground(new java.awt.Color(102, 102, 102));

        table_delete_customer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        table_delete_customer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        table_delete_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Phone", "Join Date"
            }
        ));
        table_delete_customer.setToolTipText("");
        table_delete_customer.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_delete_customer.setRowHeight(30);
        table_delete_customer.setSelectionBackground(new java.awt.Color(102, 102, 102));
        table_delete_customer.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table_delete_customer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        table_delete_customer.getTableHeader().setReorderingAllowed(false);
        delete_customer_scrollbar.setViewportView(table_delete_customer);
        if (table_delete_customer.getColumnModel().getColumnCount() > 0) {
            table_delete_customer.getColumnModel().getColumn(0).setPreferredWidth(5);
            table_delete_customer.getColumnModel().getColumn(1).setPreferredWidth(15);
            table_delete_customer.getColumnModel().getColumn(2).setPreferredWidth(15);
            table_delete_customer.getColumnModel().getColumn(4).setPreferredWidth(15);
            table_delete_customer.getColumnModel().getColumn(5).setPreferredWidth(15);
        }

        delete_customer_after_btn.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        delete_customer_after_btn.setText("Delete Customer");
        delete_customer_after_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_customer_after_btn.setFocusPainted(false);
        delete_customer_after_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_customer_after_btnMouseClicked(evt);
            }
        });
        

        delete_customer_after_cancel_btn.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        delete_customer_after_cancel_btn.setText("Cancel");
        delete_customer_after_cancel_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete_customer_after_cancel_btn.setFocusPainted(false);
        delete_customer_after_cancel_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_customer_after_cancel_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(delete_customer_scrollbar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(delete_id, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(show_delete_data))
                            .addComponent(id_delete_label, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(delete_customer_after_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(delete_customer_after_cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(id_delete_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_id, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_delete_data, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(delete_customer_scrollbar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_customer_after_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_customer_after_cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(173, 173, 173))
        );

        javax.swing.GroupLayout delete_customer_panelLayout = new javax.swing.GroupLayout(delete_customer_panel);
        delete_customer_panel.setLayout(delete_customer_panelLayout);
        delete_customer_panelLayout.setHorizontalGroup(
            delete_customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_customer_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        delete_customer_panelLayout.setVerticalGroup(
            delete_customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete_customer_panelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        form_bar.add(delete_customer_panel, "card5");

        add_a_customer_panel.setBackground(new java.awt.Color(204, 204, 204));

        add_a_customer_card.setBackground(new java.awt.Color(102, 102, 102));
        add_a_customer_card.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        id_label.setBackground(new java.awt.Color(153, 153, 153));
        id_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id_label.setForeground(new java.awt.Color(255, 255, 255));
        id_label.setText("ID");

        id_add_a_customer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lastname_label.setBackground(new java.awt.Color(153, 153, 153));
        lastname_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lastname_label.setForeground(new java.awt.Color(255, 255, 255));
        lastname_label.setText("Last Name");

        last_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        firstname_label.setBackground(new java.awt.Color(153, 153, 153));
        firstname_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        firstname_label.setForeground(new java.awt.Color(255, 255, 255));
        firstname_label.setText("First Name");

        first_name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        email_label.setBackground(new java.awt.Color(153, 153, 153));
        email_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        email_label.setForeground(new java.awt.Color(255, 255, 255));
        email_label.setText("Email");

        email.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        mobile_no_label.setBackground(new java.awt.Color(153, 153, 153));
        mobile_no_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mobile_no_label.setForeground(new java.awt.Color(255, 255, 255));
        mobile_no_label.setText("Mobile No.");

        mobile_no.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        address_label.setBackground(new java.awt.Color(153, 153, 153));
        address_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        address_label.setForeground(new java.awt.Color(255, 255, 255));
        address_label.setText("Address");

        address.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        milk_type_label.setBackground(new java.awt.Color(153, 153, 153));
        milk_type_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        milk_type_label.setForeground(new java.awt.Color(255, 255, 255));
        milk_type_label.setText("Milk Type");

        password_label.setBackground(new java.awt.Color(153, 153, 153));
        password_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Password");

        confirm_password_label.setBackground(new java.awt.Color(153, 153, 153));
        confirm_password_label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        confirm_password_label.setForeground(new java.awt.Color(255, 255, 255));
        confirm_password_label.setText("Confirm Password");

        milk_type.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        milk_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cow", "Buffellow", "Goat" }));

        add_customer_save.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        add_customer_save.setText("Save");
        add_customer_save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_customer_save.setFocusPainted(false);
        add_customer_save.setMaximumSize(new java.awt.Dimension(101, 35));
        add_customer_save.setMinimumSize(new java.awt.Dimension(101, 35));
        add_customer_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_customer_saveMouseClicked(evt);
            }
        });

        add_customer_reset.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        add_customer_reset.setText("Reset");
        add_customer_reset.setPreferredSize(new java.awt.Dimension(63, 31));
        add_customer_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_customer_resetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout add_a_customer_cardLayout = new javax.swing.GroupLayout(add_a_customer_card);
        add_a_customer_card.setLayout(add_a_customer_cardLayout);
        add_a_customer_cardLayout.setHorizontalGroup(
            add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                        .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_add_a_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                                .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_a_customer_cardLayout.createSequentialGroup()
                                        .addComponent(lastname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104))
                                    .addComponent(last_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                                .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mobile_no_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobile_no, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(97, 97, 97))
                    .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(add_customer_save, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(add_customer_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                        .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(milk_type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(milk_type, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                                .addComponent(confirm_password)
                                .addGap(97, 97, 97))
                            .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                                .addComponent(confirm_password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        add_a_customer_cardLayout.setVerticalGroup(
            add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_a_customer_cardLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                        .addComponent(firstname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mobile_no_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mobile_no, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                        .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_add_a_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_a_customer_cardLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(66, 66, 66)
                .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                            .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53))
                        .addGroup(add_a_customer_cardLayout.createSequentialGroup()
                            .addComponent(milk_type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(milk_type, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(confirm_password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(add_a_customer_cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_customer_save, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_customer_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout add_a_customer_panelLayout = new javax.swing.GroupLayout(add_a_customer_panel);
        add_a_customer_panel.setLayout(add_a_customer_panelLayout);
        add_a_customer_panelLayout.setHorizontalGroup(
            add_a_customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_a_customer_panelLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(add_a_customer_card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        add_a_customer_panelLayout.setVerticalGroup(
            add_a_customer_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_a_customer_panelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(add_a_customer_card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        form_bar.add(add_a_customer_panel, "card2");

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
    
    
    
//  -------------------------- SET VENDOR USERNAME AND VENDOR ID TO SIDE BAR CODE ------------------------
   
   
   
    public void userset(String uname, String Id) {
        username.setText(uname);
        id.setText(Id);
        Date now = new Date();
        current_date.setDate(now);
    }
   
   //  ----------------------- ADD A MILK PANEL PRICE SET WITH THE HELP OF FAT  -----------------------------
    
    private void fatActionPerformed(java.awt.event.ActionEvent evt) 
    { 
        if(fat.getText().isEmpty() || degree.getText().isEmpty() || milk_quantity.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Enter All the Fields... !");
        }
        else
        {
            PreparedStatement statement;
            Connection connect;
            connect = database_connection.connector();
            {
            ResultSet result;
            String query = "SELECT * from PRICE_TABLE where fat = '"+Float.parseFloat(fat.getText())+"'";
            try
            {
                System.out.println(query);
                statement = connect.prepareStatement(query);
                result = statement.executeQuery();
                 if(result.next())
                 {
               Float rate = result.getFloat("rate");
               System.out.println(rate);
                Float milk_qty = Float.parseFloat(milk_quantity.getText());
              Float  total = rate * milk_qty;
              
               total_milk.setText(Float.toString(total));
                 }
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Please enter valid data!");
                
            }
            }
        }
    }
    
    
//  ----------------------  ADD MILK PANEL ADD ENTRY BUTTON EVENT CODE -----------------------------
    
    
    
    
    private void add_entryMouseClicked(java.awt.event.MouseEvent evt) 
    {
        if (id_add_a_milk.getText().isEmpty() || milk_quantity.getText().isEmpty() || degree.getText().isEmpty() || fat.getText().isEmpty() || total_milk.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter All the Fields... !");
        } 
        else 
        {
            PreparedStatement statement;
            Connection connect;
            connect = database_connection.connector();
            {
            String query = "CREATE TABLE milkmanagement.milk ("
                    + "sr_no INT NOT NULL AUTO_INCREMENT,"
                    + "customer_id VARCHAR(45) BINARY NOT NULL,"
                    + "vendor_id VARCHAR(45) NOT NULL,"
                    + "milk_quantity VARCHAR(45) NOT NULL,"
                    + "date DATE NOT NULL,"
                    + "shift VARCHAR(45) NOT NULL,"
                    + "degree VARCHAR(45) NOT NULL,"
                    + "fat VARCHAR(45) NOT NULL,"
                    + "Total_Ammount VARCHAR(45) NOT NULL,"
                    + "PRIMARY KEY (sr_no));";
            

            try 
            {
                statement = connect.prepareStatement(query);
                statement.executeUpdate();

            } 
            catch (SQLException e) 
            {
                if ("Table 'milk' already exists".equals(e.getMessage())) {

                } 
                else
                {
                    
                }
            }
        }

            try 
            {
                ResultSet result;
                String query = "select * from customer where customer_id = '" + id_add_a_milk.getText() + "' and vendor_id = '" + id.getText() + "'";
                statement = connect.prepareStatement(query);
                result = statement.executeQuery();
                if (result.next()) 
                {
                    try 
                    {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        query = "INSERT INTO milkmanagement.milk (customer_id, vendor_id, milk_quantity, date, shift, degree, fat, Total_Ammount) VALUES ('" + id_add_a_milk.getText() + "','" + id.getText() + "', '" + milk_quantity.getText() + "', '" + dateFormat.format(current_date.getDate()) + "', '" + shift.getSelectedItem() + "', '" + fat.getText() + "', '" + degree.getText() + "', '" + total_milk.getText() + "');";
                        statement = connect.prepareStatement(query);
                        statement.executeUpdate();
                        reset_milk_form();
                        JOptionPane.showMessageDialog(this, "Added Entry Successfully");

                    } 
                    catch (SQLException ex) 
                    {
                        JOptionPane.showMessageDialog(this, "Failed to Add Entry...!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Customer Not Found .... ! \nPlease enter data for proper Customer");
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(vendor_dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
// --------------------  ADD A MILK PANEL -> RESET BUTTON EVENT -> reset_milk_form FUNCTION CALL CODE -------------------------
    
    
    private void reset_milk_form() {
        id_add_a_milk.setText("");
        milk_quantity.setText("");
        degree.setText("");
        fat.setText("");
        total_milk.setText("");
    }
    
    
//  --------------------------- ADD A MILK PANEL RESET BUTTON EVENT ----------------------------
    
    
    private void reset_add_milkMouseClicked(java.awt.event.MouseEvent evt) 
    {
        reset_milk_form();
    }

     
    
    
// ------------------------  ADD A CUSTOMER TAB PANEL VISIBILITY CODE  ---------------------------
    
    
    private void add_a_customer_btnMouseClicked(java.awt.event.MouseEvent evt)
    {
        add_a_customer_panel.setVisible(true);
        add_a_milk_panel.setVisible(false);
        show_customer_data_panel.setVisible(false);
        delete_customer_panel.setVisible(false);
        tab_name.setText("Add A Customer");
    }

    
    
//  ---------------  ADD A MILK TAB PANEL VISIBILITY CODE  ---------------------------------
    
    
    private void add_a_milk_btnMouseClicked(java.awt.event.MouseEvent evt) 
    {
        add_a_customer_panel.setVisible(false);
        add_a_milk_panel.setVisible(true);
        show_customer_data_panel.setVisible(false);
        delete_customer_panel.setVisible(false);
        tab_name.setText("Add A milk");
    }
    
    

//   ---------------- ADD A MILK TAB PANEL VISIBILITY CODE ------------------------
    
    
    private void add_a_milk_btnMouseClicked() 
    {
        add_a_customer_panel.setVisible(false);
        add_a_milk_panel.setVisible(true);
        show_customer_data_panel.setVisible(false);
        delete_customer_panel.setVisible(false);
        tab_name.setText("Add A milk");
    }

    
//  -----------------------  SHOW CUSTOMER DATA TAB PANEL VISIBILITY CODE  --------------------------
    
    
    private void show_customer_data_btnMouseClicked(java.awt.event.MouseEvent evt) 
    {
        add_a_customer_panel.setVisible(false);
        add_a_milk_panel.setVisible(false);
        show_customer_data_panel.setVisible(true);
        delete_customer_panel.setVisible(false);
        tab_name.setText("Show Customer Data");
    }

    
//  ---------------------  DELETE CUSTOMER TAB PANEL VISIBILITY CODE  ----------------------------
    
    
    private void delete_customer_btnMouseClicked(java.awt.event.MouseEvent evt)
    {
        add_a_customer_panel.setVisible(false);
        add_a_milk_panel.setVisible(false);
        show_customer_data_panel.setVisible(false);
        delete_customer_panel.setVisible(true);
        tab_name.setText("Delete Customer");

    }

    

// ------------- ADD CUSTOMER TAB RESET BUTTON EVENT RESET CUSTOMER FORM FUNCTION CALL  -------------------    

    
    private void reset_customer_form()
    {
        id_add_a_customer.setText("");
        first_name.setText("");
        last_name.setText("");
        email.setText("");
        mobile_no.setText("");
        address.setText("");
        password.setText("");
        confirm_password.setText("");
    }
    
    
// --------------------- ADD A CUSTOMER TAB RESET BUTTON EVENT -----------------------
    
    private void add_customer_resetMouseClicked(java.awt.event.MouseEvent evt)
    {
        reset_customer_form();
    }

    
//  ---------------------- ADD A CUSTOMER TAB SAVE BUTTON EVENT ------------------------
    
    
    private void add_customer_saveMouseClicked(java.awt.event.MouseEvent evt) 
    {
        Connection connect;
        connect = database_connection.connector();
        if (id_add_a_customer.getText().isEmpty() || first_name.getText().isEmpty() || last_name.getText().isEmpty() || email.getText().isEmpty() || mobile_no.getText().isEmpty() || address.getText().isEmpty() || password.getText().isEmpty() || confirm_password.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please Enter All the Fields... !");
        } 
        else 
        {
            PreparedStatement statement;
            String query = "CREATE TABLE milkmanagement.customer ("
                    + "customer_id VARCHAR(45) BINARY NOT NULL,"
                    + "vendor_id VARCHAR(45) NOT NULL,"
                    + "fname VARCHAR(45) NOT NULL,"
                    + "lname VARCHAR(45) NOT NULL,"
                    + "email VARCHAR(45) NOT NULL,"
                    + "mobile_no VARCHAR(45) NOT NULL,"
                    + "address VARCHAR(45) NOT NULL,"
                    + "milk_type VARCHAR(45) NOT NULL,"
                    + "password VARCHAR(45) BINARY NOT NULL,"
                    + "join_date DATE NULL,"
                    + "PRIMARY KEY (customer_id));";
            
            try 
            {

                statement = connect.prepareStatement(query);
                statement.executeUpdate();
            } 
            catch (SQLException e) 
            {
            
            }
            if (password.getText().equals(confirm_password.getText())) 
            {
                try 
                {
                   
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDateTime now = LocalDateTime.now();
                    query = "INSERT INTO milkmanagement.customer (customer_id, vendor_id, fname, lname, email, mobile_no, address, milk_type, password, join_date) VALUES ('" + id_add_a_customer.getText() + "','"+id.getText()+"', '" + first_name.getText() + "', '" + last_name.getText() + "', '" + email.getText() + "', '" + mobile_no.getText() + "', '" + address.getText() + "', '" + milk_type.getSelectedItem() + "',  '" + password.getText() + "', '" + dtf.format(now) + "');";
                    statement = connect.prepareStatement(query);
                    statement.executeUpdate();
                    reset_customer_form();
                    JOptionPane.showMessageDialog(this, "Customer Added Successfully...");
                    
                } 
                catch (SQLException ex) 
                {
                    JOptionPane.showMessageDialog(this, "Customer is already allocated for this id, Please enter another id..");
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Password Does Not Match\n\tPlease Enter password and Confirm Password same");
            }
        }
    }

    
    
//  ---------------------- DELETE CUSTOMER TAB DELETE CUSTOMER BUTTON EVENT ----------------------
    
    
    private void delete_customer_after_btnMouseClicked(java.awt.event.MouseEvent evt)
    {
        Connection connect;
        connect = database_connection.connector();
        PreparedStatement statement;
        try
        {
            String query = "DELETE from milk where customer_id = '"+delete_id.getText()+"'and vendor_id = '"+id.getText()+"'";
            statement = connect.prepareStatement(query);
            statement.executeUpdate();
            query = "DELETE from customer where customer_id = '"+delete_id.getText()+"'and vendor_id = '"+id.getText()+"'";
            statement = connect.prepareStatement(query);
            statement.executeUpdate();
            DefaultTableModel tblmodel = (DefaultTableModel) table_delete_customer.getModel();
            tblmodel.setRowCount(0);
            delete_id.setText("");
            JOptionPane.showMessageDialog(this, "Customer Deteted Successfully..");
        }
        catch(SQLException e)
        {
            
        }
        
    }

    
// -------------------------  DELETE CUSTOMER TAB SHOW CUSTOMER PROFILE BUTTON EVENT  -----------------------    

    private void show_delete_dataMouseClicked(java.awt.event.MouseEvent evt)
    {
        if (delete_id.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Please Enter ID... !");
        } 
        else 
        {
            try 
            {
                PreparedStatement statement;
                ResultSet result;
                String query = "select * from customer where customer_id = '" + delete_id.getText() + "' and vendor_id = '"+id.getText()+"'";
                Connection connect;
                connect = database_connection.connector();
                statement = connect.prepareStatement(query);
                result = statement.executeQuery();
                DefaultTableModel tblmodel = (DefaultTableModel) table_delete_customer.getModel();
                if (result.next()) 
                {
                    String row[] = {result.getString("customer_id"), result.getString("fname"), result.getString("lname"), result.getString("email"), result.getString("mobile_no"), result.getString("join_date")};
                    
                    tblmodel.setRowCount(0);
                    tblmodel.addRow(row);
                } 
                else 
                {
                    tblmodel.setRowCount(0);
                    JOptionPane.showMessageDialog(this, "Customer Not Found... !");
                }
            } 
            catch (SQLException e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }


    
    // --------------------- DELETE CUSTOMER TAB CANCEL BUTTON EVENT ------------------------
    
    
    
    private void delete_customer_after_cancel_btnMouseClicked(java.awt.event.MouseEvent evt) 
    {
        DefaultTableModel tblmodel = (DefaultTableModel) table_delete_customer.getModel();
        tblmodel.setRowCount(0);
        delete_id.setText("");
    }


    
//  ------------------- SHOW CUSTOMER DATA TAB SHOW MILK BUTTON EVENT  --------------------
    
    
    private void show_milk_data_btnActionPerformed(java.awt.event.ActionEvent evt)
    {
        if (show_milk_data_id.getText().isEmpty()) 
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
                String query = "select * from milk where customer_id = '" +show_milk_data_id.getText()+ "' and vendor_id = '"+id.getText()+"' and date >= '"+dateFormat.format(start_date.getDate())+"' and date <= '"+dateFormat.format(end_date.getDate())+"'";
                Connection connect;
                connect = database_connection.connector();
                statement = connect.prepareStatement(query);
                result = statement.executeQuery();
                DefaultTableModel tblmodel = (DefaultTableModel) table_show_customer_data.getModel();
                tblmodel.setRowCount(0);
                while (result.next()) 
                {
                    String row[] = {result.getString("date"),result.getString("shift"), result.getString("milk_quantity"), result.getString("degree"), result.getString("fat"), result.getString("Total_Ammount")};
                    tblmodel.addRow(row);
                }
            } 
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    
    
//  ----------------------------  SHOW CUSTOMER DATA TAB DELETE BUTTON EVENT -----------------
    
    
    private void show_data_delete_btnActionPerformed(java.awt.event.ActionEvent evt) 
    {
            try 
            {
                Connection connect;
                connect = database_connection.connector();
                PreparedStatement statement;
                ResultSet result;
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String query = "DELETE from milk where customer_id = '" +show_milk_data_id.getText()+ "' and vendor_id = '"+id.getText()+"' and date = '"+dateFormat.format(show_data_date.getDate())+"' and shift = '"+show_adat_shift.getSelectedItem()+"'";
                
                statement = connect.prepareStatement(query);
                statement.executeUpdate();
                query = "select * from milk where customer_id = '" +show_milk_data_id.getText()+ "' and vendor_id = '"+id.getText()+"' and date >= '"+dateFormat.format(start_date.getDate())+"' and date <= '"+dateFormat.format(end_date.getDate())+"'";
                statement = connect.prepareStatement(query);
                result = statement.executeQuery();
                DefaultTableModel tblmodel = (DefaultTableModel) table_show_customer_data.getModel();
                tblmodel.setRowCount(0);
                while (result.next()) 
                {
                    String row[] = {result.getString("date"),result.getString("shift"), result.getString("milk_quantity"), result.getString("degree"), result.getString("fat"), result.getString("Total_Ammount")};
                    tblmodel.addRow(row);
                }
            } 
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
    }
    

// --------------------------------- LOGOUT BUTTON EVENT -----------------------------------------
    
    
   private void logoutMouseClicked(java.awt.event.MouseEvent evt) {                                    
        dispose();
        Login login = new Login();
        login.show();
    } 
    
     
//  ----------------------- MAIN METHOD OF THE CLASS  ---------------------------------
//( from this method program starts to run)



    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater
        (
            new Runnable()
            {
                public void run() 
                {
                    new vendor_dashboard().setVisible(true); 
                }
            }
        );
    }

    
 //  ------------------ SWING GUI AND AWT GUI CLASSES OBJECT CREATED -------------------------   
    
    private JButton add_a_customer_btn;
    private JPanel add_a_customer_card;
    private JPanel add_a_customer_panel;
    private JButton add_a_milk_btn;
    private JPanel add_a_milk_card;
    private JPanel add_a_milk_panel;
    private JButton add_customer_reset;
    private JButton add_customer_save;
    private JButton add_entry;
    private JTextField address;
    private JLabel address_label;
    private JPanel back_panel;
    private JPasswordField confirm_password;
    private JLabel confirm_password_label;
    private JDateChooser current_date;
    private JTextField degree;
    private JButton delete_customer_after_btn;
    private JButton delete_customer_after_cancel_btn;
    private JButton delete_customer_btn;
    private JPanel delete_customer_panel;
    private JScrollPane delete_customer_scrollbar;
    private JTextField delete_id;
    private JTextField email;
    private JLabel email_label;
    private JDateChooser end_date;
    private JTextField fat;
    private JTextField first_name;
    private JLabel firstname_label;
    private JPanel form_bar;
    private JLabel id;
    private JTextField id_add_a_customer;
    private JTextField id_add_a_milk;
    private JLabel id_delete_label;
    private JLabel id_label;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTextField last_name;
    private JLabel lastname_label;
    private JTextField milk_quantity;
    private JComboBox<String> milk_type;
    private JLabel milk_type_label;
    private JLabel ml1;
    private JLabel ml2;
    private JLabel ml3;
    private JLabel ml4;
    private JLabel ml5;
    private JLabel ml6;
    private JLabel ml7;
    private JTextField mobile_no;
    private JLabel mobile_no_label;
    private JPasswordField password;
    private JLabel password_label;
    private JButton reset_add_milk;
    private JComboBox<String> shift;
    private JComboBox<String> show_adat_shift;
    private JButton show_customer_data_btn;
    private JPanel show_customer_data_panel;
    private JDateChooser show_data_date;
    private JButton show_data_delete_btn;
    private JButton show_delete_data;
    private JButton show_milk_data_btn;
    private JTextField show_milk_data_id;
    private JPanel sidebar;
    private JLabel sl1;
    private JLabel sl2;
    private JLabel sl3;
    private JLabel sl4;
    private JLabel sl5;
    private JDateChooser start_date;
    private JPanel tab1;
    private JPanel tab2;
    private JPanel tab3;
    private JPanel tab4;
    private JLabel tab_name;
    private JTable table_delete_customer;
    private JTable table_show_customer_data;
    private JPanel top_bar;
    private JTextField total_milk;
    private JPanel user_icon;
    private JLabel user_icon_label;
    private JLabel username;
    private javax.swing.JButton logout;
}
