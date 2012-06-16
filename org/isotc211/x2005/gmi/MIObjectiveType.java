/*
 * XML Type:  MI_Objective_Type
 * Namespace: http://www.isotc211.org/2005/gmi
 * Java type: org.isotc211.x2005.gmi.MIObjectiveType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmi;


/**
 * An XML MI_Objective_Type(@http://www.isotc211.org/2005/gmi).
 *
 * This is a complex type.
 */
public interface MIObjectiveType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MIObjectiveType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("miobjectivetype642ftype");
    
    /**
     * Gets array of all "identifier" elements
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType[] getIdentifierArray();
    
    /**
     * Gets ith "identifier" element
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType getIdentifierArray(int i);
    
    /**
     * Returns number of "identifier" element
     */
    int sizeOfIdentifierArray();
    
    /**
     * Sets array of all "identifier" element
     */
    void setIdentifierArray(org.isotc211.x2005.gmd.MDIdentifierPropertyType[] identifierArray);
    
    /**
     * Sets ith "identifier" element
     */
    void setIdentifierArray(int i, org.isotc211.x2005.gmd.MDIdentifierPropertyType identifier);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "identifier" element
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType insertNewIdentifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "identifier" element
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewIdentifier();
    
    /**
     * Removes the ith "identifier" element
     */
    void removeIdentifier(int i);
    
    /**
     * Gets the "priority" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getPriority();
    
    /**
     * True if has "priority" element
     */
    boolean isSetPriority();
    
    /**
     * Sets the "priority" element
     */
    void setPriority(org.isotc211.x2005.gco.CharacterStringPropertyType priority);
    
    /**
     * Appends and returns a new empty "priority" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewPriority();
    
    /**
     * Unsets the "priority" element
     */
    void unsetPriority();
    
    /**
     * Gets array of all "type" elements
     */
    org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType[] getTypeArray();
    
    /**
     * Gets ith "type" element
     */
    org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType getTypeArray(int i);
    
    /**
     * Returns number of "type" element
     */
    int sizeOfTypeArray();
    
    /**
     * Sets array of all "type" element
     */
    void setTypeArray(org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType[] typeArray);
    
    /**
     * Sets ith "type" element
     */
    void setTypeArray(int i, org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType type);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType insertNewType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    org.isotc211.x2005.gmi.MIObjectiveTypeCodePropertyType addNewType();
    
    /**
     * Removes the ith "type" element
     */
    void removeType(int i);
    
    /**
     * Gets array of all "function" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getFunctionArray();
    
    /**
     * Gets ith "function" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getFunctionArray(int i);
    
    /**
     * Returns number of "function" element
     */
    int sizeOfFunctionArray();
    
    /**
     * Sets array of all "function" element
     */
    void setFunctionArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] functionArray);
    
    /**
     * Sets ith "function" element
     */
    void setFunctionArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType function);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "function" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewFunction(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "function" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewFunction();
    
    /**
     * Removes the ith "function" element
     */
    void removeFunction(int i);
    
    /**
     * Gets array of all "extent" elements
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType[] getExtentArray();
    
    /**
     * Gets ith "extent" element
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType getExtentArray(int i);
    
    /**
     * Returns number of "extent" element
     */
    int sizeOfExtentArray();
    
    /**
     * Sets array of all "extent" element
     */
    void setExtentArray(org.isotc211.x2005.gmd.EXExtentPropertyType[] extentArray);
    
    /**
     * Sets ith "extent" element
     */
    void setExtentArray(int i, org.isotc211.x2005.gmd.EXExtentPropertyType extent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extent" element
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType insertNewExtent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extent" element
     */
    org.isotc211.x2005.gmd.EXExtentPropertyType addNewExtent();
    
    /**
     * Removes the ith "extent" element
     */
    void removeExtent(int i);
    
    /**
     * Gets array of all "pass" elements
     */
    org.isotc211.x2005.gmi.MIPlatformPassPropertyType[] getPassArray();
    
    /**
     * Gets ith "pass" element
     */
    org.isotc211.x2005.gmi.MIPlatformPassPropertyType getPassArray(int i);
    
    /**
     * Returns number of "pass" element
     */
    int sizeOfPassArray();
    
    /**
     * Sets array of all "pass" element
     */
    void setPassArray(org.isotc211.x2005.gmi.MIPlatformPassPropertyType[] passArray);
    
    /**
     * Sets ith "pass" element
     */
    void setPassArray(int i, org.isotc211.x2005.gmi.MIPlatformPassPropertyType pass);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pass" element
     */
    org.isotc211.x2005.gmi.MIPlatformPassPropertyType insertNewPass(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pass" element
     */
    org.isotc211.x2005.gmi.MIPlatformPassPropertyType addNewPass();
    
    /**
     * Removes the ith "pass" element
     */
    void removePass(int i);
    
    /**
     * Gets array of all "sensingInstrument" elements
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType[] getSensingInstrumentArray();
    
    /**
     * Gets ith "sensingInstrument" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType getSensingInstrumentArray(int i);
    
    /**
     * Returns number of "sensingInstrument" element
     */
    int sizeOfSensingInstrumentArray();
    
    /**
     * Sets array of all "sensingInstrument" element
     */
    void setSensingInstrumentArray(org.isotc211.x2005.gmi.MIInstrumentPropertyType[] sensingInstrumentArray);
    
    /**
     * Sets ith "sensingInstrument" element
     */
    void setSensingInstrumentArray(int i, org.isotc211.x2005.gmi.MIInstrumentPropertyType sensingInstrument);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sensingInstrument" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType insertNewSensingInstrument(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sensingInstrument" element
     */
    org.isotc211.x2005.gmi.MIInstrumentPropertyType addNewSensingInstrument();
    
    /**
     * Removes the ith "sensingInstrument" element
     */
    void removeSensingInstrument(int i);
    
    /**
     * Gets array of all "objectiveOccurrence" elements
     */
    org.isotc211.x2005.gmi.MIEventPropertyType[] getObjectiveOccurrenceArray();
    
    /**
     * Gets ith "objectiveOccurrence" element
     */
    org.isotc211.x2005.gmi.MIEventPropertyType getObjectiveOccurrenceArray(int i);
    
    /**
     * Returns number of "objectiveOccurrence" element
     */
    int sizeOfObjectiveOccurrenceArray();
    
    /**
     * Sets array of all "objectiveOccurrence" element
     */
    void setObjectiveOccurrenceArray(org.isotc211.x2005.gmi.MIEventPropertyType[] objectiveOccurrenceArray);
    
    /**
     * Sets ith "objectiveOccurrence" element
     */
    void setObjectiveOccurrenceArray(int i, org.isotc211.x2005.gmi.MIEventPropertyType objectiveOccurrence);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "objectiveOccurrence" element
     */
    org.isotc211.x2005.gmi.MIEventPropertyType insertNewObjectiveOccurrence(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "objectiveOccurrence" element
     */
    org.isotc211.x2005.gmi.MIEventPropertyType addNewObjectiveOccurrence();
    
    /**
     * Removes the ith "objectiveOccurrence" element
     */
    void removeObjectiveOccurrence(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmi.MIObjectiveType newInstance() {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmi.MIObjectiveType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmi.MIObjectiveType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
