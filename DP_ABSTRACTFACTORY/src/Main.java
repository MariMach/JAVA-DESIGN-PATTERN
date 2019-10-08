
public class Main {
	
	public static void main(String[] args) {
		
		// Instanciation statique 
		AbstractFactory factory = new FactoryImplA(); 
		AbstractPlugin plugin = factory.getInstance();
		plugin.traitement();
		
		// Instanciation dynamique
		
		
	} 

}
