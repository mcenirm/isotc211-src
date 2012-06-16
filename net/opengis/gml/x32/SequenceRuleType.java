/*
 * XML Type:  SequenceRuleType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SequenceRuleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML SequenceRuleType(@http://www.opengis.net/gml/3.2).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.x32.SequenceRuleType.
 */
public interface SequenceRuleType extends net.opengis.gml.x32.SequenceRuleEnumeration
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SequenceRuleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("sequenceruletype22actype");
    
    static final net.opengis.gml.x32.SequenceRuleEnumeration.Enum LINEAR = net.opengis.gml.x32.SequenceRuleEnumeration.LINEAR;
    static final net.opengis.gml.x32.SequenceRuleEnumeration.Enum BOUSTROPHEDONIC = net.opengis.gml.x32.SequenceRuleEnumeration.BOUSTROPHEDONIC;
    static final net.opengis.gml.x32.SequenceRuleEnumeration.Enum CANTOR_DIAGONAL = net.opengis.gml.x32.SequenceRuleEnumeration.CANTOR_DIAGONAL;
    static final net.opengis.gml.x32.SequenceRuleEnumeration.Enum SPIRAL = net.opengis.gml.x32.SequenceRuleEnumeration.SPIRAL;
    static final net.opengis.gml.x32.SequenceRuleEnumeration.Enum MORTON = net.opengis.gml.x32.SequenceRuleEnumeration.MORTON;
    static final net.opengis.gml.x32.SequenceRuleEnumeration.Enum HILBERT = net.opengis.gml.x32.SequenceRuleEnumeration.HILBERT;
    
    static final int INT_LINEAR = net.opengis.gml.x32.SequenceRuleEnumeration.INT_LINEAR;
    static final int INT_BOUSTROPHEDONIC = net.opengis.gml.x32.SequenceRuleEnumeration.INT_BOUSTROPHEDONIC;
    static final int INT_CANTOR_DIAGONAL = net.opengis.gml.x32.SequenceRuleEnumeration.INT_CANTOR_DIAGONAL;
    static final int INT_SPIRAL = net.opengis.gml.x32.SequenceRuleEnumeration.INT_SPIRAL;
    static final int INT_MORTON = net.opengis.gml.x32.SequenceRuleEnumeration.INT_MORTON;
    static final int INT_HILBERT = net.opengis.gml.x32.SequenceRuleEnumeration.INT_HILBERT;
    
    /**
     * Gets the "order" attribute
     */
    net.opengis.gml.x32.IncrementOrder.Enum getOrder();
    
    /**
     * Gets (as xml) the "order" attribute
     */
    net.opengis.gml.x32.IncrementOrder xgetOrder();
    
    /**
     * True if has "order" attribute
     */
    boolean isSetOrder();
    
    /**
     * Sets the "order" attribute
     */
    void setOrder(net.opengis.gml.x32.IncrementOrder.Enum order);
    
    /**
     * Sets (as xml) the "order" attribute
     */
    void xsetOrder(net.opengis.gml.x32.IncrementOrder order);
    
    /**
     * Unsets the "order" attribute
     */
    void unsetOrder();
    
    /**
     * Gets the "axisOrder" attribute
     */
    java.util.List getAxisOrder();
    
    /**
     * Gets (as xml) the "axisOrder" attribute
     */
    net.opengis.gml.x32.AxisDirectionList xgetAxisOrder();
    
    /**
     * True if has "axisOrder" attribute
     */
    boolean isSetAxisOrder();
    
    /**
     * Sets the "axisOrder" attribute
     */
    void setAxisOrder(java.util.List axisOrder);
    
    /**
     * Sets (as xml) the "axisOrder" attribute
     */
    void xsetAxisOrder(net.opengis.gml.x32.AxisDirectionList axisOrder);
    
    /**
     * Unsets the "axisOrder" attribute
     */
    void unsetAxisOrder();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.SequenceRuleType newInstance() {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.SequenceRuleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.SequenceRuleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.SequenceRuleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.SequenceRuleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.SequenceRuleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.SequenceRuleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.SequenceRuleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
