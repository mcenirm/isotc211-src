/*
 * An XML document type.
 * Localname: geodeticDatumRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeodeticDatumRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one geodeticDatumRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeodeticDatumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GeodeticDatumRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeodeticDatumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEODETICDATUMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "geodeticDatumRef");
    
    
    /**
     * Gets the "geodeticDatumRef" element
     */
    public net.opengis.gml.x32.GeodeticDatumPropertyType getGeodeticDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().find_element_user(GEODETICDATUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "geodeticDatumRef" element
     */
    public void setGeodeticDatumRef(net.opengis.gml.x32.GeodeticDatumPropertyType geodeticDatumRef)
    {
        generatedSetterHelperImpl(geodeticDatumRef, GEODETICDATUMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "geodeticDatumRef" element
     */
    public net.opengis.gml.x32.GeodeticDatumPropertyType addNewGeodeticDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeodeticDatumPropertyType target = null;
            target = (net.opengis.gml.x32.GeodeticDatumPropertyType)get_store().add_element_user(GEODETICDATUMREF$0);
            return target;
        }
    }
}
