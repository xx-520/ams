package com.qfedu.ams.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.ams.dao.ShortQuestionMapper;
import com.qfedu.ams.entity.ShortQuestion;
import com.qfedu.ams.service.ShortQuestionSevice;
import com.qfedu.ams.utils.ListToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShortQuestionServiceImpl implements ShortQuestionSevice {

    @Autowired(required = false)
    private ShortQuestionMapper shortQuestionMapper;

    @Override
    public void recoverSQ(Integer[] ids) {
        shortQuestionMapper.recoverSQ(ids);
    }

    @Override
    public String CQfindAll(Integer subjectid, Integer snum) {
        List<Integer> list = shortQuestionMapper.CQfindAll(subjectid, snum);
        String string = ListToString.create(list);

        return string;
    }

    @Override
    public List<ShortQuestion> findRecover() {
        List<ShortQuestion> list = shortQuestionMapper.findRecover();
        if (list == null){
            throw new RuntimeException("题目不存在");
        }
        return list;
    }

    @Override
    public List<ShortQuestion> findAll() {
        List<ShortQuestion> list = shortQuestionMapper.findAll();
        if (list == null){
            throw new RuntimeException("题目不存在");
        }
        return list;
    }

    @Override
    public int falseDelete(Integer id) {
        return shortQuestionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void falseDeletes(Integer[] ids) {
        shortQuestionMapper.falseDeletes(ids);
    }

    @Override
    public int insert(ShortQuestion record) {
        return shortQuestionMapper.insert(record);
    }

    @Override
    public ShortQuestion selectByPrimaryKey(Integer id) {
        return shortQuestionMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(ShortQuestion record) {
        shortQuestionMapper.update(record);
    }

    @Override
    public Map<String, Object> findByIndexAndSize(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<ShortQuestion> list = shortQuestionMapper.findAll();
        // 获取总记录数
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }

    @Override
    public Map<String, Object> findByIndexAndSize2(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<ShortQuestion> list = shortQuestionMapper.findRecover();
        // 获取总记录数
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);

        return map;
    }

    @Override
    public void inserts(List<ShortQuestion> list) {
        shortQuestionMapper.inserts(list);
    }


}
