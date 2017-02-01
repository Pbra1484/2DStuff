package grid.view;

import javax.swing.JFrame;
import grid.controller.GridController;
import java.awt.Dimension;

public class GridFrame extends JFrame 
{
	private GridController baseController;
	private GridPanel appPanel;
	
	public GridFrame(GridController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new GridPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Boxen and stuff");
		this.setSize(new Dimension(800, 600));
		this.setVisible(true);
	}

	public GridController getBaseController() {
		return baseController;
	}

	public GridPanel getContentPane() {
		return appPanel;
	}

}
