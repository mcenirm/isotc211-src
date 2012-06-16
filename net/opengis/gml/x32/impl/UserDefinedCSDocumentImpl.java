/*
 * An XML document type.
 * Localname: userDefinedCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UserDefinedCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one userDefinedCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UserDefinedCSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.UserDefinedCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserDefinedCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERDEFINEDCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "userDefinedCS");
    
    
    /**
     * Gets the "userDefinedCS" element
     */
    public net.opengis.gml.x32.UserDefinedCSPropertyType getUserDefinedCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UserDefinedCSPropertyType target = null;
            target = (net.opengis.gml.x32.UserDefinedCSPropertyType)get_store().find_element_user(USERDEFINEDCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "userDefinedCS" element
     */
    public void setUserDefinedCS(net.opengis.gml.x32.UserDefinedCSPropertyType userDefinedCS)
    {
        generatedSetterHelperImpl(userDefinedCS, USERDEFINEDCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "userDefinedCS" element
     */
    public net.opengis.gml.x32.UserDefinedCSPropertyType addNewUserDefinedCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UserDefinedCSPropertyType target = null;
            target = (net.opengis.gml.x32.UserDefinedCSPropertyType)get_store().add_element_user(USERDEFINEDCS$0);
            return target;
        }
    }
}
