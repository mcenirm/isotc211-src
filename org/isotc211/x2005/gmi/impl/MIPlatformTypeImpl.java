/*
 * XML Type:  MI_Platform_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIPlatformType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi.impl;
/**
 * An XML MI_Platform_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public class MIPlatformTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmi.MIPlatformType
{
    private static final long serialVersionUID = 1L;
    
    public MIPlatformTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "citation");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "identifier");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "description");
    private static final javax.xml.namespace.QName SPONSOR$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "sponsor");
    private static final javax.xml.namespace.QName INSTRUMENT$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmi", "instrument");
    
    
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
     * Gets the "description" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(DESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * Gets array of all "sponsor" elements
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getSponsorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPONSOR$6, targetList);
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] result = new org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sponsor" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getSponsorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(SPONSOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sponsor" element
     */
    public int sizeOfSponsorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPONSOR$6);
        }
    }
    
    /**
     * Sets array of all "sponsor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSponsorArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] sponsorArray)
    {
        check_orphaned();
        arraySetterHelper(sponsorArray, SPONSOR$6);
    }
    
    /**
     * Sets ith "sponsor" element
     */
    public void setSponsorArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType sponsor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(SPONSOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sponsor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sponsor" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewSponsor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().insert_element_user(SPONSOR$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sponsor" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewSponsor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(SPONSOR$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "sponsor" element
     */
    public void removeSponsor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPONSOR$6, i);
        }
    }
    
    /**
     * Gets array of all "instrument" elements
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType[] getInstrumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INSTRUMENT$8, targetList);
            org.isotc211.x2005.gmi.MIInstrumentPropertyType[] result = new org.isotc211.x2005.gmi.MIInstrumentPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "instrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType getInstrumentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().find_element_user(INSTRUMENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "instrument" element
     */
    public int sizeOfInstrumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSTRUMENT$8);
        }
    }
    
    /**
     * Sets array of all "instrument" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInstrumentArray(org.isotc211.x2005.gmi.MIInstrumentPropertyType[] instrumentArray)
    {
        check_orphaned();
        arraySetterHelper(instrumentArray, INSTRUMENT$8);
    }
    
    /**
     * Sets ith "instrument" element
     */
    public void setInstrumentArray(int i, org.isotc211.x2005.gmi.MIInstrumentPropertyType instrument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().find_element_user(INSTRUMENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(instrument);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType insertNewInstrument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().insert_element_user(INSTRUMENT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instrument" element
     */
    public org.isotc211.x2005.gmi.MIInstrumentPropertyType addNewInstrument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmi.MIInstrumentPropertyType target = null;
            target = (org.isotc211.x2005.gmi.MIInstrumentPropertyType)get_store().add_element_user(INSTRUMENT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "instrument" element
     */
    public void removeInstrument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSTRUMENT$8, i);
        }
    }
}
