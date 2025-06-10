package com.gevernova.bookapp.service;

import com.gevernova.bookapp.dto.AddressBookDTO;
import com.gevernova.bookapp.entity.AddressBookEntity;
import com.gevernova.bookapp.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements com.gevernova.bookapp.repository.IAddressBookService {

    private final List<AddressBookEntity> addressBookList = new ArrayList<>();
    private int counter = 1;

    @Override
    public List<AddressBookEntity> getAll() {
        return addressBookList;
    }

    @Override
    public AddressBookEntity getById(int id) {
        return addressBookList.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("ID not found: " + id));
    }

    @Override
    public AddressBookEntity create(AddressBookDTO dto) {
        AddressBookEntity entity = new AddressBookEntity(dto);
        entity.setId(counter++);
        addressBookList.add(entity);
        return entity;
    }

    @Override
    public AddressBookEntity update(int id, AddressBookDTO dto) {
        AddressBookEntity entity = getById(id);
        entity.setName(dto.getName());
        entity.setAddress(dto.getAddress());
        return entity;
    }

    @Override
    public void delete(int id) {
        AddressBookEntity entity = getById(id);
        addressBookList.remove(entity);
    }
}
