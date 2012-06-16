/*
 * An XML document type.
 * Localname: SecondDefiningParameter
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SecondDefiningParameterDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * A document containing one SecondDefiningParameter(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public interface SecondDefiningParameterDocument2 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondDefiningParameterDocument2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("seconddefiningparametere5e8doctype");
    
    /**
     * Gets the "SecondDefiningParameter" element
     */
    net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter getSecondDefiningParameter();
    
    /**
     * Sets the "SecondDefiningParameter" element
     */
    void setSecondDefiningParameter(net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter secondDefiningParameter);
    
    /**
     * Appends and returns a new empty "SecondDefiningParameter" element
     */
    net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter addNewSecondDefiningParameter();
    
    /**
     * An XML SecondDefiningParameter(@http://www.opengis.net/gml/3.2).
     *
     * This is a complex type.
     */
    public interface SecondDefiningParameter extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecondDefiningParameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("seconddefiningparameterb0ffelemtype");
        
        /**
         * Gets the "inverseFlattening" element
         */
        net.opengis.gml.x32.MeasureType getInverseFlattening();
        
        /**
         * True if has "inverseFlattening" element
         */
        boolean isSetInverseFlattening();
        
        /**
         * Sets the "inverseFlattening" element
         */
        void setInverseFlattening(net.opengis.gml.x32.MeasureType inverseFlattening);
        
        /**
         * Appends and returns a new empty "inverseFlattening" element
         */
        net.opengis.gml.x32.MeasureType addNewInverseFlattening();
        
        /**
         * Unsets the "inverseFlattening" element
         */
        void unsetInverseFlattening();
        
        /**
         * Gets the "semiMinorAxis" element
         */
        net.opengis.gml.x32.LengthType getSemiMinorAxis();
        
        /**
         * True if has "semiMinorAxis" element
         */
        boolean isSetSemiMinorAxis();
        
        /**
         * Sets the "semiMinorAxis" element
         */
        void setSemiMinorAxis(net.opengis.gml.x32.LengthType semiMinorAxis);
        
        /**
         * Appends and returns a new empty "semiMinorAxis" element
         */
        net.opengis.gml.x32.LengthType addNewSemiMinorAxis();
        
        /**
         * Unsets the "semiMinorAxis" element
         */
        void unsetSemiMinorAxis();
        
        /**
         * Gets the "isSphere" element
         */
        boolean getIsSphere();
        
        /**
         * Gets (as xml) the "isSphere" element
         */
        org.apache.xmlbeans.XmlBoolean xgetIsSphere();
        
        /**
         * True if has "isSphere" element
         */
        boolean isSetIsSphere();
        
        /**
         * Sets the "isSphere" element
         */
        void setIsSphere(boolean isSphere);
        
        /**
         * Sets (as xml) the "isSphere" element
         */
        void xsetIsSphere(org.apache.xmlbeans.XmlBoolean isSphere);
        
        /**
         * Unsets the "isSphere" element
         */
        void unsetIsSphere();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter newInstance() {
              return (net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (net.opengis.gml.x32.SecondDefiningParameterDocument2.SecondDefiningParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 newInstance() {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.SecondDefiningParameterDocument2 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.SecondDefiningParameterDocument2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
