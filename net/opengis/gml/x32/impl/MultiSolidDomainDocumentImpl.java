/*
 * An XML document type.
 * Localname: multiSolidDomain
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiSolidDomainDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiSolidDomain(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiSolidDomainDocumentImpl extends net.opengis.gml.x32.impl.DomainSetDocumentImpl implements net.opengis.gml.x32.MultiSolidDomainDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLIDDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiSolidDomain");
    
    
    /**
     * Gets the "multiSolidDomain" element
     */
    public net.opengis.gml.x32.DomainSetType getMultiSolidDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().find_element_user(MULTISOLIDDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiSolidDomain" element
     */
    public void setMultiSolidDomain(net.opengis.gml.x32.DomainSetType multiSolidDomain)
    {
        generatedSetterHelperImpl(multiSolidDomain, MULTISOLIDDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiSolidDomain" element
     */
    public net.opengis.gml.x32.DomainSetType addNewMultiSolidDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().add_element_user(MULTISOLIDDOMAIN$0);
            return target;
        }
    }
}
