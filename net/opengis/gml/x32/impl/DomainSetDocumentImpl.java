/*
 * An XML document type.
 * Localname: domainSet
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DomainSetDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one domainSet(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DomainSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DomainSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public DomainSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINSET$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "domainSet");
    private static final org.apache.xmlbeans.QNameSet DOMAINSET$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiPointDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiCurveDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiSolidDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "gridDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "domainSet"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiSurfaceDomain"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "rectifiedGridDomain"),
    });
    
    
    /**
     * Gets the "domainSet" element
     */
    public net.opengis.gml.x32.DomainSetType getDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().find_element_user(DOMAINSET$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "domainSet" element
     */
    public void setDomainSet(net.opengis.gml.x32.DomainSetType domainSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().find_element_user(DOMAINSET$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DomainSetType)get_store().add_element_user(DOMAINSET$0);
            }
            target.set(domainSet);
        }
    }
    
    /**
     * Appends and returns a new empty "domainSet" element
     */
    public net.opengis.gml.x32.DomainSetType addNewDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().add_element_user(DOMAINSET$0);
            return target;
        }
    }
}
