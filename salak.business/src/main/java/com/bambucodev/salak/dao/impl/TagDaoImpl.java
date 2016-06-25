package com.bambucodev.salak.dao.impl;

import javax.ejb.Stateless;

import com.bambucodev.salak.dao.TagDao;
import com.bambucodev.salak.model.Tag;

/**
 *
 * @author Ing. Jefferson Pérez Cervera <www.bambucodev.com>
 */
@Stateless
public class TagDaoImpl extends BaseDaoImpl<Tag> implements TagDao {
    public TagDaoImpl() {
        super(Tag.class);
    }
    
}
