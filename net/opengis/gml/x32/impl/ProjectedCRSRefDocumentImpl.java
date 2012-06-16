/*
 * An XML document type.
 * Localname: projectedCRSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ProjectedCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one projectedCRSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ProjectedCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ProjectedCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProjectedCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROJECTEDCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "projectedCRSRef");
    
    
    /**
     * Gets the "projectedCRSRef" element
     */
    public net.opengis.gml.x32.ProjectedCRSPropertyType getProjectedCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ProjectedCRSPropertyType target = null;
            target = (net.opengis.gml.x32.ProjectedCRSPropertyType)get_store().find_element_user(PROJECTEDCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "projectedCRSRef" element
     */
    public void setProjectedCRSRef(net.opengis.gml.x32.ProjectedCRSPropertyType projectedCRSRef)
    {
        generatedSetterHelperImpl(projectedCRSRef, PROJECTEDCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "projectedCRSRef" element
     */
    public net.opengis.gml.x32.ProjectedCRSPropertyType addNewProjectedCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ProjectedCRSPropertyType target = null;
            target = (net.opengis.gml.x32.ProjectedCRSPropertyType)get_store().add_element_user(PROJECTEDCRSREF$0);
            return target;
        }
    }
}
