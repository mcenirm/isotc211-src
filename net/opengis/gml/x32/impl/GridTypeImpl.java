/*
 * XML Type:  GridType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GridType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML GridType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class GridTypeImpl extends net.opengis.gml.x32.impl.AbstractGeometryTypeImpl implements net.opengis.gml.x32.GridType
{
    private static final long serialVersionUID = 1L;
    
    public GridTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIMITS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "limits");
    private static final javax.xml.namespace.QName AXISLABELS2$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "axisLabels");
    private static final javax.xml.namespace.QName AXISNAME$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "axisName");
    private static final javax.xml.namespace.QName DIMENSION$6 = 
        new javax.xml.namespace.QName("", "dimension");
    
    
    /**
     * Gets the "limits" element
     */
    public net.opengis.gml.x32.GridLimitsType getLimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridLimitsType target = null;
            target = (net.opengis.gml.x32.GridLimitsType)get_store().find_element_user(LIMITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "limits" element
     */
    public void setLimits(net.opengis.gml.x32.GridLimitsType limits)
    {
        generatedSetterHelperImpl(limits, LIMITS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "limits" element
     */
    public net.opengis.gml.x32.GridLimitsType addNewLimits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GridLimitsType target = null;
            target = (net.opengis.gml.x32.GridLimitsType)get_store().add_element_user(LIMITS$0);
            return target;
        }
    }
    
    /**
     * Gets the "axisLabels" element
     */
    public java.util.List getAxisLabels2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AXISLABELS2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "axisLabels" element
     */
    public net.opengis.gml.x32.NCNameList xgetAxisLabels2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NCNameList target = null;
            target = (net.opengis.gml.x32.NCNameList)get_store().find_element_user(AXISLABELS2$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "axisLabels" element
     */
    public boolean isSetAxisLabels2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AXISLABELS2$2) != 0;
        }
    }
    
    /**
     * Sets the "axisLabels" element
     */
    public void setAxisLabels2(java.util.List axisLabels2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AXISLABELS2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AXISLABELS2$2);
            }
            target.setListValue(axisLabels2);
        }
    }
    
    /**
     * Sets (as xml) the "axisLabels" element
     */
    public void xsetAxisLabels2(net.opengis.gml.x32.NCNameList axisLabels2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NCNameList target = null;
            target = (net.opengis.gml.x32.NCNameList)get_store().find_element_user(AXISLABELS2$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.NCNameList)get_store().add_element_user(AXISLABELS2$2);
            }
            target.set(axisLabels2);
        }
    }
    
    /**
     * Unsets the "axisLabels" element
     */
    public void unsetAxisLabels2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AXISLABELS2$2, 0);
        }
    }
    
    /**
     * Gets array of all "axisName" elements
     */
    public java.lang.String[] getAxisNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AXISNAME$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "axisName" element
     */
    public java.lang.String getAxisNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AXISNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "axisName" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetAxisNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AXISNAME$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "axisName" element
     */
    public org.apache.xmlbeans.XmlString xgetAxisNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AXISNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "axisName" element
     */
    public int sizeOfAxisNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AXISNAME$4);
        }
    }
    
    /**
     * Sets array of all "axisName" element
     */
    public void setAxisNameArray(java.lang.String[] axisNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(axisNameArray, AXISNAME$4);
        }
    }
    
    /**
     * Sets ith "axisName" element
     */
    public void setAxisNameArray(int i, java.lang.String axisName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AXISNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(axisName);
        }
    }
    
    /**
     * Sets (as xml) array of all "axisName" element
     */
    public void xsetAxisNameArray(org.apache.xmlbeans.XmlString[]axisNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(axisNameArray, AXISNAME$4);
        }
    }
    
    /**
     * Sets (as xml) ith "axisName" element
     */
    public void xsetAxisNameArray(int i, org.apache.xmlbeans.XmlString axisName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AXISNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(axisName);
        }
    }
    
    /**
     * Inserts the value as the ith "axisName" element
     */
    public void insertAxisName(int i, java.lang.String axisName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AXISNAME$4, i);
            target.setStringValue(axisName);
        }
    }
    
    /**
     * Appends the value as the last "axisName" element
     */
    public void addAxisName(java.lang.String axisName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AXISNAME$4);
            target.setStringValue(axisName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axisName" element
     */
    public org.apache.xmlbeans.XmlString insertNewAxisName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(AXISNAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axisName" element
     */
    public org.apache.xmlbeans.XmlString addNewAxisName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AXISNAME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "axisName" element
     */
    public void removeAxisName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AXISNAME$4, i);
        }
    }
    
    /**
     * Gets the "dimension" attribute
     */
    public java.math.BigInteger getDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "dimension" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DIMENSION$6);
            return target;
        }
    }
    
    /**
     * Sets the "dimension" attribute
     */
    public void setDimension(java.math.BigInteger dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIMENSION$6);
            }
            target.setBigIntegerValue(dimension);
        }
    }
    
    /**
     * Sets (as xml) the "dimension" attribute
     */
    public void xsetDimension(org.apache.xmlbeans.XmlPositiveInteger dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DIMENSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(DIMENSION$6);
            }
            target.set(dimension);
        }
    }
}
