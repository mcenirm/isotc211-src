/*
 * XML Type:  ValueArrayPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ValueArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML ValueArrayPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface ValueArrayPropertyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValueArrayPropertyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("valuearraypropertytype966ctype");
    
    /**
     * Gets array of all "AbstractValue" elements
     */
    org.apache.xmlbeans.XmlObject[] getAbstractValueArray();
    
    /**
     * Gets ith "AbstractValue" element
     */
    org.apache.xmlbeans.XmlObject getAbstractValueArray(int i);
    
    /**
     * Returns number of "AbstractValue" element
     */
    int sizeOfAbstractValueArray();
    
    /**
     * Sets array of all "AbstractValue" element
     */
    void setAbstractValueArray(org.apache.xmlbeans.XmlObject[] abstractValueArray);
    
    /**
     * Sets ith "AbstractValue" element
     */
    void setAbstractValueArray(int i, org.apache.xmlbeans.XmlObject abstractValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractValue" element
     */
    org.apache.xmlbeans.XmlObject insertNewAbstractValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractValue" element
     */
    org.apache.xmlbeans.XmlObject addNewAbstractValue();
    
    /**
     * Removes the ith "AbstractValue" element
     */
    void removeAbstractValue(int i);
    
    /**
     * Gets array of all "AbstractGeometry" elements
     */
    net.opengis.gml.x32.AbstractGeometryType[] getAbstractGeometryArray();
    
    /**
     * Gets ith "AbstractGeometry" element
     */
    net.opengis.gml.x32.AbstractGeometryType getAbstractGeometryArray(int i);
    
    /**
     * Returns number of "AbstractGeometry" element
     */
    int sizeOfAbstractGeometryArray();
    
    /**
     * Sets array of all "AbstractGeometry" element
     */
    void setAbstractGeometryArray(net.opengis.gml.x32.AbstractGeometryType[] abstractGeometryArray);
    
    /**
     * Sets ith "AbstractGeometry" element
     */
    void setAbstractGeometryArray(int i, net.opengis.gml.x32.AbstractGeometryType abstractGeometry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractGeometry" element
     */
    net.opengis.gml.x32.AbstractGeometryType insertNewAbstractGeometry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractGeometry" element
     */
    net.opengis.gml.x32.AbstractGeometryType addNewAbstractGeometry();
    
    /**
     * Removes the ith "AbstractGeometry" element
     */
    void removeAbstractGeometry(int i);
    
    /**
     * Gets array of all "AbstractTimeObject" elements
     */
    net.opengis.gml.x32.AbstractTimeObjectType[] getAbstractTimeObjectArray();
    
    /**
     * Gets ith "AbstractTimeObject" element
     */
    net.opengis.gml.x32.AbstractTimeObjectType getAbstractTimeObjectArray(int i);
    
    /**
     * Returns number of "AbstractTimeObject" element
     */
    int sizeOfAbstractTimeObjectArray();
    
    /**
     * Sets array of all "AbstractTimeObject" element
     */
    void setAbstractTimeObjectArray(net.opengis.gml.x32.AbstractTimeObjectType[] abstractTimeObjectArray);
    
    /**
     * Sets ith "AbstractTimeObject" element
     */
    void setAbstractTimeObjectArray(int i, net.opengis.gml.x32.AbstractTimeObjectType abstractTimeObject);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractTimeObject" element
     */
    net.opengis.gml.x32.AbstractTimeObjectType insertNewAbstractTimeObject(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractTimeObject" element
     */
    net.opengis.gml.x32.AbstractTimeObjectType addNewAbstractTimeObject();
    
    /**
     * Removes the ith "AbstractTimeObject" element
     */
    void removeAbstractTimeObject(int i);
    
    /**
     * Gets array of all "Null" elements
     */
    java.lang.Object[] getNullArray();
    
    /**
     * Gets ith "Null" element
     */
    java.lang.Object getNullArray(int i);
    
    /**
     * Gets (as xml) array of all "Null" elements
     */
    net.opengis.gml.x32.NilReasonType[] xgetNullArray();
    
    /**
     * Gets (as xml) ith "Null" element
     */
    net.opengis.gml.x32.NilReasonType xgetNullArray(int i);
    
    /**
     * Returns number of "Null" element
     */
    int sizeOfNullArray();
    
    /**
     * Sets array of all "Null" element
     */
    void setNullArray(java.lang.Object[] xnullArray);
    
    /**
     * Sets ith "Null" element
     */
    void setNullArray(int i, java.lang.Object xnull);
    
    /**
     * Sets (as xml) array of all "Null" element
     */
    void xsetNullArray(net.opengis.gml.x32.NilReasonType[] xnullArray);
    
    /**
     * Sets (as xml) ith "Null" element
     */
    void xsetNullArray(int i, net.opengis.gml.x32.NilReasonType xnull);
    
    /**
     * Inserts the value as the ith "Null" element
     */
    void insertNull(int i, java.lang.Object xnull);
    
    /**
     * Appends the value as the last "Null" element
     */
    void addNull(java.lang.Object xnull);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Null" element
     */
    net.opengis.gml.x32.NilReasonType insertNewNull(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Null" element
     */
    net.opengis.gml.x32.NilReasonType addNewNull();
    
    /**
     * Removes the ith "Null" element
     */
    void removeNull(int i);
    
    /**
     * Gets the "owns" attribute
     */
    boolean getOwns();
    
    /**
     * Gets (as xml) the "owns" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetOwns();
    
    /**
     * True if has "owns" attribute
     */
    boolean isSetOwns();
    
    /**
     * Sets the "owns" attribute
     */
    void setOwns(boolean owns);
    
    /**
     * Sets (as xml) the "owns" attribute
     */
    void xsetOwns(org.apache.xmlbeans.XmlBoolean owns);
    
    /**
     * Unsets the "owns" attribute
     */
    void unsetOwns();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.ValueArrayPropertyType newInstance() {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.ValueArrayPropertyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.ValueArrayPropertyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
