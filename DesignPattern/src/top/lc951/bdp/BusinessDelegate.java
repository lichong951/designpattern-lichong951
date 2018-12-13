package top.lc951.bdp;

public class BusinessDelegate {
	private BusinessLookUp lookupService = new BusinessLookUp();
	   private BusinessService businessService;
	   private String serviceType;
	 
	   public void setServiceType(String serviceType){
	      this.serviceType = serviceType;
	   }
	 
	   public void doTask(){
	      businessService = lookupService.getBusinessService(serviceType);
	      businessService.doProcessing();     
	   }
}
