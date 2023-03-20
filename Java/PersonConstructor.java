
public class PersonConstructor {
	PersonConstructor(){
		
			Person cristiano =new Person();
			cristiano.setName("Cristiano Ronaldo");
			cristiano.setHeight(6.1);
			cristiano.setAge(37);
			cristiano.setTall(true);
			cristiano.setWeight(85f);
			
			System.out.println(cristiano.getName());
			System.out.println(cristiano.getHeight());
			System.out.println(cristiano.getAge());
			System.out.println(cristiano.isTall());
			System.out.println(cristiano.getWeight());
			
			Person messi=new Person();
			messi.setName("Lionel Andrés Messi");
			messi.setHeight(5.7);
			messi.setAge(35);
			messi.setTall(false);
			messi.setWeight(67f);
			
			System.out.println(messi.getName());
			System.out.println(messi.getHeight());
			System.out.println(messi.getAge());
			System.out.println(messi.isTall());
			System.out.println(messi.getWeight());
			
			Person neymar =new Person();
			neymar.setName("Neymar da Silva Santos Júnior");
			neymar.setHeight(5.9);
			neymar.setAge(30);
			neymar.setTall(true);
			neymar.setWeight(70f);
			
			System.out.println(neymar.getName());
			System.out.println(neymar.getHeight());
			System.out.println(neymar.getAge());
			System.out.println(neymar.isTall());
			System.out.println(neymar.getWeight());		
	}


public static void main(String args[]) {
	PersonConstructor constructor1 =new PersonConstructor();
	
}
}
