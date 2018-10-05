package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object defining of a column in a data table.
 */
public class DataTableColumn {
    /**
     * The name of the column.
     */
    @SDONSerializable
    public String Name = null;
    
    /**
     * The data type of the column. Must be one of the data types from
     * {@link DataTableDataTypes}.
     */
    @SDONSerializable
    public String Type = null;
}