/*
 * An XML document type.
 * Localname: solidMembers
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.SolidMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one solidMembers(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class SolidMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.SolidMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public SolidMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOLIDMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "solidMembers");
    
    
    /**
     * Gets the "solidMembers" element
     */
    public net.opengis.gml.x32.SolidArrayPropertyType getSolidMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SolidArrayPropertyType)get_store().find_element_user(SOLIDMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "solidMembers" element
     */
    public void setSolidMembers(net.opengis.gml.x32.SolidArrayPropertyType solidMembers)
    {
        generatedSetterHelperImpl(solidMembers, SOLIDMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "solidMembers" element
     */
    public net.opengis.gml.x32.SolidArrayPropertyType addNewSolidMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.SolidArrayPropertyType target = null;
            target = (net.opengis.gml.x32.SolidArrayPropertyType)get_store().add_element_user(SOLIDMEMBERS$0);
            return target;
        }
    }
}
