/*
 * XML Type:  BooleanPropertyType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.BooleanPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML BooleanPropertyType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class BooleanPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.BooleanPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public BooleanPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Boolean");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type");
    private static final javax.xml.namespace.QName HREF$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "href");
    private static final javax.xml.namespace.QName ROLE$6 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "role");
    private static final javax.xml.namespace.QName ARCROLE$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "arcrole");
    private static final javax.xml.namespace.QName TITLE$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    private static final javax.xml.namespace.QName SHOW$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "show");
    private static final javax.xml.namespace.QName ACTUATE$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "actuate");
    private static final javax.xml.namespace.QName NILREASON$16 = 
        new javax.xml.namespace.QName("", "nilReason");
    private static final javax.xml.namespace.QName REMOTESCHEMA$18 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "remoteSchema");
    
    
    /**
     * Gets the "Boolean" element
     */
    public net.opengis.gml.x32.BooleanDocument.Boolean getBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BooleanDocument.Boolean target = null;
            target = (net.opengis.gml.x32.BooleanDocument.Boolean)get_store().find_element_user(BOOLEAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "Boolean" element
     */
    public boolean isNilBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BooleanDocument.Boolean target = null;
            target = (net.opengis.gml.x32.BooleanDocument.Boolean)get_store().find_element_user(BOOLEAN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "Boolean" element
     */
    public boolean isSetBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLEAN$0) != 0;
        }
    }
    
    /**
     * Sets the "Boolean" element
     */
    public void setBoolean(net.opengis.gml.x32.BooleanDocument.Boolean xboolean)
    {
        generatedSetterHelperImpl(xboolean, BOOLEAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Boolean" element
     */
    public net.opengis.gml.x32.BooleanDocument.Boolean addNewBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BooleanDocument.Boolean target = null;
            target = (net.opengis.gml.x32.BooleanDocument.Boolean)get_store().add_element_user(BOOLEAN$0);
            return target;
        }
    }
    
    /**
     * Nils the "Boolean" element
     */
    public void setNilBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.BooleanDocument.Boolean target = null;
            target = (net.opengis.gml.x32.BooleanDocument.Boolean)get_store().find_element_user(BOOLEAN$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.BooleanDocument.Boolean)get_store().add_element_user(BOOLEAN$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Boolean" element
     */
    public void unsetBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLEAN$0, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$2) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$2);
        }
    }
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$4);
            return target;
        }
    }
    
    /**
     * True if has "href" attribute
     */
    public boolean isSetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HREF$4) != null;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
    public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$4);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$4);
            }
            target.set(href);
        }
    }
    
    /**
     * Unsets the "href" attribute
     */
    public void unsetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HREF$4);
        }
    }
    
    /**
     * Gets the "role" attribute
     */
    public java.lang.String getRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "role" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ROLE$6);
            return target;
        }
    }
    
    /**
     * True if has "role" attribute
     */
    public boolean isSetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROLE$6) != null;
        }
    }
    
    /**
     * Sets the "role" attribute
     */
    public void setRole(java.lang.String role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$6);
            }
            target.setStringValue(role);
        }
    }
    
    /**
     * Sets (as xml) the "role" attribute
     */
    public void xsetRole(org.apache.xmlbeans.XmlAnyURI role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ROLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ROLE$6);
            }
            target.set(role);
        }
    }
    
    /**
     * Unsets the "role" attribute
     */
    public void unsetRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROLE$6);
        }
    }
    
    /**
     * Gets the "arcrole" attribute
     */
    public java.lang.String getArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "arcrole" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ARCROLE$8);
            return target;
        }
    }
    
    /**
     * True if has "arcrole" attribute
     */
    public boolean isSetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ARCROLE$8) != null;
        }
    }
    
    /**
     * Sets the "arcrole" attribute
     */
    public void setArcrole(java.lang.String arcrole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARCROLE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARCROLE$8);
            }
            target.setStringValue(arcrole);
        }
    }
    
    /**
     * Sets (as xml) the "arcrole" attribute
     */
    public void xsetArcrole(org.apache.xmlbeans.XmlAnyURI arcrole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ARCROLE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ARCROLE$8);
            }
            target.set(arcrole);
        }
    }
    
    /**
     * Unsets the "arcrole" attribute
     */
    public void unsetArcrole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ARCROLE$8);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$10);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$10) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$10);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$10);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$10);
        }
    }
    
    /**
     * Gets the "show" attribute
     */
    public org.w3.x1999.xlink.ShowAttribute.Show.Enum getShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$12);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.ShowAttribute.Show.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "show" attribute
     */
    public org.w3.x1999.xlink.ShowAttribute.Show xgetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ShowAttribute.Show target = null;
            target = (org.w3.x1999.xlink.ShowAttribute.Show)get_store().find_attribute_user(SHOW$12);
            return target;
        }
    }
    
    /**
     * True if has "show" attribute
     */
    public boolean isSetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SHOW$12) != null;
        }
    }
    
    /**
     * Sets the "show" attribute
     */
    public void setShow(org.w3.x1999.xlink.ShowAttribute.Show.Enum show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHOW$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHOW$12);
            }
            target.setEnumValue(show);
        }
    }
    
    /**
     * Sets (as xml) the "show" attribute
     */
    public void xsetShow(org.w3.x1999.xlink.ShowAttribute.Show show)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ShowAttribute.Show target = null;
            target = (org.w3.x1999.xlink.ShowAttribute.Show)get_store().find_attribute_user(SHOW$12);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ShowAttribute.Show)get_store().add_attribute_user(SHOW$12);
            }
            target.set(show);
        }
    }
    
    /**
     * Unsets the "show" attribute
     */
    public void unsetShow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SHOW$12);
        }
    }
    
    /**
     * Gets the "actuate" attribute
     */
    public org.w3.x1999.xlink.ActuateAttribute.Actuate.Enum getActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUATE$14);
            if (target == null)
            {
                return null;
            }
            return (org.w3.x1999.xlink.ActuateAttribute.Actuate.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "actuate" attribute
     */
    public org.w3.x1999.xlink.ActuateAttribute.Actuate xgetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ActuateAttribute.Actuate target = null;
            target = (org.w3.x1999.xlink.ActuateAttribute.Actuate)get_store().find_attribute_user(ACTUATE$14);
            return target;
        }
    }
    
    /**
     * True if has "actuate" attribute
     */
    public boolean isSetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTUATE$14) != null;
        }
    }
    
    /**
     * Sets the "actuate" attribute
     */
    public void setActuate(org.w3.x1999.xlink.ActuateAttribute.Actuate.Enum actuate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTUATE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTUATE$14);
            }
            target.setEnumValue(actuate);
        }
    }
    
    /**
     * Sets (as xml) the "actuate" attribute
     */
    public void xsetActuate(org.w3.x1999.xlink.ActuateAttribute.Actuate actuate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x1999.xlink.ActuateAttribute.Actuate target = null;
            target = (org.w3.x1999.xlink.ActuateAttribute.Actuate)get_store().find_attribute_user(ACTUATE$14);
            if (target == null)
            {
                target = (org.w3.x1999.xlink.ActuateAttribute.Actuate)get_store().add_attribute_user(ACTUATE$14);
            }
            target.set(actuate);
        }
    }
    
    /**
     * Unsets the "actuate" attribute
     */
    public void unsetActuate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTUATE$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$16);
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
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$16);
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
            return get_store().find_attribute_user(NILREASON$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NILREASON$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NILREASON$16);
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
            target = (net.opengis.gml.x32.NilReasonType)get_store().find_attribute_user(NILREASON$16);
            if (target == null)
            {
                target = (net.opengis.gml.x32.NilReasonType)get_store().add_attribute_user(NILREASON$16);
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
            get_store().remove_attribute(NILREASON$16);
        }
    }
    
    /**
     * Gets the "remoteSchema" attribute
     */
    public java.lang.String getRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTESCHEMA$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "remoteSchema" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REMOTESCHEMA$18);
            return target;
        }
    }
    
    /**
     * True if has "remoteSchema" attribute
     */
    public boolean isSetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REMOTESCHEMA$18) != null;
        }
    }
    
    /**
     * Sets the "remoteSchema" attribute
     */
    public void setRemoteSchema(java.lang.String remoteSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REMOTESCHEMA$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REMOTESCHEMA$18);
            }
            target.setStringValue(remoteSchema);
        }
    }
    
    /**
     * Sets (as xml) the "remoteSchema" attribute
     */
    public void xsetRemoteSchema(org.apache.xmlbeans.XmlAnyURI remoteSchema)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(REMOTESCHEMA$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(REMOTESCHEMA$18);
            }
            target.set(remoteSchema);
        }
    }
    
    /**
     * Unsets the "remoteSchema" attribute
     */
    public void unsetRemoteSchema()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REMOTESCHEMA$18);
        }
    }
}
