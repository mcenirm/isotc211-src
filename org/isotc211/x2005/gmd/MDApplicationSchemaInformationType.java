/*
 * XML Type:  MD_ApplicationSchemaInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDApplicationSchemaInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_ApplicationSchemaInformation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDApplicationSchemaInformationType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDApplicationSchemaInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdapplicationschemainformationtyped865type");
    
    /**
     * Gets the "name" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.isotc211.x2005.gmd.CICitationPropertyType name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewName();
    
    /**
     * Gets the "schemaLanguage" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getSchemaLanguage();
    
    /**
     * Sets the "schemaLanguage" element
     */
    void setSchemaLanguage(org.isotc211.x2005.gco.CharacterStringPropertyType schemaLanguage);
    
    /**
     * Appends and returns a new empty "schemaLanguage" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewSchemaLanguage();
    
    /**
     * Gets the "constraintLanguage" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getConstraintLanguage();
    
    /**
     * Sets the "constraintLanguage" element
     */
    void setConstraintLanguage(org.isotc211.x2005.gco.CharacterStringPropertyType constraintLanguage);
    
    /**
     * Appends and returns a new empty "constraintLanguage" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewConstraintLanguage();
    
    /**
     * Gets the "schemaAscii" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getSchemaAscii();
    
    /**
     * True if has "schemaAscii" element
     */
    boolean isSetSchemaAscii();
    
    /**
     * Sets the "schemaAscii" element
     */
    void setSchemaAscii(org.isotc211.x2005.gco.CharacterStringPropertyType schemaAscii);
    
    /**
     * Appends and returns a new empty "schemaAscii" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewSchemaAscii();
    
    /**
     * Unsets the "schemaAscii" element
     */
    void unsetSchemaAscii();
    
    /**
     * Gets the "graphicsFile" element
     */
    org.isotc211.x2005.gco.BinaryPropertyType getGraphicsFile();
    
    /**
     * True if has "graphicsFile" element
     */
    boolean isSetGraphicsFile();
    
    /**
     * Sets the "graphicsFile" element
     */
    void setGraphicsFile(org.isotc211.x2005.gco.BinaryPropertyType graphicsFile);
    
    /**
     * Appends and returns a new empty "graphicsFile" element
     */
    org.isotc211.x2005.gco.BinaryPropertyType addNewGraphicsFile();
    
    /**
     * Unsets the "graphicsFile" element
     */
    void unsetGraphicsFile();
    
    /**
     * Gets the "softwareDevelopmentFile" element
     */
    org.isotc211.x2005.gco.BinaryPropertyType getSoftwareDevelopmentFile();
    
    /**
     * True if has "softwareDevelopmentFile" element
     */
    boolean isSetSoftwareDevelopmentFile();
    
    /**
     * Sets the "softwareDevelopmentFile" element
     */
    void setSoftwareDevelopmentFile(org.isotc211.x2005.gco.BinaryPropertyType softwareDevelopmentFile);
    
    /**
     * Appends and returns a new empty "softwareDevelopmentFile" element
     */
    org.isotc211.x2005.gco.BinaryPropertyType addNewSoftwareDevelopmentFile();
    
    /**
     * Unsets the "softwareDevelopmentFile" element
     */
    void unsetSoftwareDevelopmentFile();
    
    /**
     * Gets the "softwareDevelopmentFileFormat" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getSoftwareDevelopmentFileFormat();
    
    /**
     * True if has "softwareDevelopmentFileFormat" element
     */
    boolean isSetSoftwareDevelopmentFileFormat();
    
    /**
     * Sets the "softwareDevelopmentFileFormat" element
     */
    void setSoftwareDevelopmentFileFormat(org.isotc211.x2005.gco.CharacterStringPropertyType softwareDevelopmentFileFormat);
    
    /**
     * Appends and returns a new empty "softwareDevelopmentFileFormat" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewSoftwareDevelopmentFileFormat();
    
    /**
     * Unsets the "softwareDevelopmentFileFormat" element
     */
    void unsetSoftwareDevelopmentFileFormat();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType newInstance() {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDApplicationSchemaInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDApplicationSchemaInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
