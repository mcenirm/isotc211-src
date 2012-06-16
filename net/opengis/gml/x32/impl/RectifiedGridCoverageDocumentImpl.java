/*
 * An XML document type.
 * Localname: RectifiedGridCoverage
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.RectifiedGridCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one RectifiedGridCoverage(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class RectifiedGridCoverageDocumentImpl extends net.opengis.gml.x32.impl.AbstractDiscreteCoverageDocumentImpl implements net.opengis.gml.x32.RectifiedGridCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public RectifiedGridCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECTIFIEDGRIDCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGridCoverage");
    
    
    /**
     * Gets the "RectifiedGridCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType getRectifiedGridCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().find_element_user(RECTIFIEDGRIDCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RectifiedGridCoverage" element
     */
    public void setRectifiedGridCoverage(net.opengis.gml.x32.DiscreteCoverageType rectifiedGridCoverage)
    {
        generatedSetterHelperImpl(rectifiedGridCoverage, RECTIFIEDGRIDCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RectifiedGridCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType addNewRectifiedGridCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().add_element_user(RECTIFIEDGRIDCOVERAGE$0);
            return target;
        }
    }
}
