package grid.view;

import javax.swing.*;
import grid.controller.GridController;
import javax.swing.table.*;

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
		
	}
	private void setupLayout()
	{
		
	}
	private  void setupListeners()
	{
		
	}
}
