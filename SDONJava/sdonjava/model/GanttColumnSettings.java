package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object for containing various settings for a column in a gantt chart.
 */
public class GanttColumnSettings {
    /**
     * The title of the column in the gantt chart.
     */
    @SDONSerializable
    public String Title = null;
    
    /**
     * The width of the column.
     */
    @SDONSerializable
    public int Width = -1;
}