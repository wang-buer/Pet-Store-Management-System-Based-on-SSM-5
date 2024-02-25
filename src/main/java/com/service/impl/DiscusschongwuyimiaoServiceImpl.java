package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusschongwuyimiaoDao;
import com.entity.DiscusschongwuyimiaoEntity;
import com.service.DiscusschongwuyimiaoService;
import com.entity.vo.DiscusschongwuyimiaoVO;
import com.entity.view.DiscusschongwuyimiaoView;

@Service("discusschongwuyimiaoService")
public class DiscusschongwuyimiaoServiceImpl extends ServiceImpl<DiscusschongwuyimiaoDao, DiscusschongwuyimiaoEntity> implements DiscusschongwuyimiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwuyimiaoEntity> page = this.selectPage(
                new Query<DiscusschongwuyimiaoEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwuyimiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwuyimiaoEntity> wrapper) {
		  Page<DiscusschongwuyimiaoView> page =new Query<DiscusschongwuyimiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongwuyimiaoVO> selectListVO(Wrapper<DiscusschongwuyimiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwuyimiaoVO selectVO(Wrapper<DiscusschongwuyimiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwuyimiaoView> selectListView(Wrapper<DiscusschongwuyimiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwuyimiaoView selectView(Wrapper<DiscusschongwuyimiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
