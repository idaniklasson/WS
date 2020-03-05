package se.lu.ics.grupp14;

public class WebService1SoapProxy implements se.lu.ics.grupp14.WebService1Soap {
  private String _endpoint = null;
  private se.lu.ics.grupp14.WebService1Soap webService1Soap = null;
  
  public WebService1SoapProxy() {
    _initWebService1SoapProxy();
  }
  
  public WebService1SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebService1SoapProxy();
  }
  
  private void _initWebService1SoapProxy() {
    try {
      webService1Soap = (new se.lu.ics.grupp14.WebService1Locator()).getWebService1Soap();
      if (webService1Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webService1Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webService1Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webService1Soap != null)
      ((javax.xml.rpc.Stub)webService1Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public se.lu.ics.grupp14.WebService1Soap getWebService1Soap() {
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap;
  }
  
  public java.lang.String readFile(java.lang.String fileName) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.readFile(fileName);
  }
  
  public java.lang.String[] returnFiles() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.returnFiles();
  }
  
  public se.lu.ics.grupp14.GetAstronautsResponseGetAstronautsResult getAstronauts() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getAstronauts();
  }
  
  public se.lu.ics.grupp14.Astronaut[] readAstronaut() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.readAstronaut();
  }
  
  public se.lu.ics.grupp14.Spaceship[] readSpaceship() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.readSpaceship();
  }
  
  
}