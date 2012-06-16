/*
 * XML Type:  TopoComplexType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoComplexType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TopoComplexType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TopoComplexTypeImpl extends net.opengis.gml.x32.impl.AbstractTopologyTypeImpl implements net.opengis.gml.x32.TopoComplexType
{
    private static final long serialVersionUID = 1L;
    
    public TopoComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXIMALCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "maximalComplex");
    private static final javax.xml.namespace.QName SUPERCOMPLEX$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "superComplex");
    private static final javax.xml.namespace.QName SUBCOMPLEX$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "subComplex");
    private static final javax.xml.namespace.QName TOPOPRIMITIVEMEMBER$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "topoPrimitiveMember");
    private static final javax.xml.namespace.QName TOPOPRIMITIVEMEMBERS$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "topoPrimitiveMembers");
    private static final javax.xml.namespace.QName ISMAXIMAL$10 = 
        new javax.xml.namespace.QName("", "isMaximal");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$12 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets the "maximalComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType getMaximalComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().find_element_user(MAXIMALCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maximalComplex" element
     */
    public void setMaximalComplex(net.opengis.gml.x32.TopoComplexPropertyType maximalComplex)
    {
        generatedSetterHelperImpl(maximalComplex, MAXIMALCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maximalComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType addNewMaximalComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().add_element_user(MAXIMALCOMPLEX$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "superComplex" elements
     */
    public net.opengis.gml.x32.TopoComplexPropertyType[] getSuperComplexArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPERCOMPLEX$2, targetList);
            net.opengis.gml.x32.TopoComplexPropertyType[] result = new net.opengis.gml.x32.TopoComplexPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "superComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType getSuperComplexArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().find_element_user(SUPERCOMPLEX$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "superComplex" element
     */
    public int sizeOfSuperComplexArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPERCOMPLEX$2);
        }
    }
    
    /**
     * Sets array of all "superComplex" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSuperComplexArray(net.opengis.gml.x32.TopoComplexPropertyType[] superComplexArray)
    {
        check_orphaned();
        arraySetterHelper(superComplexArray, SUPERCOMPLEX$2);
    }
    
    /**
     * Sets ith "superComplex" element
     */
    public void setSuperComplexArray(int i, net.opengis.gml.x32.TopoComplexPropertyType superComplex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().find_element_user(SUPERCOMPLEX$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(superComplex);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "superComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType insertNewSuperComplex(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().insert_element_user(SUPERCOMPLEX$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "superComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType addNewSuperComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().add_element_user(SUPERCOMPLEX$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "superComplex" element
     */
    public void removeSuperComplex(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPERCOMPLEX$2, i);
        }
    }
    
    /**
     * Gets array of all "subComplex" elements
     */
    public net.opengis.gml.x32.TopoComplexPropertyType[] getSubComplexArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBCOMPLEX$4, targetList);
            net.opengis.gml.x32.TopoComplexPropertyType[] result = new net.opengis.gml.x32.TopoComplexPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType getSubComplexArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().find_element_user(SUBCOMPLEX$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subComplex" element
     */
    public int sizeOfSubComplexArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBCOMPLEX$4);
        }
    }
    
    /**
     * Sets array of all "subComplex" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSubComplexArray(net.opengis.gml.x32.TopoComplexPropertyType[] subComplexArray)
    {
        check_orphaned();
        arraySetterHelper(subComplexArray, SUBCOMPLEX$4);
    }
    
    /**
     * Sets ith "subComplex" element
     */
    public void setSubComplexArray(int i, net.opengis.gml.x32.TopoComplexPropertyType subComplex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().find_element_user(SUBCOMPLEX$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subComplex);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType insertNewSubComplex(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().insert_element_user(SUBCOMPLEX$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType addNewSubComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().add_element_user(SUBCOMPLEX$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "subComplex" element
     */
    public void removeSubComplex(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBCOMPLEX$4, i);
        }
    }
    
    /**
     * Gets array of all "topoPrimitiveMember" elements
     */
    public net.opengis.gml.x32.TopoPrimitiveMemberType[] getTopoPrimitiveMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOPOPRIMITIVEMEMBER$6, targetList);
            net.opengis.gml.x32.TopoPrimitiveMemberType[] result = new net.opengis.gml.x32.TopoPrimitiveMemberType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "topoPrimitiveMember" element
     */
    public net.opengis.gml.x32.TopoPrimitiveMemberType getTopoPrimitiveMemberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPrimitiveMemberType target = null;
            target = (net.opengis.gml.x32.TopoPrimitiveMemberType)get_store().find_element_user(TOPOPRIMITIVEMEMBER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "topoPrimitiveMember" element
     */
    public int sizeOfTopoPrimitiveMemberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPOPRIMITIVEMEMBER$6);
        }
    }
    
    /**
     * Sets array of all "topoPrimitiveMember" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTopoPrimitiveMemberArray(net.opengis.gml.x32.TopoPrimitiveMemberType[] topoPrimitiveMemberArray)
    {
        check_orphaned();
        arraySetterHelper(topoPrimitiveMemberArray, TOPOPRIMITIVEMEMBER$6);
    }
    
    /**
     * Sets ith "topoPrimitiveMember" element
     */
    public void setTopoPrimitiveMemberArray(int i, net.opengis.gml.x32.TopoPrimitiveMemberType topoPrimitiveMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPrimitiveMemberType target = null;
            target = (net.opengis.gml.x32.TopoPrimitiveMemberType)get_store().find_element_user(TOPOPRIMITIVEMEMBER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(topoPrimitiveMember);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "topoPrimitiveMember" element
     */
    public net.opengis.gml.x32.TopoPrimitiveMemberType insertNewTopoPrimitiveMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPrimitiveMemberType target = null;
            target = (net.opengis.gml.x32.TopoPrimitiveMemberType)get_store().insert_element_user(TOPOPRIMITIVEMEMBER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "topoPrimitiveMember" element
     */
    public net.opengis.gml.x32.TopoPrimitiveMemberType addNewTopoPrimitiveMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPrimitiveMemberType target = null;
            target = (net.opengis.gml.x32.TopoPrimitiveMemberType)get_store().add_element_user(TOPOPRIMITIVEMEMBER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "topoPrimitiveMember" element
     */
    public void removeTopoPrimitiveMember(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPOPRIMITIVEMEMBER$6, i);
        }
    }
    
    /**
     * Gets the "topoPrimitiveMembers" element
     */
    public net.opengis.gml.x32.TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPrimitiveArrayAssociationType target = null;
            target = (net.opengis.gml.x32.TopoPrimitiveArrayAssociationType)get_store().find_element_user(TOPOPRIMITIVEMEMBERS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "topoPrimitiveMembers" element
     */
    public boolean isSetTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPOPRIMITIVEMEMBERS$8) != 0;
        }
    }
    
    /**
     * Sets the "topoPrimitiveMembers" element
     */
    public void setTopoPrimitiveMembers(net.opengis.gml.x32.TopoPrimitiveArrayAssociationType topoPrimitiveMembers)
    {
        generatedSetterHelperImpl(topoPrimitiveMembers, TOPOPRIMITIVEMEMBERS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoPrimitiveMembers" element
     */
    public net.opengis.gml.x32.TopoPrimitiveArrayAssociationType addNewTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPrimitiveArrayAssociationType target = null;
            target = (net.opengis.gml.x32.TopoPrimitiveArrayAssociationType)get_store().add_element_user(TOPOPRIMITIVEMEMBERS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "topoPrimitiveMembers" element
     */
    public void unsetTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPOPRIMITIVEMEMBERS$8, 0);
        }
    }
    
    /**
     * Gets the "isMaximal" attribute
     */
    public boolean getIsMaximal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMAXIMAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISMAXIMAL$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isMaximal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsMaximal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMAXIMAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISMAXIMAL$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "isMaximal" attribute
     */
    public boolean isSetIsMaximal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISMAXIMAL$10) != null;
        }
    }
    
    /**
     * Sets the "isMaximal" attribute
     */
    public void setIsMaximal(boolean isMaximal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMAXIMAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISMAXIMAL$10);
            }
            target.setBooleanValue(isMaximal);
        }
    }
    
    /**
     * Sets (as xml) the "isMaximal" attribute
     */
    public void xsetIsMaximal(org.apache.xmlbeans.XmlBoolean isMaximal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMAXIMAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISMAXIMAL$10);
            }
            target.set(isMaximal);
        }
    }
    
    /**
     * Unsets the "isMaximal" attribute
     */
    public void unsetIsMaximal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISMAXIMAL$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$12);
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
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$12);
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
            return get_store().find_attribute_user(AGGREGATIONTYPE$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGREGATIONTYPE$12);
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
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$12);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AggregationType)get_store().add_attribute_user(AGGREGATIONTYPE$12);
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
            get_store().remove_attribute(AGGREGATIONTYPE$12);
        }
    }
}
