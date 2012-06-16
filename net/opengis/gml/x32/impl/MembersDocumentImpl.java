/*
 * An XML document type.
 * Localname: members
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.MembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one members(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class MembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.MembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public MembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "members");
    
    
    /**
     * Gets the "members" element
     */
    public net.opengis.gml.x32.ArrayAssociationType getMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArrayAssociationType target = null;
            target = (net.opengis.gml.x32.ArrayAssociationType)get_store().find_element_user(MEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "members" element
     */
    public void setMembers(net.opengis.gml.x32.ArrayAssociationType members)
    {
        generatedSetterHelperImpl(members, MEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "members" element
     */
    public net.opengis.gml.x32.ArrayAssociationType addNewMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArrayAssociationType target = null;
            target = (net.opengis.gml.x32.ArrayAssociationType)get_store().add_element_user(MEMBERS$0);
            return target;
        }
    }
}
