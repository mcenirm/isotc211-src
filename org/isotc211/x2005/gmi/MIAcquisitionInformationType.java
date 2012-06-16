/*
 * XML Type:  MI_AcquisitionInformation_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIAcquisitionInformationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML MI_AcquisitionInformation_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface MIAcquisitionInformationType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MIAcquisitionInformationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("miacquisitioninformationtype44c9type");
    
    /**
     * Gets array of all "acquisitionRequirement" elements
     */
    org.isotc211.x2005.gmi.MIRequirementPropertyType[] getAcquisitionRequirementArray();
    
    /**
     * Gets ith "acquisitionRequirement" element
     */
    org.isotc211.x2005.gmi.MIRequirementPropertyType getAcquisitionRequirementArray(int i);
    
    /**
     * Returns number of "acquisitionRequirement" element
     */
    int sizeOfAcquisitionRequirementArray();
    
    /**
     * Sets array of all "acquisitionRequirement" element
     */
    void setAcquisitionRequirementArray(org.isotc211.x2005.gmi.MIRequirementPropertyType[] acquisitionRequirementArray);
    
    /**
     * Sets ith "acquisitionRequirement" element
     */
    void setAcquisitionRequirementArray(int i, org.isotc211.x2005.gmi.MIRequirementPropertyType acquisitionRequirement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "acquisitionRequirement" element
     */
    org.isotc211.x2005.gmi.MIRequirementPropertyType insertNewAcquisitionRequirement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "acquisitionRequirement" element
     */
    org.isotc211.x2005.gmi.MIRequirementPropertyType addNewAcquisitionRequirement();
    
    /**
     * Removes the ith "acquisitionRequirement" element
     */
    void removeAcquisitionRequirement(int i);
    
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
     * Gets array of all "instrument" elements
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType[] getInstrumentArray();
    
    /**
     * Gets ith "instrument" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType getInstrumentArray(int i);
    
    /**
     * Returns number of "instrument" element
     */
    int sizeOfInstrumentArray();
    
    /**
     * Sets array of all "instrument" element
     */
    void setInstrumentArray(org.isotc211.x2005.gmi.MIInstrumentPropertyType[] instrumentArray);
    
    /**
     * Sets ith "instrument" element
     */
    void setInstrumentArray(int i, org.isotc211.x2005.gmi.MIInstrumentPropertyType instrument);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "instrument" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType insertNewInstrument(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "instrument" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType addNewInstrument();
    
    /**
     * Removes the ith "instrument" element
     */
    void removeInstrument(int i);
    
    /**
     * Gets array of all "acquisitionPlan" elements
     */
    org.isotc211.x2005.gmi.MIPlanPropertyType[] getAcquisitionPlanArray();
    
    /**
     * Gets ith "acquisitionPlan" element
     */
    org.isotc211.x2005.gmi.MIPlanPropertyType getAcquisitionPlanArray(int i);
    
    /**
     * Returns number of "acquisitionPlan" element
     */
    int sizeOfAcquisitionPlanArray();
    
    /**
     * Sets array of all "acquisitionPlan" element
     */
    void setAcquisitionPlanArray(org.isotc211.x2005.gmi.MIPlanPropertyType[] acquisitionPlanArray);
    
    /**
     * Sets ith "acquisitionPlan" element
     */
    void setAcquisitionPlanArray(int i, org.isotc211.x2005.gmi.MIPlanPropertyType acquisitionPlan);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "acquisitionPlan" element
     */
    org.isotc211.x2005.gmi.MIPlanPropertyType insertNewAcquisitionPlan(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "acquisitionPlan" element
     */
    org.isotc211.x2005.gmi.MIPlanPropertyType addNewAcquisitionPlan();
    
    /**
     * Removes the ith "acquisitionPlan" element
     */
    void removeAcquisitionPlan(int i);
    
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
     * Gets the "environmentalConditions" element
     */
    org.isotc211.x2005.gmi.MIEnvironmentalRecordPropertyType getEnvironmentalConditions();
    
    /**
     * True if has "environmentalConditions" element
     */
    boolean isSetEnvironmentalConditions();
    
    /**
     * Sets the "environmentalConditions" element
     */
    void setEnvironmentalConditions(org.isotc211.x2005.gmi.MIEnvironmentalRecordPropertyType environmentalConditions);
    
    /**
     * Appends and returns a new empty "environmentalConditions" element
     */
    org.isotc211.x2005.gmi.MIEnvironmentalRecordPropertyType addNewEnvironmentalConditions();
    
    /**
     * Unsets the "environmentalConditions" element
     */
    void unsetEnvironmentalConditions();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType newInstance() {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIAcquisitionInformationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIAcquisitionInformationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
