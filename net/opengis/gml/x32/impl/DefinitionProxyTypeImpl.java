/*
 * XML Type:  DefinitionProxyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DefinitionProxyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DefinitionProxyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DefinitionProxyTypeImpl extends net.opengis.gml.x32.impl.DefinitionTypeImpl implements net.opengis.gml.x32.DefinitionProxyType
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionProxyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "definitionRef");
    
    
    /**
     * Gets the "definitionRef" element
     */
    public net.opengis.gml.x32.ReferenceType getDefinitionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(DEFINITIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definitionRef" element
     */
    public void setDefinitionRef(net.opengis.gml.x32.ReferenceType definitionRef)
    {
        generatedSetterHelperImpl(definitionRef, DEFINITIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definitionRef" element
     */
    public net.opengis.gml.x32.ReferenceType addNewDefinitionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(DEFINITIONREF$0);
            return target;
        }
    }
}
