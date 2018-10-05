package sdonjava.model;

/**
 * Constants table indicating the type of a data value in a data table column.
 */
public abstract class DataTableDataTypes {
    /**
     * The data type of a column is a string (text).
     */
    public static final String String = "String";
    
    /**
     * The data type of a column is an integer (whole number).
     */
    public static final String Int = "Int";
    
    /**
     * The data type of a column is a floating-point integer (number with a
     * decimal point).
     */
    public static final String Float = "Float";
    
    /**
     * The data type of a column is a boolean (either true or false).
     */
    public static final String Bool = "Boolean";
    
    /**
     * The daya type of a column is a date (YYYY/MM/DD).
     */
    public static final String Date = "Date";
}