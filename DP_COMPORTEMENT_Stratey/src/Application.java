
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context ctx = new Context();
		ctx.setStrategy(new StrategyImpl1());
		ctx.appliquerStrategy();
		
		ctx.setStrategy(new StrategyImpl2());
		ctx.appliquerStrategy();
		
		ctx.setStrategy(new StrategyImpl3());
		ctx.appliquerStrategy();
	}
} 
