/*
 * An XML document type.
 * Localname: maximalComplex
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MaximalComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one maximalComplex(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MaximalComplexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MaximalComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public MaximalComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXIMALCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "maximalComplex");
    
    
    /**
     * Gets the "maximalComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType getMaximalComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().find_element_user(MAXIMALCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maximalComplex" element
     */
    public void setMaximalComplex(net.opengis.gml.x32.TopoComplexPropertyType maximalComplex)
    {
        generatedSetterHelperImpl(maximalComplex, MAXIMALCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maximalComplex" element
     */
    public net.opengis.gml.x32.TopoComplexPropertyType addNewMaximalComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoComplexPropertyType target = null;
            target = (net.opengis.gml.x32.TopoComplexPropertyType)get_store().add_element_user(MAXIMALCOMPLEX$0);
            return target;
        }
    }
}
