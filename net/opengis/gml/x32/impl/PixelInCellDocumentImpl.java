/*
 * An XML document type.
 * Localname: pixelInCell
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PixelInCellDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one pixelInCell(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PixelInCellDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PixelInCellDocument
{
    private static final long serialVersionUID = 1L;
    
    public PixelInCellDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PIXELINCELL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pixelInCell");
    
    
    /**
     * Gets the "pixelInCell" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType getPixelInCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().find_element_user(PIXELINCELL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pixelInCell" element
     */
    public void setPixelInCell(net.opengis.gml.x32.CodeWithAuthorityType pixelInCell)
    {
        generatedSetterHelperImpl(pixelInCell, PIXELINCELL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pixelInCell" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType addNewPixelInCell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().add_element_user(PIXELINCELL$0);
            return target;
        }
    }
}
