/*
 * An XML document type.
 * Localname: Dictionary
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DictionaryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Dictionary(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DictionaryDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.DictionaryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DictionaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DICTIONARY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Dictionary");
    
    
    /**
     * Gets the "Dictionary" element
     */
    public net.opengis.gml.x32.DictionaryType getDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryType target = null;
            target = (net.opengis.gml.x32.DictionaryType)get_store().find_element_user(DICTIONARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Dictionary" element
     */
    public void setDictionary(net.opengis.gml.x32.DictionaryType dictionary)
    {
        generatedSetterHelperImpl(dictionary, DICTIONARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Dictionary" element
     */
    public net.opengis.gml.x32.DictionaryType addNewDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryType target = null;
            target = (net.opengis.gml.x32.DictionaryType)get_store().add_element_user(DICTIONARY$0);
            return target;
        }
    }
}
