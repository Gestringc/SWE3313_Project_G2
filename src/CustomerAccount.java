import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static javax.swing.JOptionPane.showInputDialog;

    class CustomerAccount {
        private String name;
        private String address;
        private String phone;
        private String paymentMethod;

        public CustomerAccount(String name, String address, String phone, String pm) {
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.paymentMethod = pm;
        }
        // Getters
        public String getPhone() {
            return phone;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }}

       // class DatabaseMANAGER {
         //   static final String URL = "jdbc:mysql://localhost:3306/pizza_shop";
           // static final String USER = "root", PASS = "password";

            //static void executeSQL(String sql, String... params) throws SQLException {
              //  try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
                //     PreparedStatement stmt = ((java.sql.Connection) conn).prepareStatement(sql)) {
                  //  for (int i = 0; i < params.length; i++)
                    //    stmt.setString(i + 1, params[i]);
                    //stmt.executeUpdate();

               // }
           // }
       // }
    /*    public static void main(String[] args) {
            System.out.println("System initialized! Starting GUI...");

            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Account Manager");
                frame.setSize(300, 200);
                frame.setLayout(new GridLayout(3,1));

                addButton(frame, "Create Account", Main::createAccount);
                addButton(frame, "Modify Account", Main::modifyAccount);
                addButton(frame, "Delete Account", Main::deleteAccount);

                frame.setVisible(true);
            });
        }

        private static void addButton(JFrame f, String text, Runnable action) {
            JButton btn = new JButton(text);
            btn.addActionListener(e -> action.run());
            f.add(btn);
        }

        // Account Creation (2.1)
        private static void createAccount() {
            JTextField name = new JTextField(), addr = new JTextField(),
                    phone = new JTextField();
            JComboBox<String> pm = new JComboBox<>(new String[]{"Visa", "MasterCard"});

            if (showInputDialog("Create Account", "Name:", name, "Address:", addr,
                    "Phone:", phone, "Payment Method:", pm)) {
                try {
                    DB.executeSQL("INSERT INTO customers VALUES (?,?,?,?)",
                            name.getText(), addr.getText(), phone.getText(), pm.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(null, "Account created!");
                } catch (SQLException e) { showError(e); }
            }
        }

        // Account Modification (2.2)
    }
/*
    private void showError(SQLException e) {
    }

}
}
}
