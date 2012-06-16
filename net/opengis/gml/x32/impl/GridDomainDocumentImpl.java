/*
 * An XML document type.
 * Localname: gridDomain
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GridDomainDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one gridDomain(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GridDomainDocumentImpl extends net.opengis.gml.x32.impl.DomainSetDocumentImpl implements net.opengis.gml.x32.GridDomainDocument
{
    private static final long serialVersionUID = 1L;
    
    public GridDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDDOMAIN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "gridDomain");
    
    
    /**
     * Gets the "gridDomain" element
     */
    public net.opengis.gml.x32.DomainSetType getGridDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().find_element_user(GRIDDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "gridDomain" element
     */
    public void setGridDomain(net.opengis.gml.x32.DomainSetType gridDomain)
    {
        generatedSetterHelperImpl(gridDomain, GRIDDOMAIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "gridDomain" element
     */
    public net.opengis.gml.x32.DomainSetType addNewGridDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DomainSetType target = null;
            target = (net.opengis.gml.x32.DomainSetType)get_store().add_element_user(GRIDDOMAIN$0);
            return target;
        }
    }
}
