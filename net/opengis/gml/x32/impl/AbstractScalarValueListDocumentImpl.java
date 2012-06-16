/*
 * An XML document type.
 * Localname: AbstractScalarValueList
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractScalarValueListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractScalarValueList(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractScalarValueListDocumentImpl extends net.opengis.gml.x32.impl.AbstractValueDocumentImpl implements net.opengis.gml.x32.AbstractScalarValueListDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractScalarValueListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSCALARVALUELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValueList");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSCALARVALUELIST$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractScalarValueList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CategoryList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "QuantityList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BooleanList"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CountList"),
    });
    
    
    /**
     * Gets the "AbstractScalarValueList" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractScalarValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTSCALARVALUELIST$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractScalarValueList" element
     */
    public void setAbstractScalarValueList(org.apache.xmlbeans.XmlObject abstractScalarValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTSCALARVALUELIST$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTSCALARVALUELIST$0);
            }
            target.set(abstractScalarValueList);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractScalarValueList" element
     */
    public org.apache.xmlbeans.XmlObject addNewAbstractScalarValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTSCALARVALUELIST$0);
            return target;
        }
    }
}
