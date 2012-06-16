/*
 * An XML document type.
 * Localname: multiExtentOf
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiExtentOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiExtentOf(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiExtentOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiExtentOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiExtentOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIEXTENTOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiExtentOf");
    
    
    /**
     * Gets the "multiExtentOf" element
     */
    public net.opengis.gml.x32.MultiSurfacePropertyType getMultiExtentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.x32.MultiSurfacePropertyType)get_store().find_element_user(MULTIEXTENTOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiExtentOf" element
     */
    public void setMultiExtentOf(net.opengis.gml.x32.MultiSurfacePropertyType multiExtentOf)
    {
        generatedSetterHelperImpl(multiExtentOf, MULTIEXTENTOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiExtentOf" element
     */
    public net.opengis.gml.x32.MultiSurfacePropertyType addNewMultiExtentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.x32.MultiSurfacePropertyType)get_store().add_element_user(MULTIEXTENTOF$0);
            return target;
        }
    }
}
