/*
 * XML Type:  GridEnvelopeType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GridEnvelopeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML GridEnvelopeType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class GridEnvelopeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GridEnvelopeType
{
    private static final long serialVersionUID = 1L;
    
    public GridEnvelopeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOW$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "low");
    private static final javax.xml.namespace.QName HIGH$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "high");
    
    
    /**
     * Gets the "low" element
     */
    public java.util.List getLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "low" element
     */
    public net.opengis.gml.x32.IntegerList xgetLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IntegerList target = null;
            target = (net.opengis.gml.x32.IntegerList)get_store().find_element_user(LOW$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "low" element
     */
    public void setLow(java.util.List low)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOW$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOW$0);
            }
            target.setListValue(low);
        }
    }
    
    /**
     * Sets (as xml) the "low" element
     */
    public void xsetLow(net.opengis.gml.x32.IntegerList low)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IntegerList target = null;
            target = (net.opengis.gml.x32.IntegerList)get_store().find_element_user(LOW$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.IntegerList)get_store().add_element_user(LOW$0);
            }
            target.set(low);
        }
    }
    
    /**
     * Gets the "high" element
     */
    public java.util.List getHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIGH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "high" element
     */
    public net.opengis.gml.x32.IntegerList xgetHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IntegerList target = null;
            target = (net.opengis.gml.x32.IntegerList)get_store().find_element_user(HIGH$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "high" element
     */
    public void setHigh(java.util.List high)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIGH$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIGH$2);
            }
            target.setListValue(high);
        }
    }
    
    /**
     * Sets (as xml) the "high" element
     */
    public void xsetHigh(net.opengis.gml.x32.IntegerList high)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IntegerList target = null;
            target = (net.opengis.gml.x32.IntegerList)get_store().find_element_user(HIGH$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.IntegerList)get_store().add_element_user(HIGH$2);
            }
            target.set(high);
        }
    }
}
