/*
 * XML Type:  CompositeValueType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CompositeValueType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CompositeValueType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class CompositeValueTypeImpl extends net.opengis.gml.x32.impl.AbstractGMLTypeImpl implements net.opengis.gml.x32.CompositeValueType
{
    private static final long serialVersionUID = 1L;
    
    public CompositeValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUECOMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueComponent");
    private static final javax.xml.namespace.QName VALUECOMPONENTS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueComponents");
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$4 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "valueComponent" elements
     */
    public net.opengis.gml.x32.ValuePropertyType[] getValueComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUECOMPONENT$0, targetList);
            net.opengis.gml.x32.ValuePropertyType[] result = new net.opengis.gml.x32.ValuePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "valueComponent" element
     */
    public net.opengis.gml.x32.ValuePropertyType getValueComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValuePropertyType target = null;
            target = (net.opengis.gml.x32.ValuePropertyType)get_store().find_element_user(VALUECOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "valueComponent" element
     */
    public int sizeOfValueComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECOMPONENT$0);
        }
    }
    
    /**
     * Sets array of all "valueComponent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setValueComponentArray(net.opengis.gml.x32.ValuePropertyType[] valueComponentArray)
    {
        check_orphaned();
        arraySetterHelper(valueComponentArray, VALUECOMPONENT$0);
    }
    
    /**
     * Sets ith "valueComponent" element
     */
    public void setValueComponentArray(int i, net.opengis.gml.x32.ValuePropertyType valueComponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValuePropertyType target = null;
            target = (net.opengis.gml.x32.ValuePropertyType)get_store().find_element_user(VALUECOMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(valueComponent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "valueComponent" element
     */
    public net.opengis.gml.x32.ValuePropertyType insertNewValueComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValuePropertyType target = null;
            target = (net.opengis.gml.x32.ValuePropertyType)get_store().insert_element_user(VALUECOMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "valueComponent" element
     */
    public net.opengis.gml.x32.ValuePropertyType addNewValueComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValuePropertyType target = null;
            target = (net.opengis.gml.x32.ValuePropertyType)get_store().add_element_user(VALUECOMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "valueComponent" element
     */
    public void removeValueComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECOMPONENT$0, i);
        }
    }
    
    /**
     * Gets the "valueComponents" element
     */
    public net.opengis.gml.x32.ValueArrayPropertyType getValueComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValueArrayPropertyType target = null;
            target = (net.opengis.gml.x32.ValueArrayPropertyType)get_store().find_element_user(VALUECOMPONENTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueComponents" element
     */
    public boolean isSetValueComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUECOMPONENTS$2) != 0;
        }
    }
    
    /**
     * Sets the "valueComponents" element
     */
    public void setValueComponents(net.opengis.gml.x32.ValueArrayPropertyType valueComponents)
    {
        generatedSetterHelperImpl(valueComponents, VALUECOMPONENTS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueComponents" element
     */
    public net.opengis.gml.x32.ValueArrayPropertyType addNewValueComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ValueArrayPropertyType target = null;
            target = (net.opengis.gml.x32.ValueArrayPropertyType)get_store().add_element_user(VALUECOMPONENTS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "valueComponents" element
     */
    public void unsetValueComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUECOMPONENTS$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$4);
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
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$4);
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
            return get_store().find_attribute_user(AGGREGATIONTYPE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGREGATIONTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGREGATIONTYPE$4);
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
            target = (net.opengis.gml.x32.AggregationType)get_store().find_attribute_user(AGGREGATIONTYPE$4);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AggregationType)get_store().add_attribute_user(AGGREGATIONTYPE$4);
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
            get_store().remove_attribute(AGGREGATIONTYPE$4);
        }
    }
}
