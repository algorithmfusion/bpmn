//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.06.28 at 05:06:42 PM CEST 
//


package org.omg.spec.bpmn._20100524.di;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.omg.spec.bpmn._20100524.di package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.omg.spec.bpmn._20100524.di
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BPMNDiagram }
     * 
     */
    public BPMNDiagram createBPMNDiagram() {
        return new BPMNDiagram();
    }

    /**
     * Create an instance of {@link BPMNDiagram.BPMNPlane }
     * 
     */
    public BPMNDiagram.BPMNPlane createBPMNDiagramBPMNPlane() {
        return new BPMNDiagram.BPMNPlane();
    }

    /**
     * Create an instance of {@link BPMNDiagram.BPMNPlane.BPMNEdge }
     * 
     */
    public BPMNDiagram.BPMNPlane.BPMNEdge createBPMNDiagramBPMNPlaneBPMNEdge() {
        return new BPMNDiagram.BPMNPlane.BPMNEdge();
    }

    /**
     * Create an instance of {@link BPMNDiagram.BPMNPlane.BPMNShape }
     * 
     */
    public BPMNDiagram.BPMNPlane.BPMNShape createBPMNDiagramBPMNPlaneBPMNShape() {
        return new BPMNDiagram.BPMNPlane.BPMNShape();
    }

    /**
     * Create an instance of {@link BPMNDiagram.BPMNPlane.BPMNEdge.BPMNLabel }
     * 
     */
    public BPMNDiagram.BPMNPlane.BPMNEdge.BPMNLabel createBPMNDiagramBPMNPlaneBPMNEdgeBPMNLabel() {
        return new BPMNDiagram.BPMNPlane.BPMNEdge.BPMNLabel();
    }

    /**
     * Create an instance of {@link BPMNDiagram.BPMNPlane.BPMNShape.BPMNLabel }
     * 
     */
    public BPMNDiagram.BPMNPlane.BPMNShape.BPMNLabel createBPMNDiagramBPMNPlaneBPMNShapeBPMNLabel() {
        return new BPMNDiagram.BPMNPlane.BPMNShape.BPMNLabel();
    }

}