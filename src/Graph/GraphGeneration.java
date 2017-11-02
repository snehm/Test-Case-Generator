package Graph;

import javax.swing.*;
import java.util.*;

class Pair<T, E>
{
    T first;
    E second;

    public Pair()
    {

    }
    public Pair(T a, E b)
    {
        first = a;
        second = b;
    }
}

class DisjointSet
{
    int set[], rank[];
    public DisjointSet(int n)
    {
        set = new int[n];
        rank = new int[n];
        for(int i=0; i<n; i++)
        {
            set[i] = i;
            rank[i] = 1;
        }
    }

    int findSet(int i)
    {
        if(i == set[i])
            return i;
        return (set[i] = findSet(set[i]));
    }
    public void union(int x, int y)
    {
        x = findSet(x);
        y = findSet(y);

        if(x == y)
            return;

        if(rank[x] == rank[y])
        {
            set[y] = x;
            rank[y]++;
        }
        else if(rank[x] > rank[y])
            set[y] = x;
        else
            set[x] = y;
    }

    public boolean isSameSet(int x, int y)
    {
        x = findSet(x);
        y = findSet(y);
        return(x == y);
    }
}

class GraphGeneration
{
    JTextArea out = null;
    public void setOutputTxt(JTextArea t)
    {
        out = t;
    }

    public void generate(String args[]) {
        int noOfVertex = Integer.parseInt(args[0]);
        int noOfEdge = Integer.parseInt(args[1]);
        int rep = Integer.parseInt(args[2]);
        String repSep = args[3];
        boolean isWeight = Boolean.parseBoolean(args[4]);
        int minWeight = Integer.parseInt(args[5]);
        int maxWeight = Integer.parseInt(args[6]);
        boolean multiEdge = Boolean.parseBoolean(args[7]);
        boolean selfLoop = Boolean.parseBoolean(args[8]);
        boolean cycle = Boolean.parseBoolean(args[9]);
        boolean directed = Boolean.parseBoolean(args[10]);
        out.setText("");
        //boolean connected = Boolean.parseBoolean(args[9]);

        for (int ir = 0; ir < rep; ir++) {
            Random myRand = new Random();
            int ne = noOfEdge;

            List<Pair<Integer, Integer>> allPossibleEdges = new ArrayList<>();
            for (int i = 0; i < noOfVertex; i++) {
                if (directed) {
                    for (int j = 0; j < noOfVertex; j++) {
                        if (i != j)
                            allPossibleEdges.add(new Pair<Integer, Integer>(i, j));
                        else if (selfLoop)
                            allPossibleEdges.add(new Pair<Integer, Integer>(i, j));
                    }
                } else {
                    for (int j = i; j < noOfVertex; j++) {
                        if (i != j)
                            allPossibleEdges.add(new Pair<Integer, Integer>(i, j));
                        else if (selfLoop)
                            allPossibleEdges.add(new Pair<Integer, Integer>(i, j));
                    }
                }
            }

            int totalMultiEdge = 0;
            if (multiEdge) {
                totalMultiEdge = myRand.nextInt(ne);
                ne = ne - totalMultiEdge;
            }

            //real generation starts here
            List<Pair<Integer, Integer>> graph = new ArrayList<>();
            DisjointSet ds = new DisjointSet(noOfVertex);

            Collections.shuffle(allPossibleEdges);
            for (Pair<Integer, Integer> p : allPossibleEdges) {
                if (ne == 0)
                    break;
                boolean isFormingCycle = ds.isSameSet(p.first, p.second);
                if (!isFormingCycle) {
                    graph.add(p);
                    ds.union(p.first, p.second);
                    ne--;
                } else if (isFormingCycle && cycle) {
                    graph.add(p);
                    ds.union(p.first, p.second);
                    ne--;
                }
            }


            if (graph.size() != 0) {
                int tedge = ne;
                for (int i = 0; i < totalMultiEdge + tedge; i++) {
                    int temp = myRand.nextInt(graph.size());
                    graph.add(graph.get(temp));
                    ne--;
                }
            }

            StringBuffer result = new StringBuffer();
            for (Pair<Integer, Integer> p : graph) {
                int a = p.first;
                int b = p.second;
                if (isWeight) {
                    int w = myRand.nextInt(maxWeight - minWeight + 1) + minWeight;
                    result.append(Integer.toString(a) + " " + Integer.toString(b) + " " + w + "\n");
                } else {
                    result.append(Integer.toString(a) + " " + Integer.toString(b) + "\n");
                }
            }

            if (ne > 0) {
                result = new StringBuffer("Output cannot be generated, due to incorrect input.");
                out.append(result.toString());
                break;
            }

            out.append(args[0]+" "+args[1]+"\n"+result.toString());
            if(!repSep.equals(""))
                out.append(repSep+"\n");
        }

    }
}