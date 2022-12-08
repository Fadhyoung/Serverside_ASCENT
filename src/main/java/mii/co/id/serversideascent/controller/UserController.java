/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.co.id.serversideascent.controller;

import lombok.AllArgsConstructor;
import mii.co.id.serversideascent.controller.generic.BasicCrudController;
import mii.co.id.serversideascent.model.Aspirasi;
import mii.co.id.serversideascent.model.User;
import mii.co.id.serversideascent.service.generic.BasicCrudService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lenovo
 */

@RestController
@RequestMapping("/user")
public class UserController extends BasicCrudController<User, Long>{
    
    @Autowired
    public UserController(BasicCrudService service) {
        super(service);
    }
    
}
