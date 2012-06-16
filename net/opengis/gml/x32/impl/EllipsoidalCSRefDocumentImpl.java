/*
 * An XML document type.
 * Localname: ellipsoidalCSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EllipsoidalCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ellipsoidalCSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class EllipsoidalCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.EllipsoidalCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidalCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDALCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ellipsoidalCSRef");
    
    
    /**
     * Gets the "ellipsoidalCSRef" element
     */
    public net.opengis.gml.x32.EllipsoidalCSPropertyType getEllipsoidalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().find_element_user(ELLIPSOIDALCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ellipsoidalCSRef" element
     */
    public void setEllipsoidalCSRef(net.opengis.gml.x32.EllipsoidalCSPropertyType ellipsoidalCSRef)
    {
        generatedSetterHelperImpl(ellipsoidalCSRef, ELLIPSOIDALCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ellipsoidalCSRef" element
     */
    public net.opengis.gml.x32.EllipsoidalCSPropertyType addNewEllipsoidalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().add_element_user(ELLIPSOIDALCSREF$0);
            return target;
        }
    }
}
