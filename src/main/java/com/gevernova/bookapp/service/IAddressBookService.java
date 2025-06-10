package com.gevernova.bookapp.repository;

import com.gevernova.bookapp.dto.AddressBookDTO;
import com.gevernova.bookapp.entity.AddressBookEntity;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookEntity> getAll();
    AddressBookEntity getById(int id);
    AddressBookEntity create(AddressBookDTO dto);
    AddressBookEntity update(int id, AddressBookDTO dto);
    void delete(int id);
}
