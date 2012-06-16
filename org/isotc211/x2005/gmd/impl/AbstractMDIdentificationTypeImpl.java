/*
 * XML Type:  AbstractMD_Identification_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractMDIdentificationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd.impl;
/**
 * An XML AbstractMD_Identification_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public class AbstractMDIdentificationTypeImpl extends org.isotc211.x2005.gco.impl.AbstractObjectTypeImpl implements org.isotc211.x2005.gmd.AbstractMDIdentificationType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractMDIdentificationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITATION$0 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "citation");
    private static final javax.xml.namespace.QName ABSTRACT$2 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "abstract");
    private static final javax.xml.namespace.QName PURPOSE$4 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "purpose");
    private static final javax.xml.namespace.QName CREDIT$6 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "credit");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "status");
    private static final javax.xml.namespace.QName POINTOFCONTACT$10 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "pointOfContact");
    private static final javax.xml.namespace.QName RESOURCEMAINTENANCE$12 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "resourceMaintenance");
    private static final javax.xml.namespace.QName GRAPHICOVERVIEW$14 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "graphicOverview");
    private static final javax.xml.namespace.QName RESOURCEFORMAT$16 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "resourceFormat");
    private static final javax.xml.namespace.QName DESCRIPTIVEKEYWORDS$18 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "descriptiveKeywords");
    private static final javax.xml.namespace.QName RESOURCESPECIFICUSAGE$20 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "resourceSpecificUsage");
    private static final javax.xml.namespace.QName RESOURCECONSTRAINTS$22 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "resourceConstraints");
    private static final javax.xml.namespace.QName AGGREGATIONINFO$24 = 
        new javax.xml.namespace.QName("http://www.isotc211.org/2005/gmd", "aggregationInfo");
    
    
    /**
     * Gets the "citation" element
     */
    public org.isotc211.x2005.gmd.CICitationPropertyType getCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CICitationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CICitationPropertyType)get_store().find_element_user(CITATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "citation" element
     */
    public void setCitation(org.isotc211.x2005.gmd.CICitationPropertyType citation)
    {
        generatedSetterHelperImpl(citation, CITATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "citation" element
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
     * Gets the "abstract" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(ABSTRACT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstract" element
     */
    public void setAbstract(org.isotc211.x2005.gco.CharacterStringPropertyType xabstract)
    {
        generatedSetterHelperImpl(xabstract, ABSTRACT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abstract" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(ABSTRACT$2);
            return target;
        }
    }
    
    /**
     * Gets the "purpose" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(PURPOSE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "purpose" element
     */
    public boolean isSetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURPOSE$4) != 0;
        }
    }
    
    /**
     * Sets the "purpose" element
     */
    public void setPurpose(org.isotc211.x2005.gco.CharacterStringPropertyType purpose)
    {
        generatedSetterHelperImpl(purpose, PURPOSE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "purpose" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(PURPOSE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "purpose" element
     */
    public void unsetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURPOSE$4, 0);
        }
    }
    
    /**
     * Gets array of all "credit" elements
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType[] getCreditArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CREDIT$6, targetList);
            org.isotc211.x2005.gco.CharacterStringPropertyType[] result = new org.isotc211.x2005.gco.CharacterStringPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "credit" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType getCreditArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(CREDIT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "credit" element
     */
    public int sizeOfCreditArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDIT$6);
        }
    }
    
    /**
     * Sets array of all "credit" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCreditArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] creditArray)
    {
        check_orphaned();
        arraySetterHelper(creditArray, CREDIT$6);
    }
    
    /**
     * Sets ith "credit" element
     */
    public void setCreditArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType credit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().find_element_user(CREDIT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(credit);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "credit" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType insertNewCredit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().insert_element_user(CREDIT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "credit" element
     */
    public org.isotc211.x2005.gco.CharacterStringPropertyType addNewCredit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gco.CharacterStringPropertyType target = null;
            target = (org.isotc211.x2005.gco.CharacterStringPropertyType)get_store().add_element_user(CREDIT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "credit" element
     */
    public void removeCredit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDIT$6, i);
        }
    }
    
    /**
     * Gets array of all "status" elements
     */
    public org.isotc211.x2005.gmd.MDProgressCodePropertyType[] getStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATUS$8, targetList);
            org.isotc211.x2005.gmd.MDProgressCodePropertyType[] result = new org.isotc211.x2005.gmd.MDProgressCodePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "status" element
     */
    public org.isotc211.x2005.gmd.MDProgressCodePropertyType getStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDProgressCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDProgressCodePropertyType)get_store().find_element_user(STATUS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "status" element
     */
    public int sizeOfStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$8);
        }
    }
    
    /**
     * Sets array of all "status" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStatusArray(org.isotc211.x2005.gmd.MDProgressCodePropertyType[] statusArray)
    {
        check_orphaned();
        arraySetterHelper(statusArray, STATUS$8);
    }
    
    /**
     * Sets ith "status" element
     */
    public void setStatusArray(int i, org.isotc211.x2005.gmd.MDProgressCodePropertyType status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDProgressCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDProgressCodePropertyType)get_store().find_element_user(STATUS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(status);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "status" element
     */
    public org.isotc211.x2005.gmd.MDProgressCodePropertyType insertNewStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDProgressCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDProgressCodePropertyType)get_store().insert_element_user(STATUS$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "status" element
     */
    public org.isotc211.x2005.gmd.MDProgressCodePropertyType addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDProgressCodePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDProgressCodePropertyType)get_store().add_element_user(STATUS$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "status" element
     */
    public void removeStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$8, i);
        }
    }
    
    /**
     * Gets array of all "pointOfContact" elements
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getPointOfContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POINTOFCONTACT$10, targetList);
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] result = new org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pointOfContact" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getPointOfContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(POINTOFCONTACT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pointOfContact" element
     */
    public int sizeOfPointOfContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINTOFCONTACT$10);
        }
    }
    
    /**
     * Sets array of all "pointOfContact" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPointOfContactArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] pointOfContactArray)
    {
        check_orphaned();
        arraySetterHelper(pointOfContactArray, POINTOFCONTACT$10);
    }
    
    /**
     * Sets ith "pointOfContact" element
     */
    public void setPointOfContactArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType pointOfContact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().find_element_user(POINTOFCONTACT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pointOfContact);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pointOfContact" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewPointOfContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().insert_element_user(POINTOFCONTACT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pointOfContact" element
     */
    public org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewPointOfContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType target = null;
            target = (org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType)get_store().add_element_user(POINTOFCONTACT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "pointOfContact" element
     */
    public void removePointOfContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINTOFCONTACT$10, i);
        }
    }
    
    /**
     * Gets array of all "resourceMaintenance" elements
     */
    public org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType[] getResourceMaintenanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEMAINTENANCE$12, targetList);
            org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType[] result = new org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceMaintenance" element
     */
    public org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType getResourceMaintenanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType)get_store().find_element_user(RESOURCEMAINTENANCE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceMaintenance" element
     */
    public int sizeOfResourceMaintenanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEMAINTENANCE$12);
        }
    }
    
    /**
     * Sets array of all "resourceMaintenance" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceMaintenanceArray(org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType[] resourceMaintenanceArray)
    {
        check_orphaned();
        arraySetterHelper(resourceMaintenanceArray, RESOURCEMAINTENANCE$12);
    }
    
    /**
     * Sets ith "resourceMaintenance" element
     */
    public void setResourceMaintenanceArray(int i, org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType resourceMaintenance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType)get_store().find_element_user(RESOURCEMAINTENANCE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceMaintenance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceMaintenance" element
     */
    public org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType insertNewResourceMaintenance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType)get_store().insert_element_user(RESOURCEMAINTENANCE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceMaintenance" element
     */
    public org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType addNewResourceMaintenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType)get_store().add_element_user(RESOURCEMAINTENANCE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceMaintenance" element
     */
    public void removeResourceMaintenance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEMAINTENANCE$12, i);
        }
    }
    
    /**
     * Gets array of all "graphicOverview" elements
     */
    public org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType[] getGraphicOverviewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRAPHICOVERVIEW$14, targetList);
            org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType[] result = new org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "graphicOverview" element
     */
    public org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType getGraphicOverviewArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType)get_store().find_element_user(GRAPHICOVERVIEW$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "graphicOverview" element
     */
    public int sizeOfGraphicOverviewArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRAPHICOVERVIEW$14);
        }
    }
    
    /**
     * Sets array of all "graphicOverview" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGraphicOverviewArray(org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType[] graphicOverviewArray)
    {
        check_orphaned();
        arraySetterHelper(graphicOverviewArray, GRAPHICOVERVIEW$14);
    }
    
    /**
     * Sets ith "graphicOverview" element
     */
    public void setGraphicOverviewArray(int i, org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType graphicOverview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType)get_store().find_element_user(GRAPHICOVERVIEW$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(graphicOverview);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "graphicOverview" element
     */
    public org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType insertNewGraphicOverview(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType)get_store().insert_element_user(GRAPHICOVERVIEW$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "graphicOverview" element
     */
    public org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType addNewGraphicOverview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType)get_store().add_element_user(GRAPHICOVERVIEW$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "graphicOverview" element
     */
    public void removeGraphicOverview(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRAPHICOVERVIEW$14, i);
        }
    }
    
    /**
     * Gets array of all "resourceFormat" elements
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType[] getResourceFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEFORMAT$16, targetList);
            org.isotc211.x2005.gmd.MDFormatPropertyType[] result = new org.isotc211.x2005.gmd.MDFormatPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType getResourceFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().find_element_user(RESOURCEFORMAT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceFormat" element
     */
    public int sizeOfResourceFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEFORMAT$16);
        }
    }
    
    /**
     * Sets array of all "resourceFormat" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceFormatArray(org.isotc211.x2005.gmd.MDFormatPropertyType[] resourceFormatArray)
    {
        check_orphaned();
        arraySetterHelper(resourceFormatArray, RESOURCEFORMAT$16);
    }
    
    /**
     * Sets ith "resourceFormat" element
     */
    public void setResourceFormatArray(int i, org.isotc211.x2005.gmd.MDFormatPropertyType resourceFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().find_element_user(RESOURCEFORMAT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType insertNewResourceFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().insert_element_user(RESOURCEFORMAT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceFormat" element
     */
    public org.isotc211.x2005.gmd.MDFormatPropertyType addNewResourceFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDFormatPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDFormatPropertyType)get_store().add_element_user(RESOURCEFORMAT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceFormat" element
     */
    public void removeResourceFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEFORMAT$16, i);
        }
    }
    
    /**
     * Gets array of all "descriptiveKeywords" elements
     */
    public org.isotc211.x2005.gmd.MDKeywordsPropertyType[] getDescriptiveKeywordsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTIVEKEYWORDS$18, targetList);
            org.isotc211.x2005.gmd.MDKeywordsPropertyType[] result = new org.isotc211.x2005.gmd.MDKeywordsPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "descriptiveKeywords" element
     */
    public org.isotc211.x2005.gmd.MDKeywordsPropertyType getDescriptiveKeywordsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDKeywordsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDKeywordsPropertyType)get_store().find_element_user(DESCRIPTIVEKEYWORDS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "descriptiveKeywords" element
     */
    public int sizeOfDescriptiveKeywordsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTIVEKEYWORDS$18);
        }
    }
    
    /**
     * Sets array of all "descriptiveKeywords" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDescriptiveKeywordsArray(org.isotc211.x2005.gmd.MDKeywordsPropertyType[] descriptiveKeywordsArray)
    {
        check_orphaned();
        arraySetterHelper(descriptiveKeywordsArray, DESCRIPTIVEKEYWORDS$18);
    }
    
    /**
     * Sets ith "descriptiveKeywords" element
     */
    public void setDescriptiveKeywordsArray(int i, org.isotc211.x2005.gmd.MDKeywordsPropertyType descriptiveKeywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDKeywordsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDKeywordsPropertyType)get_store().find_element_user(DESCRIPTIVEKEYWORDS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(descriptiveKeywords);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "descriptiveKeywords" element
     */
    public org.isotc211.x2005.gmd.MDKeywordsPropertyType insertNewDescriptiveKeywords(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDKeywordsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDKeywordsPropertyType)get_store().insert_element_user(DESCRIPTIVEKEYWORDS$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "descriptiveKeywords" element
     */
    public org.isotc211.x2005.gmd.MDKeywordsPropertyType addNewDescriptiveKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDKeywordsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDKeywordsPropertyType)get_store().add_element_user(DESCRIPTIVEKEYWORDS$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "descriptiveKeywords" element
     */
    public void removeDescriptiveKeywords(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTIVEKEYWORDS$18, i);
        }
    }
    
    /**
     * Gets array of all "resourceSpecificUsage" elements
     */
    public org.isotc211.x2005.gmd.MDUsagePropertyType[] getResourceSpecificUsageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCESPECIFICUSAGE$20, targetList);
            org.isotc211.x2005.gmd.MDUsagePropertyType[] result = new org.isotc211.x2005.gmd.MDUsagePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceSpecificUsage" element
     */
    public org.isotc211.x2005.gmd.MDUsagePropertyType getResourceSpecificUsageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDUsagePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDUsagePropertyType)get_store().find_element_user(RESOURCESPECIFICUSAGE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceSpecificUsage" element
     */
    public int sizeOfResourceSpecificUsageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCESPECIFICUSAGE$20);
        }
    }
    
    /**
     * Sets array of all "resourceSpecificUsage" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceSpecificUsageArray(org.isotc211.x2005.gmd.MDUsagePropertyType[] resourceSpecificUsageArray)
    {
        check_orphaned();
        arraySetterHelper(resourceSpecificUsageArray, RESOURCESPECIFICUSAGE$20);
    }
    
    /**
     * Sets ith "resourceSpecificUsage" element
     */
    public void setResourceSpecificUsageArray(int i, org.isotc211.x2005.gmd.MDUsagePropertyType resourceSpecificUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDUsagePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDUsagePropertyType)get_store().find_element_user(RESOURCESPECIFICUSAGE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceSpecificUsage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceSpecificUsage" element
     */
    public org.isotc211.x2005.gmd.MDUsagePropertyType insertNewResourceSpecificUsage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDUsagePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDUsagePropertyType)get_store().insert_element_user(RESOURCESPECIFICUSAGE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceSpecificUsage" element
     */
    public org.isotc211.x2005.gmd.MDUsagePropertyType addNewResourceSpecificUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDUsagePropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDUsagePropertyType)get_store().add_element_user(RESOURCESPECIFICUSAGE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceSpecificUsage" element
     */
    public void removeResourceSpecificUsage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCESPECIFICUSAGE$20, i);
        }
    }
    
    /**
     * Gets array of all "resourceConstraints" elements
     */
    public org.isotc211.x2005.gmd.MDConstraintsPropertyType[] getResourceConstraintsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCECONSTRAINTS$22, targetList);
            org.isotc211.x2005.gmd.MDConstraintsPropertyType[] result = new org.isotc211.x2005.gmd.MDConstraintsPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceConstraints" element
     */
    public org.isotc211.x2005.gmd.MDConstraintsPropertyType getResourceConstraintsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsPropertyType)get_store().find_element_user(RESOURCECONSTRAINTS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceConstraints" element
     */
    public int sizeOfResourceConstraintsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCECONSTRAINTS$22);
        }
    }
    
    /**
     * Sets array of all "resourceConstraints" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setResourceConstraintsArray(org.isotc211.x2005.gmd.MDConstraintsPropertyType[] resourceConstraintsArray)
    {
        check_orphaned();
        arraySetterHelper(resourceConstraintsArray, RESOURCECONSTRAINTS$22);
    }
    
    /**
     * Sets ith "resourceConstraints" element
     */
    public void setResourceConstraintsArray(int i, org.isotc211.x2005.gmd.MDConstraintsPropertyType resourceConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsPropertyType)get_store().find_element_user(RESOURCECONSTRAINTS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceConstraints);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceConstraints" element
     */
    public org.isotc211.x2005.gmd.MDConstraintsPropertyType insertNewResourceConstraints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsPropertyType)get_store().insert_element_user(RESOURCECONSTRAINTS$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceConstraints" element
     */
    public org.isotc211.x2005.gmd.MDConstraintsPropertyType addNewResourceConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDConstraintsPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDConstraintsPropertyType)get_store().add_element_user(RESOURCECONSTRAINTS$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceConstraints" element
     */
    public void removeResourceConstraints(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCECONSTRAINTS$22, i);
        }
    }
    
    /**
     * Gets array of all "aggregationInfo" elements
     */
    public org.isotc211.x2005.gmd.MDAggregateInformationPropertyType[] getAggregationInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGGREGATIONINFO$24, targetList);
            org.isotc211.x2005.gmd.MDAggregateInformationPropertyType[] result = new org.isotc211.x2005.gmd.MDAggregateInformationPropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "aggregationInfo" element
     */
    public org.isotc211.x2005.gmd.MDAggregateInformationPropertyType getAggregationInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDAggregateInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDAggregateInformationPropertyType)get_store().find_element_user(AGGREGATIONINFO$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "aggregationInfo" element
     */
    public int sizeOfAggregationInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGGREGATIONINFO$24);
        }
    }
    
    /**
     * Sets array of all "aggregationInfo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAggregationInfoArray(org.isotc211.x2005.gmd.MDAggregateInformationPropertyType[] aggregationInfoArray)
    {
        check_orphaned();
        arraySetterHelper(aggregationInfoArray, AGGREGATIONINFO$24);
    }
    
    /**
     * Sets ith "aggregationInfo" element
     */
    public void setAggregationInfoArray(int i, org.isotc211.x2005.gmd.MDAggregateInformationPropertyType aggregationInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDAggregateInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDAggregateInformationPropertyType)get_store().find_element_user(AGGREGATIONINFO$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(aggregationInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "aggregationInfo" element
     */
    public org.isotc211.x2005.gmd.MDAggregateInformationPropertyType insertNewAggregationInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDAggregateInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDAggregateInformationPropertyType)get_store().insert_element_user(AGGREGATIONINFO$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "aggregationInfo" element
     */
    public org.isotc211.x2005.gmd.MDAggregateInformationPropertyType addNewAggregationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.isotc211.x2005.gmd.MDAggregateInformationPropertyType target = null;
            target = (org.isotc211.x2005.gmd.MDAggregateInformationPropertyType)get_store().add_element_user(AGGREGATIONINFO$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "aggregationInfo" element
     */
    public void removeAggregationInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGGREGATIONINFO$24, i);
        }
    }
}
