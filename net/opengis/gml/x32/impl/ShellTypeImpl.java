/*
 * XML Type:  ShellType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ShellType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ShellType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ShellTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ShellType
{
    private static final long serialVersionUID = 1L;
    
    public ShellTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "surfaceMember");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "surfaceMember" elements
     */
    public net.opengis.gml.x32.SurfacePropertyType[] getSurfaceMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SURFACEMEMBER$0, targetList);
            net.opengis.gml.x32.SurfacePropertyType[] result = new net.opengis.gml.x32.SurfacePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "surfaceMember" element
     */
    public net.opengis.gml.x32.SurfacePropertyType getSurfaceMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().find_element_user(SURFACEMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "surfaceMember" element
     */
    public int sizeOfSurfaceMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACEMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "surfaceMember" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSurfaceMemberArray(net.opengis.gml.x32.SurfacePropertyType[] surfaceMemberArray)
    {
        check_orphaned();
        arraySetterHelper(surfaceMemberArray, SURFACEMEMBER$0);
    }
    
    /**
     * Sets ith "surfaceMember" element
     */
    public void setSurfaceMemberArray(int i, net.opengis.gml.x32.SurfacePropertyType surfaceMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().find_element_user(SURFACEMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(surfaceMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "surfaceMember" element
     */
    public net.opengis.gml.x32.SurfacePropertyType insertNewSurfaceMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().insert_element_user(SURFACEMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "surfaceMember" element
     */
    public net.opengis.gml.x32.SurfacePropertyType addNewSurfaceMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().add_element_user(SURFACEMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "surfaceMember" element
     */
    public void removeSurfaceMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACEMEMBER$0, i);
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
