/*
 * XML Type:  MultiSolidType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiSolidType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML MultiSolidType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class MultiSolidTypeImpl extends net.opengis.gml.x32.impl.AbstractGeometricAggregateTypeImpl implements net.opengis.gml.x32.MultiSolidType
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "solidMember");
    private static final javax.xml.namespace.QName SOLIDMEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "solidMembers");
    
    
    /**
     * Gets array of all "solidMember" elements
     */
    public net.opengis.gml.x32.SolidPropertyType[] getSolidMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOLIDMEMBER$0, targetList);
            net.opengis.gml.x32.SolidPropertyType[] result = new net.opengis.gml.x32.SolidPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "solidMember" element
     */
    public net.opengis.gml.x32.SolidPropertyType getSolidMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidPropertyType target = null;
            target = (net.opengis.gml.x32.SolidPropertyType)get_store().find_element_user(SOLIDMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "solidMember" element
     */
    public int sizeOfSolidMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOLIDMEMBER$0);
        }
    }
    
    /**
     * Sets array of all "solidMember" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSolidMemberArray(net.opengis.gml.x32.SolidPropertyType[] solidMemberArray)
    {
        check_orphaned();
        arraySetterHelper(solidMemberArray, SOLIDMEMBER$0);
    }
    
    /**
     * Sets ith "solidMember" element
     */
    public void setSolidMemberArray(int i, net.opengis.gml.x32.SolidPropertyType solidMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidPropertyType target = null;
            target = (net.opengis.gml.x32.SolidPropertyType)get_store().find_element_user(SOLIDMEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(solidMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "solidMember" element
     */
    public net.opengis.gml.x32.SolidPropertyType insertNewSolidMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidPropertyType target = null;
            target = (net.opengis.gml.x32.SolidPropertyType)get_store().insert_element_user(SOLIDMEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "solidMember" element
     */
    public net.opengis.gml.x32.SolidPropertyType addNewSolidMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidPropertyType target = null;
            target = (net.opengis.gml.x32.SolidPropertyType)get_store().add_element_user(SOLIDMEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "solidMember" element
     */
    public void removeSolidMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOLIDMEMBER$0, i);
        }
    }
    
    /**
     * Gets the "solidMembers" element
     */
    public net.opengis.gml.x32.SolidArrayPropertyType getSolidMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SolidArrayPropertyType)get_store().find_element_user(SOLIDMEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "solidMembers" element
     */
    public boolean isSetSolidMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOLIDMEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "solidMembers" element
     */
    public void setSolidMembers(net.opengis.gml.x32.SolidArrayPropertyType solidMembers)
    {
        generatedSetterHelperImpl(solidMembers, SOLIDMEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solidMembers" element
     */
    public net.opengis.gml.x32.SolidArrayPropertyType addNewSolidMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SolidArrayPropertyType)get_store().add_element_user(SOLIDMEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "solidMembers" element
     */
    public void unsetSolidMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOLIDMEMBERS$2, 0);
        }
    }
}
