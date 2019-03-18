package gui;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * This class renders the Jbutton.
 * @reference ProgrammingWizards TV's Youtube java tutorials.
 */
public class ButtonRenderer extends JButton implements  TableCellRenderer
{
	private static final long serialVersionUID = 1L;

	public ButtonRenderer() 
	{
		setOpaque(true);
	}
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object obj, boolean selected, boolean focused, int row, int col) 
	{
		setText((obj == null) ? "" : obj.toString());
		return this;
	}
}
