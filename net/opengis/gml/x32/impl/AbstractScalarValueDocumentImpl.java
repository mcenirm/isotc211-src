/*
 * An XML document type.
 * Localname: AbstractScalarValue
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractScalarValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractScalarValue(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractScalarValueDocumentImpl extends net.opengis.gml.x32.impl.AbstractValueDocumentImpl implements net.opengis.gml.x32.AbstractScalarValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractScalarValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSCALARVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValue");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSCALARVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Boolean"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Category"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Count"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Quantity"),
    });
    
    
    /**
     * Gets the "AbstractScalarValue" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractScalarValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTSCALARVALUE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractScalarValue" element
     */
    public void setAbstractScalarValue(org.apache.xmlbeans.XmlObject abstractScalarValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTSCALARVALUE$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTSCALARVALUE$0);
            }
            target.set(abstractScalarValue);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractScalarValue" element
     */
    public org.apache.xmlbeans.XmlObject addNewAbstractScalarValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTSCALARVALUE$0);
            return target;
        }
    }
}
