package grid.view;

import javax.swing.JFrame;

public class GridFrame extends JFrame 
{
	private GridController baseController;
	private GridPanel appPanel;
	
	GridFrame(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new ChatPanel(baseContoller);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("stuff");
		this.setSize(new Dimension(800, 600));
		this.setVisible(true);
	}

}
