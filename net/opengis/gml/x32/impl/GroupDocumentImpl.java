/*
 * An XML document type.
 * Localname: group
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one group(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.GroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "group");
    private static final org.apache.xmlbeans.QNameSet GROUP$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "group"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "valuesOfGroup"),
    });
    
    
    /**
     * Gets the "group" element
     */
    public net.opengis.gml.x32.OperationParameterGroupPropertyType getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterGroupPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterGroupPropertyType)get_store().find_element_user(GROUP$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "group" element
     */
    public void setGroup(net.opengis.gml.x32.OperationParameterGroupPropertyType group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterGroupPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterGroupPropertyType)get_store().find_element_user(GROUP$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.OperationParameterGroupPropertyType)get_store().add_element_user(GROUP$0);
            }
            target.set(group);
        }
    }
    
    /**
     * Appends and returns a new empty "group" element
     */
    public net.opengis.gml.x32.OperationParameterGroupPropertyType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.OperationParameterGroupPropertyType target = null;
            target = (net.opengis.gml.x32.OperationParameterGroupPropertyType)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
}
