/*
 * XML Type:  MD_Distributor_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDistributorType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_Distributor_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDDistributorType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDDistributorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mddistributortype7a13type");
    
    /**
     * Gets the "distributorContact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getDistributorContact();
    
    /**
     * Sets the "distributorContact" element
     */
    void setDistributorContact(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType distributorContact);
    
    /**
     * Appends and returns a new empty "distributorContact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewDistributorContact();
    
    /**
     * Gets array of all "distributionOrderProcess" elements
     */
    org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType[] getDistributionOrderProcessArray();
    
    /**
     * Gets ith "distributionOrderProcess" element
     */
    org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType getDistributionOrderProcessArray(int i);
    
    /**
     * Returns number of "distributionOrderProcess" element
     */
    int sizeOfDistributionOrderProcessArray();
    
    /**
     * Sets array of all "distributionOrderProcess" element
     */
    void setDistributionOrderProcessArray(org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType[] distributionOrderProcessArray);
    
    /**
     * Sets ith "distributionOrderProcess" element
     */
    void setDistributionOrderProcessArray(int i, org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType distributionOrderProcess);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributionOrderProcess" element
     */
    org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType insertNewDistributionOrderProcess(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributionOrderProcess" element
     */
    org.isotc211.x2005.gmd.MDStandardOrderProcessPropertyType addNewDistributionOrderProcess();
    
    /**
     * Removes the ith "distributionOrderProcess" element
     */
    void removeDistributionOrderProcess(int i);
    
    /**
     * Gets array of all "distributorFormat" elements
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType[] getDistributorFormatArray();
    
    /**
     * Gets ith "distributorFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType getDistributorFormatArray(int i);
    
    /**
     * Returns number of "distributorFormat" element
     */
    int sizeOfDistributorFormatArray();
    
    /**
     * Sets array of all "distributorFormat" element
     */
    void setDistributorFormatArray(org.isotc211.x2005.gmd.MDFormatPropertyType[] distributorFormatArray);
    
    /**
     * Sets ith "distributorFormat" element
     */
    void setDistributorFormatArray(int i, org.isotc211.x2005.gmd.MDFormatPropertyType distributorFormat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributorFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType insertNewDistributorFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributorFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType addNewDistributorFormat();
    
    /**
     * Removes the ith "distributorFormat" element
     */
    void removeDistributorFormat(int i);
    
    /**
     * Gets array of all "distributorTransferOptions" elements
     */
    org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[] getDistributorTransferOptionsArray();
    
    /**
     * Gets ith "distributorTransferOptions" element
     */
    org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType getDistributorTransferOptionsArray(int i);
    
    /**
     * Returns number of "distributorTransferOptions" element
     */
    int sizeOfDistributorTransferOptionsArray();
    
    /**
     * Sets array of all "distributorTransferOptions" element
     */
    void setDistributorTransferOptionsArray(org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType[] distributorTransferOptionsArray);
    
    /**
     * Sets ith "distributorTransferOptions" element
     */
    void setDistributorTransferOptionsArray(int i, org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType distributorTransferOptions);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributorTransferOptions" element
     */
    org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType insertNewDistributorTransferOptions(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributorTransferOptions" element
     */
    org.isotc211.x2005.gmd.MDDigitalTransferOptionsPropertyType addNewDistributorTransferOptions();
    
    /**
     * Removes the ith "distributorTransferOptions" element
     */
    void removeDistributorTransferOptions(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDDistributorType newInstance() {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDDistributorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDDistributorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDistributorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDDistributorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDDistributorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDDistributorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
