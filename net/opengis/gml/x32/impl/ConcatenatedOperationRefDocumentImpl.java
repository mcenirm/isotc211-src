/*
 * An XML document type.
 * Localname: concatenatedOperationRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ConcatenatedOperationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one concatenatedOperationRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ConcatenatedOperationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ConcatenatedOperationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConcatenatedOperationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCATENATEDOPERATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "concatenatedOperationRef");
    
    
    /**
     * Gets the "concatenatedOperationRef" element
     */
    public net.opengis.gml.x32.ConcatenatedOperationPropertyType getConcatenatedOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConcatenatedOperationPropertyType target = null;
            target = (net.opengis.gml.x32.ConcatenatedOperationPropertyType)get_store().find_element_user(CONCATENATEDOPERATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "concatenatedOperationRef" element
     */
    public void setConcatenatedOperationRef(net.opengis.gml.x32.ConcatenatedOperationPropertyType concatenatedOperationRef)
    {
        generatedSetterHelperImpl(concatenatedOperationRef, CONCATENATEDOPERATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "concatenatedOperationRef" element
     */
    public net.opengis.gml.x32.ConcatenatedOperationPropertyType addNewConcatenatedOperationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ConcatenatedOperationPropertyType target = null;
            target = (net.opengis.gml.x32.ConcatenatedOperationPropertyType)get_store().add_element_user(CONCATENATEDOPERATIONREF$0);
            return target;
        }
    }
}
