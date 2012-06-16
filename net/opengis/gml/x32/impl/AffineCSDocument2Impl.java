/*
 * An XML document type.
 * Localname: AffineCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AffineCSDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AffineCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AffineCSDocument2Impl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.AffineCSDocument2
{
    private static final long serialVersionUID = 1L;
    
    public AffineCSDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFINECS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AffineCS");
    
    
    /**
     * Gets the "AffineCS" element
     */
    public net.opengis.gml.x32.AffineCSType getAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSType target = null;
            target = (net.opengis.gml.x32.AffineCSType)get_store().find_element_user(AFFINECS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AffineCS" element
     */
    public void setAffineCS(net.opengis.gml.x32.AffineCSType affineCS)
    {
        generatedSetterHelperImpl(affineCS, AFFINECS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AffineCS" element
     */
    public net.opengis.gml.x32.AffineCSType addNewAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSType target = null;
            target = (net.opengis.gml.x32.AffineCSType)get_store().add_element_user(AFFINECS$0);
            return target;
        }
    }
}
