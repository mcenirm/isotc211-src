/*
 * XML Type:  ConversionType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConversionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ConversionType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ConversionTypeImpl extends net.opengis.gml.x32.impl.AbstractGeneralConversionTypeImpl implements net.opengis.gml.x32.ConversionType
{
    private static final long serialVersionUID = 1L;
    
    public ConversionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "method");
    private static final org.apache.xmlbeans.QNameSet METHOD$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "method"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesMethod"),
    });
    private static final javax.xml.namespace.QName PARAMETERVALUE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameterValue");
    private static final org.apache.xmlbeans.QNameSet PARAMETERVALUE$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "parameterValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesValue"),
    });
    
    
    /**
     * Gets the "method" element
     */
    public net.opengis.gml.x32.OperationMethodPropertyType getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodPropertyType target = null;
            target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().find_element_user(METHOD$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "method" element
     */
    public void setMethod(net.opengis.gml.x32.OperationMethodPropertyType method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodPropertyType target = null;
            target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().find_element_user(METHOD$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().add_element_user(METHOD$0);
            }
            target.set(method);
        }
    }
    
    /**
     * Appends and returns a new empty "method" element
     */
    public net.opengis.gml.x32.OperationMethodPropertyType addNewMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodPropertyType target = null;
            target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().add_element_user(METHOD$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "parameterValue" elements
     */
    public net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType[] getParameterValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAMETERVALUE$3, targetList);
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
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().find_element_user(PARAMETERVALUE$3, i);
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
            return get_store().count_elements(PARAMETERVALUE$3);
        }
    }
    
    /**
     * Sets array of all "parameterValue" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParameterValueArray(net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType[] parameterValueArray)
    {
        check_orphaned();
        arraySetterHelper(parameterValueArray, PARAMETERVALUE$2, PARAMETERVALUE$3);
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
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().find_element_user(PARAMETERVALUE$3, i);
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
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().insert_element_user(PARAMETERVALUE$3, PARAMETERVALUE$2, i);
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
            target = (net.opengis.gml.x32.AbstractGeneralParameterValuePropertyType)get_store().add_element_user(PARAMETERVALUE$2);
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
            get_store().remove_element(PARAMETERVALUE$3, i);
        }
    }
}
