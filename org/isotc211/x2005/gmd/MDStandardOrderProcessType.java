/*
 * XML Type:  MD_StandardOrderProcess_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDStandardOrderProcessType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_StandardOrderProcess_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDStandardOrderProcessType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDStandardOrderProcessType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdstandardorderprocesstype2a68type");
    
    /**
     * Gets the "fees" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getFees();
    
    /**
     * True if has "fees" element
     */
    boolean isSetFees();
    
    /**
     * Sets the "fees" element
     */
    void setFees(org.isotc211.x2005.gco.CharacterStringPropertyType fees);
    
    /**
     * Appends and returns a new empty "fees" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewFees();
    
    /**
     * Unsets the "fees" element
     */
    void unsetFees();
    
    /**
     * Gets the "plannedAvailableDateTime" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType getPlannedAvailableDateTime();
    
    /**
     * True if has "plannedAvailableDateTime" element
     */
    boolean isSetPlannedAvailableDateTime();
    
    /**
     * Sets the "plannedAvailableDateTime" element
     */
    void setPlannedAvailableDateTime(org.isotc211.x2005.gco.DateTimePropertyType plannedAvailableDateTime);
    
    /**
     * Appends and returns a new empty "plannedAvailableDateTime" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType addNewPlannedAvailableDateTime();
    
    /**
     * Unsets the "plannedAvailableDateTime" element
     */
    void unsetPlannedAvailableDateTime();
    
    /**
     * Gets the "orderingInstructions" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getOrderingInstructions();
    
    /**
     * True if has "orderingInstructions" element
     */
    boolean isSetOrderingInstructions();
    
    /**
     * Sets the "orderingInstructions" element
     */
    void setOrderingInstructions(org.isotc211.x2005.gco.CharacterStringPropertyType orderingInstructions);
    
    /**
     * Appends and returns a new empty "orderingInstructions" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewOrderingInstructions();
    
    /**
     * Unsets the "orderingInstructions" element
     */
    void unsetOrderingInstructions();
    
    /**
     * Gets the "turnaround" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getTurnaround();
    
    /**
     * True if has "turnaround" element
     */
    boolean isSetTurnaround();
    
    /**
     * Sets the "turnaround" element
     */
    void setTurnaround(org.isotc211.x2005.gco.CharacterStringPropertyType turnaround);
    
    /**
     * Appends and returns a new empty "turnaround" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewTurnaround();
    
    /**
     * Unsets the "turnaround" element
     */
    void unsetTurnaround();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType newInstance() {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDStandardOrderProcessType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDStandardOrderProcessType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
