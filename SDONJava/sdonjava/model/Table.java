package sdonjava.model;

import java.util.ArrayList;

import sdonjava.serialization.SDONSerializable;

/**
 * Object that represents a table that has been inserted into a shape.
 */
public class Table {
    /**
     * The number of rows in the table. This can be omitted for a default of 1
     * if there are columns defined. If neither the number of rows or columns
     * is defined, the Table object is ignored.
     */
    @SDONSerializable
    public int Rows = -1;
    
    /**
     * The number of columns in the table. This can be omitted for a default of
     * 1 if there are rows defined. If neither the number of  rows or columns
     * is defined, the Table object is ignored.
     */
    @SDONSerializable
    public int Columns = -1;
    
    /**
     * The width of the column in 1/100th inches.
     */
    @SDONSerializable
    public double ColumnWidth = -1.0;
    
    /**
     * The height of the row in 1/100th inches.
     */
    @SDONSerializable
    public double RowHeight = -1.0;
    
    /**
     * Specific properties for individual cells.
     */
    @SDONSerializable
    public ArrayList<Cell> Cells = null;
    
    /**
     * Sets up a color scheme for alternating row colors in a table.
     */
    @SDONSerializable
    public TableAlternateRowsColors AlternateRows = null;
    
    /**
     * List of elements that define a range of table cells to join into one cell.
     */
    @SDONSerializable
    public ArrayList<Join> Join = null;
    
    /**
     * Special properties of individual columns.
     */
    @SDONSerializable
    public ArrayList<ColumnProperties> ColumnProperties = null;
    
    /**
     * Special properties of individual rows.
     */
    @SDONSerializable
    public ArrayList<RowProperties> RowProperties = null;
}