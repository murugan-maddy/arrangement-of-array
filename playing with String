import java.util.*;
import java.lang.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int limit=sc.nextInt();
        TreeSet<String> tree=new TreeSet<String>();
        String ch[]=a.split(" ");
        int z=0;
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i].equals(ch[j]))
                {
                   count++;
                   ch[j]="0";
                }
            }
            if(count >=limit && ch[i]!="0")
            {
                tree.add(ch[i]);
                z++;
            }
        }
        if(z>0)
        {
            Iterator<String> itr=tree.iterator();  
           while(itr.hasNext())
           {  
          System.out.print(itr.next()+" "); 
           }
        }
        if(z==0)
       {
           System.out.print("NA");
       }
    }
}
