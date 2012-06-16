/*
 * XML Type:  MultiCurveType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiCurveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML MultiCurveType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class MultiCurveTypeImpl extends net.opengis.gml.x32.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.x32.MultiCurveType
{
    private static final long serialVersionUID = 1L;
    
    public MultiCurveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "curveMember");
    private static final javax.xml.namespace.QName CURVEMEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "curveMembers");
    
    
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
     * Gets the "curveMembers" element
     */
    public net.opengis.gml.x32.CurveArrayPropertyType getCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.x32.CurveArrayPropertyType)get_store().find_element_user(CURVEMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "curveMembers" element
     */
    public boolean isSetCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVEMEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "curveMembers" element
     */
    public void setCurveMembers(net.opengis.gml.x32.CurveArrayPropertyType curveMembers)
    {
        generatedSetterHelperImpl(curveMembers, CURVEMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "curveMembers" element
     */
    public net.opengis.gml.x32.CurveArrayPropertyType addNewCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveArrayPropertyType target = null;
            target = (net.opengis.gml.x32.CurveArrayPropertyType)get_store().add_element_user(CURVEMEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "curveMembers" element
     */
    public void unsetCurveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVEMEMBERS$2, 0);
        }
    }
}
