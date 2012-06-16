/*
 * An XML document type.
 * Localname: semiMajorAxis
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SemiMajorAxisDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one semiMajorAxis(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SemiMajorAxisDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SemiMajorAxisDocument
{
    private static final long serialVersionUID = 1L;
    
    public SemiMajorAxisDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEMIMAJORAXIS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "semiMajorAxis");
    
    
    /**
     * Gets the "semiMajorAxis" element
     */
    public net.opengis.gml.x32.MeasureType getSemiMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().find_element_user(SEMIMAJORAXIS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "semiMajorAxis" element
     */
    public void setSemiMajorAxis(net.opengis.gml.x32.MeasureType semiMajorAxis)
    {
        generatedSetterHelperImpl(semiMajorAxis, SEMIMAJORAXIS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "semiMajorAxis" element
     */
    public net.opengis.gml.x32.MeasureType addNewSemiMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MeasureType target = null;
            target = (net.opengis.gml.x32.MeasureType)get_store().add_element_user(SEMIMAJORAXIS$0);
            return target;
        }
    }
}
