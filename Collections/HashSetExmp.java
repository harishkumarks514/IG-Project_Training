import java.util.*;

import com.sun.tools.jdi.EventSetImpl.Itr;
class HashSetExmp{
 public static void main(String args[]){
  
 HashSet<E>&amp;amp;lt;String&amp;amp;gt; al=new HashSet(); // creating hashSet
 al.add("Rachit");                 // adding elements
 al.add("Amit");
 al.add("jack");
 Iterator&amp;amp;lt;String&amp;amp;gt; itr=al.iterator();
 while(itr.hasNext()){
 System.out.println(itr.next());
 }
 }
 }