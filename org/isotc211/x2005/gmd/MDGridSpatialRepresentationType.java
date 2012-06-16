/*
 * XML Type:  MD_GridSpatialRepresentation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGridSpatialRepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_GridSpatialRepresentation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDGridSpatialRepresentationType extends org.isotc211.x2005.gmd.AbstractMDSpatialRepresentationType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDGridSpatialRepresentationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdgridspatialrepresentationtype00b7type");
    
    /**
     * Gets the "numberOfDimensions" element
     */
    org.isotc211.x2005.gco.IntegerPropertyType getNumberOfDimensions();
    
    /**
     * Sets the "numberOfDimensions" element
     */
    void setNumberOfDimensions(org.isotc211.x2005.gco.IntegerPropertyType numberOfDimensions);
    
    /**
     * Appends and returns a new empty "numberOfDimensions" element
     */
    org.isotc211.x2005.gco.IntegerPropertyType addNewNumberOfDimensions();
    
    /**
     * Gets array of all "axisDimensionProperties" elements
     */
    org.isotc211.x2005.gmd.MDDimensionPropertyType[] getAxisDimensionPropertiesArray();
    
    /**
     * Gets ith "axisDimensionProperties" element
     */
    org.isotc211.x2005.gmd.MDDimensionPropertyType getAxisDimensionPropertiesArray(int i);
    
    /**
     * Returns number of "axisDimensionProperties" element
     */
    int sizeOfAxisDimensionPropertiesArray();
    
    /**
     * Sets array of all "axisDimensionProperties" element
     */
    void setAxisDimensionPropertiesArray(org.isotc211.x2005.gmd.MDDimensionPropertyType[] axisDimensionPropertiesArray);
    
    /**
     * Sets ith "axisDimensionProperties" element
     */
    void setAxisDimensionPropertiesArray(int i, org.isotc211.x2005.gmd.MDDimensionPropertyType axisDimensionProperties);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "axisDimensionProperties" element
     */
    org.isotc211.x2005.gmd.MDDimensionPropertyType insertNewAxisDimensionProperties(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "axisDimensionProperties" element
     */
    org.isotc211.x2005.gmd.MDDimensionPropertyType addNewAxisDimensionProperties();
    
    /**
     * Removes the ith "axisDimensionProperties" element
     */
    void removeAxisDimensionProperties(int i);
    
    /**
     * Gets the "cellGeometry" element
     */
    org.isotc211.x2005.gmd.MDCellGeometryCodePropertyType getCellGeometry();
    
    /**
     * Sets the "cellGeometry" element
     */
    void setCellGeometry(org.isotc211.x2005.gmd.MDCellGeometryCodePropertyType cellGeometry);
    
    /**
     * Appends and returns a new empty "cellGeometry" element
     */
    org.isotc211.x2005.gmd.MDCellGeometryCodePropertyType addNewCellGeometry();
    
    /**
     * Gets the "transformationParameterAvailability" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType getTransformationParameterAvailability();
    
    /**
     * Sets the "transformationParameterAvailability" element
     */
    void setTransformationParameterAvailability(org.isotc211.x2005.gco.BooleanPropertyType transformationParameterAvailability);
    
    /**
     * Appends and returns a new empty "transformationParameterAvailability" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType addNewTransformationParameterAvailability();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType newInstance() {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDGridSpatialRepresentationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDGridSpatialRepresentationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}