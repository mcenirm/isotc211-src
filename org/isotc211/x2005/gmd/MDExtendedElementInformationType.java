/*
 * XML Type:  MD_ExtendedElementInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDExtendedElementInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_ExtendedElementInformation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDExtendedElementInformationType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDExtendedElementInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdextendedelementinformationtype49f3type");
    
    /**
     * Gets the "name" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getName();
    
    /**
     * Sets the "name" element
     */
    void setName(org.isotc211.x2005.gco.CharacterStringPropertyType name);
    
    /**
     * Appends and returns a new empty "name" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewName();
    
    /**
     * Gets the "shortName" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getShortName();
    
    /**
     * True if has "shortName" element
     */
    boolean isSetShortName();
    
    /**
     * Sets the "shortName" element
     */
    void setShortName(org.isotc211.x2005.gco.CharacterStringPropertyType shortName);
    
    /**
     * Appends and returns a new empty "shortName" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewShortName();
    
    /**
     * Unsets the "shortName" element
     */
    void unsetShortName();
    
    /**
     * Gets the "domainCode" element
     */
    org.isotc211.x2005.gco.IntegerPropertyType getDomainCode();
    
    /**
     * True if has "domainCode" element
     */
    boolean isSetDomainCode();
    
    /**
     * Sets the "domainCode" element
     */
    void setDomainCode(org.isotc211.x2005.gco.IntegerPropertyType domainCode);
    
    /**
     * Appends and returns a new empty "domainCode" element
     */
    org.isotc211.x2005.gco.IntegerPropertyType addNewDomainCode();
    
    /**
     * Unsets the "domainCode" element
     */
    void unsetDomainCode();
    
    /**
     * Gets the "definition" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getDefinition();
    
    /**
     * Sets the "definition" element
     */
    void setDefinition(org.isotc211.x2005.gco.CharacterStringPropertyType definition);
    
    /**
     * Appends and returns a new empty "definition" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewDefinition();
    
    /**
     * Gets the "obligation" element
     */
    org.isotc211.x2005.gmd.MDObligationCodePropertyType getObligation();
    
    /**
     * True if has "obligation" element
     */
    boolean isSetObligation();
    
    /**
     * Sets the "obligation" element
     */
    void setObligation(org.isotc211.x2005.gmd.MDObligationCodePropertyType obligation);
    
    /**
     * Appends and returns a new empty "obligation" element
     */
    org.isotc211.x2005.gmd.MDObligationCodePropertyType addNewObligation();
    
    /**
     * Unsets the "obligation" element
     */
    void unsetObligation();
    
    /**
     * Gets the "condition" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getCondition();
    
    /**
     * True if has "condition" element
     */
    boolean isSetCondition();
    
    /**
     * Sets the "condition" element
     */
    void setCondition(org.isotc211.x2005.gco.CharacterStringPropertyType condition);
    
    /**
     * Appends and returns a new empty "condition" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewCondition();
    
    /**
     * Unsets the "condition" element
     */
    void unsetCondition();
    
    /**
     * Gets the "dataType" element
     */
    org.isotc211.x2005.gmd.MDDatatypeCodePropertyType getDataType();
    
    /**
     * Sets the "dataType" element
     */
    void setDataType(org.isotc211.x2005.gmd.MDDatatypeCodePropertyType dataType);
    
    /**
     * Appends and returns a new empty "dataType" element
     */
    org.isotc211.x2005.gmd.MDDatatypeCodePropertyType addNewDataType();
    
    /**
     * Gets the "maximumOccurrence" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getMaximumOccurrence();
    
    /**
     * True if has "maximumOccurrence" element
     */
    boolean isSetMaximumOccurrence();
    
    /**
     * Sets the "maximumOccurrence" element
     */
    void setMaximumOccurrence(org.isotc211.x2005.gco.CharacterStringPropertyType maximumOccurrence);
    
    /**
     * Appends and returns a new empty "maximumOccurrence" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewMaximumOccurrence();
    
    /**
     * Unsets the "maximumOccurrence" element
     */
    void unsetMaximumOccurrence();
    
    /**
     * Gets the "domainValue" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getDomainValue();
    
    /**
     * True if has "domainValue" element
     */
    boolean isSetDomainValue();
    
    /**
     * Sets the "domainValue" element
     */
    void setDomainValue(org.isotc211.x2005.gco.CharacterStringPropertyType domainValue);
    
    /**
     * Appends and returns a new empty "domainValue" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewDomainValue();
    
    /**
     * Unsets the "domainValue" element
     */
    void unsetDomainValue();
    
    /**
     * Gets array of all "parentEntity" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getParentEntityArray();
    
    /**
     * Gets ith "parentEntity" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getParentEntityArray(int i);
    
    /**
     * Returns number of "parentEntity" element
     */
    int sizeOfParentEntityArray();
    
    /**
     * Sets array of all "parentEntity" element
     */
    void setParentEntityArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] parentEntityArray);
    
    /**
     * Sets ith "parentEntity" element
     */
    void setParentEntityArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType parentEntity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parentEntity" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewParentEntity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parentEntity" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewParentEntity();
    
    /**
     * Removes the ith "parentEntity" element
     */
    void removeParentEntity(int i);
    
    /**
     * Gets the "rule" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getRule();
    
    /**
     * Sets the "rule" element
     */
    void setRule(org.isotc211.x2005.gco.CharacterStringPropertyType rule);
    
    /**
     * Appends and returns a new empty "rule" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewRule();
    
    /**
     * Gets array of all "rationale" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getRationaleArray();
    
    /**
     * Gets ith "rationale" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getRationaleArray(int i);
    
    /**
     * Returns number of "rationale" element
     */
    int sizeOfRationaleArray();
    
    /**
     * Sets array of all "rationale" element
     */
    void setRationaleArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] rationaleArray);
    
    /**
     * Sets ith "rationale" element
     */
    void setRationaleArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType rationale);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rationale" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewRationale(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rationale" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewRationale();
    
    /**
     * Removes the ith "rationale" element
     */
    void removeRationale(int i);
    
    /**
     * Gets array of all "source" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getSourceArray();
    
    /**
     * Gets ith "source" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getSourceArray(int i);
    
    /**
     * Returns number of "source" element
     */
    int sizeOfSourceArray();
    
    /**
     * Sets array of all "source" element
     */
    void setSourceArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] sourceArray);
    
    /**
     * Sets ith "source" element
     */
    void setSourceArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType source);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "source" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewSource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewSource();
    
    /**
     * Removes the ith "source" element
     */
    void removeSource(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType newInstance() {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDExtendedElementInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDExtendedElementInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
