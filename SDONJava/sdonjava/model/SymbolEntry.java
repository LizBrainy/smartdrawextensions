package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * An object that maps an alias to a symbol's GUID.
 */
public class SymbolEntry {
    /**
     * The alias to give the symbol.
     */
    @SDONSerializable
    public String Name = null;
    
    /**
     * The ID of the symbol to use.
     */
    @SDONSerializable
    public String ID = null;
}
