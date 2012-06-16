/*
 * An XML document type.
 * Localname: definitionMember
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DefinitionMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one definitionMember(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DefinitionMemberDocumentImpl extends net.opengis.gml.x32.impl.DictionaryEntryDocumentImpl implements net.opengis.gml.x32.DefinitionMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "definitionMember");
    
    
    /**
     * Gets the "definitionMember" element
     */
    public net.opengis.gml.x32.DictionaryEntryType getDefinitionMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryEntryType target = null;
            target = (net.opengis.gml.x32.DictionaryEntryType)get_store().find_element_user(DEFINITIONMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definitionMember" element
     */
    public void setDefinitionMember(net.opengis.gml.x32.DictionaryEntryType definitionMember)
    {
        generatedSetterHelperImpl(definitionMember, DEFINITIONMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "definitionMember" element
     */
    public net.opengis.gml.x32.DictionaryEntryType addNewDefinitionMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryEntryType target = null;
            target = (net.opengis.gml.x32.DictionaryEntryType)get_store().add_element_user(DEFINITIONMEMBER$0);
            return target;
        }
    }
}
