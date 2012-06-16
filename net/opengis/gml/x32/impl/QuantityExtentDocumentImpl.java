/*
 * An XML document type.
 * Localname: QuantityExtent
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.QuantityExtentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one QuantityExtent(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class QuantityExtentDocumentImpl extends net.opengis.gml.x32.impl.AbstractValueDocumentImpl implements net.opengis.gml.x32.QuantityExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuantityExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITYEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "QuantityExtent");
    
    
    /**
     * Gets the "QuantityExtent" element
     */
    public net.opengis.gml.x32.QuantityExtentType getQuantityExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.QuantityExtentType target = null;
            target = (net.opengis.gml.x32.QuantityExtentType)get_store().find_element_user(QUANTITYEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuantityExtent" element
     */
    public void setQuantityExtent(net.opengis.gml.x32.QuantityExtentType quantityExtent)
    {
        generatedSetterHelperImpl(quantityExtent, QUANTITYEXTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "QuantityExtent" element
     */
    public net.opengis.gml.x32.QuantityExtentType addNewQuantityExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.QuantityExtentType target = null;
            target = (net.opengis.gml.x32.QuantityExtentType)get_store().add_element_user(QUANTITYEXTENT$0);
            return target;
        }
    }
}
