/*
 * XML Type:  MI_Operation_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIOperationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Operation_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIOperationTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIOperationType
{
    private static final long serialVersionUID = 1L;
    
    public MIOperationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "description");
    private static final javax.xml.namespace.QName CITATION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "citation");
    private static final javax.xml.namespace.QName IDENTIFIER$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "identifier");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "status");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "type");
    private static final javax.xml.namespace.QName OBJECTIVE$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "objective");
    private static final javax.xml.namespace.QName PLAN$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "plan");
    private static final javax.xml.namespace.QName CHILDOPERATION$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "childOperation");
    private static final javax.xml.namespace.QName SIGNIFICANTEVENT$16 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "significantEvent");
    private static final javax.xml.namespace.QName PLATFORM$18 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "platform");
    
    
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
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0) != 0;
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
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "citation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(CITATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "citation" element
     */
    public boolean isSetCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITATION$2) != 0;
        }
    }
    
    /**
     * Sets the "citation" element
     */
    public void setCitation(org.isotc211.x2005.gmd.CICitationPropertyType citation)
    {
        generatedSetterHelperImpl(citation, CITATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "citation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(CITATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "citation" element
     */
    public void unsetCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITATION$2, 0);
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(IDENTIFIER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$4) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.isotc211.x2005.gmd.MDIdentifierPropertyType identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(IDENTIFIER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$4, 0);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.isotc211.x2005.gmd.MDProgressCodePropertyType getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDProgressCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDProgressCodePropertyType)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.isotc211.x2005.gmd.MDProgressCodePropertyType status)
    {
        generatedSetterHelperImpl(status, STATUS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.isotc211.x2005.gmd.MDProgressCodePropertyType addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDProgressCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDProgressCodePropertyType)get_store().add_element_user(STATUS$6);
            return target;
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.isotc211.x2005.gmi.MIOperationTypeCodePropertyType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationTypeCodePropertyType)get_store().find_element_user(TYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.isotc211.x2005.gmi.MIOperationTypeCodePropertyType type)
    {
        generatedSetterHelperImpl(type, TYPE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.isotc211.x2005.gmi.MIOperationTypeCodePropertyType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationTypeCodePropertyType)get_store().add_element_user(TYPE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$8, 0);
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
            get_store().find_all_element_users(OBJECTIVE$10, targetList);
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
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().find_element_user(OBJECTIVE$10, i);
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
            return get_store().count_elements(OBJECTIVE$10);
        }
    }
    
    /**
     * Sets array of all "objective" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setObjectiveArray(org.isotc211.x2005.gmi.MIObjectivePropertyType[] objectiveArray)
    {
        check_orphaned();
        arraySetterHelper(objectiveArray, OBJECTIVE$10);
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
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().find_element_user(OBJECTIVE$10, i);
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
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().insert_element_user(OBJECTIVE$10, i);
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
            target = (org.isotc211.x2005.gmi.MIObjectivePropertyType)get_store().add_element_user(OBJECTIVE$10);
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
            get_store().remove_element(OBJECTIVE$10, i);
        }
    }
    
    /**
     * Gets the "plan" element
     */
    public org.isotc211.x2005.gmi.MIPlanPropertyType getPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanPropertyType)get_store().find_element_user(PLAN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "plan" element
     */
    public boolean isSetPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLAN$12) != 0;
        }
    }
    
    /**
     * Sets the "plan" element
     */
    public void setPlan(org.isotc211.x2005.gmi.MIPlanPropertyType plan)
    {
        generatedSetterHelperImpl(plan, PLAN$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "plan" element
     */
    public org.isotc211.x2005.gmi.MIPlanPropertyType addNewPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanPropertyType)get_store().add_element_user(PLAN$12);
            return target;
        }
    }
    
    /**
     * Unsets the "plan" element
     */
    public void unsetPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLAN$12, 0);
        }
    }
    
    /**
     * Gets array of all "childOperation" elements
     */
    public org.isotc211.x2005.gmi.MIOperationPropertyType[] getChildOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHILDOPERATION$14, targetList);
            org.isotc211.x2005.gmi.MIOperationPropertyType[] result = new org.isotc211.x2005.gmi.MIOperationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "childOperation" element
     */
    public org.isotc211.x2005.gmi.MIOperationPropertyType getChildOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationPropertyType)get_store().find_element_user(CHILDOPERATION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "childOperation" element
     */
    public int sizeOfChildOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDOPERATION$14);
        }
    }
    
    /**
     * Sets array of all "childOperation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setChildOperationArray(org.isotc211.x2005.gmi.MIOperationPropertyType[] childOperationArray)
    {
        check_orphaned();
        arraySetterHelper(childOperationArray, CHILDOPERATION$14);
    }
    
    /**
     * Sets ith "childOperation" element
     */
    public void setChildOperationArray(int i, org.isotc211.x2005.gmi.MIOperationPropertyType childOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationPropertyType)get_store().find_element_user(CHILDOPERATION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(childOperation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "childOperation" element
     */
    public org.isotc211.x2005.gmi.MIOperationPropertyType insertNewChildOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationPropertyType)get_store().insert_element_user(CHILDOPERATION$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "childOperation" element
     */
    public org.isotc211.x2005.gmi.MIOperationPropertyType addNewChildOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIOperationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIOperationPropertyType)get_store().add_element_user(CHILDOPERATION$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "childOperation" element
     */
    public void removeChildOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDOPERATION$14, i);
        }
    }
    
    /**
     * Gets array of all "significantEvent" elements
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType[] getSignificantEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SIGNIFICANTEVENT$16, targetList);
            org.isotc211.x2005.gmi.MIEventPropertyType[] result = new org.isotc211.x2005.gmi.MIEventPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "significantEvent" element
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType getSignificantEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().find_element_user(SIGNIFICANTEVENT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "significantEvent" element
     */
    public int sizeOfSignificantEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNIFICANTEVENT$16);
        }
    }
    
    /**
     * Sets array of all "significantEvent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSignificantEventArray(org.isotc211.x2005.gmi.MIEventPropertyType[] significantEventArray)
    {
        check_orphaned();
        arraySetterHelper(significantEventArray, SIGNIFICANTEVENT$16);
    }
    
    /**
     * Sets ith "significantEvent" element
     */
    public void setSignificantEventArray(int i, org.isotc211.x2005.gmi.MIEventPropertyType significantEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().find_element_user(SIGNIFICANTEVENT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(significantEvent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "significantEvent" element
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType insertNewSignificantEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().insert_element_user(SIGNIFICANTEVENT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "significantEvent" element
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType addNewSignificantEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().add_element_user(SIGNIFICANTEVENT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "significantEvent" element
     */
    public void removeSignificantEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNIFICANTEVENT$16, i);
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
            get_store().find_all_element_users(PLATFORM$18, targetList);
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
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().find_element_user(PLATFORM$18, i);
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
            return get_store().count_elements(PLATFORM$18);
        }
    }
    
    /**
     * Sets array of all "platform" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPlatformArray(org.isotc211.x2005.gmi.MIPlatformPropertyType[] platformArray)
    {
        check_orphaned();
        arraySetterHelper(platformArray, PLATFORM$18);
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
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().find_element_user(PLATFORM$18, i);
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
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().insert_element_user(PLATFORM$18, i);
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
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().add_element_user(PLATFORM$18);
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
            get_store().remove_element(PLATFORM$18, i);
        }
    }
}
