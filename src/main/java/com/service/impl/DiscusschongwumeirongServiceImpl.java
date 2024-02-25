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


import com.dao.DiscusschongwumeirongDao;
import com.entity.DiscusschongwumeirongEntity;
import com.service.DiscusschongwumeirongService;
import com.entity.vo.DiscusschongwumeirongVO;
import com.entity.view.DiscusschongwumeirongView;

@Service("discusschongwumeirongService")
public class DiscusschongwumeirongServiceImpl extends ServiceImpl<DiscusschongwumeirongDao, DiscusschongwumeirongEntity> implements DiscusschongwumeirongService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwumeirongEntity> page = this.selectPage(
                new Query<DiscusschongwumeirongEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwumeirongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwumeirongEntity> wrapper) {
		  Page<DiscusschongwumeirongView> page =new Query<DiscusschongwumeirongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongwumeirongVO> selectListVO(Wrapper<DiscusschongwumeirongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwumeirongVO selectVO(Wrapper<DiscusschongwumeirongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwumeirongView> selectListView(Wrapper<DiscusschongwumeirongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwumeirongView selectView(Wrapper<DiscusschongwumeirongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
