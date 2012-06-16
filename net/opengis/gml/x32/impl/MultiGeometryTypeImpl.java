/*
 * XML Type:  MultiGeometryType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiGeometryType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML MultiGeometryType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class MultiGeometryTypeImpl extends net.opengis.gml.x32.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.x32.MultiGeometryType
{
    private static final long serialVersionUID = 1L;
    
    public MultiGeometryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRYMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "geometryMember");
    private static final javax.xml.namespace.QName GEOMETRYMEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "geometryMembers");
    
    
    /**
     * Gets array of all "geometryMember" elements
     */
    public net.opengis.gml.x32.GeometryPropertyType[] getGeometryMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOMETRYMEMBER$0, targetList);
            net.opengis.gml.x32.GeometryPropertyType[] result = new net.opengis.gml.x32.GeometryPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geometryMember" element
     */
    public net.opengis.gml.x32.GeometryPropertyType getGeometryMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryPropertyType)get_store().find_element_user(GEOMETRYMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geometryMember" element
     */
    public int sizeOfGeometryMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOMETRYMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "geometryMember" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGeometryMemberArray(net.opengis.gml.x32.GeometryPropertyType[] geometryMemberArray)
    {
        check_orphaned();
        arraySetterHelper(geometryMemberArray, GEOMETRYMEMBER$0);
    }
    
    /**
     * Sets ith "geometryMember" element
     */
    public void setGeometryMemberArray(int i, net.opengis.gml.x32.GeometryPropertyType geometryMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryPropertyType)get_store().find_element_user(GEOMETRYMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geometryMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geometryMember" element
     */
    public net.opengis.gml.x32.GeometryPropertyType insertNewGeometryMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryPropertyType)get_store().insert_element_user(GEOMETRYMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geometryMember" element
     */
    public net.opengis.gml.x32.GeometryPropertyType addNewGeometryMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryPropertyType)get_store().add_element_user(GEOMETRYMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "geometryMember" element
     */
    public void removeGeometryMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOMETRYMEMBER$0, i);
        }
    }
    
    /**
     * Gets the "geometryMembers" element
     */
    public net.opengis.gml.x32.GeometryArrayPropertyType getGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryArrayPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryArrayPropertyType)get_store().find_element_user(GEOMETRYMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "geometryMembers" element
     */
    public boolean isSetGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOMETRYMEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "geometryMembers" element
     */
    public void setGeometryMembers(net.opengis.gml.x32.GeometryArrayPropertyType geometryMembers)
    {
        generatedSetterHelperImpl(geometryMembers, GEOMETRYMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geometryMembers" element
     */
    public net.opengis.gml.x32.GeometryArrayPropertyType addNewGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometryArrayPropertyType target = null;
            target = (net.opengis.gml.x32.GeometryArrayPropertyType)get_store().add_element_user(GEOMETRYMEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "geometryMembers" element
     */
    public void unsetGeometryMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOMETRYMEMBERS$2, 0);
        }
    }
}
