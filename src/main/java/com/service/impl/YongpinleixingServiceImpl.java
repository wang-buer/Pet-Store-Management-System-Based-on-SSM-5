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


import com.dao.YongpinleixingDao;
import com.entity.YongpinleixingEntity;
import com.service.YongpinleixingService;
import com.entity.vo.YongpinleixingVO;
import com.entity.view.YongpinleixingView;

@Service("yongpinleixingService")
public class YongpinleixingServiceImpl extends ServiceImpl<YongpinleixingDao, YongpinleixingEntity> implements YongpinleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YongpinleixingEntity> page = this.selectPage(
                new Query<YongpinleixingEntity>(params).getPage(),
                new EntityWrapper<YongpinleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YongpinleixingEntity> wrapper) {
		  Page<YongpinleixingView> page =new Query<YongpinleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YongpinleixingVO> selectListVO(Wrapper<YongpinleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YongpinleixingVO selectVO(Wrapper<YongpinleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YongpinleixingView> selectListView(Wrapper<YongpinleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YongpinleixingView selectView(Wrapper<YongpinleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
