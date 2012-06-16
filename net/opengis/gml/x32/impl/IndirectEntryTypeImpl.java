/*
 * XML Type:  IndirectEntryType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.IndirectEntryType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML IndirectEntryType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class IndirectEntryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.IndirectEntryType
{
    private static final long serialVersionUID = 1L;
    
    public IndirectEntryTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
