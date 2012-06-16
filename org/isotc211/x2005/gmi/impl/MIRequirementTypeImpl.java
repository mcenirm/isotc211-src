/*
 * XML Type:  MI_Requirement_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIRequirementType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Requirement_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIRequirementTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIRequirementType
{
    private static final long serialVersionUID = 1L;
    
    public MIRequirementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "citation");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "identifier");
    private static final javax.xml.namespace.QName REQUESTOR$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "requestor");
    private static final javax.xml.namespace.QName RECIPIENT$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "recipient");
    private static final javax.xml.namespace.QName PRIORITY$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "priority");
    private static final javax.xml.namespace.QName REQUESTEDDATE$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "requestedDate");
    private static final javax.xml.namespace.QName EXPIRYDATE$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "expiryDate");
    private static final javax.xml.namespace.QName SATISIFIEDPLAN$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "satisifiedPlan");
    
    
    /**
     * Gets the "citation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(CITATION$0, 0);
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
            return get_store().count_elements(CITATION$0) != 0;
        }
    }
    
    /**
     * Sets the "citation" element
     */
    public void setCitation(org.isotc211.x2005.gmd.CICitationPropertyType citation)
    {
        generatedSetterHelperImpl(citation, CITATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(CITATION$0);
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
            get_store().remove_element(CITATION$0, 0);
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
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(IDENTIFIER$2, 0);
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
        generatedSetterHelperImpl(identifier, IDENTIFIER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(IDENTIFIER$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "requestor" elements
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getRequestorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REQUESTOR$4, targetList);
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] result = new org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "requestor" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getRequestorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(REQUESTOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "requestor" element
     */
    public int sizeOfRequestorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTOR$4);
        }
    }
    
    /**
     * Sets array of all "requestor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRequestorArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] requestorArray)
    {
        check_orphaned();
        arraySetterHelper(requestorArray, REQUESTOR$4);
    }
    
    /**
     * Sets ith "requestor" element
     */
    public void setRequestorArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType requestor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(REQUESTOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(requestor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "requestor" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewRequestor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().insert_element_user(REQUESTOR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "requestor" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewRequestor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(REQUESTOR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "requestor" element
     */
    public void removeRequestor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTOR$4, i);
        }
    }
    
    /**
     * Gets array of all "recipient" elements
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECIPIENT$6, targetList);
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] result = new org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recipient" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getRecipientArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(RECIPIENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recipient" element
     */
    public int sizeOfRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECIPIENT$6);
        }
    }
    
    /**
     * Sets array of all "recipient" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRecipientArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] recipientArray)
    {
        check_orphaned();
        arraySetterHelper(recipientArray, RECIPIENT$6);
    }
    
    /**
     * Sets ith "recipient" element
     */
    public void setRecipientArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType recipient)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(RECIPIENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recipient);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recipient" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().insert_element_user(RECIPIENT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recipient" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(RECIPIENT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "recipient" element
     */
    public void removeRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECIPIENT$6, i);
        }
    }
    
    /**
     * Gets the "priority" element
     */
    public org.isotc211.x2005.gmi.MIPriorityCodePropertyType getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPriorityCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPriorityCodePropertyType)get_store().find_element_user(PRIORITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "priority" element
     */
    public void setPriority(org.isotc211.x2005.gmi.MIPriorityCodePropertyType priority)
    {
        generatedSetterHelperImpl(priority, PRIORITY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "priority" element
     */
    public org.isotc211.x2005.gmi.MIPriorityCodePropertyType addNewPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPriorityCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPriorityCodePropertyType)get_store().add_element_user(PRIORITY$8);
            return target;
        }
    }
    
    /**
     * Gets the "requestedDate" element
     */
    public org.isotc211.x2005.gmi.MIRequestedDatePropertyType getRequestedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequestedDatePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRequestedDatePropertyType)get_store().find_element_user(REQUESTEDDATE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestedDate" element
     */
    public void setRequestedDate(org.isotc211.x2005.gmi.MIRequestedDatePropertyType requestedDate)
    {
        generatedSetterHelperImpl(requestedDate, REQUESTEDDATE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestedDate" element
     */
    public org.isotc211.x2005.gmi.MIRequestedDatePropertyType addNewRequestedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequestedDatePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRequestedDatePropertyType)get_store().add_element_user(REQUESTEDDATE$10);
            return target;
        }
    }
    
    /**
     * Gets the "expiryDate" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType getExpiryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().find_element_user(EXPIRYDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "expiryDate" element
     */
    public void setExpiryDate(org.isotc211.x2005.gco.DateTimePropertyType expiryDate)
    {
        generatedSetterHelperImpl(expiryDate, EXPIRYDATE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "expiryDate" element
     */
    public org.isotc211.x2005.gco.DateTimePropertyType addNewExpiryDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DateTimePropertyType target = null;
            target = (org.isotc211.x2005.gco.DateTimePropertyType)get_store().add_element_user(EXPIRYDATE$12);
            return target;
        }
    }
    
    /**
     * Gets array of all "satisifiedPlan" elements
     */
    public org.isotc211.x2005.gmi.MIPlanPropertyType[] getSatisifiedPlanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SATISIFIEDPLAN$14, targetList);
            org.isotc211.x2005.gmi.MIPlanPropertyType[] result = new org.isotc211.x2005.gmi.MIPlanPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "satisifiedPlan" element
     */
    public org.isotc211.x2005.gmi.MIPlanPropertyType getSatisifiedPlanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanPropertyType)get_store().find_element_user(SATISIFIEDPLAN$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "satisifiedPlan" element
     */
    public int sizeOfSatisifiedPlanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SATISIFIEDPLAN$14);
        }
    }
    
    /**
     * Sets array of all "satisifiedPlan" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSatisifiedPlanArray(org.isotc211.x2005.gmi.MIPlanPropertyType[] satisifiedPlanArray)
    {
        check_orphaned();
        arraySetterHelper(satisifiedPlanArray, SATISIFIEDPLAN$14);
    }
    
    /**
     * Sets ith "satisifiedPlan" element
     */
    public void setSatisifiedPlanArray(int i, org.isotc211.x2005.gmi.MIPlanPropertyType satisifiedPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanPropertyType)get_store().find_element_user(SATISIFIEDPLAN$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(satisifiedPlan);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "satisifiedPlan" element
     */
    public org.isotc211.x2005.gmi.MIPlanPropertyType insertNewSatisifiedPlan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanPropertyType)get_store().insert_element_user(SATISIFIEDPLAN$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "satisifiedPlan" element
     */
    public org.isotc211.x2005.gmi.MIPlanPropertyType addNewSatisifiedPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlanPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlanPropertyType)get_store().add_element_user(SATISIFIEDPLAN$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "satisifiedPlan" element
     */
    public void removeSatisifiedPlan(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SATISIFIEDPLAN$14, i);
        }
    }
}
