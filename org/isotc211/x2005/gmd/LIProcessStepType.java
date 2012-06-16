/*
 * XML Type:  LI_ProcessStep_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.LIProcessStepType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML LI_ProcessStep_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface LIProcessStepType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LIProcessStepType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("liprocesssteptype8f6dtype");
    
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
     * Gets the "rationale" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getRationale();
    
    /**
     * True if has "rationale" element
     */
    boolean isSetRationale();
    
    /**
     * Sets the "rationale" element
     */
    void setRationale(org.isotc211.x2005.gco.CharacterStringPropertyType rationale);
    
    /**
     * Appends and returns a new empty "rationale" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewRationale();
    
    /**
     * Unsets the "rationale" element
     */
    void unsetRationale();
    
    /**
     * Gets the "dateTime" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType getDateTime();
    
    /**
     * True if has "dateTime" element
     */
    boolean isSetDateTime();
    
    /**
     * Sets the "dateTime" element
     */
    void setDateTime(org.isotc211.x2005.gco.DateTimePropertyType dateTime);
    
    /**
     * Appends and returns a new empty "dateTime" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType addNewDateTime();
    
    /**
     * Unsets the "dateTime" element
     */
    void unsetDateTime();
    
    /**
     * Gets array of all "processor" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getProcessorArray();
    
    /**
     * Gets ith "processor" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getProcessorArray(int i);
    
    /**
     * Returns number of "processor" element
     */
    int sizeOfProcessorArray();
    
    /**
     * Sets array of all "processor" element
     */
    void setProcessorArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] processorArray);
    
    /**
     * Sets ith "processor" element
     */
    void setProcessorArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType processor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "processor" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewProcessor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "processor" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewProcessor();
    
    /**
     * Removes the ith "processor" element
     */
    void removeProcessor(int i);
    
    /**
     * Gets array of all "source" elements
     */
    org.isotc211.x2005.gmd.LISourcePropertyType[] getSourceArray();
    
    /**
     * Gets ith "source" element
     */
    org.isotc211.x2005.gmd.LISourcePropertyType getSourceArray(int i);
    
    /**
     * Returns number of "source" element
     */
    int sizeOfSourceArray();
    
    /**
     * Sets array of all "source" element
     */
    void setSourceArray(org.isotc211.x2005.gmd.LISourcePropertyType[] sourceArray);
    
    /**
     * Sets ith "source" element
     */
    void setSourceArray(int i, org.isotc211.x2005.gmd.LISourcePropertyType source);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "source" element
     */
    org.isotc211.x2005.gmd.LISourcePropertyType insertNewSource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    org.isotc211.x2005.gmd.LISourcePropertyType addNewSource();
    
    /**
     * Removes the ith "source" element
     */
    void removeSource(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.LIProcessStepType newInstance() {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.LIProcessStepType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.LIProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
