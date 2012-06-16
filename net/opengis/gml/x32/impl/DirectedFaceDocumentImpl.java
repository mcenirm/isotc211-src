/*
 * An XML document type.
 * Localname: directedFace
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DirectedFaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one directedFace(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DirectedFaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DirectedFaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectedFaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTEDFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "directedFace");
    
    
    /**
     * Gets the "directedFace" element
     */
    public net.opengis.gml.x32.DirectedFacePropertyType getDirectedFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().find_element_user(DIRECTEDFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "directedFace" element
     */
    public void setDirectedFace(net.opengis.gml.x32.DirectedFacePropertyType directedFace)
    {
        generatedSetterHelperImpl(directedFace, DIRECTEDFACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "directedFace" element
     */
    public net.opengis.gml.x32.DirectedFacePropertyType addNewDirectedFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectedFacePropertyType target = null;
            target = (net.opengis.gml.x32.DirectedFacePropertyType)get_store().add_element_user(DIRECTEDFACE$0);
            return target;
        }
    }
}
