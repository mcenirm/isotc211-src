/*
 * XML Type:  MD_Distribution_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDistributionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_Distribution_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDDistributionType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDDistributionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mddistributiontype90cetype");
    
    /**
     * Gets array of all "distributionFormat" elements
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType[] getDistributionFormatArray();
    
    /**
     * Gets ith "distributionFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType getDistributionFormatArray(int i);
    
    /**
     * Returns number of "distributionFormat" element
     */
    int sizeOfDistributionFormatArray();
    
    /**
     * Sets array of all "distributionFormat" element
     */
    void setDistributionFormatArray(org.isotc211.x2005.gmd.MDFormatPropertyType[] distributionFormatArray);
    
    /**
     * Sets ith "distributionFormat" element
     */
    void setDistributionFormatArray(int i, org.isotc211.x2005.gmd.MDFormatPropertyType distributionFormat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributionFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType insertNewDistributionFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributionFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType addNewDistributionFormat();
    
    /**
     * Removes the ith "distributionFormat" element
     */
    void removeDistributionFormat(int i);
    
    /**
     * Gets array of all "distributor" elements
     */
    org.isotc211.x2005.gmd.MDDistributorPropertyType[] getDistributorArray();
    
    /**
     * Gets ith "distributor" element
     */
    org.isotc211.x2005.gmd.MDDistributorPropertyType getDistributorArray(int i);
    
    /**
     * Returns number of "distributor" element
     */
    int sizeOfDistributorArray();
    
    /**
     * Sets array of all "distributor" element
     */
    void setDistributorArray(org.isotc211.x2005.gmd.MDDistributorPropertyType[] distributorArray);
    
    /**
     * Sets ith "distributor" element
     */
    void setDistributorArray(int i, org.isotc211.x2005.gmd.MDDistributorPropertyType distributor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributor" element
     */
    org.isotc211.x2005.gmd.MDDistributorPropertyType insertNewDistributor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributor" element
     */
    org.isotc211.x2005.gmd.MDDistributorPropertyType addNewDistributor();
    
    /**
     * Removes the ith "distributor" element
     */
    void removeDistributor(int i);
    
    /**
     * Gets array of all "transferOptions" elements
     */
    org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[] getTransferOptionsArray();
    
    /**
     * Gets ith "transferOptions" element
     */
    org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType getTransferOptionsArray(int i);
    
    /**
     * Returns number of "transferOptions" element
     */
    int sizeOfTransferOptionsArray();
    
    /**
     * Sets array of all "transferOptions" element
     */
    void setTransferOptionsArray(org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[] transferOptionsArray);
    
    /**
     * Sets ith "transferOptions" element
     */
    void setTransferOptionsArray(int i, org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType transferOptions);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transferOptions" element
     */
    org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType insertNewTransferOptions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transferOptions" element
     */
    org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType addNewTransferOptions();
    
    /**
     * Removes the ith "transferOptions" element
     */
    void removeTransferOptions(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDDistributionType newInstance() {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDDistributionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDDistributionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDDistributionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDDistributionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDDistributionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
