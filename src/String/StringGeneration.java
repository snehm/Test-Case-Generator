package String;

import java.util.*;
import javax.swing.*;

class StringGeneration
{	

	JTextArea out = null;
    public void setOutputTxt(JTextArea t)
    {
       out = t;
    }
   	
	String shuffle( String ss)
    {
    	char[] s = ss.toCharArray();
   		Random r = new Random();
        for ( int i = s.length-1 ; i > 0 ; i-- ) 
        {
            int j = r.nextInt(i+1);
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
    	}
    	ss = new String(s);
    	return ss;
    }

	void generate(String x[]) 
	{
		int i;
		String sb = "";
		String res = "";
		StringBuilder temp = new StringBuilder(sb);
		boolean upp , low , num , dis , inc , dec , ran , stc , htc , mtc ;
		upp = Boolean.parseBoolean(x[0]);
		low = Boolean.parseBoolean(x[1]);
		num = Boolean.parseBoolean(x[2]);
		dis = Boolean.parseBoolean(x[4]);
		inc = Boolean.parseBoolean(x[5]);
		dec = Boolean.parseBoolean(x[6]);
		ran = Boolean.parseBoolean(x[7]);
		htc = Boolean.parseBoolean(x[11]);
		mtc = Boolean.parseBoolean(x[12]);
		String 	con = x[13];

		Random rand = new Random();
		int r,rep=0;
		try
		{
			rep = Integer.parseInt(x[8]);	
		}
		catch(Exception e)
		{
			res = "Enter valid input.";
			;
		}
		stc = Boolean.parseBoolean(x[9]);
		if(stc==true)
			{
				temp.append(Integer.toString(rep)+"\n");
			}
		int tot = 10 ;
		try
		{
		tot = Integer.parseInt(x[3]);
		}
		catch(Exception e)
		{
			res = "Enter valid input.";
			
		}
		if(rep==0)
		{
			res = "Total number of test cases can not be 0.";
				
		}
		if(tot==0)
		{
			res = "Size of Arrays can not be 0.";
			
		}
		String osb = x[10];
		
		if((upp==true)&&(low==true)&&(num==true)&&(tot>62)&&(dis==true))
		{
			res  = "String not possible.";
			
		}
		if((upp==true)&&(low==true)&&(tot>52)&&(dis==true))
		{
			res  = "String not possible.";
			
		}
		if(((upp==true)&&(num==true)&&(dis==true)&&(tot>36))||((low==true)&&(num==true)&&(dis==true)&&(tot>36)))
		{
			res  = "String not possible.";
			
		}

		int totrand = tot;
StringBuilder[] output = new StringBuilder[rep];
StringBuilder sss = new StringBuilder("");
Arrays.fill(output,sss);
StringBuilder sbsb = new StringBuilder(sb);
int gh;
for(i = 0 ; i < rep ; i++)
{

		sbsb.setLength(0);
		sbsb = new StringBuilder(sb);
		
		HashSet <String> cap = new HashSet <String> ();
		for(int l = 0 ; l < con.length() ; l++)
		cap.add(con.substring(l,l+1));
		cap.add("A");cap.add("B");cap.add("C");cap.add("D");cap.add("E");cap.add("F");cap.add("G");cap.add("H");cap.add("I");cap.add("J");cap.add("K");cap.add("L");cap.add("M");cap.add("N");cap.add("O");cap.add("P");cap.add("Q");cap.add("R");cap.add("S");cap.add("T");cap.add("U");cap.add("V");cap.add("W");cap.add("X");cap.add("Y");cap.add("Z");
	    List <String> c = new ArrayList <String> (cap);

	    HashSet <String> sma = new HashSet <String> ();
		for(int l = 0 ; l < con.length() ; l++)
		sma.add(con.substring(l,l+1));
		sma.add("a");sma.add("b");sma.add("c");sma.add("d");sma.add("e");sma.add("f");sma.add("g");sma.add("h");sma.add("i");sma.add("j");sma.add("k");sma.add("l");sma.add("m");sma.add("n");sma.add("o");sma.add("p");sma.add("q");sma.add("r");sma.add("s");sma.add("t");sma.add("u");sma.add("v");sma.add("w");sma.add("x");sma.add("y");sma.add("z");
	    List <String> s = new ArrayList <String> (sma);

	    HashSet <String> ber = new HashSet <String> (); 
		for(int l = 0 ; l < con.length() ; l++)
		ber.add(con.substring(l,l+1));
		ber.add("0");ber.add("1");ber.add("2");ber.add("3");ber.add("4");ber.add("5");ber.add("6");ber.add("7");ber.add("8");ber.add("9");
		List <String> n = new ArrayList <String> (ber);

		HashSet <String> xtr = new HashSet <String> (); 
		for(int l = 0 ; l < con.length() ; l++)
		xtr.add(con.substring(l,l+1));
		List <String> b = new ArrayList <String> (xtr);
		
		HashSet <String> ghi = new HashSet <String> ();
		for(int l = 0 ; l < con.length() ; l++)
		ghi.add(con.substring(l,l+1));
		ghi.add("a");ghi.add("b");ghi.add("c");ghi.add("d");ghi.add("e");ghi.add("f");ghi.add("g");ghi.add("h");ghi.add("i");ghi.add("j");ghi.add("k");ghi.add("l");ghi.add("m");ghi.add("n");ghi.add("o");ghi.add("p");ghi.add("q");ghi.add("r");ghi.add("s");ghi.add("t");ghi.add("u");ghi.add("v");ghi.add("w");ghi.add("x");ghi.add("y");ghi.add("z");ghi.add("0");ghi.add("1");ghi.add("2");ghi.add("3");ghi.add("4");ghi.add("5");ghi.add("6");ghi.add("7");ghi.add("8");ghi.add("9");
	    List <String> sn = new ArrayList <String> (ghi);
	    
	    HashSet <String> def = new HashSet <String> ();
		for(int l = 0 ; l < con.length() ; l++)
		def.add(con.substring(l,l+1));
		def.add("A");def.add("B");def.add("C");def.add("D");def.add("E");def.add("F");def.add("G");def.add("H");def.add("I");def.add("J");def.add("K");def.add("L");def.add("M");def.add("N");def.add("O");def.add("P");def.add("Q");def.add("R");def.add("S");def.add("T");def.add("U");def.add("V");def.add("W");def.add("X");def.add("Y");def.add("Z");def.add("0");def.add("1");def.add("2");def.add("3");def.add("4");def.add("5");def.add("6");def.add("7");def.add("8");def.add("9");		
	    List <String> cn = new ArrayList <String> (def);
		
		HashSet <String> abc = new HashSet <String> ();
		for(int l = 0 ; l < con.length() ; l++)
		abc.add(con.substring(l,l+1));
		abc.add("A");abc.add("B");abc.add("C");abc.add("D");abc.add("E");abc.add("F");abc.add("G");abc.add("H");abc.add("I");abc.add("J");abc.add("K");abc.add("L");abc.add("M");abc.add("N");abc.add("O");abc.add("P");abc.add("Q");abc.add("R");abc.add("S");abc.add("T");abc.add("U");abc.add("V");abc.add("W");abc.add("X");abc.add("Y");abc.add("Z");abc.add("a");abc.add("b");abc.add("c");abc.add("d");abc.add("e");abc.add("f");abc.add("g");abc.add("h");abc.add("i");abc.add("j");abc.add("k");abc.add("l");abc.add("m");abc.add("n");abc.add("o");abc.add("p");abc.add("q");abc.add("r");abc.add("s");abc.add("t");abc.add("u");abc.add("v");abc.add("w");abc.add("x");abc.add("y");abc.add("z");
	    List <String> cs = new ArrayList <String> (abc);

		HashSet <String> jkl = new HashSet <String> ();
		for(int l = 0 ; l < con.length() ; l++)
		jkl.add(con.substring(l,l+1));
		jkl.add("A");jkl.add("B");jkl.add("C");jkl.add("D");jkl.add("E");jkl.add("F");jkl.add("G");jkl.add("H");jkl.add("I");jkl.add("J");jkl.add("K");jkl.add("L");jkl.add("M");jkl.add("N");jkl.add("O");jkl.add("P");jkl.add("Q");jkl.add("R");jkl.add("S");jkl.add("T");jkl.add("U");jkl.add("V");jkl.add("W");jkl.add("X");jkl.add("Y");jkl.add("Z");jkl.add("a");jkl.add("b");jkl.add("c");jkl.add("d");jkl.add("e");jkl.add("f");jkl.add("g");jkl.add("h");jkl.add("i");jkl.add("j");jkl.add("k");jkl.add("l");jkl.add("m");jkl.add("n");jkl.add("o");jkl.add("p");jkl.add("q");jkl.add("r");jkl.add("s");jkl.add("t");jkl.add("u");jkl.add("v");jkl.add("w");jkl.add("x");jkl.add("y");jkl.add("z");jkl.add("0");jkl.add("1");jkl.add("2");jkl.add("3");jkl.add("4");jkl.add("5");jkl.add("6");jkl.add("7");jkl.add("8");jkl.add("9");
	    List <String> all = new ArrayList <String> (jkl);

				if(mtc==true)
				{
					totrand = 1+rand.nextInt(tot);	
				}

		if((upp==true)&&(low==false)&&(num==false))
		{
			int l = 0 ; int rr = 0 ;
			for(l = 1 ; l <= totrand ; l++)
				{
					rr = rand.nextInt(c.size());
					sbsb.append(c.get(rr));
					if(dis==true)
						c.remove(rr);
				}
			String out = new String(sbsb);
			out = shuffle(out);
			output[i] = new StringBuilder(out);
		}
		else if((num==true)&&(low==false)&&(upp==false))
		{
			int l = 0 ; int rr = 0 ;
			for(l = 1 ; l <= totrand ; l++)
				{
					rr = rand.nextInt(n.size());
					sbsb.append(n.get(rr));
					if(dis==true)
						n.remove(rr);
				}
			String out = new String(sbsb);
			out = shuffle(out);
			output[i] = new StringBuilder(out);
		}
		else if((low==true)&&(upp==false)&&(num==false))
		{
			int l = 0 ; int rr = 0 ;
			for(l = 1 ; l <= totrand ; l++)
				{
					rr = rand.nextInt(s.size());
					sbsb.append(s.get(rr));
					if(dis==true)
						s.remove(rr);
				}
			String out = new String(sbsb);
			out = shuffle(out);
			output[i] = new StringBuilder(out);
		}

		else if((upp==true)&&(low==true)&&(num==false))
		{
			int l = 0 ; int rr = 0 ;
			for(l = 1 ; l <= totrand ; l++)
				{
					rr = rand.nextInt(cs.size());
					sbsb.append(cs.get(rr));
					if(dis==true)
						cs.remove(rr);
				}
			String out = new String(sbsb);
			out = shuffle(out);
			output[i] = new StringBuilder(out);
		}


		else if((num==true)&&(low==true)&&(upp==false))
		{
			int l = 0 ; int rr = 0 ;
			for(l = 1 ; l <= totrand ; l++)
				{
					rr = rand.nextInt(sn.size());
					sbsb.append(sn.get(rr));
					if(dis==true)
						sn.remove(rr);
				}
			String out = new String(sbsb);
			out = shuffle(out);
			output[i] = new StringBuilder(out);
		}

		else if((upp==true)&&(num==true)&&(low==false))
		{
			int l = 0 ; int rr = 0 ;
			for(l = 1 ; l <= totrand ; l++)
				{
					rr = rand.nextInt(cn.size());
					sbsb.append(cn.get(rr));
					if(dis==true)
						cn.remove(rr);
				}
			String out = new String(sbsb);
			out = shuffle(out);
			output[i] = new StringBuilder(out);
		}
		
		else if((upp==true)&&(num==true)&&(low==true))					
		{
			int l = 0 ; int rr = 0 ;
			for(l = 1 ; l <= totrand ; l++)
				{
					rr = rand.nextInt(all.size());
					sbsb.append(all.get(rr));
					if(dis==true)
						all.remove(rr);
				}
			String out = new String(sbsb);
			out = shuffle(out);
			output[i] = new StringBuilder(out);				
		}
		else if((upp==false)&&(num==false)&&(low==false))
		{
			int l = 0 ; int rr = 0 ;
			for(l = 1 ; l <= totrand ; l++)
				{
					rr = rand.nextInt(b.size());
					sbsb.append(b.get(rr));
					if(dis==true)
						b.remove(rr);
				}
			String out = new String(sbsb);
			out = shuffle(out);
			output[i] = new StringBuilder(out);
		}
		else
		{

		}		
	}

for(i=0;i<rep;i++)
	{	
			if(inc==true)
			{	
				String tt = new String(output[i]);
				char[] zz = tt.toCharArray();
				Arrays.sort(zz);
				output[i].delete(0, output[i].length());
				output[i].append(zz);
			}	
			if(dec==true)
			{
				String tt = new String(output[i]);
				char[] zz = tt.toCharArray();
				Arrays.sort(zz);
				String temp1 = new String(zz);				
				StringBuilder sb1 = new StringBuilder(temp1);
				sb1.reverse();
				output[i].delete(0, output[i].length());
				output[i]=new StringBuilder(sb1);
			}	
		}	

	for(i=0;i<rep-1;i++)
	{
		System.out.println(rep);
		int xxx = output[i].length();

		if((htc==false)&&(!osb.equals("")))
		{
				temp.append(xxx + " " + output[i] + "\n" + osb + "\n");
		}

		if((htc==true)&&(!osb.equals("")))
		{
				temp.append(output[i] + "\n" + osb + "\n");
		}

		if((htc==false)&&(osb.equals("")))
		{
			temp.append(xxx + " " + output[i] + "\n");
		}

		if((htc==true)&&(osb.equals("")))
		{
			temp.append(output[i] + "\n");
		}
	}

	int xxx = output[i].length();
	if(htc==true)
	temp.append(output[i]);
	else
	temp.append(xxx + " " + output[i]);	
	res = new String(temp);

	out.setText(res);

}

/*
	public static void main(String[] args) {
		//		       upp  low  num tot dis  inc  dec ran  r stc sep htc mtcr
		String str = "false false true 3 true false false true 2 true \n false true ###@@%%^";
		System.out.println(generate(str));
	}
*/	
} 