/*
 * XML Type:  EX_Extent_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.EXExtentType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML EX_Extent_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface EXExtentType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EXExtentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("exextenttype9e98type");
    
    /**
     * Gets the "description" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(org.isotc211.x2005.gco.CharacterStringPropertyType description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewDescription();
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets array of all "geographicElement" elements
     */
    org.isotc211.x2005.gmd.EXGeographicExtentPropertyType[] getGeographicElementArray();
    
    /**
     * Gets ith "geographicElement" element
     */
    org.isotc211.x2005.gmd.EXGeographicExtentPropertyType getGeographicElementArray(int i);
    
    /**
     * Returns number of "geographicElement" element
     */
    int sizeOfGeographicElementArray();
    
    /**
     * Sets array of all "geographicElement" element
     */
    void setGeographicElementArray(org.isotc211.x2005.gmd.EXGeographicExtentPropertyType[] geographicElementArray);
    
    /**
     * Sets ith "geographicElement" element
     */
    void setGeographicElementArray(int i, org.isotc211.x2005.gmd.EXGeographicExtentPropertyType geographicElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geographicElement" element
     */
    org.isotc211.x2005.gmd.EXGeographicExtentPropertyType insertNewGeographicElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geographicElement" element
     */
    org.isotc211.x2005.gmd.EXGeographicExtentPropertyType addNewGeographicElement();
    
    /**
     * Removes the ith "geographicElement" element
     */
    void removeGeographicElement(int i);
    
    /**
     * Gets array of all "temporalElement" elements
     */
    org.isotc211.x2005.gmd.EXTemporalExtentPropertyType[] getTemporalElementArray();
    
    /**
     * Gets ith "temporalElement" element
     */
    org.isotc211.x2005.gmd.EXTemporalExtentPropertyType getTemporalElementArray(int i);
    
    /**
     * Returns number of "temporalElement" element
     */
    int sizeOfTemporalElementArray();
    
    /**
     * Sets array of all "temporalElement" element
     */
    void setTemporalElementArray(org.isotc211.x2005.gmd.EXTemporalExtentPropertyType[] temporalElementArray);
    
    /**
     * Sets ith "temporalElement" element
     */
    void setTemporalElementArray(int i, org.isotc211.x2005.gmd.EXTemporalExtentPropertyType temporalElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "temporalElement" element
     */
    org.isotc211.x2005.gmd.EXTemporalExtentPropertyType insertNewTemporalElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "temporalElement" element
     */
    org.isotc211.x2005.gmd.EXTemporalExtentPropertyType addNewTemporalElement();
    
    /**
     * Removes the ith "temporalElement" element
     */
    void removeTemporalElement(int i);
    
    /**
     * Gets array of all "verticalElement" elements
     */
    org.isotc211.x2005.gmd.EXVerticalExtentPropertyType[] getVerticalElementArray();
    
    /**
     * Gets ith "verticalElement" element
     */
    org.isotc211.x2005.gmd.EXVerticalExtentPropertyType getVerticalElementArray(int i);
    
    /**
     * Returns number of "verticalElement" element
     */
    int sizeOfVerticalElementArray();
    
    /**
     * Sets array of all "verticalElement" element
     */
    void setVerticalElementArray(org.isotc211.x2005.gmd.EXVerticalExtentPropertyType[] verticalElementArray);
    
    /**
     * Sets ith "verticalElement" element
     */
    void setVerticalElementArray(int i, org.isotc211.x2005.gmd.EXVerticalExtentPropertyType verticalElement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "verticalElement" element
     */
    org.isotc211.x2005.gmd.EXVerticalExtentPropertyType insertNewVerticalElement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "verticalElement" element
     */
    org.isotc211.x2005.gmd.EXVerticalExtentPropertyType addNewVerticalElement();
    
    /**
     * Removes the ith "verticalElement" element
     */
    void removeVerticalElement(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.EXExtentType newInstance() {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.EXExtentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.EXExtentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.EXExtentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.EXExtentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.EXExtentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.EXExtentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
