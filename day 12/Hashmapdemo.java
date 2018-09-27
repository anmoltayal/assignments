import java.util.*;
import java.io.*;
@SuppressWarnings("unchecked")
class Hashmapdemo
{
 public static void main(String args[])
 {
  HashMap hs = new HashMap();
  hs.put("MSD",new Double(8200.40));
  hs.put("SAS",new Double(8218.40));
  hs.put("MES",new Double(4200.40));
  hs.put("MSR",new Double(3456.40));
  hs.put("SRK",new Double(7852.40));
  Set set = hs.entrySet();
  Iterator i=set.iterator();
  while(i.hasNext())
  {
   Map.Entry m=(Map.Entry)i.next();
   System.out.println(m.getValue()+":");
   System.out.println(m.getKey()+":");
  }
 }
} 