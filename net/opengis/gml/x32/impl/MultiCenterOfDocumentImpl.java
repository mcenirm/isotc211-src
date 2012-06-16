/*
 * An XML document type.
 * Localname: multiCenterOf
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiCenterOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiCenterOf(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiCenterOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiCenterOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCenterOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICENTEROF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiCenterOf");
    
    
    /**
     * Gets the "multiCenterOf" element
     */
    public net.opengis.gml.x32.MultiPointPropertyType getMultiCenterOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiPointPropertyType target = null;
            target = (net.opengis.gml.x32.MultiPointPropertyType)get_store().find_element_user(MULTICENTEROF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiCenterOf" element
     */
    public void setMultiCenterOf(net.opengis.gml.x32.MultiPointPropertyType multiCenterOf)
    {
        generatedSetterHelperImpl(multiCenterOf, MULTICENTEROF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiCenterOf" element
     */
    public net.opengis.gml.x32.MultiPointPropertyType addNewMultiCenterOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiPointPropertyType target = null;
            target = (net.opengis.gml.x32.MultiPointPropertyType)get_store().add_element_user(MULTICENTEROF$0);
            return target;
        }
    }
}
