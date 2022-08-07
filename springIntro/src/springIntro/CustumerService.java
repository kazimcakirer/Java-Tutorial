package springIntro;

public class CustumerService implements IService{

	ICustomerDal customerDal;
//	
//	public CustumerService(ICustomerDal customerDal) {
//		this.customer = customerDal;
//	}
	
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	@Override
	public void add() {
		System.out.println("Veriler kontrol edildi.");
		this.customerDal.add();
		
	}
}
