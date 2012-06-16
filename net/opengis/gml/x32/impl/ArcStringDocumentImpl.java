/*
 * An XML document type.
 * Localname: ArcString
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ArcStringDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ArcString(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ArcStringDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentDocumentImpl implements net.opengis.gml.x32.ArcStringDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCSTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcString");
    private static final org.apache.xmlbeans.QNameSet ARCSTRING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Circle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Arc"),
    });
    
    
    /**
     * Gets the "ArcString" element
     */
    public net.opengis.gml.x32.ArcStringType getArcString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcStringType target = null;
            target = (net.opengis.gml.x32.ArcStringType)get_store().find_element_user(ARCSTRING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcString" element
     */
    public void setArcString(net.opengis.gml.x32.ArcStringType arcString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcStringType target = null;
            target = (net.opengis.gml.x32.ArcStringType)get_store().find_element_user(ARCSTRING$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ArcStringType)get_store().add_element_user(ARCSTRING$0);
            }
            target.set(arcString);
        }
    }
    
    /**
     * Appends and returns a new empty "ArcString" element
     */
    public net.opengis.gml.x32.ArcStringType addNewArcString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcStringType target = null;
            target = (net.opengis.gml.x32.ArcStringType)get_store().add_element_user(ARCSTRING$0);
            return target;
        }
    }
}
