package sdonjava.model;

import java.util.ArrayList;

import sdonjava.serialization.SDONSerializable;

/**
 * Represents a container of shapes arranged in a grid.
 */
public class ShapeContainer {
    /**
     * The array of shapes to include in the group.
     */
    @SDONSerializable
    public ArrayList<Shape> Shapes = null;
    
    /**
     * The arrangement grid pattern. Must be a value from
     * {@link ShapeContainerArrangement}.
     */
    @SDONSerializable
    public String Arrangement = null;
    
    /**
     * This is the maximum number of rows for a "Row" arrangement before it
     * wraps to a new row, or the maximum number of columns for a Column
     * arrangement before it wraps to a new column.
     */
    @SDONSerializable
    public int Wrap = -1;
    
    /**
     * Spacing between rows in 1/100". This is inherited by child
     * ShapeContainers.
     */
    @SDONSerializable
    public int VerticalSpacing = -1;
    
    /**
     * Spacing between columns in 1/100". This is inherited by child
     * ShapeContainers.
     */
    @SDONSerializable
    public int HorizontalSpacing = -1;
    
    /**
     * Controls the positioning of shapes in a column of shapes. Must be a
     * value from {@link HorizontalAlignments}.
     */
    @SDONSerializable
    public String ShapesAlignH = null;
    
    /**
     * Controls the positioning of a shape in a row of shapes. Must be a value
     * from {@link VerticalAlignments}.
     */
    @SDONSerializable
    public String ShapesAlignV = null;
    
    /**
     * Causes the parent to be deleted after the layout is achieved. It is
     * ignored if there is no ShapeContainer.
     */
    @SDONSerializable
    public Boolean Hide = null;
    
    /**
     * The default properties for any shape in this container.
     */
    @SDONSerializable
    public Shape DefaultShape = null;
}