package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object for containing the properties of a column in a table.
 */
public class ColumnProperties {
    /**
     * The index of the column.
     */
    @SDONSerializable
    public int Index = -1;
    
    /**
     * The thickness of the column borders in 1/100". Otherwise the thickness
     * is the default for the template.
     */
    @SDONSerializable
    public double LineThick = -1.0;
    
    /**
     * The line color of the column borders as a hex RGB value or color alias.
     * If omitted, the color is the default for the template.
     */
    @SDONSerializable
    public String LineColor = null;
    
    /**
     * The pattern of the line for the column border. Must be a value from the
     * LinePatterns enum.
     */
    @SDONSerializable
    public String LinePattern = null;
    
    /**
     * The desired width of the column in 1/100". Note any change n column N’s
     * width reduces the width of column N+1 by the same amount.
     */
    @SDONSerializable
    public double Width = -1.0;
    
    /**
     * Makes the column not scale as the shape that contains the table grows.
     */
    @SDONSerializable
    public Boolean FixedWidth = null;
}