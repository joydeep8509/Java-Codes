
package javapractice.java1;


public class Generics2<T> 
{
    T j;
    public void add(T t1)
    {
        j = t1;
    }
    
    public T getValue()
    {
        return j;
    }
    
    public static void main(String[] args) 
    {
        Generics2<Integer> g1 = new Generics2<Integer>();
        g1.add(12);
        
        Generics2<String> g2 = new Generics2<String>();
        g2.add("Amit");
        
        Generics2<Double> g3 = new Generics2<Double>();
        g3.add(12.34);
        
        System.out.println("Integer value : " + g1.getValue());
        System.out.println("String value : " + g2.getValue());
        System.out.println("String value : " + g3.getValue());
        
    }
}