/*
 * An XML document type.
 * Localname: UserDefinedCS
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.UserDefinedCSDocument2
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one UserDefinedCS(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class UserDefinedCSDocument2Impl extends net.opengis.gml.x32.impl.AbstractCoordinateSystemDocumentImpl implements net.opengis.gml.x32.UserDefinedCSDocument2
{
    private static final long serialVersionUID = 1L;
    
    public UserDefinedCSDocument2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERDEFINEDCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "UserDefinedCS");
    
    
    /**
     * Gets the "UserDefinedCS" element
     */
    public net.opengis.gml.x32.UserDefinedCSType getUserDefinedCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UserDefinedCSType target = null;
            target = (net.opengis.gml.x32.UserDefinedCSType)get_store().find_element_user(USERDEFINEDCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UserDefinedCS" element
     */
    public void setUserDefinedCS(net.opengis.gml.x32.UserDefinedCSType userDefinedCS)
    {
        generatedSetterHelperImpl(userDefinedCS, USERDEFINEDCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UserDefinedCS" element
     */
    public net.opengis.gml.x32.UserDefinedCSType addNewUserDefinedCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.UserDefinedCSType target = null;
            target = (net.opengis.gml.x32.UserDefinedCSType)get_store().add_element_user(USERDEFINEDCS$0);
            return target;
        }
    }
}
