/*
 * XML Type:  TinType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TinType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML TinType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface TinType extends net.opengis.gml.x32.SurfaceType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TinType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("tintypea062type");
    
    /**
     * Gets array of all "stopLines" elements
     */
    net.opengis.gml.x32.LineStringSegmentArrayPropertyType[] getStopLinesArray();
    
    /**
     * Gets ith "stopLines" element
     */
    net.opengis.gml.x32.LineStringSegmentArrayPropertyType getStopLinesArray(int i);
    
    /**
     * Returns number of "stopLines" element
     */
    int sizeOfStopLinesArray();
    
    /**
     * Sets array of all "stopLines" element
     */
    void setStopLinesArray(net.opengis.gml.x32.LineStringSegmentArrayPropertyType[] stopLinesArray);
    
    /**
     * Sets ith "stopLines" element
     */
    void setStopLinesArray(int i, net.opengis.gml.x32.LineStringSegmentArrayPropertyType stopLines);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stopLines" element
     */
    net.opengis.gml.x32.LineStringSegmentArrayPropertyType insertNewStopLines(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stopLines" element
     */
    net.opengis.gml.x32.LineStringSegmentArrayPropertyType addNewStopLines();
    
    /**
     * Removes the ith "stopLines" element
     */
    void removeStopLines(int i);
    
    /**
     * Gets array of all "breakLines" elements
     */
    net.opengis.gml.x32.LineStringSegmentArrayPropertyType[] getBreakLinesArray();
    
    /**
     * Gets ith "breakLines" element
     */
    net.opengis.gml.x32.LineStringSegmentArrayPropertyType getBreakLinesArray(int i);
    
    /**
     * Returns number of "breakLines" element
     */
    int sizeOfBreakLinesArray();
    
    /**
     * Sets array of all "breakLines" element
     */
    void setBreakLinesArray(net.opengis.gml.x32.LineStringSegmentArrayPropertyType[] breakLinesArray);
    
    /**
     * Sets ith "breakLines" element
     */
    void setBreakLinesArray(int i, net.opengis.gml.x32.LineStringSegmentArrayPropertyType breakLines);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "breakLines" element
     */
    net.opengis.gml.x32.LineStringSegmentArrayPropertyType insertNewBreakLines(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "breakLines" element
     */
    net.opengis.gml.x32.LineStringSegmentArrayPropertyType addNewBreakLines();
    
    /**
     * Removes the ith "breakLines" element
     */
    void removeBreakLines(int i);
    
    /**
     * Gets the "maxLength" element
     */
    net.opengis.gml.x32.LengthType getMaxLength();
    
    /**
     * Sets the "maxLength" element
     */
    void setMaxLength(net.opengis.gml.x32.LengthType maxLength);
    
    /**
     * Appends and returns a new empty "maxLength" element
     */
    net.opengis.gml.x32.LengthType addNewMaxLength();
    
    /**
     * Gets the "controlPoint" element
     */
    net.opengis.gml.x32.TinType.ControlPoint getControlPoint();
    
    /**
     * Sets the "controlPoint" element
     */
    void setControlPoint(net.opengis.gml.x32.TinType.ControlPoint controlPoint);
    
    /**
     * Appends and returns a new empty "controlPoint" element
     */
    net.opengis.gml.x32.TinType.ControlPoint addNewControlPoint();
    
    /**
     * An XML controlPoint(@http://www.opengis.net/gml/3.2).
     *
     * This is a complex type.
     */
    public interface ControlPoint extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ControlPoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("controlpoint9e73elemtype");
        
        /**
         * Gets the "posList" element
         */
        net.opengis.gml.x32.DirectPositionListType getPosList();
        
        /**
         * True if has "posList" element
         */
        boolean isSetPosList();
        
        /**
         * Sets the "posList" element
         */
        void setPosList(net.opengis.gml.x32.DirectPositionListType posList);
        
        /**
         * Appends and returns a new empty "posList" element
         */
        net.opengis.gml.x32.DirectPositionListType addNewPosList();
        
        /**
         * Unsets the "posList" element
         */
        void unsetPosList();
        
        /**
         * Gets array of all "pos" elements
         */
        net.opengis.gml.x32.DirectPositionType[] getPosArray();
        
        /**
         * Gets ith "pos" element
         */
        net.opengis.gml.x32.DirectPositionType getPosArray(int i);
        
        /**
         * Returns number of "pos" element
         */
        int sizeOfPosArray();
        
        /**
         * Sets array of all "pos" element
         */
        void setPosArray(net.opengis.gml.x32.DirectPositionType[] posArray);
        
        /**
         * Sets ith "pos" element
         */
        void setPosArray(int i, net.opengis.gml.x32.DirectPositionType pos);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pos" element
         */
        net.opengis.gml.x32.DirectPositionType insertNewPos(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pos" element
         */
        net.opengis.gml.x32.DirectPositionType addNewPos();
        
        /**
         * Removes the ith "pos" element
         */
        void removePos(int i);
        
        /**
         * Gets array of all "pointProperty" elements
         */
        net.opengis.gml.x32.PointPropertyType[] getPointPropertyArray();
        
        /**
         * Gets ith "pointProperty" element
         */
        net.opengis.gml.x32.PointPropertyType getPointPropertyArray(int i);
        
        /**
         * Returns number of "pointProperty" element
         */
        int sizeOfPointPropertyArray();
        
        /**
         * Sets array of all "pointProperty" element
         */
        void setPointPropertyArray(net.opengis.gml.x32.PointPropertyType[] pointPropertyArray);
        
        /**
         * Sets ith "pointProperty" element
         */
        void setPointPropertyArray(int i, net.opengis.gml.x32.PointPropertyType pointProperty);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "pointProperty" element
         */
        net.opengis.gml.x32.PointPropertyType insertNewPointProperty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "pointProperty" element
         */
        net.opengis.gml.x32.PointPropertyType addNewPointProperty();
        
        /**
         * Removes the ith "pointProperty" element
         */
        void removePointProperty(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.opengis.gml.x32.TinType.ControlPoint newInstance() {
              return (net.opengis.gml.x32.TinType.ControlPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.gml.x32.TinType.ControlPoint newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.gml.x32.TinType.ControlPoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.TinType newInstance() {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.TinType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.TinType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.TinType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.TinType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.TinType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.TinType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.TinType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.TinType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.TinType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.TinType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.TinType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.TinType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.TinType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.TinType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.TinType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.TinType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.TinType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.TinType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
