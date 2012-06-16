/*
 * XML Type:  ParameterValueType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ParameterValueType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ParameterValueType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ParameterValueTypeImpl extends net.opengis.gml.x32.impl.AbstractGeneralParameterValueTypeImpl implements net.opengis.gml.x32.ParameterValueType
{
    private static final long serialVersionUID = 1L;
    
    public ParameterValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "value");
    private static final javax.xml.namespace.QName DMSANGLEVALUE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dmsAngleValue");
    private static final javax.xml.namespace.QName STRINGVALUE1$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "stringValue");
    private static final javax.xml.namespace.QName INTEGERVALUE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "integerValue");
    private static final javax.xml.namespace.QName BOOLEANVALUE1$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "booleanValue");
    private static final javax.xml.namespace.QName VALUELIST$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueList");
    private static final javax.xml.namespace.QName INTEGERVALUELIST$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "integerValueList");
    private static final javax.xml.namespace.QName VALUEFILE$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueFile");
    private static final javax.xml.namespace.QName OPERATIONPARAMETER$16 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "operationParameter");
    private static final org.apache.xmlbeans.QNameSet OPERATIONPARAMETER$17 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valueOfParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "operationParameter"),
    });
    
    
    /**
     * Gets the "value" element
     */
    public net.opengis.gml.x32.MeasureType getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(net.opengis.gml.x32.MeasureType value)
    {
        generatedSetterHelperImpl(value, VALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public net.opengis.gml.x32.MeasureType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$0, 0);
        }
    }
    
    /**
     * Gets the "dmsAngleValue" element
     */
    public net.opengis.gml.x32.DMSAngleType getDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DMSAngleType target = null;
            target = (net.opengis.gml.x32.DMSAngleType)get_store().find_element_user(DMSANGLEVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dmsAngleValue" element
     */
    public boolean isSetDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DMSANGLEVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "dmsAngleValue" element
     */
    public void setDmsAngleValue(net.opengis.gml.x32.DMSAngleType dmsAngleValue)
    {
        generatedSetterHelperImpl(dmsAngleValue, DMSANGLEVALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dmsAngleValue" element
     */
    public net.opengis.gml.x32.DMSAngleType addNewDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DMSAngleType target = null;
            target = (net.opengis.gml.x32.DMSAngleType)get_store().add_element_user(DMSANGLEVALUE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dmsAngleValue" element
     */
    public void unsetDmsAngleValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DMSANGLEVALUE$2, 0);
        }
    }
    
    /**
     * Gets the "stringValue" element
     */
    public java.lang.String getStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stringValue" element
     */
    public org.apache.xmlbeans.XmlString xgetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "stringValue" element
     */
    public boolean isSetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRINGVALUE1$4) != 0;
        }
    }
    
    /**
     * Sets the "stringValue" element
     */
    public void setStringValue1(java.lang.String stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGVALUE1$4);
            }
            target.setStringValue(stringValue1);
        }
    }
    
    /**
     * Sets (as xml) the "stringValue" element
     */
    public void xsetStringValue1(org.apache.xmlbeans.XmlString stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGVALUE1$4);
            }
            target.set(stringValue1);
        }
    }
    
    /**
     * Unsets the "stringValue" element
     */
    public void unsetStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRINGVALUE1$4, 0);
        }
    }
    
    /**
     * Gets the "integerValue" element
     */
    public java.math.BigInteger getIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "integerValue" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INTEGERVALUE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "integerValue" element
     */
    public boolean isSetIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTEGERVALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "integerValue" element
     */
    public void setIntegerValue(java.math.BigInteger integerValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERVALUE$6);
            }
            target.setBigIntegerValue(integerValue);
        }
    }
    
    /**
     * Sets (as xml) the "integerValue" element
     */
    public void xsetIntegerValue(org.apache.xmlbeans.XmlPositiveInteger integerValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INTEGERVALUE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(INTEGERVALUE$6);
            }
            target.set(integerValue);
        }
    }
    
    /**
     * Unsets the "integerValue" element
     */
    public void unsetIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTEGERVALUE$6, 0);
        }
    }
    
    /**
     * Gets the "booleanValue" element
     */
    public boolean getBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "booleanValue" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "booleanValue" element
     */
    public boolean isSetBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLEANVALUE1$8) != 0;
        }
    }
    
    /**
     * Sets the "booleanValue" element
     */
    public void setBooleanValue1(boolean booleanValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANVALUE1$8);
            }
            target.setBooleanValue(booleanValue1);
        }
    }
    
    /**
     * Sets (as xml) the "booleanValue" element
     */
    public void xsetBooleanValue1(org.apache.xmlbeans.XmlBoolean booleanValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANVALUE1$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEANVALUE1$8);
            }
            target.set(booleanValue1);
        }
    }
    
    /**
     * Unsets the "booleanValue" element
     */
    public void unsetBooleanValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLEANVALUE1$8, 0);
        }
    }
    
    /**
     * Gets the "valueList" element
     */
    public net.opengis.gml.x32.MeasureListType getValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureListType target = null;
            target = (net.opengis.gml.x32.MeasureListType)get_store().find_element_user(VALUELIST$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueList" element
     */
    public boolean isSetValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUELIST$10) != 0;
        }
    }
    
    /**
     * Sets the "valueList" element
     */
    public void setValueList(net.opengis.gml.x32.MeasureListType valueList)
    {
        generatedSetterHelperImpl(valueList, VALUELIST$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueList" element
     */
    public net.opengis.gml.x32.MeasureListType addNewValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureListType target = null;
            target = (net.opengis.gml.x32.MeasureListType)get_store().add_element_user(VALUELIST$10);
            return target;
        }
    }
    
    /**
     * Unsets the "valueList" element
     */
    public void unsetValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUELIST$10, 0);
        }
    }
    
    /**
     * Gets the "integerValueList" element
     */
    public java.util.List getIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUELIST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "integerValueList" element
     */
    public net.opengis.gml.x32.IntegerList xgetIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IntegerList target = null;
            target = (net.opengis.gml.x32.IntegerList)get_store().find_element_user(INTEGERVALUELIST$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "integerValueList" element
     */
    public boolean isSetIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTEGERVALUELIST$12) != 0;
        }
    }
    
    /**
     * Sets the "integerValueList" element
     */
    public void setIntegerValueList(java.util.List integerValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUELIST$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERVALUELIST$12);
            }
            target.setListValue(integerValueList);
        }
    }
    
    /**
     * Sets (as xml) the "integerValueList" element
     */
    public void xsetIntegerValueList(net.opengis.gml.x32.IntegerList integerValueList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IntegerList target = null;
            target = (net.opengis.gml.x32.IntegerList)get_store().find_element_user(INTEGERVALUELIST$12, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.IntegerList)get_store().add_element_user(INTEGERVALUELIST$12);
            }
            target.set(integerValueList);
        }
    }
    
    /**
     * Unsets the "integerValueList" element
     */
    public void unsetIntegerValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTEGERVALUELIST$12, 0);
        }
    }
    
    /**
     * Gets the "valueFile" element
     */
    public java.lang.String getValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEFILE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valueFile" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(VALUEFILE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "valueFile" element
     */
    public boolean isSetValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEFILE$14) != 0;
        }
    }
    
    /**
     * Sets the "valueFile" element
     */
    public void setValueFile(java.lang.String valueFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUEFILE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUEFILE$14);
            }
            target.setStringValue(valueFile);
        }
    }
    
    /**
     * Sets (as xml) the "valueFile" element
     */
    public void xsetValueFile(org.apache.xmlbeans.XmlAnyURI valueFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(VALUEFILE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(VALUEFILE$14);
            }
            target.set(valueFile);
        }
    }
    
    /**
     * Unsets the "valueFile" element
     */
    public void unsetValueFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEFILE$14, 0);
        }
    }
    
    /**
     * Gets the "operationParameter" element
     */
    public net.opengis.gml.x32.OperationParameterPropertyType getOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().find_element_user(OPERATIONPARAMETER$17, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "operationParameter" element
     */
    public void setOperationParameter(net.opengis.gml.x32.OperationParameterPropertyType operationParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().find_element_user(OPERATIONPARAMETER$17, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().add_element_user(OPERATIONPARAMETER$16);
            }
            target.set(operationParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "operationParameter" element
     */
    public net.opengis.gml.x32.OperationParameterPropertyType addNewOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterPropertyType)get_store().add_element_user(OPERATIONPARAMETER$16);
            return target;
        }
    }
}
