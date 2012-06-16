/*
 * An XML document type.
 * Localname: usesMethod
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesMethodDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesMethod(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesMethodDocumentImpl extends net.opengis.gml.x32.impl.MethodDocumentImpl implements net.opengis.gml.x32.UsesMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESMETHOD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesMethod");
    
    
    /**
     * Gets the "usesMethod" element
     */
    public net.opengis.gml.x32.OperationMethodPropertyType getUsesMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodPropertyType target = null;
            target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().find_element_user(USESMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesMethod" element
     */
    public void setUsesMethod(net.opengis.gml.x32.OperationMethodPropertyType usesMethod)
    {
        generatedSetterHelperImpl(usesMethod, USESMETHOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesMethod" element
     */
    public net.opengis.gml.x32.OperationMethodPropertyType addNewUsesMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationMethodPropertyType target = null;
            target = (net.opengis.gml.x32.OperationMethodPropertyType)get_store().add_element_user(USESMETHOD$0);
            return target;
        }
    }
}
