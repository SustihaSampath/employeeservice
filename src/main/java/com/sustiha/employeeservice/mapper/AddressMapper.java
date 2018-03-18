package com.sustiha.employeeservice.mapper;

import com.sustiha.employeeservice.domain.Address;
import com.sustiha.employeeservice.view.AddressView;

/**
 * Created by sustihashreesampath on 3/4/18.
 */
public class AddressMapper {

    public AddressView mapDomainToAddressView(Address address)
    {
        AddressView addressView = new AddressView();
        addressView.setAddressLineOne(address.getAddressLineOne());
        addressView.setAddressLineTwo(address.getAddressLineTwo());
        addressView.setCity(address.getCity());
        addressView.setState(address.getState());
        addressView.setZipcode(address.getZipcode());
        return addressView;
    }
}
