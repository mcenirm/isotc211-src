/*
 * An XML document type.
 * Localname: usesCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesCSDocumentImpl extends net.opengis.gml.x32.impl.CoordinateSystemDocumentImpl implements net.opengis.gml.x32.UsesCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesCS");
    
    
    /**
     * Gets the "usesCS" element
     */
    public net.opengis.gml.x32.CoordinateSystemPropertyType getUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().find_element_user(USESCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesCS" element
     */
    public void setUsesCS(net.opengis.gml.x32.CoordinateSystemPropertyType usesCS)
    {
        generatedSetterHelperImpl(usesCS, USESCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesCS" element
     */
    public net.opengis.gml.x32.CoordinateSystemPropertyType addNewUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoordinateSystemPropertyType target = null;
            target = (net.opengis.gml.x32.CoordinateSystemPropertyType)get_store().add_element_user(USESCS$0);
            return target;
        }
    }
}
