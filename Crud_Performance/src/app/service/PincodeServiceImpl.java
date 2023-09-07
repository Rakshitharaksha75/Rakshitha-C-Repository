package service;

import repository.PincodeRepository;

public class PincodeServiceImpl implements PincodeService{
private PincodeRepository pincoderepository;
	
	public PincodeServiceImpl(PincodeRepository pincoderepository) {
		this.pincoderepository=pincoderepository;
	}
	@Override
	public boolean validateAndSave(int code) {
		System.out.println("invoking validateAndSave in PincodeServiceImpl");

		if (code <=500000 && code>=700000) {
			if(!this.pincoderepository.isExists(code))
			{
				this.pincoderepository.save(code);
				return true;
			}
			else {
				System.out.println("name is already exists, please select another");
			}
	
			System.out.println("Pincode is valid");
			this.pincoderepository.save(code);
			return true;
	}
		 else {
			System.err.println("Pincode is invalid");
		}
		return false;
	}

}
