package SimpleLoginAndRegisterUIUsingSwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class register extends JFrame implements ActionListener {
    private static final String USER_DATA_FILE = "user_data.txt";
    private JFrame registerFrame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField emailField;
    private JTextField phoneNumberField;

    public void Register() {
        createRegisterUI();
    }

    private void createRegisterUI() {
        registerFrame = new JFrame("Register");
        registerFrame.setLayout(new GridLayout(5, 2));
        registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerFrame.setSize(400, 300);

        JPanel registerPanel0 = new JPanel(new GridLayout(1, 1, 1, 1));

        JPanel registerPanel1 = new JPanel(new GridLayout(1, 2));
        JPanel registerPanel2 = new JPanel(new GridLayout(1, 2));
        JPanel registerPanel3 = new JPanel(new GridLayout(1, 2));
        JPanel registerPanel4 = new JPanel(new GridLayout(1, 2));
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField();
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberField = new JTextField();

        JButton registerButton = new JButton("Register");
        JButton goToLoginButton = new JButton("Login");

        registerButton.addActionListener(this);
        goToLoginButton.addActionListener(this);
        JLabel registerLabel = new JLabel("New User Register", JLabel.CENTER);
        registerPanel0.add(registerLabel);
        registerPanel1.add(firstNameLabel);
        registerPanel1.add(firstNameField);
        registerPanel1.add(usernameLabel);
        registerPanel1.add(usernameField);
        registerPanel2.add(lastNameLabel);
        registerPanel2.add(lastNameField);
        registerPanel2.add(passwordLabel);
        registerPanel2.add(passwordField);
        registerPanel3.add(emailLabel);
        registerPanel3.add(emailField);
        registerPanel3.add(phoneNumberLabel);
        registerPanel3.add(phoneNumberField);
        registerPanel4.add(registerButton);
        registerPanel4.add(goToLoginButton);

        registerFrame.add(registerPanel0);

        registerFrame.add(registerPanel1);
        registerFrame.add(registerPanel2);
        registerFrame.add(registerPanel3);
        registerFrame.add(registerPanel4);

        registerFrame.setVisible(true);

    }

    private void saveUser(String username, String password, String firstName, String lastName, String email,
            String phoneNumber) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_DATA_FILE, true))) {
            writer.write(
                    username + "," + password + "," + firstName + "," + lastName + "," + email + "," + phoneNumber);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String phoneNumber = phoneNumberField.getText();
        String command = e.getActionCommand();
        if (command.equals("Register")) {
            if (username.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()
                    || phoneNumber.isEmpty()) {
                JOptionPane.showMessageDialog(registerFrame, "All fields must be filled out.");
            } else if (registerUser(username, password, firstName, lastName, email, phoneNumber)) {
                JOptionPane.showMessageDialog(registerFrame, "Registration Successful!");
            } else {
                JOptionPane.showMessageDialog(registerFrame, "Registration Failed. Username might be taken.");
            }
        } else if (command.equals("Login")) {
            login login = new login();
            login.Login();
        }
    }

    private boolean registerUser(String username, String password, String firstName, String lastName, String email,
            String phoneNumber) {
        Map<String, String> users = loadUsers();
        if (users.containsKey(username)) {
            return false;
        }
        if (username.equals("") || password.equals("") || firstName.equals("") || lastName.equals("")
                || email.equals("") || phoneNumber.equals("")) {
            return false;
        }
        saveUser(username, password, firstName, lastName, email, phoneNumber);
        return true;
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
            e.printStackTrace();
        }
        return users;
    }

    public static void main(String[] args) {
        register register = new register();
        register.Register();
    }

}
