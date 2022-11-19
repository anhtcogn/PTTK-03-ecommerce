package com.pttk03ecommerce.service.impl.user;

import com.pttk03ecommerce.model.user.Address;
import com.pttk03ecommerce.repository.user.AddressRepository;
import com.pttk03ecommerce.service.user.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;
    @Override
    public Address updateAddress(Address address) {
        Address address1=addressRepository.getAddressById(address.getID());
        address1.setDistrictName(address.getDistrictName());
        address1.setNumber(address.getNumber());
        address1.setStreetName(address.getStreetName());
        address1.setProvinceName(address.getProvinceName());
        return addressRepository.save(address1);
    }
}
