package sdonjava.model;

import java.util.ArrayList;

import sdonjava.serialization.SDONSerializable;

/**
 * 
 */
public class DataTableDefinition {
    /**
     * The unique identifier for the data table so it can be referenced in a
     * shape object.
     */
    @SDONSerializable
    public String ID = null;
    
    /**
     * The name to give the table.
     */
    @SDONSerializable
    public String TableName = null;
    
    /**
     * The list of column defintions in a data table. The schema of the data
     * table.
     */
    @SDONSerializable
    public ArrayList<DataTableColumn> Columns = null;
    
    /**
     * Optional. The data to populate rows in the data table with.
     */
    @SDONSerializable
    public ArrayList<DataTableRow> Rows = null;
}