/*
 * An XML document type.
 * Localname: Geodesic
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeodesicDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Geodesic(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeodesicDocumentImpl extends net.opengis.gml.x32.impl.GeodesicStringDocumentImpl implements net.opengis.gml.x32.GeodesicDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeodesicDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEODESIC$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Geodesic");
    
    
    /**
     * Gets the "Geodesic" element
     */
    public net.opengis.gml.x32.GeodesicType getGeodesic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodesicType target = null;
            target = (net.opengis.gml.x32.GeodesicType)get_store().find_element_user(GEODESIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Geodesic" element
     */
    public void setGeodesic(net.opengis.gml.x32.GeodesicType geodesic)
    {
        generatedSetterHelperImpl(geodesic, GEODESIC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Geodesic" element
     */
    public net.opengis.gml.x32.GeodesicType addNewGeodesic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodesicType target = null;
            target = (net.opengis.gml.x32.GeodesicType)get_store().add_element_user(GEODESIC$0);
            return target;
        }
    }
}
