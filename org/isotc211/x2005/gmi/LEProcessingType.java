/*
 * XML Type:  LE_Processing_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LEProcessingType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML LE_Processing_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface LEProcessingType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LEProcessingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("leprocessingtype4a40type");
    
    /**
     * Gets the "identifier" element
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType getIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.isotc211.x2005.gmd.MDIdentifierPropertyType identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewIdentifier();
    
    /**
     * Gets array of all "softwareReference" elements
     */
    org.isotc211.x2005.gmd.CICitationPropertyType[] getSoftwareReferenceArray();
    
    /**
     * Gets ith "softwareReference" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getSoftwareReferenceArray(int i);
    
    /**
     * Returns number of "softwareReference" element
     */
    int sizeOfSoftwareReferenceArray();
    
    /**
     * Sets array of all "softwareReference" element
     */
    void setSoftwareReferenceArray(org.isotc211.x2005.gmd.CICitationPropertyType[] softwareReferenceArray);
    
    /**
     * Sets ith "softwareReference" element
     */
    void setSoftwareReferenceArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType softwareReference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "softwareReference" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType insertNewSoftwareReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "softwareReference" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewSoftwareReference();
    
    /**
     * Removes the ith "softwareReference" element
     */
    void removeSoftwareReference(int i);
    
    /**
     * Gets the "procedureDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getProcedureDescription();
    
    /**
     * True if has "procedureDescription" element
     */
    boolean isSetProcedureDescription();
    
    /**
     * Sets the "procedureDescription" element
     */
    void setProcedureDescription(org.isotc211.x2005.gco.CharacterStringPropertyType procedureDescription);
    
    /**
     * Appends and returns a new empty "procedureDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewProcedureDescription();
    
    /**
     * Unsets the "procedureDescription" element
     */
    void unsetProcedureDescription();
    
    /**
     * Gets array of all "documentation" elements
     */
    org.isotc211.x2005.gmd.CICitationPropertyType[] getDocumentationArray();
    
    /**
     * Gets ith "documentation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getDocumentationArray(int i);
    
    /**
     * Returns number of "documentation" element
     */
    int sizeOfDocumentationArray();
    
    /**
     * Sets array of all "documentation" element
     */
    void setDocumentationArray(org.isotc211.x2005.gmd.CICitationPropertyType[] documentationArray);
    
    /**
     * Sets ith "documentation" element
     */
    void setDocumentationArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType documentation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType insertNewDocumentation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewDocumentation();
    
    /**
     * Removes the ith "documentation" element
     */
    void removeDocumentation(int i);
    
    /**
     * Gets the "runTimeParameters" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getRunTimeParameters();
    
    /**
     * True if has "runTimeParameters" element
     */
    boolean isSetRunTimeParameters();
    
    /**
     * Sets the "runTimeParameters" element
     */
    void setRunTimeParameters(org.isotc211.x2005.gco.CharacterStringPropertyType runTimeParameters);
    
    /**
     * Appends and returns a new empty "runTimeParameters" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewRunTimeParameters();
    
    /**
     * Unsets the "runTimeParameters" element
     */
    void unsetRunTimeParameters();
    
    /**
     * Gets array of all "algorithm" elements
     */
    org.isotc211.x2005.gmi.LEAlgorithmPropertyType[] getAlgorithmArray();
    
    /**
     * Gets ith "algorithm" element
     */
    org.isotc211.x2005.gmi.LEAlgorithmPropertyType getAlgorithmArray(int i);
    
    /**
     * Returns number of "algorithm" element
     */
    int sizeOfAlgorithmArray();
    
    /**
     * Sets array of all "algorithm" element
     */
    void setAlgorithmArray(org.isotc211.x2005.gmi.LEAlgorithmPropertyType[] algorithmArray);
    
    /**
     * Sets ith "algorithm" element
     */
    void setAlgorithmArray(int i, org.isotc211.x2005.gmi.LEAlgorithmPropertyType algorithm);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "algorithm" element
     */
    org.isotc211.x2005.gmi.LEAlgorithmPropertyType insertNewAlgorithm(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "algorithm" element
     */
    org.isotc211.x2005.gmi.LEAlgorithmPropertyType addNewAlgorithm();
    
    /**
     * Removes the ith "algorithm" element
     */
    void removeAlgorithm(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.LEProcessingType newInstance() {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.LEProcessingType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.LEProcessingType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.LEProcessingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.LEProcessingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.LEProcessingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
