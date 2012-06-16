/*
 * An XML document type.
 * Localname: baseGeographicCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BaseGeographicCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one baseGeographicCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class BaseGeographicCRSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.BaseGeographicCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseGeographicCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEGEOGRAPHICCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "baseGeographicCRS");
    
    
    /**
     * Gets the "baseGeographicCRS" element
     */
    public net.opengis.gml.x32.GeographicCRSPropertyType getBaseGeographicCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeographicCRSPropertyType target = null;
            target = (net.opengis.gml.x32.GeographicCRSPropertyType)get_store().find_element_user(BASEGEOGRAPHICCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseGeographicCRS" element
     */
    public void setBaseGeographicCRS(net.opengis.gml.x32.GeographicCRSPropertyType baseGeographicCRS)
    {
        generatedSetterHelperImpl(baseGeographicCRS, BASEGEOGRAPHICCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseGeographicCRS" element
     */
    public net.opengis.gml.x32.GeographicCRSPropertyType addNewBaseGeographicCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeographicCRSPropertyType target = null;
            target = (net.opengis.gml.x32.GeographicCRSPropertyType)get_store().add_element_user(BASEGEOGRAPHICCRS$0);
            return target;
        }
    }
}
