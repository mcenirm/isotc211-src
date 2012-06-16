/*
 * An XML document type.
 * Localname: usesVerticalCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesVerticalCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesVerticalCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesVerticalCSDocumentImpl extends net.opengis.gml.x32.impl.VerticalCSDocumentImpl implements net.opengis.gml.x32.UsesVerticalCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesVerticalCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESVERTICALCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesVerticalCS");
    
    
    /**
     * Gets the "usesVerticalCS" element
     */
    public net.opengis.gml.x32.VerticalCSPropertyType getUsesVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().find_element_user(USESVERTICALCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesVerticalCS" element
     */
    public void setUsesVerticalCS(net.opengis.gml.x32.VerticalCSPropertyType usesVerticalCS)
    {
        generatedSetterHelperImpl(usesVerticalCS, USESVERTICALCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesVerticalCS" element
     */
    public net.opengis.gml.x32.VerticalCSPropertyType addNewUsesVerticalCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.VerticalCSPropertyType target = null;
            target = (net.opengis.gml.x32.VerticalCSPropertyType)get_store().add_element_user(USESVERTICALCS$0);
            return target;
        }
    }
}
