//test case generator main menu: start page

import Array.CreateArrayGUI;
import Graph.CreateGraphGUI;
import Matrix.CreateMatrixGUI;
import String.CreateStringGUI;
import Palindrome.CreatePalindromeGUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

class MainFrame
{
    JFrame jfrm;
    JPanel cards; //Array, Matrix, Graph, String -> as cards
    JLabel alertLabel = null;

    CreateArrayGUI arrayControl = null;
    CreateStringGUI stringControl = null;
    CreateGraphGUI graphControl = null;
    CreateMatrixGUI matrixControl = null;
    CreatePalindromeGUI palindromeControl = null;

    public MainFrame()
    {
        jfrm = new JFrame("Test case generator");
        jfrm.setSize(610,710);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        jfrm.setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(2,2));
        mainPanel.setBackground(Color.BLACK);
        mainPanel.setBorder(new EmptyBorder(4,4,4,4));
        jfrm.add(mainPanel);

        makeMenu(mainPanel);


        cards = new JPanel();
        cards.setLayout(new CardLayout());
        //cards.setBackground(Color.BLACK);

        arrayControl = new CreateArrayGUI(cards);
        matrixControl = new CreateMatrixGUI(cards);
        graphControl = new CreateGraphGUI(cards);
        stringControl = new CreateStringGUI(cards);
        palindromeControl = new CreatePalindromeGUI(cards);
        mainPanel.add(cards);

        makeBottomMenu(mainPanel);


        //set Font for all components
        setMyfont();
    }

    void setMyfont()
    {
        for(Component c : jfrm.getComponents())
        {
            c.setFont(new Font("SansSerif", Font.BOLD, 12));
            setMyfont((JComponent)c);
        }
    }
    void setMyfont(JComponent x)
    {

        for(Component c : x.getComponents())
        {
            c.setFont(new Font("SansSerif", Font.BOLD, 12));
            setMyfont((JComponent)c);
        }
    }

    void makeMenu(JPanel panelToAdd)
    {
        JPanel menu = new JPanel();
        //menu.setBackground(Color.cyan);
        menu.setBorder(BorderFactory.createLineBorder(Color.decode("#DCDCDC")));
        menu.setPreferredSize(new Dimension(600,50));
        panelToAdd.add(menu,BorderLayout.PAGE_START);


        menu.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;


        JButton arr = new JButton("Arrays");
        arr.setPreferredSize(new Dimension(100,30));
        arr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                    alertLabel.setText("Test case generation tool");
                    CardLayout cl = (CardLayout)cards.getLayout(); //card layout
                    cl.show(cards,"Array");
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 0;
        menu.add(arr,gbc);


        JButton mat = new JButton("Matrix");
        mat.setPreferredSize(new Dimension(100,30));
        mat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                alertLabel.setText("Test case generation tool");
                CardLayout cl = (CardLayout)cards.getLayout(); //card layout
                cl.show(cards,"Matrix");
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 0;
        menu.add(mat, gbc);


        JButton graph = new JButton("Graph");
        graph.setPreferredSize(new Dimension(100,30));
        graph.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                alertLabel.setText("Test case generation tool");
                CardLayout cl = (CardLayout)cards.getLayout(); //card layout
                cl.show(cards,"Graph");
            }
        });
        gbc.gridx = 2;
        gbc.gridy = 0;
        menu.add(graph, gbc);

        JButton str = new JButton("String");
        str.setPreferredSize(new Dimension(100,30));
        str.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                alertLabel.setText("Test case generation tool");
                CardLayout cl = (CardLayout)cards.getLayout(); //card layout
                cl.show(cards,"String");
            }
        });
        gbc.gridx = 3;
        gbc.gridy = 0;
        menu.add(str, gbc);

        JButton palin = new JButton("Palindrome");
        palin.setPreferredSize(new Dimension(120,30));
        palin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                alertLabel.setText("Test case generation tool");
                CardLayout cl = (CardLayout)cards.getLayout(); //card layout
                cl.show(cards,"Palindrome");
            }
        });
        gbc.gridx = 4;
        gbc.gridy = 0;
        menu.add(palin, gbc);


    }

    void makeBottomMenu(JPanel panelToAdd)
    {
        JPanel bottom = new JPanel();
        bottom.setBorder(BorderFactory.createLineBorder(Color.decode("#DCDCDC")));
        //bottom.setBackground(Color.PINK);
        bottom.setPreferredSize(new Dimension(600,40));
        panelToAdd.add(bottom, BorderLayout.PAGE_END);

        bottom.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //JLabel alertLabel = new JLabel("                                  Test case generation tool       ");
        alertLabel = new JLabel("Test case generation tool", JLabel.CENTER);
        //alertLabel.setBackground(Color.BLACK);
        alertLabel.setMinimumSize(new Dimension(350,30));
        alertLabel.setPreferredSize(new Dimension(350,30));
        alertLabel.setMaximumSize(new Dimension(350, 30));
        bottom.add(alertLabel);

        JButton save = new JButton("save");
        save.setPreferredSize(new Dimension(100,20));
        JButton copy = new JButton("copy");
        copy.setPreferredSize(new Dimension(100,20));
        JButton help = new JButton("help");
        help.setPreferredSize(new Dimension(100,20));
        bottom.add(copy);
        bottom.add(save);
        bottom.add(help);

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                alertLabel.setText("...");
                if(arrayControl.isVisible())
                {
                    if(arrayControl.save())
                        alertLabel.setText("file saved!");
                    else
                        alertLabel.setText("file could not be saved!");
                }
                else if(stringControl.isVisible())
                {
                    if(stringControl.save())
                        alertLabel.setText("file saved!");
                    else
                        alertLabel.setText("file could not be saved!");
                }
                else if(matrixControl.isVisible())
                {
                    if(matrixControl.save())
                        alertLabel.setText("file saved!");
                    else
                        alertLabel.setText("file could not be saved!");
                }
                else if(graphControl.isVisible())
                {
                    if(graphControl.save())
                        alertLabel.setText("file saved!");
                    else
                        alertLabel.setText("file could not be saved!");
                }
                else if(palindromeControl.save())
                {
                    if(palindromeControl.save())
                        alertLabel.setText("file saved!");
                    else
                        alertLabel.setText("file could not be saved!");
                }
            }
        });
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                alertLabel.setText("...");
                if(arrayControl.isVisible())
                {
                    arrayControl.copy();
                    alertLabel.setText("copied to clipboard!");
                }
                else if(stringControl.isVisible())
                {
                    stringControl.copy();
                    alertLabel.setText("copied to clipboard!");
                }
                else if(matrixControl.isVisible())
                {
                    matrixControl.copy();
                    alertLabel.setText("copied to clipboard!");
                }
                else if(graphControl.isVisible())
                {
                    graphControl.copy();
                    alertLabel.setText("copied to clipboard!");
                }
                else if(palindromeControl.save())
                {
                    palindromeControl.copy();
                    alertLabel.setText("copied to clipboard!");
                }
            }
        });
        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
            }
        });

    }

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
