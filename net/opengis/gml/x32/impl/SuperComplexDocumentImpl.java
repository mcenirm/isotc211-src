/*
 * An XML document type.
 * Localname: superComplex
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SuperComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one superComplex(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SuperComplexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SuperComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public SuperComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPERCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "superComplex");
    
    
    /**
     * Gets the "superComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType getSuperComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().find_element_user(SUPERCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "superComplex" element
     */
    public void setSuperComplex(net.opengis.gml.x32.TopoComplexPropertyType superComplex)
    {
        generatedSetterHelperImpl(superComplex, SUPERCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "superComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType addNewSuperComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().add_element_user(SUPERCOMPLEX$0);
            return target;
        }
    }
}
