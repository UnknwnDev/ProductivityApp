package com.unknwndev.todo;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class TodoTitleBar extends JPanel {

    private JLabel _titleLabel;

    public TodoTitleBar(String _title){
        setSize(450, 75);
        setLayout(new BorderLayout());
        setBackground(Color.darkGray.darker());

        
        _titleLabel = new JLabel("Test-List");

        _titleLabel.setFont(new Font(getName(), Font.BOLD, 25));
        
        
        _titleLabel.setForeground(Color.white);
        _titleLabel.setBorder(new EmptyBorder(0, 25, 0, 0));
        
        add(_titleLabel, BorderLayout.WEST);
    }
}
