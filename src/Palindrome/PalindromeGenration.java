/***************************Data Definition***************************************

Variables Used -
upp - UpperCase String 
low - LowerCase String
num - Numeric String
dis - Distinct Characters in String
inc - Sorted string in Increasing Order
dec - Sorted string in Decreasing Order
ran - Arrange string in Random Order
stc - Show number of test cases
htc - Hide test cases length
mtc - Make test cases length random
rep - Total Number of test Cases
total - Length of each String
osb - Output Seperated By

Increment Variables Used - 
i
l

Temporary Variables Used - 
res
tot
sb 
xxx
sbsb
gh
sss
rr - To store Random Numbers Generated

Hashset Used - 
cap - To store UpperCase Characters
sma - To store LowerCase Characters
ber - To store Numerical Characters
abc - To store LowerCase & UpperCase Characters
def - To store UpperCase & Numerical Characters
ghi - To store LowerCase & Numerical Characters
jkl - To store Numerical , LowerCase & UpperCase Characters

ArrayList Used - 
c - To store UpperCase Characters
s - To store LowerCase Characters
n - To store Numerical Characters
cs - To store LowerCase & UpperCase Characters
cn - To store UpperCase & Numerical Characters
sn - To store LowerCase & Numerical Characters
all - To store Numerical , LowerCase & UpperCase Characters

Methods Used -
setOutputTxt - Placing the output on TextArea
generate - Generate the required string

********************************************************************************/

package Palindrome;

import java.util.*;
import javax.swing.*;

class PalindromeGeneration
{

    JTextArea out = null;
    public void setOutputTxt(JTextArea t)
    {
        out = t;
    }

