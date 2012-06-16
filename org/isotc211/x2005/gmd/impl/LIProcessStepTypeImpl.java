/*
 * XML Type:  LI_ProcessStep_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.LIProcessStepType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML LI_ProcessStep_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class LIProcessStepTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.LIProcessStepType
{
    private static final long serialVersionUID = 1L;
    
    public LIProcessStepTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "description");
    private static final javax.xml.namespace.QName RATIONALE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "rationale");
    private static final javax.xml.namespace.QName DATETIME$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dateTime");
    private static final javax.xml.namespace.QName PROCESSOR$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "processor");
    private static final javax.xml.namespace.QName SOURCE$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "source");
    
    
    /**
     * Gets the "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Gets the "rationale" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getRationale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(RATIONALE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rationale" element
     */
    public boolean isSetRationale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RATIONALE$2) != 0;
        }
    }
    
    /**
     * Sets the "rationale" element
     */
    public void setRationale(org.isotc211.x2005.gco.CharacterStringPropertyType rationale)
    {
        generatedSetterHelperImpl(rationale, RATIONALE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rationale" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewRationale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(RATIONALE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "rationale" element
     */
    public void unsetRationale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RATIONALE$2, 0);
        }
    }
    
    /**
     * Gets the "dateTime" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().find_element_user(DATETIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dateTime" element
     */
    public boolean isSetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATETIME$4) != 0;
        }
    }
    
    /**
     * Sets the "dateTime" element
     */
    public void setDateTime(org.isotc211.x2005.gco.DateTimePropertyType dateTime)
    {
        generatedSetterHelperImpl(dateTime, DATETIME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dateTime" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType addNewDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().add_element_user(DATETIME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "dateTime" element
     */
    public void unsetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATETIME$4, 0);
        }
    }
    
    /**
     * Gets array of all "processor" elements
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getProcessorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSOR$6, targetList);
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] result = new org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "processor" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getProcessorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(PROCESSOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "processor" element
     */
    public int sizeOfProcessorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSOR$6);
        }
    }
    
    /**
     * Sets array of all "processor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProcessorArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] processorArray)
    {
        check_orphaned();
        arraySetterHelper(processorArray, PROCESSOR$6);
    }
    
    /**
     * Sets ith "processor" element
     */
    public void setProcessorArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType processor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(PROCESSOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(processor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "processor" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewProcessor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().insert_element_user(PROCESSOR$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "processor" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewProcessor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(PROCESSOR$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "processor" element
     */
    public void removeProcessor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSOR$6, i);
        }
    }
    
    /**
     * Gets array of all "source" elements
     */
    public org.isotc211.x2005.gmd.LISourcePropertyType[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$8, targetList);
            org.isotc211.x2005.gmd.LISourcePropertyType[] result = new org.isotc211.x2005.gmd.LISourcePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "source" element
     */
    public org.isotc211.x2005.gmd.LISourcePropertyType getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LISourcePropertyType)get_store().find_element_user(SOURCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "source" element
     */
    public int sizeOfSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$8);
        }
    }
    
    /**
     * Sets array of all "source" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSourceArray(org.isotc211.x2005.gmd.LISourcePropertyType[] sourceArray)
    {
        check_orphaned();
        arraySetterHelper(sourceArray, SOURCE$8);
    }
    
    /**
     * Sets ith "source" element
     */
    public void setSourceArray(int i, org.isotc211.x2005.gmd.LISourcePropertyType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LISourcePropertyType)get_store().find_element_user(SOURCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "source" element
     */
    public org.isotc211.x2005.gmd.LISourcePropertyType insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LISourcePropertyType)get_store().insert_element_user(SOURCE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    public org.isotc211.x2005.gmd.LISourcePropertyType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.LISourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.LISourcePropertyType)get_store().add_element_user(SOURCE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "source" element
     */
    public void removeSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$8, i);
        }
    }
}
