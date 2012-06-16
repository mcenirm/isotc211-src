/*
 * An XML document type.
 * Localname: userDefinedCSRef
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UserDefinedCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one userDefinedCSRef(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UserDefinedCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.UserDefinedCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserDefinedCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERDEFINEDCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "userDefinedCSRef");
    
    
    /**
     * Gets the "userDefinedCSRef" element
     */
    public net.opengis.gml.x32.UserDefinedCSPropertyType getUserDefinedCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UserDefinedCSPropertyType target = null;
            target = (net.opengis.gml.x32.UserDefinedCSPropertyType)get_store().find_element_user(USERDEFINEDCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "userDefinedCSRef" element
     */
    public void setUserDefinedCSRef(net.opengis.gml.x32.UserDefinedCSPropertyType userDefinedCSRef)
    {
        generatedSetterHelperImpl(userDefinedCSRef, USERDEFINEDCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "userDefinedCSRef" element
     */
    public net.opengis.gml.x32.UserDefinedCSPropertyType addNewUserDefinedCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UserDefinedCSPropertyType target = null;
            target = (net.opengis.gml.x32.UserDefinedCSPropertyType)get_store().add_element_user(USERDEFINEDCSREF$0);
            return target;
        }
    }
}
