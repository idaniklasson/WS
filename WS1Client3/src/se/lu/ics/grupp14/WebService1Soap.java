/**
 * WebService1Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics.grupp14;

public interface WebService1Soap extends java.rmi.Remote {
    public java.lang.String readFile(java.lang.String fileName) throws java.rmi.RemoteException;
    public java.lang.String[] returnFiles() throws java.rmi.RemoteException;

    /**
     * Return Astronauts
     */
    public se.lu.ics.grupp14.GetAstronautsResponseGetAstronautsResult getAstronauts() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.Astronaut[] readAstronaut() throws java.rmi.RemoteException;
    public se.lu.ics.grupp14.Spaceship[] readSpaceship() throws java.rmi.RemoteException;
}
