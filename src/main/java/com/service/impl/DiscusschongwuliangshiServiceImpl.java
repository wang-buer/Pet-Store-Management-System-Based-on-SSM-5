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


import com.dao.DiscusschongwuliangshiDao;
import com.entity.DiscusschongwuliangshiEntity;
import com.service.DiscusschongwuliangshiService;
import com.entity.vo.DiscusschongwuliangshiVO;
import com.entity.view.DiscusschongwuliangshiView;

@Service("discusschongwuliangshiService")
public class DiscusschongwuliangshiServiceImpl extends ServiceImpl<DiscusschongwuliangshiDao, DiscusschongwuliangshiEntity> implements DiscusschongwuliangshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwuliangshiEntity> page = this.selectPage(
                new Query<DiscusschongwuliangshiEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwuliangshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwuliangshiEntity> wrapper) {
		  Page<DiscusschongwuliangshiView> page =new Query<DiscusschongwuliangshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongwuliangshiVO> selectListVO(Wrapper<DiscusschongwuliangshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwuliangshiVO selectVO(Wrapper<DiscusschongwuliangshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwuliangshiView> selectListView(Wrapper<DiscusschongwuliangshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwuliangshiView selectView(Wrapper<DiscusschongwuliangshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
