/*
 * XML Type:  RangeSetType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RangeSetType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML RangeSetType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface RangeSetType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RangeSetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("rangesettype8da4type");
    
    /**
     * Gets array of all "ValueArray" elements
     */
    net.opengis.gml.x32.ValueArrayType[] getValueArray1Array();
    
    /**
     * Gets ith "ValueArray" element
     */
    net.opengis.gml.x32.ValueArrayType getValueArray1Array(int i);
    
    /**
     * Returns number of "ValueArray" element
     */
    int sizeOfValueArray1Array();
    
    /**
     * Sets array of all "ValueArray" element
     */
    void setValueArray1Array(net.opengis.gml.x32.ValueArrayType[] valueArray1Array);
    
    /**
     * Sets ith "ValueArray" element
     */
    void setValueArray1Array(int i, net.opengis.gml.x32.ValueArrayType valueArray1);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueArray" element
     */
    net.opengis.gml.x32.ValueArrayType insertNewValueArray1(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValueArray" element
     */
    net.opengis.gml.x32.ValueArrayType addNewValueArray1();
    
    /**
     * Removes the ith "ValueArray" element
     */
    void removeValueArray1(int i);
    
    /**
     * Gets array of all "AbstractScalarValueList" elements
     */
    org.apache.xmlbeans.XmlObject[] getAbstractScalarValueListArray();
    
    /**
     * Gets ith "AbstractScalarValueList" element
     */
    org.apache.xmlbeans.XmlObject getAbstractScalarValueListArray(int i);
    
    /**
     * Returns number of "AbstractScalarValueList" element
     */
    int sizeOfAbstractScalarValueListArray();
    
    /**
     * Sets array of all "AbstractScalarValueList" element
     */
    void setAbstractScalarValueListArray(org.apache.xmlbeans.XmlObject[] abstractScalarValueListArray);
    
    /**
     * Sets ith "AbstractScalarValueList" element
     */
    void setAbstractScalarValueListArray(int i, org.apache.xmlbeans.XmlObject abstractScalarValueList);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AbstractScalarValueList" element
     */
    org.apache.xmlbeans.XmlObject insertNewAbstractScalarValueList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AbstractScalarValueList" element
     */
    org.apache.xmlbeans.XmlObject addNewAbstractScalarValueList();
    
    /**
     * Removes the ith "AbstractScalarValueList" element
     */
    void removeAbstractScalarValueList(int i);
    
    /**
     * Gets the "DataBlock" element
     */
    net.opengis.gml.x32.DataBlockType getDataBlock();
    
    /**
     * True if has "DataBlock" element
     */
    boolean isSetDataBlock();
    
    /**
     * Sets the "DataBlock" element
     */
    void setDataBlock(net.opengis.gml.x32.DataBlockType dataBlock);
    
    /**
     * Appends and returns a new empty "DataBlock" element
     */
    net.opengis.gml.x32.DataBlockType addNewDataBlock();
    
    /**
     * Unsets the "DataBlock" element
     */
    void unsetDataBlock();
    
    /**
     * Gets the "File" element
     */
    net.opengis.gml.x32.FileType getFile();
    
    /**
     * True if has "File" element
     */
    boolean isSetFile();
    
    /**
     * Sets the "File" element
     */
    void setFile(net.opengis.gml.x32.FileType file);
    
    /**
     * Appends and returns a new empty "File" element
     */
    net.opengis.gml.x32.FileType addNewFile();
    
    /**
     * Unsets the "File" element
     */
    void unsetFile();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.RangeSetType newInstance() {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.RangeSetType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.RangeSetType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.RangeSetType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.RangeSetType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.RangeSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.RangeSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.RangeSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
