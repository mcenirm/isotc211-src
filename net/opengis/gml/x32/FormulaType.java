/*
 * XML Type:  FormulaType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FormulaType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML FormulaType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface FormulaType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormulaType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("formulatype27f5type");
    
    /**
     * Gets the "a" element
     */
    double getA();
    
    /**
     * Gets (as xml) the "a" element
     */
    org.apache.xmlbeans.XmlDouble xgetA();
    
    /**
     * True if has "a" element
     */
    boolean isSetA();
    
    /**
     * Sets the "a" element
     */
    void setA(double a);
    
    /**
     * Sets (as xml) the "a" element
     */
    void xsetA(org.apache.xmlbeans.XmlDouble a);
    
    /**
     * Unsets the "a" element
     */
    void unsetA();
    
    /**
     * Gets the "b" element
     */
    double getB();
    
    /**
     * Gets (as xml) the "b" element
     */
    org.apache.xmlbeans.XmlDouble xgetB();
    
    /**
     * Sets the "b" element
     */
    void setB(double b);
    
    /**
     * Sets (as xml) the "b" element
     */
    void xsetB(org.apache.xmlbeans.XmlDouble b);
    
    /**
     * Gets the "c" element
     */
    double getC();
    
    /**
     * Gets (as xml) the "c" element
     */
    org.apache.xmlbeans.XmlDouble xgetC();
    
    /**
     * Sets the "c" element
     */
    void setC(double c);
    
    /**
     * Sets (as xml) the "c" element
     */
    void xsetC(org.apache.xmlbeans.XmlDouble c);
    
    /**
     * Gets the "d" element
     */
    double getD();
    
    /**
     * Gets (as xml) the "d" element
     */
    org.apache.xmlbeans.XmlDouble xgetD();
    
    /**
     * True if has "d" element
     */
    boolean isSetD();
    
    /**
     * Sets the "d" element
     */
    void setD(double d);
    
    /**
     * Sets (as xml) the "d" element
     */
    void xsetD(org.apache.xmlbeans.XmlDouble d);
    
    /**
     * Unsets the "d" element
     */
    void unsetD();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.FormulaType newInstance() {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.FormulaType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.FormulaType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.FormulaType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.FormulaType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.FormulaType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.FormulaType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.FormulaType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.FormulaType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.FormulaType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.FormulaType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.FormulaType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.FormulaType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.FormulaType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.FormulaType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.FormulaType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.FormulaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.FormulaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.FormulaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
