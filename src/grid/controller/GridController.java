package grid.controller;

import grid.model.Box;
import grid.view.GridFrame;

public class GridController 
{
	private GridFrame appFrame;
	private Box[][] boxen;
	


	public GridController()
	{
		boxen = new Box[10][10];
		makeBoxen();
		appFrame = new GridFrame(this);
	}
	
	private void makeBoxen()
	{
		for(int row = 0; row < boxen.length; row++)
		{
			for(int col = 0; col < boxen[0].length; col++)
			{
				boxen[row][col] = new Box();
			}
		}
	}
	
	public void changeInfo(int row, int col, String info)
	{
		boxen[row][col].setInfo(info);
	}
	
	public void start()
	{
		
	}
	
	public Box[][] getGrid()
	{
		return boxen;
	}
	public GridFrame getFrame() {
		return appFrame;
	}

	public void setFrame(GridFrame appFrame) {
		this.appFrame = appFrame;
	}
	
}
