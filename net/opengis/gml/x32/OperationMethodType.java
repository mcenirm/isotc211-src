/*
 * XML Type:  OperationMethodType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.OperationMethodType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML OperationMethodType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface OperationMethodType extends net.opengis.gml.x32.IdentifiedObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationMethodType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("operationmethodtypecff3type");
    
    /**
     * Gets the "formulaCitation" element
     */
    net.opengis.gml.x32.FormulaCitationDocument.FormulaCitation getFormulaCitation();
    
    /**
     * True if has "formulaCitation" element
     */
    boolean isSetFormulaCitation();
    
    /**
     * Sets the "formulaCitation" element
     */
    void setFormulaCitation(net.opengis.gml.x32.FormulaCitationDocument.FormulaCitation formulaCitation);
    
    /**
     * Appends and returns a new empty "formulaCitation" element
     */
    net.opengis.gml.x32.FormulaCitationDocument.FormulaCitation addNewFormulaCitation();
    
    /**
     * Unsets the "formulaCitation" element
     */
    void unsetFormulaCitation();
    
    /**
     * Gets the "formula" element
     */
    net.opengis.gml.x32.CodeType getFormula();
    
    /**
     * True if has "formula" element
     */
    boolean isSetFormula();
    
    /**
     * Sets the "formula" element
     */
    void setFormula(net.opengis.gml.x32.CodeType formula);
    
    /**
     * Appends and returns a new empty "formula" element
     */
    net.opengis.gml.x32.CodeType addNewFormula();
    
    /**
     * Unsets the "formula" element
     */
    void unsetFormula();
    
    /**
     * Gets the "sourceDimensions" element
     */
    java.math.BigInteger getSourceDimensions();
    
    /**
     * Gets (as xml) the "sourceDimensions" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetSourceDimensions();
    
    /**
     * True if has "sourceDimensions" element
     */
    boolean isSetSourceDimensions();
    
    /**
     * Sets the "sourceDimensions" element
     */
    void setSourceDimensions(java.math.BigInteger sourceDimensions);
    
    /**
     * Sets (as xml) the "sourceDimensions" element
     */
    void xsetSourceDimensions(org.apache.xmlbeans.XmlPositiveInteger sourceDimensions);
    
    /**
     * Unsets the "sourceDimensions" element
     */
    void unsetSourceDimensions();
    
    /**
     * Gets the "targetDimensions" element
     */
    java.math.BigInteger getTargetDimensions();
    
    /**
     * Gets (as xml) the "targetDimensions" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetTargetDimensions();
    
    /**
     * True if has "targetDimensions" element
     */
    boolean isSetTargetDimensions();
    
    /**
     * Sets the "targetDimensions" element
     */
    void setTargetDimensions(java.math.BigInteger targetDimensions);
    
    /**
     * Sets (as xml) the "targetDimensions" element
     */
    void xsetTargetDimensions(org.apache.xmlbeans.XmlPositiveInteger targetDimensions);
    
    /**
     * Unsets the "targetDimensions" element
     */
    void unsetTargetDimensions();
    
    /**
     * Gets array of all "parameter" elements
     */
    net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType[] getParameterArray();
    
    /**
     * Gets ith "parameter" element
     */
    net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType getParameterArray(int i);
    
    /**
     * Returns number of "parameter" element
     */
    int sizeOfParameterArray();
    
    /**
     * Sets array of all "parameter" element
     */
    void setParameterArray(net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType[] parameterArray);
    
    /**
     * Sets ith "parameter" element
     */
    void setParameterArray(int i, net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType parameter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType insertNewParameter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    net.opengis.gml.x32.AbstractGeneralOperationParameterPropertyType addNewParameter();
    
    /**
     * Removes the ith "parameter" element
     */
    void removeParameter(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.OperationMethodType newInstance() {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.OperationMethodType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.OperationMethodType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.OperationMethodType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.OperationMethodType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.OperationMethodType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.OperationMethodType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.OperationMethodType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
