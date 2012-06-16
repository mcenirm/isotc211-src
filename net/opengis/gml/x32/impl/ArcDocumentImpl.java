/*
 * An XML document type.
 * Localname: Arc
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ArcDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Arc(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ArcDocumentImpl extends net.opengis.gml.x32.impl.ArcStringDocumentImpl implements net.opengis.gml.x32.ArcDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARC$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Arc");
    private static final org.apache.xmlbeans.QNameSet ARC$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Circle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Arc"),
    });
    
    
    /**
     * Gets the "Arc" element
     */
    public net.opengis.gml.x32.ArcType getArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcType target = null;
            target = (net.opengis.gml.x32.ArcType)get_store().find_element_user(ARC$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Arc" element
     */
    public void setArc(net.opengis.gml.x32.ArcType arc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcType target = null;
            target = (net.opengis.gml.x32.ArcType)get_store().find_element_user(ARC$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ArcType)get_store().add_element_user(ARC$0);
            }
            target.set(arc);
        }
    }
    
    /**
     * Appends and returns a new empty "Arc" element
     */
    public net.opengis.gml.x32.ArcType addNewArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcType target = null;
            target = (net.opengis.gml.x32.ArcType)get_store().add_element_user(ARC$0);
            return target;
        }
    }
}
