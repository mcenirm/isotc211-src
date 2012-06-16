/*
 * An XML document type.
 * Localname: DefinitionCollection
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DefinitionCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one DefinitionCollection(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DefinitionCollectionDocumentImpl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.DefinitionCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONCOLLECTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DefinitionCollection");
    
    
    /**
     * Gets the "DefinitionCollection" element
     */
    public net.opengis.gml.x32.DictionaryType getDefinitionCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryType target = null;
            target = (net.opengis.gml.x32.DictionaryType)get_store().find_element_user(DEFINITIONCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DefinitionCollection" element
     */
    public void setDefinitionCollection(net.opengis.gml.x32.DictionaryType definitionCollection)
    {
        generatedSetterHelperImpl(definitionCollection, DEFINITIONCOLLECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DefinitionCollection" element
     */
    public net.opengis.gml.x32.DictionaryType addNewDefinitionCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryType target = null;
            target = (net.opengis.gml.x32.DictionaryType)get_store().add_element_user(DEFINITIONCOLLECTION$0);
            return target;
        }
    }
}
