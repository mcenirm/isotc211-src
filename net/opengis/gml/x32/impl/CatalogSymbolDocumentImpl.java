/*
 * An XML document type.
 * Localname: catalogSymbol
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CatalogSymbolDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one catalogSymbol(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CatalogSymbolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CatalogSymbolDocument
{
    private static final long serialVersionUID = 1L;
    
    public CatalogSymbolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOGSYMBOL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "catalogSymbol");
    
    
    /**
     * Gets the "catalogSymbol" element
     */
    public net.opengis.gml.x32.CodeType getCatalogSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(CATALOGSYMBOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "catalogSymbol" element
     */
    public void setCatalogSymbol(net.opengis.gml.x32.CodeType catalogSymbol)
    {
        generatedSetterHelperImpl(catalogSymbol, CATALOGSYMBOL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "catalogSymbol" element
     */
    public net.opengis.gml.x32.CodeType addNewCatalogSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(CATALOGSYMBOL$0);
            return target;
        }
    }
}
