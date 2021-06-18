package com.internous.ecsite.model.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.internous.ecsite.model.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
	
	@Query(value="SELECT * FROM purchase p " +
			"WHERE created_at = (" +
			"SELECT MAX(created_at) FROM purchase p WHERE p.user_id = :userId)",
            nativeQuery=true)//JPQL ではなくSQLによる問い合わせができるようになります。
	List<Purchase> findHistory(@Param("userId") long userId);
	
	
	
	
	@Query(value="INSERT INTO purchase (user_id, goods_id, goods_name, item_count, total, created_at) " +
			"VALUES(?1, ?2, ?3, ?4, ?5, now())",
			nativeQuery=true)//JPQL ではなくSQLによる問い合わせができるようになります。
	@Transactional  // 例外が起こった時に自動でロールバックしてくれる便利なアノテーション
	@Modifying // このメソッドがUPDATE文であることを明示します。UPDATE文には必要みたいです。
	void persist(@Param("userId") long userId,
				@Param("goodsId") long productId,
				@Param("goodsName") String goodsName,
				@Param("itemCount") long itemCount,
				@Param("total") long total
				);
	
	//　上記persistが呼び出されると@Paramがクライアント側の値を取得し、
	//　 クエリ文"INSERT INTO purchase (user_id, goods_id, goods_name, item_count, total, created_at) VALUES(?1, ?2, ?3, ?4, ?5, now())"をデータベースに送る。
	//　 クエリ文末尾の?1, ?2, ?3, ?4, ?5,に@Paramで取得した値が入っている。

}
