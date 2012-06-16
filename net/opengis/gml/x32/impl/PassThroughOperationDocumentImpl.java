/*
 * An XML document type.
 * Localname: PassThroughOperation
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PassThroughOperationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one PassThroughOperation(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PassThroughOperationDocumentImpl extends net.opengis.gml.x32.impl.AbstractSingleOperationDocumentImpl implements net.opengis.gml.x32.PassThroughOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public PassThroughOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PASSTHROUGHOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PassThroughOperation");
    
    
    /**
     * Gets the "PassThroughOperation" element
     */
    public net.opengis.gml.x32.PassThroughOperationType getPassThroughOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PassThroughOperationType target = null;
            target = (net.opengis.gml.x32.PassThroughOperationType)get_store().find_element_user(PASSTHROUGHOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PassThroughOperation" element
     */
    public void setPassThroughOperation(net.opengis.gml.x32.PassThroughOperationType passThroughOperation)
    {
        generatedSetterHelperImpl(passThroughOperation, PASSTHROUGHOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PassThroughOperation" element
     */
    public net.opengis.gml.x32.PassThroughOperationType addNewPassThroughOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PassThroughOperationType target = null;
            target = (net.opengis.gml.x32.PassThroughOperationType)get_store().add_element_user(PASSTHROUGHOPERATION$0);
            return target;
        }
    }
}
