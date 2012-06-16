/*
 * XML Type:  MovingObjectStatusType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MovingObjectStatusType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32;


/**
 * An XML MovingObjectStatusType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public interface MovingObjectStatusType extends net.opengis.gml.x32.AbstractTimeSliceType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MovingObjectStatusType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC7E4D2BA29F77ED4AC7E57B2D3FDB5C1").resolveHandle("movingobjectstatustypeb10atype");
    
    /**
     * Gets the "position" element
     */
    net.opengis.gml.x32.GeometryPropertyType getPosition();
    
    /**
     * True if has "position" element
     */
    boolean isSetPosition();
    
    /**
     * Sets the "position" element
     */
    void setPosition(net.opengis.gml.x32.GeometryPropertyType position);
    
    /**
     * Appends and returns a new empty "position" element
     */
    net.opengis.gml.x32.GeometryPropertyType addNewPosition();
    
    /**
     * Unsets the "position" element
     */
    void unsetPosition();
    
    /**
     * Gets the "pos" element
     */
    net.opengis.gml.x32.DirectPositionType getPos();
    
    /**
     * True if has "pos" element
     */
    boolean isSetPos();
    
    /**
     * Sets the "pos" element
     */
    void setPos(net.opengis.gml.x32.DirectPositionType pos);
    
    /**
     * Appends and returns a new empty "pos" element
     */
    net.opengis.gml.x32.DirectPositionType addNewPos();
    
    /**
     * Unsets the "pos" element
     */
    void unsetPos();
    
    /**
     * Gets the "locationName" element
     */
    net.opengis.gml.x32.CodeType getLocationName();
    
    /**
     * True if has "locationName" element
     */
    boolean isSetLocationName();
    
    /**
     * Sets the "locationName" element
     */
    void setLocationName(net.opengis.gml.x32.CodeType locationName);
    
    /**
     * Appends and returns a new empty "locationName" element
     */
    net.opengis.gml.x32.CodeType addNewLocationName();
    
    /**
     * Unsets the "locationName" element
     */
    void unsetLocationName();
    
    /**
     * Gets the "locationReference" element
     */
    net.opengis.gml.x32.ReferenceType getLocationReference();
    
    /**
     * True if has "locationReference" element
     */
    boolean isSetLocationReference();
    
    /**
     * Sets the "locationReference" element
     */
    void setLocationReference(net.opengis.gml.x32.ReferenceType locationReference);
    
    /**
     * Appends and returns a new empty "locationReference" element
     */
    net.opengis.gml.x32.ReferenceType addNewLocationReference();
    
    /**
     * Unsets the "locationReference" element
     */
    void unsetLocationReference();
    
    /**
     * Gets the "location" element
     */
    net.opengis.gml.x32.LocationPropertyType getLocation();
    
    /**
     * True if has "location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "location" element
     */
    void setLocation(net.opengis.gml.x32.LocationPropertyType location);
    
    /**
     * Appends and returns a new empty "location" element
     */
    net.opengis.gml.x32.LocationPropertyType addNewLocation();
    
    /**
     * Unsets the "location" element
     */
    void unsetLocation();
    
    /**
     * Gets the "speed" element
     */
    net.opengis.gml.x32.MeasureType getSpeed();
    
    /**
     * True if has "speed" element
     */
    boolean isSetSpeed();
    
    /**
     * Sets the "speed" element
     */
    void setSpeed(net.opengis.gml.x32.MeasureType speed);
    
    /**
     * Appends and returns a new empty "speed" element
     */
    net.opengis.gml.x32.MeasureType addNewSpeed();
    
    /**
     * Unsets the "speed" element
     */
    void unsetSpeed();
    
    /**
     * Gets the "bearing" element
     */
    net.opengis.gml.x32.DirectionPropertyType getBearing();
    
    /**
     * True if has "bearing" element
     */
    boolean isSetBearing();
    
    /**
     * Sets the "bearing" element
     */
    void setBearing(net.opengis.gml.x32.DirectionPropertyType bearing);
    
    /**
     * Appends and returns a new empty "bearing" element
     */
    net.opengis.gml.x32.DirectionPropertyType addNewBearing();
    
    /**
     * Unsets the "bearing" element
     */
    void unsetBearing();
    
    /**
     * Gets the "acceleration" element
     */
    net.opengis.gml.x32.MeasureType getAcceleration();
    
    /**
     * True if has "acceleration" element
     */
    boolean isSetAcceleration();
    
    /**
     * Sets the "acceleration" element
     */
    void setAcceleration(net.opengis.gml.x32.MeasureType acceleration);
    
    /**
     * Appends and returns a new empty "acceleration" element
     */
    net.opengis.gml.x32.MeasureType addNewAcceleration();
    
    /**
     * Unsets the "acceleration" element
     */
    void unsetAcceleration();
    
    /**
     * Gets the "elevation" element
     */
    net.opengis.gml.x32.MeasureType getElevation();
    
    /**
     * True if has "elevation" element
     */
    boolean isSetElevation();
    
    /**
     * Sets the "elevation" element
     */
    void setElevation(net.opengis.gml.x32.MeasureType elevation);
    
    /**
     * Appends and returns a new empty "elevation" element
     */
    net.opengis.gml.x32.MeasureType addNewElevation();
    
    /**
     * Unsets the "elevation" element
     */
    void unsetElevation();
    
    /**
     * Gets the "status" element
     */
    net.opengis.gml.x32.StringOrRefType getStatus();
    
    /**
     * True if has "status" element
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(net.opengis.gml.x32.StringOrRefType status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    net.opengis.gml.x32.StringOrRefType addNewStatus();
    
    /**
     * Unsets the "status" element
     */
    void unsetStatus();
    
    /**
     * Gets the "statusReference" element
     */
    net.opengis.gml.x32.ReferenceType getStatusReference();
    
    /**
     * True if has "statusReference" element
     */
    boolean isSetStatusReference();
    
    /**
     * Sets the "statusReference" element
     */
    void setStatusReference(net.opengis.gml.x32.ReferenceType statusReference);
    
    /**
     * Appends and returns a new empty "statusReference" element
     */
    net.opengis.gml.x32.ReferenceType addNewStatusReference();
    
    /**
     * Unsets the "statusReference" element
     */
    void unsetStatusReference();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.gml.x32.MovingObjectStatusType newInstance() {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.gml.x32.MovingObjectStatusType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.gml.x32.MovingObjectStatusType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.gml.x32.MovingObjectStatusType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.MovingObjectStatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.gml.x32.MovingObjectStatusType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.gml.x32.MovingObjectStatusType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
