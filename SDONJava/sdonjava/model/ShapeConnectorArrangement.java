package sdonjava.model;

/**
 * Describes the arrangement of shapes on a org chart or hierarchy chart.
 */
public abstract class ShapeConnectorArrangement {
    /**
     * Horizontal row of shapes.
     */
    public static final String Row = "Row";
    
    /**
     * Horizontal row of shapes with staggered distances from the parent.
     */
    public static final String Stagger = "Stagger";
    
    /**
     * A verical column of shapes to the right of the connector line.
     */
    public static final String Column = "Column";
    
    /**
     * A verical column of shapes to the left of the connector line.
     */
    public static final String LeftColumn = "LeftColumn";
    
    /**
     * A vertical column arranged with shapes on both sides of the connector line.
     */
    public static final String TwoColumn = "TwoColumn";
}