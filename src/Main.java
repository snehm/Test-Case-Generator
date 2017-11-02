//test case generator main menu: start page

import Array.CreateArrayGUI;
import Graph.CreateGraphGUI;
import Matrix.CreateMatrixGUI;
import String.CreateStringGUI;

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

        new CreateArrayGUI(cards);
        new CreateMatrixGUI(cards);
        new CreateGraphGUI(cards);
        new CreateStringGUI(cards);
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
