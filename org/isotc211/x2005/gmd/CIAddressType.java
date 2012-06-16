/*
 * XML Type:  CI_Address_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CIAddressType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML CI_Address_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface CIAddressType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CIAddressType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("ciaddresstype316ftype");
    
    /**
     * Gets array of all "deliveryPoint" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getDeliveryPointArray();
    
    /**
     * Gets ith "deliveryPoint" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getDeliveryPointArray(int i);
    
    /**
     * Returns number of "deliveryPoint" element
     */
    int sizeOfDeliveryPointArray();
    
    /**
     * Sets array of all "deliveryPoint" element
     */
    void setDeliveryPointArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] deliveryPointArray);
    
    /**
     * Sets ith "deliveryPoint" element
     */
    void setDeliveryPointArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType deliveryPoint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryPoint" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewDeliveryPoint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryPoint" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewDeliveryPoint();
    
    /**
     * Removes the ith "deliveryPoint" element
     */
    void removeDeliveryPoint(int i);
    
    /**
     * Gets the "city" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getCity();
    
    /**
     * True if has "city" element
     */
    boolean isSetCity();
    
    /**
     * Sets the "city" element
     */
    void setCity(org.isotc211.x2005.gco.CharacterStringPropertyType city);
    
    /**
     * Appends and returns a new empty "city" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewCity();
    
    /**
     * Unsets the "city" element
     */
    void unsetCity();
    
    /**
     * Gets the "administrativeArea" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getAdministrativeArea();
    
    /**
     * True if has "administrativeArea" element
     */
    boolean isSetAdministrativeArea();
    
    /**
     * Sets the "administrativeArea" element
     */
    void setAdministrativeArea(org.isotc211.x2005.gco.CharacterStringPropertyType administrativeArea);
    
    /**
     * Appends and returns a new empty "administrativeArea" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewAdministrativeArea();
    
    /**
     * Unsets the "administrativeArea" element
     */
    void unsetAdministrativeArea();
    
    /**
     * Gets the "postalCode" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getPostalCode();
    
    /**
     * True if has "postalCode" element
     */
    boolean isSetPostalCode();
    
    /**
     * Sets the "postalCode" element
     */
    void setPostalCode(org.isotc211.x2005.gco.CharacterStringPropertyType postalCode);
    
    /**
     * Appends and returns a new empty "postalCode" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewPostalCode();
    
    /**
     * Unsets the "postalCode" element
     */
    void unsetPostalCode();
    
    /**
     * Gets the "country" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getCountry();
    
    /**
     * True if has "country" element
     */
    boolean isSetCountry();
    
    /**
     * Sets the "country" element
     */
    void setCountry(org.isotc211.x2005.gco.CharacterStringPropertyType country);
    
    /**
     * Appends and returns a new empty "country" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewCountry();
    
    /**
     * Unsets the "country" element
     */
    void unsetCountry();
    
    /**
     * Gets array of all "electronicMailAddress" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getElectronicMailAddressArray();
    
    /**
     * Gets ith "electronicMailAddress" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getElectronicMailAddressArray(int i);
    
    /**
     * Returns number of "electronicMailAddress" element
     */
    int sizeOfElectronicMailAddressArray();
    
    /**
     * Sets array of all "electronicMailAddress" element
     */
    void setElectronicMailAddressArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] electronicMailAddressArray);
    
    /**
     * Sets ith "electronicMailAddress" element
     */
    void setElectronicMailAddressArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType electronicMailAddress);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "electronicMailAddress" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewElectronicMailAddress(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "electronicMailAddress" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewElectronicMailAddress();
    
    /**
     * Removes the ith "electronicMailAddress" element
     */
    void removeElectronicMailAddress(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.CIAddressType newInstance() {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.CIAddressType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.CIAddressType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.CIAddressType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.CIAddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.CIAddressType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.CIAddressType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
