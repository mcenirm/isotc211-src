/*
 * XML Type:  DMSAngleType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DMSAngleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML DMSAngleType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface DMSAngleType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DMSAngleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("dmsangletype7720type");
    
    /**
     * Gets the "degrees" element
     */
    net.opengis.gml.x32.DegreesType getDegrees();
    
    /**
     * Sets the "degrees" element
     */
    void setDegrees(net.opengis.gml.x32.DegreesType degrees);
    
    /**
     * Appends and returns a new empty "degrees" element
     */
    net.opengis.gml.x32.DegreesType addNewDegrees();
    
    /**
     * Gets the "decimalMinutes" element
     */
    java.math.BigDecimal getDecimalMinutes();
    
    /**
     * Gets (as xml) the "decimalMinutes" element
     */
    net.opengis.gml.x32.DecimalMinutesType xgetDecimalMinutes();
    
    /**
     * True if has "decimalMinutes" element
     */
    boolean isSetDecimalMinutes();
    
    /**
     * Sets the "decimalMinutes" element
     */
    void setDecimalMinutes(java.math.BigDecimal decimalMinutes);
    
    /**
     * Sets (as xml) the "decimalMinutes" element
     */
    void xsetDecimalMinutes(net.opengis.gml.x32.DecimalMinutesType decimalMinutes);
    
    /**
     * Unsets the "decimalMinutes" element
     */
    void unsetDecimalMinutes();
    
    /**
     * Gets the "minutes" element
     */
    int getMinutes();
    
    /**
     * Gets (as xml) the "minutes" element
     */
    net.opengis.gml.x32.ArcMinutesType xgetMinutes();
    
    /**
     * True if has "minutes" element
     */
    boolean isSetMinutes();
    
    /**
     * Sets the "minutes" element
     */
    void setMinutes(int minutes);
    
    /**
     * Sets (as xml) the "minutes" element
     */
    void xsetMinutes(net.opengis.gml.x32.ArcMinutesType minutes);
    
    /**
     * Unsets the "minutes" element
     */
    void unsetMinutes();
    
    /**
     * Gets the "seconds" element
     */
    java.math.BigDecimal getSeconds();
    
    /**
     * Gets (as xml) the "seconds" element
     */
    net.opengis.gml.x32.ArcSecondsType xgetSeconds();
    
    /**
     * True if has "seconds" element
     */
    boolean isSetSeconds();
    
    /**
     * Sets the "seconds" element
     */
    void setSeconds(java.math.BigDecimal seconds);
    
    /**
     * Sets (as xml) the "seconds" element
     */
    void xsetSeconds(net.opengis.gml.x32.ArcSecondsType seconds);
    
    /**
     * Unsets the "seconds" element
     */
    void unsetSeconds();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.DMSAngleType newInstance() {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.DMSAngleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.DMSAngleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.DMSAngleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.DMSAngleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.DMSAngleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.DMSAngleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.DMSAngleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}