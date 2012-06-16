/*
 * An XML document type.
 * Localname: MultiSurfaceCoverage
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiSurfaceCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one MultiSurfaceCoverage(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiSurfaceCoverageDocumentImpl extends net.opengis.gml.x32.impl.AbstractDiscreteCoverageDocumentImpl implements net.opengis.gml.x32.MultiSurfaceCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSurfaceCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISURFACECOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurfaceCoverage");
    
    
    /**
     * Gets the "MultiSurfaceCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType getMultiSurfaceCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().find_element_user(MULTISURFACECOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiSurfaceCoverage" element
     */
    public void setMultiSurfaceCoverage(net.opengis.gml.x32.DiscreteCoverageType multiSurfaceCoverage)
    {
        generatedSetterHelperImpl(multiSurfaceCoverage, MULTISURFACECOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiSurfaceCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType addNewMultiSurfaceCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().add_element_user(MULTISURFACECOVERAGE$0);
            return target;
        }
    }
}
