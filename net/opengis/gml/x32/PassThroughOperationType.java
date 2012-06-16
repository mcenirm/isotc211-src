/*
 * XML Type:  PassThroughOperationType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PassThroughOperationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML PassThroughOperationType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface PassThroughOperationType extends net.opengis.gml.x32.AbstractCoordinateOperationType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PassThroughOperationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("passthroughoperationtypec3f6type");
    
    /**
     * Gets array of all "modifiedCoordinate" elements
     */
    java.math.BigInteger[] getModifiedCoordinateArray();
    
    /**
     * Gets ith "modifiedCoordinate" element
     */
    java.math.BigInteger getModifiedCoordinateArray(int i);
    
    /**
     * Gets (as xml) array of all "modifiedCoordinate" elements
     */
    org.apache.xmlbeans.XmlPositiveInteger[] xgetModifiedCoordinateArray();
    
    /**
     * Gets (as xml) ith "modifiedCoordinate" element
     */
    org.apache.xmlbeans.XmlPositiveInteger xgetModifiedCoordinateArray(int i);
    
    /**
     * Returns number of "modifiedCoordinate" element
     */
    int sizeOfModifiedCoordinateArray();
    
    /**
     * Sets array of all "modifiedCoordinate" element
     */
    void setModifiedCoordinateArray(java.math.BigInteger[] modifiedCoordinateArray);
    
    /**
     * Sets ith "modifiedCoordinate" element
     */
    void setModifiedCoordinateArray(int i, java.math.BigInteger modifiedCoordinate);
    
    /**
     * Sets (as xml) array of all "modifiedCoordinate" element
     */
    void xsetModifiedCoordinateArray(org.apache.xmlbeans.XmlPositiveInteger[] modifiedCoordinateArray);
    
    /**
     * Sets (as xml) ith "modifiedCoordinate" element
     */
    void xsetModifiedCoordinateArray(int i, org.apache.xmlbeans.XmlPositiveInteger modifiedCoordinate);
    
    /**
     * Inserts the value as the ith "modifiedCoordinate" element
     */
    void insertModifiedCoordinate(int i, java.math.BigInteger modifiedCoordinate);
    
    /**
     * Appends the value as the last "modifiedCoordinate" element
     */
    void addModifiedCoordinate(java.math.BigInteger modifiedCoordinate);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "modifiedCoordinate" element
     */
    org.apache.xmlbeans.XmlPositiveInteger insertNewModifiedCoordinate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "modifiedCoordinate" element
     */
    org.apache.xmlbeans.XmlPositiveInteger addNewModifiedCoordinate();
    
    /**
     * Removes the ith "modifiedCoordinate" element
     */
    void removeModifiedCoordinate(int i);
    
    /**
     * Gets the "coordOperation" element
     */
    net.opengis.gml.x32.CoordinateOperationPropertyType getCoordOperation();
    
    /**
     * Sets the "coordOperation" element
     */
    void setCoordOperation(net.opengis.gml.x32.CoordinateOperationPropertyType coordOperation);
    
    /**
     * Appends and returns a new empty "coordOperation" element
     */
    net.opengis.gml.x32.CoordinateOperationPropertyType addNewCoordOperation();
    
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
        public static net.opengis.gml.x32.PassThroughOperationType newInstance() {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.PassThroughOperationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.PassThroughOperationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.PassThroughOperationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.PassThroughOperationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.PassThroughOperationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.PassThroughOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
