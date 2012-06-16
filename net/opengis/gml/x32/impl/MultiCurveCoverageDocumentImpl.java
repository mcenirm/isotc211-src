/*
 * An XML document type.
 * Localname: MultiCurveCoverage
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiCurveCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one MultiCurveCoverage(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiCurveCoverageDocumentImpl extends net.opengis.gml.x32.impl.AbstractDiscreteCoverageDocumentImpl implements net.opengis.gml.x32.MultiCurveCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiCurveCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTICURVECOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurveCoverage");
    
    
    /**
     * Gets the "MultiCurveCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType getMultiCurveCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().find_element_user(MULTICURVECOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MultiCurveCoverage" element
     */
    public void setMultiCurveCoverage(net.opengis.gml.x32.DiscreteCoverageType multiCurveCoverage)
    {
        generatedSetterHelperImpl(multiCurveCoverage, MULTICURVECOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MultiCurveCoverage" element
     */
    public net.opengis.gml.x32.DiscreteCoverageType addNewMultiCurveCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DiscreteCoverageType target = null;
            target = (net.opengis.gml.x32.DiscreteCoverageType)get_store().add_element_user(MULTICURVECOVERAGE$0);
            return target;
        }
    }
}
