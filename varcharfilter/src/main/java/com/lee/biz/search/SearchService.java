package com.lee.biz.search;

import java.util.List;

import com.lee.biz.car.CarVO;

public interface SearchService {
   public List<CarVO> selectAll(SearchVO svo);// 검색 결과 전체 조회 (전부 다 가져오기)
    public List<CarVO> selectMore(SearchVO svo);// 검색 결과 일정 범위 조회 (검색 결과 페이지 출력 + 더보기)

}