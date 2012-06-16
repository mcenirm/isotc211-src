/*
 * XML Type:  ConcatenatedOperationType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConcatenatedOperationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ConcatenatedOperationType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ConcatenatedOperationTypeImpl extends net.opengis.gml.x32.impl.AbstractCoordinateOperationTypeImpl implements net.opengis.gml.x32.ConcatenatedOperationType
{
    private static final long serialVersionUID = 1L;
    
    public ConcatenatedOperationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordOperation");
    private static final org.apache.xmlbeans.QNameSet COORDOPERATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesSingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordOperation"),
    });
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$2 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "coordOperation" elements
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType[] getCoordOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COORDOPERATION$1, targetList);
            net.opengis.gml.x32.CoordinateOperationPropertyType[] result = new net.opengis.gml.x32.CoordinateOperationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "coordOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType getCoordOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().find_element_user(COORDOPERATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "coordOperation" element
     */
    public int sizeOfCoordOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDOPERATION$1);
        }
    }
    
    /**
     * Sets array of all "coordOperation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCoordOperationArray(net.opengis.gml.x32.CoordinateOperationPropertyType[] coordOperationArray)
    {
        check_orphaned();
        arraySetterHelper(coordOperationArray, COORDOPERATION$0, COORDOPERATION$1);
    }
    
    /**
     * Sets ith "coordOperation" element
     */
    public void setCoordOperationArray(int i, net.opengis.gml.x32.CoordinateOperationPropertyType coordOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().find_element_user(COORDOPERATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(coordOperation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coordOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType insertNewCoordOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().insert_element_user(COORDOPERATION$1, COORDOPERATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coordOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType addNewCoordOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().add_element_user(COORDOPERATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "coordOperation" element
     */
    public void removeCoordOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDOPERATION$1, i);
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
