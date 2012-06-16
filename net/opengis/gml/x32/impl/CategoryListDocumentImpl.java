/*
 * An XML document type.
 * Localname: CategoryList
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CategoryListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CategoryList(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CategoryListDocumentImpl extends net.opengis.gml.x32.impl.AbstractScalarValueListDocumentImpl implements net.opengis.gml.x32.CategoryListDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CategoryList");
    
    
    /**
     * Gets the "CategoryList" element
     */
    public net.opengis.gml.x32.CodeOrNilReasonListType getCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeOrNilReasonListType target = null;
            target = (net.opengis.gml.x32.CodeOrNilReasonListType)get_store().find_element_user(CATEGORYLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategoryList" element
     */
    public void setCategoryList(net.opengis.gml.x32.CodeOrNilReasonListType categoryList)
    {
        generatedSetterHelperImpl(categoryList, CATEGORYLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryList" element
     */
    public net.opengis.gml.x32.CodeOrNilReasonListType addNewCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeOrNilReasonListType target = null;
            target = (net.opengis.gml.x32.CodeOrNilReasonListType)get_store().add_element_user(CATEGORYLIST$0);
            return target;
        }
    }
}
