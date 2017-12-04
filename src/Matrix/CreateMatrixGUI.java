package Matrix;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CreateMatrixGUI {

    JPanel jpanArr = null;
    JTextArea matOut = null;
    MatrixGeneration generateMatrix;

    public boolean isVisible()
    {
        return jpanArr.isVisible();
    }

    public boolean save()
    {
        try {
            PrintWriter file = new PrintWriter(new FileWriter("input.txt"));
            file.print(matOut.getText());
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
        clpbrd.setContents(new StringSelection(matOut.getText()), null);
    }


    public CreateMatrixGUI(JPanel panelToAdd)
    {
        generateMatrix = new MatrixGeneration();

        jpanArr = new JPanel();
        jpanArr.setLayout(new GridBagLayout());
        GridBagConstraints gbcJpanArr = new GridBagConstraints();
        //jpanArr.setBackground(Color.cyan);

        panelToAdd.add(jpanArr, "Matrix");

        //panel1
        JPanel pan1 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 0;
        //pan1.setBackground(Color.green);
        pan1.setPreferredSize(new Dimension(540,30));
        jpanArr.add(pan1,gbcJpanArr);

        JLabel jlab = new JLabel("MATRIX",JLabel.CENTER);
        jlab.setPreferredSize(new Dimension(200,30));
        pan1.add(jlab);

        //empty pan
        JPanel panEmpty = new JPanel();
        panEmpty.setPreferredSize(new Dimension(200,5));
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

        JLabel countLabel = new JLabel("No. of rows : ", JLabel.RIGHT);
        countLabel.setPreferredSize(new Dimension(120,30));
        pan2.add(countLabel, gbc);

        gbc.gridx = 1;
        final JTextField countTxt = new JTextField("1");
        countTxt.setPreferredSize(new Dimension(120,30));
        pan2.add(countTxt, gbc);

        JLabel sepLabel = new JLabel("No. of columns :",  JLabel.RIGHT);
        final JTextField sepTxt = new JTextField("1");
        sepLabel.setPreferredSize(new Dimension(180,30));
        sepTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 2;
        gbc.gridwidth = 1;
        pan2.add(sepLabel, gbc);
        gbc.gridx = 3;
        pan2.add(sepTxt, gbc);
        gbc.gridwidth =1;

        JLabel minLabel = new JLabel("Min : ", JLabel.RIGHT);
        minLabel.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 0;
        gbc.gridy = 1;
        pan2.add(minLabel, gbc);


        final JTextField minTxt = new JTextField("0");
        minTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 1;
        gbc.gridy = 1;
        pan2.add(minTxt, gbc);


        JLabel maxLabel = new JLabel("Max : ",  JLabel.RIGHT);
        maxLabel.setPreferredSize(new Dimension(180,30));
        gbc.gridx = 2;
        gbc.gridy = 1;
        pan2.add(maxLabel, gbc);


        final JTextField maxTxt = new JTextField("100");
        maxTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 3;
        gbc.gridy = 1;
        pan2.add(maxTxt, gbc);

        JLabel rep = new JLabel("*Repeat : ",JLabel.RIGHT);
        rep.setPreferredSize(new Dimension(120,30));
        final JTextField repTxt = new JTextField("1");
        repTxt.setPreferredSize(new Dimension(120,30));
        JLabel repSep = new JLabel("*Repeat Seprated by:", JLabel.RIGHT);
        repSep.setPreferredSize(new Dimension(180,30));
        final JTextField repSepTxt = new JTextField("\\n");
        repSepTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx=0;
        gbc.gridy=2;
        pan2.add(rep, gbc);
        gbc.gridx = 1;
        pan2.add(repTxt, gbc);
        gbc.gridx = 2;
        pan2.add(repSep, gbc);
        gbc.gridx = 3;
        pan2.add(repSepTxt, gbc);

        //panel3
        JPanel pan3 = new JPanel();
        pan3.setLayout(new GridBagLayout());
        //pan3.setBackground(Color.cyan);
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 3;
        jpanArr.add(pan3, gbcJpanArr);

        final JRadioButton OOnly = new JRadioButton("ODD ONLY");
        OOnly.setPreferredSize(new Dimension(120,30));
        //OOnly.setBackground(Color.cyan);
        final JRadioButton EOnly = new JRadioButton("EVEN ONLY");
        EOnly.setPreferredSize(new Dimension(120,30));
        //EOnly.setBackground(Color.cyan);
        final JRadioButton Any = new JRadioButton("ANY");
        Any.setPreferredSize(new Dimension(70,30));
        //Any.setBackground(Color.cyan);
        Any.setSelected(true);
        final JRadioButton POnly = new JRadioButton("PRIME ONLY");
        POnly.setPreferredSize(new Dimension(120,30));
        //POnly.setBackground(Color.cyan);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(Any);
        bg1.add(POnly);
        bg1.add(OOnly);
        bg1.add(EOnly);
        gbc.gridx = 0;
        gbc.gridy = 0;
        pan3.add(Any);
        gbc.gridx = 1;
        pan3.add(POnly);
        gbc.gridx = 2;
        pan3.add(OOnly);
        gbc.gridx = 3;
        pan3.add(EOnly);


        JLabel order = new JLabel("Order : ", JLabel.RIGHT);
        order.setPreferredSize(new Dimension(70,30));
        final JRadioButton inc = new JRadioButton("Increasing");
        final JRadioButton dec = new JRadioButton("Decreasing");
        final JRadioButton rand = new JRadioButton("Random");
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
        gbc.gridy = 1;
        pan3.add(order,gbc);
        gbc.gridx = 1;
        pan3.add(inc,gbc);
        gbc.gridx = 2;
        pan3.add(dec,gbc);
        gbc.gridx = 3;
        pan3.add(rand, gbc);

        //panel4
        JPanel pan4 = new JPanel();
        JButton generate = new JButton("GENERATE");
        generate.setPreferredSize(new Dimension(280,30));
        generate.setBackground(Color.GREEN);

        JMenuBar menuBar = new JMenuBar();
        JMenu more = new JMenu("Advance");
        final JCheckBox item1 = new JCheckBox("Hide N and M ");
        final JCheckBox item2 = new JCheckBox("Show  Total cases ");
        final JCheckBox item3 = new JCheckBox("Column Major ");
        final JCheckBox item4 = new JCheckBox("Distinct ");
        final JCheckBox item5 = new JCheckBox("Negative ");
        more.add(item1);
        more.add(item3);
        more.add(item2);
        more.add(item4);
        more.add(item5);
        menuBar.add(more);
        menuBar.setPreferredSize(new Dimension(80,30));

        pan4.add(menuBar);
        pan4.add(generate);
        gbcJpanArr.gridy = 4;
        jpanArr.add(pan4, gbcJpanArr);

        //panel5
        JPanel pan5 = new JPanel();
        //pan5.setBackground(Color.BLACK);
        pan5.setPreferredSize(new Dimension(560,300));
        gbcJpanArr.gridy = 5;
        jpanArr.add(pan5,gbcJpanArr);

        matOut = new JTextArea();
        JScrollPane jsp = new JScrollPane(matOut);
        jsp.setPreferredSize(new Dimension(560,300));
        pan5.add(jsp);

        //generate actionListener
        generate.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent actionEvent) {

                generateMatrix.setOutputTxt(matOut);
                String input[] = {""+countTxt.getText(),""+ sepTxt.getText(),""+ minTxt.getText(), ""+maxTxt.getText(), ""+repTxt.getText(), ""+repSepTxt.getText(), ""+OOnly.isSelected(), ""+EOnly.isSelected(), ""+Any.isSelected(), ""+POnly.isSelected(), ""+inc.isSelected(), ""+dec.isSelected(), ""+rand.isSelected(), ""+item1.isSelected(), ""+item2.isSelected(), ""+item5.isSelected(), ""+item4.isSelected(), ""+item3.isSelected()};
                MatrixGeneration.generate(input);


/*					*****************Debug************
                String str = "Total : "+countTxt.getText()+"\n";
                str += "Output Seprated by : "+sepTxt.getText()+"\n";
                str += "min : "+minTxt.getText()+"\n";
                str += "max : "+maxTxt.getText()+"\n";
                str += "repeat : "+repTxt.getText()+"\n";
                str += "repeat separated by : "+repSepTxt.getText()+"\n";
                str += "Odd only : "+OOnly.isSelected()+"\n";
                str += "even only : "+EOnly.isSelected()+"\n";
                str += "Any : "+Any.isSelected()+"\n";
                str += "Prime only : "+POnly.isSelected()+"\n";
                str += "increasing : "+inc.isSelected()+"\n";
                str += "decreasing : "+dec.isSelected()+"\n";
                str += "random : "+rand.isSelected()+"\n";
                str += "Hide total count : "+item1.isSelected()+"\n";
                str += "Show total cases : "+item2.isSelected()+"\n";
                str += "make total count random : "+item3.isSelected()+"\n";
                arrOutput.setText(str);
*/
            }
        });
    }
}