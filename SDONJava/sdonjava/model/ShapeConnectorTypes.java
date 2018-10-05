package sdonjava.model;

/**
 * Constants table indicating the type of shape connector to generate. Changes
 * how shapes behave in the diagram.
 */
public abstract class ShapeConnectorTypes {
    /**
     * Shapes are added along an evenly-spaced horizontal or vertical shape
     * connector.
     */
    public static final String Flowchart = "Flowchart";
    
    /**
     * Shapes are added as peers to a parent shape in either a horizontal or
     * vertical arrangement.
     */
    public static final String DecisionTree = "Decisiontree";
    
    /**
     * Shapes are added as peers to a parent shape in either a horizontal or
     * vertical arrangement.
     */
    public static final String Mindmap = "Mindmap";
    
    /**
     * Shapes are added as a horizontal or vertical tree stemming from a parent
     * shape.
     */
    public static final String Orgchart = "Orgchart";
    
    /**
     * Shapes are added as a horizontal tree stemming from a parent shape.
     */
    public static final String Hierarchy = "Hierarchy";
}