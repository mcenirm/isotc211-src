/*
 * XML Type:  PT_LocaleContainer_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.PTLocaleContainerType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML PT_LocaleContainer_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface PTLocaleContainerType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PTLocaleContainerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("ptlocalecontainertype11a0type");
    
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
     * Gets the "locale" element
     */
    org.isotc211.x2005.gmd.PTLocalePropertyType getLocale();
    
    /**
     * Sets the "locale" element
     */
    void setLocale(org.isotc211.x2005.gmd.PTLocalePropertyType locale);
    
    /**
     * Appends and returns a new empty "locale" element
     */
    org.isotc211.x2005.gmd.PTLocalePropertyType addNewLocale();
    
    /**
     * Gets array of all "date" elements
     */
    org.isotc211.x2005.gmd.CIDatePropertyType[] getDateArray();
    
    /**
     * Gets ith "date" element
     */
    org.isotc211.x2005.gmd.CIDatePropertyType getDateArray(int i);
    
    /**
     * Returns number of "date" element
     */
    int sizeOfDateArray();
    
    /**
     * Sets array of all "date" element
     */
    void setDateArray(org.isotc211.x2005.gmd.CIDatePropertyType[] dateArray);
    
    /**
     * Sets ith "date" element
     */
    void setDateArray(int i, org.isotc211.x2005.gmd.CIDatePropertyType date);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "date" element
     */
    org.isotc211.x2005.gmd.CIDatePropertyType insertNewDate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "date" element
     */
    org.isotc211.x2005.gmd.CIDatePropertyType addNewDate();
    
    /**
     * Removes the ith "date" element
     */
    void removeDate(int i);
    
    /**
     * Gets array of all "responsibleParty" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getResponsiblePartyArray();
    
    /**
     * Gets ith "responsibleParty" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getResponsiblePartyArray(int i);
    
    /**
     * Returns number of "responsibleParty" element
     */
    int sizeOfResponsiblePartyArray();
    
    /**
     * Sets array of all "responsibleParty" element
     */
    void setResponsiblePartyArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] responsiblePartyArray);
    
    /**
     * Sets ith "responsibleParty" element
     */
    void setResponsiblePartyArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType responsibleParty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "responsibleParty" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewResponsibleParty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "responsibleParty" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewResponsibleParty();
    
    /**
     * Removes the ith "responsibleParty" element
     */
    void removeResponsibleParty(int i);
    
    /**
     * Gets array of all "localisedString" elements
     */
    org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType[] getLocalisedStringArray();
    
    /**
     * Gets ith "localisedString" element
     */
    org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType getLocalisedStringArray(int i);
    
    /**
     * Returns number of "localisedString" element
     */
    int sizeOfLocalisedStringArray();
    
    /**
     * Sets array of all "localisedString" element
     */
    void setLocalisedStringArray(org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType[] localisedStringArray);
    
    /**
     * Sets ith "localisedString" element
     */
    void setLocalisedStringArray(int i, org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType localisedString);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "localisedString" element
     */
    org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType insertNewLocalisedString(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "localisedString" element
     */
    org.isotc211.x2005.gmd.LocalisedCharacterStringPropertyType addNewLocalisedString();
    
    /**
     * Removes the ith "localisedString" element
     */
    void removeLocalisedString(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.PTLocaleContainerType newInstance() {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.PTLocaleContainerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.PTLocaleContainerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
