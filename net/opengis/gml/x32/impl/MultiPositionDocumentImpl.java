/*
 * An XML document type.
 * Localname: multiPosition
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MultiPositionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one multiPosition(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MultiPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MultiPositionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "multiPosition");
    
    
    /**
     * Gets the "multiPosition" element
     */
    public net.opengis.gml.x32.MultiPointPropertyType getMultiPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiPointPropertyType target = null;
            target = (net.opengis.gml.x32.MultiPointPropertyType)get_store().find_element_user(MULTIPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiPosition" element
     */
    public void setMultiPosition(net.opengis.gml.x32.MultiPointPropertyType multiPosition)
    {
        generatedSetterHelperImpl(multiPosition, MULTIPOSITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiPosition" element
     */
    public net.opengis.gml.x32.MultiPointPropertyType addNewMultiPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.MultiPointPropertyType target = null;
            target = (net.opengis.gml.x32.MultiPointPropertyType)get_store().add_element_user(MULTIPOSITION$0);
            return target;
        }
    }
}
