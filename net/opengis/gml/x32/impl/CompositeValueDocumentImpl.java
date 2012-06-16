/*
 * An XML document type.
 * Localname: CompositeValue
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CompositeValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CompositeValue(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CompositeValueDocumentImpl extends net.opengis.gml.x32.impl.AbstractValueDocumentImpl implements net.opengis.gml.x32.CompositeValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompositeValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOSITEVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeValue");
    private static final org.apache.xmlbeans.QNameSet COMPOSITEVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ValueArray"),
    });
    
    
    /**
     * Gets the "CompositeValue" element
     */
    public net.opengis.gml.x32.CompositeValueType getCompositeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompositeValueType target = null;
            target = (net.opengis.gml.x32.CompositeValueType)get_store().find_element_user(COMPOSITEVALUE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompositeValue" element
     */
    public void setCompositeValue(net.opengis.gml.x32.CompositeValueType compositeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompositeValueType target = null;
            target = (net.opengis.gml.x32.CompositeValueType)get_store().find_element_user(COMPOSITEVALUE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CompositeValueType)get_store().add_element_user(COMPOSITEVALUE$0);
            }
            target.set(compositeValue);
        }
    }
    
    /**
     * Appends and returns a new empty "CompositeValue" element
     */
    public net.opengis.gml.x32.CompositeValueType addNewCompositeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompositeValueType target = null;
            target = (net.opengis.gml.x32.CompositeValueType)get_store().add_element_user(COMPOSITEVALUE$0);
            return target;
        }
    }
}
