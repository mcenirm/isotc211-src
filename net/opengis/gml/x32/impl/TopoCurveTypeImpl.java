/*
 * XML Type:  TopoCurveType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoCurveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TopoCurveType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TopoCurveTypeImpl extends net.opengis.gml.x32.impl.AbstractTopologyTypeImpl implements net.opengis.gml.x32.TopoCurveType
{
    private static final long serialVersionUID = 1L;
    
    public TopoCurveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDEDGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedEdge");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "directedEdge" elements
     */
    public net.opengis.gml.x32.DirectedEdgePropertyType[] getDirectedEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTEDEDGE$0, targetList);
            net.opengis.gml.x32.DirectedEdgePropertyType[] result = new net.opengis.gml.x32.DirectedEdgePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "directedEdge" element
     */
    public net.opengis.gml.x32.DirectedEdgePropertyType getDirectedEdgeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedEdgePropertyType)get_store().find_element_user(DIRECTEDEDGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "directedEdge" element
     */
    public int sizeOfDirectedEdgeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTEDEDGE$0);
        }
    }
    
    /**
     * Sets array of all "directedEdge" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDirectedEdgeArray(net.opengis.gml.x32.DirectedEdgePropertyType[] directedEdgeArray)
    {
        check_orphaned();
        arraySetterHelper(directedEdgeArray, DIRECTEDEDGE$0);
    }
    
    /**
     * Sets ith "directedEdge" element
     */
    public void setDirectedEdgeArray(int i, net.opengis.gml.x32.DirectedEdgePropertyType directedEdge)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedEdgePropertyType)get_store().find_element_user(DIRECTEDEDGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(directedEdge);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedEdge" element
     */
    public net.opengis.gml.x32.DirectedEdgePropertyType insertNewDirectedEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedEdgePropertyType)get_store().insert_element_user(DIRECTEDEDGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedEdge" element
     */
    public net.opengis.gml.x32.DirectedEdgePropertyType addNewDirectedEdge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedEdgePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedEdgePropertyType)get_store().add_element_user(DIRECTEDEDGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "directedEdge" element
     */
    public void removeDirectedEdge(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTEDEDGE$0, i);
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
