package sdonjava.model;

import java.util.ArrayList;

import sdonjava.serialization.SDONSerializable;

/**
 * Object that represents a shape in a SmartDraw diagram.
 */
public class Shape {
    /**
     * The ID of this shape. IDs are used to specify the paths of Return lines.
     * IDs arbitrary but should be unique and must be greater than zero.
     */
    @SDONSerializable
    public int ID = -1;
    
    /**
     * The text label inside the shape.
     */
    @SDONSerializable
    public String Label = null;
    
    /**
     * The type of shape. Used to change the shape from a rectangle (default)
     * to another shape. A value from the {@link ShapeTypes} enum or a value
     * from the containing diagram's symbol table.
     */
    @SDONSerializable
    public String ShapeType = null;
    
    /**
     * Makes the text label be bold with a value of true, not bold with false,
     * otherwise, if omitted, boldness follows the template default.
     */
    @SDONSerializable
    public Boolean TextBold = null;
    
    /**
     * Makes the text label be italic with a value of true, not italic with
     * false, otherwise, if omitted, italic follows the template default.
     */
    @SDONSerializable
    public Boolean TextItalic = null;
    
    /**
     * Makes the text label be underlined with a value of true, not underlined
     * with false, otherwise, if omitted, underlined follows the template
     * default.
     */
    @SDONSerializable
    public Boolean TextUnderline = null;
    
    /**
     * The point size of the text label the specified value. If omitted, the
     * text size is the default for the template.
     */
    @SDONSerializable
    public double TextSize = -1.0;
    
    /**
     * The font of the text label the specified value. If omitted, the font is
     * the default for the template. Any font can be defined, but will fall
     * back to system default if font is unavailable.
     */
    @SDONSerializable
    public String TextFont = null;
    
    /**
     * Sets the space (in 100 dpi) between the text and the outside edge of the
     * shape.
     */
    @SDONSerializable
    public int TextMargin = -1;
    
    /**
     * The color of the text label of the shape (hex RGB value or color alias).
     * If omitted, the color is the default for the template.
     */
    @SDONSerializable
    public String TextColor = null;
    
    /**
     * The fill color of the shape (hex RGB value or color alias). If omitted,
     * color is the default for the template.
     */
    @SDONSerializable
    public String FillColor = null;
    
    /**
     * Aligns the text label to the left, right or centered in the shape. If
     * omitted, the alignment is the default for the template. A value from the
     * {@link HorizontalAlignments} enum.
     */
    @SDONSerializable
    public String TextAlignH = null;
    
    /**
     * Align the text label to the top, bottom or middle in the shape. If
     * omitted, the alignment is the default for the template. A value from the
     * {@link VerticalAlignments} enum.
     */
    @SDONSerializable
    public String TextAlignV = null;
    
    /**
     * Determines the way in which a shape will grow as text is added. Values
     * must be from the {@link TextGrow} enum.
     */
    @SDONSerializable
    public String TextGrow = null;
    
    /**
     * Specifies the initial width of a shape in 1/100" before any text is
     * added. Adding more text than will fit into the shape will grow it
     * according to the TextGrow value.
     */
    @SDONSerializable
    public double MinWidth = -1.0;
    
    /**
     * Specifies the initial height of a shape in 1/100" before any text is
     * added. Adding more text than will fit into the shape will grow it
     * according to the TextGrow value.
     */
    @SDONSerializable
    public double MinHeight = -1.0;
    
    /**
     * The border thickness of the shape in 1/100". If omitted, the thickness
     * is the default for the template.
     */
    @SDONSerializable
    public double LineThick = -1.0;
    
    /**
     * The border color of the shape (hex RGB value or color alias). If
     * omitted, color is the default for the template.
     */
    @SDONSerializable
    public String LineColor = null;
    
    /**
     * A text label on the connector line segment that touches the shape.
     */
    @SDONSerializable
    public String LineLabel = null;
    
    /**
     * The pattern of the line for the connector. Must be a value from the
     * {@link LinePatterns} enum.
     */
    @SDONSerializable
    public String LinePattern = null;
    
    /**
     * Whether or not to display the shape if this shape is a parent
     * ShapeContainer to child shapes.
     */
    @SDONSerializable
    public Boolean Hide = null;
    
    /**
     * Defines the number of characters to allow in a shape before the
     * remaining text is truncated. By default nothing is truncated. Defining
     * Truncate to "-1" turns it off if on by default.
     */
    @SDONSerializable
    public int Truncate = -1;
    
    /**
     * Defines the type of connector that is coming off of this shape is the
     * parent of. Must be a value from {@link ShapeConnectorTypes}.
     */
    @SDONSerializable
    public String ShapeConnectorType = null;
    
    /**
     * A string to appear as a note attached to a shape.
     */
    @SDONSerializable
    public String Note = null;
    
    /**
     * The icon to use for the note on a shape. Defaults to a post-it note
     * icon. Other options are available in the {@link Icons} enum.
     */
    @SDONSerializable
    public String NoteIcon = null;
    
    /**
     * The list of ShapeConnectors that are attached to and branch off from
     * this shape.
     */
    @SDONSerializable
    public ArrayList<ShapeConnector> ShapeConnector = null;
    
    /**
     * A hyperlink on the shape.
     */
    @SDONSerializable
    public Hyperlink Hyperlink = null;
    
    /**
     * A hyperlink on the text in the shape.
     */
    @SDONSerializable
    public Hyperlink TextHyperlink = null;
    
    /**
     * Divides the shape up into rows and columns.
     */
    @SDONSerializable
    public Table Table = null;
    
    /**
     * An image put into the shape.
     */
    @SDONSerializable
    public Image Image = null;
    
    /**
     * Defines arrangements of shapes not connected by lines, but contained
     * inside a parent shape in rows, columns or a matrix arrangement.
     */
    @SDONSerializable
    public ShapeContainer ShapeContainer = null;
    
    /**
     * An instance of a data table that is used to attach data to a shape.
     */
    @SDONSerializable
    public DataTableShapeEntry Data = null;
}