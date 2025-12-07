
package javapractice.java1;

import java.util.*;

class FrameworkCollection
{
    public void ArrayList1()
    {
//        ArrayList a1 = new ArrayList();
//        a1.add(101);
//        a1.add("Amit");
//        a1.add(78.987);
//        a1.add('A');
//        System.out.println("Array List : " + a1);
        
//        ArrayList<String> a1 = new ArrayList<String>();
//        a1.add("Amit");
//        a1.add("Ram");
//        a1.add("Bikash");
//        a1.add("Chandan");
//        
//        System.out.println("Array List : " + a1);
        
                                    //ArrayList to Array..
        
//        String[] a2 = new String[a1.size()];
//        a1.toArray(a2);
//        System.out.println("Display Array : ");
//        for(String a : a2)
//        {
//            System.out.print(a + " ");
//        }
//         System.out.println("");
//        //Array to ArrayList
        
//        String[] a3 = {"Rahim " , "Ali" , "Yuvaraj" , "Soma"};
//        System.out.println("Display Array : ");
//        for(String ab : a3)
//        {
//            System.out.print(ab + " ");
//        }
//        
//        ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(a3));
//        System.out.println("\nArrayList : " + al1);
        
        
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Chandan");
        a1.add("Amit");
        a1.add("Ram");
        a1.add("Bikash");
        a1.add("Avijit");
        a1.add("Avinash");
        
        System.out.println("Array List : " + a1);
//        Collections.sort(a1);
//         System.out.println("Sorted Array(Assending order) : " + a1);

//       Collections.sort(a1, Collections.reverseOrder());
//       System.out.println("Sorted Array (Desending Order : " + a1);
        
//        System.out.println(a1.indexOf("Amit"));
//        System.out.println(a1.contains("Ram"));

//        System.out.println(a1.remove("Bikash"));
//        a1.removeAll(a1);
//        System.out.println("Array List after remove : " + a1);

//        Collections.swap(a1, 1, 3);
//        System.out.println("After swap : "+a1);

//        ArrayList a2 = (ArrayList)a1.clone();
//        a2.add("Sita"); 
//        System.out.println(a2);   //16-11
    }
    
    public void LinkedList1()
    {
        
//        LinkedList<String> l1 = new LinkedList<String>();
//        l1.add("Amit");
//        l1.add("Gourav");
//        l1.add("Rahul");
//        l1.add("Ali");
        
//        System.out.println("Linked List : " + l1);
        
//        LinkedList<String> l2 = new LinkedList<>();
//        l2.addAll(l1);
//        l2.add("Soma");
//        l2.add("Mizan");
//        
//        System.out.println("New Linked List : " + l2);
       
//        l2.remove(3);
//        System.out.println("New Linked List after remove : " + l2);
        
//        l2.set(2, "Deepak");
//       System.out.println("New Linked List after set : " + l2);
        
//        System.out.println("Get the value : " + l2.get(1));
//        System.out.println("Get the value : " + l2.getFirst());
//        System.out.println("Get the value : " + l2.getLast());
//        System.out.println("Get the index : " + l2.indexOf("Soma"));
//        System.out.println("Sub list: " + l2.subList(1, 5));
//        List sublist = l2.subList(2, 6);
//        System.out.println("Sub list: " + sublist);
//        sublist.add("Dipa");
//        sublist.add("Kartik");
//        System.out.println("Sub list: " + sublist);
        
        
//                            2nd
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Amit");
        l1.add("Gourav");
        l1.add("Rahul");
        l1.add("Ali");
        System.out.println("Linked List : " + l1);
//        System.out.println("Linked List remove : " + l1.remove());  //First in First Out (FIFO)
//        l1.push("Dinesh");
//        l1.push("Riya");
//        System.out.println("Linked List after push : " + l1); //Last in Fast in
       
//        System.out.println("Pop : " + l1.pop()); //last in first out.
//       System.out.println("Linked List after pop : " + l1);
//       System.out.println("Pool : " + l1.pollFirst());   //pollLast()
//       System.out.println("Linked List after poll : " + l1);
//        System.out.println("Peek : " + l1.peekLast());
//        System.out.println("Linked List after peek : " + l1);
        
    }
    
    public void HashSet1()
    {
        HashSet h1 = new HashSet();
        h1.add(10);
        h1.add("Amit");
        h1.add(78.87);
        h1.add("Ganesh");
        h1.add("Dipa");
        h1.add(101);
        
        System.out.println("HashSet : " + h1);
//        h1.remove(101);
//        System.out.println("HashSet after remove : " + h1);
//        System.out.println("Contains : "+h1.contains(78.87));
    }
    
    public void TreeSet1()
    {
        TreeSet<String> t1 = new TreeSet<>();
        t1.add("Chandan");
        t1.add("Akask");
        t1.add("Nayana");
        t1.add("Bikram");
        t1.add("Amit");
        
//        System.out.println("TreeSet : "+ t1);
        
         TreeSet<String> t2 = new TreeSet<>();
         t2.addAll(t1);
         t2.add("Goutam");
         t2.add("Bibek");
         t2.add("Sumit");
         t2.add("Rakesh");
         
         System.out.println("New Tree Set : " + t2);
         
//         System.out.println("Pool : " + t2.pollLast());
//         System.out.println("New Tree Set after pool : " + t2);
         
//         System.out.println("Floor : " + t2.floor("Bikram"));
//         System.out.println("New Tree Set after floor : " + t2);
         
    }
    
    public  void  HashMap1()
    {
        HashMap<Integer , String> h1 = new HashMap<Integer , String>();
        h1.put(101, "Dipak");
        h1.put(102, "Chandan");
        h1.put(103, "Ravi");
//        System.out.println("HashMap : "+ h1);
        HashMap<Integer , String> h2 = new HashMap<Integer , String>();
        h2.putAll(h1);
        h2.put(104, "Gouram");
        h2.put(105, "Anil");
        System.out.println("New HashMap : "+ h2);
//        System.out.println("New HashMap get : " + h2.get(104));
//        h2.remove(105);
//        System.out.println("New HashMap after remove : "+ h2);
      
    }
    
    public void Stack1()
    {
        Stack<String> s1 = new Stack<>();
        s1.add("Faizal");
        s1.add("Ali");
        s1.add("Navnit");
        s1.add("Akhil");
        
        System.out.println("Stack : " + s1);
//        System.out.println("Peek : " +s1.peek());
//        System.out.println("After peek : " + s1);
//
//        System.out.println("Pop : " +s1.pop());
//        System.out.println("After pop : " + s1);

//        System.out.println("Push: " +s1.push("Amit"));
//        System.out.println("After push : " + s1);
        
    }
    
}


public class CollectionFramework
{
    public static void main(String[] args) 
    {
        FrameworkCollection fc = new FrameworkCollection();
//        fc.ArrayList1();
        fc.LinkedList1();
//        fc.HashSet1();
//        fc.TreeSet1();
//        fc.HashMap1();
//        fc.Stack1();
    }
    
}