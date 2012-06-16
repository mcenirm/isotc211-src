/*
 * An XML document type.
 * Localname: derivedCRSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DerivedCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one derivedCRSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DerivedCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DerivedCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "derivedCRSRef");
    
    
    /**
     * Gets the "derivedCRSRef" element
     */
    public net.opengis.gml.x32.DerivedCRSPropertyType getDerivedCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivedCRSPropertyType target = null;
            target = (net.opengis.gml.x32.DerivedCRSPropertyType)get_store().find_element_user(DERIVEDCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivedCRSRef" element
     */
    public void setDerivedCRSRef(net.opengis.gml.x32.DerivedCRSPropertyType derivedCRSRef)
    {
        generatedSetterHelperImpl(derivedCRSRef, DERIVEDCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivedCRSRef" element
     */
    public net.opengis.gml.x32.DerivedCRSPropertyType addNewDerivedCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DerivedCRSPropertyType target = null;
            target = (net.opengis.gml.x32.DerivedCRSPropertyType)get_store().add_element_user(DERIVEDCRSREF$0);
            return target;
        }
    }
}
