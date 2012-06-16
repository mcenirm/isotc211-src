/*
 * An XML document type.
 * Localname: ProjectedCRS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ProjectedCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ProjectedCRS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ProjectedCRSDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeneralDerivedCRSDocumentImpl implements net.opengis.gml.x32.ProjectedCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProjectedCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROJECTEDCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ProjectedCRS");
    
    
    /**
     * Gets the "ProjectedCRS" element
     */
    public net.opengis.gml.x32.ProjectedCRSType getProjectedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ProjectedCRSType target = null;
            target = (net.opengis.gml.x32.ProjectedCRSType)get_store().find_element_user(PROJECTEDCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProjectedCRS" element
     */
    public void setProjectedCRS(net.opengis.gml.x32.ProjectedCRSType projectedCRS)
    {
        generatedSetterHelperImpl(projectedCRS, PROJECTEDCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProjectedCRS" element
     */
    public net.opengis.gml.x32.ProjectedCRSType addNewProjectedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ProjectedCRSType target = null;
            target = (net.opengis.gml.x32.ProjectedCRSType)get_store().add_element_user(PROJECTEDCRS$0);
            return target;
        }
    }
}
