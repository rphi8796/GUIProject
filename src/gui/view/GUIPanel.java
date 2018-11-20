package gui.view;

import javax.swing.JPanel;
import gui.controller.GUIController;

public class GUIPanel extends JPanel
{
	private GUIController appController;
	
	public GUIPanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
