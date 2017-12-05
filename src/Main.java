//test case generator main menu: start page

import Array.CreateArrayGUI;
import Graph.CreateGraphGUI;
import Matrix.CreateMatrixGUI;
import String.CreateStringGUI;
import Palindrome.CreatePalindromeGUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

class Help
{
    Help()
    {
        try {
            JFrame hFrm = new JFrame();
            hFrm.setSize(550,600);
            hFrm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            hFrm.setVisible(true);
            hFrm.setResizable(false);
            JPanel mainPanel = new JPanel();
            hFrm.add(mainPanel);

            JPanel hPnl = new JPanel();
            hPnl.setBackground(Color.WHITE);
            hPnl.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridy=0;
            gbc.gridx=0;
            JScrollPane pane = new JScrollPane(hPnl);
            pane.setPreferredSize(new Dimension(550, 600));
            mainPanel.add(pane);

            BufferedImage im1 = ImageIO.read(this.getClass().getResource("1.jpg"));
            JLabel str = new JLabel("String");
            gbc.gridy=0;
            hPnl.add(str);

            JLabel lab1 = new JLabel(new ImageIcon(im1));
            gbc.gridy=1;
            hPnl.add(lab1,gbc);
            JTextArea txt1 = new JTextArea(2,45);
            txt1.setText("By selecting strings, here you can find a number of tools to generate random strings of your preferences. You can generate any number of strings of any size with repeat and total count text fields as well as manage as how they are separated. Sort the characters in your desired order. You can select the various combinations of input cases such as strings containing A-Z, 0-9,a-z etc. Choose from our advanced panel for negative outputs, distinct characters in the string and other options such as show total number of string, hide each strings length and random length of strings.\n\n");
            txt1.setLineWrap(true);
            txt1.setEditable(false);
            txt1.setWrapStyleWord(true);
            txt1.setOpaque(false);
            gbc.gridy=2;
            hPnl.add(txt1,gbc);

            BufferedImage im2 = ImageIO.read(this.getClass().getResource("2.jpg"));
            JLabel mat = new JLabel("Matrix");
            gbc.gridy=3;
            hPnl.add(mat,gbc);

            JLabel lab2 = new JLabel(new ImageIcon(im1));
            gbc.gridy=4;
            hPnl.add(lab2,gbc);
            JTextArea txt2 = new JTextArea(2,45);
            txt2.setText("By selecting matrix, here you can find a number of tools to generate random matrices of your preferences. You can generate any number of matrix of any dimension with repeat and total count text fields as well as manage as how they are separated. Choose from our advanced panel for negative outputs, distinct elements in a matrix and other options such as show total number of matrix, hide each matrix dimension and make each column wise arranged.\n\n");
            txt2.setLineWrap(true);
            txt2.setEditable(false);
            txt2.setWrapStyleWord(true);
            txt2.setOpaque(false);
            gbc.gridy=5;
            hPnl.add(txt2,gbc);

            BufferedImage im3 = ImageIO.read(this.getClass().getResource("3.jpg"));
            JLabel graph = new JLabel("Graph");
            gbc.gridy=6;
            hPnl.add(graph,gbc);

            JLabel lab3 = new JLabel(new ImageIcon(im1));
            gbc.gridy=7;
            hPnl.add(lab3,gbc);
            JTextArea txt3 = new JTextArea(2,45);
            txt3.setText("By selecting graphs, here you can find a number of tools to generate random graphs of your preferences. You can generate any number of graphs with any no of vertices and edges with the repeat, vertex and edges text field. You can select if the graph is weighted (and specify weight ranges) or not by checking the weighted graph option. Advanced options include Multiple Edges, self-loop, cycles and directed graph.\n\n");
            txt3.setLineWrap(true);
            txt3.setEditable(false);
            txt3.setWrapStyleWord(true);
            txt3.setOpaque(false);
            gbc.gridy=8;
            hPnl.add(txt3,gbc);

            BufferedImage im4 = ImageIO.read(this.getClass().getResource("4.jpg"));
            JLabel arr = new JLabel("Array");
            gbc.gridy=9;
            hPnl.add(arr, gbc);

            JLabel lab4 = new JLabel(new ImageIcon(im1));
            gbc.gridy=10;
            hPnl.add(lab4,gbc);
            JTextArea txt4 = new JTextArea(2,45);
            txt4.setText("By selecting arrays, here you can find a number of tools to generate random arrays of your preferences. You can generate any number of arrays of any size with repeat and total count text fields as well as manage as how they are separated. Choose from our advanced panel for negative outputs, distinct elements in an array and other options such as show total number of arrays  , hide each array length and make each array of random length.\n\n");
            txt4.setLineWrap(true);
            txt4.setEditable(false);
            txt4.setWrapStyleWord(true);
            txt4.setOpaque(false);
            gbc.gridy=11;
            hPnl.add(txt4,gbc);

            BufferedImage im5 = ImageIO.read(this.getClass().getResource("5.jpg"));
            JLabel palin = new JLabel("Palindrome");
            gbc.gridy=12;
            hPnl.add(palin,gbc);

            JLabel lab5 = new JLabel(new ImageIcon(im1));
            gbc.gridy=13;
            hPnl.add(lab5,gbc);
            JTextArea txt5 = new JTextArea(2,45);
            txt5.setText("By selecting palindromes, here you can find a number of tools to generate random strings and integer palindromes of your preferences. You can generate any number of integer array palindromes of any size with repeat and total count text fields as well as manage as how they are separated. You can specify the ranges with min and max fields. Choose from our advanced panel for options such as show total number of arrays, hide each arrays length and random length of arrays.\n\n");
            txt5.setLineWrap(true);
            txt5.setEditable(false);
            txt5.setWrapStyleWord(true);
            txt5.setOpaque(false);
            gbc.gridy=14;
            hPnl.add(txt5,gbc);

            JLabel mis = new JLabel("Miscellaneous");
            gbc.gridy = 15;
            hPnl.add(mis, gbc);
            JTextArea txt6 = new JTextArea(2,45);
            txt6.setText("To Copy the text from the TextArea, simply click the “copy” Button and the text gets copied to the keyboard. \n" +
                    "To save the text from the TextArea to an external file, simply click the “save to file” Button and the text gets copied to the keyboard. The file gets saved as “input.txt” in the same folder as the application. \n" +
                    "To get help at any point of time, click the “Help” button.\n\n");
            txt6.setLineWrap(true);
            txt6.setEditable(false);
            txt6.setWrapStyleWord(true);
            txt6.setOpaque(false);
            gbc.gridy=16;
            hPnl.add(txt6,gbc);

            JTextArea txt7 = new JTextArea(2,45);
            txt7.setText("To contact us for any query or feedbacks, simply drop a mail at –\n" +
                    "avinashkr226@gmail.com\n" +
                    "snehmishra555@gmail.com \n" +
                    "\n" +
                    "Designed By – \n" +
                    "Sneh Kumar Mishra\n" +
                    "Avinash Kumar\n\n");
            txt7.setLineWrap(true);
            txt7.setEditable(false);
            txt7.setWrapStyleWord(true);
            txt7.setOpaque(false);
            gbc.gridy=17;
            hPnl.add(txt7,gbc);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}

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
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Help();
                    }
                });
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
