/*
 * XML Type:  AbstractDQ_Element_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.AbstractDQElementType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML AbstractDQ_Element_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface AbstractDQElementType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractDQElementType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("abstractdqelementtype91a0type");
    
    /**
     * Gets array of all "nameOfMeasure" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getNameOfMeasureArray();
    
    /**
     * Gets ith "nameOfMeasure" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getNameOfMeasureArray(int i);
    
    /**
     * Returns number of "nameOfMeasure" element
     */
    int sizeOfNameOfMeasureArray();
    
    /**
     * Sets array of all "nameOfMeasure" element
     */
    void setNameOfMeasureArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] nameOfMeasureArray);
    
    /**
     * Sets ith "nameOfMeasure" element
     */
    void setNameOfMeasureArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType nameOfMeasure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nameOfMeasure" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewNameOfMeasure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nameOfMeasure" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewNameOfMeasure();
    
    /**
     * Removes the ith "nameOfMeasure" element
     */
    void removeNameOfMeasure(int i);
    
    /**
     * Gets the "measureIdentification" element
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType getMeasureIdentification();
    
    /**
     * True if has "measureIdentification" element
     */
    boolean isSetMeasureIdentification();
    
    /**
     * Sets the "measureIdentification" element
     */
    void setMeasureIdentification(org.isotc211.x2005.gmd.MDIdentifierPropertyType measureIdentification);
    
    /**
     * Appends and returns a new empty "measureIdentification" element
     */
    org.isotc211.x2005.gmd.MDIdentifierPropertyType addNewMeasureIdentification();
    
    /**
     * Unsets the "measureIdentification" element
     */
    void unsetMeasureIdentification();
    
    /**
     * Gets the "measureDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getMeasureDescription();
    
    /**
     * True if has "measureDescription" element
     */
    boolean isSetMeasureDescription();
    
    /**
     * Sets the "measureDescription" element
     */
    void setMeasureDescription(org.isotc211.x2005.gco.CharacterStringPropertyType measureDescription);
    
    /**
     * Appends and returns a new empty "measureDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewMeasureDescription();
    
    /**
     * Unsets the "measureDescription" element
     */
    void unsetMeasureDescription();
    
    /**
     * Gets the "evaluationMethodType" element
     */
    org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodePropertyType getEvaluationMethodType();
    
    /**
     * True if has "evaluationMethodType" element
     */
    boolean isSetEvaluationMethodType();
    
    /**
     * Sets the "evaluationMethodType" element
     */
    void setEvaluationMethodType(org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodePropertyType evaluationMethodType);
    
    /**
     * Appends and returns a new empty "evaluationMethodType" element
     */
    org.isotc211.x2005.gmd.DQEvaluationMethodTypeCodePropertyType addNewEvaluationMethodType();
    
    /**
     * Unsets the "evaluationMethodType" element
     */
    void unsetEvaluationMethodType();
    
    /**
     * Gets the "evaluationMethodDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getEvaluationMethodDescription();
    
    /**
     * True if has "evaluationMethodDescription" element
     */
    boolean isSetEvaluationMethodDescription();
    
    /**
     * Sets the "evaluationMethodDescription" element
     */
    void setEvaluationMethodDescription(org.isotc211.x2005.gco.CharacterStringPropertyType evaluationMethodDescription);
    
    /**
     * Appends and returns a new empty "evaluationMethodDescription" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewEvaluationMethodDescription();
    
    /**
     * Unsets the "evaluationMethodDescription" element
     */
    void unsetEvaluationMethodDescription();
    
    /**
     * Gets the "evaluationProcedure" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType getEvaluationProcedure();
    
    /**
     * True if has "evaluationProcedure" element
     */
    boolean isSetEvaluationProcedure();
    
    /**
     * Sets the "evaluationProcedure" element
     */
    void setEvaluationProcedure(org.isotc211.x2005.gmd.CICitationPropertyType evaluationProcedure);
    
    /**
     * Appends and returns a new empty "evaluationProcedure" element
     */
    org.isotc211.x2005.gmd.CICitationPropertyType addNewEvaluationProcedure();
    
    /**
     * Unsets the "evaluationProcedure" element
     */
    void unsetEvaluationProcedure();
    
    /**
     * Gets array of all "dateTime" elements
     */
    org.isotc211.x2005.gco.DateTimePropertyType[] getDateTimeArray();
    
    /**
     * Gets ith "dateTime" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType getDateTimeArray(int i);
    
    /**
     * Returns number of "dateTime" element
     */
    int sizeOfDateTimeArray();
    
    /**
     * Sets array of all "dateTime" element
     */
    void setDateTimeArray(org.isotc211.x2005.gco.DateTimePropertyType[] dateTimeArray);
    
    /**
     * Sets ith "dateTime" element
     */
    void setDateTimeArray(int i, org.isotc211.x2005.gco.DateTimePropertyType dateTime);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dateTime" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType insertNewDateTime(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dateTime" element
     */
    org.isotc211.x2005.gco.DateTimePropertyType addNewDateTime();
    
    /**
     * Removes the ith "dateTime" element
     */
    void removeDateTime(int i);
    
    /**
     * Gets array of all "result" elements
     */
    org.isotc211.x2005.gmd.DQResultPropertyType[] getResultArray();
    
    /**
     * Gets ith "result" element
     */
    org.isotc211.x2005.gmd.DQResultPropertyType getResultArray(int i);
    
    /**
     * Returns number of "result" element
     */
    int sizeOfResultArray();
    
    /**
     * Sets array of all "result" element
     */
    void setResultArray(org.isotc211.x2005.gmd.DQResultPropertyType[] resultArray);
    
    /**
     * Sets ith "result" element
     */
    void setResultArray(int i, org.isotc211.x2005.gmd.DQResultPropertyType result);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "result" element
     */
    org.isotc211.x2005.gmd.DQResultPropertyType insertNewResult(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "result" element
     */
    org.isotc211.x2005.gmd.DQResultPropertyType addNewResult();
    
    /**
     * Removes the ith "result" element
     */
    void removeResult(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.isotc211.x2005.gmd.AbstractDQElementType newInstance() {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.isotc211.x2005.gmd.AbstractDQElementType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.AbstractDQElementType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.AbstractDQElementType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
