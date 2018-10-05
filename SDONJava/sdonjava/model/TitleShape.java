package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object that represents the title of a diagram.
 */
public class TitleShape {
    /**
     * The text to put as a title for the diagram.
     */
    @SDONSerializable
    public String Label = null;
    
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
    public int TextSize = -1;
    
    /**
     * The font of the text label the specified value. If omitted, the font is
     * the default for the template. Any font can be defined, but will fall
     * back to system default if font is unavailable.
     */
    @SDONSerializable
    public String TextFont = null;
    
    /**
     * The color of the text label of the shape (hex RGB value). If omitted,
     * the color is the default for the template.
     */
    @SDONSerializable
    public String TextColor = null;
}