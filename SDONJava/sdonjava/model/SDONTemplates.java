package sdonjava.model;

/**
 * Constants table indicating the type of diagram SDON will create. Sets the
 * behavior of lines and shapes.
 */
public abstract class SDONTemplates {
    /**
     * The document will open as a flowchart with the flowchart SmartPanel.
     */
    public static final String Flowchart = "Flowchart";
    
    /**
     * The document will open as a mind map with the mind map SmartPanel.
     */
    public static final String MindMap = "Mindmap";
    
    /**
     * The document will open as a org chart with the org chart SmartPanel.
     */
    public static final String OrgChart = "Orgchart";
    
    /**
     * The document will open as a decision tree with the decision tree SmartPanel.
     */
    public static final String DecisionTree = "Decisiontree";
    
    /**
     * The document will open as a hierarchy diagram with the hierarchy SmartPanel.
     */
    public static final String Hierarchy = "Hierarchy";
}