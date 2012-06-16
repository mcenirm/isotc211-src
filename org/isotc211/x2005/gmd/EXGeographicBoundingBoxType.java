/*
 * XML Type:  EX_GeographicBoundingBox_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXGeographicBoundingBoxType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML EX_GeographicBoundingBox_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface EXGeographicBoundingBoxType extends org.isotc211.x2005.gmd.AbstractEXGeographicExtentType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EXGeographicBoundingBoxType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("exgeographicboundingboxtypeb1d8type");
    
    /**
     * Gets the "westBoundLongitude" element
     */
    org.isotc211.x2005.gco.DecimalPropertyType getWestBoundLongitude();
    
    /**
     * Sets the "westBoundLongitude" element
     */
    void setWestBoundLongitude(org.isotc211.x2005.gco.DecimalPropertyType westBoundLongitude);
    
    /**
     * Appends and returns a new empty "westBoundLongitude" element
     */
    org.isotc211.x2005.gco.DecimalPropertyType addNewWestBoundLongitude();
    
    /**
     * Gets the "eastBoundLongitude" element
     */
    org.isotc211.x2005.gco.DecimalPropertyType getEastBoundLongitude();
    
    /**
     * Sets the "eastBoundLongitude" element
     */
    void setEastBoundLongitude(org.isotc211.x2005.gco.DecimalPropertyType eastBoundLongitude);
    
    /**
     * Appends and returns a new empty "eastBoundLongitude" element
     */
    org.isotc211.x2005.gco.DecimalPropertyType addNewEastBoundLongitude();
    
    /**
     * Gets the "southBoundLatitude" element
     */
    org.isotc211.x2005.gco.DecimalPropertyType getSouthBoundLatitude();
    
    /**
     * Sets the "southBoundLatitude" element
     */
    void setSouthBoundLatitude(org.isotc211.x2005.gco.DecimalPropertyType southBoundLatitude);
    
    /**
     * Appends and returns a new empty "southBoundLatitude" element
     */
    org.isotc211.x2005.gco.DecimalPropertyType addNewSouthBoundLatitude();
    
    /**
     * Gets the "northBoundLatitude" element
     */
    org.isotc211.x2005.gco.DecimalPropertyType getNorthBoundLatitude();
    
    /**
     * Sets the "northBoundLatitude" element
     */
    void setNorthBoundLatitude(org.isotc211.x2005.gco.DecimalPropertyType northBoundLatitude);
    
    /**
     * Appends and returns a new empty "northBoundLatitude" element
     */
    org.isotc211.x2005.gco.DecimalPropertyType addNewNorthBoundLatitude();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType newInstance() {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.EXGeographicBoundingBoxType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.EXGeographicBoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
