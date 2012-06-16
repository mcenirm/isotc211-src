/*
 * An XML document type.
 * Localname: rectifiedGridDomain
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RectifiedGridDomainDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one rectifiedGridDomain(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class RectifiedGridDomainDocumentImpl extends net.opengis.gml.x32.impl.DomainSetDocumentImpl implements net.opengis.gml.x32.RectifiedGridDomainDocument
{
    private static final long serialVersionUID = 1L;
    
    public RectifiedGridDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECTIFIEDGRIDDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rectifiedGridDomain");
    
    
    /**
     * Gets the "rectifiedGridDomain" element
     */
    public net.opengis.gml.x32.DomainSetType getRectifiedGridDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().find_element_user(RECTIFIEDGRIDDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rectifiedGridDomain" element
     */
    public void setRectifiedGridDomain(net.opengis.gml.x32.DomainSetType rectifiedGridDomain)
    {
        generatedSetterHelperImpl(rectifiedGridDomain, RECTIFIEDGRIDDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "rectifiedGridDomain" element
     */
    public net.opengis.gml.x32.DomainSetType addNewRectifiedGridDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().add_element_user(RECTIFIEDGRIDDOMAIN$0);
            return target;
        }
    }
}
