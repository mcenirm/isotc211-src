/*
 * An XML document type.
 * Localname: timeCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one timeCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TimeCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TimeCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMECS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "timeCS");
    private static final org.apache.xmlbeans.QNameSet TIMECS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesTimeCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "timeCS"),
    });
    
    
    /**
     * Gets the "timeCS" element
     */
    public net.opengis.gml.x32.TimeCSPropertyType getTimeCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCSPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCSPropertyType)get_store().find_element_user(TIMECS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "timeCS" element
     */
    public void setTimeCS(net.opengis.gml.x32.TimeCSPropertyType timeCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCSPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCSPropertyType)get_store().find_element_user(TIMECS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.TimeCSPropertyType)get_store().add_element_user(TIMECS$0);
            }
            target.set(timeCS);
        }
    }
    
    /**
     * Appends and returns a new empty "timeCS" element
     */
    public net.opengis.gml.x32.TimeCSPropertyType addNewTimeCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCSPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCSPropertyType)get_store().add_element_user(TIMECS$0);
            return target;
        }
    }
}
