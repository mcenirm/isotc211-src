/*
 * An XML document type.
 * Localname: AbstractGML
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGMLDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractGML(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGMLDocumentImpl extends net.opengis.gml.x32.impl.AbstractObjectDocumentImpl implements net.opengis.gml.x32.AbstractGMLDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGMLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGML$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGML");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGML$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCalendar"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PrimeMeridian"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ConventionalUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeometricComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeObject"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ConcatenatedOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CylindricalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DefinitionCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGML"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "UnitDefinition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationParameterGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompoundCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolyhedralSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OrientableCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Bag"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationMethod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PolarCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractContinuousCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimePrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractImplicitGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AffineCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "SphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeTopologyPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Array"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractFeature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeodeticCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "EngineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeClock"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LinearCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "PassThroughOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTopology"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TemporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DirectedObservationAtDistance"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeEdge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Node"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "GeographicCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MovingObjectStatus"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Ellipsoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DynamicFeature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Dictionary"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Grid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeInstant"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CoordinateSystemAxis"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractTimeSlice"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "UserDefinedCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractDiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Definition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ObliqueCartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "DefinitionProxy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "MultiSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "TimeOrdinalReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "BaseUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "OrientableSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricAggregate"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ProjectedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CompositeSolid"),
    });
    
    
    /**
     * Gets the "AbstractGML" element
     */
    public net.opengis.gml.x32.AbstractGMLType getAbstractGML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGMLType target = null;
            target = (net.opengis.gml.x32.AbstractGMLType)get_store().find_element_user(ABSTRACTGML$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGML" element
     */
    public void setAbstractGML(net.opengis.gml.x32.AbstractGMLType abstractGML)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGMLType target = null;
            target = (net.opengis.gml.x32.AbstractGMLType)get_store().find_element_user(ABSTRACTGML$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGMLType)get_store().add_element_user(ABSTRACTGML$0);
            }
            target.set(abstractGML);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGML" element
     */
    public net.opengis.gml.x32.AbstractGMLType addNewAbstractGML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGMLType target = null;
            target = (net.opengis.gml.x32.AbstractGMLType)get_store().add_element_user(ABSTRACTGML$0);
            return target;
        }
    }
}
