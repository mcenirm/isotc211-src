/*
 * XML Type:  OperationParameterGroupType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OperationParameterGroupType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML OperationParameterGroupType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class OperationParameterGroupTypeImpl extends net.opengis.gml.x32.impl.AbstractGeneralOperationParameterTypeImpl implements net.opengis.gml.x32.OperationParameterGroupType
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXIMUMOCCURS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "maximumOccurs");
    private static final javax.xml.namespace.QName PARAMETER$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameter");
    private static final org.apache.xmlbeans.QNameSet PARAMETER$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "generalOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameter"),
    });
    
    
    /**
     * Gets the "maximumOccurs" element
     */
    public java.math.BigInteger getMaximumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMOCCURS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "maximumOccurs" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetMaximumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXIMUMOCCURS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "maximumOccurs" element
     */
    public boolean isSetMaximumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMUMOCCURS$0) != 0;
        }
    }
    
    /**
     * Sets the "maximumOccurs" element
     */
    public void setMaximumOccurs(java.math.BigInteger maximumOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMOCCURS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUMOCCURS$0);
            }
            target.setBigIntegerValue(maximumOccurs);
        }
    }
    
    /**
     * Sets (as xml) the "maximumOccurs" element
     */
    public void xsetMaximumOccurs(org.apache.xmlbeans.XmlPositiveInteger maximumOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MAXIMUMOCCURS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MAXIMUMOCCURS$0);
            }
            target.set(maximumOccurs);
        }
    }
    
    /**
     * Unsets the "maximumOccurs" element
     */
    public void unsetMaximumOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMUMOCCURS$0, 0);
        }
    }
    
    /**
     * Gets array of all "parameter" elements
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType[] getParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETER$3, targetList);
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType[] result = new net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType getParameterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(PARAMETER$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameter" element
     */
    public int sizeOfParameterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETER$3);
        }
    }
    
    /**
     * Sets array of all "parameter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParameterArray(net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType[] parameterArray)
    {
        check_orphaned();
        arraySetterHelper(parameterArray, PARAMETER$2, PARAMETER$3);
    }
    
    /**
     * Sets ith "parameter" element
     */
    public void setParameterArray(int i, net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().find_element_user(PARAMETER$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType insertNewParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().insert_element_user(PARAMETER$3, PARAMETER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    public net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType)get_store().add_element_user(PARAMETER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameter" element
     */
    public void removeParameter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETER$3, i);
        }
    }
}
