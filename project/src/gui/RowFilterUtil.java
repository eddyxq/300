package gui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * This class creates a row filter for Jtable
 * @reference Logicbig's java swing table row filter tutorials.
 */

public class RowFilterUtil 
{
	/**
	 * This method returns a J textfield that has been turned into a filter. When you enter a 
	 * string into the text box it will search and filter only those rows that contain said string. 
	 * @param table The J table.
	 */
    public static JTextField createRowFilter(JTable table) 
    {
        RowSorter<? extends TableModel> rs = table.getRowSorter();
        if (rs == null) 
        {
            table.setAutoCreateRowSorter(true);
            rs = table.getRowSorter();
        }

        TableRowSorter<? extends TableModel> rowSorter = (rs instanceof TableRowSorter) ? (TableRowSorter<? extends TableModel>) rs : null;

        if (rowSorter == null) 
        {
            throw new RuntimeException("Cannot find appropriate rowSorter: " + rs);
        }
        final JTextField tf = new JTextField(15);
        tf.getDocument().addDocumentListener(new DocumentListener() 
        {
            @Override
            public void insertUpdate(DocumentEvent e) 
            {
                update(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) 
            {
                update(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) 
            {
                update(e);
            }
            private void update(DocumentEvent e) 
            {
                String text = tf.getText();
                if (text.trim().length() == 0) 
                {
                    rowSorter.setRowFilter(null);
                } 
                else 
                {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
        });
        return tf;
    }
}
