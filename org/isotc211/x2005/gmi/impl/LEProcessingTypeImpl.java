/*
 * XML Type:  LE_Processing_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LEProcessingType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML LE_Processing_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class LEProcessingTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.LEProcessingType
{
    private static final long serialVersionUID = 1L;
    
    public LEProcessingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "identifier");
    private static final javax.xml.namespace.QName SOFTWAREREFERENCE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "softwareReference");
    private static final javax.xml.namespace.QName PROCEDUREDESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "procedureDescription");
    private static final javax.xml.namespace.QName DOCUMENTATION$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "documentation");
    private static final javax.xml.namespace.QName RUNTIMEPARAMETERS$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "runTimeParameters");
    private static final javax.xml.namespace.QName ALGORITHM$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "algorithm");
    
    
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
     * Gets array of all "softwareReference" elements
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType[] getSoftwareReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOFTWAREREFERENCE$2, targetList);
            org.isotc211.x2005.gmd.CICitationPropertyType[] result = new org.isotc211.x2005.gmd.CICitationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "softwareReference" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getSoftwareReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(SOFTWAREREFERENCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "softwareReference" element
     */
    public int sizeOfSoftwareReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWAREREFERENCE$2);
        }
    }
    
    /**
     * Sets array of all "softwareReference" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSoftwareReferenceArray(org.isotc211.x2005.gmd.CICitationPropertyType[] softwareReferenceArray)
    {
        check_orphaned();
        arraySetterHelper(softwareReferenceArray, SOFTWAREREFERENCE$2);
    }
    
    /**
     * Sets ith "softwareReference" element
     */
    public void setSoftwareReferenceArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType softwareReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(SOFTWAREREFERENCE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(softwareReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "softwareReference" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType insertNewSoftwareReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().insert_element_user(SOFTWAREREFERENCE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "softwareReference" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewSoftwareReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(SOFTWAREREFERENCE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "softwareReference" element
     */
    public void removeSoftwareReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWAREREFERENCE$2, i);
        }
    }
    
    /**
     * Gets the "procedureDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getProcedureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(PROCEDUREDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "procedureDescription" element
     */
    public boolean isSetProcedureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCEDUREDESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "procedureDescription" element
     */
    public void setProcedureDescription(org.isotc211.x2005.gco.CharacterStringPropertyType procedureDescription)
    {
        generatedSetterHelperImpl(procedureDescription, PROCEDUREDESCRIPTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "procedureDescription" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewProcedureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(PROCEDUREDESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "procedureDescription" element
     */
    public void unsetProcedureDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCEDUREDESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets array of all "documentation" elements
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType[] getDocumentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTATION$6, targetList);
            org.isotc211.x2005.gmd.CICitationPropertyType[] result = new org.isotc211.x2005.gmd.CICitationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "documentation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getDocumentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(DOCUMENTATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "documentation" element
     */
    public int sizeOfDocumentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATION$6);
        }
    }
    
    /**
     * Sets array of all "documentation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDocumentationArray(org.isotc211.x2005.gmd.CICitationPropertyType[] documentationArray)
    {
        check_orphaned();
        arraySetterHelper(documentationArray, DOCUMENTATION$6);
    }
    
    /**
     * Sets ith "documentation" element
     */
    public void setDocumentationArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType documentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(DOCUMENTATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(documentation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType insertNewDocumentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().insert_element_user(DOCUMENTATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(DOCUMENTATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "documentation" element
     */
    public void removeDocumentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATION$6, i);
        }
    }
    
    /**
     * Gets the "runTimeParameters" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getRunTimeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(RUNTIMEPARAMETERS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "runTimeParameters" element
     */
    public boolean isSetRunTimeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNTIMEPARAMETERS$8) != 0;
        }
    }
    
    /**
     * Sets the "runTimeParameters" element
     */
    public void setRunTimeParameters(org.isotc211.x2005.gco.CharacterStringPropertyType runTimeParameters)
    {
        generatedSetterHelperImpl(runTimeParameters, RUNTIMEPARAMETERS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "runTimeParameters" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewRunTimeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(RUNTIMEPARAMETERS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "runTimeParameters" element
     */
    public void unsetRunTimeParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNTIMEPARAMETERS$8, 0);
        }
    }
    
    /**
     * Gets array of all "algorithm" elements
     */
    public org.isotc211.x2005.gmi.LEAlgorithmPropertyType[] getAlgorithmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALGORITHM$10, targetList);
            org.isotc211.x2005.gmi.LEAlgorithmPropertyType[] result = new org.isotc211.x2005.gmi.LEAlgorithmPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "algorithm" element
     */
    public org.isotc211.x2005.gmi.LEAlgorithmPropertyType getAlgorithmArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEAlgorithmPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LEAlgorithmPropertyType)get_store().find_element_user(ALGORITHM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "algorithm" element
     */
    public int sizeOfAlgorithmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALGORITHM$10);
        }
    }
    
    /**
     * Sets array of all "algorithm" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAlgorithmArray(org.isotc211.x2005.gmi.LEAlgorithmPropertyType[] algorithmArray)
    {
        check_orphaned();
        arraySetterHelper(algorithmArray, ALGORITHM$10);
    }
    
    /**
     * Sets ith "algorithm" element
     */
    public void setAlgorithmArray(int i, org.isotc211.x2005.gmi.LEAlgorithmPropertyType algorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEAlgorithmPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LEAlgorithmPropertyType)get_store().find_element_user(ALGORITHM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(algorithm);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "algorithm" element
     */
    public org.isotc211.x2005.gmi.LEAlgorithmPropertyType insertNewAlgorithm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEAlgorithmPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LEAlgorithmPropertyType)get_store().insert_element_user(ALGORITHM$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "algorithm" element
     */
    public org.isotc211.x2005.gmi.LEAlgorithmPropertyType addNewAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.LEAlgorithmPropertyType target = null;
            target = (org.isotc211.x2005.gmi.LEAlgorithmPropertyType)get_store().add_element_user(ALGORITHM$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "algorithm" element
     */
    public void removeAlgorithm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALGORITHM$10, i);
        }
    }
}
