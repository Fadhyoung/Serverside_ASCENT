/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.co.id.serversideascent.controller;

import mii.co.id.serversideascent.controller.generic.BasicCrudController;
import mii.co.id.serversideascent.model.Comment;
import mii.co.id.serversideascent.service.generic.BasicCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lenovo
 */
@RestController
@RequestMapping("/comment")
public class CommentController extends BasicCrudController<Comment, Long>{
    
    @Autowired
    public CommentController(BasicCrudService service) {
        super(service);
    }
    
}
