package sdonjava.model;

/**
 * Constants table indicating what type of shape is going to be created by the
 * SDON.
 */
public abstract class ShapeTypes {
    /**
     * A rectangle with circular edges.
     */
    public static final String RoundedRectangle = "RRect";
    
    /**
     * An oval.
     */
    public static final String Oval = "Oval";
    
    /**
     * A circle.
     */
    public static final String Circle = "Circle";
    
    /**
     * A square.
     */
    public static final String Square = "Square";
    
    /**
     * A diamond.
     */
    public static final String Diamond = "Diamond";
}