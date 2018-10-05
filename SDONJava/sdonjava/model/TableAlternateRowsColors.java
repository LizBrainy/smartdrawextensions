package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object that holds two color entries to alternate between while in a table.
 */
public class TableAlternateRowsColors {
    /**
     * The first color to alternate between. If omitted, the default theme
     * colors are used. Can be a hex color or a color alias.
     */
    @SDONSerializable
    public String Color1 = null;
    
    /**
     * The last color to alternate between. If omitted, the default theme
     * colors are used. Can be a hex color or a color alias.
     */
    @SDONSerializable
    public String Color2 = null;
}
