/*
 * XML Type:  MI_Event_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIEventType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Event_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIEventTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIEventType
{
    private static final long serialVersionUID = 1L;
    
    public MIEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "identifier");
    private static final javax.xml.namespace.QName TRIGGER$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "trigger");
    private static final javax.xml.namespace.QName CONTEXT$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "context");
    private static final javax.xml.namespace.QName SEQUENCE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "sequence");
    private static final javax.xml.namespace.QName TIME$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "time");
    private static final javax.xml.namespace.QName EXPECTEDOBJECTIVE$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "expectedObjective");
    private static final javax.xml.namespace.QName RELATEDSENSOR$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "relatedSensor");
    private static final javax.xml.namespace.QName RELATEDPASS$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "relatedPass");
    
    
    /**
     * Gets the "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.isotc211.x2005.gmd.MDIdentifierPropertyType identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets the "trigger" element
     */
    public org.isotc211.x2005.gmi.MITriggerCodePropertyType getTrigger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MITriggerCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MITriggerCodePropertyType)get_store().find_element_user(TRIGGER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "trigger" element
     */
    public void setTrigger(org.isotc211.x2005.gmi.MITriggerCodePropertyType trigger)
    {
        generatedSetterHelperImpl(trigger, TRIGGER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "trigger" element
     */
    public org.isotc211.x2005.gmi.MITriggerCodePropertyType addNewTrigger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MITriggerCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MITriggerCodePropertyType)get_store().add_element_user(TRIGGER$2);
            return target;
        }
    }
    
    /**
     * Gets the "context" element
     */
    public org.isotc211.x2005.gmi.MIContextCodePropertyType getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIContextCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIContextCodePropertyType)get_store().find_element_user(CONTEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "context" element
     */
    public void setContext(org.isotc211.x2005.gmi.MIContextCodePropertyType context)
    {
        generatedSetterHelperImpl(context, CONTEXT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "context" element
     */
    public org.isotc211.x2005.gmi.MIContextCodePropertyType addNewContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIContextCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIContextCodePropertyType)get_store().add_element_user(CONTEXT$4);
            return target;
        }
    }
    
    /**
     * Gets the "sequence" element
     */
    public org.isotc211.x2005.gmi.MISequenceCodePropertyType getSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MISequenceCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MISequenceCodePropertyType)get_store().find_element_user(SEQUENCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sequence" element
     */
    public void setSequence(org.isotc211.x2005.gmi.MISequenceCodePropertyType sequence)
    {
        generatedSetterHelperImpl(sequence, SEQUENCE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sequence" element
     */
    public org.isotc211.x2005.gmi.MISequenceCodePropertyType addNewSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MISequenceCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MISequenceCodePropertyType)get_store().add_element_user(SEQUENCE$6);
            return target;
        }
    }
    
    /**
     * Gets the "time" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().find_element_user(TIME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "time" element
     */
    public void setTime(org.isotc211.x2005.gco.DateTimePropertyType time)
    {
        generatedSetterHelperImpl(time, TIME$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "time" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType addNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().add_element_user(TIME$8);
            return target;
        }
    }
    
    /**
     * Gets array of all "expectedObjective" elements
     */
    public org.isotc211.x2005.gmi.MIObjectivePropertyType[] getExpectedObjectiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXPECTEDOBJECTIVE$10, targetList);
            org.isotc211.x2005.gmi.MIObjectivePropertyType[] result = new org.isotc211.x2005.gmi.MIObjectivePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "expectedObjective" element
     */
    public org.isotc211.x2005.gmi.MIObjectivePropertyType getExpectedObjectiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectivePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().find_element_user(EXPECTEDOBJECTIVE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "expectedObjective" element
     */
    public int sizeOfExpectedObjectiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPECTEDOBJECTIVE$10);
        }
    }
    
    /**
     * Sets array of all "expectedObjective" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExpectedObjectiveArray(org.isotc211.x2005.gmi.MIObjectivePropertyType[] expectedObjectiveArray)
    {
        check_orphaned();
        arraySetterHelper(expectedObjectiveArray, EXPECTEDOBJECTIVE$10);
    }
    
    /**
     * Sets ith "expectedObjective" element
     */
    public void setExpectedObjectiveArray(int i, org.isotc211.x2005.gmi.MIObjectivePropertyType expectedObjective)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectivePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().find_element_user(EXPECTEDOBJECTIVE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(expectedObjective);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "expectedObjective" element
     */
    public org.isotc211.x2005.gmi.MIObjectivePropertyType insertNewExpectedObjective(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectivePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().insert_element_user(EXPECTEDOBJECTIVE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "expectedObjective" element
     */
    public org.isotc211.x2005.gmi.MIObjectivePropertyType addNewExpectedObjective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectivePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().add_element_user(EXPECTEDOBJECTIVE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "expectedObjective" element
     */
    public void removeExpectedObjective(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPECTEDOBJECTIVE$10, i);
        }
    }
    
    /**
     * Gets array of all "relatedSensor" elements
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType[] getRelatedSensorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATEDSENSOR$12, targetList);
            org.isotc211.x2005.gmi.MIInstrumentPropertyType[] result = new org.isotc211.x2005.gmi.MIInstrumentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relatedSensor" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType getRelatedSensorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().find_element_user(RELATEDSENSOR$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relatedSensor" element
     */
    public int sizeOfRelatedSensorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDSENSOR$12);
        }
    }
    
    /**
     * Sets array of all "relatedSensor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelatedSensorArray(org.isotc211.x2005.gmi.MIInstrumentPropertyType[] relatedSensorArray)
    {
        check_orphaned();
        arraySetterHelper(relatedSensorArray, RELATEDSENSOR$12);
    }
    
    /**
     * Sets ith "relatedSensor" element
     */
    public void setRelatedSensorArray(int i, org.isotc211.x2005.gmi.MIInstrumentPropertyType relatedSensor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().find_element_user(RELATEDSENSOR$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relatedSensor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedSensor" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType insertNewRelatedSensor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().insert_element_user(RELATEDSENSOR$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedSensor" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType addNewRelatedSensor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().add_element_user(RELATEDSENSOR$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "relatedSensor" element
     */
    public void removeRelatedSensor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDSENSOR$12, i);
        }
    }
    
    /**
     * Gets the "relatedPass" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPassPropertyType getRelatedPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPassPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPassPropertyType)get_store().find_element_user(RELATEDPASS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relatedPass" element
     */
    public boolean isSetRelatedPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDPASS$14) != 0;
        }
    }
    
    /**
     * Sets the "relatedPass" element
     */
    public void setRelatedPass(org.isotc211.x2005.gmi.MIPlatformPassPropertyType relatedPass)
    {
        generatedSetterHelperImpl(relatedPass, RELATEDPASS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relatedPass" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPassPropertyType addNewRelatedPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPassPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPassPropertyType)get_store().add_element_user(RELATEDPASS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "relatedPass" element
     */
    public void unsetRelatedPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDPASS$14, 0);
        }
    }
}
