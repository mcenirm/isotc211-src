/*
 * An XML document type.
 * Localname: Clothoid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ClothoidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Clothoid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ClothoidDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentDocumentImpl implements net.opengis.gml.x32.ClothoidDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClothoidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOTHOID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Clothoid");
    
    
    /**
     * Gets the "Clothoid" element
     */
    public net.opengis.gml.x32.ClothoidType getClothoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ClothoidType target = null;
            target = (net.opengis.gml.x32.ClothoidType)get_store().find_element_user(CLOTHOID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Clothoid" element
     */
    public void setClothoid(net.opengis.gml.x32.ClothoidType clothoid)
    {
        generatedSetterHelperImpl(clothoid, CLOTHOID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Clothoid" element
     */
    public net.opengis.gml.x32.ClothoidType addNewClothoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ClothoidType target = null;
            target = (net.opengis.gml.x32.ClothoidType)get_store().add_element_user(CLOTHOID$0);
            return target;
        }
    }
}
