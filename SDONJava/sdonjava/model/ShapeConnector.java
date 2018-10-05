package sdonjava.model;

import java.util.ArrayList;

import sdonjava.serialization.SDONSerializable;

/**
 * An object that contains an array of shapes that are connected to it by an
 * automatic connector. Defines an automatic connector.
 */
public class ShapeConnector {
    /**
     * Whether or not to collapse (hide) the connector. The connector is
     * collapsed initially. This applies only to tree-like diagrams (not
     * flowcharts).
     */
    @SDONSerializable
    public Boolean Collapse = null;
    
    /**
     * The direction of the connector from the parent shape.
     * <ul><li>
     * For Mind Maps this can be Left or Right for the ShapeLists connected to
     * the root shape. All other uses are ignored. The default is "Right". Mind
     * Maps ignore any more than two ShapeLists for the root shape and any more
     * than one for other shapes.
     * </li><li>
     * For Org Charts (trees) the first ShapeList connected to the root shape
     * can be in any direction and this sets the direction of the tree. The
     * default is "Down". All other values are ignored. Org charts ignore any
     * more than one ShapeList per shape.
     * </li><li>
     * For Flow Charts any shape can have multiple ShapeLists in any direction.
     * If two or more ShapeLists attached to a single shape have the same
     * direction, they are shown as a split path. The default direction for a
     * ShapeList is "Right".
     * </li></ul>
     */
    @SDONSerializable
    public String Direction = null;
    
    /**
     * The background color for text labels.
     */
    @SDONSerializable
    public String FillColor = null;
    
    /**
     * The thickness of the line in 1/100". If omitted, the thickness is the
     * default for the template.
     */
    @SDONSerializable
    public double LineThick = -1.0;
    
    /**
     * The line color of the connector as a hex RGB value. If omitted, the
     * color is the default for the template.
     */
    @SDONSerializable
    public String LineColor = null;
    
    /**
     * The pattern of the line for the connector. Must be a value from the
     * {@link LinePatterns} enum.
     */
    @SDONSerializable
    public String LinePattern = null;
    
    /**
     * The arrangement pattern of the shapes on the connector. Must be a value
     * from the {@link ShapeConnectorArrangement} enum.
     */
    @SDONSerializable
    public String Arrangement = null;
    
    /**
     * A list of shapes that are attached to the connector. The shapes are
     * attached in the order they appear in in the list.
     */
    @SDONSerializable
    public ArrayList<Shape> Shapes = null;
    
    /**
     * Defines the way the shape connector will be formatted. If omitted, the
     * template default is used.
     */
    @SDONSerializable
    public String ShapeConnectorType = null;
    
    /**
     * The arrowhead that will appear on the beginning of the line. Must be a
     * value from the {@link Arrowheads} enum.
     */
    @SDONSerializable
    public int StartArrow = -1;
    
    /**
     * The arrowhead that will appear on the end of the line. Must be a value
     * from the {@link Arrowheads} enum.
     */
    @SDONSerializable
    public int EndArrow = -1;
    
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
     * The color (hex RGB or color alias) of the text label.
     */
    @SDONSerializable
    public String TextColor = null;
    
    /**
     * The default properties for any shape on this connector.
     */
    @SDONSerializable
    public Shape DefaultShape = null;
}