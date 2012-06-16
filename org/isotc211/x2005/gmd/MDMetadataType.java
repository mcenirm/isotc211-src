/*
 * XML Type:  MD_Metadata_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMetadataType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_Metadata_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDMetadataType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDMetadataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdmetadatatype3cb9type");
    
    /**
     * Gets the "fileIdentifier" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getFileIdentifier();
    
    /**
     * True if has "fileIdentifier" element
     */
    boolean isSetFileIdentifier();
    
    /**
     * Sets the "fileIdentifier" element
     */
    void setFileIdentifier(org.isotc211.x2005.gco.CharacterStringPropertyType fileIdentifier);
    
    /**
     * Appends and returns a new empty "fileIdentifier" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewFileIdentifier();
    
    /**
     * Unsets the "fileIdentifier" element
     */
    void unsetFileIdentifier();
    
    /**
     * Gets the "language" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getLanguage();
    
    /**
     * True if has "language" element
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "language" element
     */
    void setLanguage(org.isotc211.x2005.gco.CharacterStringPropertyType language);
    
    /**
     * Appends and returns a new empty "language" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewLanguage();
    
    /**
     * Unsets the "language" element
     */
    void unsetLanguage();
    
    /**
     * Gets the "characterSet" element
     */
    org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType getCharacterSet();
    
    /**
     * True if has "characterSet" element
     */
    boolean isSetCharacterSet();
    
    /**
     * Sets the "characterSet" element
     */
    void setCharacterSet(org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType characterSet);
    
    /**
     * Appends and returns a new empty "characterSet" element
     */
    org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType addNewCharacterSet();
    
    /**
     * Unsets the "characterSet" element
     */
    void unsetCharacterSet();
    
    /**
     * Gets the "parentIdentifier" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getParentIdentifier();
    
    /**
     * True if has "parentIdentifier" element
     */
    boolean isSetParentIdentifier();
    
    /**
     * Sets the "parentIdentifier" element
     */
    void setParentIdentifier(org.isotc211.x2005.gco.CharacterStringPropertyType parentIdentifier);
    
    /**
     * Appends and returns a new empty "parentIdentifier" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewParentIdentifier();
    
    /**
     * Unsets the "parentIdentifier" element
     */
    void unsetParentIdentifier();
    
    /**
     * Gets array of all "hierarchyLevel" elements
     */
    org.isotc211.x2005.gmd.MDScopeCodePropertyType[] getHierarchyLevelArray();
    
    /**
     * Gets ith "hierarchyLevel" element
     */
    org.isotc211.x2005.gmd.MDScopeCodePropertyType getHierarchyLevelArray(int i);
    
    /**
     * Returns number of "hierarchyLevel" element
     */
    int sizeOfHierarchyLevelArray();
    
    /**
     * Sets array of all "hierarchyLevel" element
     */
    void setHierarchyLevelArray(org.isotc211.x2005.gmd.MDScopeCodePropertyType[] hierarchyLevelArray);
    
    /**
     * Sets ith "hierarchyLevel" element
     */
    void setHierarchyLevelArray(int i, org.isotc211.x2005.gmd.MDScopeCodePropertyType hierarchyLevel);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hierarchyLevel" element
     */
    org.isotc211.x2005.gmd.MDScopeCodePropertyType insertNewHierarchyLevel(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hierarchyLevel" element
     */
    org.isotc211.x2005.gmd.MDScopeCodePropertyType addNewHierarchyLevel();
    
    /**
     * Removes the ith "hierarchyLevel" element
     */
    void removeHierarchyLevel(int i);
    
    /**
     * Gets array of all "hierarchyLevelName" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getHierarchyLevelNameArray();
    
    /**
     * Gets ith "hierarchyLevelName" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getHierarchyLevelNameArray(int i);
    
    /**
     * Returns number of "hierarchyLevelName" element
     */
    int sizeOfHierarchyLevelNameArray();
    
    /**
     * Sets array of all "hierarchyLevelName" element
     */
    void setHierarchyLevelNameArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] hierarchyLevelNameArray);
    
    /**
     * Sets ith "hierarchyLevelName" element
     */
    void setHierarchyLevelNameArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType hierarchyLevelName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hierarchyLevelName" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewHierarchyLevelName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hierarchyLevelName" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewHierarchyLevelName();
    
    /**
     * Removes the ith "hierarchyLevelName" element
     */
    void removeHierarchyLevelName(int i);
    
    /**
     * Gets array of all "contact" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getContactArray();
    
    /**
     * Gets ith "contact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getContactArray(int i);
    
    /**
     * Returns number of "contact" element
     */
    int sizeOfContactArray();
    
    /**
     * Sets array of all "contact" element
     */
    void setContactArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] contactArray);
    
    /**
     * Sets ith "contact" element
     */
    void setContactArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType contact);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewContact(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewContact();
    
    /**
     * Removes the ith "contact" element
     */
    void removeContact(int i);
    
    /**
     * Gets the "dateStamp" element
     */
    org.isotc211.x2005.gco.DatePropertyType getDateStamp();
    
    /**
     * Sets the "dateStamp" element
     */
    void setDateStamp(org.isotc211.x2005.gco.DatePropertyType dateStamp);
    
    /**
     * Appends and returns a new empty "dateStamp" element
     */
    org.isotc211.x2005.gco.DatePropertyType addNewDateStamp();
    
    /**
     * Gets the "metadataStandardName" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getMetadataStandardName();
    
    /**
     * True if has "metadataStandardName" element
     */
    boolean isSetMetadataStandardName();
    
    /**
     * Sets the "metadataStandardName" element
     */
    void setMetadataStandardName(org.isotc211.x2005.gco.CharacterStringPropertyType metadataStandardName);
    
    /**
     * Appends and returns a new empty "metadataStandardName" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewMetadataStandardName();
    
    /**
     * Unsets the "metadataStandardName" element
     */
    void unsetMetadataStandardName();
    
    /**
     * Gets the "metadataStandardVersion" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getMetadataStandardVersion();
    
    /**
     * True if has "metadataStandardVersion" element
     */
    boolean isSetMetadataStandardVersion();
    
    /**
     * Sets the "metadataStandardVersion" element
     */
    void setMetadataStandardVersion(org.isotc211.x2005.gco.CharacterStringPropertyType metadataStandardVersion);
    
    /**
     * Appends and returns a new empty "metadataStandardVersion" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewMetadataStandardVersion();
    
    /**
     * Unsets the "metadataStandardVersion" element
     */
    void unsetMetadataStandardVersion();
    
    /**
     * Gets the "dataSetURI" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getDataSetURI();
    
    /**
     * True if has "dataSetURI" element
     */
    boolean isSetDataSetURI();
    
    /**
     * Sets the "dataSetURI" element
     */
    void setDataSetURI(org.isotc211.x2005.gco.CharacterStringPropertyType dataSetURI);
    
    /**
     * Appends and returns a new empty "dataSetURI" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewDataSetURI();
    
    /**
     * Unsets the "dataSetURI" element
     */
    void unsetDataSetURI();
    
    /**
     * Gets array of all "locale" elements
     */
    org.isotc211.x2005.gmd.PTLocalePropertyType[] getLocaleArray();
    
    /**
     * Gets ith "locale" element
     */
    org.isotc211.x2005.gmd.PTLocalePropertyType getLocaleArray(int i);
    
    /**
     * Returns number of "locale" element
     */
    int sizeOfLocaleArray();
    
    /**
     * Sets array of all "locale" element
     */
    void setLocaleArray(org.isotc211.x2005.gmd.PTLocalePropertyType[] localeArray);
    
    /**
     * Sets ith "locale" element
     */
    void setLocaleArray(int i, org.isotc211.x2005.gmd.PTLocalePropertyType locale);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "locale" element
     */
    org.isotc211.x2005.gmd.PTLocalePropertyType insertNewLocale(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "locale" element
     */
    org.isotc211.x2005.gmd.PTLocalePropertyType addNewLocale();
    
    /**
     * Removes the ith "locale" element
     */
    void removeLocale(int i);
    
    /**
     * Gets array of all "spatialRepresentationInfo" elements
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType[] getSpatialRepresentationInfoArray();
    
    /**
     * Gets ith "spatialRepresentationInfo" element
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType getSpatialRepresentationInfoArray(int i);
    
    /**
     * Returns number of "spatialRepresentationInfo" element
     */
    int sizeOfSpatialRepresentationInfoArray();
    
    /**
     * Sets array of all "spatialRepresentationInfo" element
     */
    void setSpatialRepresentationInfoArray(org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType[] spatialRepresentationInfoArray);
    
    /**
     * Sets ith "spatialRepresentationInfo" element
     */
    void setSpatialRepresentationInfoArray(int i, org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType spatialRepresentationInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "spatialRepresentationInfo" element
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType insertNewSpatialRepresentationInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "spatialRepresentationInfo" element
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType addNewSpatialRepresentationInfo();
    
    /**
     * Removes the ith "spatialRepresentationInfo" element
     */
    void removeSpatialRepresentationInfo(int i);
    
    /**
     * Gets array of all "referenceSystemInfo" elements
     */
    org.isotc211.x2005.gmd.MDReferenceSystemPropertyType[] getReferenceSystemInfoArray();
    
    /**
     * Gets ith "referenceSystemInfo" element
     */
    org.isotc211.x2005.gmd.MDReferenceSystemPropertyType getReferenceSystemInfoArray(int i);
    
    /**
     * Returns number of "referenceSystemInfo" element
     */
    int sizeOfReferenceSystemInfoArray();
    
    /**
     * Sets array of all "referenceSystemInfo" element
     */
    void setReferenceSystemInfoArray(org.isotc211.x2005.gmd.MDReferenceSystemPropertyType[] referenceSystemInfoArray);
    
    /**
     * Sets ith "referenceSystemInfo" element
     */
    void setReferenceSystemInfoArray(int i, org.isotc211.x2005.gmd.MDReferenceSystemPropertyType referenceSystemInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "referenceSystemInfo" element
     */
    org.isotc211.x2005.gmd.MDReferenceSystemPropertyType insertNewReferenceSystemInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "referenceSystemInfo" element
     */
    org.isotc211.x2005.gmd.MDReferenceSystemPropertyType addNewReferenceSystemInfo();
    
    /**
     * Removes the ith "referenceSystemInfo" element
     */
    void removeReferenceSystemInfo(int i);
    
    /**
     * Gets array of all "metadataExtensionInfo" elements
     */
    org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType[] getMetadataExtensionInfoArray();
    
    /**
     * Gets ith "metadataExtensionInfo" element
     */
    org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType getMetadataExtensionInfoArray(int i);
    
    /**
     * Returns number of "metadataExtensionInfo" element
     */
    int sizeOfMetadataExtensionInfoArray();
    
    /**
     * Sets array of all "metadataExtensionInfo" element
     */
    void setMetadataExtensionInfoArray(org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType[] metadataExtensionInfoArray);
    
    /**
     * Sets ith "metadataExtensionInfo" element
     */
    void setMetadataExtensionInfoArray(int i, org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType metadataExtensionInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "metadataExtensionInfo" element
     */
    org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType insertNewMetadataExtensionInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "metadataExtensionInfo" element
     */
    org.isotc211.x2005.gmd.MDMetadataExtensionInformationPropertyType addNewMetadataExtensionInfo();
    
    /**
     * Removes the ith "metadataExtensionInfo" element
     */
    void removeMetadataExtensionInfo(int i);
    
    /**
     * Gets array of all "identificationInfo" elements
     */
    org.isotc211.x2005.gmd.MDIdentificationPropertyType[] getIdentificationInfoArray();
    
    /**
     * Gets ith "identificationInfo" element
     */
    org.isotc211.x2005.gmd.MDIdentificationPropertyType getIdentificationInfoArray(int i);
    
    /**
     * Returns number of "identificationInfo" element
     */
    int sizeOfIdentificationInfoArray();
    
    /**
     * Sets array of all "identificationInfo" element
     */
    void setIdentificationInfoArray(org.isotc211.x2005.gmd.MDIdentificationPropertyType[] identificationInfoArray);
    
    /**
     * Sets ith "identificationInfo" element
     */
    void setIdentificationInfoArray(int i, org.isotc211.x2005.gmd.MDIdentificationPropertyType identificationInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identificationInfo" element
     */
    org.isotc211.x2005.gmd.MDIdentificationPropertyType insertNewIdentificationInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identificationInfo" element
     */
    org.isotc211.x2005.gmd.MDIdentificationPropertyType addNewIdentificationInfo();
    
    /**
     * Removes the ith "identificationInfo" element
     */
    void removeIdentificationInfo(int i);
    
    /**
     * Gets array of all "contentInfo" elements
     */
    org.isotc211.x2005.gmd.MDContentInformationPropertyType[] getContentInfoArray();
    
    /**
     * Gets ith "contentInfo" element
     */
    org.isotc211.x2005.gmd.MDContentInformationPropertyType getContentInfoArray(int i);
    
    /**
     * Returns number of "contentInfo" element
     */
    int sizeOfContentInfoArray();
    
    /**
     * Sets array of all "contentInfo" element
     */
    void setContentInfoArray(org.isotc211.x2005.gmd.MDContentInformationPropertyType[] contentInfoArray);
    
    /**
     * Sets ith "contentInfo" element
     */
    void setContentInfoArray(int i, org.isotc211.x2005.gmd.MDContentInformationPropertyType contentInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contentInfo" element
     */
    org.isotc211.x2005.gmd.MDContentInformationPropertyType insertNewContentInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contentInfo" element
     */
    org.isotc211.x2005.gmd.MDContentInformationPropertyType addNewContentInfo();
    
    /**
     * Removes the ith "contentInfo" element
     */
    void removeContentInfo(int i);
    
    /**
     * Gets the "distributionInfo" element
     */
    org.isotc211.x2005.gmd.MDDistributionPropertyType getDistributionInfo();
    
    /**
     * True if has "distributionInfo" element
     */
    boolean isSetDistributionInfo();
    
    /**
     * Sets the "distributionInfo" element
     */
    void setDistributionInfo(org.isotc211.x2005.gmd.MDDistributionPropertyType distributionInfo);
    
    /**
     * Appends and returns a new empty "distributionInfo" element
     */
    org.isotc211.x2005.gmd.MDDistributionPropertyType addNewDistributionInfo();
    
    /**
     * Unsets the "distributionInfo" element
     */
    void unsetDistributionInfo();
    
    /**
     * Gets array of all "dataQualityInfo" elements
     */
    org.isotc211.x2005.gmd.DQDataQualityPropertyType[] getDataQualityInfoArray();
    
    /**
     * Gets ith "dataQualityInfo" element
     */
    org.isotc211.x2005.gmd.DQDataQualityPropertyType getDataQualityInfoArray(int i);
    
    /**
     * Returns number of "dataQualityInfo" element
     */
    int sizeOfDataQualityInfoArray();
    
    /**
     * Sets array of all "dataQualityInfo" element
     */
    void setDataQualityInfoArray(org.isotc211.x2005.gmd.DQDataQualityPropertyType[] dataQualityInfoArray);
    
    /**
     * Sets ith "dataQualityInfo" element
     */
    void setDataQualityInfoArray(int i, org.isotc211.x2005.gmd.DQDataQualityPropertyType dataQualityInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataQualityInfo" element
     */
    org.isotc211.x2005.gmd.DQDataQualityPropertyType insertNewDataQualityInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataQualityInfo" element
     */
    org.isotc211.x2005.gmd.DQDataQualityPropertyType addNewDataQualityInfo();
    
    /**
     * Removes the ith "dataQualityInfo" element
     */
    void removeDataQualityInfo(int i);
    
    /**
     * Gets array of all "portrayalCatalogueInfo" elements
     */
    org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType[] getPortrayalCatalogueInfoArray();
    
    /**
     * Gets ith "portrayalCatalogueInfo" element
     */
    org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType getPortrayalCatalogueInfoArray(int i);
    
    /**
     * Returns number of "portrayalCatalogueInfo" element
     */
    int sizeOfPortrayalCatalogueInfoArray();
    
    /**
     * Sets array of all "portrayalCatalogueInfo" element
     */
    void setPortrayalCatalogueInfoArray(org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType[] portrayalCatalogueInfoArray);
    
    /**
     * Sets ith "portrayalCatalogueInfo" element
     */
    void setPortrayalCatalogueInfoArray(int i, org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType portrayalCatalogueInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "portrayalCatalogueInfo" element
     */
    org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType insertNewPortrayalCatalogueInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "portrayalCatalogueInfo" element
     */
    org.isotc211.x2005.gmd.MDPortrayalCatalogueReferencePropertyType addNewPortrayalCatalogueInfo();
    
    /**
     * Removes the ith "portrayalCatalogueInfo" element
     */
    void removePortrayalCatalogueInfo(int i);
    
    /**
     * Gets array of all "metadataConstraints" elements
     */
    org.isotc211.x2005.gmd.MDConstraintsPropertyType[] getMetadataConstraintsArray();
    
    /**
     * Gets ith "metadataConstraints" element
     */
    org.isotc211.x2005.gmd.MDConstraintsPropertyType getMetadataConstraintsArray(int i);
    
    /**
     * Returns number of "metadataConstraints" element
     */
    int sizeOfMetadataConstraintsArray();
    
    /**
     * Sets array of all "metadataConstraints" element
     */
    void setMetadataConstraintsArray(org.isotc211.x2005.gmd.MDConstraintsPropertyType[] metadataConstraintsArray);
    
    /**
     * Sets ith "metadataConstraints" element
     */
    void setMetadataConstraintsArray(int i, org.isotc211.x2005.gmd.MDConstraintsPropertyType metadataConstraints);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "metadataConstraints" element
     */
    org.isotc211.x2005.gmd.MDConstraintsPropertyType insertNewMetadataConstraints(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "metadataConstraints" element
     */
    org.isotc211.x2005.gmd.MDConstraintsPropertyType addNewMetadataConstraints();
    
    /**
     * Removes the ith "metadataConstraints" element
     */
    void removeMetadataConstraints(int i);
    
    /**
     * Gets array of all "applicationSchemaInfo" elements
     */
    org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType[] getApplicationSchemaInfoArray();
    
    /**
     * Gets ith "applicationSchemaInfo" element
     */
    org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType getApplicationSchemaInfoArray(int i);
    
    /**
     * Returns number of "applicationSchemaInfo" element
     */
    int sizeOfApplicationSchemaInfoArray();
    
    /**
     * Sets array of all "applicationSchemaInfo" element
     */
    void setApplicationSchemaInfoArray(org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType[] applicationSchemaInfoArray);
    
    /**
     * Sets ith "applicationSchemaInfo" element
     */
    void setApplicationSchemaInfoArray(int i, org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType applicationSchemaInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "applicationSchemaInfo" element
     */
    org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType insertNewApplicationSchemaInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "applicationSchemaInfo" element
     */
    org.isotc211.x2005.gmd.MDApplicationSchemaInformationPropertyType addNewApplicationSchemaInfo();
    
    /**
     * Removes the ith "applicationSchemaInfo" element
     */
    void removeApplicationSchemaInfo(int i);
    
    /**
     * Gets the "metadataMaintenance" element
     */
    org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType getMetadataMaintenance();
    
    /**
     * True if has "metadataMaintenance" element
     */
    boolean isSetMetadataMaintenance();
    
    /**
     * Sets the "metadataMaintenance" element
     */
    void setMetadataMaintenance(org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType metadataMaintenance);
    
    /**
     * Appends and returns a new empty "metadataMaintenance" element
     */
    org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType addNewMetadataMaintenance();
    
    /**
     * Unsets the "metadataMaintenance" element
     */
    void unsetMetadataMaintenance();
    
    /**
     * Gets array of all "series" elements
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType[] getSeriesArray();
    
    /**
     * Gets ith "series" element
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType getSeriesArray(int i);
    
    /**
     * Returns number of "series" element
     */
    int sizeOfSeriesArray();
    
    /**
     * Sets array of all "series" element
     */
    void setSeriesArray(org.isotc211.x2005.gmd.DSAggregatePropertyType[] seriesArray);
    
    /**
     * Sets ith "series" element
     */
    void setSeriesArray(int i, org.isotc211.x2005.gmd.DSAggregatePropertyType series);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "series" element
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType insertNewSeries(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "series" element
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType addNewSeries();
    
    /**
     * Removes the ith "series" element
     */
    void removeSeries(int i);
    
    /**
     * Gets array of all "describes" elements
     */
    org.isotc211.x2005.gmd.DSDataSetPropertyType[] getDescribesArray();
    
    /**
     * Gets ith "describes" element
     */
    org.isotc211.x2005.gmd.DSDataSetPropertyType getDescribesArray(int i);
    
    /**
     * Returns number of "describes" element
     */
    int sizeOfDescribesArray();
    
    /**
     * Sets array of all "describes" element
     */
    void setDescribesArray(org.isotc211.x2005.gmd.DSDataSetPropertyType[] describesArray);
    
    /**
     * Sets ith "describes" element
     */
    void setDescribesArray(int i, org.isotc211.x2005.gmd.DSDataSetPropertyType describes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "describes" element
     */
    org.isotc211.x2005.gmd.DSDataSetPropertyType insertNewDescribes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "describes" element
     */
    org.isotc211.x2005.gmd.DSDataSetPropertyType addNewDescribes();
    
    /**
     * Removes the ith "describes" element
     */
    void removeDescribes(int i);
    
    /**
     * Gets array of all "propertyType" elements
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType[] getPropertyTypeArray();
    
    /**
     * Gets ith "propertyType" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType getPropertyTypeArray(int i);
    
    /**
     * Returns number of "propertyType" element
     */
    int sizeOfPropertyTypeArray();
    
    /**
     * Sets array of all "propertyType" element
     */
    void setPropertyTypeArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] propertyTypeArray);
    
    /**
     * Sets ith "propertyType" element
     */
    void setPropertyTypeArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType propertyType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "propertyType" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewPropertyType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "propertyType" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType addNewPropertyType();
    
    /**
     * Removes the ith "propertyType" element
     */
    void removePropertyType(int i);
    
    /**
     * Gets array of all "featureType" elements
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType[] getFeatureTypeArray();
    
    /**
     * Gets ith "featureType" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType getFeatureTypeArray(int i);
    
    /**
     * Returns number of "featureType" element
     */
    int sizeOfFeatureTypeArray();
    
    /**
     * Sets array of all "featureType" element
     */
    void setFeatureTypeArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] featureTypeArray);
    
    /**
     * Sets ith "featureType" element
     */
    void setFeatureTypeArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType featureType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureType" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewFeatureType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureType" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType addNewFeatureType();
    
    /**
     * Removes the ith "featureType" element
     */
    void removeFeatureType(int i);
    
    /**
     * Gets array of all "featureAttribute" elements
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType[] getFeatureAttributeArray();
    
    /**
     * Gets ith "featureAttribute" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType getFeatureAttributeArray(int i);
    
    /**
     * Returns number of "featureAttribute" element
     */
    int sizeOfFeatureAttributeArray();
    
    /**
     * Sets array of all "featureAttribute" element
     */
    void setFeatureAttributeArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] featureAttributeArray);
    
    /**
     * Sets ith "featureAttribute" element
     */
    void setFeatureAttributeArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType featureAttribute);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureAttribute" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewFeatureAttribute(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureAttribute" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType addNewFeatureAttribute();
    
    /**
     * Removes the ith "featureAttribute" element
     */
    void removeFeatureAttribute(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDMetadataType newInstance() {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDMetadataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDMetadataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMetadataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDMetadataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDMetadataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDMetadataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
