import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class window extends JFrame {
    private JLabel usd;
    private JLabel eur;
    private JButton convert;
    private JTextField input1;
    private JTextField input2;


    public window() {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        setLayout(new GridBagLayout());

    }
}