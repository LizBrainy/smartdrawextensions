package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object that maps an alias to a hex color code.
 */
public class ColorEntry {
    /**
     * The alias to give the color.
     */
    @SDONSerializable
    public String Name = null;
    
    /**
     * The 6 or 8 character hex color, starting with the #. For example:
     * #FFFFFF is the valid entry for white. The hex color code can be RGB or
     * (8-digit) RGBA where A is the opacity of the color.
     */
    @SDONSerializable
    public String Value = null;
}