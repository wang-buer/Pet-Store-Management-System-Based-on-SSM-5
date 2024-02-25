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


import com.dao.PeiyangshiDao;
import com.entity.PeiyangshiEntity;
import com.service.PeiyangshiService;
import com.entity.vo.PeiyangshiVO;
import com.entity.view.PeiyangshiView;

@Service("peiyangshiService")
public class PeiyangshiServiceImpl extends ServiceImpl<PeiyangshiDao, PeiyangshiEntity> implements PeiyangshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeiyangshiEntity> page = this.selectPage(
                new Query<PeiyangshiEntity>(params).getPage(),
                new EntityWrapper<PeiyangshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeiyangshiEntity> wrapper) {
		  Page<PeiyangshiView> page =new Query<PeiyangshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeiyangshiVO> selectListVO(Wrapper<PeiyangshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeiyangshiVO selectVO(Wrapper<PeiyangshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeiyangshiView> selectListView(Wrapper<PeiyangshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeiyangshiView selectView(Wrapper<PeiyangshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
