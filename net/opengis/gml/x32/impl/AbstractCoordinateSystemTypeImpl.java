/*
 * XML Type:  AbstractCoordinateSystemType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractCoordinateSystemType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML AbstractCoordinateSystemType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class AbstractCoordinateSystemTypeImpl extends net.opengis.gml.x32.impl.IdentifiedObjectTypeImpl implements net.opengis.gml.x32.AbstractCoordinateSystemType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCoordinateSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AXIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "axis");
    private static final org.apache.xmlbeans.QNameSet AXIS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "axis"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesAxis"),
    });
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "axis" elements
     */
    public net.opengis.gml.x32.CoordinateSystemAxisPropertyType[] getAxisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AXIS$1, targetList);
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType[] result = new net.opengis.gml.x32.CoordinateSystemAxisPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "axis" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisPropertyType getAxisArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().find_element_user(AXIS$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "axis" element
     */
    public int sizeOfAxisArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AXIS$1);
        }
    }
    
    /**
     * Sets array of all "axis" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAxisArray(net.opengis.gml.x32.CoordinateSystemAxisPropertyType[] axisArray)
    {
        check_orphaned();
        arraySetterHelper(axisArray, AXIS$0, AXIS$1);
    }
    
    /**
     * Sets ith "axis" element
     */
    public void setAxisArray(int i, net.opengis.gml.x32.CoordinateSystemAxisPropertyType axis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().find_element_user(AXIS$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(axis);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axis" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisPropertyType insertNewAxis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().insert_element_user(AXIS$1, AXIS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axis" element
     */
    public net.opengis.gml.x32.CoordinateSystemAxisPropertyType addNewAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemAxisPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemAxisPropertyType)get_store().add_element_user(AXIS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "axis" element
     */
    public void removeAxis(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AXIS$1, i);
        }
    }
    
    /**
     * Gets the "aggregationType" attribute
     */
    public net.opengis.gml.x32.AggregationType.Enum getAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$2);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.AggregationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "aggregationType" attribute
     */
    public net.opengis.gml.x32.AggregationType xgetAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AggregationType target = null;
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$2);
            return target;
        }
    }
    
    /**
     * True if has "aggregationType" attribute
     */
    public boolean isSetAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AGGREGATIONTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "aggregationType" attribute
     */
    public void setAggregationType(net.opengis.gml.x32.AggregationType.Enum aggregationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGREGATIONTYPE$2);
            }
            target.setEnumValue(aggregationType);
        }
    }
    
    /**
     * Sets (as xml) the "aggregationType" attribute
     */
    public void xsetAggregationType(net.opengis.gml.x32.AggregationType aggregationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AggregationType target = null;
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$2);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AggregationType)get_store().add_attribute_user(AGGREGATIONTYPE$2);
            }
            target.set(aggregationType);
        }
    }
    
    /**
     * Unsets the "aggregationType" attribute
     */
    public void unsetAggregationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AGGREGATIONTYPE$2);
        }
    }
}
