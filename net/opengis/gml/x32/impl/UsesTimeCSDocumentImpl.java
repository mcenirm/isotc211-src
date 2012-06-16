/*
 * An XML document type.
 * Localname: usesTimeCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesTimeCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesTimeCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesTimeCSDocumentImpl extends net.opengis.gml.x32.impl.TimeCSDocumentImpl implements net.opengis.gml.x32.UsesTimeCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesTimeCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESTIMECS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesTimeCS");
    
    
    /**
     * Gets the "usesTimeCS" element
     */
    public net.opengis.gml.x32.TimeCSPropertyType getUsesTimeCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCSPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCSPropertyType)get_store().find_element_user(USESTIMECS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesTimeCS" element
     */
    public void setUsesTimeCS(net.opengis.gml.x32.TimeCSPropertyType usesTimeCS)
    {
        generatedSetterHelperImpl(usesTimeCS, USESTIMECS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesTimeCS" element
     */
    public net.opengis.gml.x32.TimeCSPropertyType addNewUsesTimeCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TimeCSPropertyType target = null;
            target = (net.opengis.gml.x32.TimeCSPropertyType)get_store().add_element_user(USESTIMECS$0);
            return target;
        }
    }
}
