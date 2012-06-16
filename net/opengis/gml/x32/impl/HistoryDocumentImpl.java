/*
 * An XML document type.
 * Localname: history
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.HistoryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one history(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class HistoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.HistoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public HistoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HISTORY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "history");
    private static final org.apache.xmlbeans.QNameSet HISTORY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "track"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "history"),
    });
    
    
    /**
     * Gets the "history" element
     */
    public net.opengis.gml.x32.HistoryPropertyType getHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.HistoryPropertyType target = null;
            target = (net.opengis.gml.x32.HistoryPropertyType)get_store().find_element_user(HISTORY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "history" element
     */
    public void setHistory(net.opengis.gml.x32.HistoryPropertyType history)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.HistoryPropertyType target = null;
            target = (net.opengis.gml.x32.HistoryPropertyType)get_store().find_element_user(HISTORY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.HistoryPropertyType)get_store().add_element_user(HISTORY$0);
            }
            target.set(history);
        }
    }
    
    /**
     * Appends and returns a new empty "history" element
     */
    public net.opengis.gml.x32.HistoryPropertyType addNewHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.HistoryPropertyType target = null;
            target = (net.opengis.gml.x32.HistoryPropertyType)get_store().add_element_user(HISTORY$0);
            return target;
        }
    }
}
