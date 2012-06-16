/*
 * An XML document type.
 * Localname: includesSingleCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.IncludesSingleCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one includesSingleCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class IncludesSingleCRSDocumentImpl extends net.opengis.gml.x32.impl.ComponentReferenceSystemDocumentImpl implements net.opengis.gml.x32.IncludesSingleCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludesSingleCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDESSINGLECRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "includesSingleCRS");
    
    
    /**
     * Gets the "includesSingleCRS" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType getIncludesSingleCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().find_element_user(INCLUDESSINGLECRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "includesSingleCRS" element
     */
    public void setIncludesSingleCRS(net.opengis.gml.x32.SingleCRSPropertyType includesSingleCRS)
    {
        generatedSetterHelperImpl(includesSingleCRS, INCLUDESSINGLECRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "includesSingleCRS" element
     */
    public net.opengis.gml.x32.SingleCRSPropertyType addNewIncludesSingleCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SingleCRSPropertyType target = null;
            target = (net.opengis.gml.x32.SingleCRSPropertyType)get_store().add_element_user(INCLUDESSINGLECRS$0);
            return target;
        }
    }
}
