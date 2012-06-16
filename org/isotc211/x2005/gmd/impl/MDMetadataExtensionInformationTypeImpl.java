/*
 * XML Type:  MD_MetadataExtensionInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMetadataExtensionInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_MetadataExtensionInformation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDMetadataExtensionInformationTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDMetadataExtensionInformationType
{
    private static final long serialVersionUID = 1L;
    
    public MDMetadataExtensionInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENSIONONLINERESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "extensionOnLineResource");
    private static final javax.xml.namespace.QName EXTENDEDELEMENTINFORMATION$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "extendedElementInformation");
    
    
    /**
     * Gets the "extensionOnLineResource" element
     */
    public org.isotc211.x2005.gmd.CIOnlineResourcePropertyType getExtensionOnLineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnlineResourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIOnlineResourcePropertyType)get_store().find_element_user(EXTENSIONONLINERESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "extensionOnLineResource" element
     */
    public boolean isSetExtensionOnLineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSIONONLINERESOURCE$0) != 0;
        }
    }
    
    /**
     * Sets the "extensionOnLineResource" element
     */
    public void setExtensionOnLineResource(org.isotc211.x2005.gmd.CIOnlineResourcePropertyType extensionOnLineResource)
    {
        generatedSetterHelperImpl(extensionOnLineResource, EXTENSIONONLINERESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extensionOnLineResource" element
     */
    public org.isotc211.x2005.gmd.CIOnlineResourcePropertyType addNewExtensionOnLineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIOnlineResourcePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIOnlineResourcePropertyType)get_store().add_element_user(EXTENSIONONLINERESOURCE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "extensionOnLineResource" element
     */
    public void unsetExtensionOnLineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSIONONLINERESOURCE$0, 0);
        }
    }
    
    /**
     * Gets array of all "extendedElementInformation" elements
     */
    public org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType[] getExtendedElementInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTENDEDELEMENTINFORMATION$2, targetList);
            org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType[] result = new org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extendedElementInformation" element
     */
    public org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType getExtendedElementInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType)get_store().find_element_user(EXTENDEDELEMENTINFORMATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extendedElementInformation" element
     */
    public int sizeOfExtendedElementInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENDEDELEMENTINFORMATION$2);
        }
    }
    
    /**
     * Sets array of all "extendedElementInformation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setExtendedElementInformationArray(org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType[] extendedElementInformationArray)
    {
        check_orphaned();
        arraySetterHelper(extendedElementInformationArray, EXTENDEDELEMENTINFORMATION$2);
    }
    
    /**
     * Sets ith "extendedElementInformation" element
     */
    public void setExtendedElementInformationArray(int i, org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType extendedElementInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType)get_store().find_element_user(EXTENDEDELEMENTINFORMATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extendedElementInformation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extendedElementInformation" element
     */
    public org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType insertNewExtendedElementInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType)get_store().insert_element_user(EXTENDEDELEMENTINFORMATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extendedElementInformation" element
     */
    public org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType addNewExtendedElementInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDExtendedElementInformationPropertyType)get_store().add_element_user(EXTENDEDELEMENTINFORMATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "extendedElementInformation" element
     */
    public void removeExtendedElementInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENDEDELEMENTINFORMATION$2, i);
        }
    }
}
