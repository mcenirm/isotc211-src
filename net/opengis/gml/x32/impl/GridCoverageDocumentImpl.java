/*
 * An XML document type.
 * Localname: GridCoverage
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GridCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one GridCoverage(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GridCoverageDocumentImpl extends net.opengis.gml.x32.impl.AbstractDiscreteCoverageDocumentImpl implements net.opengis.gml.x32.GridCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public GridCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRIDCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridCoverage");
    
    
    /**
     * Gets the "GridCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType getGridCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().find_element_user(GRIDCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GridCoverage" element
     */
    public void setGridCoverage(net.opengis.gml.x32.DiscreteCoverageType gridCoverage)
    {
        generatedSetterHelperImpl(gridCoverage, GRIDCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "GridCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType addNewGridCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().add_element_user(GRIDCOVERAGE$0);
            return target;
        }
    }
}
