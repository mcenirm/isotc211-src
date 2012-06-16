/*
 * An XML document type.
 * Localname: multiCoverage
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiCoverage(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiCoverageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiCoverage");
    
    
    /**
     * Gets the "multiCoverage" element
     */
    public net.opengis.gml.x32.MultiSurfacePropertyType getMultiCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.x32.MultiSurfacePropertyType)get_store().find_element_user(MULTICOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiCoverage" element
     */
    public void setMultiCoverage(net.opengis.gml.x32.MultiSurfacePropertyType multiCoverage)
    {
        generatedSetterHelperImpl(multiCoverage, MULTICOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiCoverage" element
     */
    public net.opengis.gml.x32.MultiSurfacePropertyType addNewMultiCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.x32.MultiSurfacePropertyType)get_store().add_element_user(MULTICOVERAGE$0);
            return target;
        }
    }
}
