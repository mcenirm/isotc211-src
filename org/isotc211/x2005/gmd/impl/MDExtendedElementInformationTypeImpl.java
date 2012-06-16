/*
 * XML Type:  MD_ExtendedElementInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDExtendedElementInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_ExtendedElementInformation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDExtendedElementInformationTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDExtendedElementInformationType
{
    private static final long serialVersionUID = 1L;
    
    public MDExtendedElementInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "name");
    private static final javax.xml.namespace.QName SHORTNAME$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "shortName");
    private static final javax.xml.namespace.QName DOMAINCODE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "domainCode");
    private static final javax.xml.namespace.QName DEFINITION$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "definition");
    private static final javax.xml.namespace.QName OBLIGATION$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "obligation");
    private static final javax.xml.namespace.QName CONDITION$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "condition");
    private static final javax.xml.namespace.QName DATATYPE$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "dataType");
    private static final javax.xml.namespace.QName MAXIMUMOCCURRENCE$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "maximumOccurrence");
    private static final javax.xml.namespace.QName DOMAINVALUE$16 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "domainValue");
    private static final javax.xml.namespace.QName PARENTENTITY$18 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "parentEntity");
    private static final javax.xml.namespace.QName RULE$20 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "rule");
    private static final javax.xml.namespace.QName RATIONALE$22 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "rationale");
    private static final javax.xml.namespace.QName SOURCE$24 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "source");
    
    
    /**
     * Gets the "name" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.isotc211.x2005.gco.CharacterStringPropertyType name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "shortName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(SHORTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "shortName" element
     */
    public boolean isSetShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHORTNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "shortName" element
     */
    public void setShortName(org.isotc211.x2005.gco.CharacterStringPropertyType shortName)
    {
        generatedSetterHelperImpl(shortName, SHORTNAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "shortName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(SHORTNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "shortName" element
     */
    public void unsetShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHORTNAME$2, 0);
        }
    }
    
    /**
     * Gets the "domainCode" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getDomainCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(DOMAINCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "domainCode" element
     */
    public boolean isSetDomainCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "domainCode" element
     */
    public void setDomainCode(org.isotc211.x2005.gco.IntegerPropertyType domainCode)
    {
        generatedSetterHelperImpl(domainCode, DOMAINCODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "domainCode" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewDomainCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(DOMAINCODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "domainCode" element
     */
    public void unsetDomainCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINCODE$4, 0);
        }
    }
    
    /**
     * Gets the "definition" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DEFINITION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definition" element
     */
    public void setDefinition(org.isotc211.x2005.gco.CharacterStringPropertyType definition)
    {
        generatedSetterHelperImpl(definition, DEFINITION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definition" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DEFINITION$6);
            return target;
        }
    }
    
    /**
     * Gets the "obligation" element
     */
    public org.isotc211.x2005.gmd.MDObligationCodePropertyType getObligation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDObligationCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDObligationCodePropertyType)get_store().find_element_user(OBLIGATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "obligation" element
     */
    public boolean isSetObligation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBLIGATION$8) != 0;
        }
    }
    
    /**
     * Sets the "obligation" element
     */
    public void setObligation(org.isotc211.x2005.gmd.MDObligationCodePropertyType obligation)
    {
        generatedSetterHelperImpl(obligation, OBLIGATION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "obligation" element
     */
    public org.isotc211.x2005.gmd.MDObligationCodePropertyType addNewObligation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDObligationCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDObligationCodePropertyType)get_store().add_element_user(OBLIGATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "obligation" element
     */
    public void unsetObligation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBLIGATION$8, 0);
        }
    }
    
    /**
     * Gets the "condition" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(CONDITION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "condition" element
     */
    public boolean isSetCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITION$10) != 0;
        }
    }
    
    /**
     * Sets the "condition" element
     */
    public void setCondition(org.isotc211.x2005.gco.CharacterStringPropertyType condition)
    {
        generatedSetterHelperImpl(condition, CONDITION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "condition" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(CONDITION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "condition" element
     */
    public void unsetCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITION$10, 0);
        }
    }
    
    /**
     * Gets the "dataType" element
     */
    public org.isotc211.x2005.gmd.MDDatatypeCodePropertyType getDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDatatypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDatatypeCodePropertyType)get_store().find_element_user(DATATYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataType" element
     */
    public void setDataType(org.isotc211.x2005.gmd.MDDatatypeCodePropertyType dataType)
    {
        generatedSetterHelperImpl(dataType, DATATYPE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataType" element
     */
    public org.isotc211.x2005.gmd.MDDatatypeCodePropertyType addNewDataType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDDatatypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDDatatypeCodePropertyType)get_store().add_element_user(DATATYPE$12);
            return target;
        }
    }
    
    /**
     * Gets the "maximumOccurrence" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getMaximumOccurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(MAXIMUMOCCURRENCE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maximumOccurrence" element
     */
    public boolean isSetMaximumOccurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMUMOCCURRENCE$14) != 0;
        }
    }
    
    /**
     * Sets the "maximumOccurrence" element
     */
    public void setMaximumOccurrence(org.isotc211.x2005.gco.CharacterStringPropertyType maximumOccurrence)
    {
        generatedSetterHelperImpl(maximumOccurrence, MAXIMUMOCCURRENCE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maximumOccurrence" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewMaximumOccurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(MAXIMUMOCCURRENCE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "maximumOccurrence" element
     */
    public void unsetMaximumOccurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMUMOCCURRENCE$14, 0);
        }
    }
    
    /**
     * Gets the "domainValue" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDomainValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DOMAINVALUE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "domainValue" element
     */
    public boolean isSetDomainValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINVALUE$16) != 0;
        }
    }
    
    /**
     * Sets the "domainValue" element
     */
    public void setDomainValue(org.isotc211.x2005.gco.CharacterStringPropertyType domainValue)
    {
        generatedSetterHelperImpl(domainValue, DOMAINVALUE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "domainValue" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDomainValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DOMAINVALUE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "domainValue" element
     */
    public void unsetDomainValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINVALUE$16, 0);
        }
    }
    
    /**
     * Gets array of all "parentEntity" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getParentEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARENTENTITY$18, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parentEntity" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getParentEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(PARENTENTITY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parentEntity" element
     */
    public int sizeOfParentEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTENTITY$18);
        }
    }
    
    /**
     * Sets array of all "parentEntity" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParentEntityArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] parentEntityArray)
    {
        check_orphaned();
        arraySetterHelper(parentEntityArray, PARENTENTITY$18);
    }
    
    /**
     * Sets ith "parentEntity" element
     */
    public void setParentEntityArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType parentEntity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(PARENTENTITY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parentEntity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parentEntity" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewParentEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(PARENTENTITY$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parentEntity" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewParentEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(PARENTENTITY$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "parentEntity" element
     */
    public void removeParentEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTENTITY$18, i);
        }
    }
    
    /**
     * Gets the "rule" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(RULE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rule" element
     */
    public void setRule(org.isotc211.x2005.gco.CharacterStringPropertyType rule)
    {
        generatedSetterHelperImpl(rule, RULE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rule" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(RULE$20);
            return target;
        }
    }
    
    /**
     * Gets array of all "rationale" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getRationaleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RATIONALE$22, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rationale" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getRationaleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(RATIONALE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rationale" element
     */
    public int sizeOfRationaleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RATIONALE$22);
        }
    }
    
    /**
     * Sets array of all "rationale" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRationaleArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] rationaleArray)
    {
        check_orphaned();
        arraySetterHelper(rationaleArray, RATIONALE$22);
    }
    
    /**
     * Sets ith "rationale" element
     */
    public void setRationaleArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType rationale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(RATIONALE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rationale);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rationale" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewRationale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(RATIONALE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rationale" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewRationale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(RATIONALE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "rationale" element
     */
    public void removeRationale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RATIONALE$22, i);
        }
    }
    
    /**
     * Gets array of all "source" elements
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$24, targetList);
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] result = new org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "source" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(SOURCE$24, i);
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
            return get_store().count_elements(SOURCE$24);
        }
    }
    
    /**
     * Sets array of all "source" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSourceArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] sourceArray)
    {
        check_orphaned();
        arraySetterHelper(sourceArray, SOURCE$24);
    }
    
    /**
     * Sets ith "source" element
     */
    public void setSourceArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(SOURCE$24, i);
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
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().insert_element_user(SOURCE$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(SOURCE$24);
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
            get_store().remove_element(SOURCE$24, i);
        }
    }
}
