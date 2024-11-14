package SimpleLoginAndRegisterUIUsingSwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener {
    private static final String USER_DATA_FILE = "user_data.txt";
    private JFrame loginFrame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public void Login() {
        createLoginUI();
    }

    private void createLoginUI() {
        loginFrame = new JFrame("Login");
        loginFrame.setSize(300, 150);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(new GridLayout(4, 2));
        JPanel registerPanel0 = new JPanel(new GridLayout(1, 1, 1, 1));

        JPanel registerPanel1 = new JPanel(new GridLayout(1, 2));
        JPanel registerPanel2 = new JPanel(new GridLayout(1, 2));
        JPanel registerPanel3 = new JPanel(new GridLayout(1, 2));
        JLabel loginLabel = new JLabel("Login");
        registerPanel0.add(loginLabel, JLabel.CENTER);
        JLabel usernameLabel = new JLabel("Username:");
        registerPanel1.add(usernameLabel);
        usernameField = new JTextField();
        registerPanel1.add(usernameField);
        JLabel passwordLabel = new JLabel("Password:");
        registerPanel2.add(passwordLabel);
        passwordField = new JPasswordField();
        registerPanel2.add(passwordField);
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        registerPanel3.add(loginButton);
        loginFrame.add(registerPanel0);
        loginFrame.add(registerPanel1);
        loginFrame.add(registerPanel2);
        loginFrame.add(registerPanel3);
        loginFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        if (authenticateUser(username, password)) {
            JOptionPane.showMessageDialog(loginFrame, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(loginFrame, "Login Failed. Try again.");
        }

    }

    private boolean authenticateUser(String username, String password) {
        Map<String, String> users = loadUsers();
        return users.containsKey(username) && users.get(username).equals(password);
    }

    private Map<String, String> loadUsers() {
        Map<String, String> users = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_DATA_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                users.put(parts[0], parts[1]);

            }
        } catch (IOException e) {
            System.out.println("User data file not found, starting fresh.");
        }
        return users;
    }

    public static void main(String[] args) {
        login login = new login();
        login.Login();
    }
}
