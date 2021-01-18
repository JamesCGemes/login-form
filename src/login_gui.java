import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login_gui implements ActionListener {


    private static JLabel user_label;
    private static JTextField userText;
    private static JLabel password_label;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        JPanel panel =  new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        user_label = new JLabel("User");
        user_label.setBounds(10,20,80,25);
        panel.add(user_label);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        password_label = new JLabel("Password");
        password_label.setBounds(10,50,80,25);
        panel.add(password_label);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50, 165,25);
        panel.add(passwordText);

        button = new JButton("Submit");
        button.setBounds(10,80,80,25);
        button.addActionListener(new login_gui());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + "," + password);

        if (user.equals("James") && password.equals("password")) {
            success.setText("Login successful");
        }
    }
}
