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


import com.dao.DiscusschongwupeiyangDao;
import com.entity.DiscusschongwupeiyangEntity;
import com.service.DiscusschongwupeiyangService;
import com.entity.vo.DiscusschongwupeiyangVO;
import com.entity.view.DiscusschongwupeiyangView;

@Service("discusschongwupeiyangService")
public class DiscusschongwupeiyangServiceImpl extends ServiceImpl<DiscusschongwupeiyangDao, DiscusschongwupeiyangEntity> implements DiscusschongwupeiyangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwupeiyangEntity> page = this.selectPage(
                new Query<DiscusschongwupeiyangEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwupeiyangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwupeiyangEntity> wrapper) {
		  Page<DiscusschongwupeiyangView> page =new Query<DiscusschongwupeiyangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongwupeiyangVO> selectListVO(Wrapper<DiscusschongwupeiyangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwupeiyangVO selectVO(Wrapper<DiscusschongwupeiyangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwupeiyangView> selectListView(Wrapper<DiscusschongwupeiyangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwupeiyangView selectView(Wrapper<DiscusschongwupeiyangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
