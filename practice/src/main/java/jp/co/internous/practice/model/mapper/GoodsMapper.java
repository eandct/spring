package jp.co.internous.practice.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.practice.model.domain.Goods;

@Mapper
public interface GoodsMapper {

	@Select("SELECT * FROM goods")
	List<Goods> findAll();
    //xmlを使用せずに、@Select（ＳＱＬ文）とすることでSELECT文のSQLを定義できる。
	
	@Delete("DELETE FROM goods WHERE id = #{id}")
	boolean deleteById(long id);
}
