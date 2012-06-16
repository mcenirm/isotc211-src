/*
 * An XML document type.
 * Localname: componentReferenceSystem
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ComponentReferenceSystemDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one componentReferenceSystem(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ComponentReferenceSystemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ComponentReferenceSystemDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComponentReferenceSystemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTREFERENCESYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "componentReferenceSystem");
    private static final org.apache.xmlbeans.QNameSet COMPONENTREFERENCESYSTEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "componentReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesSingleCRS"),
    });
    
    
    /**
     * Gets the "componentReferenceSystem" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType getComponentReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().find_element_user(COMPONENTREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "componentReferenceSystem" element
     */
    public void setComponentReferenceSystem(net.opengis.gml.x32.SingleCRSPropertyType componentReferenceSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().find_element_user(COMPONENTREFERENCESYSTEM$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().add_element_user(COMPONENTREFERENCESYSTEM$0);
            }
            target.set(componentReferenceSystem);
        }
    }
    
    /**
     * Appends and returns a new empty "componentReferenceSystem" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType addNewComponentReferenceSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().add_element_user(COMPONENTREFERENCESYSTEM$0);
            return target;
        }
    }
}
