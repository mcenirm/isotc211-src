/*
 * XML Type:  MD_Medium_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMediumType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_Medium_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDMediumType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDMediumType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdmediumtype003ftype");
    
    /**
     * Gets the "name" element
     */
    org.isotc211.x2005.gmd.MDMediumNameCodePropertyType getName();
    
    /**
     * True if has "name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.isotc211.x2005.gmd.MDMediumNameCodePropertyType name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.isotc211.x2005.gmd.MDMediumNameCodePropertyType addNewName();
    
    /**
     * Unsets the "name" element
     */
    void unsetName();
    
    /**
     * Gets array of all "density" elements
     */
    org.isotc211.x2005.gco.RealPropertyType[] getDensityArray();
    
    /**
     * Gets ith "density" element
     */
    org.isotc211.x2005.gco.RealPropertyType getDensityArray(int i);
    
    /**
     * Returns number of "density" element
     */
    int sizeOfDensityArray();
    
    /**
     * Sets array of all "density" element
     */
    void setDensityArray(org.isotc211.x2005.gco.RealPropertyType[] densityArray);
    
    /**
     * Sets ith "density" element
     */
    void setDensityArray(int i, org.isotc211.x2005.gco.RealPropertyType density);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "density" element
     */
    org.isotc211.x2005.gco.RealPropertyType insertNewDensity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "density" element
     */
    org.isotc211.x2005.gco.RealPropertyType addNewDensity();
    
    /**
     * Removes the ith "density" element
     */
    void removeDensity(int i);
    
    /**
     * Gets the "densityUnits" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getDensityUnits();
    
    /**
     * True if has "densityUnits" element
     */
    boolean isSetDensityUnits();
    
    /**
     * Sets the "densityUnits" element
     */
    void setDensityUnits(org.isotc211.x2005.gco.CharacterStringPropertyType densityUnits);
    
    /**
     * Appends and returns a new empty "densityUnits" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewDensityUnits();
    
    /**
     * Unsets the "densityUnits" element
     */
    void unsetDensityUnits();
    
    /**
     * Gets the "volumes" element
     */
    org.isotc211.x2005.gco.IntegerPropertyType getVolumes();
    
    /**
     * True if has "volumes" element
     */
    boolean isSetVolumes();
    
    /**
     * Sets the "volumes" element
     */
    void setVolumes(org.isotc211.x2005.gco.IntegerPropertyType volumes);
    
    /**
     * Appends and returns a new empty "volumes" element
     */
    org.isotc211.x2005.gco.IntegerPropertyType addNewVolumes();
    
    /**
     * Unsets the "volumes" element
     */
    void unsetVolumes();
    
    /**
     * Gets array of all "mediumFormat" elements
     */
    org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType[] getMediumFormatArray();
    
    /**
     * Gets ith "mediumFormat" element
     */
    org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType getMediumFormatArray(int i);
    
    /**
     * Returns number of "mediumFormat" element
     */
    int sizeOfMediumFormatArray();
    
    /**
     * Sets array of all "mediumFormat" element
     */
    void setMediumFormatArray(org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType[] mediumFormatArray);
    
    /**
     * Sets ith "mediumFormat" element
     */
    void setMediumFormatArray(int i, org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType mediumFormat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mediumFormat" element
     */
    org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType insertNewMediumFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mediumFormat" element
     */
    org.isotc211.x2005.gmd.MDMediumFormatCodePropertyType addNewMediumFormat();
    
    /**
     * Removes the ith "mediumFormat" element
     */
    void removeMediumFormat(int i);
    
    /**
     * Gets the "mediumNote" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getMediumNote();
    
    /**
     * True if has "mediumNote" element
     */
    boolean isSetMediumNote();
    
    /**
     * Sets the "mediumNote" element
     */
    void setMediumNote(org.isotc211.x2005.gco.CharacterStringPropertyType mediumNote);
    
    /**
     * Appends and returns a new empty "mediumNote" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewMediumNote();
    
    /**
     * Unsets the "mediumNote" element
     */
    void unsetMediumNote();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDMediumType newInstance() {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDMediumType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDMediumType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMediumType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDMediumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDMediumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDMediumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
