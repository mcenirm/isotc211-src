/*
 * XML Type:  EdgeType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EdgeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML EdgeType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface EdgeType extends net.opengis.gml.x32.AbstractTopoPrimitiveType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EdgeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("edgetypefa4ctype");
    
    /**
     * Gets the "container" element
     */
    net.opengis.gml.x32.TopoSolidPropertyType getContainer();
    
    /**
     * True if has "container" element
     */
    boolean isSetContainer();
    
    /**
     * Sets the "container" element
     */
    void setContainer(net.opengis.gml.x32.TopoSolidPropertyType container);
    
    /**
     * Appends and returns a new empty "container" element
     */
    net.opengis.gml.x32.TopoSolidPropertyType addNewContainer();
    
    /**
     * Unsets the "container" element
     */
    void unsetContainer();
    
    /**
     * Gets array of all "directedNode" elements
     */
    net.opengis.gml.x32.DirectedNodePropertyType[] getDirectedNodeArray();
    
    /**
     * Gets ith "directedNode" element
     */
    net.opengis.gml.x32.DirectedNodePropertyType getDirectedNodeArray(int i);
    
    /**
     * Returns number of "directedNode" element
     */
    int sizeOfDirectedNodeArray();
    
    /**
     * Sets array of all "directedNode" element
     */
    void setDirectedNodeArray(net.opengis.gml.x32.DirectedNodePropertyType[] directedNodeArray);
    
    /**
     * Sets ith "directedNode" element
     */
    void setDirectedNodeArray(int i, net.opengis.gml.x32.DirectedNodePropertyType directedNode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "directedNode" element
     */
    net.opengis.gml.x32.DirectedNodePropertyType insertNewDirectedNode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "directedNode" element
     */
    net.opengis.gml.x32.DirectedNodePropertyType addNewDirectedNode();
    
    /**
     * Removes the ith "directedNode" element
     */
    void removeDirectedNode(int i);
    
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
     * Gets the "curveProperty" element
     */
    net.opengis.gml.x32.CurvePropertyType getCurveProperty();
    
    /**
     * True if has "curveProperty" element
     */
    boolean isSetCurveProperty();
    
    /**
     * Sets the "curveProperty" element
     */
    void setCurveProperty(net.opengis.gml.x32.CurvePropertyType curveProperty);
    
    /**
     * Appends and returns a new empty "curveProperty" element
     */
    net.opengis.gml.x32.CurvePropertyType addNewCurveProperty();
    
    /**
     * Unsets the "curveProperty" element
     */
    void unsetCurveProperty();
    
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
        public static net.opengis.gml.x32.EdgeType newInstance() {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.EdgeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.EdgeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.EdgeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.EdgeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.EdgeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.EdgeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.EdgeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.EdgeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.EdgeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.EdgeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.EdgeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.EdgeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.EdgeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.EdgeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.EdgeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.EdgeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.EdgeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.EdgeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
