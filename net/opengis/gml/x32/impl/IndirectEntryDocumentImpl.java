/*
 * An XML document type.
 * Localname: indirectEntry
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.IndirectEntryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one indirectEntry(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class IndirectEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.IndirectEntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndirectEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIRECTENTRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "indirectEntry");
    
    
    /**
     * Gets the "indirectEntry" element
     */
    public net.opengis.gml.x32.IndirectEntryType getIndirectEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IndirectEntryType target = null;
            target = (net.opengis.gml.x32.IndirectEntryType)get_store().find_element_user(INDIRECTENTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indirectEntry" element
     */
    public void setIndirectEntry(net.opengis.gml.x32.IndirectEntryType indirectEntry)
    {
        generatedSetterHelperImpl(indirectEntry, INDIRECTENTRY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indirectEntry" element
     */
    public net.opengis.gml.x32.IndirectEntryType addNewIndirectEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.IndirectEntryType target = null;
            target = (net.opengis.gml.x32.IndirectEntryType)get_store().add_element_user(INDIRECTENTRY$0);
            return target;
        }
    }
}
