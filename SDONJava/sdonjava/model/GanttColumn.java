package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object for containing information about a column in a gantt chart.
 */
public class GanttColumn {
    /**
     * The name of the column. Must be a value from the 
     * {@link GanttChartColumnNames} enum.
     */
    @SDONSerializable
    public String Name = null;
    
    /**
     * The settings of the column.
     */
    @SDONSerializable
    public GanttColumnSettings Settings = null;
}