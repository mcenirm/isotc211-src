/*
 * XML Type:  MI_AcquisitionInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIAcquisitionInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_AcquisitionInformation_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIAcquisitionInformationTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIAcquisitionInformationType
{
    private static final long serialVersionUID = 1L;
    
    public MIAcquisitionInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACQUISITIONREQUIREMENT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "acquisitionRequirement");
    private static final javax.xml.namespace.QName OBJECTIVE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "objective");
    private static final javax.xml.namespace.QName INSTRUMENT$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "instrument");
    private static final javax.xml.namespace.QName ACQUISITIONPLAN$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "acquisitionPlan");
    private static final javax.xml.namespace.QName OPERATION$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "operation");
    private static final javax.xml.namespace.QName PLATFORM$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "platform");
    private static final javax.xml.namespace.QName ENVIRONMENTALCONDITIONS$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "environmentalConditions");
    
    
    /**
     * Gets array of all "acquisitionRequirement" elements
     */
    public org.isotc211.x2005.gmi.MIRequirementPropertyType[] getAcquisitionRequirementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACQUISITIONREQUIREMENT$0, targetList);
            org.isotc211.x2005.gmi.MIRequirementPropertyType[] result = new org.isotc211.x2005.gmi.MIRequirementPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "acquisitionRequirement" element
     */
    public org.isotc211.x2005.gmi.MIRequirementPropertyType getAcquisitionRequirementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequirementPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRequirementPropertyType)get_store().find_element_user(ACQUISITIONREQUIREMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "acquisitionRequirement" element
     */
    public int sizeOfAcquisitionRequirementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACQUISITIONREQUIREMENT$0);
        }
    }
    
    /**
     * Sets array of all "acquisitionRequirement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAcquisitionRequirementArray(org.isotc211.x2005.gmi.MIRequirementPropertyType[] acquisitionRequirementArray)
    {
        check_orphaned();
        arraySetterHelper(acquisitionRequirementArray, ACQUISITIONREQUIREMENT$0);
    }
    
    /**
     * Sets ith "acquisitionRequirement" element
     */
    public void setAcquisitionRequirementArray(int i, org.isotc211.x2005.gmi.MIRequirementPropertyType acquisitionRequirement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequirementPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRequirementPropertyType)get_store().find_element_user(ACQUISITIONREQUIREMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(acquisitionRequirement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "acquisitionRequirement" element
     */
    public org.isotc211.x2005.gmi.MIRequirementPropertyType insertNewAcquisitionRequirement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequirementPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRequirementPropertyType)get_store().insert_element_user(ACQUISITIONREQUIREMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "acquisitionRequirement" element
     */
    public org.isotc211.x2005.gmi.MIRequirementPropertyType addNewAcquisitionRequirement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequirementPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRequirementPropertyType)get_store().add_element_user(ACQUISITIONREQUIREMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "acquisitionRequirement" element
     */
    public void removeAcquisitionRequirement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACQUISITIONREQUIREMENT$0, i);
        }
    }
    
    /**
     * Gets array of all "objective" elements
     */
    public org.isotc211.x2005.gmi.MIObjectivePropertyType[] getObjectiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECTIVE$2, targetList);
            org.isotc211.x2005.gmi.MIObjectivePropertyType[] result = new org.isotc211.x2005.gmi.MIObjectivePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "objective" element
     */
    public org.isotc211.x2005.gmi.MIObjectivePropertyType getObjectiveArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectivePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().find_element_user(OBJECTIVE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "objective" element
     */
    public int sizeOfObjectiveArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTIVE$2);
        }
    }
    
    /**
     * Sets array of all "objective" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setObjectiveArray(org.isotc211.x2005.gmi.MIObjectivePropertyType[] objectiveArray)
    {
        check_orphaned();
        arraySetterHelper(objectiveArray, OBJECTIVE$2);
    }
    
    /**
     * Sets ith "objective" element
     */
    public void setObjectiveArray(int i, org.isotc211.x2005.gmi.MIObjectivePropertyType objective)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectivePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().find_element_user(OBJECTIVE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objective);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objective" element
     */
    public org.isotc211.x2005.gmi.MIObjectivePropertyType insertNewObjective(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectivePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().insert_element_user(OBJECTIVE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objective" element
     */
    public org.isotc211.x2005.gmi.MIObjectivePropertyType addNewObjective()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectivePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().add_element_user(OBJECTIVE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "objective" element
     */
    public void removeObjective(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTIVE$2, i);
        }
    }
    
    /**
     * Gets array of all "instrument" elements
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType[] getInstrumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INSTRUMENT$4, targetList);
            org.isotc211.x2005.gmi.MIInstrumentPropertyType[] result = new org.isotc211.x2005.gmi.MIInstrumentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "instrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType getInstrumentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().find_element_user(INSTRUMENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "instrument" element
     */
    public int sizeOfInstrumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTRUMENT$4);
        }
    }
    
    /**
     * Sets array of all "instrument" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInstrumentArray(org.isotc211.x2005.gmi.MIInstrumentPropertyType[] instrumentArray)
    {
        check_orphaned();
        arraySetterHelper(instrumentArray, INSTRUMENT$4);
    }
    
    /**
     * Sets ith "instrument" element
     */
    public void setInstrumentArray(int i, org.isotc211.x2005.gmi.MIInstrumentPropertyType instrument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().find_element_user(INSTRUMENT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(instrument);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType insertNewInstrument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().insert_element_user(INSTRUMENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType addNewInstrument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().add_element_user(INSTRUMENT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "instrument" element
     */
    public void removeInstrument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTRUMENT$4, i);
        }
    }
    
    /**
     * Gets array of all "acquisitionPlan" elements
     */
    public org.isotc211.x2005.gmi.MIPlanPropertyType[] getAcquisitionPlanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACQUISITIONPLAN$6, targetList);
            org.isotc211.x2005.gmi.MIPlanPropertyType[] result = new org.isotc211.x2005.gmi.MIPlanPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "acquisitionPlan" element
     */
    public org.isotc211.x2005.gmi.MIPlanPropertyType getAcquisitionPlanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanPropertyType)get_store().find_element_user(ACQUISITIONPLAN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "acquisitionPlan" element
     */
    public int sizeOfAcquisitionPlanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACQUISITIONPLAN$6);
        }
    }
    
    /**
     * Sets array of all "acquisitionPlan" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAcquisitionPlanArray(org.isotc211.x2005.gmi.MIPlanPropertyType[] acquisitionPlanArray)
    {
        check_orphaned();
        arraySetterHelper(acquisitionPlanArray, ACQUISITIONPLAN$6);
    }
    
    /**
     * Sets ith "acquisitionPlan" element
     */
    public void setAcquisitionPlanArray(int i, org.isotc211.x2005.gmi.MIPlanPropertyType acquisitionPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanPropertyType)get_store().find_element_user(ACQUISITIONPLAN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(acquisitionPlan);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "acquisitionPlan" element
     */
    public org.isotc211.x2005.gmi.MIPlanPropertyType insertNewAcquisitionPlan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanPropertyType)get_store().insert_element_user(ACQUISITIONPLAN$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "acquisitionPlan" element
     */
    public org.isotc211.x2005.gmi.MIPlanPropertyType addNewAcquisitionPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanPropertyType)get_store().add_element_user(ACQUISITIONPLAN$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "acquisitionPlan" element
     */
    public void removeAcquisitionPlan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACQUISITIONPLAN$6, i);
        }
    }
    
    /**
     * Gets array of all "operation" elements
     */
    public org.isotc211.x2005.gmi.MIOperationPropertyType[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATION$8, targetList);
            org.isotc211.x2005.gmi.MIOperationPropertyType[] result = new org.isotc211.x2005.gmi.MIOperationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operation" element
     */
    public org.isotc211.x2005.gmi.MIOperationPropertyType getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationPropertyType)get_store().find_element_user(OPERATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "operation" element
     */
    public int sizeOfOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$8);
        }
    }
    
    /**
     * Sets array of all "operation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOperationArray(org.isotc211.x2005.gmi.MIOperationPropertyType[] operationArray)
    {
        check_orphaned();
        arraySetterHelper(operationArray, OPERATION$8);
    }
    
    /**
     * Sets ith "operation" element
     */
    public void setOperationArray(int i, org.isotc211.x2005.gmi.MIOperationPropertyType operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationPropertyType)get_store().find_element_user(OPERATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    public org.isotc211.x2005.gmi.MIOperationPropertyType insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationPropertyType)get_store().insert_element_user(OPERATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    public org.isotc211.x2005.gmi.MIOperationPropertyType addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationPropertyType)get_store().add_element_user(OPERATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "operation" element
     */
    public void removeOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$8, i);
        }
    }
    
    /**
     * Gets array of all "platform" elements
     */
    public org.isotc211.x2005.gmi.MIPlatformPropertyType[] getPlatformArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PLATFORM$10, targetList);
            org.isotc211.x2005.gmi.MIPlatformPropertyType[] result = new org.isotc211.x2005.gmi.MIPlatformPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "platform" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPropertyType getPlatformArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().find_element_user(PLATFORM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "platform" element
     */
    public int sizeOfPlatformArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLATFORM$10);
        }
    }
    
    /**
     * Sets array of all "platform" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPlatformArray(org.isotc211.x2005.gmi.MIPlatformPropertyType[] platformArray)
    {
        check_orphaned();
        arraySetterHelper(platformArray, PLATFORM$10);
    }
    
    /**
     * Sets ith "platform" element
     */
    public void setPlatformArray(int i, org.isotc211.x2005.gmi.MIPlatformPropertyType platform)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().find_element_user(PLATFORM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(platform);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "platform" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPropertyType insertNewPlatform(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().insert_element_user(PLATFORM$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "platform" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPropertyType addNewPlatform()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().add_element_user(PLATFORM$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "platform" element
     */
    public void removePlatform(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLATFORM$10, i);
        }
    }
    
    /**
     * Gets the "environmentalConditions" element
     */
    public org.isotc211.x2005.gmi.MIEnvironmentalRecordPropertyType getEnvironmentalConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEnvironmentalRecordPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEnvironmentalRecordPropertyType)get_store().find_element_user(ENVIRONMENTALCONDITIONS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "environmentalConditions" element
     */
    public boolean isSetEnvironmentalConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVIRONMENTALCONDITIONS$12) != 0;
        }
    }
    
    /**
     * Sets the "environmentalConditions" element
     */
    public void setEnvironmentalConditions(org.isotc211.x2005.gmi.MIEnvironmentalRecordPropertyType environmentalConditions)
    {
        generatedSetterHelperImpl(environmentalConditions, ENVIRONMENTALCONDITIONS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "environmentalConditions" element
     */
    public org.isotc211.x2005.gmi.MIEnvironmentalRecordPropertyType addNewEnvironmentalConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEnvironmentalRecordPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEnvironmentalRecordPropertyType)get_store().add_element_user(ENVIRONMENTALCONDITIONS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "environmentalConditions" element
     */
    public void unsetEnvironmentalConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVIRONMENTALCONDITIONS$12, 0);
        }
    }
}
