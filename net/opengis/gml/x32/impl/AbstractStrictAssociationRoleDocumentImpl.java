/*
 * An XML document type.
 * Localname: abstractStrictAssociationRole
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractStrictAssociationRoleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one abstractStrictAssociationRole(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractStrictAssociationRoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractStrictAssociationRoleDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractStrictAssociationRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSTRICTASSOCIATIONROLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "abstractStrictAssociationRole");
    
    
    /**
     * Gets the "abstractStrictAssociationRole" element
     */
    public net.opengis.gml.x32.AssociationRoleType getAbstractStrictAssociationRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().find_element_user(ABSTRACTSTRICTASSOCIATIONROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstractStrictAssociationRole" element
     */
    public void setAbstractStrictAssociationRole(net.opengis.gml.x32.AssociationRoleType abstractStrictAssociationRole)
    {
        generatedSetterHelperImpl(abstractStrictAssociationRole, ABSTRACTSTRICTASSOCIATIONROLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abstractStrictAssociationRole" element
     */
    public net.opengis.gml.x32.AssociationRoleType addNewAbstractStrictAssociationRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().add_element_user(ABSTRACTSTRICTASSOCIATIONROLE$0);
            return target;
        }
    }
}
