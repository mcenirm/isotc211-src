/*
 * XML Type:  BagType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BagType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML BagType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class BagTypeImpl extends net.opengis.gml.x32.impl.AbstractGMLTypeImpl implements net.opengis.gml.x32.BagType
{
    private static final long serialVersionUID = 1L;
    
    public BagTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "member");
    private static final javax.xml.namespace.QName MEMBERS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "members");
    
    
    /**
     * Gets array of all "member" elements
     */
    public net.opengis.gml.x32.AssociationRoleType[] getMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEMBER$0, targetList);
            net.opengis.gml.x32.AssociationRoleType[] result = new net.opengis.gml.x32.AssociationRoleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "member" element
     */
    public net.opengis.gml.x32.AssociationRoleType getMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "member" element
     */
    public int sizeOfMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBER$0);
        }
    }
    
    /**
     * Sets array of all "member" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMemberArray(net.opengis.gml.x32.AssociationRoleType[] memberArray)
    {
        check_orphaned();
        arraySetterHelper(memberArray, MEMBER$0);
    }
    
    /**
     * Sets ith "member" element
     */
    public void setMemberArray(int i, net.opengis.gml.x32.AssociationRoleType member)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().find_element_user(MEMBER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(member);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "member" element
     */
    public net.opengis.gml.x32.AssociationRoleType insertNewMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().insert_element_user(MEMBER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "member" element
     */
    public net.opengis.gml.x32.AssociationRoleType addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().add_element_user(MEMBER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "member" element
     */
    public void removeMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBER$0, i);
        }
    }
    
    /**
     * Gets the "members" element
     */
    public net.opengis.gml.x32.ArrayAssociationType getMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArrayAssociationType target = null;
            target = (net.opengis.gml.x32.ArrayAssociationType)get_store().find_element_user(MEMBERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "members" element
     */
    public boolean isSetMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEMBERS$2) != 0;
        }
    }
    
    /**
     * Sets the "members" element
     */
    public void setMembers(net.opengis.gml.x32.ArrayAssociationType members)
    {
        generatedSetterHelperImpl(members, MEMBERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "members" element
     */
    public net.opengis.gml.x32.ArrayAssociationType addNewMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArrayAssociationType target = null;
            target = (net.opengis.gml.x32.ArrayAssociationType)get_store().add_element_user(MEMBERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "members" element
     */
    public void unsetMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEMBERS$2, 0);
        }
    }
}
