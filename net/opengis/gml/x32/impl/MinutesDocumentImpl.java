/*
 * An XML document type.
 * Localname: minutes
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MinutesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one minutes(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MinutesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MinutesDocument
{
    private static final long serialVersionUID = 1L;
    
    public MinutesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINUTES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "minutes");
    
    
    /**
     * Gets the "minutes" element
     */
    public int getMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTES$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "minutes" element
     */
    public net.opengis.gml.x32.ArcMinutesType xgetMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcMinutesType target = null;
            target = (net.opengis.gml.x32.ArcMinutesType)get_store().find_element_user(MINUTES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "minutes" element
     */
    public void setMinutes(int minutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINUTES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINUTES$0);
            }
            target.setIntValue(minutes);
        }
    }
    
    /**
     * Sets (as xml) the "minutes" element
     */
    public void xsetMinutes(net.opengis.gml.x32.ArcMinutesType minutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcMinutesType target = null;
            target = (net.opengis.gml.x32.ArcMinutesType)get_store().find_element_user(MINUTES$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ArcMinutesType)get_store().add_element_user(MINUTES$0);
            }
            target.set(minutes);
        }
    }
}
