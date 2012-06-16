/*
 * XML Type:  QE_CoverageResult_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.QECoverageResultType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML QE_CoverageResult_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface QECoverageResultType extends org.isotc211.x2005.gmd.AbstractDQResultType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QECoverageResultType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("qecoverageresulttypead97type");
    
    /**
     * Gets the "spatialRepresentationType" element
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType getSpatialRepresentationType();
    
    /**
     * Sets the "spatialRepresentationType" element
     */
    void setSpatialRepresentationType(org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType spatialRepresentationType);
    
    /**
     * Appends and returns a new empty "spatialRepresentationType" element
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationTypeCodePropertyType addNewSpatialRepresentationType();
    
    /**
     * Gets the "resultSpatialRepresentation" element
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType getResultSpatialRepresentation();
    
    /**
     * Sets the "resultSpatialRepresentation" element
     */
    void setResultSpatialRepresentation(org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType resultSpatialRepresentation);
    
    /**
     * Appends and returns a new empty "resultSpatialRepresentation" element
     */
    org.isotc211.x2005.gmd.MDSpatialRepresentationPropertyType addNewResultSpatialRepresentation();
    
    /**
     * Gets the "resultContentDescription" element
     */
    org.isotc211.x2005.gmd.MDCoverageDescriptionPropertyType getResultContentDescription();
    
    /**
     * Sets the "resultContentDescription" element
     */
    void setResultContentDescription(org.isotc211.x2005.gmd.MDCoverageDescriptionPropertyType resultContentDescription);
    
    /**
     * Appends and returns a new empty "resultContentDescription" element
     */
    org.isotc211.x2005.gmd.MDCoverageDescriptionPropertyType addNewResultContentDescription();
    
    /**
     * Gets the "resultFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType getResultFormat();
    
    /**
     * Sets the "resultFormat" element
     */
    void setResultFormat(org.isotc211.x2005.gmd.MDFormatPropertyType resultFormat);
    
    /**
     * Appends and returns a new empty "resultFormat" element
     */
    org.isotc211.x2005.gmd.MDFormatPropertyType addNewResultFormat();
    
    /**
     * Gets the "resultFile" element
     */
    org.isotc211.x2005.gmi.MXDataFilePropertyType getResultFile();
    
    /**
     * Sets the "resultFile" element
     */
    void setResultFile(org.isotc211.x2005.gmi.MXDataFilePropertyType resultFile);
    
    /**
     * Appends and returns a new empty "resultFile" element
     */
    org.isotc211.x2005.gmi.MXDataFilePropertyType addNewResultFile();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.QECoverageResultType newInstance() {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.QECoverageResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.QECoverageResultType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
