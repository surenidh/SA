public class Singleton{

	public static Singleton uniqueInstance = null;
	
	public Singleton(){
		System.out.println(" new instance created " );
	};

	public static Singleton getinstance(){
		if( uniqueInstance == null){
			synchronized(Singleton.class){
				uniqueInstance = new Singleton();
			}
		}
		return uniqueInstance ;
	}

	public static void main(String[] args){
		//Singleton s1 = new Singleton();
		Singleton.getinstance();
	} 

}

public static ThreadSingleton implements Runnable{


}