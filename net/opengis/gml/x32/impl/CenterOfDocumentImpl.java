/*
 * An XML document type.
 * Localname: centerOf
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CenterOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one centerOf(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CenterOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CenterOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public CenterOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CENTEROF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "centerOf");
    
    
    /**
     * Gets the "centerOf" element
     */
    public net.opengis.gml.x32.PointPropertyType getCenterOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().find_element_user(CENTEROF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "centerOf" element
     */
    public void setCenterOf(net.opengis.gml.x32.PointPropertyType centerOf)
    {
        generatedSetterHelperImpl(centerOf, CENTEROF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "centerOf" element
     */
    public net.opengis.gml.x32.PointPropertyType addNewCenterOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointPropertyType target = null;
            target = (net.opengis.gml.x32.PointPropertyType)get_store().add_element_user(CENTEROF$0);
            return target;
        }
    }
}
