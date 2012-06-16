/*
 * XML Type:  TopoSurfaceType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoSurfaceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TopoSurfaceType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TopoSurfaceTypeImpl extends net.opengis.gml.x32.impl.AbstractTopologyTypeImpl implements net.opengis.gml.x32.TopoSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public TopoSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedFace");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "directedFace" elements
     */
    public net.opengis.gml.x32.DirectedFacePropertyType[] getDirectedFaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTEDFACE$0, targetList);
            net.opengis.gml.x32.DirectedFacePropertyType[] result = new net.opengis.gml.x32.DirectedFacePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedFace" element
     */
    public net.opengis.gml.x32.DirectedFacePropertyType getDirectedFaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().find_element_user(DIRECTEDFACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedFace" element
     */
    public int sizeOfDirectedFaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDFACE$0);
        }
    }
    
    /**
     * Sets array of all "directedFace" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDirectedFaceArray(net.opengis.gml.x32.DirectedFacePropertyType[] directedFaceArray)
    {
        check_orphaned();
        arraySetterHelper(directedFaceArray, DIRECTEDFACE$0);
    }
    
    /**
     * Sets ith "directedFace" element
     */
    public void setDirectedFaceArray(int i, net.opengis.gml.x32.DirectedFacePropertyType directedFace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().find_element_user(DIRECTEDFACE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(directedFace);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedFace" element
     */
    public net.opengis.gml.x32.DirectedFacePropertyType insertNewDirectedFace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().insert_element_user(DIRECTEDFACE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedFace" element
     */
    public net.opengis.gml.x32.DirectedFacePropertyType addNewDirectedFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().add_element_user(DIRECTEDFACE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedFace" element
     */
    public void removeDirectedFace(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDFACE$0, i);
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
