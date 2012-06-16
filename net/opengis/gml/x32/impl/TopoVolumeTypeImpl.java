/*
 * XML Type:  TopoVolumeType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoVolumeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TopoVolumeType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TopoVolumeTypeImpl extends net.opengis.gml.x32.impl.AbstractTopologyTypeImpl implements net.opengis.gml.x32.TopoVolumeType
{
    private static final long serialVersionUID = 1L;
    
    public TopoVolumeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDTOPOSOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedTopoSolid");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "directedTopoSolid" elements
     */
    public net.opengis.gml.x32.DirectedTopoSolidPropertyType[] getDirectedTopoSolidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTEDTOPOSOLID$0, targetList);
            net.opengis.gml.x32.DirectedTopoSolidPropertyType[] result = new net.opengis.gml.x32.DirectedTopoSolidPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedTopoSolid" element
     */
    public net.opengis.gml.x32.DirectedTopoSolidPropertyType getDirectedTopoSolidArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.DirectedTopoSolidPropertyType)get_store().find_element_user(DIRECTEDTOPOSOLID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedTopoSolid" element
     */
    public int sizeOfDirectedTopoSolidArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDTOPOSOLID$0);
        }
    }
    
    /**
     * Sets array of all "directedTopoSolid" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDirectedTopoSolidArray(net.opengis.gml.x32.DirectedTopoSolidPropertyType[] directedTopoSolidArray)
    {
        check_orphaned();
        arraySetterHelper(directedTopoSolidArray, DIRECTEDTOPOSOLID$0);
    }
    
    /**
     * Sets ith "directedTopoSolid" element
     */
    public void setDirectedTopoSolidArray(int i, net.opengis.gml.x32.DirectedTopoSolidPropertyType directedTopoSolid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.DirectedTopoSolidPropertyType)get_store().find_element_user(DIRECTEDTOPOSOLID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(directedTopoSolid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedTopoSolid" element
     */
    public net.opengis.gml.x32.DirectedTopoSolidPropertyType insertNewDirectedTopoSolid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.DirectedTopoSolidPropertyType)get_store().insert_element_user(DIRECTEDTOPOSOLID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedTopoSolid" element
     */
    public net.opengis.gml.x32.DirectedTopoSolidPropertyType addNewDirectedTopoSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedTopoSolidPropertyType target = null;
            target = (net.opengis.gml.x32.DirectedTopoSolidPropertyType)get_store().add_element_user(DIRECTEDTOPOSOLID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedTopoSolid" element
     */
    public void removeDirectedTopoSolid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDTOPOSOLID$0, i);
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
