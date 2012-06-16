/*
 * XML Type:  MI_Plan_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIPlanType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML MI_Plan_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface MIPlanType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MIPlanType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("miplantypea793type");
    
    /**
     * Gets the "type" element
     */
    org.isotc211.x2005.gmi.MIGeometryTypeCodePropertyType getType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.isotc211.x2005.gmi.MIGeometryTypeCodePropertyType type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.isotc211.x2005.gmi.MIGeometryTypeCodePropertyType addNewType();
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets the "status" element
     */
    org.isotc211.x2005.gmd.MDProgressCodePropertyType getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.isotc211.x2005.gmd.MDProgressCodePropertyType status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.isotc211.x2005.gmd.MDProgressCodePropertyType addNewStatus();
    
    /**
     * Gets the "citation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getCitation();
    
    /**
     * Sets the "citation" element
     */
    void setCitation(org.isotc211.x2005.gmd.CICitationPropertyType citation);
    
    /**
     * Appends and returns a new empty "citation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewCitation();
    
    /**
     * Gets array of all "satisfiedRequirement" elements
     */
    org.isotc211.x2005.gmi.MIRequirementPropertyType[] getSatisfiedRequirementArray();
    
    /**
     * Gets ith "satisfiedRequirement" element
     */
    org.isotc211.x2005.gmi.MIRequirementPropertyType getSatisfiedRequirementArray(int i);
    
    /**
     * Returns number of "satisfiedRequirement" element
     */
    int sizeOfSatisfiedRequirementArray();
    
    /**
     * Sets array of all "satisfiedRequirement" element
     */
    void setSatisfiedRequirementArray(org.isotc211.x2005.gmi.MIRequirementPropertyType[] satisfiedRequirementArray);
    
    /**
     * Sets ith "satisfiedRequirement" element
     */
    void setSatisfiedRequirementArray(int i, org.isotc211.x2005.gmi.MIRequirementPropertyType satisfiedRequirement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "satisfiedRequirement" element
     */
    org.isotc211.x2005.gmi.MIRequirementPropertyType insertNewSatisfiedRequirement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "satisfiedRequirement" element
     */
    org.isotc211.x2005.gmi.MIRequirementPropertyType addNewSatisfiedRequirement();
    
    /**
     * Removes the ith "satisfiedRequirement" element
     */
    void removeSatisfiedRequirement(int i);
    
    /**
     * Gets array of all "operation" elements
     */
    org.isotc211.x2005.gmi.MIOperationPropertyType[] getOperationArray();
    
    /**
     * Gets ith "operation" element
     */
    org.isotc211.x2005.gmi.MIOperationPropertyType getOperationArray(int i);
    
    /**
     * Returns number of "operation" element
     */
    int sizeOfOperationArray();
    
    /**
     * Sets array of all "operation" element
     */
    void setOperationArray(org.isotc211.x2005.gmi.MIOperationPropertyType[] operationArray);
    
    /**
     * Sets ith "operation" element
     */
    void setOperationArray(int i, org.isotc211.x2005.gmi.MIOperationPropertyType operation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    org.isotc211.x2005.gmi.MIOperationPropertyType insertNewOperation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    org.isotc211.x2005.gmi.MIOperationPropertyType addNewOperation();
    
    /**
     * Removes the ith "operation" element
     */
    void removeOperation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.MIPlanType newInstance() {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.MIPlanType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.MIPlanType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIPlanType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIPlanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIPlanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIPlanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
