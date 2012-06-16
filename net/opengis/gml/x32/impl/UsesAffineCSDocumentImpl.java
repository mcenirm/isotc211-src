/*
 * An XML document type.
 * Localname: usesAffineCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UsesAffineCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one usesAffineCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UsesAffineCSDocumentImpl extends net.opengis.gml.x32.impl.AffineCSDocumentImpl implements net.opengis.gml.x32.UsesAffineCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesAffineCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESAFFINECS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesAffineCS");
    
    
    /**
     * Gets the "usesAffineCS" element
     */
    public net.opengis.gml.x32.AffineCSPropertyType getUsesAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().find_element_user(USESAFFINECS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesAffineCS" element
     */
    public void setUsesAffineCS(net.opengis.gml.x32.AffineCSPropertyType usesAffineCS)
    {
        generatedSetterHelperImpl(usesAffineCS, USESAFFINECS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesAffineCS" element
     */
    public net.opengis.gml.x32.AffineCSPropertyType addNewUsesAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().add_element_user(USESAFFINECS$0);
            return target;
        }
    }
}
