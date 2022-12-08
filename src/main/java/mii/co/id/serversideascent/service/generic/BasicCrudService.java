/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.co.id.serversideascent.service.generic;

import java.util.List;
import mii.co.id.serversideascent.service.serviceInterface.BasicCrudServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author lenovo
 */
@Service
public class BasicCrudService<E, I> implements BasicCrudServiceInterface<E, I> {

    private final JpaRepository<E, I> repository;

    @Autowired
    public BasicCrudService(JpaRepository<E, I> repository) {
        this.repository = repository;
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Override
    public E findById(I id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Data not found!"));
    }

    @Override
    public E create(E entity) {
        return repository.save(entity);
    }

    @Override
    public E update(I id, E entity) {
        if (!repository.findById(id).isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data not found!");
        }
        return repository.save(entity);
    }

    @Override
    public E delete(I id) {
        E data = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Data not found!"));
        repository.delete(data);
        return data;
    }

}
