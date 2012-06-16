/*
 * An XML document type.
 * Localname: polarCSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PolarCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one polarCSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PolarCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PolarCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolarCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLARCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "polarCSRef");
    
    
    /**
     * Gets the "polarCSRef" element
     */
    public net.opengis.gml.x32.PolarCSPropertyType getPolarCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolarCSPropertyType target = null;
            target = (net.opengis.gml.x32.PolarCSPropertyType)get_store().find_element_user(POLARCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "polarCSRef" element
     */
    public void setPolarCSRef(net.opengis.gml.x32.PolarCSPropertyType polarCSRef)
    {
        generatedSetterHelperImpl(polarCSRef, POLARCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "polarCSRef" element
     */
    public net.opengis.gml.x32.PolarCSPropertyType addNewPolarCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolarCSPropertyType target = null;
            target = (net.opengis.gml.x32.PolarCSPropertyType)get_store().add_element_user(POLARCSREF$0);
            return target;
        }
    }
}
