/*
 * XML Type:  MI_Band_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIBandType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML MI_Band_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface MIBandType extends org.isotc211.x2005.gmd.MDBandType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MIBandType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mibandtype799ftype");
    
    /**
     * Gets the "bandBoundaryDefinition" element
     */
    org.isotc211.x2005.gmi.MIBandDefinitionPropertyType getBandBoundaryDefinition();
    
    /**
     * True if has "bandBoundaryDefinition" element
     */
    boolean isSetBandBoundaryDefinition();
    
    /**
     * Sets the "bandBoundaryDefinition" element
     */
    void setBandBoundaryDefinition(org.isotc211.x2005.gmi.MIBandDefinitionPropertyType bandBoundaryDefinition);
    
    /**
     * Appends and returns a new empty "bandBoundaryDefinition" element
     */
    org.isotc211.x2005.gmi.MIBandDefinitionPropertyType addNewBandBoundaryDefinition();
    
    /**
     * Unsets the "bandBoundaryDefinition" element
     */
    void unsetBandBoundaryDefinition();
    
    /**
     * Gets the "nominalSpatialResolution" element
     */
    org.isotc211.x2005.gco.RealPropertyType getNominalSpatialResolution();
    
    /**
     * True if has "nominalSpatialResolution" element
     */
    boolean isSetNominalSpatialResolution();
    
    /**
     * Sets the "nominalSpatialResolution" element
     */
    void setNominalSpatialResolution(org.isotc211.x2005.gco.RealPropertyType nominalSpatialResolution);
    
    /**
     * Appends and returns a new empty "nominalSpatialResolution" element
     */
    org.isotc211.x2005.gco.RealPropertyType addNewNominalSpatialResolution();
    
    /**
     * Unsets the "nominalSpatialResolution" element
     */
    void unsetNominalSpatialResolution();
    
    /**
     * Gets the "transferFunctionType" element
     */
    org.isotc211.x2005.gmi.MITransferFunctionTypeCodePropertyType getTransferFunctionType();
    
    /**
     * True if has "transferFunctionType" element
     */
    boolean isSetTransferFunctionType();
    
    /**
     * Sets the "transferFunctionType" element
     */
    void setTransferFunctionType(org.isotc211.x2005.gmi.MITransferFunctionTypeCodePropertyType transferFunctionType);
    
    /**
     * Appends and returns a new empty "transferFunctionType" element
     */
    org.isotc211.x2005.gmi.MITransferFunctionTypeCodePropertyType addNewTransferFunctionType();
    
    /**
     * Unsets the "transferFunctionType" element
     */
    void unsetTransferFunctionType();
    
    /**
     * Gets the "transmittedPolarisation" element
     */
    org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType getTransmittedPolarisation();
    
    /**
     * True if has "transmittedPolarisation" element
     */
    boolean isSetTransmittedPolarisation();
    
    /**
     * Sets the "transmittedPolarisation" element
     */
    void setTransmittedPolarisation(org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType transmittedPolarisation);
    
    /**
     * Appends and returns a new empty "transmittedPolarisation" element
     */
    org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType addNewTransmittedPolarisation();
    
    /**
     * Unsets the "transmittedPolarisation" element
     */
    void unsetTransmittedPolarisation();
    
    /**
     * Gets the "detectedPolarisation" element
     */
    org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType getDetectedPolarisation();
    
    /**
     * True if has "detectedPolarisation" element
     */
    boolean isSetDetectedPolarisation();
    
    /**
     * Sets the "detectedPolarisation" element
     */
    void setDetectedPolarisation(org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType detectedPolarisation);
    
    /**
     * Appends and returns a new empty "detectedPolarisation" element
     */
    org.isotc211.x2005.gmi.MIPolarisationOrientationCodePropertyType addNewDetectedPolarisation();
    
    /**
     * Unsets the "detectedPolarisation" element
     */
    void unsetDetectedPolarisation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.MIBandType newInstance() {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.MIBandType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.MIBandType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.MIBandType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIBandType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIBandType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIBandType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
