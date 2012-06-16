/*
 * An XML document type.
 * Localname: ArcStringByBulge
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ArcStringByBulgeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ArcStringByBulge(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ArcStringByBulgeDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentDocumentImpl implements net.opengis.gml.x32.ArcStringByBulgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcStringByBulgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCSTRINGBYBULGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcStringByBulge");
    private static final org.apache.xmlbeans.QNameSet ARCSTRINGBYBULGE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByBulge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcStringByBulge"),
    });
    
    
    /**
     * Gets the "ArcStringByBulge" element
     */
    public net.opengis.gml.x32.ArcStringByBulgeType getArcStringByBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcStringByBulgeType target = null;
            target = (net.opengis.gml.x32.ArcStringByBulgeType)get_store().find_element_user(ARCSTRINGBYBULGE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcStringByBulge" element
     */
    public void setArcStringByBulge(net.opengis.gml.x32.ArcStringByBulgeType arcStringByBulge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcStringByBulgeType target = null;
            target = (net.opengis.gml.x32.ArcStringByBulgeType)get_store().find_element_user(ARCSTRINGBYBULGE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ArcStringByBulgeType)get_store().add_element_user(ARCSTRINGBYBULGE$0);
            }
            target.set(arcStringByBulge);
        }
    }
    
    /**
     * Appends and returns a new empty "ArcStringByBulge" element
     */
    public net.opengis.gml.x32.ArcStringByBulgeType addNewArcStringByBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcStringByBulgeType target = null;
            target = (net.opengis.gml.x32.ArcStringByBulgeType)get_store().add_element_user(ARCSTRINGBYBULGE$0);
            return target;
        }
    }
}
