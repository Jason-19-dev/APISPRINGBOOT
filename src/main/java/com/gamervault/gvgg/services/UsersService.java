package com.gamervault.gvgg.services;


import com.gamervault.gvgg.models.UsersModel;
import com.gamervault.gvgg.repository.UsersRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersService {
    
    private final UsersRepository repo;
    
    public UsersService(UsersRepository repo) {
        this.repo = repo;
    }
    
    public List<UsersModel> listar() {
        return repo.findAll();
    }
    
    public UsersModel guardar(UsersModel u) {
        return repo.save(u);
    }
}

