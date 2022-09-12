package com.yendoo.myhome.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yendoo.myhome.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
