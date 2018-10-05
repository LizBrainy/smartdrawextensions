package sdonjava.model;

import java.util.ArrayList;

import sdonjava.serialization.SDONSerializable;

/**
 * Object that contains a reference to a DataTable defined in the Diagram
 * object. Used to fill out the schema defined in the DataTable array in the
 * Diagram object.
 */
public class DataTableInstance {
    /**
     * The name of a predefined table in the template used.
     */
    @SDONSerializable
    public String TableName = null;
    
    /**
     * The rows to insert in the pre-existing table.
     */
    @SDONSerializable
    public ArrayList<DataTableRow> Rows = null;
}