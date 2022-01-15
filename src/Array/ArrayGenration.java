package Array;

//package backend;

import javax.swing.*;
import java.util.*;

class ArrayGeneration
{
    JTextArea out = null;
    public void setOutputTxt(JTextArea t)
    {
       out = t;
    }

    public void generate(String x[])
    {

        int i ;
        String res = "";
        String sb = "";
        StringBuilder temp = new StringBuilder(sb);

        int tot = Integer.parseInt(x[0]);
        String osb = x[1] ;
        int min = Integer.parseInt(x[2]);
        int max = Integer.parseInt(x[3]);

        if (max < min) {
            out.setText("Error. Max cannot be smaller than min.");
            return;
        }

        int rep = Integer.parseInt(x[4]);
        String rsb = x[5] ;
        Boolean odd = Boolean.parseBoolean(x[6]);
        Boolean eve = Boolean.parseBoolean(x[7]);
        Boolean any = Boolean.parseBoolean(x[8]);
        Boolean pri = Boolean.parseBoolean(x[9]);

        if (pri && (min < 0 || max < 0)) {
            out.setText("Error. Prime cannot lie in negative range.");
            return;
        }

        Boolean inc = Boolean.parseBoolean(x[10]);
        Boolean dec = Boolean.parseBoolean(x[11]);
        Boolean ran = Boolean.parseBoolean(x[12]);
        Boolean htc = Boolean.parseBoolean(x[13]);
        Boolean stc = Boolean.parseBoolean(x[14]);
        Boolean mtc = Boolean.parseBoolean(x[15]);
        Boolean dis = Boolean.parseBoolean(x[16]);
        Random rand = new Random ();
        if(stc==true)
            temp.append(rep + "\n");
        ArrayList <Integer> o = new ArrayList <Integer> ();
        ArrayList <Integer> e = new ArrayList <Integer> ();
        ArrayList <Integer> a = new ArrayList <Integer> ();
        ArrayList <Integer> p = new ArrayList <Integer> ();
        for(i = min ; i <= max ; i++)
        {
            a.add(i);
            if(i%2==0)
                e.add(i);
            else
                o.add(i);
        }

        if(min >= 0 && max >= 0) {
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
        }

        if (dis) {
            if(odd && o.size()<tot) {
                out.setText("Number of possible outputs is less than the total size of array.");
                return;
            }
            if(eve && e.size()<tot) {
                out.setText("Number of possible outputs is less than the total size of array.");
                return;
            }
            if(any && a.size()<tot) {
                out.setText("Number of possible outputs is less than the total size of matrix. Please change the dimension.");
                return;
            }
            if(pri && p.size()<tot) {
                out.setText("Number of possible outputs is less than the total size of matrix. Please change the dimension.");
                return;
            }
        }

        for(int jj = 0 ; jj < rep ; jj++)
        {

            Collections.shuffle(o);
            Collections.shuffle(e);
            Collections.shuffle(a);
            Collections.shuffle(p);

            int total;
            if(mtc==true)
                total = 1 + rand.nextInt(tot);
            else
                total = tot;

            int[] output = new int[tot];
            Arrays.fill(output,-1);

            for(i=0;i<tot;i++)
            {
                if((odd==true)&&(dis==false))
                {
                    int xxx = rand.nextInt(o.size());
                    output[i] = o.get(xxx);
                }

                if((odd==true)&&(dis==true))
                {
                    output[i]=o.get(i);
                }

                if((any==true)&&(dis==false))
                {
                    output[i] = min + rand.nextInt(max-min+1);
                }

                if((any==true)&&(dis==true))
                {
                    output[i]=a.get(i);
                }
                if((eve==true)&&(dis==true))
                {
                    output[i]=e.get(i);
                }

                if((eve==true)&&(dis==false))
                {
                    int xxx = rand.nextInt(e.size());
                    output[i] = e.get(xxx);
                }
                if((pri==true)&&(dis==true))
                {
                    output[i]=p.get(i);
                }
                if((pri==true)&&(dis==false))
                {
                    int ii = rand.nextInt(p.size());
                    int xxx = p.get(ii);
                    output[i]=xxx;
                }
            }

            if(inc==true)
                Arrays.sort(output);

            if(dec==true)
            {
                Arrays.sort(output);
                int start = 0, end = total-1;
                while (start < end)
                {
                    int reverseTemp = output[start];
                    output[start] = output[end];
                    output[end] = reverseTemp;
                    start++;
                    end--;
                }
            }

            if(htc==false)
                temp.append(total+"\n");

            for(i = 0 ; i<total-1 ; i++)
            {
                String z = Integer.toString(output[i]);
                z = z + osb ;
                temp.append(z);
            }

            temp.append(Integer.toString(output[i]));

            if(!rsb.equals(""))
                temp.append("\n"+rsb+"\n");
            else
                temp.append("\n");
        }
        temp.append("\n");
        res = temp.toString();

        out.setText(res);
    }

    public ArrayGeneration()
    {

    }

    /*              ****************Debug*******************
     *   public static void main(String[] args) {
     *       //s se mn mx tc sep odd  even  any  prime inc   dec  ran   htc   stc  mtc  neg 	dis
     *       String str = "10 *** 1 15 10 ------------- true false false false true false false false true true false false ";
     *       System.out.print(generate(str));
     *
     *   }
     */
}
