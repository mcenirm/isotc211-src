/*
 * An XML document type.
 * Localname: anchorPoint
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AnchorPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one anchorPoint(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AnchorPointDocumentImpl extends net.opengis.gml.x32.impl.AnchorDefinitionDocumentImpl implements net.opengis.gml.x32.AnchorPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnchorPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANCHORPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "anchorPoint");
    
    
    /**
     * Gets the "anchorPoint" element
     */
    public net.opengis.gml.x32.CodeType getAnchorPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(ANCHORPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "anchorPoint" element
     */
    public void setAnchorPoint(net.opengis.gml.x32.CodeType anchorPoint)
    {
        generatedSetterHelperImpl(anchorPoint, ANCHORPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "anchorPoint" element
     */
    public net.opengis.gml.x32.CodeType addNewAnchorPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(ANCHORPOINT$0);
            return target;
        }
    }
}
