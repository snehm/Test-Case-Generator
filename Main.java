//test case generator main menu: start page

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.*;

class MainFrame
{
    JFrame jfrm;
    JPanel cards; //Array, Matrix, Graph, String -> as cards

    public MainFrame()
    {
        jfrm = new JFrame("Test case generator");
        jfrm.setSize(610,630);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        jfrm.setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(5,5));
        //mainPanel.setBackground(Color.BLACK);
        mainPanel.setBorder(new EmptyBorder(10,10,10,10));
        jfrm.add(mainPanel);

        makeMenu(mainPanel);


        cards = new JPanel();
        cards.setLayout(new CardLayout());
        cards.setBackground(Color.cyan);
        mainPanel.add(cards);

        setArrPanel(cards);
        setMatPanel(cards);
        setGraphPanel(cards);
        setStrPanel(cards);
    }

    void makeMenu(JPanel panelToAdd)
    {
        JPanel menu = new JPanel();
        menu.setBackground(Color.cyan);
        menu.setPreferredSize(new Dimension(600,50));
        panelToAdd.add(menu,BorderLayout.PAGE_START);


        menu.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;


        JButton arr = new JButton("Arrays");
        arr.setPreferredSize(new Dimension(120,30));
        arr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                    CardLayout cl = (CardLayout)cards.getLayout(); //card layout
                    cl.show(cards,"Array");
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 0;
        menu.add(arr,gbc);


        JButton mat = new JButton("Matrix");
        mat.setPreferredSize(new Dimension(120,30));
        mat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                CardLayout cl = (CardLayout)cards.getLayout(); //card layout
                cl.show(cards,"Matrix");
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 0;
        menu.add(mat, gbc);


        JButton graph = new JButton("Graph");
        graph.setPreferredSize(new Dimension(120,30));
        graph.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CardLayout cl = (CardLayout)cards.getLayout(); //card layout
                cl.show(cards,"Graph");
            }
        });
        gbc.gridx = 2;
        gbc.gridy = 0;
        menu.add(graph, gbc);

        JButton str = new JButton("String");
        str.setPreferredSize(new Dimension(120,30));
        str.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CardLayout cl = (CardLayout)cards.getLayout(); //card layout
                cl.show(cards,"String");
            }
        });
        gbc.gridx = 3;
        gbc.gridy = 0;
        menu.add(str, gbc);

    }

    void setArrPanel(JPanel panelToAdd)
    {

        JPanel jpanArr = new JPanel();
        jpanArr.setLayout(new GridBagLayout());
        GridBagConstraints gbcJpanArr = new GridBagConstraints();
        jpanArr.setBackground(Color.cyan);

        panelToAdd.add(jpanArr, "Array");

        //panel1
        JPanel pan1 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 0;
        pan1.setBackground(Color.green);
        pan1.setPreferredSize(new Dimension(540,30));
        jpanArr.add(pan1,gbcJpanArr);

        JLabel jlab = new JLabel("Array",JLabel.CENTER);
        jlab.setPreferredSize(new Dimension(200,30));
        pan1.add(jlab);

        //empty pan
        JPanel panEmpty = new JPanel();
        panEmpty.setPreferredSize(new Dimension(200,5));
        panEmpty.setBackground(Color.RED);
        gbcJpanArr.gridy = 1;
        jpanArr.add(panEmpty,gbcJpanArr);

        //panel 2
        JPanel pan2 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 2;
        pan2.setBackground(Color.cyan);
        jpanArr.add(pan2, gbcJpanArr);

        pan2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel countLabel = new JLabel("Total count : ", JLabel.RIGHT);
        countLabel.setPreferredSize(new Dimension(120,30));
        pan2.add(countLabel, gbc);

        gbc.gridx = 1;
        JTextField countTxt = new JTextField("1");
        countTxt.setPreferredSize(new Dimension(120,30));
        pan2.add(countTxt, gbc);

        JLabel sepLabel = new JLabel("Output separated by:",  JLabel.RIGHT);
        JTextField sepTxt = new JTextField(" ");
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


        JTextField minTxt = new JTextField("0");
        minTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 1;
        gbc.gridy = 1;
        pan2.add(minTxt, gbc);


        JLabel maxLabel = new JLabel("Max : ",  JLabel.RIGHT);
        maxLabel.setPreferredSize(new Dimension(180,30));
        gbc.gridx = 2;
        gbc.gridy = 1;
        pan2.add(maxLabel, gbc);


        JTextField maxTxt = new JTextField("100");
        maxTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 3;
        gbc.gridy = 1;
        pan2.add(maxTxt, gbc);

        JLabel rep = new JLabel("*Repeat : ",JLabel.RIGHT);
        rep.setPreferredSize(new Dimension(120,30));
        JTextField repTxt = new JTextField("1");
        repTxt.setPreferredSize(new Dimension(120,30));
        JLabel repSep = new JLabel("*Repeat Seprated by:", JLabel.RIGHT);
        repSep.setPreferredSize(new Dimension(180,30));
        JTextField repSepTxt = new JTextField("\\n");
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
        pan3.setBackground(Color.cyan);
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 3;
        jpanArr.add(pan3, gbcJpanArr);

        JRadioButton OOnly = new JRadioButton("ODD ONLY");
        OOnly.setPreferredSize(new Dimension(120,30));
        OOnly.setBackground(Color.cyan);
        JRadioButton EOnly = new JRadioButton("EVEN ONLY");
        EOnly.setPreferredSize(new Dimension(120,30));
        EOnly.setBackground(Color.cyan);
        JRadioButton Any = new JRadioButton("ANY");
        Any.setPreferredSize(new Dimension(70,30));
        Any.setBackground(Color.cyan);
        Any.setSelected(true);
        JRadioButton POnly = new JRadioButton("PRIME ONLY");
        POnly.setPreferredSize(new Dimension(120,30));
        POnly.setBackground(Color.cyan);
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
        JRadioButton inc = new JRadioButton("Increasing");
        JRadioButton dec = new JRadioButton("Decreasing");
        JRadioButton rand = new JRadioButton("Random");
        rand.setSelected(true);
        inc.setPreferredSize(new Dimension(120,30));
        dec.setPreferredSize(new Dimension(120,30));
        rand.setPreferredSize(new Dimension(120,30));
        inc.setBackground(Color.cyan);
        dec.setBackground(Color.cyan);
        rand.setBackground(Color.cyan);
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
        JCheckBox item1 = new JCheckBox("Hide Total count ");
        JCheckBox item2 = new JCheckBox("Show  Total cases ");
        JCheckBox item3 = new JCheckBox("Make Total count random ");
        more.add(item1);
        more.add(item3);
        more.add(item2);
        menuBar.add(more);
        menuBar.setPreferredSize(new Dimension(80,30));

        pan4.add(menuBar);
        pan4.add(generate);
        gbcJpanArr.gridy = 4;
        jpanArr.add(pan4, gbcJpanArr);

        //panel5
        JPanel pan5 = new JPanel();
        pan5.setBackground(Color.BLACK);
        pan5.setPreferredSize(new Dimension(560,300));
        gbcJpanArr.gridy = 5;
        jpanArr.add(pan5,gbcJpanArr);

        JTextArea arrOutput = new JTextArea();
        arrOutput.setText("");
        JScrollPane jsp = new JScrollPane(arrOutput);
        jsp.setPreferredSize(new Dimension(560,300));
        pan5.add(jsp);

        //generate actionListener
        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
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
            }
        });
    }

    void setGraphPanel(JPanel panelToAdd)
    {
        JPanel jpanArr = new JPanel();
        jpanArr.setLayout(new GridBagLayout());
        GridBagConstraints gbcJpanArr = new GridBagConstraints();
        jpanArr.setBackground(Color.cyan);

        panelToAdd.add(jpanArr, "Graph");

        //panel1
        JPanel pan1 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 0;
        pan1.setBackground(Color.green);
        pan1.setPreferredSize(new Dimension(540,30));
        jpanArr.add(pan1,gbcJpanArr);

        JLabel jlab = new JLabel("Graph",JLabel.CENTER);
        jlab.setPreferredSize(new Dimension(200,30));
        pan1.add(jlab);

        //empty pan
        JPanel panEmpty = new JPanel();
        panEmpty.setPreferredSize(new Dimension(200,5));
        panEmpty.setBackground(Color.RED);
        gbcJpanArr.gridy = 1;
        jpanArr.add(panEmpty,gbcJpanArr);


        //panel 2
        JPanel pan2 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 2;
        pan2.setBackground(Color.cyan);
        jpanArr.add(pan2, gbcJpanArr);

        pan2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        JLabel countLabel = new JLabel("No. of vertex : ", JLabel.RIGHT);
        countLabel.setPreferredSize(new Dimension(120,30));
        pan2.add(countLabel, gbc);

        gbc.gridx = 1;
        JTextField countTxt = new JTextField("1");
        countTxt.setPreferredSize(new Dimension(120,30));
        pan2.add(countTxt, gbc);

        JLabel sepLabel = new JLabel("No. of edges :",  JLabel.RIGHT);
        JTextField sepTxt = new JTextField(" ");
        sepLabel.setPreferredSize(new Dimension(180,30));
        sepTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 2;
        pan2.add(sepLabel, gbc);
        gbc.gridx = 3;
        pan2.add(sepTxt, gbc);

        JLabel rep = new JLabel("*Repeat : ",JLabel.RIGHT);
        rep.setPreferredSize(new Dimension(120,30));
        JTextField repTxt = new JTextField("1");
        repTxt.setPreferredSize(new Dimension(120,30));
        JLabel repSep = new JLabel("*Repeat Seprated by:", JLabel.RIGHT);
        repSep.setPreferredSize(new Dimension(180,30));
        JTextField repSepTxt = new JTextField("\\n");
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
        weighted.setBackground(Color.cyan);
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
        JTextField maxWTxt = new JTextField(" ");
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
        pan3.setBackground(Color.cyan);
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 3;
        jpanArr.add(pan3, gbcJpanArr);

        JCheckBox selfLoop = new JCheckBox("Self loop");
        selfLoop.setPreferredSize(new Dimension(120,30));
        selfLoop.setBackground(Color.cyan);
        JCheckBox cycle = new JCheckBox("Cycles");
        cycle.setPreferredSize(new Dimension(100,30));
        cycle.setBackground(Color.cyan);
        cycle.setSelected(true);
        JCheckBox multiEdges = new JCheckBox("Multiple edge");
        multiEdges.setPreferredSize(new Dimension(130,30));
        multiEdges.setBackground(Color.cyan);
        JCheckBox directed = new JCheckBox("Directed graph");
        directed.setPreferredSize(new Dimension(150,30));
        directed.setBackground(Color.cyan);
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
        pan5.setBackground(Color.BLACK);
        pan5.setPreferredSize(new Dimension(560,300));
        gbcJpanArr.gridy = 5;
        jpanArr.add(pan5,gbcJpanArr);

        JTextArea arrOutput = new JTextArea();
        arrOutput.setText("");
        JScrollPane jsp = new JScrollPane(arrOutput);
        jsp.setPreferredSize(new Dimension(560,300));
        pan5.add(jsp);

        //generate actionListener
        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String str = "Total : "+countTxt.getText()+"\n";
                str += "Output Seprated by : "+sepTxt.getText()+"\n";
              //str += "min : "+minTxt.getText()+"\n";
              //str += "max : "+maxTxt.getText()+"\n";
                str += "repeat : "+repTxt.getText()+"\n";
                str += "repeat separated by : "+repSepTxt.getText()+"\n";
                str += "Odd only : "+selfLoop.isSelected()+"\n";
                str += "even only : "+cycle.isSelected()+"\n";
                str += "Any : "+multiEdges.isSelected()+"\n";
                arrOutput.setText(str);
            }
        });

    }

    void setMatPanel(JPanel panelToAdd)
    {
        JPanel jpanArr = new JPanel();
        jpanArr.setLayout(new GridBagLayout());
        GridBagConstraints gbcJpanArr = new GridBagConstraints();
        jpanArr.setBackground(Color.cyan);

        panelToAdd.add(jpanArr, "Matrix");

        //panel1
        JPanel pan1 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 0;
        pan1.setBackground(Color.green);
        pan1.setPreferredSize(new Dimension(540,30));
        jpanArr.add(pan1,gbcJpanArr);

        JLabel jlab = new JLabel("Matrix",JLabel.CENTER);
        jlab.setPreferredSize(new Dimension(200,30));
        pan1.add(jlab);

        //empty pan
        JPanel panEmpty = new JPanel();
        panEmpty.setPreferredSize(new Dimension(200,5));
        panEmpty.setBackground(Color.RED);
        gbcJpanArr.gridy = 1;
        jpanArr.add(panEmpty,gbcJpanArr);

        //panel 2
        JPanel pan2 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 2;
        pan2.setBackground(Color.cyan);
        jpanArr.add(pan2, gbcJpanArr);

        pan2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel countLabel = new JLabel("No. of rows : ", JLabel.RIGHT);
        countLabel.setPreferredSize(new Dimension(120,30));
        pan2.add(countLabel, gbc);

        gbc.gridx = 1;
        JTextField countTxt = new JTextField("1");
        countTxt.setPreferredSize(new Dimension(120,30));
        pan2.add(countTxt, gbc);

        JLabel sepLabel = new JLabel("No. of columns :",  JLabel.RIGHT);
        JTextField sepTxt = new JTextField("1");
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


        JTextField minTxt = new JTextField("0");
        minTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 1;
        gbc.gridy = 1;
        pan2.add(minTxt, gbc);


        JLabel maxLabel = new JLabel("Max : ",  JLabel.RIGHT);
        maxLabel.setPreferredSize(new Dimension(180,30));
        gbc.gridx = 2;
        gbc.gridy = 1;
        pan2.add(maxLabel, gbc);


        JTextField maxTxt = new JTextField("100");
        maxTxt.setPreferredSize(new Dimension(120,30));
        gbc.gridx = 3;
        gbc.gridy = 1;
        pan2.add(maxTxt, gbc);

        JLabel rep = new JLabel("*Repeat : ",JLabel.RIGHT);
        rep.setPreferredSize(new Dimension(120,30));
        JTextField repTxt = new JTextField("1");
        repTxt.setPreferredSize(new Dimension(120,30));
        JLabel repSep = new JLabel("*Repeat Seprated by:", JLabel.RIGHT);
        repSep.setPreferredSize(new Dimension(180,30));
        JTextField repSepTxt = new JTextField("\\n");
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
        pan3.setBackground(Color.cyan);
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 3;
        jpanArr.add(pan3, gbcJpanArr);

        JRadioButton OOnly = new JRadioButton("ODD ONLY");
        OOnly.setPreferredSize(new Dimension(120,30));
        OOnly.setBackground(Color.cyan);
        JRadioButton EOnly = new JRadioButton("EVEN ONLY");
        EOnly.setPreferredSize(new Dimension(120,30));
        EOnly.setBackground(Color.cyan);
        JRadioButton Any = new JRadioButton("ANY");
        Any.setPreferredSize(new Dimension(70,30));
        Any.setBackground(Color.cyan);
        Any.setSelected(true);
        JRadioButton POnly = new JRadioButton("PRIME ONLY");
        POnly.setPreferredSize(new Dimension(120,30));
        POnly.setBackground(Color.cyan);
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
        JRadioButton inc = new JRadioButton("Increasing");
        JRadioButton dec = new JRadioButton("Decreasing");
        JRadioButton rand = new JRadioButton("Random");
        rand.setSelected(true);
        inc.setPreferredSize(new Dimension(120,30));
        dec.setPreferredSize(new Dimension(120,30));
        rand.setPreferredSize(new Dimension(120,30));
        inc.setBackground(Color.cyan);
        dec.setBackground(Color.cyan);
        rand.setBackground(Color.cyan);
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
        JCheckBox item1 = new JCheckBox("Hide N and M ");
        JCheckBox item2 = new JCheckBox("Show  Total cases ");
        JCheckBox item3 = new JCheckBox("Column Major ");
        more.add(item1);
        more.add(item3);
        more.add(item2);
        menuBar.add(more);
        menuBar.setPreferredSize(new Dimension(80,30));

        pan4.add(menuBar);
        pan4.add(generate);
        gbcJpanArr.gridy = 4;
        jpanArr.add(pan4, gbcJpanArr);

        //panel5
        JPanel pan5 = new JPanel();
        pan5.setBackground(Color.BLACK);
        pan5.setPreferredSize(new Dimension(560,300));
        gbcJpanArr.gridy = 5;
        jpanArr.add(pan5,gbcJpanArr);

        JTextArea arrOutput = new JTextArea();
        arrOutput.setText("");
        JScrollPane jsp = new JScrollPane(arrOutput);
        jsp.setPreferredSize(new Dimension(560,300));
        pan5.add(jsp);

        //generate actionListener
        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
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
            }
        });
    }

    void setStrPanel(JPanel panelToAdd)
    {
        JPanel jpanArr = new JPanel();
        jpanArr.setLayout(new GridBagLayout());
        GridBagConstraints gbcJpanArr = new GridBagConstraints();
        jpanArr.setBackground(Color.cyan);

        panelToAdd.add(jpanArr, "String");

        //panel1
        JPanel pan1 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 0;
        pan1.setBackground(Color.green);
        pan1.setPreferredSize(new Dimension(540,30));
        jpanArr.add(pan1,gbcJpanArr);

        JLabel jlab = new JLabel("String",JLabel.CENTER);
        jlab.setPreferredSize(new Dimension(200,30));
        pan1.add(jlab);

        //empty pan
        JPanel panEmpty = new JPanel();
        panEmpty.setPreferredSize(new Dimension(200,5));
        panEmpty.setBackground(Color.RED);
        gbcJpanArr.gridy = 1;
        jpanArr.add(panEmpty,gbcJpanArr);

        //panel 2
        JPanel pan2 = new JPanel();
        gbcJpanArr.gridx = 0;
        gbcJpanArr.gridy = 2;
        pan2.setBackground(Color.cyan);
        jpanArr.add(pan2, gbcJpanArr);

        pan2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

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
        JTextField sepTxt = new JTextField(" ");
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
        pan3.setBackground(Color.cyan);
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
        inc.setBackground(Color.cyan);
        dec.setBackground(Color.cyan);
        rand.setBackground(Color.cyan);
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
        pan2.setBackground(Color.cyan);
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

        JCheckBox item1 = new JCheckBox("Palindrome strings");
        JCheckBox item2 = new JCheckBox("Random length ");
        JCheckBox item3 = new JCheckBox("Hide length ");
        JCheckBox item4 = new JCheckBox("Distinct chars ");
        more.add(item1);
        more.add(item2);
        more.add(item3);
        more.add(item4);
        menuBar.add(more);
        menuBar.setPreferredSize(new Dimension(80,30));

        pan5.add(menuBar);
        pan5.add(generate);
        gbcJpanArr.gridy = 5;
        jpanArr.add(pan5, gbcJpanArr);

        //panel6
        JPanel pan6 = new JPanel();
        pan6.setBackground(Color.BLACK);
        pan6.setPreferredSize(new Dimension(560,300));
        gbcJpanArr.gridy = 6;
        jpanArr.add(pan6,gbcJpanArr);

        JTextArea arrOutput = new JTextArea();
        arrOutput.setText("");
        JScrollPane jsp = new JScrollPane(arrOutput);
        jsp.setPreferredSize(new Dimension(560,300));
        pan6.add(jsp);

        //generate actionListener
        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String str = "length : "+lengthTxt.getText()+"\n";
                str += "Strings Seprated by : "+sepTxt.getText()+"\n";
                str += "a - z : "+a2z.isSelected()+"\n";
                str += "A - Z : "+A2Z.isSelected()+"\n";
                str += "0 - 9 : "+num.isSelected()+"\n";
                str += "custom: "+custTxt.getText()+"\n";
                arrOutput.setText(str);
            }
        });
    }

    /*
    void setWelcomePanel()
    {
        welcomePanel = new JPanel();
        welcomePanel.setAlignmentX(panelX);
        welcomePanel.setAlignmentY(panelY);
        welcomePanel.setVisible(true);
        mainPanel.add(welcomePanel);

        JLabel jlab = new JLabel("Welcome, This is test case generation application program.");
        welcomePanel.add(jlab);
    }
    */

}

public class Main {
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
