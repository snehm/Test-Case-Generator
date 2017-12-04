package Graph;

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

public class CreateGraphGUI {

    GraphGeneration gout = new GraphGeneration();
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


    public CreateGraphGUI(JPanel panelToAdd) {
        jpanArr = new JPanel();
        jpanArr.setLayout(new GridBagLayout());
        GridBagConstraints gbcJpanArr = new GridBagConstraints();
        //jpanArr.setBackground(Color.cyan);

        panelToAdd.add(jpanArr, "Graph");

        //panel1
        JPanel pan1 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 0;
        //pan1.setBackground(Color.green);
        pan1.setPreferredSize(new Dimension(540,30));
        jpanArr.add(pan1,gbcJpanArr);

        JLabel jlab = new JLabel("GRAPH",JLabel.CENTER);
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

        gbc.gridy = 0;
        gbc.gridx = 0;
        JLabel countLabel = new JLabel("No. of vertex : ", JLabel.RIGHT);
        countLabel.setPreferredSize(new Dimension(120,30));
        pan2.add(countLabel, gbc);

        gbc.gridx = 1;
        JTextField countTxt = new JTextField("1");
        countTxt.setPreferredSize(new Dimension(120,30));
        pan2.add(countTxt, gbc);

        JLabel edgeLabel = new JLabel("No. of edges :",  JLabel.RIGHT);
        JTextField edgeTxt = new JTextField("1");
        edgeLabel.setPreferredSize(new Dimension(180,30));
        edgeTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 2;
        pan2.add(edgeLabel, gbc);
        gbc.gridx = 3;
        pan2.add(edgeTxt, gbc);

        JLabel rep = new JLabel("*Repeat : ",JLabel.RIGHT);
        rep.setPreferredSize(new Dimension(120,30));
        JTextField repTxt = new JTextField("1");
        repTxt.setPreferredSize(new Dimension(120,30));
        JLabel repSep = new JLabel("*Repeat Separated by:", JLabel.RIGHT);
        repSep.setPreferredSize(new Dimension(180,30));
        JTextField repSepTxt = new JTextField("");
        repSepTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx=0;
        gbc.gridy=1;
        pan2.add(rep, gbc);
        gbc.gridx = 1;
        pan2.add(repTxt, gbc);
        gbc.gridx = 2;
        pan2.add(repSep, gbc);
        gbc.gridx = 3;
        pan2.add(repSepTxt, gbc);

        JCheckBox weighted = new JCheckBox("weighted graph?");
        weighted.setPreferredSize(new Dimension(200, 30));
        //weighted.setBackground(Color.cyan);
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        pan2.add(weighted, gbc);
        gbc.gridwidth = 1;


        gbc.gridy = 3;
        gbc.gridx = 0;
        JLabel minW = new JLabel("min weigth : ", JLabel.RIGHT);
        minW.setPreferredSize(new Dimension(120,30));
        minW.setVisible(false);
        pan2.add(minW, gbc);

        gbc.gridx = 1;
        JTextField minWTxt = new JTextField("1");
        minWTxt.setPreferredSize(new Dimension(120,30));
        minWTxt.setVisible(false);
        pan2.add(minWTxt, gbc);


        gbc.gridx = 2;
        JLabel maxW = new JLabel("max weight :",  JLabel.RIGHT);
        JTextField maxWTxt = new JTextField("1");
        maxW.setPreferredSize(new Dimension(180,30));
        maxWTxt.setPreferredSize(new Dimension(120,30));
        maxW.setVisible(false);
        maxWTxt.setVisible(false);
        pan2.add(maxW, gbc);
        gbc.gridx = 3;
        pan2.add(maxWTxt, gbc);


        weighted.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                JCheckBox chk = (JCheckBox)ie.getItem();
                if(chk.isSelected())
                {
                    minW.setVisible(true);
                    minWTxt.setVisible(true);
                    maxW.setVisible(true);
                    maxWTxt.setVisible(true);
                }
                else
                {
                    minW.setVisible(false);
                    minWTxt.setVisible(false);
                    maxW.setVisible(false);
                    maxWTxt.setVisible(false);
                }
            }
        });

        //panel3
        JPanel pan3 = new JPanel();
        pan3.setLayout(new GridBagLayout());
        //pan3.setBackground(Color.cyan);
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 3;
        jpanArr.add(pan3, gbcJpanArr);

        JCheckBox selfLoop = new JCheckBox("Self loop");
        selfLoop.setPreferredSize(new Dimension(120,30));
        //selfLoop.setBackground(Color.cyan);
        JCheckBox cycle = new JCheckBox("Cycles");
        cycle.setPreferredSize(new Dimension(100,30));
        //cycle.setBackground(Color.cyan);
        cycle.setSelected(true);

        selfLoop.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(selfLoop.isSelected())
                    cycle.setSelected(true);
            }
        });

        JCheckBox multiEdges = new JCheckBox("Multiple edge");
        multiEdges.setPreferredSize(new Dimension(130,30));
        //multiEdges.setBackground(Color.cyan);
        JCheckBox directed = new JCheckBox("Directed graph");
        directed.setPreferredSize(new Dimension(150,30));
        //directed.setBackground(Color.cyan);
        gbc.gridx = 0;
        gbc.gridy = 0;
        pan3.add(multiEdges);
        gbc.gridx = 2;
        pan3.add(selfLoop);
        gbc.gridx = 1;
        pan3.add(cycle);
        gbc.gridx = 3;
        pan3.add(directed);

        //panel4
        JPanel pan4 = new JPanel();
        JButton generate = new JButton("GENERATE");
        generate.setPreferredSize(new Dimension(280,30));
        generate.setBackground(Color.GREEN);

        /*
        JMenuBar menuBar = new JMenuBar();
        JMenu more = new JMenu("Advance");
        JCheckBox item1 = new JCheckBox("Hide Total count ");
        JCheckBox item2 = new JCheckBox("Show  Total cases ");
        JCheckBox item3 = new JCheckBox("Make Total count random ");
        more.add(item1);
        more.add(item3);
        more.add(item2);

        menuBar.add(more);
        menuBar.setPreferredSize(new Dimension(80,30));

        pan4.add(menuBar);
        */

        pan4.add(generate);
        gbcJpanArr.gridy = 4;
        jpanArr.add(pan4, gbcJpanArr);

        //panel5
        JPanel pan5 = new JPanel();
        //pan5.setBackground(Color.BLACK);
        pan5.setPreferredSize(new Dimension(560,300));
        gbcJpanArr.gridy = 5;
        jpanArr.add(pan5,gbcJpanArr);

        arrOutput = new JTextArea();
        gout.setOutputTxt(arrOutput);
        arrOutput.setText("");
        JScrollPane jsp = new JScrollPane(arrOutput);
        jsp.setPreferredSize(new Dimension(560,300));
        pan5.add(jsp);

        //generate actionListener
        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String s[] = {countTxt.getText(), edgeTxt.getText(), repTxt.getText(), repSepTxt.getText(), ""+weighted.isSelected(), minWTxt.getText(), maxWTxt.getText(), ""+multiEdges.isSelected(), ""+selfLoop.isSelected(), ""+cycle.isSelected(), ""+directed.isSelected()};

                gout.generate(s);

                /*  ******************Debug******************
                 *  String str = "Total : "+countTxt.getText()+"\n";
                 *   str += "Output separated by : "+edgeTxt.getText()+"\n";
                 *   str += "weighted : "+weighted.isSelected()+"\n";
                 *   str += "min w: "+minWTxt.getText()+"\n";
                 *   str += "max w: "+maxWTxt.getText()+"\n";
                 *   str += "repeat : "+repTxt.getText()+"\n";
                 *   str += "repeat separated by : "+repSepTxt.getText()+"\n";
                 *   str += "self loop : "+selfLoop.isSelected()+"\n";
                 *   str += "cycle : "+cycle.isSelected()+"\n";
                 *   str += "multiEdge : "+multiEdges.isSelected()+"\n";
                 *   arrOutput.setText(str);
                 */
            }
        });
    }
}
