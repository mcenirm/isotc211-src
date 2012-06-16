/*
 * XML Type:  TimeTopologyComplexType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeTopologyComplexType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimeTopologyComplexType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimeTopologyComplexTypeImpl extends net.opengis.gml.x32.impl.AbstractTimeComplexTypeImpl implements net.opengis.gml.x32.TimeTopologyComplexType
{
    private static final long serialVersionUID = 1L;
    
    public TimeTopologyComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "primitive");
    
    
    /**
     * Gets array of all "primitive" elements
     */
    public net.opengis.gml.x32.TimeTopologyPrimitivePropertyType[] getPrimitiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIMITIVE$0, targetList);
            net.opengis.gml.x32.TimeTopologyPrimitivePropertyType[] result = new net.opengis.gml.x32.TimeTopologyPrimitivePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "primitive" element
     */
    public net.opengis.gml.x32.TimeTopologyPrimitivePropertyType getPrimitiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeTopologyPrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.TimeTopologyPrimitivePropertyType)get_store().find_element_user(PRIMITIVE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "primitive" element
     */
    public int sizeOfPrimitiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMITIVE$0);
        }
    }
    
    /**
     * Sets array of all "primitive" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPrimitiveArray(net.opengis.gml.x32.TimeTopologyPrimitivePropertyType[] primitiveArray)
    {
        check_orphaned();
        arraySetterHelper(primitiveArray, PRIMITIVE$0);
    }
    
    /**
     * Sets ith "primitive" element
     */
    public void setPrimitiveArray(int i, net.opengis.gml.x32.TimeTopologyPrimitivePropertyType primitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeTopologyPrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.TimeTopologyPrimitivePropertyType)get_store().find_element_user(PRIMITIVE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(primitive);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "primitive" element
     */
    public net.opengis.gml.x32.TimeTopologyPrimitivePropertyType insertNewPrimitive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeTopologyPrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.TimeTopologyPrimitivePropertyType)get_store().insert_element_user(PRIMITIVE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "primitive" element
     */
    public net.opengis.gml.x32.TimeTopologyPrimitivePropertyType addNewPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeTopologyPrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.TimeTopologyPrimitivePropertyType)get_store().add_element_user(PRIMITIVE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "primitive" element
     */
    public void removePrimitive(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMITIVE$0, i);
        }
    }
}
