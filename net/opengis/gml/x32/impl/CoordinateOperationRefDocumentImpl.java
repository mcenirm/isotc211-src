/*
 * An XML document type.
 * Localname: coordinateOperationRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoordinateOperationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one coordinateOperationRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CoordinateOperationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CoordinateOperationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoordinateOperationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATEOPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coordinateOperationRef");
    
    
    /**
     * Gets the "coordinateOperationRef" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType getCoordinateOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().find_element_user(COORDINATEOPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "coordinateOperationRef" element
     */
    public void setCoordinateOperationRef(net.opengis.gml.x32.CoordinateOperationPropertyType coordinateOperationRef)
    {
        generatedSetterHelperImpl(coordinateOperationRef, COORDINATEOPERATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coordinateOperationRef" element
     */
    public net.opengis.gml.x32.CoordinateOperationPropertyType addNewCoordinateOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateOperationPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateOperationPropertyType)get_store().add_element_user(COORDINATEOPERATIONREF$0);
            return target;
        }
    }
}
