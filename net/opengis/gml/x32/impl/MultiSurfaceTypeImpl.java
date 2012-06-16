/*
 * XML Type:  MultiSurfaceType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiSurfaceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML MultiSurfaceType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class MultiSurfaceTypeImpl extends net.opengis.gml.x32.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.x32.MultiSurfaceType
{
    private static final long serialVersionUID = 1L;
    
    public MultiSurfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURFACEMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "surfaceMember");
    private static final javax.xml.namespace.QName SURFACEMEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "surfaceMembers");
    
    
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
     * Gets the "surfaceMembers" element
     */
    public net.opengis.gml.x32.SurfaceArrayPropertyType getSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfaceArrayPropertyType)get_store().find_element_user(SURFACEMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "surfaceMembers" element
     */
    public boolean isSetSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURFACEMEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "surfaceMembers" element
     */
    public void setSurfaceMembers(net.opengis.gml.x32.SurfaceArrayPropertyType surfaceMembers)
    {
        generatedSetterHelperImpl(surfaceMembers, SURFACEMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "surfaceMembers" element
     */
    public net.opengis.gml.x32.SurfaceArrayPropertyType addNewSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfaceArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SurfaceArrayPropertyType)get_store().add_element_user(SURFACEMEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "surfaceMembers" element
     */
    public void unsetSurfaceMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURFACEMEMBERS$2, 0);
        }
    }
}
