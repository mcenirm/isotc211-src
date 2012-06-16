/*
 * An XML document type.
 * Localname: topoPrimitiveMembers
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.TopoPrimitiveMembersDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one topoPrimitiveMembers(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class TopoPrimitiveMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.TopoPrimitiveMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoPrimitiveMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPRIMITIVEMEMBERS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "topoPrimitiveMembers");
    
    
    /**
     * Gets the "topoPrimitiveMembers" element
     */
    public net.opengis.gml.x32.TopoPrimitiveArrayAssociationType getTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPrimitiveArrayAssociationType target = null;
            target = (net.opengis.gml.x32.TopoPrimitiveArrayAssociationType)get_store().find_element_user(TOPOPRIMITIVEMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoPrimitiveMembers" element
     */
    public void setTopoPrimitiveMembers(net.opengis.gml.x32.TopoPrimitiveArrayAssociationType topoPrimitiveMembers)
    {
        generatedSetterHelperImpl(topoPrimitiveMembers, TOPOPRIMITIVEMEMBERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoPrimitiveMembers" element
     */
    public net.opengis.gml.x32.TopoPrimitiveArrayAssociationType addNewTopoPrimitiveMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.TopoPrimitiveArrayAssociationType target = null;
            target = (net.opengis.gml.x32.TopoPrimitiveArrayAssociationType)get_store().add_element_user(TOPOPRIMITIVEMEMBERS$0);
            return target;
        }
    }
}
