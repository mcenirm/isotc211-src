/*
 * An XML document type.
 * Localname: EngineeringCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EngineeringCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one EngineeringCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EngineeringCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractSingleCRSDocumentImpl implements net.opengis.gml.x32.EngineeringCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENGINEERINGCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringCRS");
    
    
    /**
     * Gets the "EngineeringCRS" element
     */
    public net.opengis.gml.x32.EngineeringCRSType getEngineeringCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringCRSType target = null;
            target = (net.opengis.gml.x32.EngineeringCRSType)get_store().find_element_user(ENGINEERINGCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EngineeringCRS" element
     */
    public void setEngineeringCRS(net.opengis.gml.x32.EngineeringCRSType engineeringCRS)
    {
        generatedSetterHelperImpl(engineeringCRS, ENGINEERINGCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EngineeringCRS" element
     */
    public net.opengis.gml.x32.EngineeringCRSType addNewEngineeringCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EngineeringCRSType target = null;
            target = (net.opengis.gml.x32.EngineeringCRSType)get_store().add_element_user(ENGINEERINGCRS$0);
            return target;
        }
    }
}
