/*
 * An XML document type.
 * Localname: CategoryExtent
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CategoryExtentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CategoryExtent(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CategoryExtentDocumentImpl extends net.opengis.gml.x32.impl.AbstractValueDocumentImpl implements net.opengis.gml.x32.CategoryExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYEXTENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CategoryExtent");
    
    
    /**
     * Gets the "CategoryExtent" element
     */
    public net.opengis.gml.x32.CategoryExtentType getCategoryExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CategoryExtentType target = null;
            target = (net.opengis.gml.x32.CategoryExtentType)get_store().find_element_user(CATEGORYEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategoryExtent" element
     */
    public void setCategoryExtent(net.opengis.gml.x32.CategoryExtentType categoryExtent)
    {
        generatedSetterHelperImpl(categoryExtent, CATEGORYEXTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryExtent" element
     */
    public net.opengis.gml.x32.CategoryExtentType addNewCategoryExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CategoryExtentType target = null;
            target = (net.opengis.gml.x32.CategoryExtentType)get_store().add_element_user(CATEGORYEXTENT$0);
            return target;
        }
    }
}
