/*
 * An XML document type.
 * Localname: ellipsoidRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EllipsoidRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ellipsoidRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EllipsoidRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.EllipsoidRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ellipsoidRef");
    
    
    /**
     * Gets the "ellipsoidRef" element
     */
    public net.opengis.gml.x32.EllipsoidPropertyType getEllipsoidRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().find_element_user(ELLIPSOIDREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ellipsoidRef" element
     */
    public void setEllipsoidRef(net.opengis.gml.x32.EllipsoidPropertyType ellipsoidRef)
    {
        generatedSetterHelperImpl(ellipsoidRef, ELLIPSOIDREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ellipsoidRef" element
     */
    public net.opengis.gml.x32.EllipsoidPropertyType addNewEllipsoidRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidPropertyType)get_store().add_element_user(ELLIPSOIDREF$0);
            return target;
        }
    }
}
