/*
 * An XML document type.
 * Localname: multiPointDomain
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiPointDomainDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiPointDomain(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiPointDomainDocumentImpl extends net.opengis.gml.x32.impl.DomainSetDocumentImpl implements net.opengis.gml.x32.MultiPointDomainDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiPointDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOINTDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiPointDomain");
    
    
    /**
     * Gets the "multiPointDomain" element
     */
    public net.opengis.gml.x32.DomainSetType getMultiPointDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().find_element_user(MULTIPOINTDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiPointDomain" element
     */
    public void setMultiPointDomain(net.opengis.gml.x32.DomainSetType multiPointDomain)
    {
        generatedSetterHelperImpl(multiPointDomain, MULTIPOINTDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiPointDomain" element
     */
    public net.opengis.gml.x32.DomainSetType addNewMultiPointDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().add_element_user(MULTIPOINTDOMAIN$0);
            return target;
        }
    }
}
