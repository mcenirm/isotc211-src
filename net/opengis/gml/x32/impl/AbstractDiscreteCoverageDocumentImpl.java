/*
 * An XML document type.
 * Localname: AbstractDiscreteCoverage
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractDiscreteCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractDiscreteCoverage(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractDiscreteCoverageDocumentImpl extends net.opengis.gml.x32.impl.AbstractCoverageDocumentImpl implements net.opengis.gml.x32.AbstractDiscreteCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDiscreteCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTDISCRETECOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDiscreteCoverage");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTDISCRETECOVERAGE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridCoverage"),
    });
    
    
    /**
     * Gets the "AbstractDiscreteCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType getAbstractDiscreteCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().find_element_user(ABSTRACTDISCRETECOVERAGE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractDiscreteCoverage" element
     */
    public void setAbstractDiscreteCoverage(net.opengis.gml.x32.DiscreteCoverageType abstractDiscreteCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().find_element_user(ABSTRACTDISCRETECOVERAGE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().add_element_user(ABSTRACTDISCRETECOVERAGE$0);
            }
            target.set(abstractDiscreteCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractDiscreteCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType addNewAbstractDiscreteCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().add_element_user(ABSTRACTDISCRETECOVERAGE$0);
            return target;
        }
    }
}
