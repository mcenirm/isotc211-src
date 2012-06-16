/*
 * An XML document type.
 * Localname: AbstractCoverage
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractCoverage(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractCoverageDocumentImpl extends net.opengis.gml.x32.impl.AbstractFeatureDocumentImpl implements net.opengis.gml.x32.AbstractCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoverage");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTCOVERAGE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridCoverage"),
    });
    
    
    /**
     * Gets the "AbstractCoverage" element
     */
    public net.opengis.gml.x32.AbstractCoverageType getAbstractCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoverageType target = null;
            target = (net.opengis.gml.x32.AbstractCoverageType)get_store().find_element_user(ABSTRACTCOVERAGE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractCoverage" element
     */
    public void setAbstractCoverage(net.opengis.gml.x32.AbstractCoverageType abstractCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoverageType target = null;
            target = (net.opengis.gml.x32.AbstractCoverageType)get_store().find_element_user(ABSTRACTCOVERAGE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractCoverageType)get_store().add_element_user(ABSTRACTCOVERAGE$0);
            }
            target.set(abstractCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractCoverage" element
     */
    public net.opengis.gml.x32.AbstractCoverageType addNewAbstractCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCoverageType target = null;
            target = (net.opengis.gml.x32.AbstractCoverageType)get_store().add_element_user(ABSTRACTCOVERAGE$0);
            return target;
        }
    }
}
