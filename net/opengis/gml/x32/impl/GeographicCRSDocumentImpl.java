/*
 * An XML document type.
 * Localname: GeographicCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeographicCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one GeographicCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeographicCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractSingleCRSDocumentImpl implements net.opengis.gml.x32.GeographicCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeographicCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeographicCRS");
    
    
    /**
     * Gets the "GeographicCRS" element
     */
    public net.opengis.gml.x32.GeographicCRSType getGeographicCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeographicCRSType target = null;
            target = (net.opengis.gml.x32.GeographicCRSType)get_store().find_element_user(GEOGRAPHICCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeographicCRS" element
     */
    public void setGeographicCRS(net.opengis.gml.x32.GeographicCRSType geographicCRS)
    {
        generatedSetterHelperImpl(geographicCRS, GEOGRAPHICCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeographicCRS" element
     */
    public net.opengis.gml.x32.GeographicCRSType addNewGeographicCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeographicCRSType target = null;
            target = (net.opengis.gml.x32.GeographicCRSType)get_store().add_element_user(GEOGRAPHICCRS$0);
            return target;
        }
    }
}
