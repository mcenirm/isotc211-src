/*
 * XML Type:  MI_Instrument_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIInstrumentType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Instrument_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIInstrumentTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIInstrumentType
{
    private static final long serialVersionUID = 1L;
    
    public MIInstrumentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "citation");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "identifier");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "type");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "description");
    private static final javax.xml.namespace.QName MOUNTEDON$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "mountedOn");
    
    
    /**
     * Gets array of all "citation" elements
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType[] getCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CITATION$0, targetList);
            org.isotc211.x2005.gmd.CICitationPropertyType[] result = new org.isotc211.x2005.gmd.CICitationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "citation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getCitationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(CITATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "citation" element
     */
    public int sizeOfCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITATION$0);
        }
    }
    
    /**
     * Sets array of all "citation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCitationArray(org.isotc211.x2005.gmd.CICitationPropertyType[] citationArray)
    {
        check_orphaned();
        arraySetterHelper(citationArray, CITATION$0);
    }
    
    /**
     * Sets ith "citation" element
     */
    public void setCitationArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType citation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(CITATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(citation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "citation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType insertNewCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().insert_element_user(CITATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "citation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType addNewCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().add_element_user(CITATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "citation" element
     */
    public void removeCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITATION$0, i);
        }
    }
    
    /**
     * Gets the "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(IDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(org.isotc211.x2005.gmd.MDIdentifierPropertyType identifier)
    {
        generatedSetterHelperImpl(identifier, IDENTIFIER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(IDENTIFIER$2);
            return target;
        }
    }
    
    /**
     * Gets the "type" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(org.isotc211.x2005.gco.CharacterStringPropertyType type)
    {
        generatedSetterHelperImpl(type, TYPE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(TYPE$4);
            return target;
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
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DESCRIPTION$6, 0);
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
            return get_store().count_elements(DESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DESCRIPTION$6);
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
            get_store().remove_element(DESCRIPTION$6, 0);
        }
    }
    
    /**
     * Gets the "mountedOn" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPropertyType getMountedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().find_element_user(MOUNTEDON$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mountedOn" element
     */
    public boolean isSetMountedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOUNTEDON$8) != 0;
        }
    }
    
    /**
     * Sets the "mountedOn" element
     */
    public void setMountedOn(org.isotc211.x2005.gmi.MIPlatformPropertyType mountedOn)
    {
        generatedSetterHelperImpl(mountedOn, MOUNTEDON$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "mountedOn" element
     */
    public org.isotc211.x2005.gmi.MIPlatformPropertyType addNewMountedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIPlatformPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIPlatformPropertyType)get_store().add_element_user(MOUNTEDON$8);
            return target;
        }
    }
    
    /**
     * Unsets the "mountedOn" element
     */
    public void unsetMountedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOUNTEDON$8, 0);
        }
    }
}
