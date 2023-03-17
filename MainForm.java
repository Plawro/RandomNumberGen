import javax.swing.*;
import java.util.Random;

public class MainForm extends JFrame{
    private JTextField textField1;
    private JButton gen;
    private JTextArea textArea1;
    private JButton copy;
    private JPanel mainPanel;

    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.setSize(200,150);
        mainForm.setVisible(true);
        mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MainForm(){
        setTitle("Hello GUI");
        setContentPane(mainPanel);
        gen.addActionListener(e-> Generate());
        copy.addActionListener(e-> Copy());
    }
    public int nahodne;
    void Generate(){
        Random generator = new Random();
         nahodne = generator.nextInt(100);
        textField1.setText(String.valueOf(nahodne));
    }

    void Copy(){
        if(textArea1.getText().equals("")){
            textArea1.setText(String.valueOf(nahodne));
        }else {
            textArea1.setText(textArea1.getText() + "\n" + nahodne);
        }

    }
}
