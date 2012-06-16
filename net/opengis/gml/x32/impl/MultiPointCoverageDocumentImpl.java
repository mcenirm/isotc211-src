/*
 * An XML document type.
 * Localname: MultiPointCoverage
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiPointCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one MultiPointCoverage(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiPointCoverageDocumentImpl extends net.opengis.gml.x32.impl.AbstractDiscreteCoverageDocumentImpl implements net.opengis.gml.x32.MultiPointCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiPointCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOINTCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPointCoverage");
    
    
    /**
     * Gets the "MultiPointCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType getMultiPointCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().find_element_user(MULTIPOINTCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiPointCoverage" element
     */
    public void setMultiPointCoverage(net.opengis.gml.x32.DiscreteCoverageType multiPointCoverage)
    {
        generatedSetterHelperImpl(multiPointCoverage, MULTIPOINTCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiPointCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType addNewMultiPointCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().add_element_user(MULTIPOINTCOVERAGE$0);
            return target;
        }
    }
}
