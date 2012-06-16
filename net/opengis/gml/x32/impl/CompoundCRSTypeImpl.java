/*
 * XML Type:  CompoundCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CompoundCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML CompoundCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class CompoundCRSTypeImpl extends net.opengis.gml.x32.impl.AbstractCRSTypeImpl implements net.opengis.gml.x32.CompoundCRSType
{
    private static final long serialVersionUID = 1L;
    
    public CompoundCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "componentReferenceSystem");
    private static final org.apache.xmlbeans.QNameSet COMPONENTREFERENCESYSTEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "componentReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesSingleCRS"),
    });
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "componentReferenceSystem" elements
     */
    public net.opengis.gml.x32.SingleCRSPropertyType[] getComponentReferenceSystemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENTREFERENCESYSTEM$1, targetList);
            net.opengis.gml.x32.SingleCRSPropertyType[] result = new net.opengis.gml.x32.SingleCRSPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "componentReferenceSystem" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType getComponentReferenceSystemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().find_element_user(COMPONENTREFERENCESYSTEM$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "componentReferenceSystem" element
     */
    public int sizeOfComponentReferenceSystemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTREFERENCESYSTEM$1);
        }
    }
    
    /**
     * Sets array of all "componentReferenceSystem" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setComponentReferenceSystemArray(net.opengis.gml.x32.SingleCRSPropertyType[] componentReferenceSystemArray)
    {
        check_orphaned();
        arraySetterHelper(componentReferenceSystemArray, COMPONENTREFERENCESYSTEM$0, COMPONENTREFERENCESYSTEM$1);
    }
    
    /**
     * Sets ith "componentReferenceSystem" element
     */
    public void setComponentReferenceSystemArray(int i, net.opengis.gml.x32.SingleCRSPropertyType componentReferenceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().find_element_user(COMPONENTREFERENCESYSTEM$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(componentReferenceSystem);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "componentReferenceSystem" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType insertNewComponentReferenceSystem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().insert_element_user(COMPONENTREFERENCESYSTEM$1, COMPONENTREFERENCESYSTEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "componentReferenceSystem" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType addNewComponentReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().add_element_user(COMPONENTREFERENCESYSTEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "componentReferenceSystem" element
     */
    public void removeComponentReferenceSystem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTREFERENCESYSTEM$1, i);
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
