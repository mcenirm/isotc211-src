/*
 * XML Type:  AbstractDS_Aggregate_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDSAggregateType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML AbstractDS_Aggregate_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface AbstractDSAggregateType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractDSAggregateType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("abstractdsaggregatetype07e5type");
    
    /**
     * Gets array of all "composedOf" elements
     */
    org.isotc211.x2005.gmd.DSDataSetPropertyType[] getComposedOfArray();
    
    /**
     * Gets ith "composedOf" element
     */
    org.isotc211.x2005.gmd.DSDataSetPropertyType getComposedOfArray(int i);
    
    /**
     * Returns number of "composedOf" element
     */
    int sizeOfComposedOfArray();
    
    /**
     * Sets array of all "composedOf" element
     */
    void setComposedOfArray(org.isotc211.x2005.gmd.DSDataSetPropertyType[] composedOfArray);
    
    /**
     * Sets ith "composedOf" element
     */
    void setComposedOfArray(int i, org.isotc211.x2005.gmd.DSDataSetPropertyType composedOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "composedOf" element
     */
    org.isotc211.x2005.gmd.DSDataSetPropertyType insertNewComposedOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "composedOf" element
     */
    org.isotc211.x2005.gmd.DSDataSetPropertyType addNewComposedOf();
    
    /**
     * Removes the ith "composedOf" element
     */
    void removeComposedOf(int i);
    
    /**
     * Gets array of all "seriesMetadata" elements
     */
    org.isotc211.x2005.gmd.MDMetadataPropertyType[] getSeriesMetadataArray();
    
    /**
     * Gets ith "seriesMetadata" element
     */
    org.isotc211.x2005.gmd.MDMetadataPropertyType getSeriesMetadataArray(int i);
    
    /**
     * Returns number of "seriesMetadata" element
     */
    int sizeOfSeriesMetadataArray();
    
    /**
     * Sets array of all "seriesMetadata" element
     */
    void setSeriesMetadataArray(org.isotc211.x2005.gmd.MDMetadataPropertyType[] seriesMetadataArray);
    
    /**
     * Sets ith "seriesMetadata" element
     */
    void setSeriesMetadataArray(int i, org.isotc211.x2005.gmd.MDMetadataPropertyType seriesMetadata);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "seriesMetadata" element
     */
    org.isotc211.x2005.gmd.MDMetadataPropertyType insertNewSeriesMetadata(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "seriesMetadata" element
     */
    org.isotc211.x2005.gmd.MDMetadataPropertyType addNewSeriesMetadata();
    
    /**
     * Removes the ith "seriesMetadata" element
     */
    void removeSeriesMetadata(int i);
    
    /**
     * Gets array of all "subset" elements
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType[] getSubsetArray();
    
    /**
     * Gets ith "subset" element
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType getSubsetArray(int i);
    
    /**
     * Returns number of "subset" element
     */
    int sizeOfSubsetArray();
    
    /**
     * Sets array of all "subset" element
     */
    void setSubsetArray(org.isotc211.x2005.gmd.DSAggregatePropertyType[] subsetArray);
    
    /**
     * Sets ith "subset" element
     */
    void setSubsetArray(int i, org.isotc211.x2005.gmd.DSAggregatePropertyType subset);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subset" element
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType insertNewSubset(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subset" element
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType addNewSubset();
    
    /**
     * Removes the ith "subset" element
     */
    void removeSubset(int i);
    
    /**
     * Gets array of all "superset" elements
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType[] getSupersetArray();
    
    /**
     * Gets ith "superset" element
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType getSupersetArray(int i);
    
    /**
     * Returns number of "superset" element
     */
    int sizeOfSupersetArray();
    
    /**
     * Sets array of all "superset" element
     */
    void setSupersetArray(org.isotc211.x2005.gmd.DSAggregatePropertyType[] supersetArray);
    
    /**
     * Sets ith "superset" element
     */
    void setSupersetArray(int i, org.isotc211.x2005.gmd.DSAggregatePropertyType superset);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "superset" element
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType insertNewSuperset(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "superset" element
     */
    org.isotc211.x2005.gmd.DSAggregatePropertyType addNewSuperset();
    
    /**
     * Removes the ith "superset" element
     */
    void removeSuperset(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType newInstance() {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.AbstractDSAggregateType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.AbstractDSAggregateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
