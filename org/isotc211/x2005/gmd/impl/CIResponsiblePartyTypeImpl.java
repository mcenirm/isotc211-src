/*
 * XML Type:  CI_ResponsibleParty_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIResponsiblePartyType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML CI_ResponsibleParty_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class CIResponsiblePartyTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.CIResponsiblePartyType
{
    private static final long serialVersionUID = 1L;
    
    public CIResponsiblePartyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIVIDUALNAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "individualName");
    private static final javax.xml.namespace.QName ORGANISATIONNAME$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "organisationName");
    private static final javax.xml.namespace.QName POSITIONNAME$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "positionName");
    private static final javax.xml.namespace.QName CONTACTINFO$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "contactInfo");
    private static final javax.xml.namespace.QName ROLE$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "role");
    
    
    /**
     * Gets the "individualName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getIndividualName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(INDIVIDUALNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "individualName" element
     */
    public boolean isSetIndividualName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIVIDUALNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "individualName" element
     */
    public void setIndividualName(org.isotc211.x2005.gco.CharacterStringPropertyType individualName)
    {
        generatedSetterHelperImpl(individualName, INDIVIDUALNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "individualName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewIndividualName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(INDIVIDUALNAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "individualName" element
     */
    public void unsetIndividualName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIVIDUALNAME$0, 0);
        }
    }
    
    /**
     * Gets the "organisationName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ORGANISATIONNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organisationName" element
     */
    public boolean isSetOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "organisationName" element
     */
    public void setOrganisationName(org.isotc211.x2005.gco.CharacterStringPropertyType organisationName)
    {
        generatedSetterHelperImpl(organisationName, ORGANISATIONNAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "organisationName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ORGANISATIONNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "organisationName" element
     */
    public void unsetOrganisationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONNAME$2, 0);
        }
    }
    
    /**
     * Gets the "positionName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getPositionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(POSITIONNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "positionName" element
     */
    public boolean isSetPositionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITIONNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "positionName" element
     */
    public void setPositionName(org.isotc211.x2005.gco.CharacterStringPropertyType positionName)
    {
        generatedSetterHelperImpl(positionName, POSITIONNAME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "positionName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewPositionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(POSITIONNAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "positionName" element
     */
    public void unsetPositionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITIONNAME$4, 0);
        }
    }
    
    /**
     * Gets the "contactInfo" element
     */
    public org.isotc211.x2005.gmd.CIContactPropertyType getContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIContactPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIContactPropertyType)get_store().find_element_user(CONTACTINFO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contactInfo" element
     */
    public boolean isSetContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTINFO$6) != 0;
        }
    }
    
    /**
     * Sets the "contactInfo" element
     */
    public void setContactInfo(org.isotc211.x2005.gmd.CIContactPropertyType contactInfo)
    {
        generatedSetterHelperImpl(contactInfo, CONTACTINFO$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "contactInfo" element
     */
    public org.isotc211.x2005.gmd.CIContactPropertyType addNewContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIContactPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIContactPropertyType)get_store().add_element_user(CONTACTINFO$6);
            return target;
        }
    }
    
    /**
     * Unsets the "contactInfo" element
     */
    public void unsetContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTINFO$6, 0);
        }
    }
    
    /**
     * Gets the "role" element
     */
    public org.isotc211.x2005.gmd.CIRoleCodePropertyType getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIRoleCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIRoleCodePropertyType)get_store().find_element_user(ROLE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "role" element
     */
    public void setRole(org.isotc211.x2005.gmd.CIRoleCodePropertyType role)
    {
        generatedSetterHelperImpl(role, ROLE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "role" element
     */
    public org.isotc211.x2005.gmd.CIRoleCodePropertyType addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIRoleCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIRoleCodePropertyType)get_store().add_element_user(ROLE$8);
            return target;
        }
    }
}
