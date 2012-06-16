/*
 * An XML document type.
 * Localname: cartesianCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CartesianCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one cartesianCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CartesianCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CartesianCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public CartesianCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCS");
    private static final org.apache.xmlbeans.QNameSet CARTESIANCS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesCartesianCS"),
    });
    
    
    /**
     * Gets the "cartesianCS" element
     */
    public net.opengis.gml.x32.CartesianCSPropertyType getCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().find_element_user(CARTESIANCS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cartesianCS" element
     */
    public void setCartesianCS(net.opengis.gml.x32.CartesianCSPropertyType cartesianCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().find_element_user(CARTESIANCS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().add_element_user(CARTESIANCS$0);
            }
            target.set(cartesianCS);
        }
    }
    
    /**
     * Appends and returns a new empty "cartesianCS" element
     */
    public net.opengis.gml.x32.CartesianCSPropertyType addNewCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().add_element_user(CARTESIANCS$0);
            return target;
        }
    }
}
