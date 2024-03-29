package com.hcl.matrimony.service;

import com.hcl.matrimony.dto.ApiResponse;
import com.hcl.matrimony.dto.GetStatusList;
import com.hcl.matrimony.dto.PersonDetailsRequest;
import com.hcl.matrimony.dto.ProfileListResponse;
import com.hcl.matrimony.dto.ProfileRequest;
import com.hcl.matrimony.dto.UpdatePersonDetailsRequest;

public interface MatrimonyService {
	
	
	public  ApiResponse registerAccount(PersonDetailsRequest persondetails);
	
	public ProfileListResponse getAllProfiles(String emailId);
	
	public ApiResponse updatePersonalDetails(UpdatePersonDetailsRequest request);
	
	public ApiResponse requestProfile(ProfileRequest request);

	public ApiResponse login(String emailId, String password);
	
	public ApiResponse acceptRejectProfile(ProfileRequest request);

	public GetStatusList getStatus(String emailId);

}
