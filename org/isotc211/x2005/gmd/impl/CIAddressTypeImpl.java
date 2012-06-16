/*
 * XML Type:  CI_Address_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIAddressType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML CI_Address_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class CIAddressTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.CIAddressType
{
    private static final long serialVersionUID = 1L;
    
    public CIAddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIVERYPOINT$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "deliveryPoint");
    private static final javax.xml.namespace.QName CITY$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "city");
    private static final javax.xml.namespace.QName ADMINISTRATIVEAREA$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "administrativeArea");
    private static final javax.xml.namespace.QName POSTALCODE$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "postalCode");
    private static final javax.xml.namespace.QName COUNTRY$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "country");
    private static final javax.xml.namespace.QName ELECTRONICMAILADDRESS$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "electronicMailAddress");
    
    
    /**
     * Gets array of all "deliveryPoint" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getDeliveryPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIVERYPOINT$0, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deliveryPoint" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDeliveryPointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DELIVERYPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deliveryPoint" element
     */
    public int sizeOfDeliveryPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYPOINT$0);
        }
    }
    
    /**
     * Sets array of all "deliveryPoint" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDeliveryPointArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] deliveryPointArray)
    {
        check_orphaned();
        arraySetterHelper(deliveryPointArray, DELIVERYPOINT$0);
    }
    
    /**
     * Sets ith "deliveryPoint" element
     */
    public void setDeliveryPointArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType deliveryPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DELIVERYPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deliveryPoint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryPoint" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewDeliveryPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(DELIVERYPOINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryPoint" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDeliveryPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DELIVERYPOINT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "deliveryPoint" element
     */
    public void removeDeliveryPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYPOINT$0, i);
        }
    }
    
    /**
     * Gets the "city" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(CITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "city" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$2) != 0;
        }
    }
    
    /**
     * Sets the "city" element
     */
    public void setCity(org.isotc211.x2005.gco.CharacterStringPropertyType city)
    {
        generatedSetterHelperImpl(city, CITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "city" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(CITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "city" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$2, 0);
        }
    }
    
    /**
     * Gets the "administrativeArea" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getAdministrativeArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ADMINISTRATIVEAREA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "administrativeArea" element
     */
    public boolean isSetAdministrativeArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMINISTRATIVEAREA$4) != 0;
        }
    }
    
    /**
     * Sets the "administrativeArea" element
     */
    public void setAdministrativeArea(org.isotc211.x2005.gco.CharacterStringPropertyType administrativeArea)
    {
        generatedSetterHelperImpl(administrativeArea, ADMINISTRATIVEAREA$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "administrativeArea" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewAdministrativeArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ADMINISTRATIVEAREA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "administrativeArea" element
     */
    public void unsetAdministrativeArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMINISTRATIVEAREA$4, 0);
        }
    }
    
    /**
     * Gets the "postalCode" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(POSTALCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "postalCode" element
     */
    public boolean isSetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTALCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "postalCode" element
     */
    public void setPostalCode(org.isotc211.x2005.gco.CharacterStringPropertyType postalCode)
    {
        generatedSetterHelperImpl(postalCode, POSTALCODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "postalCode" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(POSTALCODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "postalCode" element
     */
    public void unsetPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTALCODE$6, 0);
        }
    }
    
    /**
     * Gets the "country" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(COUNTRY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$8) != 0;
        }
    }
    
    /**
     * Sets the "country" element
     */
    public void setCountry(org.isotc211.x2005.gco.CharacterStringPropertyType country)
    {
        generatedSetterHelperImpl(country, COUNTRY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "country" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(COUNTRY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$8, 0);
        }
    }
    
    /**
     * Gets array of all "electronicMailAddress" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getElectronicMailAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ELECTRONICMAILADDRESS$10, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "electronicMailAddress" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getElectronicMailAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ELECTRONICMAILADDRESS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "electronicMailAddress" element
     */
    public int sizeOfElectronicMailAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELECTRONICMAILADDRESS$10);
        }
    }
    
    /**
     * Sets array of all "electronicMailAddress" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setElectronicMailAddressArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] electronicMailAddressArray)
    {
        check_orphaned();
        arraySetterHelper(electronicMailAddressArray, ELECTRONICMAILADDRESS$10);
    }
    
    /**
     * Sets ith "electronicMailAddress" element
     */
    public void setElectronicMailAddressArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType electronicMailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ELECTRONICMAILADDRESS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(electronicMailAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "electronicMailAddress" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewElectronicMailAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(ELECTRONICMAILADDRESS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "electronicMailAddress" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewElectronicMailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ELECTRONICMAILADDRESS$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "electronicMailAddress" element
     */
    public void removeElectronicMailAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELECTRONICMAILADDRESS$10, i);
        }
    }
}
