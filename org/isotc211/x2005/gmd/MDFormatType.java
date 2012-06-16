/*
 * XML Type:  MD_Format_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDFormatType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_Format_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDFormatType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDFormatType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdformattypef741type");
    
    /**
     * Gets the "name" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.isotc211.x2005.gco.CharacterStringPropertyType name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewName();
    
    /**
     * Gets the "version" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getVersion();
    
    /**
     * Sets the "version" element
     */
    void setVersion(org.isotc211.x2005.gco.CharacterStringPropertyType version);
    
    /**
     * Appends and returns a new empty "version" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewVersion();
    
    /**
     * Gets the "amendmentNumber" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getAmendmentNumber();
    
    /**
     * True if has "amendmentNumber" element
     */
    boolean isSetAmendmentNumber();
    
    /**
     * Sets the "amendmentNumber" element
     */
    void setAmendmentNumber(org.isotc211.x2005.gco.CharacterStringPropertyType amendmentNumber);
    
    /**
     * Appends and returns a new empty "amendmentNumber" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewAmendmentNumber();
    
    /**
     * Unsets the "amendmentNumber" element
     */
    void unsetAmendmentNumber();
    
    /**
     * Gets the "specification" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getSpecification();
    
    /**
     * True if has "specification" element
     */
    boolean isSetSpecification();
    
    /**
     * Sets the "specification" element
     */
    void setSpecification(org.isotc211.x2005.gco.CharacterStringPropertyType specification);
    
    /**
     * Appends and returns a new empty "specification" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewSpecification();
    
    /**
     * Unsets the "specification" element
     */
    void unsetSpecification();
    
    /**
     * Gets the "fileDecompressionTechnique" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getFileDecompressionTechnique();
    
    /**
     * True if has "fileDecompressionTechnique" element
     */
    boolean isSetFileDecompressionTechnique();
    
    /**
     * Sets the "fileDecompressionTechnique" element
     */
    void setFileDecompressionTechnique(org.isotc211.x2005.gco.CharacterStringPropertyType fileDecompressionTechnique);
    
    /**
     * Appends and returns a new empty "fileDecompressionTechnique" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewFileDecompressionTechnique();
    
    /**
     * Unsets the "fileDecompressionTechnique" element
     */
    void unsetFileDecompressionTechnique();
    
    /**
     * Gets array of all "formatDistributor" elements
     */
    org.isotc211.x2005.gmd.MDDistributorPropertyType[] getFormatDistributorArray();
    
    /**
     * Gets ith "formatDistributor" element
     */
    org.isotc211.x2005.gmd.MDDistributorPropertyType getFormatDistributorArray(int i);
    
    /**
     * Returns number of "formatDistributor" element
     */
    int sizeOfFormatDistributorArray();
    
    /**
     * Sets array of all "formatDistributor" element
     */
    void setFormatDistributorArray(org.isotc211.x2005.gmd.MDDistributorPropertyType[] formatDistributorArray);
    
    /**
     * Sets ith "formatDistributor" element
     */
    void setFormatDistributorArray(int i, org.isotc211.x2005.gmd.MDDistributorPropertyType formatDistributor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "formatDistributor" element
     */
    org.isotc211.x2005.gmd.MDDistributorPropertyType insertNewFormatDistributor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "formatDistributor" element
     */
    org.isotc211.x2005.gmd.MDDistributorPropertyType addNewFormatDistributor();
    
    /**
     * Removes the ith "formatDistributor" element
     */
    void removeFormatDistributor(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDFormatType newInstance() {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDFormatType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDFormatType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDFormatType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDFormatType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDFormatType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDFormatType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
