/*
 * XML Type:  MD_FeatureCatalogueDescription_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_FeatureCatalogueDescription_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDFeatureCatalogueDescriptionType extends org.isotc211.x2005.gmd.AbstractMDContentInformationType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDFeatureCatalogueDescriptionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdfeaturecataloguedescriptiontypeba95type");
    
    /**
     * Gets the "complianceCode" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType getComplianceCode();
    
    /**
     * True if has "complianceCode" element
     */
    boolean isSetComplianceCode();
    
    /**
     * Sets the "complianceCode" element
     */
    void setComplianceCode(org.isotc211.x2005.gco.BooleanPropertyType complianceCode);
    
    /**
     * Appends and returns a new empty "complianceCode" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType addNewComplianceCode();
    
    /**
     * Unsets the "complianceCode" element
     */
    void unsetComplianceCode();
    
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
     * Gets the "includedWithDataset" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType getIncludedWithDataset();
    
    /**
     * Sets the "includedWithDataset" element
     */
    void setIncludedWithDataset(org.isotc211.x2005.gco.BooleanPropertyType includedWithDataset);
    
    /**
     * Appends and returns a new empty "includedWithDataset" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType addNewIncludedWithDataset();
    
    /**
     * Gets array of all "featureTypes" elements
     */
    org.isotc211.x2005.gco.GenericNamePropertyType[] getFeatureTypesArray();
    
    /**
     * Gets ith "featureTypes" element
     */
    org.isotc211.x2005.gco.GenericNamePropertyType getFeatureTypesArray(int i);
    
    /**
     * Returns number of "featureTypes" element
     */
    int sizeOfFeatureTypesArray();
    
    /**
     * Sets array of all "featureTypes" element
     */
    void setFeatureTypesArray(org.isotc211.x2005.gco.GenericNamePropertyType[] featureTypesArray);
    
    /**
     * Sets ith "featureTypes" element
     */
    void setFeatureTypesArray(int i, org.isotc211.x2005.gco.GenericNamePropertyType featureTypes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureTypes" element
     */
    org.isotc211.x2005.gco.GenericNamePropertyType insertNewFeatureTypes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureTypes" element
     */
    org.isotc211.x2005.gco.GenericNamePropertyType addNewFeatureTypes();
    
    /**
     * Removes the ith "featureTypes" element
     */
    void removeFeatureTypes(int i);
    
    /**
     * Gets array of all "featureCatalogueCitation" elements
     */
    org.isotc211.x2005.gmd.CICitationPropertyType[] getFeatureCatalogueCitationArray();
    
    /**
     * Gets ith "featureCatalogueCitation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getFeatureCatalogueCitationArray(int i);
    
    /**
     * Returns number of "featureCatalogueCitation" element
     */
    int sizeOfFeatureCatalogueCitationArray();
    
    /**
     * Sets array of all "featureCatalogueCitation" element
     */
    void setFeatureCatalogueCitationArray(org.isotc211.x2005.gmd.CICitationPropertyType[] featureCatalogueCitationArray);
    
    /**
     * Sets ith "featureCatalogueCitation" element
     */
    void setFeatureCatalogueCitationArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType featureCatalogueCitation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureCatalogueCitation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType insertNewFeatureCatalogueCitation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureCatalogueCitation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewFeatureCatalogueCitation();
    
    /**
     * Removes the ith "featureCatalogueCitation" element
     */
    void removeFeatureCatalogueCitation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType newInstance() {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDFeatureCatalogueDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
