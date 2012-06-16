/*
 * XML Type:  MI_GCPCollection_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIGCPCollectionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_GCPCollection_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIGCPCollectionTypeImpl extends org.isotc211.x2005.gmi.impl.AbstractMIGeolocationInformationTypeImpl implements org.isotc211.x2005.gmi.MIGCPCollectionType
{
    private static final long serialVersionUID = 1L;
    
    public MIGCPCollectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLLECTIONIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "collectionIdentification");
    private static final javax.xml.namespace.QName COLLECTIONNAME$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "collectionName");
    private static final javax.xml.namespace.QName COORDINATEREFERENCESYSTEM$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "coordinateReferenceSystem");
    private static final javax.xml.namespace.QName GCP$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "gcp");
    
    
    /**
     * Gets the "collectionIdentification" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getCollectionIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(COLLECTIONIDENTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "collectionIdentification" element
     */
    public void setCollectionIdentification(org.isotc211.x2005.gco.IntegerPropertyType collectionIdentification)
    {
        generatedSetterHelperImpl(collectionIdentification, COLLECTIONIDENTIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "collectionIdentification" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewCollectionIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(COLLECTIONIDENTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "collectionName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(COLLECTIONNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "collectionName" element
     */
    public void setCollectionName(org.isotc211.x2005.gco.CharacterStringPropertyType collectionName)
    {
        generatedSetterHelperImpl(collectionName, COLLECTIONNAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "collectionName" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewCollectionName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(COLLECTIONNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "coordinateReferenceSystem" element
     */
    public org.isotc211.x2005.gmd.MDReferenceSystemPropertyType getCoordinateReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDReferenceSystemPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDReferenceSystemPropertyType)get_store().find_element_user(COORDINATEREFERENCESYSTEM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateReferenceSystem" element
     */
    public void setCoordinateReferenceSystem(org.isotc211.x2005.gmd.MDReferenceSystemPropertyType coordinateReferenceSystem)
    {
        generatedSetterHelperImpl(coordinateReferenceSystem, COORDINATEREFERENCESYSTEM$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateReferenceSystem" element
     */
    public org.isotc211.x2005.gmd.MDReferenceSystemPropertyType addNewCoordinateReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDReferenceSystemPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDReferenceSystemPropertyType)get_store().add_element_user(COORDINATEREFERENCESYSTEM$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "gcp" elements
     */
    public org.isotc211.x2005.gmi.MIGCPPropertyType[] getGcpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GCP$6, targetList);
            org.isotc211.x2005.gmi.MIGCPPropertyType[] result = new org.isotc211.x2005.gmi.MIGCPPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "gcp" element
     */
    public org.isotc211.x2005.gmi.MIGCPPropertyType getGcpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPPropertyType)get_store().find_element_user(GCP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "gcp" element
     */
    public int sizeOfGcpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GCP$6);
        }
    }
    
    /**
     * Sets array of all "gcp" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGcpArray(org.isotc211.x2005.gmi.MIGCPPropertyType[] gcpArray)
    {
        check_orphaned();
        arraySetterHelper(gcpArray, GCP$6);
    }
    
    /**
     * Sets ith "gcp" element
     */
    public void setGcpArray(int i, org.isotc211.x2005.gmi.MIGCPPropertyType gcp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPPropertyType)get_store().find_element_user(GCP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(gcp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "gcp" element
     */
    public org.isotc211.x2005.gmi.MIGCPPropertyType insertNewGcp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPPropertyType)get_store().insert_element_user(GCP$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "gcp" element
     */
    public org.isotc211.x2005.gmi.MIGCPPropertyType addNewGcp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIGCPPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIGCPPropertyType)get_store().add_element_user(GCP$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "gcp" element
     */
    public void removeGcp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GCP$6, i);
        }
    }
}
