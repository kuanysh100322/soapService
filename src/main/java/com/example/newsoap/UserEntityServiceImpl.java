package com.example.newsoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserEntityServiceImpl implements UserEntityService{
    private UserEntityRepository repository;

    public UserEntityServiceImpl() {
    }
    @Autowired
    public UserEntityServiceImpl(UserEntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserEntity getEntityByIin(long iin) {
        return this.repository.findById(iin).get();
    }
}
