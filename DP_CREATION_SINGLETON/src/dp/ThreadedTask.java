package dp;

public class ThreadedTask extends Thread{
		private String taskName;
		
		public ThreadedTask(String taskName) {
			this.taskName = taskName;
		}
		
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance();
			try {
				singleton.traiter(taskName);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
