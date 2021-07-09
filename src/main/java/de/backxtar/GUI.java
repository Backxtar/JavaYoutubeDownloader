package de.backxtar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    public GUI ytDownloader;
    private JFrame frame;
    private JPanel panel;
    private JTextField textField;
    private JButton button;
    private JLabel label;

    public GUI()
    {
        ytDownloader = this;
        frame = new JFrame();
        panel = new JPanel();

        textField = new JTextField("Enter YouTube-URL", 30);
        button = new JButton("Download Video");
        button.addActionListener(this);

        label = new JLabel("Downloading...");
        label.setVisible(false);

        panel.setBorder(BorderFactory.createEmptyBorder(150, 150, 100, 150));
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new GridLayout(0, 1));
        panel.add(textField);
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Java Youtube-Downloader");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Download Video")) {
            label.setVisible(true);
            textField.setEnabled(false);
        }
    }
}
