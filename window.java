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
    private JButton clear;
    private JTextField input1;
    private JTextField input2;

    public window() {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        setLayout(new GridBagLayout());

        GridBagConstraints left1 = new GridBagConstraints();
        left1.gridx = 0;
        left1.gridy = 0;
        left1.insets = new Insets(10, 10, 10, 10);
        usd = new JLabel("USD");

        GridBagConstraints left2 = new GridBagConstraints();
        left2.gridx = 0;
        left2.gridy = 1;
        input1 = new JTextField(10);

        GridBagConstraints middle1 = new GridBagConstraints();
        middle1.gridx = 1;
        middle1.gridy = 1;
        convert = new JButton("Convert");

        convert.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double d1 = Double.parseDouble(input1.getText());

                    double sum = ((.82) / d1);
                    String st = String.valueOf(sum);
                    input2.setText(st);

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        GridBagConstraints middle2 = new GridBagConstraints();
        middle2.gridx = 1;
        middle2.gridy = 2;
        clear = new JButton("Clear");

        GridBagConstraints right1 = new GridBagConstraints();
        right1.gridx = 2;
        right1.gridy = 0;
        eur = new JLabel("EUR");

        GridBagConstraints right2 = new GridBagConstraints();
        right2.gridx = 2;
        right2.gridy = 1;
        input2 = new JTextField(10);

        add(usd, left1);
        add(input1, left2);
        add(convert, middle1);
        add(clear, middle2);
        add(eur, right1);
        add(input2, right2);

    }

}