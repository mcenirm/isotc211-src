/*
 * An XML document type.
 * Localname: GeometricComplex
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GeometricComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one GeometricComplex(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GeometricComplexDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometryDocumentImpl implements net.opengis.gml.x32.GeometricComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometricComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRICCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeometricComplex");
    
    
    /**
     * Gets the "GeometricComplex" element
     */
    public net.opengis.gml.x32.GeometricComplexType getGeometricComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometricComplexType target = null;
            target = (net.opengis.gml.x32.GeometricComplexType)get_store().find_element_user(GEOMETRICCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeometricComplex" element
     */
    public void setGeometricComplex(net.opengis.gml.x32.GeometricComplexType geometricComplex)
    {
        generatedSetterHelperImpl(geometricComplex, GEOMETRICCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GeometricComplex" element
     */
    public net.opengis.gml.x32.GeometricComplexType addNewGeometricComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.GeometricComplexType target = null;
            target = (net.opengis.gml.x32.GeometricComplexType)get_store().add_element_user(GEOMETRICCOMPLEX$0);
            return target;
        }
    }
}
