/*
 * XML Type:  DiscreteCoverageType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DiscreteCoverageType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML DiscreteCoverageType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class DiscreteCoverageTypeImpl extends net.opengis.gml.x32.impl.AbstractCoverageTypeImpl implements net.opengis.gml.x32.DiscreteCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public DiscreteCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COVERAGEFUNCTION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "coverageFunction");
    
    
    /**
     * Gets the "coverageFunction" element
     */
    public net.opengis.gml.x32.CoverageFunctionType getCoverageFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoverageFunctionType target = null;
            target = (net.opengis.gml.x32.CoverageFunctionType)get_store().find_element_user(COVERAGEFUNCTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "coverageFunction" element
     */
    public boolean isSetCoverageFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COVERAGEFUNCTION$0) != 0;
        }
    }
    
    /**
     * Sets the "coverageFunction" element
     */
    public void setCoverageFunction(net.opengis.gml.x32.CoverageFunctionType coverageFunction)
    {
        generatedSetterHelperImpl(coverageFunction, COVERAGEFUNCTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "coverageFunction" element
     */
    public net.opengis.gml.x32.CoverageFunctionType addNewCoverageFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CoverageFunctionType target = null;
            target = (net.opengis.gml.x32.CoverageFunctionType)get_store().add_element_user(COVERAGEFUNCTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "coverageFunction" element
     */
    public void unsetCoverageFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COVERAGEFUNCTION$0, 0);
        }
    }
}
