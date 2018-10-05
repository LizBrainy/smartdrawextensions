package sdonjava.model;

import sdonjava.serialization.SDONSerializable;

/**
 * Object representing a container for a hyperlink.
 */
public class Hyperlink {
    /**
     * The URL of the hyperlink.
     */
    @SDONSerializable
    public String url = null;
}