/*
 * An XML document type.
 * Localname: Bag
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BagDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Bag(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class BagDocumentImpl extends net.opengis.gml.x32.impl.AbstractGMLDocumentImpl implements net.opengis.gml.x32.BagDocument
{
    private static final long serialVersionUID = 1L;
    
    public BagDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BAG$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Bag");
    
    
    /**
     * Gets the "Bag" element
     */
    public net.opengis.gml.x32.BagType getBag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BagType target = null;
            target = (net.opengis.gml.x32.BagType)get_store().find_element_user(BAG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bag" element
     */
    public void setBag(net.opengis.gml.x32.BagType bag)
    {
        generatedSetterHelperImpl(bag, BAG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Bag" element
     */
    public net.opengis.gml.x32.BagType addNewBag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BagType target = null;
            target = (net.opengis.gml.x32.BagType)get_store().add_element_user(BAG$0);
            return target;
        }
    }
}
