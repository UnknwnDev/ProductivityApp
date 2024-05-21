package com.unknwndev.gui;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GuiTitleBar extends JPanel {
    private JLabel _titleLabel;

    GuiTitleBar() {
        setSize(450, 50);
        setLayout(new BorderLayout());
        setBackground(Color.darkGray.darker());

        
        _titleLabel = new JLabel("TODO-List");

        _titleLabel.setFont(new Font(getName(), Font.BOLD, 20));
        
        
        _titleLabel.setForeground(Color.white);
        _titleLabel.setBorder(new EmptyBorder(0, 25, 0, 0));
        
        add(_titleLabel, BorderLayout.WEST);
    }

    public void currentProgram(String program){
        _titleLabel.setText(program);
    }

}
