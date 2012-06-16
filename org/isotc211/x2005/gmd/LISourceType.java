/*
 * XML Type:  LI_Source_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.LISourceType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML LI_Source_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface LISourceType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LISourceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("lisourcetypeca3ftype");
    
    /**
     * Gets the "description" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewDescription();
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "scaleDenominator" element
     */
    org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType getScaleDenominator();
    
    /**
     * True if has "scaleDenominator" element
     */
    boolean isSetScaleDenominator();
    
    /**
     * Sets the "scaleDenominator" element
     */
    void setScaleDenominator(org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType scaleDenominator);
    
    /**
     * Appends and returns a new empty "scaleDenominator" element
     */
    org.isotc211.x2005.gmd.MDRepresentativeFractionPropertyType addNewScaleDenominator();
    
    /**
     * Unsets the "scaleDenominator" element
     */
    void unsetScaleDenominator();
    
    /**
     * Gets the "sourceReferenceSystem" element
     */
    org.isotc211.x2005.gmd.MDReferenceSystemPropertyType getSourceReferenceSystem();
    
    /**
     * True if has "sourceReferenceSystem" element
     */
    boolean isSetSourceReferenceSystem();
    
    /**
     * Sets the "sourceReferenceSystem" element
     */
    void setSourceReferenceSystem(org.isotc211.x2005.gmd.MDReferenceSystemPropertyType sourceReferenceSystem);
    
    /**
     * Appends and returns a new empty "sourceReferenceSystem" element
     */
    org.isotc211.x2005.gmd.MDReferenceSystemPropertyType addNewSourceReferenceSystem();
    
    /**
     * Unsets the "sourceReferenceSystem" element
     */
    void unsetSourceReferenceSystem();
    
    /**
     * Gets the "sourceCitation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getSourceCitation();
    
    /**
     * True if has "sourceCitation" element
     */
    boolean isSetSourceCitation();
    
    /**
     * Sets the "sourceCitation" element
     */
    void setSourceCitation(org.isotc211.x2005.gmd.CICitationPropertyType sourceCitation);
    
    /**
     * Appends and returns a new empty "sourceCitation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewSourceCitation();
    
    /**
     * Unsets the "sourceCitation" element
     */
    void unsetSourceCitation();
    
    /**
     * Gets array of all "sourceExtent" elements
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType[] getSourceExtentArray();
    
    /**
     * Gets ith "sourceExtent" element
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType getSourceExtentArray(int i);
    
    /**
     * Returns number of "sourceExtent" element
     */
    int sizeOfSourceExtentArray();
    
    /**
     * Sets array of all "sourceExtent" element
     */
    void setSourceExtentArray(org.isotc211.x2005.gmd.EXExtentPropertyType[] sourceExtentArray);
    
    /**
     * Sets ith "sourceExtent" element
     */
    void setSourceExtentArray(int i, org.isotc211.x2005.gmd.EXExtentPropertyType sourceExtent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceExtent" element
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType insertNewSourceExtent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceExtent" element
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType addNewSourceExtent();
    
    /**
     * Removes the ith "sourceExtent" element
     */
    void removeSourceExtent(int i);
    
    /**
     * Gets array of all "sourceStep" elements
     */
    org.isotc211.x2005.gmd.LIProcessStepPropertyType[] getSourceStepArray();
    
    /**
     * Gets ith "sourceStep" element
     */
    org.isotc211.x2005.gmd.LIProcessStepPropertyType getSourceStepArray(int i);
    
    /**
     * Returns number of "sourceStep" element
     */
    int sizeOfSourceStepArray();
    
    /**
     * Sets array of all "sourceStep" element
     */
    void setSourceStepArray(org.isotc211.x2005.gmd.LIProcessStepPropertyType[] sourceStepArray);
    
    /**
     * Sets ith "sourceStep" element
     */
    void setSourceStepArray(int i, org.isotc211.x2005.gmd.LIProcessStepPropertyType sourceStep);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceStep" element
     */
    org.isotc211.x2005.gmd.LIProcessStepPropertyType insertNewSourceStep(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceStep" element
     */
    org.isotc211.x2005.gmd.LIProcessStepPropertyType addNewSourceStep();
    
    /**
     * Removes the ith "sourceStep" element
     */
    void removeSourceStep(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.LISourceType newInstance() {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.LISourceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.LISourceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.LISourceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.LISourceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.LISourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.LISourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.LISourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
