/*
 * An XML document type.
 * Localname: extentOf
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ExtentOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one extentOf(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ExtentOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ExtentOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtentOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENTOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "extentOf");
    
    
    /**
     * Gets the "extentOf" element
     */
    public net.opengis.gml.x32.SurfacePropertyType getExtentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().find_element_user(EXTENTOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extentOf" element
     */
    public void setExtentOf(net.opengis.gml.x32.SurfacePropertyType extentOf)
    {
        generatedSetterHelperImpl(extentOf, EXTENTOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extentOf" element
     */
    public net.opengis.gml.x32.SurfacePropertyType addNewExtentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SurfacePropertyType target = null;
            target = (net.opengis.gml.x32.SurfacePropertyType)get_store().add_element_user(EXTENTOF$0);
            return target;
        }
    }
}
