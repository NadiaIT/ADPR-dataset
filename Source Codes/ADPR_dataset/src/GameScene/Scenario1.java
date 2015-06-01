package GameScene;

public class Scenario1 implements IScenario{

	@Override
	public void draw() {
		for(int i=0;i<3;i++){
			ITree tree= new PalmTree();
			tree.drawTree();
		}
		
		IRiver river = new NarrowRiver();
		river.drawRiver();
		
	}

}
