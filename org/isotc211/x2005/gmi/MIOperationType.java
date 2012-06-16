/*
 * XML Type:  MI_Operation_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIOperationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML MI_Operation_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface MIOperationType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MIOperationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mioperationtypeedddtype");
    
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
     * Gets the "citation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getCitation();
    
    /**
     * True if has "citation" element
     */
    boolean isSetCitation();
    
    /**
     * Sets the "citation" element
     */
    void setCitation(org.isotc211.x2005.gmd.CICitationPropertyType citation);
    
    /**
     * Appends and returns a new empty "citation" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewCitation();
    
    /**
     * Unsets the "citation" element
     */
    void unsetCitation();
    
    /**
     * Gets the "identifier" element
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType getIdentifier();
    
    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(org.isotc211.x2005.gmd.MDIdentifierPropertyType identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewIdentifier();
    
    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();
    
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
     * Gets the "type" element
     */
    org.isotc211.x2005.gmi.MIOperationTypeCodePropertyType getType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(org.isotc211.x2005.gmi.MIOperationTypeCodePropertyType type);
    
    /**
     * Appends and returns a new empty "type" element
     */
    org.isotc211.x2005.gmi.MIOperationTypeCodePropertyType addNewType();
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets array of all "objective" elements
     */
    org.isotc211.x2005.gmi.MIObjectivePropertyType[] getObjectiveArray();
    
    /**
     * Gets ith "objective" element
     */
    org.isotc211.x2005.gmi.MIObjectivePropertyType getObjectiveArray(int i);
    
    /**
     * Returns number of "objective" element
     */
    int sizeOfObjectiveArray();
    
    /**
     * Sets array of all "objective" element
     */
    void setObjectiveArray(org.isotc211.x2005.gmi.MIObjectivePropertyType[] objectiveArray);
    
    /**
     * Sets ith "objective" element
     */
    void setObjectiveArray(int i, org.isotc211.x2005.gmi.MIObjectivePropertyType objective);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objective" element
     */
    org.isotc211.x2005.gmi.MIObjectivePropertyType insertNewObjective(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objective" element
     */
    org.isotc211.x2005.gmi.MIObjectivePropertyType addNewObjective();
    
    /**
     * Removes the ith "objective" element
     */
    void removeObjective(int i);
    
    /**
     * Gets the "plan" element
     */
    org.isotc211.x2005.gmi.MIPlanPropertyType getPlan();
    
    /**
     * True if has "plan" element
     */
    boolean isSetPlan();
    
    /**
     * Sets the "plan" element
     */
    void setPlan(org.isotc211.x2005.gmi.MIPlanPropertyType plan);
    
    /**
     * Appends and returns a new empty "plan" element
     */
    org.isotc211.x2005.gmi.MIPlanPropertyType addNewPlan();
    
    /**
     * Unsets the "plan" element
     */
    void unsetPlan();
    
    /**
     * Gets array of all "childOperation" elements
     */
    org.isotc211.x2005.gmi.MIOperationPropertyType[] getChildOperationArray();
    
    /**
     * Gets ith "childOperation" element
     */
    org.isotc211.x2005.gmi.MIOperationPropertyType getChildOperationArray(int i);
    
    /**
     * Returns number of "childOperation" element
     */
    int sizeOfChildOperationArray();
    
    /**
     * Sets array of all "childOperation" element
     */
    void setChildOperationArray(org.isotc211.x2005.gmi.MIOperationPropertyType[] childOperationArray);
    
    /**
     * Sets ith "childOperation" element
     */
    void setChildOperationArray(int i, org.isotc211.x2005.gmi.MIOperationPropertyType childOperation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "childOperation" element
     */
    org.isotc211.x2005.gmi.MIOperationPropertyType insertNewChildOperation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "childOperation" element
     */
    org.isotc211.x2005.gmi.MIOperationPropertyType addNewChildOperation();
    
    /**
     * Removes the ith "childOperation" element
     */
    void removeChildOperation(int i);
    
    /**
     * Gets array of all "significantEvent" elements
     */
    org.isotc211.x2005.gmi.MIEventPropertyType[] getSignificantEventArray();
    
    /**
     * Gets ith "significantEvent" element
     */
    org.isotc211.x2005.gmi.MIEventPropertyType getSignificantEventArray(int i);
    
    /**
     * Returns number of "significantEvent" element
     */
    int sizeOfSignificantEventArray();
    
    /**
     * Sets array of all "significantEvent" element
     */
    void setSignificantEventArray(org.isotc211.x2005.gmi.MIEventPropertyType[] significantEventArray);
    
    /**
     * Sets ith "significantEvent" element
     */
    void setSignificantEventArray(int i, org.isotc211.x2005.gmi.MIEventPropertyType significantEvent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "significantEvent" element
     */
    org.isotc211.x2005.gmi.MIEventPropertyType insertNewSignificantEvent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "significantEvent" element
     */
    org.isotc211.x2005.gmi.MIEventPropertyType addNewSignificantEvent();
    
    /**
     * Removes the ith "significantEvent" element
     */
    void removeSignificantEvent(int i);
    
    /**
     * Gets array of all "platform" elements
     */
    org.isotc211.x2005.gmi.MIPlatformPropertyType[] getPlatformArray();
    
    /**
     * Gets ith "platform" element
     */
    org.isotc211.x2005.gmi.MIPlatformPropertyType getPlatformArray(int i);
    
    /**
     * Returns number of "platform" element
     */
    int sizeOfPlatformArray();
    
    /**
     * Sets array of all "platform" element
     */
    void setPlatformArray(org.isotc211.x2005.gmi.MIPlatformPropertyType[] platformArray);
    
    /**
     * Sets ith "platform" element
     */
    void setPlatformArray(int i, org.isotc211.x2005.gmi.MIPlatformPropertyType platform);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "platform" element
     */
    org.isotc211.x2005.gmi.MIPlatformPropertyType insertNewPlatform(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "platform" element
     */
    org.isotc211.x2005.gmi.MIPlatformPropertyType addNewPlatform();
    
    /**
     * Removes the ith "platform" element
     */
    void removePlatform(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.MIOperationType newInstance() {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.MIOperationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.MIOperationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIOperationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIOperationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIOperationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIOperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
