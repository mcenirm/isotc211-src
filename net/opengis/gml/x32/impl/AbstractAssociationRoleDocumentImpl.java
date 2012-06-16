/*
 * An XML document type.
 * Localname: abstractAssociationRole
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractAssociationRoleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one abstractAssociationRole(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractAssociationRoleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractAssociationRoleDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractAssociationRoleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTASSOCIATIONROLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "abstractAssociationRole");
    
    
    /**
     * Gets the "abstractAssociationRole" element
     */
    public net.opengis.gml.x32.AssociationRoleType getAbstractAssociationRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().find_element_user(ABSTRACTASSOCIATIONROLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "abstractAssociationRole" element
     */
    public void setAbstractAssociationRole(net.opengis.gml.x32.AssociationRoleType abstractAssociationRole)
    {
        generatedSetterHelperImpl(abstractAssociationRole, ABSTRACTASSOCIATIONROLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "abstractAssociationRole" element
     */
    public net.opengis.gml.x32.AssociationRoleType addNewAbstractAssociationRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AssociationRoleType target = null;
            target = (net.opengis.gml.x32.AssociationRoleType)get_store().add_element_user(ABSTRACTASSOCIATIONROLE$0);
            return target;
        }
    }
}
