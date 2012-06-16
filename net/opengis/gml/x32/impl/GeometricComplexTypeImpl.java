/*
 * XML Type:  GeometricComplexType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeometricComplexType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML GeometricComplexType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class GeometricComplexTypeImpl extends net.opengis.gml.x32.impl.AbstractGeometryTypeImpl implements net.opengis.gml.x32.GeometricComplexType
{
    private static final long serialVersionUID = 1L;
    
    public GeometricComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "element");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "element" elements
     */
    public net.opengis.gml.x32.GeometricPrimitivePropertyType[] getElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ELEMENT$0, targetList);
            net.opengis.gml.x32.GeometricPrimitivePropertyType[] result = new net.opengis.gml.x32.GeometricPrimitivePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "element" element
     */
    public net.opengis.gml.x32.GeometricPrimitivePropertyType getElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometricPrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.GeometricPrimitivePropertyType)get_store().find_element_user(ELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "element" element
     */
    public int sizeOfElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEMENT$0);
        }
    }
    
    /**
     * Sets array of all "element" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setElementArray(net.opengis.gml.x32.GeometricPrimitivePropertyType[] elementArray)
    {
        check_orphaned();
        arraySetterHelper(elementArray, ELEMENT$0);
    }
    
    /**
     * Sets ith "element" element
     */
    public void setElementArray(int i, net.opengis.gml.x32.GeometricPrimitivePropertyType element)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometricPrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.GeometricPrimitivePropertyType)get_store().find_element_user(ELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(element);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "element" element
     */
    public net.opengis.gml.x32.GeometricPrimitivePropertyType insertNewElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometricPrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.GeometricPrimitivePropertyType)get_store().insert_element_user(ELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "element" element
     */
    public net.opengis.gml.x32.GeometricPrimitivePropertyType addNewElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometricPrimitivePropertyType target = null;
            target = (net.opengis.gml.x32.GeometricPrimitivePropertyType)get_store().add_element_user(ELEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "element" element
     */
    public void removeElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEMENT$0, i);
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
