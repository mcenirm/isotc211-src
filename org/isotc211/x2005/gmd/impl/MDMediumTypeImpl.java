/*
 * XML Type:  MD_Medium_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMediumType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML MD_Medium_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class MDMediumTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.MDMediumType
{
    private static final long serialVersionUID = 1L;
    
    public MDMediumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "name");
    private static final javax.xml.namespace.QName DENSITY$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "density");
    private static final javax.xml.namespace.QName DENSITYUNITS$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "densityUnits");
    private static final javax.xml.namespace.QName VOLUMES$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "volumes");
    private static final javax.xml.namespace.QName MEDIUMFORMAT$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "mediumFormat");
    private static final javax.xml.namespace.QName MEDIUMNOTE$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "mediumNote");
    
    
    /**
     * Gets the "name" element
     */
    public org.isotc211.x2005.gmd.MDMediumNameCodePropertyType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMediumNameCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMediumNameCodePropertyType)get_store().find_element_user(NAME$0, 0);
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
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.isotc211.x2005.gmd.MDMediumNameCodePropertyType name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.isotc211.x2005.gmd.MDMediumNameCodePropertyType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMediumNameCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMediumNameCodePropertyType)get_store().add_element_user(NAME$0);
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
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets array of all "density" elements
     */
    public org.isotc211.x2005.gco.RealPropertyType[] getDensityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DENSITY$2, targetList);
            org.isotc211.x2005.gco.RealPropertyType[] result = new org.isotc211.x2005.gco.RealPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "density" element
     */
    public org.isotc211.x2005.gco.RealPropertyType getDensityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(DENSITY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "density" element
     */
    public int sizeOfDensityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DENSITY$2);
        }
    }
    
    /**
     * Sets array of all "density" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDensityArray(org.isotc211.x2005.gco.RealPropertyType[] densityArray)
    {
        check_orphaned();
        arraySetterHelper(densityArray, DENSITY$2);
    }
    
    /**
     * Sets ith "density" element
     */
    public void setDensityArray(int i, org.isotc211.x2005.gco.RealPropertyType density)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().find_element_user(DENSITY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(density);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "density" element
     */
    public org.isotc211.x2005.gco.RealPropertyType insertNewDensity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().insert_element_user(DENSITY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "density" element
     */
    public org.isotc211.x2005.gco.RealPropertyType addNewDensity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.RealPropertyType target = null;
            target = (org.isotc211.x2005.gco.RealPropertyType)get_store().add_element_user(DENSITY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "density" element
     */
    public void removeDensity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DENSITY$2, i);
        }
    }
    
    /**
     * Gets the "densityUnits" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDensityUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DENSITYUNITS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "densityUnits" element
     */
    public boolean isSetDensityUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DENSITYUNITS$4) != 0;
        }
    }
    
    /**
     * Sets the "densityUnits" element
     */
    public void setDensityUnits(org.isotc211.x2005.gco.CharacterStringPropertyType densityUnits)
    {
        generatedSetterHelperImpl(densityUnits, DENSITYUNITS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "densityUnits" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewDensityUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DENSITYUNITS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "densityUnits" element
     */
    public void unsetDensityUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DENSITYUNITS$4, 0);
        }
    }
    
    /**
     * Gets the "volumes" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType getVolumes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().find_element_user(VOLUMES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "volumes" element
     */
    public boolean isSetVolumes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOLUMES$6) != 0;
        }
    }
    
    /**
     * Sets the "volumes" element
     */
    public void setVolumes(org.isotc211.x2005.gco.IntegerPropertyType volumes)
    {
        generatedSetterHelperImpl(volumes, VOLUMES$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "volumes" element
     */
    public org.isotc211.x2005.gco.IntegerPropertyType addNewVolumes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.IntegerPropertyType target = null;
            target = (org.isotc211.x2005.gco.IntegerPropertyType)get_store().add_element_user(VOLUMES$6);
            return target;
        }
    }
    
    /**
     * Unsets the "volumes" element
     */
    public void unsetVolumes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOLUMES$6, 0);
        }
    }
    
    /**
     * Gets array of all "mediumFormat" elements
     */
    public org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType[] getMediumFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEDIUMFORMAT$8, targetList);
            org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType[] result = new org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mediumFormat" element
     */
    public org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType getMediumFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType)get_store().find_element_user(MEDIUMFORMAT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mediumFormat" element
     */
    public int sizeOfMediumFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDIUMFORMAT$8);
        }
    }
    
    /**
     * Sets array of all "mediumFormat" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMediumFormatArray(org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType[] mediumFormatArray)
    {
        check_orphaned();
        arraySetterHelper(mediumFormatArray, MEDIUMFORMAT$8);
    }
    
    /**
     * Sets ith "mediumFormat" element
     */
    public void setMediumFormatArray(int i, org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType mediumFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType)get_store().find_element_user(MEDIUMFORMAT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mediumFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mediumFormat" element
     */
    public org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType insertNewMediumFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType)get_store().insert_element_user(MEDIUMFORMAT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mediumFormat" element
     */
    public org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType addNewMediumFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType)get_store().add_element_user(MEDIUMFORMAT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "mediumFormat" element
     */
    public void removeMediumFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIUMFORMAT$8, i);
        }
    }
    
    /**
     * Gets the "mediumNote" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getMediumNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(MEDIUMNOTE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mediumNote" element
     */
    public boolean isSetMediumNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEDIUMNOTE$10) != 0;
        }
    }
    
    /**
     * Sets the "mediumNote" element
     */
    public void setMediumNote(org.isotc211.x2005.gco.CharacterStringPropertyType mediumNote)
    {
        generatedSetterHelperImpl(mediumNote, MEDIUMNOTE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mediumNote" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewMediumNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(MEDIUMNOTE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "mediumNote" element
     */
    public void unsetMediumNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEDIUMNOTE$10, 0);
        }
    }
}
