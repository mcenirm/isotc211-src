/*
 * XML Type:  TimeOrdinalEraType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeOrdinalEraType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML TimeOrdinalEraType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface TimeOrdinalEraType extends net.opengis.gml.x32.DefinitionType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimeOrdinalEraType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("timeordinaleratype8e99type");
    
    /**
     * Gets array of all "relatedTime" elements
     */
    net.opengis.gml.x32.RelatedTimeType[] getRelatedTimeArray();
    
    /**
     * Gets ith "relatedTime" element
     */
    net.opengis.gml.x32.RelatedTimeType getRelatedTimeArray(int i);
    
    /**
     * Returns number of "relatedTime" element
     */
    int sizeOfRelatedTimeArray();
    
    /**
     * Sets array of all "relatedTime" element
     */
    void setRelatedTimeArray(net.opengis.gml.x32.RelatedTimeType[] relatedTimeArray);
    
    /**
     * Sets ith "relatedTime" element
     */
    void setRelatedTimeArray(int i, net.opengis.gml.x32.RelatedTimeType relatedTime);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedTime" element
     */
    net.opengis.gml.x32.RelatedTimeType insertNewRelatedTime(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedTime" element
     */
    net.opengis.gml.x32.RelatedTimeType addNewRelatedTime();
    
    /**
     * Removes the ith "relatedTime" element
     */
    void removeRelatedTime(int i);
    
    /**
     * Gets the "start" element
     */
    net.opengis.gml.x32.TimeNodePropertyType getStart();
    
    /**
     * True if has "start" element
     */
    boolean isSetStart();
    
    /**
     * Sets the "start" element
     */
    void setStart(net.opengis.gml.x32.TimeNodePropertyType start);
    
    /**
     * Appends and returns a new empty "start" element
     */
    net.opengis.gml.x32.TimeNodePropertyType addNewStart();
    
    /**
     * Unsets the "start" element
     */
    void unsetStart();
    
    /**
     * Gets the "end" element
     */
    net.opengis.gml.x32.TimeNodePropertyType getEnd();
    
    /**
     * True if has "end" element
     */
    boolean isSetEnd();
    
    /**
     * Sets the "end" element
     */
    void setEnd(net.opengis.gml.x32.TimeNodePropertyType end);
    
    /**
     * Appends and returns a new empty "end" element
     */
    net.opengis.gml.x32.TimeNodePropertyType addNewEnd();
    
    /**
     * Unsets the "end" element
     */
    void unsetEnd();
    
    /**
     * Gets the "extent" element
     */
    net.opengis.gml.x32.TimePeriodPropertyType getExtent();
    
    /**
     * True if has "extent" element
     */
    boolean isSetExtent();
    
    /**
     * Sets the "extent" element
     */
    void setExtent(net.opengis.gml.x32.TimePeriodPropertyType extent);
    
    /**
     * Appends and returns a new empty "extent" element
     */
    net.opengis.gml.x32.TimePeriodPropertyType addNewExtent();
    
    /**
     * Unsets the "extent" element
     */
    void unsetExtent();
    
    /**
     * Gets array of all "member" elements
     */
    net.opengis.gml.x32.TimeOrdinalEraPropertyType[] getMemberArray();
    
    /**
     * Gets ith "member" element
     */
    net.opengis.gml.x32.TimeOrdinalEraPropertyType getMemberArray(int i);
    
    /**
     * Returns number of "member" element
     */
    int sizeOfMemberArray();
    
    /**
     * Sets array of all "member" element
     */
    void setMemberArray(net.opengis.gml.x32.TimeOrdinalEraPropertyType[] memberArray);
    
    /**
     * Sets ith "member" element
     */
    void setMemberArray(int i, net.opengis.gml.x32.TimeOrdinalEraPropertyType member);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "member" element
     */
    net.opengis.gml.x32.TimeOrdinalEraPropertyType insertNewMember(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "member" element
     */
    net.opengis.gml.x32.TimeOrdinalEraPropertyType addNewMember();
    
    /**
     * Removes the ith "member" element
     */
    void removeMember(int i);
    
    /**
     * Gets the "group" element
     */
    net.opengis.gml.x32.ReferenceType getGroup();
    
    /**
     * True if has "group" element
     */
    boolean isSetGroup();
    
    /**
     * Sets the "group" element
     */
    void setGroup(net.opengis.gml.x32.ReferenceType group);
    
    /**
     * Appends and returns a new empty "group" element
     */
    net.opengis.gml.x32.ReferenceType addNewGroup();
    
    /**
     * Unsets the "group" element
     */
    void unsetGroup();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.TimeOrdinalEraType newInstance() {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.TimeOrdinalEraType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.TimeOrdinalEraType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
