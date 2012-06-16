/*
 * An XML document type.
 * Localname: EllipsoidalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EllipsoidalCSDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one EllipsoidalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EllipsoidalCSDocument2Impl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.EllipsoidalCSDocument2
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidalCSDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EllipsoidalCS");
    
    
    /**
     * Gets the "EllipsoidalCS" element
     */
    public net.opengis.gml.x32.EllipsoidalCSType getEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSType)get_store().find_element_user(ELLIPSOIDALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EllipsoidalCS" element
     */
    public void setEllipsoidalCS(net.opengis.gml.x32.EllipsoidalCSType ellipsoidalCS)
    {
        generatedSetterHelperImpl(ellipsoidalCS, ELLIPSOIDALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EllipsoidalCS" element
     */
    public net.opengis.gml.x32.EllipsoidalCSType addNewEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSType)get_store().add_element_user(ELLIPSOIDALCS$0);
            return target;
        }
    }
}
