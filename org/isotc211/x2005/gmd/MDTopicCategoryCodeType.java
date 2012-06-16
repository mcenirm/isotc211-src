/*
 * XML Type:  MD_TopicCategoryCode_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDTopicCategoryCodeType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_TopicCategoryCode_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is an atomic type that is a restriction of org.isotc211.x2005.gmd.MDTopicCategoryCodeType.
 */
public interface MDTopicCategoryCodeType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDTopicCategoryCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdtopiccategorycodetype7a06type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum FARMING = Enum.forString("farming");
    static final Enum BIOTA = Enum.forString("biota");
    static final Enum BOUNDARIES = Enum.forString("boundaries");
    static final Enum CLIMATOLOGY_METEOROLOGY_ATMOSPHERE = Enum.forString("climatologyMeteorologyAtmosphere");
    static final Enum ECONOMY = Enum.forString("economy");
    static final Enum ELEVATION = Enum.forString("elevation");
    static final Enum ENVIRONMENT = Enum.forString("environment");
    static final Enum GEOSCIENTIFIC_INFORMATION = Enum.forString("geoscientificInformation");
    static final Enum HEALTH = Enum.forString("health");
    static final Enum IMAGERY_BASE_MAPS_EARTH_COVER = Enum.forString("imageryBaseMapsEarthCover");
    static final Enum INTELLIGENCE_MILITARY = Enum.forString("intelligenceMilitary");
    static final Enum INLAND_WATERS = Enum.forString("inlandWaters");
    static final Enum LOCATION = Enum.forString("location");
    static final Enum OCEANS = Enum.forString("oceans");
    static final Enum PLANNING_CADASTRE = Enum.forString("planningCadastre");
    static final Enum SOCIETY = Enum.forString("society");
    static final Enum STRUCTURE = Enum.forString("structure");
    static final Enum TRANSPORTATION = Enum.forString("transportation");
    static final Enum UTILITIES_COMMUNICATION = Enum.forString("utilitiesCommunication");
    
    static final int INT_FARMING = Enum.INT_FARMING;
    static final int INT_BIOTA = Enum.INT_BIOTA;
    static final int INT_BOUNDARIES = Enum.INT_BOUNDARIES;
    static final int INT_CLIMATOLOGY_METEOROLOGY_ATMOSPHERE = Enum.INT_CLIMATOLOGY_METEOROLOGY_ATMOSPHERE;
    static final int INT_ECONOMY = Enum.INT_ECONOMY;
    static final int INT_ELEVATION = Enum.INT_ELEVATION;
    static final int INT_ENVIRONMENT = Enum.INT_ENVIRONMENT;
    static final int INT_GEOSCIENTIFIC_INFORMATION = Enum.INT_GEOSCIENTIFIC_INFORMATION;
    static final int INT_HEALTH = Enum.INT_HEALTH;
    static final int INT_IMAGERY_BASE_MAPS_EARTH_COVER = Enum.INT_IMAGERY_BASE_MAPS_EARTH_COVER;
    static final int INT_INTELLIGENCE_MILITARY = Enum.INT_INTELLIGENCE_MILITARY;
    static final int INT_INLAND_WATERS = Enum.INT_INLAND_WATERS;
    static final int INT_LOCATION = Enum.INT_LOCATION;
    static final int INT_OCEANS = Enum.INT_OCEANS;
    static final int INT_PLANNING_CADASTRE = Enum.INT_PLANNING_CADASTRE;
    static final int INT_SOCIETY = Enum.INT_SOCIETY;
    static final int INT_STRUCTURE = Enum.INT_STRUCTURE;
    static final int INT_TRANSPORTATION = Enum.INT_TRANSPORTATION;
    static final int INT_UTILITIES_COMMUNICATION = Enum.INT_UTILITIES_COMMUNICATION;
    
    /**
     * Enumeration value class for org.isotc211.x2005.gmd.MDTopicCategoryCodeType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_FARMING
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
        
        static final int INT_FARMING = 1;
        static final int INT_BIOTA = 2;
        static final int INT_BOUNDARIES = 3;
        static final int INT_CLIMATOLOGY_METEOROLOGY_ATMOSPHERE = 4;
        static final int INT_ECONOMY = 5;
        static final int INT_ELEVATION = 6;
        static final int INT_ENVIRONMENT = 7;
        static final int INT_GEOSCIENTIFIC_INFORMATION = 8;
        static final int INT_HEALTH = 9;
        static final int INT_IMAGERY_BASE_MAPS_EARTH_COVER = 10;
        static final int INT_INTELLIGENCE_MILITARY = 11;
        static final int INT_INLAND_WATERS = 12;
        static final int INT_LOCATION = 13;
        static final int INT_OCEANS = 14;
        static final int INT_PLANNING_CADASTRE = 15;
        static final int INT_SOCIETY = 16;
        static final int INT_STRUCTURE = 17;
        static final int INT_TRANSPORTATION = 18;
        static final int INT_UTILITIES_COMMUNICATION = 19;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("farming", INT_FARMING),
                new Enum("biota", INT_BIOTA),
                new Enum("boundaries", INT_BOUNDARIES),
                new Enum("climatologyMeteorologyAtmosphere", INT_CLIMATOLOGY_METEOROLOGY_ATMOSPHERE),
                new Enum("economy", INT_ECONOMY),
                new Enum("elevation", INT_ELEVATION),
                new Enum("environment", INT_ENVIRONMENT),
                new Enum("geoscientificInformation", INT_GEOSCIENTIFIC_INFORMATION),
                new Enum("health", INT_HEALTH),
                new Enum("imageryBaseMapsEarthCover", INT_IMAGERY_BASE_MAPS_EARTH_COVER),
                new Enum("intelligenceMilitary", INT_INTELLIGENCE_MILITARY),
                new Enum("inlandWaters", INT_INLAND_WATERS),
                new Enum("location", INT_LOCATION),
                new Enum("oceans", INT_OCEANS),
                new Enum("planningCadastre", INT_PLANNING_CADASTRE),
                new Enum("society", INT_SOCIETY),
                new Enum("structure", INT_STRUCTURE),
                new Enum("transportation", INT_TRANSPORTATION),
                new Enum("utilitiesCommunication", INT_UTILITIES_COMMUNICATION),
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
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType newValue(java.lang.Object obj) {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) type.newValue( obj ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType newInstance() {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDTopicCategoryCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDTopicCategoryCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
