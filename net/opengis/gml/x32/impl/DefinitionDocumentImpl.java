/*
 * An XML document type.
 * Localname: Definition
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.DefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Definition(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class DefinitionDocumentImpl extends net.opengis.gml.x32.impl.AbstractGMLDocumentImpl implements net.opengis.gml.x32.DefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Definition");
    private static final org.apache.xmlbeans.QNameSet DEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AffineCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "SphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCalendar"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PrimeMeridian"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ConventionalUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ConcatenatedOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CylindricalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DefinitionCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeClock"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LinearCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PassThroughOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeographicCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "UnitDefinition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Ellipsoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationParameterGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompoundCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Dictionary"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CoordinateSystemAxis"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "UserDefinedCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationMethod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolarCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Definition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ObliqueCartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DefinitionProxy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeOrdinalReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BaseUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ProjectedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractOperation"),
    });
    
    
    /**
     * Gets the "Definition" element
     */
    public net.opengis.gml.x32.DefinitionType getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DefinitionType target = null;
            target = (net.opengis.gml.x32.DefinitionType)get_store().find_element_user(DEFINITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Definition" element
     */
    public void setDefinition(net.opengis.gml.x32.DefinitionType definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DefinitionType target = null;
            target = (net.opengis.gml.x32.DefinitionType)get_store().find_element_user(DEFINITION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DefinitionType)get_store().add_element_user(DEFINITION$0);
            }
            target.set(definition);
        }
    }
    
    /**
     * Appends and returns a new empty "Definition" element
     */
    public net.opengis.gml.x32.DefinitionType addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DefinitionType target = null;
            target = (net.opengis.gml.x32.DefinitionType)get_store().add_element_user(DEFINITION$0);
            return target;
        }
    }
}
