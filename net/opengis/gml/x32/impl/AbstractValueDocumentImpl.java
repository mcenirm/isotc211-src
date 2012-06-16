/*
 * An XML document type.
 * Localname: AbstractValue
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractValueDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractValue(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractValueDocumentImpl extends net.opengis.gml.x32.impl.AbstractObjectDocumentImpl implements net.opengis.gml.x32.AbstractValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractValue");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CategoryList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValueList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "QuantityList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Category"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CountExtent"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CountList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Boolean"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CategoryExtent"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "QuantityExtent"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ValueArray"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Quantity"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Count"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BooleanList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractValue"),
    });
    
    
    /**
     * Gets the "AbstractValue" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTVALUE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractValue" element
     */
    public void setAbstractValue(org.apache.xmlbeans.XmlObject abstractValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTVALUE$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTVALUE$0);
            }
            target.set(abstractValue);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractValue" element
     */
    public org.apache.xmlbeans.XmlObject addNewAbstractValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTVALUE$0);
            return target;
        }
    }
}
