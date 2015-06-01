package GameScene;

public class Scenario2 implements IScenario{

	@Override
	public void draw() {
				
		IRiver river = new WideRiver();
		river.drawRiver();
		
		for(int i=0;i<3;i++){
			ITree tree= new CoconutTree();
			tree.drawTree();
		}
		
	}
	
}
