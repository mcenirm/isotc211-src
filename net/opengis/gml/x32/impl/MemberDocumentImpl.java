/*
 * An XML document type.
 * Localname: member
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MemberDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one member(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public MemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "member");
    
    
    /**
     * Gets the "member" element
     */
    public net.opengis.gml.x32.AssociationRoleType getMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().find_element_user(MEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "member" element
     */
    public void setMember(net.opengis.gml.x32.AssociationRoleType member)
    {
        generatedSetterHelperImpl(member, MEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "member" element
     */
    public net.opengis.gml.x32.AssociationRoleType addNewMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().add_element_user(MEMBER$0);
            return target;
        }
    }
}
