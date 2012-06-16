/*
 * XML Type:  SequenceRuleType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SequenceRuleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML SequenceRuleType(@http://www.opengis.net/gml/3.2).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.x32.SequenceRuleType.
 */
public class SequenceRuleTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.x32.SequenceRuleType
{
    private static final long serialVersionUID = 1L;
    
    public SequenceRuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected SequenceRuleTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ORDER$0 = 
        new javax.xml.namespace.QName("", "order");
    private static final javax.xml.namespace.QName AXISORDER$2 = 
        new javax.xml.namespace.QName("", "axisOrder");
    
    
    /**
     * Gets the "order" attribute
     */
    public net.opengis.gml.x32.IncrementOrder.Enum getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.IncrementOrder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "order" attribute
     */
    public net.opengis.gml.x32.IncrementOrder xgetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IncrementOrder target = null;
            target = (net.opengis.gml.x32.IncrementOrder)get_store().find_attribute_user(ORDER$0);
            return target;
        }
    }
    
    /**
     * True if has "order" attribute
     */
    public boolean isSetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORDER$0) != null;
        }
    }
    
    /**
     * Sets the "order" attribute
     */
    public void setOrder(net.opengis.gml.x32.IncrementOrder.Enum order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDER$0);
            }
            target.setEnumValue(order);
        }
    }
    
    /**
     * Sets (as xml) the "order" attribute
     */
    public void xsetOrder(net.opengis.gml.x32.IncrementOrder order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IncrementOrder target = null;
            target = (net.opengis.gml.x32.IncrementOrder)get_store().find_attribute_user(ORDER$0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.IncrementOrder)get_store().add_attribute_user(ORDER$0);
            }
            target.set(order);
        }
    }
    
    /**
     * Unsets the "order" attribute
     */
    public void unsetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORDER$0);
        }
    }
    
    /**
     * Gets the "axisOrder" attribute
     */
    public java.util.List getAxisOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXISORDER$2);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "axisOrder" attribute
     */
    public net.opengis.gml.x32.AxisDirectionList xgetAxisOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AxisDirectionList target = null;
            target = (net.opengis.gml.x32.AxisDirectionList)get_store().find_attribute_user(AXISORDER$2);
            return target;
        }
    }
    
    /**
     * True if has "axisOrder" attribute
     */
    public boolean isSetAxisOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AXISORDER$2) != null;
        }
    }
    
    /**
     * Sets the "axisOrder" attribute
     */
    public void setAxisOrder(java.util.List axisOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXISORDER$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AXISORDER$2);
            }
            target.setListValue(axisOrder);
        }
    }
    
    /**
     * Sets (as xml) the "axisOrder" attribute
     */
    public void xsetAxisOrder(net.opengis.gml.x32.AxisDirectionList axisOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AxisDirectionList target = null;
            target = (net.opengis.gml.x32.AxisDirectionList)get_store().find_attribute_user(AXISORDER$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AxisDirectionList)get_store().add_attribute_user(AXISORDER$2);
            }
            target.set(axisOrder);
        }
    }
    
    /**
     * Unsets the "axisOrder" attribute
     */
    public void unsetAxisOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AXISORDER$2);
        }
    }
}
