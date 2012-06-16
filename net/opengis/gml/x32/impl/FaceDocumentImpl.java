/*
 * An XML document type.
 * Localname: Face
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.FaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Face(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class FaceDocumentImpl extends net.opengis.gml.x32.impl.AbstractTopoPrimitiveDocumentImpl implements net.opengis.gml.x32.FaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public FaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Face");
    
    
    /**
     * Gets the "Face" element
     */
    public net.opengis.gml.x32.FaceType getFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FaceType target = null;
            target = (net.opengis.gml.x32.FaceType)get_store().find_element_user(FACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Face" element
     */
    public void setFace(net.opengis.gml.x32.FaceType face)
    {
        generatedSetterHelperImpl(face, FACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Face" element
     */
    public net.opengis.gml.x32.FaceType addNewFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.FaceType target = null;
            target = (net.opengis.gml.x32.FaceType)get_store().add_element_user(FACE$0);
            return target;
        }
    }
}
