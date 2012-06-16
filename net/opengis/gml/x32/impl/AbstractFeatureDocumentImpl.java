/*
 * An XML document type.
 * Localname: AbstractFeature
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractFeatureDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractFeature(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractFeatureDocumentImpl extends net.opengis.gml.x32.impl.AbstractGMLDocumentImpl implements net.opengis.gml.x32.AbstractFeatureDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractFeatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTFEATURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeature");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTFEATURE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractContinuousCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservationAtDistance"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeature"),
    });
    
    
    /**
     * Gets the "AbstractFeature" element
     */
    public net.opengis.gml.x32.AbstractFeatureType getAbstractFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractFeatureType target = null;
            target = (net.opengis.gml.x32.AbstractFeatureType)get_store().find_element_user(ABSTRACTFEATURE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractFeature" element
     */
    public void setAbstractFeature(net.opengis.gml.x32.AbstractFeatureType abstractFeature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractFeatureType target = null;
            target = (net.opengis.gml.x32.AbstractFeatureType)get_store().find_element_user(ABSTRACTFEATURE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractFeatureType)get_store().add_element_user(ABSTRACTFEATURE$0);
            }
            target.set(abstractFeature);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractFeature" element
     */
    public net.opengis.gml.x32.AbstractFeatureType addNewAbstractFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractFeatureType target = null;
            target = (net.opengis.gml.x32.AbstractFeatureType)get_store().add_element_user(ABSTRACTFEATURE$0);
            return target;
        }
    }
}
