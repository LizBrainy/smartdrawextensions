package sdonjava.model;

import java.util.ArrayList;

import sdonjava.serialization.SDONSerializable;

/**
 * Object that represents a row of column values in a DataTable that is
 * attached to a shape.
 */
public class DataTableShapeEntry {
    /**
     * The ID of the row.
     */
    @SDONSerializable
    public int RowID = -1;
    
    /**
     * The ID of the DataTableDefinition to use. If no ID is specified, it uses
     * the first data table defined in the Diagram object.
     */
    @SDONSerializable
    public int TableID = -1;
    
    /**
     * A list of fields that are used to populate a row in a DataTable schema
     * defined in the Diagram object.
     */
    @SDONSerializable
    public ArrayList<DataTableField> Fields = null;
}