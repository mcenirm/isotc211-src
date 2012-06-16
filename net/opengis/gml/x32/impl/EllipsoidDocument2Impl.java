/*
 * An XML document type.
 * Localname: Ellipsoid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EllipsoidDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Ellipsoid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EllipsoidDocument2Impl extends net.opengis.gml.x32.impl.DefinitionDocumentImpl implements net.opengis.gml.x32.EllipsoidDocument2
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Ellipsoid");
    
    
    /**
     * Gets the "Ellipsoid" element
     */
    public net.opengis.gml.x32.EllipsoidType getEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidType target = null;
            target = (net.opengis.gml.x32.EllipsoidType)get_store().find_element_user(ELLIPSOID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Ellipsoid" element
     */
    public void setEllipsoid(net.opengis.gml.x32.EllipsoidType ellipsoid)
    {
        generatedSetterHelperImpl(ellipsoid, ELLIPSOID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Ellipsoid" element
     */
    public net.opengis.gml.x32.EllipsoidType addNewEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidType target = null;
            target = (net.opengis.gml.x32.EllipsoidType)get_store().add_element_user(ELLIPSOID$0);
            return target;
        }
    }
}
