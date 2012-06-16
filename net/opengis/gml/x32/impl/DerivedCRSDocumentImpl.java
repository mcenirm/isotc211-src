/*
 * An XML document type.
 * Localname: DerivedCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DerivedCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one DerivedCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DerivedCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeneralDerivedCRSDocumentImpl implements net.opengis.gml.x32.DerivedCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedCRS");
    
    
    /**
     * Gets the "DerivedCRS" element
     */
    public net.opengis.gml.x32.DerivedCRSType getDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivedCRSType target = null;
            target = (net.opengis.gml.x32.DerivedCRSType)get_store().find_element_user(DERIVEDCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DerivedCRS" element
     */
    public void setDerivedCRS(net.opengis.gml.x32.DerivedCRSType derivedCRS)
    {
        generatedSetterHelperImpl(derivedCRS, DERIVEDCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DerivedCRS" element
     */
    public net.opengis.gml.x32.DerivedCRSType addNewDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivedCRSType target = null;
            target = (net.opengis.gml.x32.DerivedCRSType)get_store().add_element_user(DERIVEDCRS$0);
            return target;
        }
    }
}
