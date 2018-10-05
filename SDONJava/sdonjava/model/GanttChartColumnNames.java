package sdonjava.model;

/**
 * Special column names for use with Gantt charts. Used when populating the
 * Diagram object's UseDataTable property.
 */
public abstract class GanttChartColumnNames {
    /**
     * Numerical index of a row. Defaults to index in the array of rows.
     */
    public static final String Row = "Row";
    
    /**
     * The description of a task. Defaults to empty.
     */
    public static final String Task = "Task";
    
    /**
     * The start date of the task in YYYY-MM-DD format. Defaults to the current
     * date.
     */
    public static final String Start = "Start";
    
    /**
     * The length of the dask in days (can be a decimal). Defaults to 5.
     */
    public static final String Length = "Length";
    
    /**
     * The end date of the task in YYYY-MM-DD format.
     */
    public static final String End = "End";
    
    /**
     * The ID of the parent task. Defaults to no parent.
     */
    public static final String Parent = "Parent";
    
    /**
     * The ID of the task that has to be completed before this task can begin
     * (a dependency).
     */
    public static final String Master = "Master";
    
    /**
     * The name of the person for the assigned task. Defaults to empty.
     */
    public static final String Person = "Person";
    
    /**
     * The percent completion of the task. Defaults to 0.
     */
    public static final String PercentComplete = "PercentComplete";
    
    /**
     * A text field used for indicating which department a task belongs to.
     * Defaults to empty.
     */
    public static final String Department = "Department";
    
    /**
     * The cost of a task. Defaults to empty.
     */
    public static final String Cost = "Cost";
    
    /**
     * A custom user text field.
     */
    public static final String Custom = "Custom";
}