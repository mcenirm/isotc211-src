/*
 * An XML document type.
 * Localname: doubleOrNilReasonTupleList
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DoubleOrNilReasonTupleListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one doubleOrNilReasonTupleList(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DoubleOrNilReasonTupleListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DoubleOrNilReasonTupleListDocument
{
    private static final long serialVersionUID = 1L;
    
    public DoubleOrNilReasonTupleListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOUBLEORNILREASONTUPLELIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "doubleOrNilReasonTupleList");
    
    
    /**
     * Gets the "doubleOrNilReasonTupleList" element
     */
    public java.util.List getDoubleOrNilReasonTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEORNILREASONTUPLELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "doubleOrNilReasonTupleList" element
     */
    public net.opengis.gml.x32.DoubleOrNilReasonList xgetDoubleOrNilReasonTupleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DoubleOrNilReasonList target = null;
            target = (net.opengis.gml.x32.DoubleOrNilReasonList)get_store().find_element_user(DOUBLEORNILREASONTUPLELIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "doubleOrNilReasonTupleList" element
     */
    public void setDoubleOrNilReasonTupleList(java.util.List doubleOrNilReasonTupleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOUBLEORNILREASONTUPLELIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOUBLEORNILREASONTUPLELIST$0);
            }
            target.setListValue(doubleOrNilReasonTupleList);
        }
    }
    
    /**
     * Sets (as xml) the "doubleOrNilReasonTupleList" element
     */
    public void xsetDoubleOrNilReasonTupleList(net.opengis.gml.x32.DoubleOrNilReasonList doubleOrNilReasonTupleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DoubleOrNilReasonList target = null;
            target = (net.opengis.gml.x32.DoubleOrNilReasonList)get_store().find_element_user(DOUBLEORNILREASONTUPLELIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DoubleOrNilReasonList)get_store().add_element_user(DOUBLEORNILREASONTUPLELIST$0);
            }
            target.set(doubleOrNilReasonTupleList);
        }
    }
}
