/*
 * An XML document type.
 * Localname: coverageFunction
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CoverageFunctionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one coverageFunction(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CoverageFunctionDocumentImpl extends net.opengis.gml.x32.impl.AbstractObjectDocumentImpl implements net.opengis.gml.x32.CoverageFunctionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoverageFunctionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
}
