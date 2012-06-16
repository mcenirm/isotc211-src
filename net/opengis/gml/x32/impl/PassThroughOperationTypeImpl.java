/*
 * XML Type:  PassThroughOperationType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PassThroughOperationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML PassThroughOperationType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class PassThroughOperationTypeImpl extends net.opengis.gml.x32.impl.AbstractCoordinateOperationTypeImpl implements net.opengis.gml.x32.PassThroughOperationType
{
    private static final long serialVersionUID = 1L;
    
    public PassThroughOperationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODIFIEDCOORDINATE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "modifiedCoordinate");
    private static final javax.xml.namespace.QName COORDOPERATION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordOperation");
    private static final org.apache.xmlbeans.QNameSet COORDOPERATION$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesSingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordOperation"),
    });
    private static final javax.xml.namespace.QName AGGREGATIONTYPE$4 = 
        new javax.xml.namespace.QName("", "aggregationType");
    
    
    /**
     * Gets array of all "modifiedCoordinate" elements
     */
    public java.math.BigInteger[] getModifiedCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MODIFIEDCOORDINATE$0, targetList);
            java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
            return result;
        }
    }
    
    /**
     * Gets ith "modifiedCoordinate" element
     */
    public java.math.BigInteger getModifiedCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "modifiedCoordinate" elements
     */
    public org.apache.xmlbeans.XmlPositiveInteger[] xgetModifiedCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MODIFIEDCOORDINATE$0, targetList);
            org.apache.xmlbeans.XmlPositiveInteger[] result = new org.apache.xmlbeans.XmlPositiveInteger[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "modifiedCoordinate" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetModifiedCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MODIFIEDCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "modifiedCoordinate" element
     */
    public int sizeOfModifiedCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDCOORDINATE$0);
        }
    }
    
    /**
     * Sets array of all "modifiedCoordinate" element
     */
    public void setModifiedCoordinateArray(java.math.BigInteger[] modifiedCoordinateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(modifiedCoordinateArray, MODIFIEDCOORDINATE$0);
        }
    }
    
    /**
     * Sets ith "modifiedCoordinate" element
     */
    public void setModifiedCoordinateArray(int i, java.math.BigInteger modifiedCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(modifiedCoordinate);
        }
    }
    
    /**
     * Sets (as xml) array of all "modifiedCoordinate" element
     */
    public void xsetModifiedCoordinateArray(org.apache.xmlbeans.XmlPositiveInteger[]modifiedCoordinateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(modifiedCoordinateArray, MODIFIEDCOORDINATE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "modifiedCoordinate" element
     */
    public void xsetModifiedCoordinateArray(int i, org.apache.xmlbeans.XmlPositiveInteger modifiedCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MODIFIEDCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(modifiedCoordinate);
        }
    }
    
    /**
     * Inserts the value as the ith "modifiedCoordinate" element
     */
    public void insertModifiedCoordinate(int i, java.math.BigInteger modifiedCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MODIFIEDCOORDINATE$0, i);
            target.setBigIntegerValue(modifiedCoordinate);
        }
    }
    
    /**
     * Appends the value as the last "modifiedCoordinate" element
     */
    public void addModifiedCoordinate(java.math.BigInteger modifiedCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIEDCOORDINATE$0);
            target.setBigIntegerValue(modifiedCoordinate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "modifiedCoordinate" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger insertNewModifiedCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().insert_element_user(MODIFIEDCOORDINATE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "modifiedCoordinate" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger addNewModifiedCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MODIFIEDCOORDINATE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "modifiedCoordinate" element
     */
    public void removeModifiedCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDCOORDINATE$0, i);
        }
    }
    
    /**
     * Gets the "coordOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType getCoordOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().find_element_user(COORDOPERATION$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordOperation" element
     */
    public void setCoordOperation(net.opengis.gml.x32.CoordinateOperationPropertyType coordOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().find_element_user(COORDOPERATION$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().add_element_user(COORDOPERATION$2);
            }
            target.set(coordOperation);
        }
    }
    
    /**
     * Appends and returns a new empty "coordOperation" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType addNewCoordOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().add_element_user(COORDOPERATION$2);
            return target;
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
