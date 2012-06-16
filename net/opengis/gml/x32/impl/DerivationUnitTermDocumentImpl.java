/*
 * An XML document type.
 * Localname: derivationUnitTerm
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DerivationUnitTermDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one derivationUnitTerm(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DerivationUnitTermDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DerivationUnitTermDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivationUnitTermDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVATIONUNITTERM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "derivationUnitTerm");
    
    
    /**
     * Gets the "derivationUnitTerm" element
     */
    public net.opengis.gml.x32.DerivationUnitTermType getDerivationUnitTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivationUnitTermType target = null;
            target = (net.opengis.gml.x32.DerivationUnitTermType)get_store().find_element_user(DERIVATIONUNITTERM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivationUnitTerm" element
     */
    public void setDerivationUnitTerm(net.opengis.gml.x32.DerivationUnitTermType derivationUnitTerm)
    {
        generatedSetterHelperImpl(derivationUnitTerm, DERIVATIONUNITTERM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivationUnitTerm" element
     */
    public net.opengis.gml.x32.DerivationUnitTermType addNewDerivationUnitTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivationUnitTermType target = null;
            target = (net.opengis.gml.x32.DerivationUnitTermType)get_store().add_element_user(DERIVATIONUNITTERM$0);
            return target;
        }
    }
}
