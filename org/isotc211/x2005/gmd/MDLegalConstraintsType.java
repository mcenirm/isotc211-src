/*
 * XML Type:  MD_LegalConstraints_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDLegalConstraintsType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_LegalConstraints_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDLegalConstraintsType extends org.isotc211.x2005.gmd.MDConstraintsType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDLegalConstraintsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdlegalconstraintstypea5c7type");
    
    /**
     * Gets array of all "accessConstraints" elements
     */
    org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[] getAccessConstraintsArray();
    
    /**
     * Gets ith "accessConstraints" element
     */
    org.isotc211.x2005.gmd.MDRestrictionCodePropertyType getAccessConstraintsArray(int i);
    
    /**
     * Returns number of "accessConstraints" element
     */
    int sizeOfAccessConstraintsArray();
    
    /**
     * Sets array of all "accessConstraints" element
     */
    void setAccessConstraintsArray(org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[] accessConstraintsArray);
    
    /**
     * Sets ith "accessConstraints" element
     */
    void setAccessConstraintsArray(int i, org.isotc211.x2005.gmd.MDRestrictionCodePropertyType accessConstraints);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "accessConstraints" element
     */
    org.isotc211.x2005.gmd.MDRestrictionCodePropertyType insertNewAccessConstraints(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "accessConstraints" element
     */
    org.isotc211.x2005.gmd.MDRestrictionCodePropertyType addNewAccessConstraints();
    
    /**
     * Removes the ith "accessConstraints" element
     */
    void removeAccessConstraints(int i);
    
    /**
     * Gets array of all "useConstraints" elements
     */
    org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[] getUseConstraintsArray();
    
    /**
     * Gets ith "useConstraints" element
     */
    org.isotc211.x2005.gmd.MDRestrictionCodePropertyType getUseConstraintsArray(int i);
    
    /**
     * Returns number of "useConstraints" element
     */
    int sizeOfUseConstraintsArray();
    
    /**
     * Sets array of all "useConstraints" element
     */
    void setUseConstraintsArray(org.isotc211.x2005.gmd.MDRestrictionCodePropertyType[] useConstraintsArray);
    
    /**
     * Sets ith "useConstraints" element
     */
    void setUseConstraintsArray(int i, org.isotc211.x2005.gmd.MDRestrictionCodePropertyType useConstraints);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "useConstraints" element
     */
    org.isotc211.x2005.gmd.MDRestrictionCodePropertyType insertNewUseConstraints(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "useConstraints" element
     */
    org.isotc211.x2005.gmd.MDRestrictionCodePropertyType addNewUseConstraints();
    
    /**
     * Removes the ith "useConstraints" element
     */
    void removeUseConstraints(int i);
    
    /**
     * Gets array of all "otherConstraints" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getOtherConstraintsArray();
    
    /**
     * Gets ith "otherConstraints" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getOtherConstraintsArray(int i);
    
    /**
     * Returns number of "otherConstraints" element
     */
    int sizeOfOtherConstraintsArray();
    
    /**
     * Sets array of all "otherConstraints" element
     */
    void setOtherConstraintsArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] otherConstraintsArray);
    
    /**
     * Sets ith "otherConstraints" element
     */
    void setOtherConstraintsArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType otherConstraints);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "otherConstraints" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewOtherConstraints(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "otherConstraints" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewOtherConstraints();
    
    /**
     * Removes the ith "otherConstraints" element
     */
    void removeOtherConstraints(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType newInstance() {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDLegalConstraintsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDLegalConstraintsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
