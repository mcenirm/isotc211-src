/*
 * XML Type:  ImageCRSType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ImageCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ImageCRSType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ImageCRSTypeImpl extends net.opengis.gml.x32.impl.AbstractCRSTypeImpl implements net.opengis.gml.x32.ImageCRSType
{
    private static final long serialVersionUID = 1L;
    
    public ImageCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCS");
    private static final org.apache.xmlbeans.QNameSet CARTESIANCS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "cartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesCartesianCS"),
    });
    private static final javax.xml.namespace.QName AFFINECS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "affineCS");
    private static final org.apache.xmlbeans.QNameSet AFFINECS$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "affineCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesAffineCS"),
    });
    private static final javax.xml.namespace.QName USESOBLIQUECARTESIANCS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesObliqueCartesianCS");
    private static final javax.xml.namespace.QName IMAGEDATUM$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "imageDatum");
    private static final org.apache.xmlbeans.QNameSet IMAGEDATUM$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "imageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "usesImageDatum"),
    });
    
    
    /**
     * Gets the "cartesianCS" element
     */
    public net.opengis.gml.x32.CartesianCSPropertyType getCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().find_element_user(CARTESIANCS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "cartesianCS" element
     */
    public boolean isSetCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARTESIANCS$1) != 0;
        }
    }
    
    /**
     * Sets the "cartesianCS" element
     */
    public void setCartesianCS(net.opengis.gml.x32.CartesianCSPropertyType cartesianCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().find_element_user(CARTESIANCS$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().add_element_user(CARTESIANCS$0);
            }
            target.set(cartesianCS);
        }
    }
    
    /**
     * Appends and returns a new empty "cartesianCS" element
     */
    public net.opengis.gml.x32.CartesianCSPropertyType addNewCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.CartesianCSPropertyType)get_store().add_element_user(CARTESIANCS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "cartesianCS" element
     */
    public void unsetCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARTESIANCS$1, 0);
        }
    }
    
    /**
     * Gets the "affineCS" element
     */
    public net.opengis.gml.x32.AffineCSPropertyType getAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().find_element_user(AFFINECS$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "affineCS" element
     */
    public boolean isSetAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AFFINECS$3) != 0;
        }
    }
    
    /**
     * Sets the "affineCS" element
     */
    public void setAffineCS(net.opengis.gml.x32.AffineCSPropertyType affineCS)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().find_element_user(AFFINECS$3, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().add_element_user(AFFINECS$2);
            }
            target.set(affineCS);
        }
    }
    
    /**
     * Appends and returns a new empty "affineCS" element
     */
    public net.opengis.gml.x32.AffineCSPropertyType addNewAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AffineCSPropertyType target = null;
            target = (net.opengis.gml.x32.AffineCSPropertyType)get_store().add_element_user(AFFINECS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "affineCS" element
     */
    public void unsetAffineCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AFFINECS$3, 0);
        }
    }
    
    /**
     * Gets the "usesObliqueCartesianCS" element
     */
    public net.opengis.gml.x32.ObliqueCartesianCSPropertyType getUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObliqueCartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.ObliqueCartesianCSPropertyType)get_store().find_element_user(USESOBLIQUECARTESIANCS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "usesObliqueCartesianCS" element
     */
    public boolean isSetUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESOBLIQUECARTESIANCS$4) != 0;
        }
    }
    
    /**
     * Sets the "usesObliqueCartesianCS" element
     */
    public void setUsesObliqueCartesianCS(net.opengis.gml.x32.ObliqueCartesianCSPropertyType usesObliqueCartesianCS)
    {
        generatedSetterHelperImpl(usesObliqueCartesianCS, USESOBLIQUECARTESIANCS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesObliqueCartesianCS" element
     */
    public net.opengis.gml.x32.ObliqueCartesianCSPropertyType addNewUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ObliqueCartesianCSPropertyType target = null;
            target = (net.opengis.gml.x32.ObliqueCartesianCSPropertyType)get_store().add_element_user(USESOBLIQUECARTESIANCS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "usesObliqueCartesianCS" element
     */
    public void unsetUsesObliqueCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESOBLIQUECARTESIANCS$4, 0);
        }
    }
    
    /**
     * Gets the "imageDatum" element
     */
    public net.opengis.gml.x32.ImageDatumPropertyType getImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageDatumPropertyType target = null;
            target = (net.opengis.gml.x32.ImageDatumPropertyType)get_store().find_element_user(IMAGEDATUM$7, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "imageDatum" element
     */
    public void setImageDatum(net.opengis.gml.x32.ImageDatumPropertyType imageDatum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageDatumPropertyType target = null;
            target = (net.opengis.gml.x32.ImageDatumPropertyType)get_store().find_element_user(IMAGEDATUM$7, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ImageDatumPropertyType)get_store().add_element_user(IMAGEDATUM$6);
            }
            target.set(imageDatum);
        }
    }
    
    /**
     * Appends and returns a new empty "imageDatum" element
     */
    public net.opengis.gml.x32.ImageDatumPropertyType addNewImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ImageDatumPropertyType target = null;
            target = (net.opengis.gml.x32.ImageDatumPropertyType)get_store().add_element_user(IMAGEDATUM$6);
            return target;
        }
    }
}
