package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * An object representing a segmented line that links two shapes.
 */
public class Return {
    /**
     * Required. The ID of the starting shape. The starting and ending shapes
     * define the direction of the line as far as any arrowhead is concerned,
     * the arrowhead touches the ending shape.
     */
    @SDONSerializable
    public int StartID = -1;
    
    /**
     * Required. The ID of the ending shape. The starting and ending shapes
     * define the direction of the line as far as any arrowhead is concerned,
     * the arrowhead touches the ending shape.
     */
    @SDONSerializable
    public int EndID = -1;
    
    /**
     * The direction the line leaves the starting shape. The default is Down. A
     * value from the {@link Directions} enum.
     */
    @SDONSerializable
    public String StartDirection = null;
    
    /**
     * The direction the line goes out the ending shape. The default is Down. A
     * value from the {@link Directions} enum.
     */
    @SDONSerializable
    public String EndDirection = null;
    
    /**
     * The pattern of the line connecting the shapes. A value from the
     * {@link LinePatterns} enum.
     */
    @SDONSerializable
    public String LinePattern = null;
    
    /**
     * The text that appears on the line.
     */
    @SDONSerializable
    public String Label = null;
    
    /**
     * The arrowhead that will appear on the beginning of the line. A value
     * from the {@link Arrowheads} enum. The default arrowhead depends on
     * the template used.
     */
    @SDONSerializable
    public int StartArrow = -1;
    
    /**
     * The arrowhead that will appear on the end of the line. A value from the
     * {@link Arrowheads} enum. The default arrowhead depends on the template
     * used.
     */
    @SDONSerializable
    public int EndArrow = -1;
    
    /**
     * The thickness of the line in 1/100". Otherwise the thickness is the
     * default for the template.
     */
    @SDONSerializable
    public double LineThick = -1.0;
    
    /**
     * Make the line color of the connector the specified RGB value or color
     * alias. Otherwise the color is the default for the template.
     */
    @SDONSerializable
    public String LineColor = null;
    
    /**
     * When set to true this creates a curved return.
     */
    @SDONSerializable
    public Boolean Curved = null;
}