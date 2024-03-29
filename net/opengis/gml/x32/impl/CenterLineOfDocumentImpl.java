/*
 * An XML document type.
 * Localname: centerLineOf
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CenterLineOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one centerLineOf(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CenterLineOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.CenterLineOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public CenterLineOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CENTERLINEOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "centerLineOf");
    
    
    /**
     * Gets the "centerLineOf" element
     */
    public net.opengis.gml.x32.CurvePropertyType getCenterLineOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().find_element_user(CENTERLINEOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "centerLineOf" element
     */
    public void setCenterLineOf(net.opengis.gml.x32.CurvePropertyType centerLineOf)
    {
        generatedSetterHelperImpl(centerLineOf, CENTERLINEOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "centerLineOf" element
     */
    public net.opengis.gml.x32.CurvePropertyType addNewCenterLineOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurvePropertyType target = null;
            target = (net.opengis.gml.x32.CurvePropertyType)get_store().add_element_user(CENTERLINEOF$0);
            return target;
        }
    }
}
