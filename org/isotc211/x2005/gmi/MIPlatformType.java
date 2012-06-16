/*
 * XML Type:  MI_Platform_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIPlatformType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML MI_Platform_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface MIPlatformType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MIPlatformType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("miplatformtype405dtype");
    
    /**
     * Gets array of all "citation" elements
     */
    org.isotc211.x2005.gmd.CICitationPropertyType[] getCitationArray();
    
    /**
     * Gets ith "citation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getCitationArray(int i);
    
    /**
     * Returns number of "citation" element
     */
    int sizeOfCitationArray();
    
    /**
     * Sets array of all "citation" element
     */
    void setCitationArray(org.isotc211.x2005.gmd.CICitationPropertyType[] citationArray);
    
    /**
     * Sets ith "citation" element
     */
    void setCitationArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType citation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "citation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType insertNewCitation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "citation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewCitation();
    
    /**
     * Removes the ith "citation" element
     */
    void removeCitation(int i);
    
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
     * Gets the "description" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewDescription();
    
    /**
     * Gets array of all "sponsor" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getSponsorArray();
    
    /**
     * Gets ith "sponsor" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getSponsorArray(int i);
    
    /**
     * Returns number of "sponsor" element
     */
    int sizeOfSponsorArray();
    
    /**
     * Sets array of all "sponsor" element
     */
    void setSponsorArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] sponsorArray);
    
    /**
     * Sets ith "sponsor" element
     */
    void setSponsorArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType sponsor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sponsor" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewSponsor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sponsor" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewSponsor();
    
    /**
     * Removes the ith "sponsor" element
     */
    void removeSponsor(int i);
    
    /**
     * Gets array of all "instrument" elements
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType[] getInstrumentArray();
    
    /**
     * Gets ith "instrument" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType getInstrumentArray(int i);
    
    /**
     * Returns number of "instrument" element
     */
    int sizeOfInstrumentArray();
    
    /**
     * Sets array of all "instrument" element
     */
    void setInstrumentArray(org.isotc211.x2005.gmi.MIInstrumentPropertyType[] instrumentArray);
    
    /**
     * Sets ith "instrument" element
     */
    void setInstrumentArray(int i, org.isotc211.x2005.gmi.MIInstrumentPropertyType instrument);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instrument" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType insertNewInstrument(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instrument" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType addNewInstrument();
    
    /**
     * Removes the ith "instrument" element
     */
    void removeInstrument(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.MIPlatformType newInstance() {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.MIPlatformType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.MIPlatformType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlatformType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIPlatformType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIPlatformType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIPlatformType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
