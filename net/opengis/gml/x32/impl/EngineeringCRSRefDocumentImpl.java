/*
 * An XML document type.
 * Localname: engineeringCRSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EngineeringCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one engineeringCRSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EngineeringCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.EngineeringCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENGINEERINGCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "engineeringCRSRef");
    
    
    /**
     * Gets the "engineeringCRSRef" element
     */
    public net.opengis.gml.x32.EngineeringCRSPropertyType getEngineeringCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringCRSPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringCRSPropertyType)get_store().find_element_user(ENGINEERINGCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "engineeringCRSRef" element
     */
    public void setEngineeringCRSRef(net.opengis.gml.x32.EngineeringCRSPropertyType engineeringCRSRef)
    {
        generatedSetterHelperImpl(engineeringCRSRef, ENGINEERINGCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "engineeringCRSRef" element
     */
    public net.opengis.gml.x32.EngineeringCRSPropertyType addNewEngineeringCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringCRSPropertyType target = null;
            target = (net.opengis.gml.x32.EngineeringCRSPropertyType)get_store().add_element_user(ENGINEERINGCRSREF$0);
            return target;
        }
    }
}
