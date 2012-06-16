/*
 * XML Type:  MD_Band_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDBandType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_Band_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDBandType extends org.isotc211.x2005.gmd.MDRangeDimensionType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDBandType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdbandtype6abftype");
    
    /**
     * Gets the "maxValue" element
     */
    org.isotc211.x2005.gco.RealPropertyType getMaxValue();
    
    /**
     * True if has "maxValue" element
     */
    boolean isSetMaxValue();
    
    /**
     * Sets the "maxValue" element
     */
    void setMaxValue(org.isotc211.x2005.gco.RealPropertyType maxValue);
    
    /**
     * Appends and returns a new empty "maxValue" element
     */
    org.isotc211.x2005.gco.RealPropertyType addNewMaxValue();
    
    /**
     * Unsets the "maxValue" element
     */
    void unsetMaxValue();
    
    /**
     * Gets the "minValue" element
     */
    org.isotc211.x2005.gco.RealPropertyType getMinValue();
    
    /**
     * True if has "minValue" element
     */
    boolean isSetMinValue();
    
    /**
     * Sets the "minValue" element
     */
    void setMinValue(org.isotc211.x2005.gco.RealPropertyType minValue);
    
    /**
     * Appends and returns a new empty "minValue" element
     */
    org.isotc211.x2005.gco.RealPropertyType addNewMinValue();
    
    /**
     * Unsets the "minValue" element
     */
    void unsetMinValue();
    
    /**
     * Gets the "units" element
     */
    org.isotc211.x2005.gco.UomLengthPropertyType getUnits();
    
    /**
     * True if has "units" element
     */
    boolean isSetUnits();
    
    /**
     * Sets the "units" element
     */
    void setUnits(org.isotc211.x2005.gco.UomLengthPropertyType units);
    
    /**
     * Appends and returns a new empty "units" element
     */
    org.isotc211.x2005.gco.UomLengthPropertyType addNewUnits();
    
    /**
     * Unsets the "units" element
     */
    void unsetUnits();
    
    /**
     * Gets the "peakResponse" element
     */
    org.isotc211.x2005.gco.RealPropertyType getPeakResponse();
    
    /**
     * True if has "peakResponse" element
     */
    boolean isSetPeakResponse();
    
    /**
     * Sets the "peakResponse" element
     */
    void setPeakResponse(org.isotc211.x2005.gco.RealPropertyType peakResponse);
    
    /**
     * Appends and returns a new empty "peakResponse" element
     */
    org.isotc211.x2005.gco.RealPropertyType addNewPeakResponse();
    
    /**
     * Unsets the "peakResponse" element
     */
    void unsetPeakResponse();
    
    /**
     * Gets the "bitsPerValue" element
     */
    org.isotc211.x2005.gco.IntegerPropertyType getBitsPerValue();
    
    /**
     * True if has "bitsPerValue" element
     */
    boolean isSetBitsPerValue();
    
    /**
     * Sets the "bitsPerValue" element
     */
    void setBitsPerValue(org.isotc211.x2005.gco.IntegerPropertyType bitsPerValue);
    
    /**
     * Appends and returns a new empty "bitsPerValue" element
     */
    org.isotc211.x2005.gco.IntegerPropertyType addNewBitsPerValue();
    
    /**
     * Unsets the "bitsPerValue" element
     */
    void unsetBitsPerValue();
    
    /**
     * Gets the "toneGradation" element
     */
    org.isotc211.x2005.gco.IntegerPropertyType getToneGradation();
    
    /**
     * True if has "toneGradation" element
     */
    boolean isSetToneGradation();
    
    /**
     * Sets the "toneGradation" element
     */
    void setToneGradation(org.isotc211.x2005.gco.IntegerPropertyType toneGradation);
    
    /**
     * Appends and returns a new empty "toneGradation" element
     */
    org.isotc211.x2005.gco.IntegerPropertyType addNewToneGradation();
    
    /**
     * Unsets the "toneGradation" element
     */
    void unsetToneGradation();
    
    /**
     * Gets the "scaleFactor" element
     */
    org.isotc211.x2005.gco.RealPropertyType getScaleFactor();
    
    /**
     * True if has "scaleFactor" element
     */
    boolean isSetScaleFactor();
    
    /**
     * Sets the "scaleFactor" element
     */
    void setScaleFactor(org.isotc211.x2005.gco.RealPropertyType scaleFactor);
    
    /**
     * Appends and returns a new empty "scaleFactor" element
     */
    org.isotc211.x2005.gco.RealPropertyType addNewScaleFactor();
    
    /**
     * Unsets the "scaleFactor" element
     */
    void unsetScaleFactor();
    
    /**
     * Gets the "offset" element
     */
    org.isotc211.x2005.gco.RealPropertyType getOffset();
    
    /**
     * True if has "offset" element
     */
    boolean isSetOffset();
    
    /**
     * Sets the "offset" element
     */
    void setOffset(org.isotc211.x2005.gco.RealPropertyType offset);
    
    /**
     * Appends and returns a new empty "offset" element
     */
    org.isotc211.x2005.gco.RealPropertyType addNewOffset();
    
    /**
     * Unsets the "offset" element
     */
    void unsetOffset();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDBandType newInstance() {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDBandType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDBandType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDBandType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDBandType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDBandType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDBandType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDBandType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
