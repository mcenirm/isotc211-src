/*
 * An XML document type.
 * Localname: abstractInlineProperty
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractInlinePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one abstractInlineProperty(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractInlinePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractInlinePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractInlinePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTINLINEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "abstractInlineProperty");
    
    
    /**
     * Gets the "abstractInlineProperty" element
     */
    public net.opengis.gml.x32.InlinePropertyType getAbstractInlineProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.InlinePropertyType target = null;
            target = (net.opengis.gml.x32.InlinePropertyType)get_store().find_element_user(ABSTRACTINLINEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstractInlineProperty" element
     */
    public void setAbstractInlineProperty(net.opengis.gml.x32.InlinePropertyType abstractInlineProperty)
    {
        generatedSetterHelperImpl(abstractInlineProperty, ABSTRACTINLINEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abstractInlineProperty" element
     */
    public net.opengis.gml.x32.InlinePropertyType addNewAbstractInlineProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.InlinePropertyType target = null;
            target = (net.opengis.gml.x32.InlinePropertyType)get_store().add_element_user(ABSTRACTINLINEPROPERTY$0);
            return target;
        }
    }
}
