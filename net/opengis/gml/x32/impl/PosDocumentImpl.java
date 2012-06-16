/*
 * An XML document type.
 * Localname: pos
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PosDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one pos(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PosDocument
{
    private static final long serialVersionUID = 1L;
    
    public PosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos");
    
    
    /**
     * Gets the "pos" element
     */
    public net.opengis.gml.x32.DirectPositionType getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    public void setPos(net.opengis.gml.x32.DirectPositionType pos)
    {
        generatedSetterHelperImpl(pos, POS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pos" element
     */
    public net.opengis.gml.x32.DirectPositionType addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(POS$0);
            return target;
        }
    }
}
