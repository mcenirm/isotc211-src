/*
 * XML Type:  CI_Citation_Type
 * Namespace: http://www.isotc211.org/2005/gmd
 * Java type: org.isotc211.x2005.gmd.CICitationType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gmd;


/**
 * An XML CI_Citation_Type(@http://www.isotc211.org/2005/gmd).
 *
 * This is a complex type.
 */
public interface CICitationType extends org.isotc211.x2005.gco.AbstractObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CICitationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("cicitationtype67c2type");
    
    /**
     * Gets the "title" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(org.isotc211.x2005.gco.CharacterStringPropertyType title);
    
    /**
     * Appends and returns a new empty "title" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewTitle();
    
    /**
     * Gets array of all "alternateTitle" elements
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType[] getAlternateTitleArray();
    
    /**
     * Gets ith "alternateTitle" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getAlternateTitleArray(int i);
    
    /**
     * Returns number of "alternateTitle" element
     */
    int sizeOfAlternateTitleArray();
    
    /**
     * Sets array of all "alternateTitle" element
     */
    void setAlternateTitleArray(org.isotc211.x2005.gco.CharacterStringPropertyType[] alternateTitleArray);
    
    /**
     * Sets ith "alternateTitle" element
     */
    void setAlternateTitleArray(int i, org.isotc211.x2005.gco.CharacterStringPropertyType alternateTitle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alternateTitle" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType insertNewAlternateTitle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alternateTitle" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewAlternateTitle();
    
    /**
     * Removes the ith "alternateTitle" element
     */
    void removeAlternateTitle(int i);
    
    /**
     * Gets array of all "date" elements
     */
    org.isotc211.x2005.gmd.CIDatePropertyType[] getDateArray();
    
    /**
     * Gets ith "date" element
     */
    org.isotc211.x2005.gmd.CIDatePropertyType getDateArray(int i);
    
    /**
     * Returns number of "date" element
     */
    int sizeOfDateArray();
    
    /**
     * Sets array of all "date" element
     */
    void setDateArray(org.isotc211.x2005.gmd.CIDatePropertyType[] dateArray);
    
    /**
     * Sets ith "date" element
     */
    void setDateArray(int i, org.isotc211.x2005.gmd.CIDatePropertyType date);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "date" element
     */
    org.isotc211.x2005.gmd.CIDatePropertyType insertNewDate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "date" element
     */
    org.isotc211.x2005.gmd.CIDatePropertyType addNewDate();
    
    /**
     * Removes the ith "date" element
     */
    void removeDate(int i);
    
    /**
     * Gets the "edition" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getEdition();
    
    /**
     * True if has "edition" element
     */
    boolean isSetEdition();
    
    /**
     * Sets the "edition" element
     */
    void setEdition(org.isotc211.x2005.gco.CharacterStringPropertyType edition);
    
    /**
     * Appends and returns a new empty "edition" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewEdition();
    
    /**
     * Unsets the "edition" element
     */
    void unsetEdition();
    
    /**
     * Gets the "editionDate" element
     */
    org.isotc211.x2005.gco.DatePropertyType getEditionDate();
    
    /**
     * True if has "editionDate" element
     */
    boolean isSetEditionDate();
    
    /**
     * Sets the "editionDate" element
     */
    void setEditionDate(org.isotc211.x2005.gco.DatePropertyType editionDate);
    
    /**
     * Appends and returns a new empty "editionDate" element
     */
    org.isotc211.x2005.gco.DatePropertyType addNewEditionDate();
    
    /**
     * Unsets the "editionDate" element
     */
    void unsetEditionDate();
    
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
     * Gets array of all "citedResponsibleParty" elements
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] getCitedResponsiblePartyArray();
    
    /**
     * Gets ith "citedResponsibleParty" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType getCitedResponsiblePartyArray(int i);
    
    /**
     * Returns number of "citedResponsibleParty" element
     */
    int sizeOfCitedResponsiblePartyArray();
    
    /**
     * Sets array of all "citedResponsibleParty" element
     */
    void setCitedResponsiblePartyArray(org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType[] citedResponsiblePartyArray);
    
    /**
     * Sets ith "citedResponsibleParty" element
     */
    void setCitedResponsiblePartyArray(int i, org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType citedResponsibleParty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "citedResponsibleParty" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType insertNewCitedResponsibleParty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "citedResponsibleParty" element
     */
    org.isotc211.x2005.gmd.CIResponsiblePartyPropertyType addNewCitedResponsibleParty();
    
    /**
     * Removes the ith "citedResponsibleParty" element
     */
    void removeCitedResponsibleParty(int i);
    
    /**
     * Gets array of all "presentationForm" elements
     */
    org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType[] getPresentationFormArray();
    
    /**
     * Gets ith "presentationForm" element
     */
    org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType getPresentationFormArray(int i);
    
    /**
     * Returns number of "presentationForm" element
     */
    int sizeOfPresentationFormArray();
    
    /**
     * Sets array of all "presentationForm" element
     */
    void setPresentationFormArray(org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType[] presentationFormArray);
    
    /**
     * Sets ith "presentationForm" element
     */
    void setPresentationFormArray(int i, org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType presentationForm);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "presentationForm" element
     */
    org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType insertNewPresentationForm(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "presentationForm" element
     */
    org.isotc211.x2005.gmd.CIPresentationFormCodePropertyType addNewPresentationForm();
    
    /**
     * Removes the ith "presentationForm" element
     */
    void removePresentationForm(int i);
    
    /**
     * Gets the "series" element
     */
    org.isotc211.x2005.gmd.CISeriesPropertyType getSeries();
    
    /**
     * True if has "series" element
     */
    boolean isSetSeries();
    
    /**
     * Sets the "series" element
     */
    void setSeries(org.isotc211.x2005.gmd.CISeriesPropertyType series);
    
    /**
     * Appends and returns a new empty "series" element
     */
    org.isotc211.x2005.gmd.CISeriesPropertyType addNewSeries();
    
    /**
     * Unsets the "series" element
     */
    void unsetSeries();
    
    /**
     * Gets the "otherCitationDetails" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getOtherCitationDetails();
    
    /**
     * True if has "otherCitationDetails" element
     */
    boolean isSetOtherCitationDetails();
    
    /**
     * Sets the "otherCitationDetails" element
     */
    void setOtherCitationDetails(org.isotc211.x2005.gco.CharacterStringPropertyType otherCitationDetails);
    
    /**
     * Appends and returns a new empty "otherCitationDetails" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewOtherCitationDetails();
    
    /**
     * Unsets the "otherCitationDetails" element
     */
    void unsetOtherCitationDetails();
    
    /**
     * Gets the "collectiveTitle" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getCollectiveTitle();
    
    /**
     * True if has "collectiveTitle" element
     */
    boolean isSetCollectiveTitle();
    
    /**
     * Sets the "collectiveTitle" element
     */
    void setCollectiveTitle(org.isotc211.x2005.gco.CharacterStringPropertyType collectiveTitle);
    
    /**
     * Appends and returns a new empty "collectiveTitle" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewCollectiveTitle();
    
    /**
     * Unsets the "collectiveTitle" element
     */
    void unsetCollectiveTitle();
    
    /**
     * Gets the "ISBN" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getISBN();
    
    /**
     * True if has "ISBN" element
     */
    boolean isSetISBN();
    
    /**
     * Sets the "ISBN" element
     */
    void setISBN(org.isotc211.x2005.gco.CharacterStringPropertyType isbn);
    
    /**
     * Appends and returns a new empty "ISBN" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewISBN();
    
    /**
     * Unsets the "ISBN" element
     */
    void unsetISBN();
    
    /**
     * Gets the "ISSN" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType getISSN();
    
    /**
     * True if has "ISSN" element
     */
    boolean isSetISSN();
    
    /**
     * Sets the "ISSN" element
     */
    void setISSN(org.isotc211.x2005.gco.CharacterStringPropertyType issn);
    
    /**
     * Appends and returns a new empty "ISSN" element
     */
    org.isotc211.x2005.gco.CharacterStringPropertyType addNewISSN();
    
    /**
     * Unsets the "ISSN" element
     */
    void unsetISSN();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.isotc211.x2005.gmd.CICitationType newInstance() {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.isotc211.x2005.gmd.CICitationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.isotc211.x2005.gmd.CICitationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.isotc211.x2005.gmd.CICitationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.isotc211.x2005.gmd.CICitationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.CICitationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.isotc211.x2005.gmd.CICitationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.isotc211.x2005.gmd.CICitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
