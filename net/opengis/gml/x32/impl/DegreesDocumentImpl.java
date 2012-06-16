/*
 * An XML document type.
 * Localname: degrees
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DegreesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one degrees(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DegreesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DegreesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DegreesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEGREES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "degrees");
    
    
    /**
     * Gets the "degrees" element
     */
    public net.opengis.gml.x32.DegreesType getDegrees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DegreesType target = null;
            target = (net.opengis.gml.x32.DegreesType)get_store().find_element_user(DEGREES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "degrees" element
     */
    public void setDegrees(net.opengis.gml.x32.DegreesType degrees)
    {
        generatedSetterHelperImpl(degrees, DEGREES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "degrees" element
     */
    public net.opengis.gml.x32.DegreesType addNewDegrees()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DegreesType target = null;
            target = (net.opengis.gml.x32.DegreesType)get_store().add_element_user(DEGREES$0);
            return target;
        }
    }
}
