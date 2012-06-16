/*
 * XML Type:  AbstractDQ_Element_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDQElementType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML AbstractDQ_Element_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class AbstractDQElementTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.AbstractDQElementType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDQElementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEOFMEASURE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "nameOfMeasure");
    private static final javax.xml.namespace.QName MEASUREIDENTIFICATION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "measureIdentification");
    private static final javax.xml.namespace.QName MEASUREDESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "measureDescription");
    private static final javax.xml.namespace.QName EVALUATIONMETHODTYPE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "evaluationMethodType");
    private static final javax.xml.namespace.QName EVALUATIONMETHODDESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "evaluationMethodDescription");
    private static final javax.xml.namespace.QName EVALUATIONPROCEDURE$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "evaluationProcedure");
    private static final javax.xml.namespace.QName DATETIME$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dateTime");
    private static final javax.xml.namespace.QName RESULT$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "result");
    
    
    /**
     * Gets array of all "nameOfMeasure" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getNameOfMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAMEOFMEASURE$0, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "nameOfMeasure" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getNameOfMeasureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(NAMEOFMEASURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "nameOfMeasure" element
     */
    public int sizeOfNameOfMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMEOFMEASURE$0);
        }
    }
    
    /**
     * Sets array of all "nameOfMeasure" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNameOfMeasureArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] nameOfMeasureArray)
    {
        check_orphaned();
        arraySetterHelper(nameOfMeasureArray, NAMEOFMEASURE$0);
    }
    
    /**
     * Sets ith "nameOfMeasure" element
     */
    public void setNameOfMeasureArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType nameOfMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(NAMEOFMEASURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nameOfMeasure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nameOfMeasure" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewNameOfMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(NAMEOFMEASURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nameOfMeasure" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewNameOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(NAMEOFMEASURE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "nameOfMeasure" element
     */
    public void removeNameOfMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMEOFMEASURE$0, i);
        }
    }
    
    /**
     * Gets the "measureIdentification" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getMeasureIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(MEASUREIDENTIFICATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "measureIdentification" element
     */
    public boolean isSetMeasureIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREIDENTIFICATION$2) != 0;
        }
    }
    
    /**
     * Sets the "measureIdentification" element
     */
    public void setMeasureIdentification(org.isotc211.x2005.gmd.MDIdentifierPropertyType measureIdentification)
    {
        generatedSetterHelperImpl(measureIdentification, MEASUREIDENTIFICATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "measureIdentification" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewMeasureIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(MEASUREIDENTIFICATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "measureIdentification" element
     */
    public void unsetMeasureIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREIDENTIFICATION$2, 0);
        }
    }
    
    /**
     * Gets the "measureDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getMeasureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(MEASUREDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "measureDescription" element
     */
    public boolean isSetMeasureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREDESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "measureDescription" element
     */
    public void setMeasureDescription(org.isotc211.x2005.gco.CharacterStringPropertyType measureDescription)
    {
        generatedSetterHelperImpl(measureDescription, MEASUREDESCRIPTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "measureDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewMeasureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(MEASUREDESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "measureDescription" element
     */
    public void unsetMeasureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREDESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "evaluationMethodType" element
     */
    public org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodePropertyType getEvaluationMethodType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodePropertyType)get_store().find_element_user(EVALUATIONMETHODTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "evaluationMethodType" element
     */
    public boolean isSetEvaluationMethodType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVALUATIONMETHODTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "evaluationMethodType" element
     */
    public void setEvaluationMethodType(org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodePropertyType evaluationMethodType)
    {
        generatedSetterHelperImpl(evaluationMethodType, EVALUATIONMETHODTYPE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "evaluationMethodType" element
     */
    public org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodePropertyType addNewEvaluationMethodType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodePropertyType)get_store().add_element_user(EVALUATIONMETHODTYPE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "evaluationMethodType" element
     */
    public void unsetEvaluationMethodType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVALUATIONMETHODTYPE$6, 0);
        }
    }
    
    /**
     * Gets the "evaluationMethodDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getEvaluationMethodDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(EVALUATIONMETHODDESCRIPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "evaluationMethodDescription" element
     */
    public boolean isSetEvaluationMethodDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVALUATIONMETHODDESCRIPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "evaluationMethodDescription" element
     */
    public void setEvaluationMethodDescription(org.isotc211.x2005.gco.CharacterStringPropertyType evaluationMethodDescription)
    {
        generatedSetterHelperImpl(evaluationMethodDescription, EVALUATIONMETHODDESCRIPTION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "evaluationMethodDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewEvaluationMethodDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(EVALUATIONMETHODDESCRIPTION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "evaluationMethodDescription" element
     */
    public void unsetEvaluationMethodDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVALUATIONMETHODDESCRIPTION$8, 0);
        }
    }
    
    /**
     * Gets the "evaluationProcedure" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getEvaluationProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(EVALUATIONPROCEDURE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "evaluationProcedure" element
     */
    public boolean isSetEvaluationProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVALUATIONPROCEDURE$10) != 0;
        }
    }
    
    /**
     * Sets the "evaluationProcedure" element
     */
    public void setEvaluationProcedure(org.isotc211.x2005.gmd.CICitationPropertyType evaluationProcedure)
    {
        generatedSetterHelperImpl(evaluationProcedure, EVALUATIONPROCEDURE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "evaluationProcedure" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewEvaluationProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(EVALUATIONPROCEDURE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "evaluationProcedure" element
     */
    public void unsetEvaluationProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVALUATIONPROCEDURE$10, 0);
        }
    }
    
    /**
     * Gets array of all "dateTime" elements
     */
    public org.isotc211.x2005.gco.DateTimePropertyType[] getDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATETIME$12, targetList);
            org.isotc211.x2005.gco.DateTimePropertyType[] result = new org.isotc211.x2005.gco.DateTimePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dateTime" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType getDateTimeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().find_element_user(DATETIME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dateTime" element
     */
    public int sizeOfDateTimeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATETIME$12);
        }
    }
    
    /**
     * Sets array of all "dateTime" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDateTimeArray(org.isotc211.x2005.gco.DateTimePropertyType[] dateTimeArray)
    {
        check_orphaned();
        arraySetterHelper(dateTimeArray, DATETIME$12);
    }
    
    /**
     * Sets ith "dateTime" element
     */
    public void setDateTimeArray(int i, org.isotc211.x2005.gco.DateTimePropertyType dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().find_element_user(DATETIME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dateTime);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dateTime" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType insertNewDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().insert_element_user(DATETIME$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dateTime" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType addNewDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().add_element_user(DATETIME$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "dateTime" element
     */
    public void removeDateTime(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATETIME$12, i);
        }
    }
    
    /**
     * Gets array of all "result" elements
     */
    public org.isotc211.x2005.gmd.DQResultPropertyType[] getResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESULT$14, targetList);
            org.isotc211.x2005.gmd.DQResultPropertyType[] result = new org.isotc211.x2005.gmd.DQResultPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "result" element
     */
    public org.isotc211.x2005.gmd.DQResultPropertyType getResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQResultPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQResultPropertyType)get_store().find_element_user(RESULT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "result" element
     */
    public int sizeOfResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESULT$14);
        }
    }
    
    /**
     * Sets array of all "result" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResultArray(org.isotc211.x2005.gmd.DQResultPropertyType[] resultArray)
    {
        check_orphaned();
        arraySetterHelper(resultArray, RESULT$14);
    }
    
    /**
     * Sets ith "result" element
     */
    public void setResultArray(int i, org.isotc211.x2005.gmd.DQResultPropertyType result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQResultPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQResultPropertyType)get_store().find_element_user(RESULT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(result);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "result" element
     */
    public org.isotc211.x2005.gmd.DQResultPropertyType insertNewResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQResultPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQResultPropertyType)get_store().insert_element_user(RESULT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "result" element
     */
    public org.isotc211.x2005.gmd.DQResultPropertyType addNewResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.DQResultPropertyType target = null;
            target = (org.isotc211.x2005.gmd.DQResultPropertyType)get_store().add_element_user(RESULT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "result" element
     */
    public void removeResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESULT$14, i);
        }
    }
}
