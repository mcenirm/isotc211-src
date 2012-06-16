/*
 * An XML document type.
 * Localname: AbstractContinuousCoverage
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractContinuousCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractContinuousCoverage(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractContinuousCoverageDocumentImpl extends net.opengis.gml.x32.impl.AbstractFeatureDocumentImpl implements net.opengis.gml.x32.AbstractContinuousCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractContinuousCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTCONTINUOUSCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractContinuousCoverage");
    
    
    /**
     * Gets the "AbstractContinuousCoverage" element
     */
    public net.opengis.gml.x32.AbstractContinuousCoverageType getAbstractContinuousCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractContinuousCoverageType target = null;
            target = (net.opengis.gml.x32.AbstractContinuousCoverageType)get_store().find_element_user(ABSTRACTCONTINUOUSCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractContinuousCoverage" element
     */
    public void setAbstractContinuousCoverage(net.opengis.gml.x32.AbstractContinuousCoverageType abstractContinuousCoverage)
    {
        generatedSetterHelperImpl(abstractContinuousCoverage, ABSTRACTCONTINUOUSCOVERAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AbstractContinuousCoverage" element
     */
    public net.opengis.gml.x32.AbstractContinuousCoverageType addNewAbstractContinuousCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractContinuousCoverageType target = null;
            target = (net.opengis.gml.x32.AbstractContinuousCoverageType)get_store().add_element_user(ABSTRACTCONTINUOUSCOVERAGE$0);
            return target;
        }
    }
}
