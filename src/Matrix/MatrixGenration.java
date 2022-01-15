package Matrix;

import java.util.*;
import javax.swing.JTextArea;

class MatrixGeneration
{
    static JTextArea out = null;
    public void setOutputTxt(JTextArea t)
    {
        out = t;
    }

    static void reversesort (int[] a)
    {
        Arrays.sort(a);
        int temp;
        int i , n = a.length;
        for (i=0;i<n/2 ;i++ )
        {
            temp = a[i] ;
            a[i] = a[n-1-i] ;
            a[n-1-i] = temp ;
        }
    }

    public static void generate(String x[])
    {
        Boolean odd , eve , any , pri , inc , dec , ran , hrc , stc , col , neg , dis ;
        Random rand = new Random ();
        int min = 0 ;
        int max = Integer.MAX_VALUE;
        int rep = 1 ;
        int i , j ;
        String res = "";
        String sb = "";
        StringBuilder temp = new StringBuilder(sb);
        int n = x.length;
        String rsb = x[5] ;

        stc = Boolean.parseBoolean(x[14]);
        int tor = 0,toc = 0;
        try
        {
            rep = Integer.parseInt(x[4]);
            tor = Integer.parseInt(x[0]);
            toc = Integer.parseInt(x[1]);
            min = Integer.parseInt(x[2]);
            max = Integer.parseInt(x[3]);
        }
        catch(Exception e)
        {
            res = "Enter valid input";
            return;
        }
        int tot = tor*toc;
        if(max<=min)
        {
            res = "Max cannot be smaller or equal to than minimum value.";
            return;
        }
        if(rep==0)
        {
            res = "Total number of test cases can not be 0.";
            return;
        }
        if(toc==0)
        {
            res = "Size of columns can not be 0.";
            return;
        }
        if(tor==0)
        {
            res = "Size of rows can not be 0.";
            return;
        }
        if(stc==true)
        {
            temp.append(Integer.toString(rep)+"\n");
        }
        odd = Boolean.parseBoolean(x[6]);
        eve = Boolean.parseBoolean(x[7]);
        pri = Boolean.parseBoolean(x[9]);
        any = Boolean.parseBoolean(x[8]);
        inc = Boolean.parseBoolean(x[10]);
        dec = Boolean.parseBoolean(x[11]);
        ran = Boolean.parseBoolean(x[12]);
        hrc = Boolean.parseBoolean(x[13]);
        stc = Boolean.parseBoolean(x[14]);
        neg = Boolean.parseBoolean(x[15]);
        dis = Boolean.parseBoolean(x[16]);
        col = Boolean.parseBoolean(x[17]);

        ArrayList <Integer> o = new ArrayList <Integer> ();
        ArrayList <Integer> e = new ArrayList <Integer> ();
        ArrayList <Integer> a = new ArrayList <Integer> ();
        ArrayList <Integer> p = new ArrayList <Integer> ();

        if (pri && (min < 0 || max < 0)) {
            out.setText("Error. Prime cannot lie in negative range.");
            return;
        }

        for(i = min ; i <= max ; i++)
        {
            a.add(i);
            if(i%2==0)
                e.add(i);
            else
                o.add(i);
        }

        boolean prime[] = new boolean[max+1];
        for(i=0;i<max;i++)
            prime[i] = false;

        for(int pp = 2; pp*pp <=max; pp++)
        {
            if(prime[pp] == false)
            {
                for(i = pp*2; i <= max; i+=pp)
                    prime[i] = true;
            }
        }
        prime[0]=true;
        prime[1]=true;
        for (int ppp=min; ppp<=max; ppp++)
            if (prime[ppp]==false)
                p.add(ppp);

        if((o.size()<tot)&&(odd==true)&&(dis==true))
        {
            res = "Number of possible outputs is less than the total size of matrix. Please change the dimension.";
        }
        if((e.size()<tot)&&(eve==true)&&(dis==true))
        {
            res = "Number of possible outputs is less than the total size of matrix. Please change the dimension.";
        }
        if((a.size()<tot)&&(any==true)&&(dis==true))
        {
            res = "Number of possible outputs is less than the total size of matrix. Please change the dimension.";
        }
        if((p.size()<tot)&&(pri==true)&&(dis==true))
        {
            res = "Number of possible outputs is less than the total size of matrix. Please change the dimension.";
        }


        for(int jj = 0 ; jj < rep ; jj++)
        {

            Collections.shuffle(o);
            Collections.shuffle(e);
            Collections.shuffle(a);
            Collections.shuffle(p);

            int[][] output = new int[tor][toc];
            int[][] output1 = new int[tor][toc];
            int iii=0;

            for(i=0;i<tor;i++)
            {
                for(j=0;j<toc;j++)
                {
                    if((odd==true)&&(dis==false))
                    {
                        int xxx = rand.nextInt(o.size());
                        output[i][j] = o.get(xxx);
                    }

                    if((odd==true)&&(dis==true))
                    {
                        output[i][j]=o.get(iii);
                    }

                    if((any==true)&&(dis==false))
                    {
                        output[i][j] = min + rand.nextInt(max-min+1);
                    }

                    if((any==true)&&(dis==true))
                    {
                        output[i][j]=a.get(iii);
                    }
                    if((eve==true)&&(dis==true))
                    {
                        output[i][j]=e.get(iii);
                    }

                    if((eve==true)&&(dis==false))
                    {
                        int xxx = rand.nextInt(e.size());
                        output[i][j] = e.get(xxx);
                    }
                    if((pri==true)&&(dis==true))
                    {
                        output[i][j]=p.get(iii);
                    }
                    if((pri==true)&&(dis==false))
                    {
                        int ii = rand.nextInt(p.size());
                        int xxx = p.get(ii);
                        output[i][j]=xxx;
                    }
                    iii++;
                }
            }
            if(inc==true)
            {
                for (i = 0; i < output.length; i++)
                {
                    Arrays.sort(output[i]);
                }
            }

            if((inc==true)&&(col==true))
            {
                for(i=0;i<tor;i++)
                {
                    for(j=0;j<toc;j++)
                    {
                        output1[i][j]=output[j][i];
                    }
                }

                for (i = 0; i < output.length; i++)
                {
                    Arrays.sort(output1[i]);
                }

                for(i=0;i<tor;i++)
                {
                    for(j=0;j<toc;j++)
                    {
                        output[i][j]=output1[j][i];
                    }
                }
            }

            if((dec==true)&&(col==true))
            {
                for(i=0;i<tor;i++)
                {
                    for(j=0;j<toc;j++)
                    {
                        output1[i][j]=output[j][i];
                    }
                }

                for (i = 0; i < output.length; i++)
                {
                    Arrays.sort(output1[i]);
                }
                for (i = 0; i < output1.length; i++)
                {
                    reversesort(output1[i]);
                }

                for(i=0;i<tor;i++)
                {
                    for(j=0;j<toc;j++)
                    {
                        output[i][j]=output1[j][i];
                    }
                }
            }

            if(dec==true)
            {
                for (i = 0; i < output.length; i++)
                {
                    reversesort(output[i]);
                }
            }

            if(neg==true)
            {
                for(i=0;i<tor;i++)
                {
                    for(j=0;j<toc;j++)
                    {
                        output[i][j]=-output[i][j];
                    }
                }
            }

            if(hrc==false)
            {
                temp.append(tor + " " + toc + "\n" );
            }
            for(i=0;i<tor;i++)
            {
                for(j=0;j<toc;j++)
                {
                    temp.append(Integer.toString(output[i][j]) + " ");
                }
                if(i!=tor-1)
                    temp.append("\n");
            }

            if(!rsb.equals(""))
                temp.append("\n"+rsb+"\n");
            else
                temp.append("\n");

        }
        res = temp.toString();

        out.setText(res);
    }
    public MatrixGeneration()
    {

    }
/*
    public static void main(String[] args) {
//                    r c mn mxtc sep          odd  even  any  pri   inc  dec    ran htc   stc  neg   dis  col
        String str = "4350 4350 112 4443 2 - false false true false false false true true true false false false ";
//      long lStartTime = System.nanoTime();
      System.out.println(generate(str));
//     long lEndTime = System.nanoTime();
//      long output = lEndTime - lStartTime;
//   System.out.println("Elapsed time in milliseconds: " + output / 1000000);
    }
*/
}