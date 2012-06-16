/*
 * XML Type:  MD_Georeferenceable_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGeoreferenceableType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_Georeferenceable_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDGeoreferenceableType extends org.isotc211.x2005.gmd.MDGridSpatialRepresentationType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDGeoreferenceableType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdgeoreferenceabletype4a3etype");
    
    /**
     * Gets the "controlPointAvailability" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType getControlPointAvailability();
    
    /**
     * Sets the "controlPointAvailability" element
     */
    void setControlPointAvailability(org.isotc211.x2005.gco.BooleanPropertyType controlPointAvailability);
    
    /**
     * Appends and returns a new empty "controlPointAvailability" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType addNewControlPointAvailability();
    
    /**
     * Gets the "orientationParameterAvailability" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType getOrientationParameterAvailability();
    
    /**
     * Sets the "orientationParameterAvailability" element
     */
    void setOrientationParameterAvailability(org.isotc211.x2005.gco.BooleanPropertyType orientationParameterAvailability);
    
    /**
     * Appends and returns a new empty "orientationParameterAvailability" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType addNewOrientationParameterAvailability();
    
    /**
     * Gets the "orientationParameterDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getOrientationParameterDescription();
    
    /**
     * True if has "orientationParameterDescription" element
     */
    boolean isSetOrientationParameterDescription();
    
    /**
     * Sets the "orientationParameterDescription" element
     */
    void setOrientationParameterDescription(org.isotc211.x2005.gco.CharacterStringPropertyType orientationParameterDescription);
    
    /**
     * Appends and returns a new empty "orientationParameterDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewOrientationParameterDescription();
    
    /**
     * Unsets the "orientationParameterDescription" element
     */
    void unsetOrientationParameterDescription();
    
    /**
     * Gets the "georeferencedParameters" element
     */
    org.isotc211.x2005.gco.RecordPropertyType getGeoreferencedParameters();
    
    /**
     * Sets the "georeferencedParameters" element
     */
    void setGeoreferencedParameters(org.isotc211.x2005.gco.RecordPropertyType georeferencedParameters);
    
    /**
     * Appends and returns a new empty "georeferencedParameters" element
     */
    org.isotc211.x2005.gco.RecordPropertyType addNewGeoreferencedParameters();
    
    /**
     * Gets array of all "parameterCitation" elements
     */
    org.isotc211.x2005.gmd.CICitationPropertyType[] getParameterCitationArray();
    
    /**
     * Gets ith "parameterCitation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getParameterCitationArray(int i);
    
    /**
     * Returns number of "parameterCitation" element
     */
    int sizeOfParameterCitationArray();
    
    /**
     * Sets array of all "parameterCitation" element
     */
    void setParameterCitationArray(org.isotc211.x2005.gmd.CICitationPropertyType[] parameterCitationArray);
    
    /**
     * Sets ith "parameterCitation" element
     */
    void setParameterCitationArray(int i, org.isotc211.x2005.gmd.CICitationPropertyType parameterCitation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameterCitation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType insertNewParameterCitation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameterCitation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewParameterCitation();
    
    /**
     * Removes the ith "parameterCitation" element
     */
    void removeParameterCitation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType newInstance() {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDGeoreferenceableType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDGeoreferenceableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
