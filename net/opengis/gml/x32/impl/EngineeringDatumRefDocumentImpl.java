/*
 * An XML document type.
 * Localname: engineeringDatumRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EngineeringDatumRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one engineeringDatumRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EngineeringDatumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.EngineeringDatumRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringDatumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENGINEERINGDATUMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "engineeringDatumRef");
    
    
    /**
     * Gets the "engineeringDatumRef" element
     */
    public net.opengis.gml.x32.EngineeringDatumPropertyType getEngineeringDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().find_element_user(ENGINEERINGDATUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "engineeringDatumRef" element
     */
    public void setEngineeringDatumRef(net.opengis.gml.x32.EngineeringDatumPropertyType engineeringDatumRef)
    {
        generatedSetterHelperImpl(engineeringDatumRef, ENGINEERINGDATUMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "engineeringDatumRef" element
     */
    public net.opengis.gml.x32.EngineeringDatumPropertyType addNewEngineeringDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringDatumPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringDatumPropertyType)get_store().add_element_user(ENGINEERINGDATUMREF$0);
            return target;
        }
    }
}
