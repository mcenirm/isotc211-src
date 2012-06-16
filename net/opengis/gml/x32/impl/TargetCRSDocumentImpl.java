/*
 * An XML document type.
 * Localname: targetCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TargetCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one targetCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TargetCRSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TargetCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public TargetCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "targetCRS");
    
    
    /**
     * Gets the "targetCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType getTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().find_element_user(TARGETCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "targetCRS" element
     */
    public void setTargetCRS(net.opengis.gml.x32.CRSPropertyType targetCRS)
    {
        generatedSetterHelperImpl(targetCRS, TARGETCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "targetCRS" element
     */
    public net.opengis.gml.x32.CRSPropertyType addNewTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().add_element_user(TARGETCRS$0);
            return target;
        }
    }
}
