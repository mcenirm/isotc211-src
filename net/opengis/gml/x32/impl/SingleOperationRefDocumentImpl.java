/*
 * An XML document type.
 * Localname: singleOperationRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SingleOperationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one singleOperationRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SingleOperationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SingleOperationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public SingleOperationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SINGLEOPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "singleOperationRef");
    
    
    /**
     * Gets the "singleOperationRef" element
     */
    public net.opengis.gml.x32.SingleOperationPropertyType getSingleOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleOperationPropertyType target = null;
            target = (net.opengis.gml.x32.SingleOperationPropertyType)get_store().find_element_user(SINGLEOPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "singleOperationRef" element
     */
    public void setSingleOperationRef(net.opengis.gml.x32.SingleOperationPropertyType singleOperationRef)
    {
        generatedSetterHelperImpl(singleOperationRef, SINGLEOPERATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "singleOperationRef" element
     */
    public net.opengis.gml.x32.SingleOperationPropertyType addNewSingleOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleOperationPropertyType target = null;
            target = (net.opengis.gml.x32.SingleOperationPropertyType)get_store().add_element_user(SINGLEOPERATIONREF$0);
            return target;
        }
    }
}
