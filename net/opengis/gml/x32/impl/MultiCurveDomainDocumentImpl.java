/*
 * An XML document type.
 * Localname: multiCurveDomain
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiCurveDomainDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiCurveDomain(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiCurveDomainDocumentImpl extends net.opengis.gml.x32.impl.DomainSetDocumentImpl implements net.opengis.gml.x32.MultiCurveDomainDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCurveDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICURVEDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiCurveDomain");
    
    
    /**
     * Gets the "multiCurveDomain" element
     */
    public net.opengis.gml.x32.DomainSetType getMultiCurveDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().find_element_user(MULTICURVEDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiCurveDomain" element
     */
    public void setMultiCurveDomain(net.opengis.gml.x32.DomainSetType multiCurveDomain)
    {
        generatedSetterHelperImpl(multiCurveDomain, MULTICURVEDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiCurveDomain" element
     */
    public net.opengis.gml.x32.DomainSetType addNewMultiCurveDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().add_element_user(MULTICURVEDOMAIN$0);
            return target;
        }
    }
}
