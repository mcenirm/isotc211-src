/*
 * XML Type:  MI_Event_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIEventType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML MI_Event_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface MIEventType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MIEventType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mieventtypeafd0type");
    
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
     * Gets the "trigger" element
     */
    org.isotc211.x2005.gmi.MITriggerCodePropertyType getTrigger();
    
    /**
     * Sets the "trigger" element
     */
    void setTrigger(org.isotc211.x2005.gmi.MITriggerCodePropertyType trigger);
    
    /**
     * Appends and returns a new empty "trigger" element
     */
    org.isotc211.x2005.gmi.MITriggerCodePropertyType addNewTrigger();
    
    /**
     * Gets the "context" element
     */
    org.isotc211.x2005.gmi.MIContextCodePropertyType getContext();
    
    /**
     * Sets the "context" element
     */
    void setContext(org.isotc211.x2005.gmi.MIContextCodePropertyType context);
    
    /**
     * Appends and returns a new empty "context" element
     */
    org.isotc211.x2005.gmi.MIContextCodePropertyType addNewContext();
    
    /**
     * Gets the "sequence" element
     */
    org.isotc211.x2005.gmi.MISequenceCodePropertyType getSequence();
    
    /**
     * Sets the "sequence" element
     */
    void setSequence(org.isotc211.x2005.gmi.MISequenceCodePropertyType sequence);
    
    /**
     * Appends and returns a new empty "sequence" element
     */
    org.isotc211.x2005.gmi.MISequenceCodePropertyType addNewSequence();
    
    /**
     * Gets the "time" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType getTime();
    
    /**
     * Sets the "time" element
     */
    void setTime(org.isotc211.x2005.gco.DateTimePropertyType time);
    
    /**
     * Appends and returns a new empty "time" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType addNewTime();
    
    /**
     * Gets array of all "expectedObjective" elements
     */
    org.isotc211.x2005.gmi.MIObjectivePropertyType[] getExpectedObjectiveArray();
    
    /**
     * Gets ith "expectedObjective" element
     */
    org.isotc211.x2005.gmi.MIObjectivePropertyType getExpectedObjectiveArray(int i);
    
    /**
     * Returns number of "expectedObjective" element
     */
    int sizeOfExpectedObjectiveArray();
    
    /**
     * Sets array of all "expectedObjective" element
     */
    void setExpectedObjectiveArray(org.isotc211.x2005.gmi.MIObjectivePropertyType[] expectedObjectiveArray);
    
    /**
     * Sets ith "expectedObjective" element
     */
    void setExpectedObjectiveArray(int i, org.isotc211.x2005.gmi.MIObjectivePropertyType expectedObjective);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "expectedObjective" element
     */
    org.isotc211.x2005.gmi.MIObjectivePropertyType insertNewExpectedObjective(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "expectedObjective" element
     */
    org.isotc211.x2005.gmi.MIObjectivePropertyType addNewExpectedObjective();
    
    /**
     * Removes the ith "expectedObjective" element
     */
    void removeExpectedObjective(int i);
    
    /**
     * Gets array of all "relatedSensor" elements
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType[] getRelatedSensorArray();
    
    /**
     * Gets ith "relatedSensor" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType getRelatedSensorArray(int i);
    
    /**
     * Returns number of "relatedSensor" element
     */
    int sizeOfRelatedSensorArray();
    
    /**
     * Sets array of all "relatedSensor" element
     */
    void setRelatedSensorArray(org.isotc211.x2005.gmi.MIInstrumentPropertyType[] relatedSensorArray);
    
    /**
     * Sets ith "relatedSensor" element
     */
    void setRelatedSensorArray(int i, org.isotc211.x2005.gmi.MIInstrumentPropertyType relatedSensor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedSensor" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType insertNewRelatedSensor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedSensor" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType addNewRelatedSensor();
    
    /**
     * Removes the ith "relatedSensor" element
     */
    void removeRelatedSensor(int i);
    
    /**
     * Gets the "relatedPass" element
     */
    org.isotc211.x2005.gmi.MIPlatformPassPropertyType getRelatedPass();
    
    /**
     * True if has "relatedPass" element
     */
    boolean isSetRelatedPass();
    
    /**
     * Sets the "relatedPass" element
     */
    void setRelatedPass(org.isotc211.x2005.gmi.MIPlatformPassPropertyType relatedPass);
    
    /**
     * Appends and returns a new empty "relatedPass" element
     */
    org.isotc211.x2005.gmi.MIPlatformPassPropertyType addNewRelatedPass();
    
    /**
     * Unsets the "relatedPass" element
     */
    void unsetRelatedPass();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.MIEventType newInstance() {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.MIEventType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.MIEventType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.MIEventType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIEventType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
