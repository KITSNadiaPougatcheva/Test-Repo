// no copyright notice
package webservices;


public class IsRunningSEIImpl
  extends atg.webservice.ManagedComponentProperties
  implements javax.xml.rpc.server.ServiceLifecycle,
             IsRunningSEI
{
  public static final String sServiceName = "isRunning";
  
  public static final String sNucleusPath = "/brico/search/utils/FacetHolderPeriodicService";

  public static final String sFunctionalName = "null"; 
  
  public static boolean sRegistered = false;
  
  public static boolean sEnabled = true; 
  
  public boolean isRunning() 
    throws java.rmi.RemoteException, atg.security.SecurityException
  {
    if (! sRegistered) { 
      sEnabled = register(null);
      sRegistered = true;
    }
     
    if (! sEnabled) {
      if (isLoggingDebug())
        logDebug(sServiceName + " error: disabled");
      throw new java.rmi.RemoteException("disabled");
    }

    if ((!"null".equals(sFunctionalName)) &&
         !getNucleusSecurityManager().hasAccess(
                    sFunctionalName, 
                    sNucleusPath, 
                    "isRunning",
                    getParameterNameValueMap(new String[] {},
                                             new Object[] {  }) )) 
    {
      if (isLoggingDebug())
        logDebug(sServiceName + " error: Access denied using " + sFunctionalName);
      throw new atg.security.SecurityException("Access denied.");
    }
     
    try {
      // look up the Nucleus service and try to call it
     javax.naming.InitialContext ic = new javax.naming.InitialContext(); 
     atg.nucleus.Service service = (atg.nucleus.Service) ic.lookup("dynamo:/brico/search/utils/FacetHolderPeriodicService"); 
     if (isLoggingDebug())
       logDebug(sServiceName + " debug: executing atg.nucleus.Service.isRunning");
     return service.isRunning();
    }
    catch (javax.naming.NamingException ne) {
      if (isLoggingError())
        logError(sServiceName + " error: " + ne, ne);
      throw new java.rmi.RemoteException(ne.getMessage(), ne);
    }
    
  }
  
  public void destroy() {
  }
  
  public void init(Object pObject)
    throws javax.xml.rpc.ServiceException
  {
    if (! sRegistered) {
      sEnabled = register(pObject);
      sRegistered = true;
    }
  }

   public String getComponentName() {
    return "isRunning";
  }
}   
