/*
 * An XML document type.
 * Localname: dictionaryEntry
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DictionaryEntryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one dictionaryEntry(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DictionaryEntryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.DictionaryEntryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DictionaryEntryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DICTIONARYENTRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dictionaryEntry");
    private static final org.apache.xmlbeans.QNameSet DICTIONARYENTRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "definitionMember"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "dictionaryEntry"),
    });
    
    
    /**
     * Gets the "dictionaryEntry" element
     */
    public net.opengis.gml.x32.DictionaryEntryType getDictionaryEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryEntryType target = null;
            target = (net.opengis.gml.x32.DictionaryEntryType)get_store().find_element_user(DICTIONARYENTRY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dictionaryEntry" element
     */
    public void setDictionaryEntry(net.opengis.gml.x32.DictionaryEntryType dictionaryEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryEntryType target = null;
            target = (net.opengis.gml.x32.DictionaryEntryType)get_store().find_element_user(DICTIONARYENTRY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DictionaryEntryType)get_store().add_element_user(DICTIONARYENTRY$0);
            }
            target.set(dictionaryEntry);
        }
    }
    
    /**
     * Appends and returns a new empty "dictionaryEntry" element
     */
    public net.opengis.gml.x32.DictionaryEntryType addNewDictionaryEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DictionaryEntryType target = null;
            target = (net.opengis.gml.x32.DictionaryEntryType)get_store().add_element_user(DICTIONARYENTRY$0);
            return target;
        }
    }
}
