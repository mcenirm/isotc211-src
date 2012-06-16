/*
 * XML Type:  CoordinateSystemAxisType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoordinateSystemAxisType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML CoordinateSystemAxisType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface CoordinateSystemAxisType extends net.opengis.gml.x32.IdentifiedObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CoordinateSystemAxisType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("coordinatesystemaxistypee421type");
    
    /**
     * Gets the "axisAbbrev" element
     */
    net.opengis.gml.x32.CodeType getAxisAbbrev();
    
    /**
     * Sets the "axisAbbrev" element
     */
    void setAxisAbbrev(net.opengis.gml.x32.CodeType axisAbbrev);
    
    /**
     * Appends and returns a new empty "axisAbbrev" element
     */
    net.opengis.gml.x32.CodeType addNewAxisAbbrev();
    
    /**
     * Gets the "axisDirection" element
     */
    net.opengis.gml.x32.CodeWithAuthorityType getAxisDirection();
    
    /**
     * Sets the "axisDirection" element
     */
    void setAxisDirection(net.opengis.gml.x32.CodeWithAuthorityType axisDirection);
    
    /**
     * Appends and returns a new empty "axisDirection" element
     */
    net.opengis.gml.x32.CodeWithAuthorityType addNewAxisDirection();
    
    /**
     * Gets the "minimumValue" element
     */
    double getMinimumValue();
    
    /**
     * Gets (as xml) the "minimumValue" element
     */
    org.apache.xmlbeans.XmlDouble xgetMinimumValue();
    
    /**
     * True if has "minimumValue" element
     */
    boolean isSetMinimumValue();
    
    /**
     * Sets the "minimumValue" element
     */
    void setMinimumValue(double minimumValue);
    
    /**
     * Sets (as xml) the "minimumValue" element
     */
    void xsetMinimumValue(org.apache.xmlbeans.XmlDouble minimumValue);
    
    /**
     * Unsets the "minimumValue" element
     */
    void unsetMinimumValue();
    
    /**
     * Gets the "maximumValue" element
     */
    double getMaximumValue();
    
    /**
     * Gets (as xml) the "maximumValue" element
     */
    org.apache.xmlbeans.XmlDouble xgetMaximumValue();
    
    /**
     * True if has "maximumValue" element
     */
    boolean isSetMaximumValue();
    
    /**
     * Sets the "maximumValue" element
     */
    void setMaximumValue(double maximumValue);
    
    /**
     * Sets (as xml) the "maximumValue" element
     */
    void xsetMaximumValue(org.apache.xmlbeans.XmlDouble maximumValue);
    
    /**
     * Unsets the "maximumValue" element
     */
    void unsetMaximumValue();
    
    /**
     * Gets the "rangeMeaning" element
     */
    net.opengis.gml.x32.CodeWithAuthorityType getRangeMeaning();
    
    /**
     * True if has "rangeMeaning" element
     */
    boolean isSetRangeMeaning();
    
    /**
     * Sets the "rangeMeaning" element
     */
    void setRangeMeaning(net.opengis.gml.x32.CodeWithAuthorityType rangeMeaning);
    
    /**
     * Appends and returns a new empty "rangeMeaning" element
     */
    net.opengis.gml.x32.CodeWithAuthorityType addNewRangeMeaning();
    
    /**
     * Unsets the "rangeMeaning" element
     */
    void unsetRangeMeaning();
    
    /**
     * Gets the "uom" attribute
     */
    java.lang.String getUom();
    
    /**
     * Gets (as xml) the "uom" attribute
     */
    net.opengis.gml.x32.UomIdentifier xgetUom();
    
    /**
     * Sets the "uom" attribute
     */
    void setUom(java.lang.String uom);
    
    /**
     * Sets (as xml) the "uom" attribute
     */
    void xsetUom(net.opengis.gml.x32.UomIdentifier uom);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.CoordinateSystemAxisType newInstance() {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.CoordinateSystemAxisType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.CoordinateSystemAxisType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
