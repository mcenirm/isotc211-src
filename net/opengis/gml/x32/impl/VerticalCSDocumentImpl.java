/*
 * An XML document type.
 * Localname: verticalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.VerticalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one verticalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class VerticalCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.VerticalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalCS");
    private static final org.apache.xmlbeans.QNameSet VERTICALCS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "verticalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesVerticalCS"),
    });
    
    
    /**
     * Gets the "verticalCS" element
     */
    public net.opengis.gml.x32.VerticalCSPropertyType getVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().find_element_user(VERTICALCS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalCS" element
     */
    public void setVerticalCS(net.opengis.gml.x32.VerticalCSPropertyType verticalCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().find_element_user(VERTICALCS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().add_element_user(VERTICALCS$0);
            }
            target.set(verticalCS);
        }
    }
    
    /**
     * Appends and returns a new empty "verticalCS" element
     */
    public net.opengis.gml.x32.VerticalCSPropertyType addNewVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().add_element_user(VERTICALCS$0);
            return target;
        }
    }
}
