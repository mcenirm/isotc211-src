/*
 * An XML document type.
 * Localname: TopoComplex
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one TopoComplex(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoComplexDocumentImpl extends net.opengis.gml.x32.impl.AbstractTopologyDocumentImpl implements net.opengis.gml.x32.TopoComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoComplex");
    
    
    /**
     * Gets the "TopoComplex" element
     */
    public net.opengis.gml.x32.TopoComplexType getTopoComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexType target = null;
            target = (net.opengis.gml.x32.TopoComplexType)get_store().find_element_user(TOPOCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoComplex" element
     */
    public void setTopoComplex(net.opengis.gml.x32.TopoComplexType topoComplex)
    {
        generatedSetterHelperImpl(topoComplex, TOPOCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoComplex" element
     */
    public net.opengis.gml.x32.TopoComplexType addNewTopoComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexType target = null;
            target = (net.opengis.gml.x32.TopoComplexType)get_store().add_element_user(TOPOCOMPLEX$0);
            return target;
        }
    }
}
