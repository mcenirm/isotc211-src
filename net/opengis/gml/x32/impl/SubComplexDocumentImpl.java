/*
 * An XML document type.
 * Localname: subComplex
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SubComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one subComplex(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SubComplexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SubComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "subComplex");
    
    
    /**
     * Gets the "subComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType getSubComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().find_element_user(SUBCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subComplex" element
     */
    public void setSubComplex(net.opengis.gml.x32.TopoComplexPropertyType subComplex)
    {
        generatedSetterHelperImpl(subComplex, SUBCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType addNewSubComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().add_element_user(SUBCOMPLEX$0);
            return target;
        }
    }
}
