/*
 * An XML document type.
 * Localname: geographicCRSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeographicCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one geographicCRSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeographicCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GeographicCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeographicCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "geographicCRSRef");
    
    
    /**
     * Gets the "geographicCRSRef" element
     */
    public net.opengis.gml.x32.GeographicCRSPropertyType getGeographicCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeographicCRSPropertyType target = null;
            target = (net.opengis.gml.x32.GeographicCRSPropertyType)get_store().find_element_user(GEOGRAPHICCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geographicCRSRef" element
     */
    public void setGeographicCRSRef(net.opengis.gml.x32.GeographicCRSPropertyType geographicCRSRef)
    {
        generatedSetterHelperImpl(geographicCRSRef, GEOGRAPHICCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geographicCRSRef" element
     */
    public net.opengis.gml.x32.GeographicCRSPropertyType addNewGeographicCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeographicCRSPropertyType target = null;
            target = (net.opengis.gml.x32.GeographicCRSPropertyType)get_store().add_element_user(GEOGRAPHICCRSREF$0);
            return target;
        }
    }
}
