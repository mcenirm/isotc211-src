/*
 * XML Type:  MD_ScopeDescription_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDScopeDescriptionType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_ScopeDescription_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDScopeDescriptionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDScopeDescriptionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdscopedescriptiontype18d2type");
    
    /**
     * Gets array of all "attributes" elements
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType[] getAttributesArray();
    
    /**
     * Gets ith "attributes" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType getAttributesArray(int i);
    
    /**
     * Returns number of "attributes" element
     */
    int sizeOfAttributesArray();
    
    /**
     * Sets array of all "attributes" element
     */
    void setAttributesArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] attributesArray);
    
    /**
     * Sets ith "attributes" element
     */
    void setAttributesArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType attributes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributes" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewAttributes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attributes" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType addNewAttributes();
    
    /**
     * Removes the ith "attributes" element
     */
    void removeAttributes(int i);
    
    /**
     * Gets array of all "features" elements
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType[] getFeaturesArray();
    
    /**
     * Gets ith "features" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType getFeaturesArray(int i);
    
    /**
     * Returns number of "features" element
     */
    int sizeOfFeaturesArray();
    
    /**
     * Sets array of all "features" element
     */
    void setFeaturesArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] featuresArray);
    
    /**
     * Sets ith "features" element
     */
    void setFeaturesArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType features);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "features" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewFeatures(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "features" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType addNewFeatures();
    
    /**
     * Removes the ith "features" element
     */
    void removeFeatures(int i);
    
    /**
     * Gets array of all "featureInstances" elements
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType[] getFeatureInstancesArray();
    
    /**
     * Gets ith "featureInstances" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType getFeatureInstancesArray(int i);
    
    /**
     * Returns number of "featureInstances" element
     */
    int sizeOfFeatureInstancesArray();
    
    /**
     * Sets array of all "featureInstances" element
     */
    void setFeatureInstancesArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] featureInstancesArray);
    
    /**
     * Sets ith "featureInstances" element
     */
    void setFeatureInstancesArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType featureInstances);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "featureInstances" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewFeatureInstances(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "featureInstances" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType addNewFeatureInstances();
    
    /**
     * Removes the ith "featureInstances" element
     */
    void removeFeatureInstances(int i);
    
    /**
     * Gets array of all "attributeInstances" elements
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType[] getAttributeInstancesArray();
    
    /**
     * Gets ith "attributeInstances" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType getAttributeInstancesArray(int i);
    
    /**
     * Returns number of "attributeInstances" element
     */
    int sizeOfAttributeInstancesArray();
    
    /**
     * Sets array of all "attributeInstances" element
     */
    void setAttributeInstancesArray(org.isotc211.x2005.gco.ObjectReferencePropertyType[] attributeInstancesArray);
    
    /**
     * Sets ith "attributeInstances" element
     */
    void setAttributeInstancesArray(int i, org.isotc211.x2005.gco.ObjectReferencePropertyType attributeInstances);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attributeInstances" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType insertNewAttributeInstances(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attributeInstances" element
     */
    org.isotc211.x2005.gco.ObjectReferencePropertyType addNewAttributeInstances();
    
    /**
     * Removes the ith "attributeInstances" element
     */
    void removeAttributeInstances(int i);
    
    /**
     * Gets the "dataset" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getDataset();
    
    /**
     * True if has "dataset" element
     */
    boolean isSetDataset();
    
    /**
     * Sets the "dataset" element
     */
    void setDataset(org.isotc211.x2005.gco.CharacterStringPropertyType dataset);
    
    /**
     * Appends and returns a new empty "dataset" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewDataset();
    
    /**
     * Unsets the "dataset" element
     */
    void unsetDataset();
    
    /**
     * Gets the "other" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getOther();
    
    /**
     * True if has "other" element
     */
    boolean isSetOther();
    
    /**
     * Sets the "other" element
     */
    void setOther(org.isotc211.x2005.gco.CharacterStringPropertyType other);
    
    /**
     * Appends and returns a new empty "other" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewOther();
    
    /**
     * Unsets the "other" element
     */
    void unsetOther();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType newInstance() {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDScopeDescriptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDScopeDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
