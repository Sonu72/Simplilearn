package package1;

public class AbstractionDemo {
public static void main(String[] args) {
		
//		Human human = new Human();//Can't do it now : abstract
		
		Keerthana keerthana = new Keerthana();
		
		keerthana.eat();
		keerthana.run();
		keerthana.breathe();
		
		Shuja shuja = new Shuja();
		shuja.eat();
		shuja.run();
		
	}

}

abstract class Human{
	abstract void eat();
	abstract void run();
	
	void breathe() {
		System.out.println("Generic breathe...");
	}
}

class Keerthana extends Human{
	@Override
	void eat() {
		System.out.println("Keerthana's own way of eating...");
		
	}
	
	@Override
	void run() {
		System.out.println("Keerthana's distinguished style of running....");
		
	}
}

class Shuja extends Human{
	@Override
	void eat() {
		System.out.println("Shuja's eat...");
		
	}
	
	@Override
	void run() {
		System.out.println("Shuja runs fast...");
		
	}

}
