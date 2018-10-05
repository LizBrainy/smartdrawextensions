package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object for containing the configuration options for a Gantt chart.
 */
public class GanttOptions {
    /**
     * Whether or not Saturday and Sunday are considered working days or if
     * they should be omitted from the Gantt chart.
     */
    @SDONSerializable
    public Boolean AllWorkingDays = null;
    
    /**
     * The holidays (by region) to include in the Gantt chart. Must be a value
     * from {@link GanttChartHolidays} enum.
     */
    @SDONSerializable
    public String Holidays = null;
}