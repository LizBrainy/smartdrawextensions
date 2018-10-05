package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object for containing the properties of a row in a table.
 */
public class RowProperties {
    /**
     * The index of the row.
     */
    @SDONSerializable
    public int Index = -1;
    
    /**
     * The thickness of the row borders in 1/100". If omitted, the thickness is
     * the default for the template.
     */
    @SDONSerializable
    public double LineThick = -1.0;
    
    /**
     * The line color of the row borders as a hex RGB value or color alias. If
     * omitted, the color is the default for the template.
     */
    @SDONSerializable
    public String LineColor = null;
    
    /**
     * The pattern of the line for the row border. Must be a value from the
     * {@link LinePatterns} enum.
     */
    @SDONSerializable
    public String LinePattern = null;
    
    /**
     * The minimum height of the row in 1/100". The text in cells in the row
     * may force the row to be taller than this height.
     */
    @SDONSerializable
    public double Height = -1.0;
    
    /**
     * Makes the row not scale as the shape that contains the table grows.
     */
    @SDONSerializable
    public Boolean FixedHeight = null;
}