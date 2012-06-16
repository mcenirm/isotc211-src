/*
 * An XML document type.
 * Localname: baseGeodeticCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BaseGeodeticCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one baseGeodeticCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class BaseGeodeticCRSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.BaseGeodeticCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseGeodeticCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEGEODETICCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "baseGeodeticCRS");
    
    
    /**
     * Gets the "baseGeodeticCRS" element
     */
    public net.opengis.gml.x32.GeodeticCRSPropertyType getBaseGeodeticCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticCRSPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticCRSPropertyType)get_store().find_element_user(BASEGEODETICCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseGeodeticCRS" element
     */
    public void setBaseGeodeticCRS(net.opengis.gml.x32.GeodeticCRSPropertyType baseGeodeticCRS)
    {
        generatedSetterHelperImpl(baseGeodeticCRS, BASEGEODETICCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseGeodeticCRS" element
     */
    public net.opengis.gml.x32.GeodeticCRSPropertyType addNewBaseGeodeticCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticCRSPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticCRSPropertyType)get_store().add_element_user(BASEGEODETICCRS$0);
            return target;
        }
    }
}
