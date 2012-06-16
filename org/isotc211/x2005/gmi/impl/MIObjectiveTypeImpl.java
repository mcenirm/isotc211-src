/*
 * XML Type:  MI_Objective_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIObjectiveType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Objective_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIObjectiveTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIObjectiveType
{
    private static final long serialVersionUID = 1L;
    
    public MIObjectiveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "identifier");
    private static final javax.xml.namespace.QName PRIORITY$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "priority");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "type");
    private static final javax.xml.namespace.QName FUNCTION$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "function");
    private static final javax.xml.namespace.QName EXTENT$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "extent");
    private static final javax.xml.namespace.QName PASS$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "pass");
    private static final javax.xml.namespace.QName SENSINGINSTRUMENT$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "sensingInstrument");
    private static final javax.xml.namespace.QName OBJECTIVEOCCURRENCE$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "objectiveOccurrence");
    
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$0, targetList);
            org.isotc211.x2005.gmd.MDIdentifierPropertyType[] result = new org.isotc211.x2005.gmd.MDIdentifierPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$0);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.isotc211.x2005.gmd.MDIdentifierPropertyType[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$0);
    }
    
    /**
     * Sets ith "identifier" element
     */
    public void setIdentifierArray(int i, org.isotc211.x2005.gmd.MDIdentifierPropertyType identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(IDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().insert_element_user(IDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
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
     * Removes the ith "identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$0, i);
        }
    }
    
    /**
     * Gets the "priority" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(PRIORITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "priority" element
     */
    public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$2) != 0;
        }
    }
    
    /**
     * Sets the "priority" element
     */
    public void setPriority(org.isotc211.x2005.gco.CharacterStringPropertyType priority)
    {
        generatedSetterHelperImpl(priority, PRIORITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "priority" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(PRIORITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "priority" element
     */
    public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$2, 0);
        }
    }
    
    /**
     * Gets array of all "type" elements
     */
    public org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType[] getTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TYPE$4, targetList);
            org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType[] result = new org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "type" element
     */
    public org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType getTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType)get_store().find_element_user(TYPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "type" element
     */
    public int sizeOfTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$4);
        }
    }
    
    /**
     * Sets array of all "type" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTypeArray(org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType[] typeArray)
    {
        check_orphaned();
        arraySetterHelper(typeArray, TYPE$4);
    }
    
    /**
     * Sets ith "type" element
     */
    public void setTypeArray(int i, org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType)get_store().find_element_user(TYPE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(type);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    public org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType insertNewType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType)get_store().insert_element_user(TYPE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    public org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType)get_store().add_element_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "type" element
     */
    public void removeType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$4, i);
        }
    }
    
    /**
     * Gets array of all "function" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getFunctionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FUNCTION$6, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "function" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getFunctionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(FUNCTION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "function" element
     */
    public int sizeOfFunctionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNCTION$6);
        }
    }
    
    /**
     * Sets array of all "function" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFunctionArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] functionArray)
    {
        check_orphaned();
        arraySetterHelper(functionArray, FUNCTION$6);
    }
    
    /**
     * Sets ith "function" element
     */
    public void setFunctionArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType function)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(FUNCTION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(function);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "function" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewFunction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(FUNCTION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "function" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(FUNCTION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "function" element
     */
    public void removeFunction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNCTION$6, i);
        }
    }
    
    /**
     * Gets array of all "extent" elements
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType[] getExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTENT$8, targetList);
            org.isotc211.x2005.gmd.EXExtentPropertyType[] result = new org.isotc211.x2005.gmd.EXExtentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType getExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().find_element_user(EXTENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extent" element
     */
    public int sizeOfExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENT$8);
        }
    }
    
    /**
     * Sets array of all "extent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExtentArray(org.isotc211.x2005.gmd.EXExtentPropertyType[] extentArray)
    {
        check_orphaned();
        arraySetterHelper(extentArray, EXTENT$8);
    }
    
    /**
     * Sets ith "extent" element
     */
    public void setExtentArray(int i, org.isotc211.x2005.gmd.EXExtentPropertyType extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().find_element_user(EXTENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType insertNewExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().insert_element_user(EXTENT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extent" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().add_element_user(EXTENT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "extent" element
     */
    public void removeExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENT$8, i);
        }
    }
    
    /**
     * Gets array of all "pass" elements
     */
    public org.isotc211.x2005.gmi.MIPlatformPassPropertyType[] getPassArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PASS$10, targetList);
            org.isotc211.x2005.gmi.MIPlatformPassPropertyType[] result = new org.isotc211.x2005.gmi.MIPlatformPassPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pass" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPassPropertyType getPassArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPassPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPassPropertyType)get_store().find_element_user(PASS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pass" element
     */
    public int sizeOfPassArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PASS$10);
        }
    }
    
    /**
     * Sets array of all "pass" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPassArray(org.isotc211.x2005.gmi.MIPlatformPassPropertyType[] passArray)
    {
        check_orphaned();
        arraySetterHelper(passArray, PASS$10);
    }
    
    /**
     * Sets ith "pass" element
     */
    public void setPassArray(int i, org.isotc211.x2005.gmi.MIPlatformPassPropertyType pass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPassPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPassPropertyType)get_store().find_element_user(PASS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pass);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pass" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPassPropertyType insertNewPass(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPassPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPassPropertyType)get_store().insert_element_user(PASS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pass" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPassPropertyType addNewPass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPassPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPassPropertyType)get_store().add_element_user(PASS$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "pass" element
     */
    public void removePass(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PASS$10, i);
        }
    }
    
    /**
     * Gets array of all "sensingInstrument" elements
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType[] getSensingInstrumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SENSINGINSTRUMENT$12, targetList);
            org.isotc211.x2005.gmi.MIInstrumentPropertyType[] result = new org.isotc211.x2005.gmi.MIInstrumentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sensingInstrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType getSensingInstrumentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().find_element_user(SENSINGINSTRUMENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sensingInstrument" element
     */
    public int sizeOfSensingInstrumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENSINGINSTRUMENT$12);
        }
    }
    
    /**
     * Sets array of all "sensingInstrument" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSensingInstrumentArray(org.isotc211.x2005.gmi.MIInstrumentPropertyType[] sensingInstrumentArray)
    {
        check_orphaned();
        arraySetterHelper(sensingInstrumentArray, SENSINGINSTRUMENT$12);
    }
    
    /**
     * Sets ith "sensingInstrument" element
     */
    public void setSensingInstrumentArray(int i, org.isotc211.x2005.gmi.MIInstrumentPropertyType sensingInstrument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().find_element_user(SENSINGINSTRUMENT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sensingInstrument);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sensingInstrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType insertNewSensingInstrument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().insert_element_user(SENSINGINSTRUMENT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sensingInstrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType addNewSensingInstrument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().add_element_user(SENSINGINSTRUMENT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "sensingInstrument" element
     */
    public void removeSensingInstrument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENSINGINSTRUMENT$12, i);
        }
    }
    
    /**
     * Gets array of all "objectiveOccurrence" elements
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType[] getObjectiveOccurrenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECTIVEOCCURRENCE$14, targetList);
            org.isotc211.x2005.gmi.MIEventPropertyType[] result = new org.isotc211.x2005.gmi.MIEventPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "objectiveOccurrence" element
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType getObjectiveOccurrenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().find_element_user(OBJECTIVEOCCURRENCE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "objectiveOccurrence" element
     */
    public int sizeOfObjectiveOccurrenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTIVEOCCURRENCE$14);
        }
    }
    
    /**
     * Sets array of all "objectiveOccurrence" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setObjectiveOccurrenceArray(org.isotc211.x2005.gmi.MIEventPropertyType[] objectiveOccurrenceArray)
    {
        check_orphaned();
        arraySetterHelper(objectiveOccurrenceArray, OBJECTIVEOCCURRENCE$14);
    }
    
    /**
     * Sets ith "objectiveOccurrence" element
     */
    public void setObjectiveOccurrenceArray(int i, org.isotc211.x2005.gmi.MIEventPropertyType objectiveOccurrence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().find_element_user(OBJECTIVEOCCURRENCE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objectiveOccurrence);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objectiveOccurrence" element
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType insertNewObjectiveOccurrence(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().insert_element_user(OBJECTIVEOCCURRENCE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objectiveOccurrence" element
     */
    public org.isotc211.x2005.gmi.MIEventPropertyType addNewObjectiveOccurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIEventPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIEventPropertyType)get_store().add_element_user(OBJECTIVEOCCURRENCE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "objectiveOccurrence" element
     */
    public void removeObjectiveOccurrence(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTIVEOCCURRENCE$14, i);
        }
    }
}
