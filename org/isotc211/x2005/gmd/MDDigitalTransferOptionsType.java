/*
 * XML Type:  MD_DigitalTransferOptions_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDDigitalTransferOptionsType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_DigitalTransferOptions_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDDigitalTransferOptionsType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDDigitalTransferOptionsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mddigitaltransferoptionstypecd45type");
    
    /**
     * Gets the "unitsOfDistribution" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getUnitsOfDistribution();
    
    /**
     * True if has "unitsOfDistribution" element
     */
    boolean isSetUnitsOfDistribution();
    
    /**
     * Sets the "unitsOfDistribution" element
     */
    void setUnitsOfDistribution(org.isotc211.x2005.gco.CharacterStringPropertyType unitsOfDistribution);
    
    /**
     * Appends and returns a new empty "unitsOfDistribution" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewUnitsOfDistribution();
    
    /**
     * Unsets the "unitsOfDistribution" element
     */
    void unsetUnitsOfDistribution();
    
    /**
     * Gets the "transferSize" element
     */
    org.isotc211.x2005.gco.RealPropertyType getTransferSize();
    
    /**
     * True if has "transferSize" element
     */
    boolean isSetTransferSize();
    
    /**
     * Sets the "transferSize" element
     */
    void setTransferSize(org.isotc211.x2005.gco.RealPropertyType transferSize);
    
    /**
     * Appends and returns a new empty "transferSize" element
     */
    org.isotc211.x2005.gco.RealPropertyType addNewTransferSize();
    
    /**
     * Unsets the "transferSize" element
     */
    void unsetTransferSize();
    
    /**
     * Gets array of all "onLine" elements
     */
    org.isotc211.x2005.gmd.CIOnlineResourcePropertyType[] getOnLineArray();
    
    /**
     * Gets ith "onLine" element
     */
    org.isotc211.x2005.gmd.CIOnlineResourcePropertyType getOnLineArray(int i);
    
    /**
     * Returns number of "onLine" element
     */
    int sizeOfOnLineArray();
    
    /**
     * Sets array of all "onLine" element
     */
    void setOnLineArray(org.isotc211.x2005.gmd.CIOnlineResourcePropertyType[] onLineArray);
    
    /**
     * Sets ith "onLine" element
     */
    void setOnLineArray(int i, org.isotc211.x2005.gmd.CIOnlineResourcePropertyType onLine);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "onLine" element
     */
    org.isotc211.x2005.gmd.CIOnlineResourcePropertyType insertNewOnLine(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "onLine" element
     */
    org.isotc211.x2005.gmd.CIOnlineResourcePropertyType addNewOnLine();
    
    /**
     * Removes the ith "onLine" element
     */
    void removeOnLine(int i);
    
    /**
     * Gets the "offLine" element
     */
    org.isotc211.x2005.gmd.MDMediumPropertyType getOffLine();
    
    /**
     * True if has "offLine" element
     */
    boolean isSetOffLine();
    
    /**
     * Sets the "offLine" element
     */
    void setOffLine(org.isotc211.x2005.gmd.MDMediumPropertyType offLine);
    
    /**
     * Appends and returns a new empty "offLine" element
     */
    org.isotc211.x2005.gmd.MDMediumPropertyType addNewOffLine();
    
    /**
     * Unsets the "offLine" element
     */
    void unsetOffLine();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType newInstance() {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDDigitalTransferOptionsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDDigitalTransferOptionsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
