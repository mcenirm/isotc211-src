/*
 * An XML document type.
 * Localname: derivedCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DerivedCRSTypeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one derivedCRSType(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DerivedCRSTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DerivedCRSTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDCRSTYPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "derivedCRSType");
    
    
    /**
     * Gets the "derivedCRSType" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType getDerivedCRSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().find_element_user(DERIVEDCRSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivedCRSType" element
     */
    public void setDerivedCRSType(net.opengis.gml.x32.CodeWithAuthorityType derivedCRSType)
    {
        generatedSetterHelperImpl(derivedCRSType, DERIVEDCRSTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivedCRSType" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType addNewDerivedCRSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().add_element_user(DERIVEDCRSTYPE$0);
            return target;
        }
    }
}
