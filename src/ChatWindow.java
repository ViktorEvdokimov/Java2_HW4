import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ChatWindow extends JFrame {
    public ChatWindow() {
        setTitle("My chat window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 100, 300, 600);
        setVisible(true);


        JPanel chatArea = new JPanel();
        chatArea.setLayout(new BorderLayout());
        JTextPane  textArea = new JTextPane ();

        textArea.setEditable(false);
        chatArea.add(textArea, BorderLayout.CENTER);
        textArea.setAlignmentX(RIGHT_ALIGNMENT);
        textArea.setAlignmentY(BOTTOM_ALIGNMENT);
        StringBuilder sb = new StringBuilder();
        JPanel inputField = new JPanel();
        inputField.setLayout(new BorderLayout());
        JTextField textField = new JTextField();
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode()==10){
                    sb.append(textField.getText());
                    sb.append("\n");
 //                   System.out.print(sb.toString());
                    textArea.setText(sb.toString());
                    textField.setText("");
                }
            }
        });
        inputField.add(textField, BorderLayout.CENTER);
        JButton enter = new JButton("ENTER");
        enter.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                                    sb.append(textField.getText());
                    sb.append("\n");
   //                 System.out.print(sb.toString());
                    textArea.setText(sb.toString());
                    textField.setText("");
            }
        });
        inputField.add(enter, BorderLayout.LINE_END);

        add(chatArea, BorderLayout.CENTER);
        add(inputField, BorderLayout.PAGE_END);
    }


}
