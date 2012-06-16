/*
 * An XML document type.
 * Localname: passThroughOperationRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PassThroughOperationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one passThroughOperationRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PassThroughOperationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PassThroughOperationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public PassThroughOperationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PASSTHROUGHOPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "passThroughOperationRef");
    
    
    /**
     * Gets the "passThroughOperationRef" element
     */
    public net.opengis.gml.x32.PassThroughOperationPropertyType getPassThroughOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PassThroughOperationPropertyType target = null;
            target = (net.opengis.gml.x32.PassThroughOperationPropertyType)get_store().find_element_user(PASSTHROUGHOPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "passThroughOperationRef" element
     */
    public void setPassThroughOperationRef(net.opengis.gml.x32.PassThroughOperationPropertyType passThroughOperationRef)
    {
        generatedSetterHelperImpl(passThroughOperationRef, PASSTHROUGHOPERATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "passThroughOperationRef" element
     */
    public net.opengis.gml.x32.PassThroughOperationPropertyType addNewPassThroughOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PassThroughOperationPropertyType target = null;
            target = (net.opengis.gml.x32.PassThroughOperationPropertyType)get_store().add_element_user(PASSTHROUGHOPERATIONREF$0);
            return target;
        }
    }
}
