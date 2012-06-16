/*
 * XML Type:  MD_MaintenanceInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.MDMaintenanceInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML MD_MaintenanceInformation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface MDMaintenanceInformationType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MDMaintenanceInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("mdmaintenanceinformationtype07e3type");
    
    /**
     * Gets the "maintenanceAndUpdateFrequency" element
     */
    org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodePropertyType getMaintenanceAndUpdateFrequency();
    
    /**
     * Sets the "maintenanceAndUpdateFrequency" element
     */
    void setMaintenanceAndUpdateFrequency(org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodePropertyType maintenanceAndUpdateFrequency);
    
    /**
     * Appends and returns a new empty "maintenanceAndUpdateFrequency" element
     */
    org.isotc211.x2005.gmd.MDMaintenanceFrequencyCodePropertyType addNewMaintenanceAndUpdateFrequency();
    
    /**
     * Gets the "dateOfNextUpdate" element
     */
    org.isotc211.x2005.gco.DatePropertyType getDateOfNextUpdate();
    
    /**
     * True if has "dateOfNextUpdate" element
     */
    boolean isSetDateOfNextUpdate();
    
    /**
     * Sets the "dateOfNextUpdate" element
     */
    void setDateOfNextUpdate(org.isotc211.x2005.gco.DatePropertyType dateOfNextUpdate);
    
    /**
     * Appends and returns a new empty "dateOfNextUpdate" element
     */
    org.isotc211.x2005.gco.DatePropertyType addNewDateOfNextUpdate();
    
    /**
     * Unsets the "dateOfNextUpdate" element
     */
    void unsetDateOfNextUpdate();
    
    /**
     * Gets the "userDefinedMaintenanceFrequency" element
     */
    org.isotc211.x2005.gts.TMPeriodDurationPropertyType getUserDefinedMaintenanceFrequency();
    
    /**
     * True if has "userDefinedMaintenanceFrequency" element
     */
    boolean isSetUserDefinedMaintenanceFrequency();
    
    /**
     * Sets the "userDefinedMaintenanceFrequency" element
     */
    void setUserDefinedMaintenanceFrequency(org.isotc211.x2005.gts.TMPeriodDurationPropertyType userDefinedMaintenanceFrequency);
    
    /**
     * Appends and returns a new empty "userDefinedMaintenanceFrequency" element
     */
    org.isotc211.x2005.gts.TMPeriodDurationPropertyType addNewUserDefinedMaintenanceFrequency();
    
    /**
     * Unsets the "userDefinedMaintenanceFrequency" element
     */
    void unsetUserDefinedMaintenanceFrequency();
    
    /**
     * Gets array of all "updateScope" elements
     */
    org.isotc211.x2005.gmd.MDScopeCodePropertyType[] getUpdateScopeArray();
    
    /**
     * Gets ith "updateScope" element
     */
    org.isotc211.x2005.gmd.MDScopeCodePropertyType getUpdateScopeArray(int i);
    
    /**
     * Returns number of "updateScope" element
     */
    int sizeOfUpdateScopeArray();
    
    /**
     * Sets array of all "updateScope" element
     */
    void setUpdateScopeArray(org.isotc211.x2005.gmd.MDScopeCodePropertyType[] updateScopeArray);
    
    /**
     * Sets ith "updateScope" element
     */
    void setUpdateScopeArray(int i, org.isotc211.x2005.gmd.MDScopeCodePropertyType updateScope);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "updateScope" element
     */
    org.isotc211.x2005.gmd.MDScopeCodePropertyType insertNewUpdateScope(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "updateScope" element
     */
    org.isotc211.x2005.gmd.MDScopeCodePropertyType addNewUpdateScope();
    
    /**
     * Removes the ith "updateScope" element
     */
    void removeUpdateScope(int i);
    
    /**
     * Gets array of all "updateScopeDescription" elements
     */
    org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType[] getUpdateScopeDescriptionArray();
    
    /**
     * Gets ith "updateScopeDescription" element
     */
    org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType getUpdateScopeDescriptionArray(int i);
    
    /**
     * Returns number of "updateScopeDescription" element
     */
    int sizeOfUpdateScopeDescriptionArray();
    
    /**
     * Sets array of all "updateScopeDescription" element
     */
    void setUpdateScopeDescriptionArray(org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType[] updateScopeDescriptionArray);
    
    /**
     * Sets ith "updateScopeDescription" element
     */
    void setUpdateScopeDescriptionArray(int i, org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType updateScopeDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "updateScopeDescription" element
     */
    org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType insertNewUpdateScopeDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "updateScopeDescription" element
     */
    org.isotc211.x2005.gmd.MDScopeDescriptionPropertyType addNewUpdateScopeDescription();
    
    /**
     * Removes the ith "updateScopeDescription" element
     */
    void removeUpdateScopeDescription(int i);
    
    /**
     * Gets array of all "maintenanceNote" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getMaintenanceNoteArray();
    
    /**
     * Gets ith "maintenanceNote" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getMaintenanceNoteArray(int i);
    
    /**
     * Returns number of "maintenanceNote" element
     */
    int sizeOfMaintenanceNoteArray();
    
    /**
     * Sets array of all "maintenanceNote" element
     */
    void setMaintenanceNoteArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] maintenanceNoteArray);
    
    /**
     * Sets ith "maintenanceNote" element
     */
    void setMaintenanceNoteArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType maintenanceNote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "maintenanceNote" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewMaintenanceNote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "maintenanceNote" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewMaintenanceNote();
    
    /**
     * Removes the ith "maintenanceNote" element
     */
    void removeMaintenanceNote(int i);
    
    /**
     * Gets array of all "contact" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getContactArray();
    
    /**
     * Gets ith "contact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getContactArray(int i);
    
    /**
     * Returns number of "contact" element
     */
    int sizeOfContactArray();
    
    /**
     * Sets array of all "contact" element
     */
    void setContactArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] contactArray);
    
    /**
     * Sets ith "contact" element
     */
    void setContactArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType contact);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewContact(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewContact();
    
    /**
     * Removes the ith "contact" element
     */
    void removeContact(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType newInstance() {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.MDMaintenanceInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.MDMaintenanceInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
