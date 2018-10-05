package sdonjava.model;

import java.util.ArrayList;

import sdonjava.serialization.SDONSerializable;

/**
 * The root object of an SDON document page.
 */
public class Diagram {
    /**
     * Type of diagram SDON will create. Sets the behavior of lines and shapes.
     * A value from the {@link SDONTemplates} enum.
     */
    @SDONSerializable
    public String Template = null;
    
    /**
     * The version of the SDON document.
     */
    @SDONSerializable
    public String Version = "20";
    
    /**
     * The root shape in a diagram.
     */
    @SDONSerializable
    public Shape Shape = null;
    
    /**
     * A title string centered over the diagram 1/2" above it.
     */
    @SDONSerializable
    public TitleShape Title = null;
    
    /**
     * A list of segmented lines that link shapes together.
     */
    @SDONSerializable
    public ArrayList<Return> Returns = null;
    
    /**
     * A list of mappings of color aliases to color hex codes so that the alias
     * can be used instead of the hex color code.
     */
    @SDONSerializable
    public ArrayList<ColorEntry> Colors = null;
    
    /**
     * A list of mapping of a symbol's ID (in the SmartDraw CMS) to a alias
     * that can be used in place of the Shape's ShapeType name.
     */
    @SDONSerializable
    public ArrayList<SymbolEntry> Symbols = null;
    
    /**
     * Definitions of data tables used in the diagram whose rows can be
     * referenced by a shape.
     */
    @SDONSerializable
    public ArrayList<DataTableDefinition> DataTable = null;
    
    /**
     * Options for Gantt charts if the digram is a Gantt chart.
     */
    @SDONSerializable
    public GanttOptions GanttOptions = null;
    
    /**
     * Column definitions for a Gantt chart.
     */
    @SDONSerializable
    public ArrayList<GanttColumn> GanttColumns = null;
    
    /**
     * A special data table used when making Gantt charts, defines the row
     * values and relationships that are inserted into a Gantt chart. The field
     * names for the rows in this data table must be from the
     * {@link GanttChartColumnNames} enum.
     */
    @SDONSerializable
    public DataTableInstance UseDataTable = null;
}