/*
 * XML Type:  MI_Requirement_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIRequirementType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML MI_Requirement_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface MIRequirementType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MIRequirementType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mirequirementtype2e39type");
    
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
     * Sets the "identifier" element
     */
    void setIdentifier(org.isotc211.x2005.gmd.MDIdentifierPropertyType identifier);
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewIdentifier();
    
    /**
     * Gets array of all "requestor" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getRequestorArray();
    
    /**
     * Gets ith "requestor" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getRequestorArray(int i);
    
    /**
     * Returns number of "requestor" element
     */
    int sizeOfRequestorArray();
    
    /**
     * Sets array of all "requestor" element
     */
    void setRequestorArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] requestorArray);
    
    /**
     * Sets ith "requestor" element
     */
    void setRequestorArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType requestor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "requestor" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewRequestor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "requestor" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewRequestor();
    
    /**
     * Removes the ith "requestor" element
     */
    void removeRequestor(int i);
    
    /**
     * Gets array of all "recipient" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getRecipientArray();
    
    /**
     * Gets ith "recipient" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getRecipientArray(int i);
    
    /**
     * Returns number of "recipient" element
     */
    int sizeOfRecipientArray();
    
    /**
     * Sets array of all "recipient" element
     */
    void setRecipientArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] recipientArray);
    
    /**
     * Sets ith "recipient" element
     */
    void setRecipientArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType recipient);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recipient" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewRecipient(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recipient" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewRecipient();
    
    /**
     * Removes the ith "recipient" element
     */
    void removeRecipient(int i);
    
    /**
     * Gets the "priority" element
     */
    org.isotc211.x2005.gmi.MIPriorityCodePropertyType getPriority();
    
    /**
     * Sets the "priority" element
     */
    void setPriority(org.isotc211.x2005.gmi.MIPriorityCodePropertyType priority);
    
    /**
     * Appends and returns a new empty "priority" element
     */
    org.isotc211.x2005.gmi.MIPriorityCodePropertyType addNewPriority();
    
    /**
     * Gets the "requestedDate" element
     */
    org.isotc211.x2005.gmi.MIRequestedDatePropertyType getRequestedDate();
    
    /**
     * Sets the "requestedDate" element
     */
    void setRequestedDate(org.isotc211.x2005.gmi.MIRequestedDatePropertyType requestedDate);
    
    /**
     * Appends and returns a new empty "requestedDate" element
     */
    org.isotc211.x2005.gmi.MIRequestedDatePropertyType addNewRequestedDate();
    
    /**
     * Gets the "expiryDate" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType getExpiryDate();
    
    /**
     * Sets the "expiryDate" element
     */
    void setExpiryDate(org.isotc211.x2005.gco.DateTimePropertyType expiryDate);
    
    /**
     * Appends and returns a new empty "expiryDate" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType addNewExpiryDate();
    
    /**
     * Gets array of all "satisifiedPlan" elements
     */
    org.isotc211.x2005.gmi.MIPlanPropertyType[] getSatisifiedPlanArray();
    
    /**
     * Gets ith "satisifiedPlan" element
     */
    org.isotc211.x2005.gmi.MIPlanPropertyType getSatisifiedPlanArray(int i);
    
    /**
     * Returns number of "satisifiedPlan" element
     */
    int sizeOfSatisifiedPlanArray();
    
    /**
     * Sets array of all "satisifiedPlan" element
     */
    void setSatisifiedPlanArray(org.isotc211.x2005.gmi.MIPlanPropertyType[] satisifiedPlanArray);
    
    /**
     * Sets ith "satisifiedPlan" element
     */
    void setSatisifiedPlanArray(int i, org.isotc211.x2005.gmi.MIPlanPropertyType satisifiedPlan);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "satisifiedPlan" element
     */
    org.isotc211.x2005.gmi.MIPlanPropertyType insertNewSatisifiedPlan(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "satisifiedPlan" element
     */
    org.isotc211.x2005.gmi.MIPlanPropertyType addNewSatisifiedPlan();
    
    /**
     * Removes the ith "satisifiedPlan" element
     */
    void removeSatisifiedPlan(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.MIRequirementType newInstance() {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.MIRequirementType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.MIRequirementType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIRequirementType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIRequirementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIRequirementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIRequirementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
