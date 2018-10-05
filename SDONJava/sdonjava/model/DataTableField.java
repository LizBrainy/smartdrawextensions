package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object representing a value in a row in a data table.
 */
public class DataTableField {
    /**
     * The name of the corresponding column to add a value to.
     */
    @SDONSerializable
    public String Name = null;
    
    /**
     * The value to give the row.
     */
    @SDONSerializable
    public String Value = null;
}