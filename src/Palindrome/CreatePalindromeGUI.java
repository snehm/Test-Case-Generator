package Palindrome;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CreatePalindromeGUI {

    JPanel jpanArr = null;
    JTextArea arrOutput = null;

    public boolean isVisible()
    {
        return jpanArr.isVisible();
    }

    public boolean save()
    {
        try {
            PrintWriter file = new PrintWriter(new FileWriter("input.txt"));
            file.print(arrOutput.getText());
            file.flush();
            return true;
        }
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public void copy()
    {
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(new StringSelection(arrOutput.getText()), null);
    }


    public CreatePalindromeGUI(JPanel panelToAdd)
    {
        jpanArr = new JPanel();
        jpanArr.setLayout(new GridBagLayout());
        GridBagConstraints gbcJpanArr = new GridBagConstraints();
        //jpanArr.setBackground(Color.cyan);

        panelToAdd.add(jpanArr, "Palindrome");

        //panel1
        JPanel pan1 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 0;
        //pan1.setBackground(Color.green);
        pan1.setPreferredSize(new Dimension(540,30));
        jpanArr.add(pan1,gbcJpanArr);

        JLabel jlab = new JLabel("PALINDROME",JLabel.CENTER);
        jlab.setPreferredSize(new Dimension(200,30));
        pan1.add(jlab);

        //empty pan
        JPanel panEmpty = new JPanel();
        panEmpty.setPreferredSize(new Dimension(200,35));
        //panEmpty.setBackground(Color.RED);
        gbcJpanArr.gridy = 1;
        jpanArr.add(panEmpty,gbcJpanArr);

        //panel 2
        JPanel pan2 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 2;
        //pan2.setBackground(Color.cyan);
        jpanArr.add(pan2, gbcJpanArr);

        pan2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(1,1,1,1);

        JLabel length = new JLabel("Length : ", JLabel.RIGHT);
        length.setPreferredSize(new Dimension(150,30));
        pan2.add(length, gbc);

        gbc.gridx = 1;
        JTextField lengthTxt = new JTextField("10");
        lengthTxt.setPreferredSize(new Dimension(120,30));
        pan2.add(lengthTxt, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        JLabel countLabel = new JLabel("total test cases : ", JLabel.RIGHT);
        countLabel.setPreferredSize(new Dimension(150,30));
        pan2.add(countLabel, gbc);

        gbc.gridx = 1;
        JTextField countTxt = new JTextField("1");
        countTxt.setPreferredSize(new Dimension(120,30));
        pan2.add(countTxt, gbc);

        JLabel sepLabel = new JLabel("separated by:",  JLabel.RIGHT);
        JTextField sepTxt = new JTextField(" ");
        sepLabel.setPreferredSize(new Dimension(150,30));
        sepTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 2;
        gbc.gridwidth = 1;
        pan2.add(sepLabel, gbc);
        gbc.gridx = 3;
        pan2.add(sepTxt, gbc);
        gbc.gridwidth =1;

        //panel3
        JPanel pan3 = new JPanel();
        pan3.setLayout(new GridBagLayout());
        //pan3.setBackground(Color.cyan);
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 3;
        jpanArr.add(pan3, gbcJpanArr);

        JRadioButton selInt = new JRadioButton("Integer Palindrome");
        selInt.setPreferredSize(new Dimension(300, 30));
        JRadioButton selString = new JRadioButton("String Palindrome");
        selString.setPreferredSize(new Dimension(250, 30));

        ButtonGroup bg = new ButtonGroup();
        bg.add(selInt);
        bg.add(selString);
        gbc.gridx = 0;
        gbc.gridy = 0;
        pan3.add(selInt, gbc);
        gbc.gridx = 1;
        pan3.add(selString, gbc);



        //panel4
        JPanel pan4 = new JPanel();
        pan4.setLayout(new GridBagLayout());
        //pan4.setBackground(Color.cyan);
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 4;
        jpanArr.add(pan4, gbcJpanArr);

        JCheckBox A2Z = new JCheckBox("A-Z");
        A2Z.setPreferredSize(new Dimension(120, 30));
        JCheckBox a2z = new JCheckBox("a-z");
        a2z.setPreferredSize(new Dimension(120, 30));
        JCheckBox numeric = new JCheckBox("0-9");
        numeric.setPreferredSize(new Dimension(120, 30));
        gbc.gridx=0;
        gbc.gridy=0;
        pan4.add(A2Z, gbc);
        gbc.gridx=1;
        pan4.add(a2z, gbc);
        gbc.gridx=2;
        pan4.add(numeric, gbc);

        JLabel min = new JLabel("Min : ", JLabel.RIGHT);
        min.setPreferredSize(new Dimension(150, 30));
        JTextField minTxt = new JTextField();
        minTxt.setPreferredSize(new Dimension(120, 30));
        gbc.gridx = 0;
        gbc.gridy = 0;
        pan4.add(min,gbc);
        gbc.gridx = 1;
        pan4.add(minTxt, gbc);

        JLabel max = new JLabel("Max : ", JLabel.RIGHT);
        max.setPreferredSize(new Dimension(150,30));
        JTextField maxTxt = new JTextField();
        maxTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 2;
        pan4.add(max,gbc);
        gbc.gridx = 3;
        pan4.add(maxTxt, gbc);

        max.setVisible(false);
        min.setVisible(false);
        maxTxt.setVisible(false);
        minTxt.setVisible(false);

        A2Z.setVisible(false);
        a2z.setVisible(false);
        numeric.setVisible(false);
        selString.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                JRadioButton radio = (JRadioButton)ie.getItem();
                if(radio.isSelected())
                {
                    max.setVisible(false);
                    min.setVisible(false);
                    maxTxt.setVisible(false);
                    minTxt.setVisible(false);

                    A2Z.setVisible(true);
                    a2z.setVisible(true);
                    numeric.setVisible(true);
                }
                else
                {
                    max.setVisible(false);
                    min.setVisible(false);
                    maxTxt.setVisible(false);
                    minTxt.setVisible(false);

                    A2Z.setVisible(false);
                    a2z.setVisible(false);
                    numeric.setVisible(false);
                }
            }
        });

        selInt.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                JRadioButton radio = (JRadioButton)ie.getItem();
                if(radio.isSelected())
                {
                    max.setVisible(true);
                    min.setVisible(true);
                    maxTxt.setVisible(true);
                    minTxt.setVisible(true);

                    A2Z.setVisible(false);
                    a2z.setVisible(false);
                    numeric.setVisible(false);
                }
                else
                {
                    max.setVisible(false);
                    min.setVisible(false);
                    maxTxt.setVisible(false);
                    minTxt.setVisible(false);

                    A2Z.setVisible(false);
                    a2z.setVisible(false);
                    numeric.setVisible(false);
                }
            }
        });

        //panel5
        JPanel pan5 = new JPanel();
        JButton generate = new JButton("GENERATE");
        generate.setPreferredSize(new Dimension(280,30));
        generate.setBackground(Color.GREEN);


        JMenuBar menuBar = new JMenuBar();
        JMenu more = new JMenu("Advance");

        JCheckBox item1 = new JCheckBox("Hide length ");
        JCheckBox item2 = new JCheckBox("Show total test cases");
        JCheckBox item3 = new JCheckBox("Make length random");
        more.add(item1);
        more.add(item2);
        more.add(item3);
        menuBar.add(more);
        menuBar.setPreferredSize(new Dimension(80,30));

        pan5.add(menuBar);
        pan5.add(generate);
        gbcJpanArr.gridy = 5;
        jpanArr.add(pan5, gbcJpanArr);

        //panel6
        JPanel pan6 = new JPanel();
        //pan6.setBackground(Color.BLACK);
        pan6.setPreferredSize(new Dimension(560,300));
        gbcJpanArr.gridy = 6;
        jpanArr.add(pan6,gbcJpanArr);

        arrOutput = new JTextArea();
        arrOutput.setText("");
        JScrollPane jsp = new JScrollPane(arrOutput);
        jsp.setPreferredSize(new Dimension(560,300));
        pan6.add(jsp);

        //generate actionListener
        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                /*
                String str = "length : "+lengthTxt.getText()+"\n";
                //sepLabel selInt selString A-Z a-z numeric min max item1 item2
                str += "total test cases : "+countTxt.getText()+"\n";
                str += "test cases separated by :"+sepTxt.getText()+"\n";
                str += "integer : "+selInt.isSelected()+"\n";
                str += "string : "+selString.isSelected()+"\n";
                str += "a - z : "+a2z.isSelected()+"\n";
                str += "A - Z : "+A2Z.isSelected()+"\n";
                str += "0 - 9 : "+numeric.isSelected()+"\n";
                str += "min : "+minTxt.getText()+"\n";
                str += "max : "+maxTxt.getText()+"\n";
                str += "Hide length : "+item1.isSelected()+"\n";
                str += "Show total test cases : "+item2.isSelected()+"\n";
                 str += "make test case: "+item2.isSelected()+"\n";
                arrOutput.setText(str);

                */
                String input[] = {""+lengthTxt.getText(), ""+countTxt.getText(), ""+A2Z.isSelected(),""+a2z.isSelected(), ""+numeric.isSelected(), ""+item2.isSelected() ,""+ item1.isSelected(), ""+item3.isSelected() ,""+sepTxt.getText() ,"0"+ minTxt.getText() ,"0"+ maxTxt.getText(), ""+selInt.isSelected() };
                PalindromeGeneration generator = new PalindromeGeneration();
                generator.setOutputTxt(arrOutput);
                generator.generate(input);

            }
        });
    }
}
