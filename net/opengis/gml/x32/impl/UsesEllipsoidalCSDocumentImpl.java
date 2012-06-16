/*
 * An XML document type.
 * Localname: usesEllipsoidalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesEllipsoidalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesEllipsoidalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesEllipsoidalCSDocumentImpl extends net.opengis.gml.x32.impl.EllipsoidalCSDocumentImpl implements net.opengis.gml.x32.UsesEllipsoidalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesEllipsoidalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESELLIPSOIDALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesEllipsoidalCS");
    
    
    /**
     * Gets the "usesEllipsoidalCS" element
     */
    public net.opengis.gml.x32.EllipsoidalCSPropertyType getUsesEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().find_element_user(USESELLIPSOIDALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEllipsoidalCS" element
     */
    public void setUsesEllipsoidalCS(net.opengis.gml.x32.EllipsoidalCSPropertyType usesEllipsoidalCS)
    {
        generatedSetterHelperImpl(usesEllipsoidalCS, USESELLIPSOIDALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEllipsoidalCS" element
     */
    public net.opengis.gml.x32.EllipsoidalCSPropertyType addNewUsesEllipsoidalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.EllipsoidalCSPropertyType target = null;
            target = (net.opengis.gml.x32.EllipsoidalCSPropertyType)get_store().add_element_user(USESELLIPSOIDALCS$0);
            return target;
        }
    }
}
