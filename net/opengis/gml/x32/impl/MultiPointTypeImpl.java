/*
 * XML Type:  MultiPointType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiPointType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML MultiPointType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class MultiPointTypeImpl extends net.opengis.gml.x32.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.x32.MultiPointType
{
    private static final long serialVersionUID = 1L;
    
    public MultiPointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointMember");
    private static final javax.xml.namespace.QName POINTMEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pointMembers");
    
    
    /**
     * Gets array of all "pointMember" elements
     */
    public net.opengis.gml.x32.PointPropertyType[] getPointMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POINTMEMBER$0, targetList);
            net.opengis.gml.x32.PointPropertyType[] result = new net.opengis.gml.x32.PointPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pointMember" element
     */
    public net.opengis.gml.x32.PointPropertyType getPointMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POINTMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pointMember" element
     */
    public int sizeOfPointMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "pointMember" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPointMemberArray(net.opengis.gml.x32.PointPropertyType[] pointMemberArray)
    {
        check_orphaned();
        arraySetterHelper(pointMemberArray, POINTMEMBER$0);
    }
    
    /**
     * Sets ith "pointMember" element
     */
    public void setPointMemberArray(int i, net.opengis.gml.x32.PointPropertyType pointMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(POINTMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pointMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pointMember" element
     */
    public net.opengis.gml.x32.PointPropertyType insertNewPointMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().insert_element_user(POINTMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pointMember" element
     */
    public net.opengis.gml.x32.PointPropertyType addNewPointMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().add_element_user(POINTMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "pointMember" element
     */
    public void removePointMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTMEMBER$0, i);
        }
    }
    
    /**
     * Gets the "pointMembers" element
     */
    public net.opengis.gml.x32.PointArrayPropertyType getPointMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointArrayPropertyType target = null;
            target = (net.opengis.gml.x32.PointArrayPropertyType)get_store().find_element_user(POINTMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "pointMembers" element
     */
    public boolean isSetPointMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTMEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "pointMembers" element
     */
    public void setPointMembers(net.opengis.gml.x32.PointArrayPropertyType pointMembers)
    {
        generatedSetterHelperImpl(pointMembers, POINTMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pointMembers" element
     */
    public net.opengis.gml.x32.PointArrayPropertyType addNewPointMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointArrayPropertyType target = null;
            target = (net.opengis.gml.x32.PointArrayPropertyType)get_store().add_element_user(POINTMEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "pointMembers" element
     */
    public void unsetPointMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTMEMBERS$2, 0);
        }
    }
}
