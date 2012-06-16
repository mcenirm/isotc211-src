/*
 * An XML document type.
 * Localname: Category
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Category(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends net.opengis.gml.x32.impl.AbstractScalarValueDocumentImpl implements net.opengis.gml.x32.CategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Category");
    
    
    /**
     * Gets the "Category" element
     */
    public net.opengis.gml.x32.CategoryDocument.Category getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CategoryDocument.Category target = null;
            target = (net.opengis.gml.x32.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Category" element
     */
    public boolean isNilCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CategoryDocument.Category target = null;
            target = (net.opengis.gml.x32.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "Category" element
     */
    public void setCategory(net.opengis.gml.x32.CategoryDocument.Category category)
    {
        generatedSetterHelperImpl(category, CATEGORY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Category" element
     */
    public net.opengis.gml.x32.CategoryDocument.Category addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CategoryDocument.Category target = null;
            target = (net.opengis.gml.x32.CategoryDocument.Category)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
    
    /**
     * Nils the "Category" element
     */
    public void setNilCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CategoryDocument.Category target = null;
            target = (net.opengis.gml.x32.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CategoryDocument.Category)get_store().add_element_user(CATEGORY$0);
            }
            target.setNil();
        }
    }
    /**
     * An XML Category(@http://www.opengis.net/gml/3.2).
     *
     * This is an atomic type that is a restriction of net.opengis.gml.x32.CategoryDocument$Category.
     */
    public static class CategoryImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements net.opengis.gml.x32.CategoryDocument.Category
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected CategoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODESPACE$0 = 
            new javax.xml.namespace.QName("", "codeSpace");
        private static final javax.xml.namespace.QName NILREASON$2 = 
            new javax.xml.namespace.QName("", "nilReason");
        
        
        /**
         * Gets the "codeSpace" attribute
         */
        public java.lang.String getCodeSpace()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$0);
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
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODESPACE$0);
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
                return get_store().find_attribute_user(CODESPACE$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESPACE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESPACE$0);
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
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(CODESPACE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(CODESPACE$0);
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
                get_store().remove_attribute(CODESPACE$0);
            }
        }
        
        /**
         * Gets the "nilReason" attribute
         */
        public java.lang.Object getNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
                if (target == null)
                {
                    return null;
                }
                return target.getObjectValue();
            }
        }
        
        /**
         * Gets (as xml) the "nilReason" attribute
         */
        public net.opengis.gml.x32.NilReasonType xgetNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.NilReasonType target = null;
                target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
                return target;
            }
        }
        
        /**
         * True if has "nilReason" attribute
         */
        public boolean isSetNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NILREASON$2) != null;
            }
        }
        
        /**
         * Sets the "nilReason" attribute
         */
        public void setNilReason(java.lang.Object nilReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NILREASON$2);
                }
                target.setObjectValue(nilReason);
            }
        }
        
        /**
         * Sets (as xml) the "nilReason" attribute
         */
        public void xsetNilReason(net.opengis.gml.x32.NilReasonType nilReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.opengis.gml.x32.NilReasonType target = null;
                target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$2);
                if (target == null)
                {
                    target = (net.opengis.gml.x32.NilReasonType)get_store().add_attribute_user(NILREASON$2);
                }
                target.set(nilReason);
            }
        }
        
        /**
         * Unsets the "nilReason" attribute
         */
        public void unsetNilReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NILREASON$2);
            }
        }
    }
}
