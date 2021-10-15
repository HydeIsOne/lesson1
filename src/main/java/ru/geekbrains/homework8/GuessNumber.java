package ru.geekbrains.homework8;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber extends JFrame {
    private int randomNumber;
    private JTextField textField;
    private JPanel buttonsPanel;
    private int count = 0;

    public GuessNumber() {
        randomNumber = (int) (Math.random() * 10 + 1);

        setTitle("Guess the number");
        setBounds(400, 300, 800, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);

        JButton button1 = new JButton("RESTART");
        button1.setFont(font);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomNumber = (int) (Math.random() * 10 + 1);
                textField.setText("Игра перезапущена, попробуйте угадать снова!");
                count = 0;
            }
        });
        add(button1, BorderLayout.SOUTH);

        buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count < 3) {
                        tryToAnswer(buttonIndex);
                        System.out.println(count);
                    } else {
                        textField.setText("Слишком много попыток, начните заново");
                    }
                }
            });
        }
        setVisible(true);
    }

    public void tryToAnswer(int answer) {
        if (answer == randomNumber) {
            textField.setText("Вы угадали! Ответ: " + randomNumber);

        } else if (answer > randomNumber) {
            textField.setText("Не угадали, загаданное число меньше. Вы потратили " + (count + 1) + " попытку из 3");
        } else {
            textField.setText("Не угадали, загаданное число больше. Вы потратили " + (count + 1) + " попытку из 3");
        } count++;
    }
    public boolean counter(int count) {
        if(count == 3) {
            textField.setText("Слишком много попыток");
        } return true;
    }
}


