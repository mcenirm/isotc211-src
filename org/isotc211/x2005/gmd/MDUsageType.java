/*
 * XML Type:  MD_Usage_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDUsageType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_Usage_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDUsageType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDUsageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdusagetype710dtype");
    
    /**
     * Gets the "specificUsage" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getSpecificUsage();
    
    /**
     * Sets the "specificUsage" element
     */
    void setSpecificUsage(org.isotc211.x2005.gco.CharacterStringPropertyType specificUsage);
    
    /**
     * Appends and returns a new empty "specificUsage" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewSpecificUsage();
    
    /**
     * Gets the "usageDateTime" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType getUsageDateTime();
    
    /**
     * True if has "usageDateTime" element
     */
    boolean isSetUsageDateTime();
    
    /**
     * Sets the "usageDateTime" element
     */
    void setUsageDateTime(org.isotc211.x2005.gco.DateTimePropertyType usageDateTime);
    
    /**
     * Appends and returns a new empty "usageDateTime" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType addNewUsageDateTime();
    
    /**
     * Unsets the "usageDateTime" element
     */
    void unsetUsageDateTime();
    
    /**
     * Gets the "userDeterminedLimitations" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getUserDeterminedLimitations();
    
    /**
     * True if has "userDeterminedLimitations" element
     */
    boolean isSetUserDeterminedLimitations();
    
    /**
     * Sets the "userDeterminedLimitations" element
     */
    void setUserDeterminedLimitations(org.isotc211.x2005.gco.CharacterStringPropertyType userDeterminedLimitations);
    
    /**
     * Appends and returns a new empty "userDeterminedLimitations" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewUserDeterminedLimitations();
    
    /**
     * Unsets the "userDeterminedLimitations" element
     */
    void unsetUserDeterminedLimitations();
    
    /**
     * Gets array of all "userContactInfo" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getUserContactInfoArray();
    
    /**
     * Gets ith "userContactInfo" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getUserContactInfoArray(int i);
    
    /**
     * Returns number of "userContactInfo" element
     */
    int sizeOfUserContactInfoArray();
    
    /**
     * Sets array of all "userContactInfo" element
     */
    void setUserContactInfoArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] userContactInfoArray);
    
    /**
     * Sets ith "userContactInfo" element
     */
    void setUserContactInfoArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType userContactInfo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "userContactInfo" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewUserContactInfo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "userContactInfo" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewUserContactInfo();
    
    /**
     * Removes the ith "userContactInfo" element
     */
    void removeUserContactInfo(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDUsageType newInstance() {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDUsageType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDUsageType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDUsageType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDUsageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDUsageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDUsageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
