/*
 * XML Type:  MI_Plan_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIPlanType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Plan_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIPlanTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIPlanType
{
    private static final long serialVersionUID = 1L;
    
    public MIPlanTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "type");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "status");
    private static final javax.xml.namespace.QName CITATION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "citation");
    private static final javax.xml.namespace.QName SATISFIEDREQUIREMENT$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "satisfiedRequirement");
    private static final javax.xml.namespace.QName OPERATION$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "operation");
    
    
    /**
     * Gets the "type" element
     */
    public org.isotc211.x2005.gmi.MIGeometryTypeCodePropertyType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGeometryTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGeometryTypeCodePropertyType)get_store().find_element_user(TYPE$0, 0);
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
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.isotc211.x2005.gmi.MIGeometryTypeCodePropertyType type)
    {
        generatedSetterHelperImpl(type, TYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.isotc211.x2005.gmi.MIGeometryTypeCodePropertyType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGeometryTypeCodePropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGeometryTypeCodePropertyType)get_store().add_element_user(TYPE$0);
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
            get_store().remove_element(TYPE$0, 0);
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
            target = (org.isotc211.x2005.gmd.MDProgressCodePropertyType)get_store().find_element_user(STATUS$2, 0);
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
        generatedSetterHelperImpl(status, STATUS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.isotc211.x2005.gmd.MDProgressCodePropertyType)get_store().add_element_user(STATUS$2);
            return target;
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
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(CITATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "citation" element
     */
    public void setCitation(org.isotc211.x2005.gmd.CICitationPropertyType citation)
    {
        generatedSetterHelperImpl(citation, CITATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(CITATION$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "satisfiedRequirement" elements
     */
    public org.isotc211.x2005.gmi.MIRequirementPropertyType[] getSatisfiedRequirementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SATISFIEDREQUIREMENT$6, targetList);
            org.isotc211.x2005.gmi.MIRequirementPropertyType[] result = new org.isotc211.x2005.gmi.MIRequirementPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "satisfiedRequirement" element
     */
    public org.isotc211.x2005.gmi.MIRequirementPropertyType getSatisfiedRequirementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequirementPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRequirementPropertyType)get_store().find_element_user(SATISFIEDREQUIREMENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "satisfiedRequirement" element
     */
    public int sizeOfSatisfiedRequirementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SATISFIEDREQUIREMENT$6);
        }
    }
    
    /**
     * Sets array of all "satisfiedRequirement" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSatisfiedRequirementArray(org.isotc211.x2005.gmi.MIRequirementPropertyType[] satisfiedRequirementArray)
    {
        check_orphaned();
        arraySetterHelper(satisfiedRequirementArray, SATISFIEDREQUIREMENT$6);
    }
    
    /**
     * Sets ith "satisfiedRequirement" element
     */
    public void setSatisfiedRequirementArray(int i, org.isotc211.x2005.gmi.MIRequirementPropertyType satisfiedRequirement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequirementPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRequirementPropertyType)get_store().find_element_user(SATISFIEDREQUIREMENT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(satisfiedRequirement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "satisfiedRequirement" element
     */
    public org.isotc211.x2005.gmi.MIRequirementPropertyType insertNewSatisfiedRequirement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequirementPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRequirementPropertyType)get_store().insert_element_user(SATISFIEDREQUIREMENT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "satisfiedRequirement" element
     */
    public org.isotc211.x2005.gmi.MIRequirementPropertyType addNewSatisfiedRequirement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIRequirementPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIRequirementPropertyType)get_store().add_element_user(SATISFIEDREQUIREMENT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "satisfiedRequirement" element
     */
    public void removeSatisfiedRequirement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SATISFIEDREQUIREMENT$6, i);
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
}
