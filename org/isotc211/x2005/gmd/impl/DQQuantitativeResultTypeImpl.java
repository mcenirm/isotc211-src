/*
 * XML Type:  DQ_QuantitativeResult_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.DQQuantitativeResultType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML DQ_QuantitativeResult_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class DQQuantitativeResultTypeImpl extends org.isotc211.x2005.gmd.impl.AbstractDQResultTypeImpl implements org.isotc211.x2005.gmd.DQQuantitativeResultType
{
    private static final long serialVersionUID = 1L;
    
    public DQQuantitativeResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUETYPE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "valueType");
    private static final javax.xml.namespace.QName VALUEUNIT$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "valueUnit");
    private static final javax.xml.namespace.QName ERRORSTATISTIC$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "errorStatistic");
    private static final javax.xml.namespace.QName VALUE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "value");
    
    
    /**
     * Gets the "valueType" element
     */
    public org.isotc211.x2005.gco.RecordTypePropertyType getValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordTypePropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordTypePropertyType)get_store().find_element_user(VALUETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "valueType" element
     */
    public boolean isSetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUETYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "valueType" element
     */
    public void setValueType(org.isotc211.x2005.gco.RecordTypePropertyType valueType)
    {
        generatedSetterHelperImpl(valueType, VALUETYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueType" element
     */
    public org.isotc211.x2005.gco.RecordTypePropertyType addNewValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordTypePropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordTypePropertyType)get_store().add_element_user(VALUETYPE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "valueType" element
     */
    public void unsetValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUETYPE$0, 0);
        }
    }
    
    /**
     * Gets the "valueUnit" element
     */
    public org.isotc211.x2005.gco.UnitOfMeasurePropertyType getValueUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.UnitOfMeasurePropertyType target = null;
            target = (org.isotc211.x2005.gco.UnitOfMeasurePropertyType)get_store().find_element_user(VALUEUNIT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "valueUnit" element
     */
    public void setValueUnit(org.isotc211.x2005.gco.UnitOfMeasurePropertyType valueUnit)
    {
        generatedSetterHelperImpl(valueUnit, VALUEUNIT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "valueUnit" element
     */
    public org.isotc211.x2005.gco.UnitOfMeasurePropertyType addNewValueUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.UnitOfMeasurePropertyType target = null;
            target = (org.isotc211.x2005.gco.UnitOfMeasurePropertyType)get_store().add_element_user(VALUEUNIT$2);
            return target;
        }
    }
    
    /**
     * Gets the "errorStatistic" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getErrorStatistic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ERRORSTATISTIC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "errorStatistic" element
     */
    public boolean isSetErrorStatistic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORSTATISTIC$4) != 0;
        }
    }
    
    /**
     * Sets the "errorStatistic" element
     */
    public void setErrorStatistic(org.isotc211.x2005.gco.CharacterStringPropertyType errorStatistic)
    {
        generatedSetterHelperImpl(errorStatistic, ERRORSTATISTIC$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "errorStatistic" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewErrorStatistic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ERRORSTATISTIC$4);
            return target;
        }
    }
    
    /**
     * Unsets the "errorStatistic" element
     */
    public void unsetErrorStatistic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORSTATISTIC$4, 0);
        }
    }
    
    /**
     * Gets array of all "value" elements
     */
    public org.isotc211.x2005.gco.RecordPropertyType[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$6, targetList);
            org.isotc211.x2005.gco.RecordPropertyType[] result = new org.isotc211.x2005.gco.RecordPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "value" element
     */
    public org.isotc211.x2005.gco.RecordPropertyType getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordPropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordPropertyType)get_store().find_element_user(VALUE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "value" element
     */
    public int sizeOfValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$6);
        }
    }
    
    /**
     * Sets array of all "value" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setValueArray(org.isotc211.x2005.gco.RecordPropertyType[] valueArray)
    {
        check_orphaned();
        arraySetterHelper(valueArray, VALUE$6);
    }
    
    /**
     * Sets ith "value" element
     */
    public void setValueArray(int i, org.isotc211.x2005.gco.RecordPropertyType value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordPropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordPropertyType)get_store().find_element_user(VALUE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(value);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "value" element
     */
    public org.isotc211.x2005.gco.RecordPropertyType insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordPropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordPropertyType)get_store().insert_element_user(VALUE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "value" element
     */
    public org.isotc211.x2005.gco.RecordPropertyType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RecordPropertyType target = null;
            target = (org.isotc211.x2005.gco.RecordPropertyType)get_store().add_element_user(VALUE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "value" element
     */
    public void removeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$6, i);
        }
    }
}
