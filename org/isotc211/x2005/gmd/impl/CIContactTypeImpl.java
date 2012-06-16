/*
 * XML Type:  CI_Contact_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIContactType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML CI_Contact_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class CIContactTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.CIContactType
{
    private static final long serialVersionUID = 1L;
    
    public CIContactTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHONE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "phone");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "address");
    private static final javax.xml.namespace.QName ONLINERESOURCE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "onlineResource");
    private static final javax.xml.namespace.QName HOURSOFSERVICE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "hoursOfService");
    private static final javax.xml.namespace.QName CONTACTINSTRUCTIONS$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "contactInstructions");
    
    
    /**
     * Gets the "phone" element
     */
    public org.isotc211.x2005.gmd.CITelephonePropertyType getPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CITelephonePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CITelephonePropertyType)get_store().find_element_user(PHONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "phone" element
     */
    public boolean isSetPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHONE$0) != 0;
        }
    }
    
    /**
     * Sets the "phone" element
     */
    public void setPhone(org.isotc211.x2005.gmd.CITelephonePropertyType phone)
    {
        generatedSetterHelperImpl(phone, PHONE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "phone" element
     */
    public org.isotc211.x2005.gmd.CITelephonePropertyType addNewPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CITelephonePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CITelephonePropertyType)get_store().add_element_user(PHONE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "phone" element
     */
    public void unsetPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHONE$0, 0);
        }
    }
    
    /**
     * Gets the "address" element
     */
    public org.isotc211.x2005.gmd.CIAddressPropertyType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIAddressPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIAddressPropertyType)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$2) != 0;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(org.isotc211.x2005.gmd.CIAddressPropertyType address)
    {
        generatedSetterHelperImpl(address, ADDRESS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "address" element
     */
    public org.isotc211.x2005.gmd.CIAddressPropertyType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIAddressPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIAddressPropertyType)get_store().add_element_user(ADDRESS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$2, 0);
        }
    }
    
    /**
     * Gets the "onlineResource" element
     */
    public org.isotc211.x2005.gmd.CIOnlineResourcePropertyType getOnlineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnlineResourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIOnlineResourcePropertyType)get_store().find_element_user(ONLINERESOURCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "onlineResource" element
     */
    public boolean isSetOnlineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ONLINERESOURCE$4) != 0;
        }
    }
    
    /**
     * Sets the "onlineResource" element
     */
    public void setOnlineResource(org.isotc211.x2005.gmd.CIOnlineResourcePropertyType onlineResource)
    {
        generatedSetterHelperImpl(onlineResource, ONLINERESOURCE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "onlineResource" element
     */
    public org.isotc211.x2005.gmd.CIOnlineResourcePropertyType addNewOnlineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnlineResourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIOnlineResourcePropertyType)get_store().add_element_user(ONLINERESOURCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "onlineResource" element
     */
    public void unsetOnlineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ONLINERESOURCE$4, 0);
        }
    }
    
    /**
     * Gets the "hoursOfService" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getHoursOfService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(HOURSOFSERVICE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "hoursOfService" element
     */
    public boolean isSetHoursOfService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOURSOFSERVICE$6) != 0;
        }
    }
    
    /**
     * Sets the "hoursOfService" element
     */
    public void setHoursOfService(org.isotc211.x2005.gco.CharacterStringPropertyType hoursOfService)
    {
        generatedSetterHelperImpl(hoursOfService, HOURSOFSERVICE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "hoursOfService" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewHoursOfService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(HOURSOFSERVICE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "hoursOfService" element
     */
    public void unsetHoursOfService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOURSOFSERVICE$6, 0);
        }
    }
    
    /**
     * Gets the "contactInstructions" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getContactInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(CONTACTINSTRUCTIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contactInstructions" element
     */
    public boolean isSetContactInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTINSTRUCTIONS$8) != 0;
        }
    }
    
    /**
     * Sets the "contactInstructions" element
     */
    public void setContactInstructions(org.isotc211.x2005.gco.CharacterStringPropertyType contactInstructions)
    {
        generatedSetterHelperImpl(contactInstructions, CONTACTINSTRUCTIONS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "contactInstructions" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewContactInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(CONTACTINSTRUCTIONS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "contactInstructions" element
     */
    public void unsetContactInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTINSTRUCTIONS$8, 0);
        }
    }
}
