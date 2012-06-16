/*
 * An XML document type.
 * Localname: solidMember
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SolidMemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one solidMember(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SolidMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SolidMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolidMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDMEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "solidMember");
    
    
    /**
     * Gets the "solidMember" element
     */
    public net.opengis.gml.x32.SolidPropertyType getSolidMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidPropertyType target = null;
            target = (net.opengis.gml.x32.SolidPropertyType)get_store().find_element_user(SOLIDMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solidMember" element
     */
    public void setSolidMember(net.opengis.gml.x32.SolidPropertyType solidMember)
    {
        generatedSetterHelperImpl(solidMember, SOLIDMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solidMember" element
     */
    public net.opengis.gml.x32.SolidPropertyType addNewSolidMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidPropertyType target = null;
            target = (net.opengis.gml.x32.SolidPropertyType)get_store().add_element_user(SOLIDMEMBER$0);
            return target;
        }
    }
}
