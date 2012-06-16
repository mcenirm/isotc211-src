/*
 * An XML document type.
 * Localname: usesEllipsoid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesEllipsoidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesEllipsoid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesEllipsoidDocumentImpl extends net.opengis.gml.x32.impl.EllipsoidDocumentImpl implements net.opengis.gml.x32.UsesEllipsoidDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesEllipsoidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESELLIPSOID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesEllipsoid");
    
    
    /**
     * Gets the "usesEllipsoid" element
     */
    public net.opengis.gml.x32.EllipsoidPropertyType getUsesEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().find_element_user(USESELLIPSOID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEllipsoid" element
     */
    public void setUsesEllipsoid(net.opengis.gml.x32.EllipsoidPropertyType usesEllipsoid)
    {
        generatedSetterHelperImpl(usesEllipsoid, USESELLIPSOID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEllipsoid" element
     */
    public net.opengis.gml.x32.EllipsoidPropertyType addNewUsesEllipsoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().add_element_user(USESELLIPSOID$0);
            return target;
        }
    }
}
