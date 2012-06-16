/*
 * An XML document type.
 * Localname: referenceSystemRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ReferenceSystemRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one referenceSystemRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ReferenceSystemRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ReferenceSystemRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReferenceSystemRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCESYSTEMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "referenceSystemRef");
    
    
    /**
     * Gets the "referenceSystemRef" element
     */
    public net.opengis.gml.x32.CRSPropertyType getReferenceSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().find_element_user(REFERENCESYSTEMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "referenceSystemRef" element
     */
    public void setReferenceSystemRef(net.opengis.gml.x32.CRSPropertyType referenceSystemRef)
    {
        generatedSetterHelperImpl(referenceSystemRef, REFERENCESYSTEMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "referenceSystemRef" element
     */
    public net.opengis.gml.x32.CRSPropertyType addNewReferenceSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CRSPropertyType target = null;
            target = (net.opengis.gml.x32.CRSPropertyType)get_store().add_element_user(REFERENCESYSTEMREF$0);
            return target;
        }
    }
}
