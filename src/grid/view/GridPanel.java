package grid.view;

import javax.swing.*;
import grid.controller.GridController;
import javax.swing.table.*;
import java.awt.event.*;

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
	private JButton updateButton;
	
	private JTable gridTable;
	private JScrollPane gridPane;
	
	public GridPanel(GridController baseController)
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
		updateButton = new JButton("Update");
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		DefaultTableModel data = new DefaultTableModel(baseController.getGrid(), new String []{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
		gridTable = new JTable();
		gridTable.setModel(data);
		gridPane = new JScrollPane();
		
		gridPane.setViewportView(gridTable);
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
		this.add(updateButton);
		this.add(gridPane);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, rows, 0, SpringLayout.WEST, cols);
		baseLayout.putConstraint(SpringLayout.WEST, cols, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, cols, -228, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, info, 33, SpringLayout.SOUTH, rows);
		baseLayout.putConstraint(SpringLayout.WEST, info, 0, SpringLayout.WEST, rows);
		baseLayout.putConstraint(SpringLayout.NORTH, rows, 8, SpringLayout.SOUTH, rowsLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, rowsLabel, 6, SpringLayout.SOUTH, cols);
		baseLayout.putConstraint(SpringLayout.WEST, rowsLabel, 0, SpringLayout.WEST, cols);
		baseLayout.putConstraint(SpringLayout.WEST, colsLabel, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, colsLabel, -6, SpringLayout.NORTH, cols);baseLayout.putConstraint(SpringLayout.NORTH, updateButton, 6, SpringLayout.SOUTH, info);
		baseLayout.putConstraint(SpringLayout.WEST, updateButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, gridPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, gridPane, 160, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gridPane, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gridPane, -10, SpringLayout.EAST, this);
	}
	private  void setupListeners()
	{
		updateButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		
	}
	
	public GridController getBaseController() {
		return baseController;
	}
}
