/*
 * An XML document type.
 * Localname: GeodesicString
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeodesicStringDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one GeodesicString(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeodesicStringDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentDocumentImpl implements net.opengis.gml.x32.GeodesicStringDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeodesicStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEODESICSTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodesicString");
    private static final org.apache.xmlbeans.QNameSet GEODESICSTRING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodesicString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Geodesic"),
    });
    
    
    /**
     * Gets the "GeodesicString" element
     */
    public net.opengis.gml.x32.GeodesicStringType getGeodesicString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodesicStringType target = null;
            target = (net.opengis.gml.x32.GeodesicStringType)get_store().find_element_user(GEODESICSTRING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeodesicString" element
     */
    public void setGeodesicString(net.opengis.gml.x32.GeodesicStringType geodesicString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodesicStringType target = null;
            target = (net.opengis.gml.x32.GeodesicStringType)get_store().find_element_user(GEODESICSTRING$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.GeodesicStringType)get_store().add_element_user(GEODESICSTRING$0);
            }
            target.set(geodesicString);
        }
    }
    
    /**
     * Appends and returns a new empty "GeodesicString" element
     */
    public net.opengis.gml.x32.GeodesicStringType addNewGeodesicString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodesicStringType target = null;
            target = (net.opengis.gml.x32.GeodesicStringType)get_store().add_element_user(GEODESICSTRING$0);
            return target;
        }
    }
}
