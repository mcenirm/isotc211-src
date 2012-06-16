/*
 * An XML document type.
 * Localname: ArcByBulge
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ArcByBulgeDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ArcByBulge(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ArcByBulgeDocumentImpl extends net.opengis.gml.x32.impl.ArcStringByBulgeDocumentImpl implements net.opengis.gml.x32.ArcByBulgeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcByBulgeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCBYBULGE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByBulge");
    
    
    /**
     * Gets the "ArcByBulge" element
     */
    public net.opengis.gml.x32.ArcByBulgeType getArcByBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcByBulgeType target = null;
            target = (net.opengis.gml.x32.ArcByBulgeType)get_store().find_element_user(ARCBYBULGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcByBulge" element
     */
    public void setArcByBulge(net.opengis.gml.x32.ArcByBulgeType arcByBulge)
    {
        generatedSetterHelperImpl(arcByBulge, ARCBYBULGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ArcByBulge" element
     */
    public net.opengis.gml.x32.ArcByBulgeType addNewArcByBulge()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcByBulgeType target = null;
            target = (net.opengis.gml.x32.ArcByBulgeType)get_store().add_element_user(ARCBYBULGE$0);
            return target;
        }
    }
}
