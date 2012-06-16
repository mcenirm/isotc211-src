/*
 * An XML document type.
 * Localname: descriptionReference
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DescriptionReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one descriptionReference(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DescriptionReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DescriptionReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptionReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIONREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "descriptionReference");
    
    
    /**
     * Gets the "descriptionReference" element
     */
    public net.opengis.gml.x32.ReferenceType getDescriptionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(DESCRIPTIONREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "descriptionReference" element
     */
    public void setDescriptionReference(net.opengis.gml.x32.ReferenceType descriptionReference)
    {
        generatedSetterHelperImpl(descriptionReference, DESCRIPTIONREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "descriptionReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewDescriptionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(DESCRIPTIONREFERENCE$0);
            return target;
        }
    }
}
