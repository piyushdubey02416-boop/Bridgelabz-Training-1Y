 class Fizzbuzz1{
 public static void main (String[] args){
 int num = 20;
	System.out.println("Hello");
	if(num<0)
		System.out.println("IV");
	for(int i=1; i<num; i++)
	{
		if(i%3==0 && i%5==0)
			System.out.println("Fizzbuzz");
		else if(i%3==0)
			System.out.println("fizz");
		else if(i%5==0)
			System.out.println("buzxz");
		else
			System.out.println(i);
	}
}
}
  
 
 
 