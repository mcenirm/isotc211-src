/*
 * XML Type:  TimeIntervalLengthType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeIntervalLengthType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML TimeIntervalLengthType(@http://www.opengis.net/gml/3.2).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.x32.TimeIntervalLengthType.
 */
public interface TimeIntervalLengthType extends org.apache.xmlbeans.XmlDecimal
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimeIntervalLengthType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("timeintervallengthtype41b1type");
    
    /**
     * Gets the "unit" attribute
     */
    java.lang.String getUnit();
    
    /**
     * Gets (as xml) the "unit" attribute
     */
    net.opengis.gml.x32.TimeUnitType xgetUnit();
    
    /**
     * Sets the "unit" attribute
     */
    void setUnit(java.lang.String unit);
    
    /**
     * Sets (as xml) the "unit" attribute
     */
    void xsetUnit(net.opengis.gml.x32.TimeUnitType unit);
    
    /**
     * Gets the "radix" attribute
     */
    java.math.BigInteger getRadix();
    
    /**
     * Gets (as xml) the "radix" attribute
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetRadix();
    
    /**
     * True if has "radix" attribute
     */
    boolean isSetRadix();
    
    /**
     * Sets the "radix" attribute
     */
    void setRadix(java.math.BigInteger radix);
    
    /**
     * Sets (as xml) the "radix" attribute
     */
    void xsetRadix(org.apache.xmlbeans.XmlPositiveInteger radix);
    
    /**
     * Unsets the "radix" attribute
     */
    void unsetRadix();
    
    /**
     * Gets the "factor" attribute
     */
    java.math.BigInteger getFactor();
    
    /**
     * Gets (as xml) the "factor" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetFactor();
    
    /**
     * True if has "factor" attribute
     */
    boolean isSetFactor();
    
    /**
     * Sets the "factor" attribute
     */
    void setFactor(java.math.BigInteger factor);
    
    /**
     * Sets (as xml) the "factor" attribute
     */
    void xsetFactor(org.apache.xmlbeans.XmlInteger factor);
    
    /**
     * Unsets the "factor" attribute
     */
    void unsetFactor();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.TimeIntervalLengthType newInstance() {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.TimeIntervalLengthType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.TimeIntervalLengthType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
