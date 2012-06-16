/*
 * XML Type:  CompositeCurveType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CompositeCurveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CompositeCurveType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class CompositeCurveTypeImpl extends net.opengis.gml.x32.impl.AbstractCurveTypeImpl implements net.opengis.gml.x32.CompositeCurveType
{
    private static final long serialVersionUID = 1L;
    
    public CompositeCurveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "curveMember");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "curveMember" elements
     */
    public net.opengis.gml.x32.CurvePropertyType[] getCurveMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CURVEMEMBER$0, targetList);
            net.opengis.gml.x32.CurvePropertyType[] result = new net.opengis.gml.x32.CurvePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "curveMember" element
     */
    public net.opengis.gml.x32.CurvePropertyType getCurveMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().find_element_user(CURVEMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "curveMember" element
     */
    public int sizeOfCurveMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVEMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "curveMember" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCurveMemberArray(net.opengis.gml.x32.CurvePropertyType[] curveMemberArray)
    {
        check_orphaned();
        arraySetterHelper(curveMemberArray, CURVEMEMBER$0);
    }
    
    /**
     * Sets ith "curveMember" element
     */
    public void setCurveMemberArray(int i, net.opengis.gml.x32.CurvePropertyType curveMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().find_element_user(CURVEMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(curveMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "curveMember" element
     */
    public net.opengis.gml.x32.CurvePropertyType insertNewCurveMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().insert_element_user(CURVEMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "curveMember" element
     */
    public net.opengis.gml.x32.CurvePropertyType addNewCurveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().add_element_user(CURVEMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "curveMember" element
     */
    public void removeCurveMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVEMEMBER$0, i);
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
