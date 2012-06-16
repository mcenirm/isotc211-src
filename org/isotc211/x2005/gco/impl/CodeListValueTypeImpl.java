/*
 * XML Type:  CodeListValue_Type
 * Namespace: http://www.isotc211.org/2005/gco
 * Java type: org.isotc211.x2005.gco.CodeListValueType
 *
 * Automatically generated - do not modify.
 */
package org.isotc211.x2005.gco.impl;
/**
 * An XML CodeListValue_Type(@http://www.isotc211.org/2005/gco).
 *
 * This is an atomic type that is a restriction of org.isotc211.x2005.gco.CodeListValueType.
 */
public class CodeListValueTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.isotc211.x2005.gco.CodeListValueType
{
    private static final long serialVersionUID = 1L;
    
    public CodeListValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CodeListValueTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CODELIST$0 = 
        new javax.xml.namespace.QName("", "codeList");
    private static final javax.xml.namespace.QName CODELISTVALUE$2 = 
        new javax.xml.namespace.QName("", "codeListValue");
    private static final javax.xml.namespace.QName CODESPACE$4 = 
        new javax.xml.namespace.QName("", "codeSpace");
    
    
    /**
     * Gets the "codeList" attribute
     */
    public java.lang.String getCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELIST$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeList" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCodeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODELIST$0);
            return target;
        }
    }
    
    /**
     * Sets the "codeList" attribute
     */
    public void setCodeList(java.lang.String codeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELIST$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODELIST$0);
            }
            target.setStringValue(codeList);
        }
    }
    
    /**
     * Sets (as xml) the "codeList" attribute
     */
    public void xsetCodeList(org.apache.xmlbeans.XmlAnyURI codeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODELIST$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(CODELIST$0);
            }
            target.set(codeList);
        }
    }
    
    /**
     * Gets the "codeListValue" attribute
     */
    public java.lang.String getCodeListValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELISTVALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeListValue" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCodeListValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODELISTVALUE$2);
            return target;
        }
    }
    
    /**
     * Sets the "codeListValue" attribute
     */
    public void setCodeListValue(java.lang.String codeListValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODELISTVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODELISTVALUE$2);
            }
            target.setStringValue(codeListValue);
        }
    }
    
    /**
     * Sets (as xml) the "codeListValue" attribute
     */
    public void xsetCodeListValue(org.apache.xmlbeans.XmlAnyURI codeListValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODELISTVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(CODELISTVALUE$2);
            }
            target.set(codeListValue);
        }
    }
    
    /**
     * Gets the "codeSpace" attribute
     */
    public java.lang.String getCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeSpace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODESPACE$4);
            return target;
        }
    }
    
    /**
     * True if has "codeSpace" attribute
     */
    public boolean isSetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODESPACE$4) != null;
        }
    }
    
    /**
     * Sets the "codeSpace" attribute
     */
    public void setCodeSpace(java.lang.String codeSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESPACE$4);
            }
            target.setStringValue(codeSpace);
        }
    }
    
    /**
     * Sets (as xml) the "codeSpace" attribute
     */
    public void xsetCodeSpace(org.apache.xmlbeans.XmlAnyURI codeSpace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODESPACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(CODESPACE$4);
            }
            target.set(codeSpace);
        }
    }
    
    /**
     * Unsets the "codeSpace" attribute
     */
    public void unsetCodeSpace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODESPACE$4);
        }
    }
}
