/*
 * An XML document type.
 * Localname: Length
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.LengthDocument
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * A document containing one Length(@http://www.isotc211.org/2005/gco) element.
 *
 * This is a complex type.
 */
public class LengthDocumentImpl extends org.isotc211.x2005.gco.impl.MeasureDocumentImpl implements org.isotc211.x2005.gco.LengthDocument
{
    private static final long serialVersionUID = 1L;
    
    public LengthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LENGTH$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Length");
    private static final org.apache.xmlbeans.QNameSet LENGTH$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Length"),
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gco", "Distance"),
    });
    
    
    /**
     * Gets the "Length" element
     */
    public net.opengis.gml.x32.LengthType getLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().find_element_user(LENGTH$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Length" element
     */
    public void setLength(net.opengis.gml.x32.LengthType length)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().find_element_user(LENGTH$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.LengthType)get_store().add_element_user(LENGTH$0);
            }
            target.set(length);
        }
    }
    
    /**
     * Appends and returns a new empty "Length" element
     */
    public net.opengis.gml.x32.LengthType addNewLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().add_element_user(LENGTH$0);
            return target;
        }
    }
}
