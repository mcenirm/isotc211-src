/*
 * An XML document type.
 * Localname: CountList
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CountListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CountList(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CountListDocumentImpl extends net.opengis.gml.x32.impl.AbstractScalarValueListDocumentImpl implements net.opengis.gml.x32.CountListDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CountList");
    
    
    /**
     * Gets the "CountList" element
     */
    public java.util.List getCountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountList" element
     */
    public net.opengis.gml.x32.IntegerOrNilReasonList xgetCountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IntegerOrNilReasonList target = null;
            target = (net.opengis.gml.x32.IntegerOrNilReasonList)get_store().find_element_user(COUNTLIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CountList" element
     */
    public void setCountList(java.util.List countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTLIST$0);
            }
            target.setListValue(countList);
        }
    }
    
    /**
     * Sets (as xml) the "CountList" element
     */
    public void xsetCountList(net.opengis.gml.x32.IntegerOrNilReasonList countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IntegerOrNilReasonList target = null;
            target = (net.opengis.gml.x32.IntegerOrNilReasonList)get_store().find_element_user(COUNTLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.IntegerOrNilReasonList)get_store().add_element_user(COUNTLIST$0);
            }
            target.set(countList);
        }
    }
}
