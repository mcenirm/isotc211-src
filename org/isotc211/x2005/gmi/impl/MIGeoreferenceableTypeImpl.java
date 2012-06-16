/*
 * XML Type:  MI_Georeferenceable_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIGeoreferenceableType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Georeferenceable_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIGeoreferenceableTypeImpl extends org.isotc211.x2005.gmd.impl.MDGeoreferenceableTypeImpl implements org.isotc211.x2005.gmi.MIGeoreferenceableType
{
    private static final long serialVersionUID = 1L;
    
    public MIGeoreferenceableTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOLOCATIONINFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "geolocationInformation");
    private static final javax.xml.namespace.QName PLATFORMPARAMETERS$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "platformParameters");
    
    
    /**
     * Gets array of all "geolocationInformation" elements
     */
    public org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType[] getGeolocationInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOLOCATIONINFORMATION$0, targetList);
            org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType[] result = new org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geolocationInformation" element
     */
    public org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType getGeolocationInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType)get_store().find_element_user(GEOLOCATIONINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geolocationInformation" element
     */
    public int sizeOfGeolocationInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOLOCATIONINFORMATION$0);
        }
    }
    
    /**
     * Sets array of all "geolocationInformation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGeolocationInformationArray(org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType[] geolocationInformationArray)
    {
        check_orphaned();
        arraySetterHelper(geolocationInformationArray, GEOLOCATIONINFORMATION$0);
    }
    
    /**
     * Sets ith "geolocationInformation" element
     */
    public void setGeolocationInformationArray(int i, org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType geolocationInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType)get_store().find_element_user(GEOLOCATIONINFORMATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geolocationInformation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geolocationInformation" element
     */
    public org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType insertNewGeolocationInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType)get_store().insert_element_user(GEOLOCATIONINFORMATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geolocationInformation" element
     */
    public org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType addNewGeolocationInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGeolocationInformationPropertyType)get_store().add_element_user(GEOLOCATIONINFORMATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "geolocationInformation" element
     */
    public void removeGeolocationInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOLOCATIONINFORMATION$0, i);
        }
    }
    
    /**
     * Gets the "platformParameters" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPropertyType getPlatformParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().find_element_user(PLATFORMPARAMETERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "platformParameters" element
     */
    public boolean isSetPlatformParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLATFORMPARAMETERS$2) != 0;
        }
    }
    
    /**
     * Sets the "platformParameters" element
     */
    public void setPlatformParameters(org.isotc211.x2005.gmi.MIPlatformPropertyType platformParameters)
    {
        generatedSetterHelperImpl(platformParameters, PLATFORMPARAMETERS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "platformParameters" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPropertyType addNewPlatformParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().add_element_user(PLATFORMPARAMETERS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "platformParameters" element
     */
    public void unsetPlatformParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLATFORMPARAMETERS$2, 0);
        }
    }
}
