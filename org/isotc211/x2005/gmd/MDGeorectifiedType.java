/*
 * XML Type:  MD_Georectified_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDGeorectifiedType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_Georectified_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDGeorectifiedType extends org.isotc211.x2005.gmd.MDGridSpatialRepresentationType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDGeorectifiedType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdgeorectifiedtypec5c0type");
    
    /**
     * Gets the "checkPointAvailability" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType getCheckPointAvailability();
    
    /**
     * Sets the "checkPointAvailability" element
     */
    void setCheckPointAvailability(org.isotc211.x2005.gco.BooleanPropertyType checkPointAvailability);
    
    /**
     * Appends and returns a new empty "checkPointAvailability" element
     */
    org.isotc211.x2005.gco.BooleanPropertyType addNewCheckPointAvailability();
    
    /**
     * Gets the "checkPointDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getCheckPointDescription();
    
    /**
     * True if has "checkPointDescription" element
     */
    boolean isSetCheckPointDescription();
    
    /**
     * Sets the "checkPointDescription" element
     */
    void setCheckPointDescription(org.isotc211.x2005.gco.CharacterStringPropertyType checkPointDescription);
    
    /**
     * Appends and returns a new empty "checkPointDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewCheckPointDescription();
    
    /**
     * Unsets the "checkPointDescription" element
     */
    void unsetCheckPointDescription();
    
    /**
     * Gets array of all "cornerPoints" elements
     */
    org.isotc211.x2005.gss.GMPointPropertyType[] getCornerPointsArray();
    
    /**
     * Gets ith "cornerPoints" element
     */
    org.isotc211.x2005.gss.GMPointPropertyType getCornerPointsArray(int i);
    
    /**
     * Returns number of "cornerPoints" element
     */
    int sizeOfCornerPointsArray();
    
    /**
     * Sets array of all "cornerPoints" element
     */
    void setCornerPointsArray(org.isotc211.x2005.gss.GMPointPropertyType[] cornerPointsArray);
    
    /**
     * Sets ith "cornerPoints" element
     */
    void setCornerPointsArray(int i, org.isotc211.x2005.gss.GMPointPropertyType cornerPoints);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cornerPoints" element
     */
    org.isotc211.x2005.gss.GMPointPropertyType insertNewCornerPoints(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cornerPoints" element
     */
    org.isotc211.x2005.gss.GMPointPropertyType addNewCornerPoints();
    
    /**
     * Removes the ith "cornerPoints" element
     */
    void removeCornerPoints(int i);
    
    /**
     * Gets the "centerPoint" element
     */
    org.isotc211.x2005.gss.GMPointPropertyType getCenterPoint();
    
    /**
     * True if has "centerPoint" element
     */
    boolean isSetCenterPoint();
    
    /**
     * Sets the "centerPoint" element
     */
    void setCenterPoint(org.isotc211.x2005.gss.GMPointPropertyType centerPoint);
    
    /**
     * Appends and returns a new empty "centerPoint" element
     */
    org.isotc211.x2005.gss.GMPointPropertyType addNewCenterPoint();
    
    /**
     * Unsets the "centerPoint" element
     */
    void unsetCenterPoint();
    
    /**
     * Gets the "pointInPixel" element
     */
    org.isotc211.x2005.gmd.MDPixelOrientationCodePropertyType getPointInPixel();
    
    /**
     * Sets the "pointInPixel" element
     */
    void setPointInPixel(org.isotc211.x2005.gmd.MDPixelOrientationCodePropertyType pointInPixel);
    
    /**
     * Appends and returns a new empty "pointInPixel" element
     */
    org.isotc211.x2005.gmd.MDPixelOrientationCodePropertyType addNewPointInPixel();
    
    /**
     * Gets the "transformationDimensionDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getTransformationDimensionDescription();
    
    /**
     * True if has "transformationDimensionDescription" element
     */
    boolean isSetTransformationDimensionDescription();
    
    /**
     * Sets the "transformationDimensionDescription" element
     */
    void setTransformationDimensionDescription(org.isotc211.x2005.gco.CharacterStringPropertyType transformationDimensionDescription);
    
    /**
     * Appends and returns a new empty "transformationDimensionDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewTransformationDimensionDescription();
    
    /**
     * Unsets the "transformationDimensionDescription" element
     */
    void unsetTransformationDimensionDescription();
    
    /**
     * Gets array of all "transformationDimensionMapping" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getTransformationDimensionMappingArray();
    
    /**
     * Gets ith "transformationDimensionMapping" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getTransformationDimensionMappingArray(int i);
    
    /**
     * Returns number of "transformationDimensionMapping" element
     */
    int sizeOfTransformationDimensionMappingArray();
    
    /**
     * Sets array of all "transformationDimensionMapping" element
     */
    void setTransformationDimensionMappingArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] transformationDimensionMappingArray);
    
    /**
     * Sets ith "transformationDimensionMapping" element
     */
    void setTransformationDimensionMappingArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType transformationDimensionMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "transformationDimensionMapping" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewTransformationDimensionMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "transformationDimensionMapping" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewTransformationDimensionMapping();
    
    /**
     * Removes the ith "transformationDimensionMapping" element
     */
    void removeTransformationDimensionMapping(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDGeorectifiedType newInstance() {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDGeorectifiedType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDGeorectifiedType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
