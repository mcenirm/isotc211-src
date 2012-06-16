/*
 * XML Type:  MD_PixelOrientationCode_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDPixelOrientationCodeType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_PixelOrientationCode_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is an atomic type that is a restriction of org.isotc211.x2005.gmd.MDPixelOrientationCodeType.
 */
public interface MDPixelOrientationCodeType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDPixelOrientationCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdpixelorientationcodetype3d81type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CENTER = Enum.forString("center");
    static final Enum LOWER_LEFT = Enum.forString("lowerLeft");
    static final Enum LOWER_RIGHT = Enum.forString("lowerRight");
    static final Enum UPPER_RIGHT = Enum.forString("upperRight");
    static final Enum UPPER_LEFT = Enum.forString("upperLeft");
    
    static final int INT_CENTER = Enum.INT_CENTER;
    static final int INT_LOWER_LEFT = Enum.INT_LOWER_LEFT;
    static final int INT_LOWER_RIGHT = Enum.INT_LOWER_RIGHT;
    static final int INT_UPPER_RIGHT = Enum.INT_UPPER_RIGHT;
    static final int INT_UPPER_LEFT = Enum.INT_UPPER_LEFT;
    
    /**
     * Enumeration value class for org.isotc211.x2005.gmd.MDPixelOrientationCodeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CENTER
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_CENTER = 1;
        static final int INT_LOWER_LEFT = 2;
        static final int INT_LOWER_RIGHT = 3;
        static final int INT_UPPER_RIGHT = 4;
        static final int INT_UPPER_LEFT = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("center", INT_CENTER),
                new Enum("lowerLeft", INT_LOWER_LEFT),
                new Enum("lowerRight", INT_LOWER_RIGHT),
                new Enum("upperRight", INT_UPPER_RIGHT),
                new Enum("upperLeft", INT_UPPER_LEFT),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType newValue(java.lang.Object obj) {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) type.newValue( obj ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType newInstance() {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDPixelOrientationCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDPixelOrientationCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}