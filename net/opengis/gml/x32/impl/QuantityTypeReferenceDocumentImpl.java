/*
 * An XML document type.
 * Localname: quantityTypeReference
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.QuantityTypeReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one quantityTypeReference(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class QuantityTypeReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.QuantityTypeReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuantityTypeReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITYTYPEREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "quantityTypeReference");
    
    
    /**
     * Gets the "quantityTypeReference" element
     */
    public net.opengis.gml.x32.ReferenceType getQuantityTypeReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(QUANTITYTYPEREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "quantityTypeReference" element
     */
    public void setQuantityTypeReference(net.opengis.gml.x32.ReferenceType quantityTypeReference)
    {
        generatedSetterHelperImpl(quantityTypeReference, QUANTITYTYPEREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "quantityTypeReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewQuantityTypeReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(QUANTITYTYPEREFERENCE$0);
            return target;
        }
    }
}