    void generate(String x[]){
        String res = "";
        String sb = "";
        StringBuilder temp = new StringBuilder(sb);
        Random rand = new Random ();
        int i , r ;
        int rep = 0 , total = 0 , min = 0 , max = 0 ;
        boolean htc , not , stc , upp , low , num , dis , mtc ;
        try
        {
        total = Integer.parseInt(x[0]);
        min = Integer.parseInt(x[9]);
        max = Integer.parseInt(x[10]);
        rep = Integer.parseInt(x[1]);   
        }
        catch(Exception e)
        {
            res = "Enter valid input.";
            
        }

        stc = Boolean.parseBoolean(x[5]);
        if(stc==true)
            {
                temp.append(Integer.toString(rep) + "\n");
            }       
        if(rep==0)
        {
            res = "Total number of test cases can not be 0.";
                
        }
        if(total==0)
        {
            res = "Size of Arrays can not be 0.";
                
        }
        int tot = total ;
        String osb = x[8];
        htc = Boolean.parseBoolean(x[6]);
        mtc = Boolean.parseBoolean(x[7]);   
        upp = Boolean.parseBoolean(x[2]);           
        low = Boolean.parseBoolean(x[3]);           
        num = Boolean.parseBoolean(x[4]);
        not = Boolean.parseBoolean(x[11]);

        String cap[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        ArrayList <String> c = new ArrayList <String> (Arrays.asList(cap));
        String sma[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList <String> s = new ArrayList <String> (Arrays.asList(sma));
        String ber[] = {"0","1","2","3","4","5","6","7","8","9"};
        ArrayList <String> n = new ArrayList <String> (Arrays.asList(ber));
        String abc[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
        ArrayList <String> sn = new ArrayList <String> (Arrays.asList(abc));
        String def[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"};       
        ArrayList <String> cn = new ArrayList <String> (Arrays.asList(def));
        String ghi[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList <String> cs = new ArrayList <String> (Arrays.asList(ghi));
        String jkl[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
        ArrayList <String> all = new ArrayList <String> (Arrays.asList(jkl));


        StringBuilder[] output = new StringBuilder[rep];
        StringBuilder sss = new StringBuilder("");
        Arrays.fill(output,sss);
        StringBuilder sbsb = new StringBuilder(sb);

if(not==false)
{
for( i= 0 ; i< rep;i++)
    {
            if(mtc==true)
            tot = 1 + rand.nextInt(total);
            else
                tot = total;        
        sbsb.setLength(0);
        if((upp==true)&&(low==false)&&(num==false))
        {
            int l = 0 ; int rr = 0 ;
            for(l = 1 ; l <= tot/2 ; l++)
                {
                    rr = rand.nextInt(c.size());
                    sbsb.append(c.get(rr));
                }
            StringBuilder temp1 = new StringBuilder(sbsb);
            temp1.reverse();
            if(tot%2==1)
            {
                rr = rand.nextInt(c.size());
                sbsb.append(c.get(rr));
            }
            sbsb.append(temp1);
            output[i] = new StringBuilder(sbsb);
        }
        else if((num==true)&&(low==false)&&(upp==false))
        {
            int l = 0 ; int rr = 0 ;
            for(l = 1 ; l <= tot/2 ; l++)
                {
                    rr = rand.nextInt(n.size());
                    sbsb.append(n.get(rr));
                }
            StringBuilder temp1 = new StringBuilder(sbsb);
            temp1.reverse();
            if(tot%2==1)
            {
                rr = rand.nextInt(n.size());
                sbsb.append(n.get(rr));
            }
            sbsb.append(temp1);
            output[i] = new StringBuilder(sbsb);
        }
        else if((low==true)&&(upp==false)&&(num==false))
        {
            int l = 0 ; int rr = 0 ;
            for(l = 1 ; l <= tot/2 ; l++)
                {
                    rr = rand.nextInt(s.size());
                    sbsb.append(s.get(rr));
                }
            StringBuilder temp1 = new StringBuilder(sbsb);
            temp1.reverse();
            if(tot%2==1)
            {
                rr = rand.nextInt(s.size());
                sbsb.append(s.get(rr));
            }
            sbsb.append(temp1);
            output[i] = new StringBuilder(sbsb);
        }

        else if((upp==true)&&(low==true)&&(num==false))
        {
            int l = 0 ; int rr = 0 ;
            for(l = 1 ; l <= tot/2 ; l++)
                {
                    rr = rand.nextInt(cs.size());
                    sbsb.append(cs.get(rr));
                }
            StringBuilder temp1 = new StringBuilder(sbsb);
            temp1.reverse();
            if(tot%2==1)
            {
                rr = rand.nextInt(cs.size());
                sbsb.append(cs.get(rr));
            }
            sbsb.append(temp1);
            output[i] = new StringBuilder(sbsb);
        }


        else if((num==true)&&(low==true)&&(upp==false))
        {
            int l = 0 ; int rr = 0 ;
            for(l = 1 ; l <= tot/2 ; l++)
                {
                    rr = rand.nextInt(sn.size());
                    sbsb.append(sn.get(rr));
                }
            StringBuilder temp1 = new StringBuilder(sbsb);
            temp1.reverse();
            if(tot%2==1)
            {
                rr = rand.nextInt(sn.size());
                sbsb.append(sn.get(rr));
            }
            sbsb.append(temp1);
            output[i] = new StringBuilder(sbsb);
        }

        else if((upp==true)&&(num==true)&&(low==false))
        {
            int l = 0 ; int rr = 0 ;
            for(l = 1 ; l <= tot/2 ; l++)
                {
                    rr = rand.nextInt(cn.size());
                    sbsb.append(cn.get(rr));
                }
            StringBuilder temp1 = new StringBuilder(sbsb);
            temp1.reverse();
            if(tot%2==1)
            {
                rr = rand.nextInt(cn.size());
                sbsb.append(cn.get(rr));
            }
            sbsb.append(temp1);
            output[i] = new StringBuilder(sbsb);
        }
        
        else if((upp==true)&&(num==true)&&(low==true))                  
        {
            int l = 0 ; int rr = 0 ;
            for(l = 1 ; l <= tot/2 ; l++)
                {
                    rr = rand.nextInt(all.size());
                    sbsb.append(all.get(rr));
                }
            StringBuilder temp1 = new StringBuilder(sbsb);
            temp1.reverse();
            if(tot%2==1)
            {
                rr = rand.nextInt(all.size());
                sbsb.append(all.get(rr));
            }
            sbsb.append(temp1);
            output[i] = new StringBuilder(sbsb);                
        }
        else
        {

        }
    }   
}
else
{
        
    for(i=0;i<rep;i++)
    {
        if(mtc==true)
            tot = 1 + rand.nextInt(total);
            else
                tot = total;

        int[] temparray = new int[tot];

        for(int kk = 0 ; kk < (tot+1)/2 ; kk++ )
        {   
            temparray[kk] = min + rand.nextInt(max-min+1);
            temparray[tot-1-kk] = temparray[kk];
        }

        
        output[i] = new StringBuilder(sbsb);
        if(htc==false)
            output[i].append(tot + "\n");
        for(int kk = 0 ; kk < tot ; kk++ )
            output[i].append(temparray[kk] + " ");
    
    }   
}

for(i=0;i<rep-1;i++)
    {       
        int xxx = output[i].length();

        if(not==true)
        {
            temp.append(output[i] + "\n" + osb + "\n");
        }
        if(not==false)
        {
            if(htc==true)
        	temp.append(output[i] + "\n" + osb + "\n" );
            else
                temp.append(xxx + " " + output[i] + "\n" + osb + "\n" );
        }
    }
    
            int xxx = output[i].length();
        if(not==true)
            temp.append(output[i]);
        if(not==false)
            if(htc==true)
        	temp.append(output[i]);
            else
                temp.append(xxx + " " + output[i]);
        
        res = new String (temp);
        out.setText(res);
        }
/*

        public static void main(String[] args) 
    {
//               size tot upp  low  num   stc   htc  mtc osb min max  only_int
        String str = "10 3 true false false true false true \n 1 100 true";
        System.out.println(generate(str));
    }
    
    */
}