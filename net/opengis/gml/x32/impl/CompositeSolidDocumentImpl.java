/*
 * An XML document type.
 * Localname: CompositeSolid
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CompositeSolidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one CompositeSolid(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CompositeSolidDocumentImpl extends net.opengis.gml.x32.impl.AbstractSolidDocumentImpl implements net.opengis.gml.x32.CompositeSolidDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompositeSolidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOSITESOLID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeSolid");
    
    
    /**
     * Gets the "CompositeSolid" element
     */
    public net.opengis.gml.x32.CompositeSolidType getCompositeSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompositeSolidType target = null;
            target = (net.opengis.gml.x32.CompositeSolidType)get_store().find_element_user(COMPOSITESOLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompositeSolid" element
     */
    public void setCompositeSolid(net.opengis.gml.x32.CompositeSolidType compositeSolid)
    {
        generatedSetterHelperImpl(compositeSolid, COMPOSITESOLID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CompositeSolid" element
     */
    public net.opengis.gml.x32.CompositeSolidType addNewCompositeSolid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CompositeSolidType target = null;
            target = (net.opengis.gml.x32.CompositeSolidType)get_store().add_element_user(COMPOSITESOLID$0);
            return target;
        }
    }
}
