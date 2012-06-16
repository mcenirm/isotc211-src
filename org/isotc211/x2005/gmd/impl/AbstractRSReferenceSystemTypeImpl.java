/*
 * XML Type:  AbstractRS_ReferenceSystem_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractRSReferenceSystemType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML AbstractRS_ReferenceSystem_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class AbstractRSReferenceSystemTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.AbstractRSReferenceSystemType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractRSReferenceSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "name");
    private static final javax.xml.namespace.QName DOMAINOFVALIDITY$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "domainOfValidity");
    
    
    /**
     * Gets the "name" element
     */
    public org.isotc211.x2005.gmd.RSIdentifierPropertyType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.RSIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.RSIdentifierPropertyType)get_store().find_element_user(NAME$0, 0);
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
    public void setName(org.isotc211.x2005.gmd.RSIdentifierPropertyType name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.isotc211.x2005.gmd.RSIdentifierPropertyType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.RSIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.RSIdentifierPropertyType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "domainOfValidity" elements
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType[] getDomainOfValidityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOMAINOFVALIDITY$2, targetList);
            org.isotc211.x2005.gmd.EXExtentPropertyType[] result = new org.isotc211.x2005.gmd.EXExtentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "domainOfValidity" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType getDomainOfValidityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().find_element_user(DOMAINOFVALIDITY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "domainOfValidity" element
     */
    public int sizeOfDomainOfValidityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINOFVALIDITY$2);
        }
    }
    
    /**
     * Sets array of all "domainOfValidity" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDomainOfValidityArray(org.isotc211.x2005.gmd.EXExtentPropertyType[] domainOfValidityArray)
    {
        check_orphaned();
        arraySetterHelper(domainOfValidityArray, DOMAINOFVALIDITY$2);
    }
    
    /**
     * Sets ith "domainOfValidity" element
     */
    public void setDomainOfValidityArray(int i, org.isotc211.x2005.gmd.EXExtentPropertyType domainOfValidity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().find_element_user(DOMAINOFVALIDITY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(domainOfValidity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "domainOfValidity" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType insertNewDomainOfValidity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().insert_element_user(DOMAINOFVALIDITY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "domainOfValidity" element
     */
    public org.isotc211.x2005.gmd.EXExtentPropertyType addNewDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.EXExtentPropertyType target = null;
            target = (org.isotc211.x2005.gmd.EXExtentPropertyType)get_store().add_element_user(DOMAINOFVALIDITY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "domainOfValidity" element
     */
    public void removeDomainOfValidity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINOFVALIDITY$2, i);
        }
    }
}
