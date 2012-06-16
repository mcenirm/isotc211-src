/*
 * XML Type:  TopoSolidType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoSolidType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML TopoSolidType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface TopoSolidType extends net.opengis.gml.x32.AbstractTopoPrimitiveType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TopoSolidType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("toposolidtypec22atype");
    
    /**
     * Gets array of all "isolated" elements
     */
    net.opengis.gml.x32.NodeOrEdgePropertyType[] getIsolatedArray();
    
    /**
     * Gets ith "isolated" element
     */
    net.opengis.gml.x32.NodeOrEdgePropertyType getIsolatedArray(int i);
    
    /**
     * Returns number of "isolated" element
     */
    int sizeOfIsolatedArray();
    
    /**
     * Sets array of all "isolated" element
     */
    void setIsolatedArray(net.opengis.gml.x32.NodeOrEdgePropertyType[] isolatedArray);
    
    /**
     * Sets ith "isolated" element
     */
    void setIsolatedArray(int i, net.opengis.gml.x32.NodeOrEdgePropertyType isolated);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "isolated" element
     */
    net.opengis.gml.x32.NodeOrEdgePropertyType insertNewIsolated(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "isolated" element
     */
    net.opengis.gml.x32.NodeOrEdgePropertyType addNewIsolated();
    
    /**
     * Removes the ith "isolated" element
     */
    void removeIsolated(int i);
    
    /**
     * Gets array of all "directedFace" elements
     */
    net.opengis.gml.x32.DirectedFacePropertyType[] getDirectedFaceArray();
    
    /**
     * Gets ith "directedFace" element
     */
    net.opengis.gml.x32.DirectedFacePropertyType getDirectedFaceArray(int i);
    
    /**
     * Returns number of "directedFace" element
     */
    int sizeOfDirectedFaceArray();
    
    /**
     * Sets array of all "directedFace" element
     */
    void setDirectedFaceArray(net.opengis.gml.x32.DirectedFacePropertyType[] directedFaceArray);
    
    /**
     * Sets ith "directedFace" element
     */
    void setDirectedFaceArray(int i, net.opengis.gml.x32.DirectedFacePropertyType directedFace);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedFace" element
     */
    net.opengis.gml.x32.DirectedFacePropertyType insertNewDirectedFace(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedFace" element
     */
    net.opengis.gml.x32.DirectedFacePropertyType addNewDirectedFace();
    
    /**
     * Removes the ith "directedFace" element
     */
    void removeDirectedFace(int i);
    
    /**
     * Gets the "solidProperty" element
     */
    net.opengis.gml.x32.SolidPropertyType getSolidProperty();
    
    /**
     * True if has "solidProperty" element
     */
    boolean isSetSolidProperty();
    
    /**
     * Sets the "solidProperty" element
     */
    void setSolidProperty(net.opengis.gml.x32.SolidPropertyType solidProperty);
    
    /**
     * Appends and returns a new empty "solidProperty" element
     */
    net.opengis.gml.x32.SolidPropertyType addNewSolidProperty();
    
    /**
     * Unsets the "solidProperty" element
     */
    void unsetSolidProperty();
    
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
     * Gets the "universal" attribute
     */
    boolean getUniversal();
    
    /**
     * Gets (as xml) the "universal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUniversal();
    
    /**
     * True if has "universal" attribute
     */
    boolean isSetUniversal();
    
    /**
     * Sets the "universal" attribute
     */
    void setUniversal(boolean universal);
    
    /**
     * Sets (as xml) the "universal" attribute
     */
    void xsetUniversal(org.apache.xmlbeans.XmlBoolean universal);
    
    /**
     * Unsets the "universal" attribute
     */
    void unsetUniversal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.TopoSolidType newInstance() {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.TopoSolidType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.TopoSolidType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.TopoSolidType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.TopoSolidType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.TopoSolidType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.TopoSolidType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.TopoSolidType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
