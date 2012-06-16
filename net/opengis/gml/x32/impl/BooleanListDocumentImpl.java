/*
 * An XML document type.
 * Localname: BooleanList
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BooleanListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one BooleanList(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class BooleanListDocumentImpl extends net.opengis.gml.x32.impl.AbstractScalarValueListDocumentImpl implements net.opengis.gml.x32.BooleanListDocument
{
    private static final long serialVersionUID = 1L;
    
    public BooleanListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEANLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BooleanList");
    
    
    /**
     * Gets the "BooleanList" element
     */
    public java.util.List getBooleanList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "BooleanList" element
     */
    public net.opengis.gml.x32.BooleanOrNilReasonList xgetBooleanList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BooleanOrNilReasonList target = null;
            target = (net.opengis.gml.x32.BooleanOrNilReasonList)get_store().find_element_user(BOOLEANLIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BooleanList" element
     */
    public void setBooleanList(java.util.List booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANLIST$0);
            }
            target.setListValue(booleanList);
        }
    }
    
    /**
     * Sets (as xml) the "BooleanList" element
     */
    public void xsetBooleanList(net.opengis.gml.x32.BooleanOrNilReasonList booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BooleanOrNilReasonList target = null;
            target = (net.opengis.gml.x32.BooleanOrNilReasonList)get_store().find_element_user(BOOLEANLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.BooleanOrNilReasonList)get_store().add_element_user(BOOLEANLIST$0);
            }
            target.set(booleanList);
        }
    }
}
