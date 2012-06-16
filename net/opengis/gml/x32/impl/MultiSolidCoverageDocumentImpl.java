/*
 * An XML document type.
 * Localname: MultiSolidCoverage
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiSolidCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one MultiSolidCoverage(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiSolidCoverageDocumentImpl extends net.opengis.gml.x32.impl.AbstractDiscreteCoverageDocumentImpl implements net.opengis.gml.x32.MultiSolidCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiSolidCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTISOLIDCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolidCoverage");
    
    
    /**
     * Gets the "MultiSolidCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType getMultiSolidCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().find_element_user(MULTISOLIDCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiSolidCoverage" element
     */
    public void setMultiSolidCoverage(net.opengis.gml.x32.DiscreteCoverageType multiSolidCoverage)
    {
        generatedSetterHelperImpl(multiSolidCoverage, MULTISOLIDCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiSolidCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType addNewMultiSolidCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().add_element_user(MULTISOLIDCOVERAGE$0);
            return target;
        }
    }
}
