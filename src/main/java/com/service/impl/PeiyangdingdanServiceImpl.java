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


import com.dao.PeiyangdingdanDao;
import com.entity.PeiyangdingdanEntity;
import com.service.PeiyangdingdanService;
import com.entity.vo.PeiyangdingdanVO;
import com.entity.view.PeiyangdingdanView;

@Service("peiyangdingdanService")
public class PeiyangdingdanServiceImpl extends ServiceImpl<PeiyangdingdanDao, PeiyangdingdanEntity> implements PeiyangdingdanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeiyangdingdanEntity> page = this.selectPage(
                new Query<PeiyangdingdanEntity>(params).getPage(),
                new EntityWrapper<PeiyangdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeiyangdingdanEntity> wrapper) {
		  Page<PeiyangdingdanView> page =new Query<PeiyangdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeiyangdingdanVO> selectListVO(Wrapper<PeiyangdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeiyangdingdanVO selectVO(Wrapper<PeiyangdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeiyangdingdanView> selectListView(Wrapper<PeiyangdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeiyangdingdanView selectView(Wrapper<PeiyangdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
