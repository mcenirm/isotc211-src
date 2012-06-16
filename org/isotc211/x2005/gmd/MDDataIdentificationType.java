/*
 * XML Type:  MD_DataIdentification_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDataIdentificationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_DataIdentification_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDDataIdentificationType extends org.isotc211.x2005.gmd.AbstractMDIdentificationType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDDataIdentificationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mddataidentificationtype4cc2type");
    
    /**
     * Gets array of all "spatialRepresentationType" elements
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType[] getSpatialRepresentationTypeArray();
    
    /**
     * Gets ith "spatialRepresentationType" element
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType getSpatialRepresentationTypeArray(int i);
    
    /**
     * Returns number of "spatialRepresentationType" element
     */
    int sizeOfSpatialRepresentationTypeArray();
    
    /**
     * Sets array of all "spatialRepresentationType" element
     */
    void setSpatialRepresentationTypeArray(org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType[] spatialRepresentationTypeArray);
    
    /**
     * Sets ith "spatialRepresentationType" element
     */
    void setSpatialRepresentationTypeArray(int i, org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType spatialRepresentationType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "spatialRepresentationType" element
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType insertNewSpatialRepresentationType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "spatialRepresentationType" element
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType addNewSpatialRepresentationType();
    
    /**
     * Removes the ith "spatialRepresentationType" element
     */
    void removeSpatialRepresentationType(int i);
    
    /**
     * Gets array of all "spatialResolution" elements
     */
    org.isotc211.x2005.gmd.MDResolutionPropertyType[] getSpatialResolutionArray();
    
    /**
     * Gets ith "spatialResolution" element
     */
    org.isotc211.x2005.gmd.MDResolutionPropertyType getSpatialResolutionArray(int i);
    
    /**
     * Returns number of "spatialResolution" element
     */
    int sizeOfSpatialResolutionArray();
    
    /**
     * Sets array of all "spatialResolution" element
     */
    void setSpatialResolutionArray(org.isotc211.x2005.gmd.MDResolutionPropertyType[] spatialResolutionArray);
    
    /**
     * Sets ith "spatialResolution" element
     */
    void setSpatialResolutionArray(int i, org.isotc211.x2005.gmd.MDResolutionPropertyType spatialResolution);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "spatialResolution" element
     */
    org.isotc211.x2005.gmd.MDResolutionPropertyType insertNewSpatialResolution(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "spatialResolution" element
     */
    org.isotc211.x2005.gmd.MDResolutionPropertyType addNewSpatialResolution();
    
    /**
     * Removes the ith "spatialResolution" element
     */
    void removeSpatialResolution(int i);
    
    /**
     * Gets array of all "language" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getLanguageArray();
    
    /**
     * Gets ith "language" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getLanguageArray(int i);
    
    /**
     * Returns number of "language" element
     */
    int sizeOfLanguageArray();
    
    /**
     * Sets array of all "language" element
     */
    void setLanguageArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] languageArray);
    
    /**
     * Sets ith "language" element
     */
    void setLanguageArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType language);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "language" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewLanguage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "language" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewLanguage();
    
    /**
     * Removes the ith "language" element
     */
    void removeLanguage(int i);
    
    /**
     * Gets array of all "characterSet" elements
     */
    org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType[] getCharacterSetArray();
    
    /**
     * Gets ith "characterSet" element
     */
    org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType getCharacterSetArray(int i);
    
    /**
     * Returns number of "characterSet" element
     */
    int sizeOfCharacterSetArray();
    
    /**
     * Sets array of all "characterSet" element
     */
    void setCharacterSetArray(org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType[] characterSetArray);
    
    /**
     * Sets ith "characterSet" element
     */
    void setCharacterSetArray(int i, org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType characterSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "characterSet" element
     */
    org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType insertNewCharacterSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "characterSet" element
     */
    org.isotc211.x2005.gmd.MDCharacterSetCodePropertyType addNewCharacterSet();
    
    /**
     * Removes the ith "characterSet" element
     */
    void removeCharacterSet(int i);
    
    /**
     * Gets array of all "topicCategory" elements
     */
    org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType[] getTopicCategoryArray();
    
    /**
     * Gets ith "topicCategory" element
     */
    org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType getTopicCategoryArray(int i);
    
    /**
     * Returns number of "topicCategory" element
     */
    int sizeOfTopicCategoryArray();
    
    /**
     * Sets array of all "topicCategory" element
     */
    void setTopicCategoryArray(org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType[] topicCategoryArray);
    
    /**
     * Sets ith "topicCategory" element
     */
    void setTopicCategoryArray(int i, org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType topicCategory);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "topicCategory" element
     */
    org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType insertNewTopicCategory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "topicCategory" element
     */
    org.isotc211.x2005.gmd.MDTopicCategoryCodePropertyType addNewTopicCategory();
    
    /**
     * Removes the ith "topicCategory" element
     */
    void removeTopicCategory(int i);
    
    /**
     * Gets the "environmentDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getEnvironmentDescription();
    
    /**
     * True if has "environmentDescription" element
     */
    boolean isSetEnvironmentDescription();
    
    /**
     * Sets the "environmentDescription" element
     */
    void setEnvironmentDescription(org.isotc211.x2005.gco.CharacterStringPropertyType environmentDescription);
    
    /**
     * Appends and returns a new empty "environmentDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewEnvironmentDescription();
    
    /**
     * Unsets the "environmentDescription" element
     */
    void unsetEnvironmentDescription();
    
    /**
     * Gets array of all "extent" elements
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType[] getExtentArray();
    
    /**
     * Gets ith "extent" element
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType getExtentArray(int i);
    
    /**
     * Returns number of "extent" element
     */
    int sizeOfExtentArray();
    
    /**
     * Sets array of all "extent" element
     */
    void setExtentArray(org.isotc211.x2005.gmd.EXExtentPropertyType[] extentArray);
    
    /**
     * Sets ith "extent" element
     */
    void setExtentArray(int i, org.isotc211.x2005.gmd.EXExtentPropertyType extent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extent" element
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType insertNewExtent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extent" element
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType addNewExtent();
    
    /**
     * Removes the ith "extent" element
     */
    void removeExtent(int i);
    
    /**
     * Gets the "supplementalInformation" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getSupplementalInformation();
    
    /**
     * True if has "supplementalInformation" element
     */
    boolean isSetSupplementalInformation();
    
    /**
     * Sets the "supplementalInformation" element
     */
    void setSupplementalInformation(org.isotc211.x2005.gco.CharacterStringPropertyType supplementalInformation);
    
    /**
     * Appends and returns a new empty "supplementalInformation" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewSupplementalInformation();
    
    /**
     * Unsets the "supplementalInformation" element
     */
    void unsetSupplementalInformation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDDataIdentificationType newInstance() {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDDataIdentificationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDDataIdentificationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
