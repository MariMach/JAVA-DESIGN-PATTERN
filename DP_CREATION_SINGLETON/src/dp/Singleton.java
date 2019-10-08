package dp;

public class Singleton {
		private static final Singleton uniqueInstance;
		
		private int compteur;
		
		static {
			uniqueInstance = new Singleton();
		}
		
		private Singleton() {
			System.out.println("Instanciation du singleton");
		}
		
		public static Singleton getInstance() {
			return uniqueInstance;
		}
			
		public  void traiter(String taskName) throws InterruptedException {
			System.out.println("Traitement de la tache " +  taskName);
			for(int i = 1; i <=5; i++) {
				synchronized (this) {
					++compteur;
				}
				System.out.println("..." + compteur);
				Thread.sleep(1000);
			}
			
			System.out.println("Fin du traitement de la tache "+ taskName+ " Compteur = "+ compteur);
		}
}
