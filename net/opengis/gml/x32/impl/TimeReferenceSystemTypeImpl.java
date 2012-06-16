/*
 * XML Type:  TimeReferenceSystemType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TimeReferenceSystemType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML TimeReferenceSystemType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class TimeReferenceSystemTypeImpl extends net.opengis.gml.x32.impl.DefinitionTypeImpl implements net.opengis.gml.x32.TimeReferenceSystemType
{
    private static final long serialVersionUID = 1L;
    
    public TimeReferenceSystemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINOFVALIDITY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "domainOfValidity");
    
    
    /**
     * Gets the "domainOfValidity" element
     */
    public java.lang.String getDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domainOfValidity" element
     */
    public org.apache.xmlbeans.XmlString xgetDomainOfValidity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "domainOfValidity" element
     */
    public void setDomainOfValidity(java.lang.String domainOfValidity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINOFVALIDITY$0);
            }
            target.setStringValue(domainOfValidity);
        }
    }
    
    /**
     * Sets (as xml) the "domainOfValidity" element
     */
    public void xsetDomainOfValidity(org.apache.xmlbeans.XmlString domainOfValidity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINOFVALIDITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMAINOFVALIDITY$0);
            }
            target.set(domainOfValidity);
        }
    }
}
