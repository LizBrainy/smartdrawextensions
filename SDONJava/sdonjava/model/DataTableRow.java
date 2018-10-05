package sdonjava.model;

import java.util.ArrayList;

import sdonjava.serialization.SDONSerializable;

/**
 * Object that represents a row of column values in a DataTable.
 */
public class DataTableRow {
    /**
     * The ID of the row.
     */
    @SDONSerializable
    public String RowID = null;
    
    /**
     * A list of fields that are used to populate a row in a DataTable schema
     * defined in the Diagram object.
     */
    @SDONSerializable
    public ArrayList<DataTableField> Fields = null;
}