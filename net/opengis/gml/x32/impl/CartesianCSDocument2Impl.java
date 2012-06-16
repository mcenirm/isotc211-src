/*
 * An XML document type.
 * Localname: CartesianCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CartesianCSDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CartesianCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CartesianCSDocument2Impl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.CartesianCSDocument2
{
    private static final long serialVersionUID = 1L;
    
    public CartesianCSDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CartesianCS");
    
    
    /**
     * Gets the "CartesianCS" element
     */
    public net.opengis.gml.x32.CartesianCSType getCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSType target = null;
            target = (net.opengis.gml.x32.CartesianCSType)get_store().find_element_user(CARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CartesianCS" element
     */
    public void setCartesianCS(net.opengis.gml.x32.CartesianCSType cartesianCS)
    {
        generatedSetterHelperImpl(cartesianCS, CARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CartesianCS" element
     */
    public net.opengis.gml.x32.CartesianCSType addNewCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSType target = null;
            target = (net.opengis.gml.x32.CartesianCSType)get_store().add_element_user(CARTESIANCS$0);
            return target;
        }
    }
}
