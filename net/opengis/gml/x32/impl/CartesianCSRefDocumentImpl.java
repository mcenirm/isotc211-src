/*
 * An XML document type.
 * Localname: cartesianCSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CartesianCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one cartesianCSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CartesianCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CartesianCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CartesianCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTESIANCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCSRef");
    
    
    /**
     * Gets the "cartesianCSRef" element
     */
    public net.opengis.gml.x32.CartesianCSPropertyType getCartesianCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().find_element_user(CARTESIANCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cartesianCSRef" element
     */
    public void setCartesianCSRef(net.opengis.gml.x32.CartesianCSPropertyType cartesianCSRef)
    {
        generatedSetterHelperImpl(cartesianCSRef, CARTESIANCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cartesianCSRef" element
     */
    public net.opengis.gml.x32.CartesianCSPropertyType addNewCartesianCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().add_element_user(CARTESIANCSREF$0);
            return target;
        }
    }
}
