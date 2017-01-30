package grid.view;

import javax.swing.*;
import grid.controller.GridController;

public class GridPanel extends JPanel 
{
	private GridController baseController;
	private SpringLayout baseLayout;
	private JTextField rows;
	private JTextField cols;
	private JTextField info;
	private JLabel rowsLabel;
	private JLabel colsLabel;
	private JLabel titleLabel;
	
	GridPanel(GridController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rows = new JTextField(10);
		cols = new JTextField(10);
		info = new JTextField(10);
		rowsLabel = new JLabel("Row");
		colsLabel = new JLabel("Column");
		titleLabel = new JLabel("Title");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(rows);
		this.add(cols);
		this.add(info);
		this.add(rowsLabel);
		this.add(colsLabel);
		this.add(titleLabel);
		
	}
	private void setupLayout()
	{
		
	}
	private  void setupListeners();
}
