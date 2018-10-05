package sdonjava.model;

/**
 * Constants table indicating the direction of a connector.
 */
public abstract class Directions {
    /**
     * The shpes added to a connector will go from left to right.
     */
    public static final String Left = "Left";
    
    /**
     * The shapes added to a connector will go from right to left.
     */
    public static final String Right = "Right";
    
    /**
     * The shapes added to a connector will go top to bottom.
     */
    public static final String Top = "Top";
    
    /**
     * The shapes added to a connector will go bottom to top.
     */
    public static final String Bottom = "Bottom";
}