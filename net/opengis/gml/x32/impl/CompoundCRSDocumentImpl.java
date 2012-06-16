/*
 * An XML document type.
 * Localname: CompoundCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CompoundCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CompoundCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CompoundCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractCRSDocumentImpl implements net.opengis.gml.x32.CompoundCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompoundCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOUNDCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompoundCRS");
    
    
    /**
     * Gets the "CompoundCRS" element
     */
    public net.opengis.gml.x32.CompoundCRSType getCompoundCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompoundCRSType target = null;
            target = (net.opengis.gml.x32.CompoundCRSType)get_store().find_element_user(COMPOUNDCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompoundCRS" element
     */
    public void setCompoundCRS(net.opengis.gml.x32.CompoundCRSType compoundCRS)
    {
        generatedSetterHelperImpl(compoundCRS, COMPOUNDCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CompoundCRS" element
     */
    public net.opengis.gml.x32.CompoundCRSType addNewCompoundCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompoundCRSType target = null;
            target = (net.opengis.gml.x32.CompoundCRSType)get_store().add_element_user(COMPOUNDCRS$0);
            return target;
        }
    }
}
