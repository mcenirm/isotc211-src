/*
 * XML Type:  AbstractParametricCurveSurfaceType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractParametricCurveSurfaceType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML AbstractParametricCurveSurfaceType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface AbstractParametricCurveSurfaceType extends net.opengis.gml.x32.AbstractSurfacePatchType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractParametricCurveSurfaceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("abstractparametriccurvesurfacetypeff39type");
    
    /**
     * Gets the "aggregationType" attribute
     */
    net.opengis.gml.x32.AggregationType.Enum getAggregationType();
    
    /**
     * Gets (as xml) the "aggregationType" attribute
     */
    net.opengis.gml.x32.AggregationType xgetAggregationType();
    
    /**
     * True if has "aggregationType" attribute
     */
    boolean isSetAggregationType();
    
    /**
     * Sets the "aggregationType" attribute
     */
    void setAggregationType(net.opengis.gml.x32.AggregationType.Enum aggregationType);
    
    /**
     * Sets (as xml) the "aggregationType" attribute
     */
    void xsetAggregationType(net.opengis.gml.x32.AggregationType aggregationType);
    
    /**
     * Unsets the "aggregationType" attribute
     */
    void unsetAggregationType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType newInstance() {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.AbstractParametricCurveSurfaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.AbstractParametricCurveSurfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
