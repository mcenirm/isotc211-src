/*
 * XML Type:  CI_OnlineResource_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIOnlineResourceType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML CI_OnlineResource_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class CIOnlineResourceTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.CIOnlineResourceType
{
    private static final long serialVersionUID = 1L;
    
    public CIOnlineResourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKAGE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "linkage");
    private static final javax.xml.namespace.QName PROTOCOL$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "protocol");
    private static final javax.xml.namespace.QName APPLICATIONPROFILE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "applicationProfile");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "description");
    private static final javax.xml.namespace.QName FUNCTION$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "function");
    
    
    /**
     * Gets the "linkage" element
     */
    public org.isotc211.x2005.gmd.URLPropertyType getLinkage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.URLPropertyType target = null;
            target = (org.isotc211.x2005.gmd.URLPropertyType)get_store().find_element_user(LINKAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "linkage" element
     */
    public void setLinkage(org.isotc211.x2005.gmd.URLPropertyType linkage)
    {
        generatedSetterHelperImpl(linkage, LINKAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "linkage" element
     */
    public org.isotc211.x2005.gmd.URLPropertyType addNewLinkage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.URLPropertyType target = null;
            target = (org.isotc211.x2005.gmd.URLPropertyType)get_store().add_element_user(LINKAGE$0);
            return target;
        }
    }
    
    /**
     * Gets the "protocol" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(PROTOCOL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "protocol" element
     */
    public boolean isSetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROTOCOL$2) != 0;
        }
    }
    
    /**
     * Sets the "protocol" element
     */
    public void setProtocol(org.isotc211.x2005.gco.CharacterStringPropertyType protocol)
    {
        generatedSetterHelperImpl(protocol, PROTOCOL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "protocol" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(PROTOCOL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "protocol" element
     */
    public void unsetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROTOCOL$2, 0);
        }
    }
    
    /**
     * Gets the "applicationProfile" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getApplicationProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(APPLICATIONPROFILE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "applicationProfile" element
     */
    public boolean isSetApplicationProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APPLICATIONPROFILE$4) != 0;
        }
    }
    
    /**
     * Sets the "applicationProfile" element
     */
    public void setApplicationProfile(org.isotc211.x2005.gco.CharacterStringPropertyType applicationProfile)
    {
        generatedSetterHelperImpl(applicationProfile, APPLICATIONPROFILE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "applicationProfile" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewApplicationProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(APPLICATIONPROFILE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "applicationProfile" element
     */
    public void unsetApplicationProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APPLICATIONPROFILE$4, 0);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$6) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.isotc211.x2005.gco.CharacterStringPropertyType name)
    {
        generatedSetterHelperImpl(name, NAME$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(NAME$6);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$6, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DESCRIPTION$8, 0);
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
            return get_store().count_elements(DESCRIPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DESCRIPTION$8);
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
            get_store().remove_element(DESCRIPTION$8, 0);
        }
    }
    
    /**
     * Gets the "function" element
     */
    public org.isotc211.x2005.gmd.CIOnLineFunctionCodePropertyType getFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnLineFunctionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIOnLineFunctionCodePropertyType)get_store().find_element_user(FUNCTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "function" element
     */
    public boolean isSetFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNCTION$10) != 0;
        }
    }
    
    /**
     * Sets the "function" element
     */
    public void setFunction(org.isotc211.x2005.gmd.CIOnLineFunctionCodePropertyType function)
    {
        generatedSetterHelperImpl(function, FUNCTION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "function" element
     */
    public org.isotc211.x2005.gmd.CIOnLineFunctionCodePropertyType addNewFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnLineFunctionCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIOnLineFunctionCodePropertyType)get_store().add_element_user(FUNCTION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "function" element
     */
    public void unsetFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNCTION$10, 0);
        }
    }
}
