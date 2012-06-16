/*
 * XML Type:  CI_Citation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CICitationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML CI_Citation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class CICitationTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.CICitationType
{
    private static final long serialVersionUID = 1L;
    
    public CICitationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "title");
    private static final javax.xml.namespace.QName ALTERNATETITLE$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "alternateTitle");
    private static final javax.xml.namespace.QName DATE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "date");
    private static final javax.xml.namespace.QName EDITION$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "edition");
    private static final javax.xml.namespace.QName EDITIONDATE$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "editionDate");
    private static final javax.xml.namespace.QName IDENTIFIER$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "identifier");
    private static final javax.xml.namespace.QName CITEDRESPONSIBLEPARTY$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "citedResponsibleParty");
    private static final javax.xml.namespace.QName PRESENTATIONFORM$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "presentationForm");
    private static final javax.xml.namespace.QName SERIES$16 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "series");
    private static final javax.xml.namespace.QName OTHERCITATIONDETAILS$18 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "otherCitationDetails");
    private static final javax.xml.namespace.QName COLLECTIVETITLE$20 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "collectiveTitle");
    private static final javax.xml.namespace.QName ISBN$22 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "ISBN");
    private static final javax.xml.namespace.QName ISSN$24 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "ISSN");
    
    
    /**
     * Gets the "title" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(org.isotc211.x2005.gco.CharacterStringPropertyType title)
    {
        generatedSetterHelperImpl(title, TITLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(TITLE$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "alternateTitle" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getAlternateTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALTERNATETITLE$2, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alternateTitle" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getAlternateTitleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ALTERNATETITLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alternateTitle" element
     */
    public int sizeOfAlternateTitleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTERNATETITLE$2);
        }
    }
    
    /**
     * Sets array of all "alternateTitle" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAlternateTitleArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] alternateTitleArray)
    {
        check_orphaned();
        arraySetterHelper(alternateTitleArray, ALTERNATETITLE$2);
    }
    
    /**
     * Sets ith "alternateTitle" element
     */
    public void setAlternateTitleArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType alternateTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ALTERNATETITLE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alternateTitle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alternateTitle" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewAlternateTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(ALTERNATETITLE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alternateTitle" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewAlternateTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ALTERNATETITLE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "alternateTitle" element
     */
    public void removeAlternateTitle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTERNATETITLE$2, i);
        }
    }
    
    /**
     * Gets array of all "date" elements
     */
    public org.isotc211.x2005.gmd.CIDatePropertyType[] getDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATE$4, targetList);
            org.isotc211.x2005.gmd.CIDatePropertyType[] result = new org.isotc211.x2005.gmd.CIDatePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "date" element
     */
    public org.isotc211.x2005.gmd.CIDatePropertyType getDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIDatePropertyType)get_store().find_element_user(DATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "date" element
     */
    public int sizeOfDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATE$4);
        }
    }
    
    /**
     * Sets array of all "date" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDateArray(org.isotc211.x2005.gmd.CIDatePropertyType[] dateArray)
    {
        check_orphaned();
        arraySetterHelper(dateArray, DATE$4);
    }
    
    /**
     * Sets ith "date" element
     */
    public void setDateArray(int i, org.isotc211.x2005.gmd.CIDatePropertyType date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIDatePropertyType)get_store().find_element_user(DATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(date);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "date" element
     */
    public org.isotc211.x2005.gmd.CIDatePropertyType insertNewDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIDatePropertyType)get_store().insert_element_user(DATE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "date" element
     */
    public org.isotc211.x2005.gmd.CIDatePropertyType addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIDatePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIDatePropertyType)get_store().add_element_user(DATE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "date" element
     */
    public void removeDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATE$4, i);
        }
    }
    
    /**
     * Gets the "edition" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getEdition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(EDITION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "edition" element
     */
    public boolean isSetEdition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EDITION$6) != 0;
        }
    }
    
    /**
     * Sets the "edition" element
     */
    public void setEdition(org.isotc211.x2005.gco.CharacterStringPropertyType edition)
    {
        generatedSetterHelperImpl(edition, EDITION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "edition" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewEdition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(EDITION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "edition" element
     */
    public void unsetEdition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EDITION$6, 0);
        }
    }
    
    /**
     * Gets the "editionDate" element
     */
    public org.isotc211.x2005.gco.DatePropertyType getEditionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DatePropertyType target = null;
            target = (org.isotc211.x2005.gco.DatePropertyType)get_store().find_element_user(EDITIONDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "editionDate" element
     */
    public boolean isSetEditionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EDITIONDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "editionDate" element
     */
    public void setEditionDate(org.isotc211.x2005.gco.DatePropertyType editionDate)
    {
        generatedSetterHelperImpl(editionDate, EDITIONDATE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "editionDate" element
     */
    public org.isotc211.x2005.gco.DatePropertyType addNewEditionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.DatePropertyType target = null;
            target = (org.isotc211.x2005.gco.DatePropertyType)get_store().add_element_user(EDITIONDATE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "editionDate" element
     */
    public void unsetEditionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EDITIONDATE$8, 0);
        }
    }
    
    /**
     * Gets array of all "identifier" elements
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$10, targetList);
            org.isotc211.x2005.gmd.MDIdentifierPropertyType[] result = new org.isotc211.x2005.gmd.MDIdentifierPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(IDENTIFIER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$10);
        }
    }
    
    /**
     * Sets array of all "identifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdentifierArray(org.isotc211.x2005.gmd.MDIdentifierPropertyType[] identifierArray)
    {
        check_orphaned();
        arraySetterHelper(identifierArray, IDENTIFIER$10);
    }
    
    /**
     * Sets ith "identifier" element
     */
    public void setIdentifierArray(int i, org.isotc211.x2005.gmd.MDIdentifierPropertyType identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().find_element_user(IDENTIFIER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().insert_element_user(IDENTIFIER$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
     */
    public org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDIdentifierPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDIdentifierPropertyType)get_store().add_element_user(IDENTIFIER$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$10, i);
        }
    }
    
    /**
     * Gets array of all "citedResponsibleParty" elements
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getCitedResponsiblePartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CITEDRESPONSIBLEPARTY$12, targetList);
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] result = new org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "citedResponsibleParty" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getCitedResponsiblePartyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(CITEDRESPONSIBLEPARTY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "citedResponsibleParty" element
     */
    public int sizeOfCitedResponsiblePartyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITEDRESPONSIBLEPARTY$12);
        }
    }
    
    /**
     * Sets array of all "citedResponsibleParty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCitedResponsiblePartyArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] citedResponsiblePartyArray)
    {
        check_orphaned();
        arraySetterHelper(citedResponsiblePartyArray, CITEDRESPONSIBLEPARTY$12);
    }
    
    /**
     * Sets ith "citedResponsibleParty" element
     */
    public void setCitedResponsiblePartyArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType citedResponsibleParty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(CITEDRESPONSIBLEPARTY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(citedResponsibleParty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "citedResponsibleParty" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewCitedResponsibleParty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().insert_element_user(CITEDRESPONSIBLEPARTY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "citedResponsibleParty" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewCitedResponsibleParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(CITEDRESPONSIBLEPARTY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "citedResponsibleParty" element
     */
    public void removeCitedResponsibleParty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITEDRESPONSIBLEPARTY$12, i);
        }
    }
    
    /**
     * Gets array of all "presentationForm" elements
     */
    public org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType[] getPresentationFormArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRESENTATIONFORM$14, targetList);
            org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType[] result = new org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "presentationForm" element
     */
    public org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType getPresentationFormArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType)get_store().find_element_user(PRESENTATIONFORM$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "presentationForm" element
     */
    public int sizeOfPresentationFormArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRESENTATIONFORM$14);
        }
    }
    
    /**
     * Sets array of all "presentationForm" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPresentationFormArray(org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType[] presentationFormArray)
    {
        check_orphaned();
        arraySetterHelper(presentationFormArray, PRESENTATIONFORM$14);
    }
    
    /**
     * Sets ith "presentationForm" element
     */
    public void setPresentationFormArray(int i, org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType presentationForm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType)get_store().find_element_user(PRESENTATIONFORM$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(presentationForm);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "presentationForm" element
     */
    public org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType insertNewPresentationForm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType)get_store().insert_element_user(PRESENTATIONFORM$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "presentationForm" element
     */
    public org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType addNewPresentationForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType)get_store().add_element_user(PRESENTATIONFORM$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "presentationForm" element
     */
    public void removePresentationForm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRESENTATIONFORM$14, i);
        }
    }
    
    /**
     * Gets the "series" element
     */
    public org.isotc211.x2005.gmd.CISeriesPropertyType getSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CISeriesPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CISeriesPropertyType)get_store().find_element_user(SERIES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "series" element
     */
    public boolean isSetSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIES$16) != 0;
        }
    }
    
    /**
     * Sets the "series" element
     */
    public void setSeries(org.isotc211.x2005.gmd.CISeriesPropertyType series)
    {
        generatedSetterHelperImpl(series, SERIES$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "series" element
     */
    public org.isotc211.x2005.gmd.CISeriesPropertyType addNewSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CISeriesPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CISeriesPropertyType)get_store().add_element_user(SERIES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "series" element
     */
    public void unsetSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIES$16, 0);
        }
    }
    
    /**
     * Gets the "otherCitationDetails" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getOtherCitationDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(OTHERCITATIONDETAILS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "otherCitationDetails" element
     */
    public boolean isSetOtherCitationDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERCITATIONDETAILS$18) != 0;
        }
    }
    
    /**
     * Sets the "otherCitationDetails" element
     */
    public void setOtherCitationDetails(org.isotc211.x2005.gco.CharacterStringPropertyType otherCitationDetails)
    {
        generatedSetterHelperImpl(otherCitationDetails, OTHERCITATIONDETAILS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "otherCitationDetails" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewOtherCitationDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(OTHERCITATIONDETAILS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "otherCitationDetails" element
     */
    public void unsetOtherCitationDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERCITATIONDETAILS$18, 0);
        }
    }
    
    /**
     * Gets the "collectiveTitle" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getCollectiveTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(COLLECTIVETITLE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "collectiveTitle" element
     */
    public boolean isSetCollectiveTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLECTIVETITLE$20) != 0;
        }
    }
    
    /**
     * Sets the "collectiveTitle" element
     */
    public void setCollectiveTitle(org.isotc211.x2005.gco.CharacterStringPropertyType collectiveTitle)
    {
        generatedSetterHelperImpl(collectiveTitle, COLLECTIVETITLE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "collectiveTitle" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewCollectiveTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(COLLECTIVETITLE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "collectiveTitle" element
     */
    public void unsetCollectiveTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLECTIVETITLE$20, 0);
        }
    }
    
    /**
     * Gets the "ISBN" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getISBN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ISBN$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ISBN" element
     */
    public boolean isSetISBN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISBN$22) != 0;
        }
    }
    
    /**
     * Sets the "ISBN" element
     */
    public void setISBN(org.isotc211.x2005.gco.CharacterStringPropertyType isbn)
    {
        generatedSetterHelperImpl(isbn, ISBN$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ISBN" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewISBN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ISBN$22);
            return target;
        }
    }
    
    /**
     * Unsets the "ISBN" element
     */
    public void unsetISBN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISBN$22, 0);
        }
    }
    
    /**
     * Gets the "ISSN" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getISSN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ISSN$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ISSN" element
     */
    public boolean isSetISSN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSN$24) != 0;
        }
    }
    
    /**
     * Sets the "ISSN" element
     */
    public void setISSN(org.isotc211.x2005.gco.CharacterStringPropertyType issn)
    {
        generatedSetterHelperImpl(issn, ISSN$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ISSN" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewISSN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ISSN$24);
            return target;
        }
    }
    
    /**
     * Unsets the "ISSN" element
     */
    public void unsetISSN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSN$24, 0);
        }
    }
}
