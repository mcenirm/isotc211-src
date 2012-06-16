/*
 * XML Type:  ParameterValueGroupType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ParameterValueGroupType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ParameterValueGroupType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ParameterValueGroupTypeImpl extends net.opengis.gml.x32.impl.AbstractGeneralParameterValueTypeImpl implements net.opengis.gml.x32.ParameterValueGroupType
{
    private static final long serialVersionUID = 1L;
    
    public ParameterValueGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERVALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameterValue");
    private static final org.apache.xmlbeans.QNameSet PARAMETERVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameterValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesValue"),
    });
    private static final javax.xml.namespace.QName GROUP$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "group");
    private static final org.apache.xmlbeans.QNameSet GROUP$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "group"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valuesOfGroup"),
    });
    
    
    /**
     * Gets array of all "parameterValue" elements
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType[] getParameterValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETERVALUE$1, targetList);
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType[] result = new net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parameterValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType getParameterValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().find_element_user(PARAMETERVALUE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parameterValue" element
     */
    public int sizeOfParameterValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERVALUE$1);
        }
    }
    
    /**
     * Sets array of all "parameterValue" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParameterValueArray(net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType[] parameterValueArray)
    {
        check_orphaned();
        arraySetterHelper(parameterValueArray, PARAMETERVALUE$0, PARAMETERVALUE$1);
    }
    
    /**
     * Sets ith "parameterValue" element
     */
    public void setParameterValueArray(int i, net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType parameterValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().find_element_user(PARAMETERVALUE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parameterValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameterValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType insertNewParameterValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().insert_element_user(PARAMETERVALUE$1, PARAMETERVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameterValue" element
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType addNewParameterValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType target = null;
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().add_element_user(PARAMETERVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "parameterValue" element
     */
    public void removeParameterValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERVALUE$1, i);
        }
    }
    
    /**
     * Gets the "group" element
     */
    public net.opengis.gml.x32.OperationParameterGroupPropertyType getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterGroupPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterGroupPropertyType)get_store().find_element_user(GROUP$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "group" element
     */
    public void setGroup(net.opengis.gml.x32.OperationParameterGroupPropertyType group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterGroupPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterGroupPropertyType)get_store().find_element_user(GROUP$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.OperationParameterGroupPropertyType)get_store().add_element_user(GROUP$2);
            }
            target.set(group);
        }
    }
    
    /**
     * Appends and returns a new empty "group" element
     */
    public net.opengis.gml.x32.OperationParameterGroupPropertyType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterGroupPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterGroupPropertyType)get_store().add_element_user(GROUP$2);
            return target;
        }
    }
}
