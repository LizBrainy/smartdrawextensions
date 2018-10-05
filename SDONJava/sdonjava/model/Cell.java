package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Represets a Cell in a table.
 */
public class Cell {
    /**
     * Required. The column of the cell. Note that the first column is column 1
     * not column 0.
     */
    @SDONSerializable
    public int Column = -1;
    
    /**
     * Required. The row of the cell. Note that the first row is row 1 not row 0.
     */
    @SDONSerializable
    public int Row = -1;
    
    /**
     * The text label inside the cell.
     */
    @SDONSerializable
    public String Label = null;
    
    /**
     * The point size of the text label the specified value. If omitted, the
     * text size is the default for the template.
     */
    @SDONSerializable
    public double TextSize = -1.0;
    
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
     * The font of the text label the specified value. If omitted, the font is
     * the default for the template. Any font can be defined, but will fall
     * back to system default if font is unavailable.
     */
    @SDONSerializable
    public String TextFont = null;
    
    /**
     * The color of the text label of the cell (hex RGB value or alias). If
     * omitted, the color is the default for the template.
     */
    @SDONSerializable
    public String TextColor = null;
    
    /**
     * The fill color of the shape (hex RGB value or alias). If omitted, color
     * is the default for the template.
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
     * The number of characters shown in the cell before the text is truncated.
     */
    @SDONSerializable
    public int Truncate = -1;
    
    /**
     * A string to appear as a note attached to a cell.
     */
    @SDONSerializable
    public String Note = null;
    
    /**
     * The icon to use for the note on a cell. Defaults to a post-it note icon.
     * Other options are available in the {@link Icons} enum.
     */
    @SDONSerializable
    public String NoteIcon = null;
    
    /**
     * A hyperlink in the cell.
     */
    @SDONSerializable
    public Hyperlink Hyperlink = null;
    
    /**
     * A hyperlink for the text in the cell.
     */
    @SDONSerializable
    public Hyperlink TextHyperlink = null;
    
    /**
     * Defines the url to the image to be shown in the cell.
     */
    @SDONSerializable
    public Image Image = null;
    
    /**
     * A shape that appears inside a table cell. The cell will resize to
     * accomodate the shape and its children.
     */
    @SDONSerializable
    public Shape Shape = null;
}