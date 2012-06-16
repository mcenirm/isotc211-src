/*
 * An XML document type.
 * Localname: DefinitionProxy
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DefinitionProxyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one DefinitionProxy(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DefinitionProxyDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.DefinitionProxyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionProxyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONPROXY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DefinitionProxy");
    
    
    /**
     * Gets the "DefinitionProxy" element
     */
    public net.opengis.gml.x32.DefinitionProxyType getDefinitionProxy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DefinitionProxyType target = null;
            target = (net.opengis.gml.x32.DefinitionProxyType)get_store().find_element_user(DEFINITIONPROXY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DefinitionProxy" element
     */
    public void setDefinitionProxy(net.opengis.gml.x32.DefinitionProxyType definitionProxy)
    {
        generatedSetterHelperImpl(definitionProxy, DEFINITIONPROXY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DefinitionProxy" element
     */
    public net.opengis.gml.x32.DefinitionProxyType addNewDefinitionProxy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DefinitionProxyType target = null;
            target = (net.opengis.gml.x32.DefinitionProxyType)get_store().add_element_user(DEFINITIONPROXY$0);
            return target;
        }
    }
}
