package String;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class CreateStringGUI {

    JTextArea arrOutput = null;
    JPanel jpanArr = null;

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

    public CreateStringGUI(JPanel panelToAdd){
        jpanArr = new JPanel();
        jpanArr.setLayout(new GridBagLayout());
        GridBagConstraints gbcJpanArr = new GridBagConstraints();
        //jpanArr.setBackground(Color.cyan);

        panelToAdd.add(jpanArr, "String");

        //panel1
        JPanel pan1 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 0;
        //pan1.setBackground(Color.green);
        pan1.setPreferredSize(new Dimension(540,30));
        jpanArr.add(pan1,gbcJpanArr);

        JLabel jlab = new JLabel("STRING",JLabel.CENTER);
        jlab.setPreferredSize(new Dimension(200,30));
        pan1.add(jlab);

        //empty pan
        JPanel panEmpty = new JPanel();
        panEmpty.setPreferredSize(new Dimension(200,25));
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
        length.setPreferredSize(new Dimension(120,30));
        pan2.add(length, gbc);

        gbc.gridx = 1;
        JTextField lengthTxt = new JTextField("10");
        lengthTxt.setPreferredSize(new Dimension(120,30));
        pan2.add(lengthTxt, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        JLabel countLabel = new JLabel("No. of strings : ", JLabel.RIGHT);
        countLabel.setPreferredSize(new Dimension(120,30));
        pan2.add(countLabel, gbc);

        gbc.gridx = 1;
        JTextField countTxt = new JTextField("1");
        countTxt.setPreferredSize(new Dimension(120,30));
        pan2.add(countTxt, gbc);

        JLabel sepLabel = new JLabel("Strings separated by:",  JLabel.RIGHT);
        JTextField sepTxt = new JTextField("");
        sepLabel.setPreferredSize(new Dimension(180,30));
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

        JLabel order = new JLabel("Order : ", JLabel.RIGHT);
        order.setPreferredSize(new Dimension(60,30));
        JRadioButton inc = new JRadioButton("Increasing");
        JRadioButton dec = new JRadioButton("Decreasing");
        JRadioButton rand = new JRadioButton("Random");
        rand.setSelected(true);
        inc.setPreferredSize(new Dimension(120,30));
        dec.setPreferredSize(new Dimension(120,30));
        rand.setPreferredSize(new Dimension(120,30));
        //inc.setBackground(Color.cyan);
        //dec.setBackground(Color.cyan);
        //rand.setBackground(Color.cyan);
        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(inc);
        bg2.add(dec);
        bg2.add(rand);
        gbc.gridx = 0;
        gbc.gridy = 0;
        pan3.add(order,gbc);
        gbc.gridx = 1;
        pan3.add(inc,gbc);
        gbc.gridx = 2;
        pan3.add(dec,gbc);
        gbc.gridx = 3;
        pan3.add(rand, gbc);

        //panel 4
        JPanel pan4 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 4;
        //pan2.setBackground(Color.cyan);
        jpanArr.add(pan4, gbcJpanArr);


        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel chars = new JLabel("include :", SwingConstants.RIGHT);
        chars.setPreferredSize(new Dimension(120,30));
        pan4.add(chars, gbc);

        JCheckBox a2z  = new JCheckBox("a - z");
        a2z.setPreferredSize(new Dimension(70,30));
        a2z.setSelected(true);
        JCheckBox A2Z = new JCheckBox("A - Z");
        A2Z.setPreferredSize(new Dimension(70,30));
        JCheckBox num = new JCheckBox("0 - 9");
        num.setPreferredSize(new Dimension(70, 30));
        gbc.gridx = 1;
        pan4.add(a2z, gbc);
        gbc.gridx = 2;
        pan4.add(A2Z, gbc);
        gbc.gridx = 3;
        pan4.add(num, gbc);
        JLabel cust = new JLabel("custom : ",SwingConstants.RIGHT);
        JTextField custTxt = new JTextField();
        cust.setPreferredSize(new Dimension(70,30));
        custTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 4;
        pan4.add(cust, gbc);
        gbc.gridx = 5;
        pan4.add(custTxt, gbc);

        //panel5
        JPanel pan5 = new JPanel();
        JButton generate = new JButton("GENERATE");
        generate.setPreferredSize(new Dimension(280,30));
        generate.setBackground(Color.GREEN);


        JMenuBar menuBar = new JMenuBar();
        JMenu more = new JMenu("Advance");

        JCheckBox item2 = new JCheckBox("Random length ");
        JCheckBox item3 = new JCheckBox("Hide length ");
        JCheckBox item4 = new JCheckBox("Distinct chars ");
        JCheckBox item5 = new JCheckBox("Show total test cases");
        more.add(item2);
        more.add(item3);
        more.add(item4);
        more.add(item5);
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
                /*               String str = "length : "+lengthTxt.getText()+"\n";
                str += "Strings Seprated by : "+sepTxt.getText()+"\n";
                str += "increasing : "+inc.isSelected()+"\n";
                str += "decreasing : "+dec.isSelected()+"\n";
                str += "random order: "+rand.isSelected()+"\n";
                str += "a - z : "+a2z.isSelected()+"\n";
                str += "A - Z : "+A2Z.isSelected()+"\n";
                str += "0 - 9 : "+num.isSelected()+"\n";
                str += "custom: "+custTxt.getText()+"\n";
                str += "random length : "+item2.isSelected()+"\n";
                str += "Hide length : "+item3.isSelected()+"\n";
                str += "Distinct chars? : "+item4.isSelected()+"\n";
                arrOutput.setText(str);
*/
                String input[] = {""+A2Z.isSelected(), ""+a2z.isSelected(), ""+num.isSelected(),""+ lengthTxt.getText(), ""+item4.isSelected(),""+ inc.isSelected(), ""+dec.isSelected() ,""+ rand.isSelected(), ""+countTxt.getText() ,""+item5.isSelected() ,""+ sepTxt.getText(),""+ item3.isSelected() ,""+item2.isSelected(), ""+ custTxt.getText() };
               StringGeneration generator = new StringGeneration();
               generator.setOutputTxt(arrOutput);
               generator.generate(input);
            }
        });
    }
}
