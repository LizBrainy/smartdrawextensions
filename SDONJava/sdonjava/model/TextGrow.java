package sdonjava.model;

/**
 * Constants table indicating how a shape will grow if it holds more text than
 * it can display.
 */
public abstract class TextGrow {
    /**
     * Adding text will cause the shape to grow proportionally vertically and
     * horizontally.
     */
    public static final String Proportional = "Proportional";
    
    /**
     * Adding text will cause the shape to grow vertically only.
     */
    public static final String Vertical = "Vertical";
    
    /**
     * Adding text will cause the shape to grow horizontally only.
     */
    public static final String Horizontal = "Horizontal";
}