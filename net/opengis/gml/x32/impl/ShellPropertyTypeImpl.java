/*
 * XML Type:  ShellPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ShellPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ShellPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ShellPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.ShellPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public ShellPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHELL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Shell");
    
    
    /**
     * Gets the "Shell" element
     */
    public net.opengis.gml.x32.ShellType getShell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ShellType target = null;
            target = (net.opengis.gml.x32.ShellType)get_store().find_element_user(SHELL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Shell" element
     */
    public void setShell(net.opengis.gml.x32.ShellType shell)
    {
        generatedSetterHelperImpl(shell, SHELL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Shell" element
     */
    public net.opengis.gml.x32.ShellType addNewShell()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ShellType target = null;
            target = (net.opengis.gml.x32.ShellType)get_store().add_element_user(SHELL$0);
            return target;
        }
    }
}
