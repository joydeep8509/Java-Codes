
package javapractice.java1;

class Generics1
{
    public <E> void printArray(E []a)   
    {
        for(int i=0; i<a.length ; i++)
        {
                System.out.print(a[i] +" ");

        }
        System.out.println("\n");
    }
	
	public static void main(String []args)
	{
		Generics1 g1 = new Generics1();
		String name1[] = {"Amit" , "Ram" , "Ravi" , "Atul" , "Soma" , "Riya"};
		g1.printArray(name1);
		
		Integer roll[] = {10 , 20 , 30 , 40 , 50 , 60};
		g1.printArray(roll);
                
                Double marks[] = {89.54 , 78.43 , 73.45 , 78.43 , 69.91 , 61.61};
		g1.printArray(marks);
	}
	
}