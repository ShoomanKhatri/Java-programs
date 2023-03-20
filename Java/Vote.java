import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Vote extends JFrame {
    JLabel ageEnquiry, result;
    JComboBox<String> ageList;
    JTextField results;
    JButton val;

    public Vote() {

        String[] ages = new String[] {"15", "18-30", "31-40", "41-50", "51-60", "61-70", "71-80", "81-90", "91-100"};

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        ageEnquiry = new JLabel("Enter your Age: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(ageEnquiry, c);

        ageList = new JComboBox<>(ages);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 5;
        c.gridy = 0;
        add(ageList, c);

        result = new JLabel("Check: ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        add(result, c);

        results = new JTextField(10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 5;
        c.gridy = 2;
        add(results, c);

        ageList.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JComboBox<String> combo = (JComboBox<String>) event.getSource();
                String selectedAge = (String) combo.getSelectedItem();

                if(selectedAge.equals("10-17")) {
                    results.setText(" YOu are not eligible to vote.");
                } else {
                    results.setText(" You are eligible to vote.");
                }
            }
        });
    }


    public static void main(String[] args) {
        Vote gui = new Vote();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(400, 400);
        gui.setTitle("Vote");
    }
}