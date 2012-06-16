/*
 * XML Type:  LE_ProcessStep_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.LEProcessStepType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML LE_ProcessStep_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface LEProcessStepType extends org.isotc211.x2005.gmd.LIProcessStepType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LEProcessStepType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("leprocesssteptype186etype");
    
    /**
     * Gets array of all "output" elements
     */
    org.isotc211.x2005.gmi.LESourcePropertyType[] getOutputArray();
    
    /**
     * Gets ith "output" element
     */
    org.isotc211.x2005.gmi.LESourcePropertyType getOutputArray(int i);
    
    /**
     * Returns number of "output" element
     */
    int sizeOfOutputArray();
    
    /**
     * Sets array of all "output" element
     */
    void setOutputArray(org.isotc211.x2005.gmi.LESourcePropertyType[] outputArray);
    
    /**
     * Sets ith "output" element
     */
    void setOutputArray(int i, org.isotc211.x2005.gmi.LESourcePropertyType output);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "output" element
     */
    org.isotc211.x2005.gmi.LESourcePropertyType insertNewOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "output" element
     */
    org.isotc211.x2005.gmi.LESourcePropertyType addNewOutput();
    
    /**
     * Removes the ith "output" element
     */
    void removeOutput(int i);
    
    /**
     * Gets array of all "report" elements
     */
    org.isotc211.x2005.gmi.LEProcessStepReportPropertyType[] getReportArray();
    
    /**
     * Gets ith "report" element
     */
    org.isotc211.x2005.gmi.LEProcessStepReportPropertyType getReportArray(int i);
    
    /**
     * Returns number of "report" element
     */
    int sizeOfReportArray();
    
    /**
     * Sets array of all "report" element
     */
    void setReportArray(org.isotc211.x2005.gmi.LEProcessStepReportPropertyType[] reportArray);
    
    /**
     * Sets ith "report" element
     */
    void setReportArray(int i, org.isotc211.x2005.gmi.LEProcessStepReportPropertyType report);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "report" element
     */
    org.isotc211.x2005.gmi.LEProcessStepReportPropertyType insertNewReport(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "report" element
     */
    org.isotc211.x2005.gmi.LEProcessStepReportPropertyType addNewReport();
    
    /**
     * Removes the ith "report" element
     */
    void removeReport(int i);
    
    /**
     * Gets the "processingInformation" element
     */
    org.isotc211.x2005.gmi.LEProcessingPropertyType getProcessingInformation();
    
    /**
     * True if has "processingInformation" element
     */
    boolean isSetProcessingInformation();
    
    /**
     * Sets the "processingInformation" element
     */
    void setProcessingInformation(org.isotc211.x2005.gmi.LEProcessingPropertyType processingInformation);
    
    /**
     * Appends and returns a new empty "processingInformation" element
     */
    org.isotc211.x2005.gmi.LEProcessingPropertyType addNewProcessingInformation();
    
    /**
     * Unsets the "processingInformation" element
     */
    void unsetProcessingInformation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.LEProcessStepType newInstance() {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.LEProcessStepType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.LEProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
