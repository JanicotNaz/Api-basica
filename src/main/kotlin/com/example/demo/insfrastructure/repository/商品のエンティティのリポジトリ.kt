package com.example.demo.insfrastructure.repository

import com.example.demo.insfrastructure.entity.商品のエンティティ
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
//http://localhost:8080/h2-console
@Repository
interface 商品のエンティティのリポジトリ:JpaRepository<商品のエンティティ, String> {
}