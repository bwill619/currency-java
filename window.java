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
    private JButton convert2;
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
        convert = new JButton("Convert to EUR");

        convert.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                double d1 = Double.parseDouble(input1.getText());

                double sum = (d1 * (.82));
                String st = String.valueOf(sum);
                input2.setText(st);
            }
        });

        GridBagConstraints middle2 = new GridBagConstraints();
        middle2.gridx = 1;
        middle2.gridy = 2;
        convert2 = new JButton("Convert to USD");
        convert2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                double d2 = Double.parseDouble(input2.getText());

                double sum = (d2 * (1.22));
                String st = String.valueOf(sum);
                input1.setText(st);
            }
        });

        GridBagConstraints middle3 = new GridBagConstraints();
        middle3.gridx = 1;
        middle3.gridy = 3;
        clear = new JButton("Clear");
        clear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String blank = "";
                input1.setText(blank);
                input2.setText(blank);
            }
        });

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
        add(convert2, middle2);
        add(clear, middle3);
        add(eur, right1);
        add(input2, right2);

    }

}