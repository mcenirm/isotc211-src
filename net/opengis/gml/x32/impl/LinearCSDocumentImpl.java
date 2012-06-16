/*
 * An XML document type.
 * Localname: linearCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.LinearCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one linearCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class LinearCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.LinearCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinearCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINEARCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "linearCS");
    
    
    /**
     * Gets the "linearCS" element
     */
    public net.opengis.gml.x32.LinearCSPropertyType getLinearCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LinearCSPropertyType target = null;
            target = (net.opengis.gml.x32.LinearCSPropertyType)get_store().find_element_user(LINEARCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "linearCS" element
     */
    public void setLinearCS(net.opengis.gml.x32.LinearCSPropertyType linearCS)
    {
        generatedSetterHelperImpl(linearCS, LINEARCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "linearCS" element
     */
    public net.opengis.gml.x32.LinearCSPropertyType addNewLinearCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LinearCSPropertyType target = null;
            target = (net.opengis.gml.x32.LinearCSPropertyType)get_store().add_element_user(LINEARCS$0);
            return target;
        }
    }
}
