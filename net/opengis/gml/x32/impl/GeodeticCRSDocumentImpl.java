/*
 * An XML document type.
 * Localname: GeodeticCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeodeticCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one GeodeticCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeodeticCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractSingleCRSDocumentImpl implements net.opengis.gml.x32.GeodeticCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEODETICCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticCRS");
    
    
    /**
     * Gets the "GeodeticCRS" element
     */
    public net.opengis.gml.x32.GeodeticCRSType getGeodeticCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticCRSType target = null;
            target = (net.opengis.gml.x32.GeodeticCRSType)get_store().find_element_user(GEODETICCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeodeticCRS" element
     */
    public void setGeodeticCRS(net.opengis.gml.x32.GeodeticCRSType geodeticCRS)
    {
        generatedSetterHelperImpl(geodeticCRS, GEODETICCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeodeticCRS" element
     */
    public net.opengis.gml.x32.GeodeticCRSType addNewGeodeticCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticCRSType target = null;
            target = (net.opengis.gml.x32.GeodeticCRSType)get_store().add_element_user(GEODETICCRS$0);
            return target;
        }
    }
}
