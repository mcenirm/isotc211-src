/*
 * XML Type:  AbstractMD_Identification_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractMDIdentificationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML AbstractMD_Identification_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface AbstractMDIdentificationType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractMDIdentificationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("abstractmdidentificationtype23f6type");
    
    /**
     * Gets the "citation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getCitation();
    
    /**
     * Sets the "citation" element
     */
    void setCitation(org.isotc211.x2005.gmd.CICitationPropertyType citation);
    
    /**
     * Appends and returns a new empty "citation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewCitation();
    
    /**
     * Gets the "abstract" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getAbstract();
    
    /**
     * Sets the "abstract" element
     */
    void setAbstract(org.isotc211.x2005.gco.CharacterStringPropertyType xabstract);
    
    /**
     * Appends and returns a new empty "abstract" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewAbstract();
    
    /**
     * Gets the "purpose" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getPurpose();
    
    /**
     * True if has "purpose" element
     */
    boolean isSetPurpose();
    
    /**
     * Sets the "purpose" element
     */
    void setPurpose(org.isotc211.x2005.gco.CharacterStringPropertyType purpose);
    
    /**
     * Appends and returns a new empty "purpose" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewPurpose();
    
    /**
     * Unsets the "purpose" element
     */
    void unsetPurpose();
    
    /**
     * Gets array of all "credit" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getCreditArray();
    
    /**
     * Gets ith "credit" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getCreditArray(int i);
    
    /**
     * Returns number of "credit" element
     */
    int sizeOfCreditArray();
    
    /**
     * Sets array of all "credit" element
     */
    void setCreditArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] creditArray);
    
    /**
     * Sets ith "credit" element
     */
    void setCreditArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType credit);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "credit" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewCredit(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "credit" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewCredit();
    
    /**
     * Removes the ith "credit" element
     */
    void removeCredit(int i);
    
    /**
     * Gets array of all "status" elements
     */
    org.isotc211.x2005.gmd.MDProgressCodePropertyType[] getStatusArray();
    
    /**
     * Gets ith "status" element
     */
    org.isotc211.x2005.gmd.MDProgressCodePropertyType getStatusArray(int i);
    
    /**
     * Returns number of "status" element
     */
    int sizeOfStatusArray();
    
    /**
     * Sets array of all "status" element
     */
    void setStatusArray(org.isotc211.x2005.gmd.MDProgressCodePropertyType[] statusArray);
    
    /**
     * Sets ith "status" element
     */
    void setStatusArray(int i, org.isotc211.x2005.gmd.MDProgressCodePropertyType status);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "status" element
     */
    org.isotc211.x2005.gmd.MDProgressCodePropertyType insertNewStatus(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "status" element
     */
    org.isotc211.x2005.gmd.MDProgressCodePropertyType addNewStatus();
    
    /**
     * Removes the ith "status" element
     */
    void removeStatus(int i);
    
    /**
     * Gets array of all "pointOfContact" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getPointOfContactArray();
    
    /**
     * Gets ith "pointOfContact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getPointOfContactArray(int i);
    
    /**
     * Returns number of "pointOfContact" element
     */
    int sizeOfPointOfContactArray();
    
    /**
     * Sets array of all "pointOfContact" element
     */
    void setPointOfContactArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] pointOfContactArray);
    
    /**
     * Sets ith "pointOfContact" element
     */
    void setPointOfContactArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType pointOfContact);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pointOfContact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewPointOfContact(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pointOfContact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewPointOfContact();
    
    /**
     * Removes the ith "pointOfContact" element
     */
    void removePointOfContact(int i);
    
    /**
     * Gets array of all "resourceMaintenance" elements
     */
    org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType[] getResourceMaintenanceArray();
    
    /**
     * Gets ith "resourceMaintenance" element
     */
    org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType getResourceMaintenanceArray(int i);
    
    /**
     * Returns number of "resourceMaintenance" element
     */
    int sizeOfResourceMaintenanceArray();
    
    /**
     * Sets array of all "resourceMaintenance" element
     */
    void setResourceMaintenanceArray(org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType[] resourceMaintenanceArray);
    
    /**
     * Sets ith "resourceMaintenance" element
     */
    void setResourceMaintenanceArray(int i, org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType resourceMaintenance);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceMaintenance" element
     */
    org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType insertNewResourceMaintenance(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceMaintenance" element
     */
    org.isotc211.x2005.gmd.MDMaintenanceInformationPropertyType addNewResourceMaintenance();
    
    /**
     * Removes the ith "resourceMaintenance" element
     */
    void removeResourceMaintenance(int i);
    
    /**
     * Gets array of all "graphicOverview" elements
     */
    org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType[] getGraphicOverviewArray();
    
    /**
     * Gets ith "graphicOverview" element
     */
    org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType getGraphicOverviewArray(int i);
    
    /**
     * Returns number of "graphicOverview" element
     */
    int sizeOfGraphicOverviewArray();
    
    /**
     * Sets array of all "graphicOverview" element
     */
    void setGraphicOverviewArray(org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType[] graphicOverviewArray);
    
    /**
     * Sets ith "graphicOverview" element
     */
    void setGraphicOverviewArray(int i, org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType graphicOverview);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "graphicOverview" element
     */
    org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType insertNewGraphicOverview(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "graphicOverview" element
     */
    org.isotc211.x2005.gmd.MDBrowseGraphicPropertyType addNewGraphicOverview();
    
    /**
     * Removes the ith "graphicOverview" element
     */
    void removeGraphicOverview(int i);
    
    /**
     * Gets array of all "resourceFormat" elements
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType[] getResourceFormatArray();
    
    /**
     * Gets ith "resourceFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType getResourceFormatArray(int i);
    
    /**
     * Returns number of "resourceFormat" element
     */
    int sizeOfResourceFormatArray();
    
    /**
     * Sets array of all "resourceFormat" element
     */
    void setResourceFormatArray(org.isotc211.x2005.gmd.MDFormatPropertyType[] resourceFormatArray);
    
    /**
     * Sets ith "resourceFormat" element
     */
    void setResourceFormatArray(int i, org.isotc211.x2005.gmd.MDFormatPropertyType resourceFormat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType insertNewResourceFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType addNewResourceFormat();
    
    /**
     * Removes the ith "resourceFormat" element
     */
    void removeResourceFormat(int i);
    
    /**
     * Gets array of all "descriptiveKeywords" elements
     */
    org.isotc211.x2005.gmd.MDKeywordsPropertyType[] getDescriptiveKeywordsArray();
    
    /**
     * Gets ith "descriptiveKeywords" element
     */
    org.isotc211.x2005.gmd.MDKeywordsPropertyType getDescriptiveKeywordsArray(int i);
    
    /**
     * Returns number of "descriptiveKeywords" element
     */
    int sizeOfDescriptiveKeywordsArray();
    
    /**
     * Sets array of all "descriptiveKeywords" element
     */
    void setDescriptiveKeywordsArray(org.isotc211.x2005.gmd.MDKeywordsPropertyType[] descriptiveKeywordsArray);
    
    /**
     * Sets ith "descriptiveKeywords" element
     */
    void setDescriptiveKeywordsArray(int i, org.isotc211.x2005.gmd.MDKeywordsPropertyType descriptiveKeywords);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "descriptiveKeywords" element
     */
    org.isotc211.x2005.gmd.MDKeywordsPropertyType insertNewDescriptiveKeywords(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "descriptiveKeywords" element
     */
    org.isotc211.x2005.gmd.MDKeywordsPropertyType addNewDescriptiveKeywords();
    
    /**
     * Removes the ith "descriptiveKeywords" element
     */
    void removeDescriptiveKeywords(int i);
    
    /**
     * Gets array of all "resourceSpecificUsage" elements
     */
    org.isotc211.x2005.gmd.MDUsagePropertyType[] getResourceSpecificUsageArray();
    
    /**
     * Gets ith "resourceSpecificUsage" element
     */
    org.isotc211.x2005.gmd.MDUsagePropertyType getResourceSpecificUsageArray(int i);
    
    /**
     * Returns number of "resourceSpecificUsage" element
     */
    int sizeOfResourceSpecificUsageArray();
    
    /**
     * Sets array of all "resourceSpecificUsage" element
     */
    void setResourceSpecificUsageArray(org.isotc211.x2005.gmd.MDUsagePropertyType[] resourceSpecificUsageArray);
    
    /**
     * Sets ith "resourceSpecificUsage" element
     */
    void setResourceSpecificUsageArray(int i, org.isotc211.x2005.gmd.MDUsagePropertyType resourceSpecificUsage);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceSpecificUsage" element
     */
    org.isotc211.x2005.gmd.MDUsagePropertyType insertNewResourceSpecificUsage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceSpecificUsage" element
     */
    org.isotc211.x2005.gmd.MDUsagePropertyType addNewResourceSpecificUsage();
    
    /**
     * Removes the ith "resourceSpecificUsage" element
     */
    void removeResourceSpecificUsage(int i);
    
    /**
     * Gets array of all "resourceConstraints" elements
     */
    org.isotc211.x2005.gmd.MDConstraintsPropertyType[] getResourceConstraintsArray();
    
    /**
     * Gets ith "resourceConstraints" element
     */
    org.isotc211.x2005.gmd.MDConstraintsPropertyType getResourceConstraintsArray(int i);
    
    /**
     * Returns number of "resourceConstraints" element
     */
    int sizeOfResourceConstraintsArray();
    
    /**
     * Sets array of all "resourceConstraints" element
     */
    void setResourceConstraintsArray(org.isotc211.x2005.gmd.MDConstraintsPropertyType[] resourceConstraintsArray);
    
    /**
     * Sets ith "resourceConstraints" element
     */
    void setResourceConstraintsArray(int i, org.isotc211.x2005.gmd.MDConstraintsPropertyType resourceConstraints);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceConstraints" element
     */
    org.isotc211.x2005.gmd.MDConstraintsPropertyType insertNewResourceConstraints(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceConstraints" element
     */
    org.isotc211.x2005.gmd.MDConstraintsPropertyType addNewResourceConstraints();
    
    /**
     * Removes the ith "resourceConstraints" element
     */
    void removeResourceConstraints(int i);
    
    /**
     * Gets array of all "aggregationInfo" elements
     */
    org.isotc211.x2005.gmd.MDAggregateInformationPropertyType[] getAggregationInfoArray();
    
    /**
     * Gets ith "aggregationInfo" element
     */
    org.isotc211.x2005.gmd.MDAggregateInformationPropertyType getAggregationInfoArray(int i);
    
    /**
     * Returns number of "aggregationInfo" element
     */
    int sizeOfAggregationInfoArray();
    
    /**
     * Sets array of all "aggregationInfo" element
     */
    void setAggregationInfoArray(org.isotc211.x2005.gmd.MDAggregateInformationPropertyType[] aggregationInfoArray);
    
    /**
     * Sets ith "aggregationInfo" element
     */
    void setAggregationInfoArray(int i, org.isotc211.x2005.gmd.MDAggregateInformationPropertyType aggregationInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "aggregationInfo" element
     */
    org.isotc211.x2005.gmd.MDAggregateInformationPropertyType insertNewAggregationInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "aggregationInfo" element
     */
    org.isotc211.x2005.gmd.MDAggregateInformationPropertyType addNewAggregationInfo();
    
    /**
     * Removes the ith "aggregationInfo" element
     */
    void removeAggregationInfo(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType newInstance() {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.AbstractMDIdentificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.AbstractMDIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
