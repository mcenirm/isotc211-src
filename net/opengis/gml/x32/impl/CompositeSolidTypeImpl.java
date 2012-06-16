/*
 * XML Type:  CompositeSolidType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CompositeSolidType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CompositeSolidType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class CompositeSolidTypeImpl extends net.opengis.gml.x32.impl.AbstractSolidTypeImpl implements net.opengis.gml.x32.CompositeSolidType
{
    private static final long serialVersionUID = 1L;
    
    public CompositeSolidTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "solidMember");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
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
