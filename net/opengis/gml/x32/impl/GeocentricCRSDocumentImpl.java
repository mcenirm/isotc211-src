/*
 * An XML document type.
 * Localname: GeocentricCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeocentricCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one GeocentricCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeocentricCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractSingleCRSDocumentImpl implements net.opengis.gml.x32.GeocentricCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeocentricCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCENTRICCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeocentricCRS");
    
    
    /**
     * Gets the "GeocentricCRS" element
     */
    public net.opengis.gml.x32.GeocentricCRSType getGeocentricCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeocentricCRSType target = null;
            target = (net.opengis.gml.x32.GeocentricCRSType)get_store().find_element_user(GEOCENTRICCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeocentricCRS" element
     */
    public void setGeocentricCRS(net.opengis.gml.x32.GeocentricCRSType geocentricCRS)
    {
        generatedSetterHelperImpl(geocentricCRS, GEOCENTRICCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeocentricCRS" element
     */
    public net.opengis.gml.x32.GeocentricCRSType addNewGeocentricCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeocentricCRSType target = null;
            target = (net.opengis.gml.x32.GeocentricCRSType)get_store().add_element_user(GEOCENTRICCRS$0);
            return target;
        }
    }
}
