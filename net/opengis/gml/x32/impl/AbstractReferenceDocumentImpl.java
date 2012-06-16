/*
 * An XML document type.
 * Localname: abstractReference
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one abstractReference(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "abstractReference");
    
    
    /**
     * Gets the "abstractReference" element
     */
    public net.opengis.gml.x32.ReferenceType getAbstractReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().find_element_user(ABSTRACTREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstractReference" element
     */
    public void setAbstractReference(net.opengis.gml.x32.ReferenceType abstractReference)
    {
        generatedSetterHelperImpl(abstractReference, ABSTRACTREFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abstractReference" element
     */
    public net.opengis.gml.x32.ReferenceType addNewAbstractReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ReferenceType target = null;
            target = (net.opengis.gml.x32.ReferenceType)get_store().add_element_user(ABSTRACTREFERENCE$0);
            return target;
        }
    }
}
