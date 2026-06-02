package pekan8_2311533016;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BubbleSortUI_2311533016 extends JFrame {

    private JTextField inputField;
    private JButton setButton;
    private JButton stepButton;
    private JButton resetButton;

    private JPanel panelArray;
    private JTextArea stepArea;

    private JLabel[] labelArray;
    private int[] array;

    private int i;
    private int j;
    private int stepCount;

    private boolean sorting;

    public BubbleSortUI_2311533016() {

        setTitle("Bubble Sort Visualization");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();

        inputField = new JTextField(20);
        setButton = new JButton("Set Data");
        stepButton = new JButton("Step");
        resetButton = new JButton("Reset");

        stepButton.setEnabled(false);

        topPanel.add(new JLabel("Input Data:"));
        topPanel.add(inputField);
        topPanel.add(setButton);
        topPanel.add(stepButton);
        topPanel.add(resetButton);

        add(topPanel, BorderLayout.NORTH);

        panelArray = new JPanel();
        add(panelArray, BorderLayout.CENTER);

        stepArea = new JTextArea(10, 50);
        stepArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(stepArea);
        add(scrollPane, BorderLayout.SOUTH);

        setButton.addActionListener(e -> setArrayFromInput());
        stepButton.addActionListener(e -> performStep());
        resetButton.addActionListener(e -> reset());
    }

    private void setArrayFromInput() {

        String text = inputField.getText().trim();

        if (text.isEmpty())
            return;

        String[] parts = text.split(",");
        array = new int[parts.length];

        try {

            for (int k = 0; k < parts.length; k++) {
                array[k] = Integer.parseInt(parts[k].trim());
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan hanya angka yang dipisahkan koma!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        i = 0;
        j = 0;
        stepCount = 1;
        sorting = true;

        stepButton.setEnabled(true);
        stepArea.setText("");

        panelArray.removeAll();

        labelArray = new JLabel[array.length];

        for (int k = 0; k < array.length; k++) {

            labelArray[k] = new JLabel(String.valueOf(array[k]));

            labelArray[k].setFont(
                    new Font("Arial", Font.BOLD, 24));

            labelArray[k].setOpaque(true);
            labelArray[k].setBackground(Color.WHITE);

            Border border = BorderFactory.createLineBorder(Color.BLACK);
            labelArray[k].setBorder(border);

            labelArray[k].setPreferredSize(
                    new Dimension(50, 50));

            labelArray[k].setHorizontalAlignment(
                    SwingConstants.CENTER);

            panelArray.add(labelArray[k]);
        }

        panelArray.revalidate();
        panelArray.repaint();
    }

    private void performStep() {

        if (!sorting || i >= array.length - 1) {

            sorting = false;
            stepButton.setEnabled(false);

            JOptionPane.showMessageDialog(
                    this,
                    "Sorting selesai!");

            return;
        }

        resetHighlights();

        StringBuilder stepLog = new StringBuilder();

        labelArray[j].setBackground(Color.CYAN);
        labelArray[j + 1].setBackground(Color.CYAN);

        if (array[j] > array[j + 1]) {

            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;

            labelArray[j].setBackground(Color.RED);
            labelArray[j + 1].setBackground(Color.RED);

            stepLog.append("Langkah ")
                    .append(stepCount)
                    .append(": Menukar elemen ke-")
                    .append(j)
                    .append(" (")
                    .append(array[j + 1])
                    .append(") dengan ke-")
                    .append(j + 1)
                    .append(" (")
                    .append(array[j])
                    .append(")\n");

        } else {

            stepLog.append("Langkah ")
                    .append(stepCount)
                    .append(": Tidak ada pertukaran antara elemen ke-")
                    .append(j)
                    .append(" dan ke-")
                    .append(j + 1)
                    .append("\n");
        }

        stepLog.append("Array saat ini: ")
                .append(arrayToString(array))
                .append("\n\n");

        stepArea.append(stepLog.toString());

        updateLabels();

        j++;

        if (j >= array.length - i - 1) {
            j = 0;
            i++;
        }

        stepCount++;

        if (i >= array.length - 1) {

            sorting = false;
            stepButton.setEnabled(false);

            JOptionPane.showMessageDialog(
                    this,
                    "Sorting selesai!");
        }
    }

    private void updateLabels() {

        for (int k = 0; k < array.length; k++) {
            labelArray[k].setText(
                    String.valueOf(array[k]));
        }
    }

    private void resetHighlights() {

        if (labelArray == null)
            return;

        for (JLabel label : labelArray) {
            label.setBackground(Color.WHITE);
        }
    }

    private void reset() {

        inputField.setText("");

        panelArray.removeAll();
        panelArray.revalidate();
        panelArray.repaint();

        stepArea.setText("");

        stepButton.setEnabled(false);

        sorting = false;
        i = 0;
        j = 0;
        stepCount = 1;
    }

    private String arrayToString(int[] arr) {

        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < arr.length; k++) {

            sb.append(arr[k]);

            if (k < arr.length - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() ->
                new BubbleSortUI_2311533016().setVisible(true));
    }
}